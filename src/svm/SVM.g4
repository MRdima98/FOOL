grammar SVM;

@header {
import java.util.HashMap;
}

@lexer::members {
int lexicalErrors=0;
}

@parser::members {
int[] code = new int[ExecuteVM.CODESIZE];
private int i = 0;

private HashMap<String,Integer> labelDef = new HashMap<String,Integer>();
private HashMap<Integer,String> labelRef = new HashMap<Integer,String>();
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

assembly: instruction* EOF { for (Integer j: labelRef.keySet()) {
                                code[j]= labelDef.get(labelRef.get(j));
                             }
	                       } ;

instruction:
        PUSH n=INTEGER	     { code[i++] = PUSH;
        	                   code[i++] = Integer.parseInt($n.text); }
	  | PUSH l=LABEL 	 { code[i++] = PUSH;
                           labelRef.put(i++, $l.text); }
	  | POP		{ code[i++] = POP; }
	  | ADD		{ code[i++] = ADD; }
	  | SUB		{ code[i++] = SUB; }
	  | MULT	{ code[i++] = MULT; }
	  | DIV		{ code[i++] = DIV; }
	  | STOREW	{ code[i++] = STOREW; }
	  | LOADW   { code[i++] = LOADW; }
	  | l=LABEL COL   { labelDef.put($l.text, i);  }
	  | BRANCH l=LABEL {
            code[i++] = BRANCH;
            labelRef.put(i++, $l.text);
	  }
	  | BRANCHEQ l=LABEL    {
            code[i++] = BRANCHEQ;
            labelRef.put(i++, $l.text);
	  }
	  | BRANCHLESSEQ l=LABEL {
            code[i++] = BRANCHLESSEQ;
            labelRef.put(i++, $l.text);
	  }
	  // pop one value from the stack copy the instruction pointer
	  // in the RA register and jump to the popped value
	  | JS          { code[i++] = JS; }

	  ///push in the stack the content of the RA register
	  | LOADRA      { code[i++] = LOADRA; }

	  ///pop the top of the stack and copy it in the RA register
	  | STORERA     { code[i++] = STORERA; }
	  | LOADTM      { code[i++] = LOADTM; }
	  | STORETM     { code[i++] = STORETM; }

	  ///push in the stack the content of the FP register
	  | LOADFP      { code[i++] = LOADFP; }

	  ///pop the top of the stack and copy it in the FP register
	  | STOREFP     { code[i++] = STOREFP; }

	  ///copy in the FP register the currest stack pointer
	  | COPYFP      { code[i++] = COPYFP; }

	  ///push in the stack the content of the HP register
	  | LOADHP      { code[i++] = LOADHP; }

	  ///pop the top of the stack and copy it in the HP register
	  | STOREHP     { code[i++] = STOREHP; }
	  | PRINT       { code[i++] = PRINT; }
	  | HALT        { code[i++] = HALT; }
	  ;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

PUSH		: 'push' ;
POP	 		: 'pop' ;
ADD	 		: 'add' ;
SUB	 		: 'sub' ;
MULT	 	: 'mult' ;
DIV	 		: 'div' ;
STOREW	 	: 'sw' ;
LOADW	 	: 'lw' ;
BRANCH	 	: 'b' ;
BRANCHEQ 	: 'beq' ;
BRANCHLESSEQ: 'bleq' ;
JS	 		: 'js' ;
LOADRA	 	: 'lra' ;
STORERA  	: 'sra' ;
LOADTM	 	: 'ltm' ;
STORETM  	: 'stm' ;
LOADFP	 	: 'lfp' ;
STOREFP	 	: 'sfp' ;
COPYFP   	: 'cfp' ;
LOADHP	 	: 'lhp' ;
STOREHP	 	: 'shp' ;
PRINT	 	: 'print' ;
HALT	 	: 'halt' ;

COL	 		: ':' ;
LABEL	 	: ('a'..'z'|'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')* ;
INTEGER	 	: '0' | ('-')?(('1'..'9')('0'..'9')*) ;


WHITESP  	: (' '|'\t'|'\n'|'\r')+ -> channel(HIDDEN) ;

ERR	     	: . { System.out.println("Invalid char: "+ getText()); lexicalErrors++; } -> channel(HIDDEN);

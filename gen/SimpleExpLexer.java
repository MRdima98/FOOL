// Generated from /home/dima/IdeaProjects/FOOL/src/SimpleExp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleExpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, LPAR=4, RPAR=5, NUM=6, WHITESP=7, COMMENT=8, 
		ERR=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "TIMES", "LPAR", "RPAR", "NUM", "WHITESP", "COMMENT", 
			"ERR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "LPAR", "RPAR", "NUM", "WHITESP", "COMMENT", 
			"ERR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public int lexicalErrors=0;


	public SimpleExpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleExp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("Invalid char: "+ getText()); lexicalErrors++;
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\tA\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005!\b\u0005\n\u0005"+
		"\f\u0005$\t\u0005\u0003\u0005&\b\u0005\u0001\u0006\u0004\u0006)\b\u0006"+
		"\u000b\u0006\f\u0006*\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u00073\b\u0007\n\u0007\f\u00076\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u00014\u0000\t\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000"+
		"\u0001\u0003\u0000\t\n\r\r  D\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001"+
		"\u0000\u0000\u0000\u0003\u0015\u0001\u0000\u0000\u0000\u0005\u0017\u0001"+
		"\u0000\u0000\u0000\u0007\u0019\u0001\u0000\u0000\u0000\t\u001b\u0001\u0000"+
		"\u0000\u0000\u000b%\u0001\u0000\u0000\u0000\r(\u0001\u0000\u0000\u0000"+
		"\u000f.\u0001\u0000\u0000\u0000\u0011<\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005+\u0000\u0000\u0014\u0002\u0001\u0000\u0000\u0000\u0015\u0016\u0005"+
		"-\u0000\u0000\u0016\u0004\u0001\u0000\u0000\u0000\u0017\u0018\u0005*\u0000"+
		"\u0000\u0018\u0006\u0001\u0000\u0000\u0000\u0019\u001a\u0005(\u0000\u0000"+
		"\u001a\b\u0001\u0000\u0000\u0000\u001b\u001c\u0005)\u0000\u0000\u001c"+
		"\n\u0001\u0000\u0000\u0000\u001d&\u00050\u0000\u0000\u001e\"\u000219\u0000"+
		"\u001f!\u000209\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#&\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000%\u001d\u0001\u0000\u0000\u0000"+
		"%\u001e\u0001\u0000\u0000\u0000&\f\u0001\u0000\u0000\u0000\')\u0007\u0000"+
		"\u0000\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",-\u0006\u0006\u0000\u0000-\u000e\u0001\u0000\u0000\u0000./\u0005/\u0000"+
		"\u0000/0\u0005*\u0000\u000004\u0001\u0000\u0000\u000013\t\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000078\u0005*\u0000\u000089\u0005/\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:;\u0006\u0007\u0000\u0000;\u0010\u0001\u0000\u0000\u0000"+
		"<=\t\u0000\u0000\u0000=>\u0006\b\u0001\u0000>?\u0001\u0000\u0000\u0000"+
		"?@\u0006\b\u0000\u0000@\u0012\u0001\u0000\u0000\u0000\u0005\u0000\"%*"+
		"4\u0002\u0000\u0001\u0000\u0001\b\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
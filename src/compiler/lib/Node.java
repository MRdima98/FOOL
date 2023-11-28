package compiler;

public interface Node {
//    void accept(PrintASTVisitor visitor);
    <S> S accept(PrintASTVisitor<S> visitor);
}

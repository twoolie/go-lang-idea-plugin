package ro.redeul.google.go.lang.psi.impl.statements.switches;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import org.jetbrains.annotations.NotNull;
import ro.redeul.google.go.lang.psi.expressions.GoExpr;
import ro.redeul.google.go.lang.psi.impl.GoDocumentedPsiElementBase;
import ro.redeul.google.go.lang.psi.statements.GoSimpleStatement;
import ro.redeul.google.go.lang.psi.statements.switches.GoSwitchExpressionClause;
import ro.redeul.google.go.lang.psi.statements.switches.GoSwitchExpressionStatement;
import ro.redeul.google.go.lang.psi.visitors.GoTypedVisitor;

public class GoSwitchExpressionStatementImpl extends GoDocumentedPsiElementBase implements GoSwitchExpressionStatement {

    public GoSwitchExpressionStatementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public GoSimpleStatement getSimpleStatement() {
        return findChildByClass(GoSimpleStatement.class);
    }

    @Override
    public GoExpr getExpression() {
        return findChildByClass(GoExpr.class);
    }

    @NotNull
    @Override
    public GoSwitchExpressionClause[] getClauses() {
        return findChildrenByClass(GoSwitchExpressionClause.class);
    }

    @Override
    public boolean processDeclarations(@NotNull PsiScopeProcessor processor,
                                       @NotNull ResolveState state,
                                       PsiElement lastParent,
                                       @NotNull PsiElement place) {
        GoSimpleStatement initStatement = getSimpleStatement();
        return lastParent == null || initStatement == null || lastParent == initStatement || initStatement.processDeclarations(processor, state, null, place);

    }

    @Override
    public <T, S> T accept(GoTypedVisitor<T, S> visitor, S data) {
        return visitor.visitStatementSwitchExpression(this, data);
    }
}

package main
var e = (s + ".txt")
/**-----
Go file
  PackageDeclaration(main)
    PsiElement(KEYWORD_PACKAGE)('package')
    PsiWhiteSpace(' ')
    PsiElement(IDENTIFIER)('main')
  PsiWhiteSpace('\n')
  VarDeclarationsImpl
    PsiElement(KEYWORD_VAR)('var')
    PsiWhiteSpace(' ')
    VarDeclarationImpl
      LiteralIdentifierImpl
        PsiElement(IDENTIFIER)('e')
      PsiWhiteSpace(' ')
      PsiElement(=)('=')
      PsiWhiteSpace(' ')
      ParenthesisedExpressionImpl
        PsiElement(()('(')
        AdditiveExpressionImpl
          LiteralExpressionImpl
            LiteralIdentifierImpl
              PsiElement(IDENTIFIER)('s')
          PsiWhiteSpace(' ')
          PsiElement(+)('+')
          PsiWhiteSpace(' ')
          LiteralExpressionImpl
            LiteralStringImpl
              PsiElement(LITERAL_STRING)('".txt"')
        PsiElement())(')')

package com.intellij.javascript.flex.css;

import com.intellij.lang.javascript.psi.JSLiteralExpression;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.css.CssSelectorSuffix;
import com.intellij.psi.css.CssTerm;
import com.intellij.psi.css.impl.CssTermTypes;
import com.intellij.psi.css.usages.CssClassOrIdUsagesProvider;
import org.jetbrains.annotations.NotNull;

/**
 * Created by IntelliJ IDEA.
 * User: Eugene.Kudelevsky
 * Date: Mar 7, 2010
 * Time: 5:40:52 PM
 */
public class FlexClassOrIdUsagesProvider implements CssClassOrIdUsagesProvider {
  public boolean isUsage(@NotNull CssSelectorSuffix selectorSuffix, @NotNull PsiElement candidate, int offsetInCandidate) {
    if ((candidate instanceof CssTerm && ((CssTerm)candidate).getTermType() == CssTermTypes.IDENT) ||
        candidate instanceof JSLiteralExpression) {
      final PsiReference ref = candidate.findReferenceAt(offsetInCandidate);
      return ref != null && ref.isReferenceTo(selectorSuffix);
    }
    return false;
  }
}

package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: acnt  reason: default package */
/* loaded from: classes.dex */
public final class acnt implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqfe) {
            acnr acnrVar = acnr.MIN_TAB_OVERFLOW;
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            if (((cqfe) cqkuVar).ordinal() == 109 && (view instanceof acnz) && (obj instanceof cqiv)) {
                ((acnz) view).setAdapter(((cqiv) obj).h(cqjzVar.g.g()));
                return true;
            }
        }
        if (cqkuVar instanceof acnr) {
            acnr acnrVar2 = acnr.MIN_TAB_OVERFLOW;
            cqfe cqfeVar2 = cqfe.ACCESSIBILITY_DELEGATE;
            switch (((acnr) cqkuVar).ordinal()) {
                case 0:
                    if ((view instanceof acnz) && (obj instanceof cqtv)) {
                        acnz acnzVar = (acnz) view;
                        acnzVar.setMinTabOverflow(((cqtv) obj).NR(acnzVar.getContext()));
                        return true;
                    }
                    break;
                case 1:
                    if ((view instanceof acnz) && (obj == null || (obj instanceof acnw))) {
                        ((acnz) view).setOnTabSelectedListener((acnw) obj);
                        return true;
                    }
                    break;
                case 2:
                    if ((view instanceof acnz) && (obj == null || (obj instanceof cqss))) {
                        acnz acnzVar2 = (acnz) view;
                        acnzVar2.setSelectedIndicatorColors(cqfp.n((cqss) obj, acnzVar2));
                        return true;
                    }
                    break;
                case 3:
                    if ((view instanceof acnz) && (obj == null || (obj instanceof cqtd))) {
                        ((acnz) view).setSelectedIndicatorDrawable((cqtd) obj);
                        return true;
                    }
                    break;
                case 4:
                    if ((view instanceof acnz) && (obj instanceof Boolean)) {
                        ((acnz) view).setSelectedIndicatorFullWidth(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 5:
                    if ((view instanceof acnz) && (obj instanceof cqtv)) {
                        acnz acnzVar3 = (acnz) view;
                        acnzVar3.setSelectedIndicatorHeight(cqfp.m((cqtv) obj, acnzVar3));
                        return true;
                    }
                    break;
                case 6:
                    if ((view instanceof acnz) && (obj instanceof cqtv)) {
                        acnz acnzVar4 = (acnz) view;
                        acnzVar4.setSlidingPadding(cqfp.m((cqtv) obj, acnzVar4));
                        return true;
                    }
                    break;
                case 7:
                    if ((view instanceof acnz) && (obj instanceof Float)) {
                        ((acnz) view).setPosition(((Float) obj).floatValue());
                        return true;
                    }
                    break;
                case 8:
                    if ((view instanceof acnz) && (obj instanceof Boolean)) {
                        acnz acnzVar5 = (acnz) view;
                        acnzVar5.c = ((Boolean) obj).booleanValue();
                        acnzVar5.requestLayout();
                        return true;
                    }
                    break;
                case 9:
                    if ((view instanceof acnz) && (obj instanceof cqtv)) {
                        acnz acnzVar6 = (acnz) view;
                        acnzVar6.setSelectedIndicatorMinWidth(cqfp.m((cqtv) obj, acnzVar6));
                        return true;
                    }
                    break;
                case 10:
                    if ((view instanceof acnz) && (obj instanceof cqtv)) {
                        acnz acnzVar7 = (acnz) view;
                        acnzVar7.setSelectedIndicatorPaddingStart(cqfp.m((cqtv) obj, acnzVar7));
                        return true;
                    }
                    break;
                case 11:
                    if ((view instanceof acnz) && (obj instanceof cqtv)) {
                        acnz acnzVar8 = (acnz) view;
                        acnzVar8.setSelectedIndicatorPaddingEnd(cqfp.m((cqtv) obj, acnzVar8));
                        return true;
                    }
                    break;
                case 12:
                    if ((view instanceof acnz) && (obj instanceof Boolean)) {
                        ((acnz) view).setSelectedIndicatorCenterOnTitle(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqfe) {
            acnr acnrVar = acnr.MIN_TAB_OVERFLOW;
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            if (((cqfe) cqkuVar).ordinal() == 109 && (view instanceof acnz)) {
                acnz acnzVar = (acnz) view;
                acnzVar.b = null;
                View[] a = acnzVar.a();
                acnzVar.a.removeAllViews();
                for (View view2 : a) {
                    cqjzVar.g.g();
                    cqkf<?> a2 = cqke.a(view2);
                    if (a2 != null) {
                        a2.i();
                    }
                }
                return true;
            }
        }
        return false;
    }
}

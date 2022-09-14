package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jji  reason: default package */
/* loaded from: classes7.dex */
public final class jji implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        int i = 0;
        if (cqkuVar instanceof jjg) {
            jjg jjgVar = jjg.CLOSE_BUTTON_VIEW_ID;
            int ordinal = ((jjg) cqkuVar).ordinal();
            int i2 = -1;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && (view instanceof jjf) && (obj == null || (obj instanceof Integer))) {
                        Integer num = (Integer) obj;
                        jjf jjfVar = (jjf) view;
                        if (num != null) {
                            i2 = num.intValue();
                        }
                        jjfVar.setNestedCollapsibleViewId(i2);
                        return true;
                    }
                } else if ((view instanceof jjf) && (obj == null || (obj instanceof cqtv))) {
                    cqtv cqtvVar = (cqtv) obj;
                    jjf jjfVar2 = (jjf) view;
                    if (cqtvVar != null) {
                        i = cqtvVar.e(jjfVar2.getContext());
                    }
                    jjfVar2.setCollapsedExposurePixels(i);
                    return true;
                }
            } else if ((view instanceof jjf) && (obj == null || (obj instanceof Integer))) {
                Integer num2 = (Integer) obj;
                jjf jjfVar3 = (jjf) view;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                jjfVar3.setCloseButtonViewId(i2);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}

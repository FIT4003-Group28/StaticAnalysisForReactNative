package defpackage;

import android.graphics.PorterDuff;
import android.view.View;
/* compiled from: PG */
/* renamed from: ikw  reason: default package */
/* loaded from: classes6.dex */
public final class ikw implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iky) {
            iky ikyVar = iky.CHECK_BOX_STATE;
            int ordinal = ((iky) cqkuVar).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3 && (view instanceof ikx) && (obj == null || (obj instanceof iku))) {
                            ((ikx) view).setOnCheckedChangeListener((iku) obj);
                            return true;
                        }
                    } else if ((view instanceof ikx) && (obj == null || (obj instanceof PorterDuff.Mode))) {
                        ((ikx) view).setButtonTintMode((PorterDuff.Mode) obj);
                        return true;
                    }
                } else if ((view instanceof ikx) && (obj == null || (obj instanceof cqss))) {
                    ikx ikxVar = (ikx) view;
                    ikxVar.setButtonTintList(cqfp.o((cqss) obj, ikxVar));
                    return true;
                }
            } else if ((view instanceof ikx) && (obj instanceof Integer)) {
                ikx ikxVar2 = (ikx) view;
                int intValue = ((Integer) obj).intValue();
                if (intValue == 1) {
                    ikxVar2.setCheckBoxState(1);
                } else if (intValue == 2) {
                    ikxVar2.setCheckBoxState(2);
                } else {
                    ikxVar2.setCheckBoxState(0);
                }
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

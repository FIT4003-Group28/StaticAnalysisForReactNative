package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cqpk  reason: default package */
/* loaded from: classes.dex */
public final class cqpk extends cqfb {
    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, cqjz<?> cqjzVar) {
        if (cqkuVar instanceof cqpj) {
            View view = cqjzVar.c;
            if (!(view instanceof czzp)) {
                return false;
            }
            cqpj cqpjVar = cqpj.BACKGROUND_TINT_LIST;
            int ordinal = ((cqpj) cqkuVar).ordinal();
            if (ordinal == 0) {
                ((czzp) view).setBackgroundTintList(cqfp.o(obj, view));
                return true;
            } else if (ordinal == 1) {
                ((czzp) view).setRippleColor(cqfp.n(obj, view));
                return true;
            } else if (ordinal == 2) {
                ((czzp) view).setSize(((Integer) obj).intValue());
                return true;
            } else {
                throw new RuntimeException();
            }
        }
        return false;
    }
}

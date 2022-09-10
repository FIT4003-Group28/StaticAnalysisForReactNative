package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: blgi  reason: default package */
/* loaded from: classes3.dex */
public final class blgi implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof blgg) {
            blgg blggVar = blgg.ON_SWIPE_AWAY;
            int ordinal = ((blgg) cqkuVar).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 || !(view instanceof blgh)) {
                    return false;
                }
                if (obj != null && !(obj instanceof cqrp)) {
                    return false;
                }
                blgh blghVar = (blgh) view;
                cqrp cqrpVar = (cqrp) obj;
                if (cqrpVar != null) {
                    blghVar.c = cqrpVar;
                    blghVar.requestLayout();
                }
                return true;
            } else if (!(view instanceof blgh)) {
                return false;
            } else {
                if (obj != null && !(obj instanceof Runnable)) {
                    return false;
                }
                ((blgh) view).b = (Runnable) obj;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof blgg) {
            blgg blggVar = blgg.ON_SWIPE_AWAY;
            if (((blgg) cqkuVar).ordinal() != 0 || !(view instanceof blgh)) {
                return false;
            }
            ((blgh) view).b = null;
            return true;
        }
        return false;
    }
}

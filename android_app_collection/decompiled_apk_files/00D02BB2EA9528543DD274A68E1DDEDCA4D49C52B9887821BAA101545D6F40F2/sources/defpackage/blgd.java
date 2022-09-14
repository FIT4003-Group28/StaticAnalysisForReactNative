package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: blgd  reason: default package */
/* loaded from: classes3.dex */
public final class blgd implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof blgb) {
            blgb blgbVar = blgb.HEIGHT_HINT;
            int ordinal = ((blgb) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof blgc) || !(obj instanceof Float)) {
                    return false;
                }
                blgc blgcVar = (blgc) view;
                Float f = (Float) obj;
                if (f != null && f.floatValue() > 0.0f && f.floatValue() <= 1.0f) {
                    blgcVar.c = f.floatValue();
                }
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof blgc) || !(obj instanceof cqrp)) {
                    return false;
                }
                blgc blgcVar2 = (blgc) view;
                blgcVar2.a = (cqrp) obj;
                blgcVar2.requestLayout();
                return true;
            } else if (ordinal != 2 || !(view instanceof blgc) || !(obj instanceof cqrp)) {
                return false;
            } else {
                blgc blgcVar3 = (blgc) view;
                blgcVar3.b = (cqrp) obj;
                blgcVar3.requestLayout();
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

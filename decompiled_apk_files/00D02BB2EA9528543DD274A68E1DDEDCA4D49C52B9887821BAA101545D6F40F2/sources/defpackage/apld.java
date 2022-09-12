package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: apld  reason: default package */
/* loaded from: classes2.dex */
public final class apld implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof aplb) {
            aplb aplbVar = aplb.a;
            if (((aplb) cqkuVar).ordinal() != 0 || !(view instanceof bqi)) {
                return false;
            }
            if (obj != null && !(obj instanceof bqh)) {
                return false;
            }
            ((bqi) view).setOnDayClickListener((bqh) obj);
            return true;
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}

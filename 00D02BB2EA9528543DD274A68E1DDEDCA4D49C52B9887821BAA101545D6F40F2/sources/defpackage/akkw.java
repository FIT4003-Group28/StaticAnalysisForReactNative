package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akkw  reason: default package */
/* loaded from: classes2.dex */
final class akkw extends cqfb {
    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, cqjz<?> cqjzVar) {
        dqiz dqizVar;
        View view = cqjzVar.c;
        if (!(cqkuVar instanceof akkv) || cqkuVar != akkv.a || !(view instanceof akkx)) {
            return false;
        }
        if (obj != null && !(obj instanceof dqiz)) {
            return false;
        }
        akkx akkxVar = (akkx) view;
        if (obj != null) {
            dqizVar = (dqiz) obj;
        } else {
            dqizVar = dqiz.UNKNOWN_SCALE_TYPE;
        }
        akkxVar.setScaleType(dqizVar);
        return true;
    }

    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        return false;
    }
}

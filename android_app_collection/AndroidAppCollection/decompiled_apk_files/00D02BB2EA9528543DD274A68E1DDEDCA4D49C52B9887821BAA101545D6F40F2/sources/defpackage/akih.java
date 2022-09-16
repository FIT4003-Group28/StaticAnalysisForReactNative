package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akih  reason: default package */
/* loaded from: classes2.dex */
final class akih implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, cqjz<?> cqjzVar) {
        dqiz dqizVar;
        View view = cqjzVar.c;
        if (!(cqkuVar instanceof cqfe) || ((cqfe) cqkuVar) != cqfe.SCALE_TYPE || !(view instanceof akii)) {
            return false;
        }
        if (obj != null && !(obj instanceof dqiz)) {
            return false;
        }
        akii akiiVar = (akii) view;
        if (obj != null) {
            dqizVar = (dqiz) obj;
        } else {
            dqizVar = dqiz.UNKNOWN_SCALE_TYPE;
        }
        akiiVar.setScaleType(dqizVar);
        return true;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        return false;
    }
}

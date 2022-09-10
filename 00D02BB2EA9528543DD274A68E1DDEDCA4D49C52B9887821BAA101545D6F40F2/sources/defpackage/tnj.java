package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: tnj  reason: default package */
/* loaded from: classes7.dex */
final class tnj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcep<tob> a(EnumSet<vux> enumSet) {
        dcen N = dcep.N();
        if (enumSet.contains(vux.AVOID_TOLLS)) {
            N.b(tob.AVOID_TOLLS);
        }
        if (enumSet.contains(vux.AVOID_HIGHWAYS)) {
            N.b(tob.AVOID_HIGHWAYS);
        }
        if (enumSet.contains(vux.AVOID_FERRIES)) {
            N.b(tob.AVOID_FERRIES);
        }
        return N.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcep<drsm> b(yiv yivVar) {
        yis yisVar = yivVar.b;
        if (yisVar == null) {
            yisVar = yis.b;
        }
        return dcbg.b(yisVar.a).o(tnf.a).s(tng.a).B();
    }
}

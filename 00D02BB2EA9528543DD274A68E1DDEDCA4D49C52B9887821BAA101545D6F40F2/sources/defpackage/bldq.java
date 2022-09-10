package defpackage;
/* compiled from: PG */
/* renamed from: bldq  reason: default package */
/* loaded from: classes3.dex */
public final class bldq {
    public static boolean a(cqiv cqivVar, bllc bllcVar, boolean z) {
        if (!bllcVar.w().booleanValue()) {
            return false;
        }
        boolean booleanValue = bllcVar.s().booleanValue();
        boolean z2 = !booleanValue || (bllcVar.r().l().booleanValue() || bllcVar.r().o().booleanValue());
        if (z2) {
            if (bllcVar.r().p().booleanValue()) {
                cqivVar.a(new bkvq(), bllcVar.r());
            } else {
                cqivVar.a(new blap(), bllcVar.r());
            }
        }
        if (booleanValue) {
            if (z2) {
                cqivVar.a(ict.p(false, new cqmp[0]), cqkp.T);
            }
            if (z) {
                ixw ixwVar = new ixw();
                ixwVar.a = bllcVar.v();
                cqivVar.a(new hrw(), ixwVar.a());
            }
            bllcVar.x(cqivVar.i());
            if (!bllcVar.D().booleanValue() || !bllcVar.p().booleanValue()) {
                cqivVar.a(new blbf(), bllcVar);
            } else {
                cqivVar.a(new cdsx(), bllcVar);
            }
            if (bllcVar.A().booleanValue()) {
                cqivVar.a(new bldp(), bllcVar);
            }
        }
        return z2 || booleanValue;
    }
}

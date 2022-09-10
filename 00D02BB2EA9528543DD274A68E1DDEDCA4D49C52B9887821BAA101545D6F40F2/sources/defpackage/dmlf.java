package defpackage;
/* compiled from: PG */
/* renamed from: dmlf  reason: default package */
/* loaded from: classes6.dex */
public final class dmlf {
    public static dpum a(dnoh dnohVar) {
        dpul bZ = dpum.d.bZ();
        if ((dnohVar.a & 1) != 0) {
            double d = dnohVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpum dpumVar = (dpum) bZ.b;
            dpumVar.a |= 1;
            dpumVar.b = d;
        }
        if ((dnohVar.a & 2) != 0) {
            double d2 = dnohVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpum dpumVar2 = (dpum) bZ.b;
            dpumVar2.a |= 2;
            dpumVar2.c = d2;
        }
        return bZ.bK();
    }
}

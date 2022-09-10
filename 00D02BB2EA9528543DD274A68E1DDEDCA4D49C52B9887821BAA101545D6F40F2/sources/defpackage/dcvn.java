package defpackage;
/* compiled from: PG */
/* renamed from: dcvn  reason: default package */
/* loaded from: classes5.dex */
public final class dcvn {
    public dcwa b;
    public dcvs c;
    public final dcvt a = dcvt.d();
    public final dcva d = new dcva();
    public final dcuu e = new dcuu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(dcvu dcvuVar) {
        if (!dcvuVar.q()) {
            double d = 3.141592653589793d;
            double max = Math.max((double) dcyn.a, (3.141592653589793d - dcvuVar.b.k()) - (dcvc.c * 2.5d));
            dcuu dcuuVar = dcvuVar.a;
            double max2 = Math.max(dcuuVar.a, -dcuuVar.b);
            dcuu dcuuVar2 = dcvuVar.a;
            double d2 = dcuuVar2.a + 1.5707963267948966d;
            double d3 = 1.5707963267948966d - dcuuVar2.b;
            if (max2 >= dcyn.a) {
                if (max2 + max2 + max < 1.354E-15d) {
                    dcvu.d();
                    return;
                }
            } else if (max >= 1.5707963267948966d) {
                if (d2 + d3 < 1.687E-15d) {
                    dcvu.d();
                    return;
                }
            } else if (Math.max(d2, d3) * max < 1.765E-15d) {
                dcvu.d();
                return;
            }
            double d4 = dcvc.c * 9.0d;
            if (max > dcyn.a) {
                d = 0.0d;
            }
            dcvuVar.g(dcvs.a(d4, d)).i();
        }
    }
}

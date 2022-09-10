package defpackage;
/* compiled from: PG */
/* renamed from: abfe  reason: default package */
/* loaded from: classes2.dex */
public final class abfe {
    private static final dcqe a = dcqe.c("abfe");

    public static void a(@dzsi dhjx dhjxVar, akpm akpmVar, gga ggaVar, efg efgVar, Runnable runnable) {
        alad c = dhjxVar == null ? null : alad.c(dhjxVar);
        if (c == null) {
            runnable.run();
            return;
        }
        akyc i = akyt.i(c.i, c.k);
        i.b = 0;
        akpmVar.q(i, new abfd(runnable));
        Object K = ggaVar.K();
        if (!(K instanceof ggc)) {
            Object[] objArr = new Object[1];
            if (K == null) {
                K = "null";
            }
            objArr[0] = K;
            bvoo.h("Unexpected Area Explore shortcut search from non-page fragment, %s", objArr);
        } else if (K instanceof bdyb) {
        } else {
            egj egjVar = new egj((ggc) K);
            egjVar.ag(null);
            egjVar.w(null);
            egjVar.F(null);
            egjVar.ai(jjn.HIDDEN);
            egjVar.ak(jkc.n, jkc.n);
            efgVar.a(egjVar.a());
        }
    }
}

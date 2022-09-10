package defpackage;
/* compiled from: PG */
/* renamed from: ctur  reason: default package */
/* loaded from: classes5.dex */
public final class ctur {
    public static cugd a(dxna dxnaVar) {
        cugc f = cugd.f();
        f.c(dxnaVar.b);
        f.f(dxnaVar.c);
        f.d(dxnaVar.a.G());
        f.e(dxnaVar.e);
        dugy dugyVar = dxnaVar.d;
        if (dugyVar != null) {
            f.b(ctuh.b(dugyVar));
        }
        return f.a();
    }

    public static dxna b(cugd cugdVar) {
        dxmz bZ = dxna.f.bZ();
        dspd x = dspd.x(cugdVar.a());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        x.getClass();
        ((dxna) bZ.b).a = x;
        int c = cugdVar.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxna) bZ.b).b = c;
        int b = cugdVar.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxna) bZ.b).c = b;
        String e = cugdVar.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        e.getClass();
        ((dxna) bZ.b).e = e;
        if (cugdVar.d().a()) {
            dugy a = ctuh.a(cugdVar.d().b().intValue());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            a.getClass();
            ((dxna) bZ.b).d = a;
        }
        return bZ.bK();
    }
}

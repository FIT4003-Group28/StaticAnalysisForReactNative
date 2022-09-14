package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anpw  reason: default package */
/* loaded from: classes2.dex */
public class anpw {
    public final gga a;
    public final bmnj b;
    public final Executor c;
    private final angp d;
    private final cqat e;

    public anpw(gga ggaVar, cqat cqatVar, angp angpVar, bmnj bmnjVar, Executor executor) {
        this.e = cqatVar;
        this.a = ggaVar;
        this.d = angpVar;
        this.b = bmnjVar;
        this.c = executor;
    }

    public final void a(dvyw dvywVar, dbsg<dqfw> dbsgVar, dbsg<dqfw> dbsgVar2) {
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.gk.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        dnqh bK = bZ.bK();
        dnhy bZ2 = dnhz.e.bZ();
        long b = this.e.b();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnhz dnhzVar = (dnhz) bZ2.b;
        dnhzVar.a |= 4;
        dnhzVar.d = b;
        dnhz bK2 = bZ2.bK();
        dnqp bZ3 = dnqq.f.bZ();
        if (dbsgVar.a()) {
            dnru bZ4 = dnrv.c.bZ();
            dqfw b2 = dbsgVar.b();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dnrv dnrvVar = (dnrv) bZ4.b;
            b2.getClass();
            dnrvVar.b = b2;
            dnrvVar.a |= 1;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnqq dnqqVar = (dnqq) bZ3.b;
            dnrv bK3 = bZ4.bK();
            bK3.getClass();
            dnqqVar.b = bK3;
            dnqqVar.a |= 1;
        }
        if (dbsgVar2.a()) {
            dnru bZ5 = dnrv.c.bZ();
            dqfw b3 = dbsgVar2.b();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnrv dnrvVar2 = (dnrv) bZ5.b;
            b3.getClass();
            dnrvVar2.b = b3;
            dnrvVar2.a |= 1;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnqq dnqqVar2 = (dnqq) bZ3.b;
            dnrv bK4 = bZ5.bK();
            bK4.getClass();
            dnqqVar2.d = bK4;
            dnqqVar2.a |= 8;
        }
        this.d.j(dvywVar, bK2, bK, bZ3.bK(), dbsg.i(new anpv(this, bK2)));
    }
}

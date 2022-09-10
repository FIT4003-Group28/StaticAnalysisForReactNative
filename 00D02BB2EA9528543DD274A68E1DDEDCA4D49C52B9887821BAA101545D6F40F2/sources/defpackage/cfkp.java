package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfkp  reason: default package */
/* loaded from: classes4.dex */
public class cfkp extends cfhs implements cfhk {
    public static final /* synthetic */ int i = 0;
    public final dxio<akfa> e;
    public final dxio<blpp> f;
    public final cezg g;
    public final dlny h;
    private final Executor j;
    private final gga k;
    private final Class<? extends fd> l;
    private boolean m;

    public cfkp(cfgm cfgmVar, cqhn cqhnVar, cqhu cqhuVar, dxio<akfa> dxioVar, gga ggaVar, dxio<blpp> dxioVar2, cezg cezgVar, Executor executor, cpv cpvVar, dlny dlnyVar, cfhr cfhrVar, Class<? extends fd> cls) {
        super(cfgmVar, cfhrVar, cpvVar);
        this.m = false;
        this.e = dxioVar;
        this.k = ggaVar;
        this.f = dxioVar2;
        this.j = executor;
        this.h = dlnyVar;
        this.g = cezgVar;
        this.l = cls;
    }

    private final void k() {
        this.k.g().e();
    }

    @Override // defpackage.cfhk
    public Boolean d() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.cfhk
    public String e() {
        return this.h.b;
    }

    @Override // defpackage.cfhk
    public String f() {
        return this.h.c;
    }

    @Override // defpackage.cfhk
    public String g() {
        dlnv dlnvVar = this.h.d;
        if (dlnvVar == null) {
            dlnvVar = dlnv.f;
        }
        return dlnvVar.d;
    }

    @Override // defpackage.cfhk
    public cqkl h() {
        dlnv dlnvVar = this.h.d;
        if (dlnvVar == null) {
            dlnvVar = dlnv.f;
        }
        int a = dlnr.a(dlnvVar.e);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 == 2) {
            this.m = true;
            cqkx.p(this);
            gn g = this.k.g();
            g.l(new cfko(g, gfu.b(this.l, gfu.ACTIVITY_FRAGMENT, new gfs[0])));
            this.j.execute(new Runnable(this) { // from class: cfkn
                private final cfkp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dlnu dlnuVar;
                    cfkp cfkpVar = this.a;
                    cezg cezgVar = cfkpVar.g;
                    dlnv dlnvVar2 = cfkpVar.h.d;
                    if (dlnvVar2 == null) {
                        dlnvVar2 = dlnv.f;
                    }
                    if (dlnvVar2.b == 3) {
                        dlnuVar = (dlnu) dlnvVar2.c;
                    } else {
                        dlnuVar = dlnu.c;
                    }
                    ilo a2 = cezgVar.a(dlnuVar.b);
                    btlu j = cfkpVar.e.a().j();
                    cfkpVar.f.a().p(a2.cq(), false, null, true, a2.ai(), j != null ? j.d : null, blpk.POST_TRIP_UGC, 2);
                }
            });
            return cqkl.a;
        }
        k();
        return cqkl.a;
    }

    @Override // defpackage.cfhk
    public cqkl i() {
        k();
        return cqkl.a;
    }

    @Override // defpackage.cfhk
    public cjtd j() {
        dlnv dlnvVar = this.h.d;
        if (dlnvVar == null) {
            dlnvVar = dlnv.f;
        }
        int a = dlnr.a(dlnvVar.e);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 == 2) {
            return cjtd.a(dtxy.og);
        }
        return cjtd.a(dtxy.of);
    }
}

package defpackage;

import android.app.Activity;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bbth  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbth {
    public static final /* synthetic */ int c = 0;
    private static final eaol d = new eaol(2018, 10, 1, 0, 0);
    public final dxio<axrx> a;
    public final dxio<ckcw> b;
    private final axru e;
    private final dxio<btvo> f;
    private final dxio<bvjj> g;
    private final dxio<akfa> h;
    private final Activity i;

    public bbth(dxio<ckcw> dxioVar, dxio<axrx> dxioVar2, dxio<btvo> dxioVar3, dxio<akfa> dxioVar4, axru axruVar, dxio<bvjj> dxioVar5, Activity activity) {
        this.b = dxioVar;
        this.a = dxioVar2;
        this.f = dxioVar3;
        this.h = dxioVar4;
        this.e = axruVar;
        this.g = dxioVar5;
        this.i = activity;
    }

    private final void g(int i) {
        ((ckco) this.b.a().a(ckdz.aK)).a(i - 1);
    }

    public final void a() {
        b(bbtd.a);
    }

    public void b(axrw axrwVar) {
        e(axrwVar, f());
    }

    protected void c(Runnable runnable) {
        throw null;
    }

    protected abstract boolean d();

    @Deprecated
    public final void e(final axrw axrwVar, final int i) {
        btlu j = this.h.a().j();
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (!d()) {
            g(2);
        } else if (this.e.a("android.permission.READ_EXTERNAL_STORAGE")) {
            g(3);
        } else if (j == null) {
            g(4);
        } else {
            dsrj<bbvs> dsrjVar = ((bbvt) this.g.a().N(bvjk.fz, j, (dssr) bbvt.b.cu(7), bbvt.b)).a;
            if (dsrjVar.size() >= this.f.a().getUgcParameters().at()) {
                g(5);
                return;
            }
            int t = this.g.a().t(bvjk.fy, j, 0);
            eaow eaowVar = new eaow(d, eaol.a());
            eaow e = eaow.e(this.f.a().getUgcParameters().as());
            if (t <= 0 || !eaowVar.q(e)) {
                if (!dsrjVar.isEmpty()) {
                    eaow eaowVar2 = new eaow(new eaol(((bbvs) dcft.s(dsrjVar)).c), eaol.a());
                    eaow e2 = eaow.e(this.f.a().getUgcParameters().as());
                    if (eaowVar2.q(e2)) {
                        eaowVar2.n();
                        e2.n();
                    }
                }
                dbsg v = dcbg.b(dsrjVar).o(new dbsl(i) { // from class: bbtf
                    private final int a;

                    {
                        this.a = i;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        int i2 = this.a;
                        int i3 = bbth.c;
                        int a = bbvr.a(((bbvs) obj).b);
                        boolean z = true;
                        if (a == 0) {
                            a = 1;
                        }
                        if (i2 != a) {
                            z = false;
                        }
                        if (i2 != 0) {
                            return z;
                        }
                        throw null;
                    }
                }).v();
                if (v.a()) {
                    eaow eaowVar3 = new eaow(new eaol(((bbvs) v.b()).c), eaol.a());
                    eaow e3 = eaow.e(this.f.a().getUgcParameters().ar());
                    if (eaowVar3.q(e3)) {
                        eaowVar3.n();
                        e3.n();
                    }
                }
                if (dsrjVar.isEmpty() || this.i.shouldShowRequestPermissionRationale("android.permission.READ_EXTERNAL_STORAGE")) {
                    g(1);
                    bbvt bbvtVar = (bbvt) this.g.a().N(bvjk.fz, j, (dssr) bbvt.b.cu(7), bbvt.b);
                    dsqp dsqpVar = (dsqp) bbvtVar.cu(5);
                    dsqpVar.bC(bbvtVar);
                    bbvo bbvoVar = (bbvo) dsqpVar;
                    bbvp bZ = bbvs.d.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    bbvs bbvsVar = (bbvs) bZ.b;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    bbvsVar.b = i2;
                    bbvsVar.a = 1 | bbvsVar.a;
                    long j2 = eaol.a().a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    bbvs bbvsVar2 = (bbvs) bZ.b;
                    bbvsVar2.a = 2 | bbvsVar2.a;
                    bbvsVar2.c = j2;
                    if (bbvoVar.c) {
                        bbvoVar.bF();
                        bbvoVar.c = false;
                    }
                    bbvt bbvtVar2 = (bbvt) bbvoVar.b;
                    bbvs bK = bZ.bK();
                    bK.getClass();
                    dsrj<bbvs> dsrjVar2 = bbvtVar2.a;
                    if (!dsrjVar2.a()) {
                        bbvtVar2.a = dsqw.cl(dsrjVar2);
                    }
                    bbvtVar2.a.add(bK);
                    this.g.a().am(bvjk.fz, j, bbvoVar.bK());
                    c(new Runnable(this, axrwVar, i) { // from class: bbte
                        private final bbth a;
                        private final axrw b;
                        private final int c;

                        {
                            this.a = this;
                            this.b = axrwVar;
                            this.c = i;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final bbth bbthVar = this.a;
                            final axrw axrwVar2 = this.b;
                            final int i3 = this.c;
                            bbthVar.a.a().b("android.permission.READ_EXTERNAL_STORAGE", new axrw(bbthVar, i3, axrwVar2) { // from class: bbtg
                                private final bbth a;
                                private final axrw b;
                                private final int c;

                                {
                                    this.a = bbthVar;
                                    this.c = i3;
                                    this.b = axrwVar2;
                                }

                                @Override // defpackage.axrw
                                public final void a(int i4) {
                                    bbth bbthVar2 = this.a;
                                    int i5 = this.c;
                                    axrw axrwVar3 = this.b;
                                    if (i4 == 0) {
                                        ((ckco) bbthVar2.b.a().a(ckdz.an)).a(i5 - 1);
                                    } else {
                                        ((ckco) bbthVar2.b.a().a(ckdz.ao)).a(i5 - 1);
                                    }
                                    axrwVar3.a(i4);
                                }
                            });
                        }
                    });
                    return;
                }
                dsrjVar.isEmpty();
                this.i.shouldShowRequestPermissionRationale("android.permission.READ_EXTERNAL_STORAGE");
                g(7);
                return;
            }
            eaowVar.n();
            e.n();
            g(6);
        }
    }

    protected abstract int f();
}

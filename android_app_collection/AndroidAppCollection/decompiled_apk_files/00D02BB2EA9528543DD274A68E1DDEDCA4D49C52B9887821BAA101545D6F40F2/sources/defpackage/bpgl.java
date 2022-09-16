package defpackage;
/* compiled from: PG */
/* renamed from: bpgl  reason: default package */
/* loaded from: classes3.dex */
final class bpgl implements bpsr {
    final /* synthetic */ bpgm a;

    public bpgl(bpgm bpgmVar) {
        this.a = bpgmVar;
    }

    @Override // defpackage.bpsr
    public final void a() {
        final bpgt bpgtVar = this.a.al;
        if (bpgtVar.e.bb()) {
            jmx jmxVar = bpgtVar.i;
            jmw.d(bpgtVar.h, new Runnable(bpgtVar) { // from class: bpgp
                private final bpgt a;

                {
                    this.a = bpgtVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bptv bptvVar;
                    bpgt bpgtVar2 = this.a;
                    bptu f = bpgtVar2.c.f();
                    if (bpgtVar2.j.c == boxh.WHOLE_ROUTE) {
                        bptvVar = bptv.WHOLE_ROUTE;
                    } else {
                        bptvVar = bptv.SELECTED_SEGMENTS;
                    }
                    f.c(bptvVar);
                    bptw d = f.d();
                    digh dighVar = bpgtVar2.f.a.get(0);
                    bpsw bpswVar = bpgtVar2.l;
                    dcdc z = dcbg.b(bpgtVar2.f.a).s(bpgq.a).z();
                    dpum dpumVar = dighVar.e;
                    if (dpumVar == null) {
                        dpumVar = dpum.d;
                    }
                    akqq f2 = akqq.f(dpumVar);
                    dbrz f3 = dbrz.f(' ');
                    drkx drkxVar = dighVar.j;
                    if (drkxVar == null) {
                        drkxVar = drkx.b;
                    }
                    bpgtVar2.k.a(bpswVar.d(d, z, f2, f3.g(dchl.k(drkxVar.a, bpgr.a)), bpgtVar2.g), true);
                }
            });
            return;
        }
        bvoo.h("Attempting to submit when activity is in background. Should not happen.", new Object[0]);
    }

    @Override // defpackage.bpsr
    public final void b() {
        gga ggaVar = this.a.aE;
        dbsk.s(ggaVar);
        ggaVar.s();
    }
}

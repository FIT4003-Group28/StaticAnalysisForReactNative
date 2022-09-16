package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nlj  reason: default package */
/* loaded from: classes7.dex */
public final class nlj implements arpl {
    final /* synthetic */ nll a;

    public nlj(nll nllVar) {
        this.a = nllVar;
    }

    @Override // defpackage.arpl
    public final void a(dwbq dwbqVar, dwbs dwbsVar, long j, @dzsi bttq bttqVar) {
        int i;
        dwbs dwbsVar2 = dwbsVar;
        nll nllVar = this.a;
        if (nllVar.e == null) {
            return;
        }
        if (bttqVar == null) {
            dccx F = dcdc.F();
            int i2 = 0;
            while (i2 < dwbsVar2.b.size()) {
                amuh a = nllVar.c.a(dwbqVar, dwbsVar2.b.get(i2), j);
                if (a != null && !a.n() && a.j()) {
                    amub k = a.k();
                    if (k.L) {
                        nln nlnVar = nllVar.b;
                        ddjr ddjrVar = ddjr.CAR_OVERVIEW_IMPLICIT_DESTINATIONS;
                        dccx F2 = dcdc.F();
                        akrk w = k.w();
                        akra akraVar = new akra();
                        int l = w.l();
                        for (int i3 = 0; i3 < l; i3++) {
                            w.n(i3, akraVar);
                            F2.g(akraVar.S());
                        }
                        amve amveVar = k.d;
                        i = i2;
                        F.g(nlnVar.a(k.l(), k.E(), k.N(), k.G(), k.I, F2.f(), k.p, ddjrVar, i2, amveVar.m(), amveVar.k()));
                        i2 = i + 1;
                        dwbsVar2 = dwbsVar;
                    }
                }
                i = i2;
                i2 = i + 1;
                dwbsVar2 = dwbsVar;
            }
            final dcdc f = F.f();
            f.size();
            final nlk nlkVar = this.a.f;
            dbsk.s(nlkVar);
            this.a.a.b(new Runnable(nlkVar, f) { // from class: nlh
                private final nlk a;
                private final dcdc b;

                {
                    this.a = nlkVar;
                    this.b = f;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(this.b);
                }
            }, bvrj.UI_THREAD);
            this.a.b();
            return;
        }
        nllVar.a.a(new Runnable(this) { // from class: nli
            private final nlj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c();
            }
        }, bvrj.UI_THREAD, this.a.d.a());
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aswy  reason: default package */
/* loaded from: classes2.dex */
public final class aswy implements asxv {
    final /* synthetic */ aswz a;

    public aswy(aswz aswzVar) {
        this.a = aswzVar;
    }

    @Override // defpackage.asxv
    public final void a(aszm aszmVar, @dzsi aszm aszmVar2) {
        bvrj.UI_THREAD.c();
        aswz aswzVar = this.a;
        aswzVar.ay = aszmVar;
        aszm aszmVar3 = aswzVar.ay;
        if (aszmVar3 != null && aszmVar3.l != null) {
            if (aswzVar.c.getNavigationParameters().B()) {
                boolean b = this.a.am.b();
                aswz aswzVar2 = this.a;
                final asxt asxtVar = aswzVar2.am;
                dcdc<crqg> dcdcVar = aswzVar2.ay.l.g;
                if (asxtVar.g == dcdcVar.size()) {
                    asxtVar.e.a().h(dcdcVar);
                } else {
                    asxtVar.g = dcdcVar.size();
                    boolean ae = od.ae(asxtVar.f.a());
                    final int c = asxtVar.c();
                    int i = asxtVar.f.a().c;
                    if ((!ae || i == c) && !asxtVar.h) {
                        if (ae) {
                            asxtVar.f.a().post(new Runnable(asxtVar, c) { // from class: asxo
                                private final asxt a;
                                private final int b;

                                {
                                    this.a = asxtVar;
                                    this.b = c;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    asxt asxtVar2 = this.a;
                                    asxtVar2.f.a().e(this.b);
                                }
                            });
                        } else {
                            asxtVar.f.a().h(Math.min((dcdcVar.isEmpty() ? 0 : aszd.a.e(asxtVar.a.d) * asxtVar.g) + aszk.a.e(asxtVar.a.d), c));
                        }
                    }
                    asxtVar.e.a().h(dcdcVar);
                }
                if (b != this.a.am.b()) {
                    this.a.g();
                    return;
                }
            } else {
                boolean z = !this.a.ay.l.g.isEmpty();
                if (!this.a.aB && z) {
                    cjta b2 = cjtd.b();
                    b2.d = dtxp.aG;
                    b2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                    this.a.at.g().d(b2.a());
                }
                this.a.aB = z;
            }
        }
        if (aszmVar2 == null || aszmVar2.b() || !this.a.ay.b()) {
            return;
        }
        this.a.g();
    }
}

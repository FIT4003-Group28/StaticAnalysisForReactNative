package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qro  reason: default package */
/* loaded from: classes7.dex */
public final class qro {
    public final qrs a;
    public final axwe b;
    public final ckcw c;
    public final sic d;
    public boolean e = false;
    @dzsi
    public dcep<Integer> f = null;
    @dzsi
    public dngu g = null;
    @dzsi
    public dngu h = null;
    public dcdc<dnlg> i = dcdc.e();
    public dcdc<dnlg> j = dcdc.e();
    public int k = 1;
    private final Executor l;
    private final rha m;

    public qro(qrs qrsVar, axwe axweVar, dehp dehpVar, ckcw ckcwVar, rha rhaVar, sic sicVar) {
        this.a = qrsVar;
        this.b = axweVar;
        this.l = dehx.b(dehpVar);
        this.c = ckcwVar;
        this.d = sicVar;
        this.m = rhaVar;
    }

    public static rhb p(qjn qjnVar, dbrn<qjn, azva> dbrnVar) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        azva a = dbrnVar.a(qjnVar);
        if (a != null) {
            dbsgVar2 = akqi.d(a.c) ? dbsg.i(a.c) : dbpy.a;
            dbsgVar = dbsg.j(a.e);
        } else {
            dbsgVar = dbpy.a;
            dbsgVar2 = dbpy.a;
        }
        return rhb.c(dbsgVar, dbsgVar2);
    }

    public final boolean a() {
        return this.k != 1;
    }

    public final synchronized void b() {
        bvrj.UI_THREAD.c();
        this.k = 1;
        this.e = false;
        this.f = this.m.a();
        this.g = this.m.b();
        this.h = this.m.c();
        this.i = dcdc.e();
        this.j = dcdc.e();
    }

    public final synchronized dehn<?> c() {
        this.e = true;
        this.i = dcdc.e();
        return o(qre.a);
    }

    public final synchronized dehn<?> d() {
        this.e = true;
        this.j = dcdc.e();
        return o(qrf.a);
    }

    public final synchronized dcep<Integer> e() {
        dcep<Integer> dcepVar = this.f;
        if (dcepVar == null) {
            return this.m.a();
        }
        return dcepVar;
    }

    public final synchronized dehn<?> f(final dcep<Integer> dcepVar) {
        this.f = dcepVar;
        this.e = true;
        return o(new qrn(dcepVar) { // from class: qrg
            private final dcep a;

            {
                this.a = dcepVar;
            }

            @Override // defpackage.qrn
            public final void a(rgq rgqVar) {
                dcep dcepVar2 = this.a;
                rhq.b(rgqVar.c(), dcepVar2);
                rhq.b(rgqVar.d(), dcepVar2);
            }
        });
    }

    public final synchronized dngu g() {
        dngu dnguVar = this.g;
        if (dnguVar == null) {
            return this.m.b();
        }
        return dnguVar;
    }

    public final synchronized dehn<?> h(final dngu dnguVar) {
        this.g = dnguVar;
        this.e = true;
        return o(new qrn(dnguVar) { // from class: qrh
            private final dngu a;

            {
                this.a = dnguVar;
            }

            @Override // defpackage.qrn
            public final void a(rgq rgqVar) {
                ((rhy) dcft.s(rgqVar.c().c())).b(1).a().a.a = this.a;
            }
        });
    }

    public final synchronized dngu i() {
        dngu dnguVar = this.h;
        if (dnguVar == null) {
            return this.m.c();
        }
        return dnguVar;
    }

    public final synchronized dehn<?> j(final dngu dnguVar) {
        this.h = dnguVar;
        this.e = true;
        return o(new qrn(dnguVar) { // from class: qri
            private final dngu a;

            {
                this.a = dnguVar;
            }

            @Override // defpackage.qrn
            public final void a(rgq rgqVar) {
                rgqVar.d().c().get(0).b(2).a().a.a = this.a;
            }
        });
    }

    public final synchronized dbsg<dnlg> k() {
        return !this.i.isEmpty() ? dbsg.i(this.i.get(0)) : dbpy.a;
    }

    public final synchronized dehn<?> l(final dnlg dnlgVar) {
        this.e = true;
        this.i = dcdc.f(dnlgVar);
        return o(new qrn(dnlgVar) { // from class: qrj
            private final dnlg a;

            {
                this.a = dnlgVar;
            }

            @Override // defpackage.qrn
            public final void a(rgq rgqVar) {
                rhq.e(rgqVar.c(), this.a);
            }
        });
    }

    public final synchronized dbsg<dnlg> m() {
        return !this.j.isEmpty() ? dbsg.i(this.j.get(0)) : dbpy.a;
    }

    public final synchronized dehn<?> n(final dnlg dnlgVar) {
        this.e = true;
        this.j = dcdc.f(dnlgVar);
        return o(new qrn(dnlgVar) { // from class: qrk
            private final dnlg a;

            {
                this.a = dnlgVar;
            }

            @Override // defpackage.qrn
            public final void a(rgq rgqVar) {
                rhq.e(rgqVar.d(), this.a);
            }
        });
    }

    public final dehn<?> o(final qrn qrnVar) {
        final deig d = deig.d();
        this.l.execute(new Runnable(this, qrnVar, d) { // from class: qrl
            private final qro a;
            private final qrn b;
            private final deig c;

            {
                this.a = this;
                this.b = qrnVar;
                this.c = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qro qroVar = this.a;
                qrn qrnVar2 = this.b;
                deig deigVar = this.c;
                try {
                    synchronized (qroVar.b) {
                        try {
                            qjn b = qroVar.d.b();
                            dcdg p = dcdn.p();
                            p.f(dnkh.HOME, qro.p(b, qrb.a));
                            p.f(dnkh.WORK, qro.p(b, qrc.a));
                            dcdn b2 = p.b();
                            final qrs qrsVar = qroVar.a;
                            bvrj.UI_THREAD.d();
                            dcdc<azwc> a = qrsVar.a.a();
                            rgo rgoVar = qrsVar.c;
                            dcep B = dcbg.b(a).s(new dbrn(qrsVar) { // from class: qrq
                                private final qrs a;

                                {
                                    this.a = qrsVar;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj) {
                                    rhk rhkVar = this.a.b;
                                    dnls dnlsVar = ((azwc) obj).j().b;
                                    if (dnlsVar == null) {
                                        dnlsVar = dnls.g;
                                    }
                                    rhk.a(rhkVar.a.a(), 1);
                                    rhz a2 = rhkVar.b.a();
                                    rhk.a(a2, 2);
                                    rin a3 = rhkVar.c.a();
                                    rhk.a(a3, 3);
                                    rhr a4 = rhkVar.d.a();
                                    rhk.a(a4, 4);
                                    rhk.a(dnlsVar, 5);
                                    return new rhj(a2, a3, a4, dnlsVar);
                                }
                            }).B();
                            dbsg<rhj> a2 = rgw.a("commute_to_work", dnkh.HOME, dnkh.WORK, B);
                            dbsg<rhj> a3 = rgw.a("commute_to_home", dnkh.WORK, dnkh.HOME, B);
                            if (a2.a() && a3.a() && !rhq.a(a2.b()).equals(rhq.a(a3.b()))) {
                                throw new rgs(1, "Commute trips have mismatching days");
                            }
                            rfs rfsVar = new rfs(a2, a3);
                            rgr rgrVar = rgoVar.a;
                            dbsg<rhj> dbsgVar = rfsVar.a;
                            dbsg<rhj> dbsgVar2 = rfsVar.b;
                            rgr.a(B, 1);
                            rgr.a(dbsgVar, 2);
                            rgr.a(dbsgVar2, 3);
                            rgr.a(b2, 4);
                            rgx a4 = rgrVar.a.a();
                            rgr.a(a4, 5);
                            rha a5 = rgrVar.b.a();
                            rgr.a(a5, 6);
                            rgq rgqVar = new rgq(dbsgVar, dbsgVar2, b2, a4, a5);
                            dcdn D = dcbg.b(a).D(qrr.a);
                            qrnVar2.a(rgqVar);
                            bvrj.UI_THREAD.d();
                            long b3 = qrsVar.d.b();
                            dcpd<rhj> it = rgqVar.e(rgg.a).iterator();
                            while (it.hasNext()) {
                                rhj next = it.next();
                                azwc azwcVar = (azwc) D.get(next.b());
                                if (azwcVar != null) {
                                    azwb i = azwcVar.i();
                                    dokg ca = dokh.d.ca(azwcVar.j());
                                    dojz dojzVar = azwcVar.j().c;
                                    if (dojzVar == null) {
                                        dojzVar = dojz.c;
                                    }
                                    dojy ca2 = dojz.c.ca(dojzVar);
                                    if (ca2.c) {
                                        ca2.bF();
                                        ca2.c = false;
                                    }
                                    dojz dojzVar2 = (dojz) ca2.b;
                                    dojzVar2.a |= 1;
                                    dojzVar2.b = b3;
                                    if (ca.c) {
                                        ca.bF();
                                        ca.c = false;
                                    }
                                    dokh dokhVar = (dokh) ca.b;
                                    dojz bK = ca2.bK();
                                    bK.getClass();
                                    dokhVar.c = bK;
                                    dokhVar.a |= 2;
                                    dnls a6 = next.a();
                                    if (ca.c) {
                                        ca.bF();
                                        ca.c = false;
                                    }
                                    dokh dokhVar2 = (dokh) ca.b;
                                    a6.getClass();
                                    dokhVar2.b = a6;
                                    dokhVar2.a |= 1;
                                    i.c(ca.bK());
                                    qrsVar.a.b(i.b());
                                } else {
                                    throw new IllegalStateException("Modified non-existent trip");
                                }
                            }
                            dcpd<rhj> it2 = rgqVar.e(rgh.a).iterator();
                            while (it2.hasNext()) {
                                rhj next2 = it2.next();
                                dokg bZ = dokh.d.bZ();
                                dojy bZ2 = dojz.c.bZ();
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                dojz dojzVar3 = (dojz) bZ2.b;
                                dojzVar3.a |= 1;
                                dojzVar3.b = b3;
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dokh dokhVar3 = (dokh) bZ.b;
                                dojz bK2 = bZ2.bK();
                                bK2.getClass();
                                dokhVar3.c = bK2;
                                dokhVar3.a |= 2;
                                dnls a7 = next2.a();
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dokh dokhVar4 = (dokh) bZ.b;
                                a7.getClass();
                                dokhVar4.b = a7;
                                dokhVar4.a |= 1;
                                qrsVar.a.b(new azwb(bZ.bK()).b());
                            }
                            deigVar.j(null);
                        } catch (axxc e) {
                            e = e;
                            throw new ExecutionException(e);
                        } catch (rgs e2) {
                            e = e2;
                            throw new ExecutionException(e);
                        }
                    }
                } catch (Exception e3) {
                    deigVar.k(e3);
                }
            }
        });
        return d;
    }
}

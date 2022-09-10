package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: qru  reason: default package */
/* loaded from: classes7.dex */
public final class qru implements qjk {
    private final axvy a;
    private final qro b;
    private final ckcw c;
    private final btvo d;
    private List<domy> e;

    public qru(axvy axvyVar, qro qroVar, ckcw ckcwVar, btvo btvoVar) {
        this.a = axvyVar;
        this.b = qroVar;
        this.c = ckcwVar;
        this.d = btvoVar;
    }

    @Override // defpackage.qjk
    public final boolean a() {
        return this.b.a();
    }

    @Override // defpackage.qjk
    public final boolean b() {
        return this.b.k == 3;
    }

    @Override // defpackage.qjk
    public final boolean c() {
        return this.b.k == 4;
    }

    @Override // defpackage.qjk
    public final boolean d() {
        return this.b.e;
    }

    @Override // defpackage.qjk
    public final synchronized List<domy> e() {
        if (this.e == null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(domy.DRIVE, domy.TRANSIT, domy.TWO_WHEELER, domy.WALKING, domy.BIKING, domy.UNKNOWN_TRAVEL_MODE));
            if (sif.b(this.d)) {
                arrayList.add(2, domy.MULTIMODAL);
            }
            this.e = dcdc.r(arrayList);
        }
        return this.e;
    }

    @Override // defpackage.qjk
    public final domy f() {
        return this.a.b();
    }

    @Override // defpackage.qjk
    public final dbsg<domy> g() {
        return dbsg.i(this.a.b());
    }

    @Override // defpackage.qjk
    public final donb h() {
        return ((azql) this.a).m;
    }

    @Override // defpackage.qjk
    public final dehn<?> i(domy domyVar) {
        return this.a.c(domyVar);
    }

    @Override // defpackage.qjk
    public final synchronized dcep<Integer> j() {
        return this.b.e();
    }

    @Override // defpackage.qjk
    public final synchronized dehn<?> k(dcep<Integer> dcepVar) {
        ((ckco) this.c.a(ckeo.o)).a(ckeg.a(1));
        return this.b.f(dcepVar);
    }

    @Override // defpackage.qjk
    public final synchronized dngu l() {
        return this.b.g();
    }

    @Override // defpackage.qjk
    public final synchronized dehn<?> m(dngu dnguVar) {
        ((ckco) this.c.a(ckeo.o)).a(ckeg.a(2));
        return this.b.h(dnguVar);
    }

    @Override // defpackage.qjk
    public final synchronized dngu n() {
        return this.b.i();
    }

    @Override // defpackage.qjk
    public final synchronized dehn<?> o(dngu dnguVar) {
        ((ckco) this.c.a(ckeo.o)).a(ckeg.a(3));
        return this.b.j(dnguVar);
    }

    @Override // defpackage.qjk
    public final synchronized dbsg<dnlg> p() {
        return this.b.k();
    }

    @Override // defpackage.qjk
    public final synchronized dehn<?> q(dnlg dnlgVar) {
        ((ckco) this.c.a(ckeo.o)).a(ckeg.a(4));
        return this.b.l(dnlgVar);
    }

    @Override // defpackage.qjk
    public final synchronized dehn<?> r() {
        ((ckco) this.c.a(ckeo.o)).a(ckeg.a(4));
        return this.b.c();
    }

    @Override // defpackage.qjk
    public final synchronized dbsg<dnlg> s() {
        return this.b.m();
    }

    @Override // defpackage.qjk
    public final synchronized dehn<?> t(dnlg dnlgVar) {
        ((ckco) this.c.a(ckeo.o)).a(ckeg.a(5));
        return this.b.n(dnlgVar);
    }

    @Override // defpackage.qjk
    public final synchronized dehn<?> u() {
        ((ckco) this.c.a(ckeo.o)).a(ckeg.a(5));
        return this.b.d();
    }

    @Override // defpackage.qjk
    public final void v() {
        this.a.n();
    }

    @Override // defpackage.qjk
    public final dehn<?> w() {
        if (!this.b.a()) {
            final qro qroVar = this.b;
            return deee.g(qroVar.o(new qrn(qroVar) { // from class: qra
                private final qro a;

                {
                    this.a = qroVar;
                }

                @Override // defpackage.qrn
                public final void a(rgq rgqVar) {
                    qro qroVar2 = this.a;
                    synchronized (qroVar2) {
                        boolean z = true;
                        if (!rgqVar.c.a() && !rgqVar.b.a()) {
                            z = false;
                        }
                        qroVar2.e = z;
                        dbsg h = rgqVar.b.h(rgi.a).h(rgj.a);
                        dbsg h2 = rgqVar.c.h(rgk.a).h(rgl.a);
                        if (h.a() && h2.a() && !h.equals(h2)) {
                            throw new IllegalStateException("Uncaught mismatch in commute days");
                        }
                        qroVar2.f = (dcep) h.d(h2).c(rgqVar.a.a());
                        qroVar2.g = (dngu) ((dbsg) rgqVar.b.h(rgm.a).h(rgn.a).c(dbpy.a)).c(rgqVar.a.b());
                        qroVar2.h = (dngu) ((dbsg) rgqVar.c.h(rfv.a).h(rfw.a).c(dbpy.a)).c(rgqVar.a.c());
                        if (rgqVar.a().a()) {
                            qroVar2.i = dcdc.f(rgqVar.a().b());
                        }
                        if (rgqVar.b().a()) {
                            qroVar2.j = dcdc.f(rgqVar.b().b());
                        }
                        qroVar2.k = 2;
                    }
                }
            }), ExecutionException.class, new dbrn(qroVar) { // from class: qrd
                private final qro a;

                {
                    this.a = qroVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    qro qroVar2 = this.a;
                    try {
                        Throwable cause = ((ExecutionException) obj).getCause();
                        dbsk.s(cause);
                        throw cause;
                    } catch (axxc unused) {
                        qroVar2.k = 3;
                        return qroVar2;
                    } catch (rgs e) {
                        e.getMessage();
                        ckco ckcoVar = (ckco) qroVar2.c.a(ckeo.p);
                        int i = e.a;
                        if (i == 0) {
                            throw null;
                        }
                        ckcoVar.a(i - 1);
                        qroVar2.k = 4;
                        return qroVar2;
                    } catch (Throwable th) {
                        throw new deiw(th);
                    }
                }
            }, dege.a);
        }
        return deha.a(this);
    }
}

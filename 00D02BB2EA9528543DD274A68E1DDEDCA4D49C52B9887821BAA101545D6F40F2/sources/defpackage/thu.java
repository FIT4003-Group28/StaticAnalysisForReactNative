package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: thu  reason: default package */
/* loaded from: classes7.dex */
public final class thu implements tgy {
    private static final dcqe c = dcqe.c("thu");
    public final ufg a;
    public final tmb b;
    private final Application d;
    private final ufd e;
    private final udl f;
    private final dzsj<String> g;
    private final Executor h;

    public thu(Application application, ufg ufgVar, tmb tmbVar, ufd ufdVar, udl udlVar, Executor executor, dzsj<String> dzsjVar) {
        this.d = application;
        this.a = ufgVar;
        this.b = tmbVar;
        this.e = ufdVar;
        this.f = udlVar;
        this.h = executor;
        this.g = dzsjVar;
    }

    @Override // defpackage.tgy
    public final dehn<tgk> a(tgv tgvVar, dwaw dwawVar, eapd eapdVar, amte amteVar) {
        int f = tgvVar.f();
        int i = f - 1;
        if (f != 0) {
            if (i != 0 && i != 1 && i != 2) {
                if (i == 3) {
                    if (amteVar.a.n() == 1) {
                        this.b.g(tgvVar.a(), amteVar.a.m(0), tgvVar.c().b().intValue());
                    } else {
                        bvoo.h("Received %d trips when getting mode alternates, expected 1", Integer.valueOf(amteVar.a.n()));
                    }
                    return deha.a(tgk.COMPLETED);
                } else if (i == 4) {
                    if (amteVar.a.n() == 1) {
                        this.b.i(tgvVar.a(), amteVar.a, tgvVar.c().b().intValue());
                    } else {
                        bvoo.h("Received %d trips when applying mode alternates, expected 1", Integer.valueOf(amteVar.a.n()));
                    }
                    return deha.a(tgk.COMPLETED);
                } else {
                    Object[] objArr = new Object[1];
                    int f2 = tgvVar.f();
                    String a = tgt.a(f2);
                    if (f2 == 0) {
                        throw null;
                    }
                    objArr[0] = a;
                    bvoo.h("Unhandled fetch reason %s", objArr);
                    return deha.a(tgk.COMPLETED);
                }
            } else if (!this.f.b(amteVar)) {
                amsy amsyVar = amteVar.a;
                uff l = this.a.a().l();
                dbsk.s(l);
                dcdc<amvh> a2 = l.a();
                int i2 = amsyVar.i();
                dbsk.a(a2.size() == i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    this.a.b(amvj.b(amsyVar.c(), this.d, a2.get(i3), amsyVar.h(i3)), i3);
                }
                tmb tmbVar = this.b;
                btlu a3 = tgvVar.a();
                amsy amsyVar2 = amteVar.a;
                dwbc dwbcVar = amsyVar2.a;
                dwaa dwaaVar = dwbcVar.b;
                if (dwaaVar == null) {
                    dwaaVar = dwaa.g;
                }
                dvzu dvzuVar = dwaaVar.b;
                if (dvzuVar == null) {
                    dvzuVar = dvzu.F;
                }
                dsqp dsqpVar = (dsqp) dvzuVar.cu(5);
                dsqpVar.bC(dvzuVar);
                dvzo dvzoVar = (dvzo) dsqpVar;
                for (int i4 = 0; i4 < ((dvzu) dvzoVar.b).e.size(); i4++) {
                    dpie a4 = dvzoVar.a(i4);
                    if ((a4.a & 134217728) == 0) {
                        dsqp dsqpVar2 = (dsqp) a4.cu(5);
                        dsqpVar2.bC(a4);
                        dphr dphrVar = (dphr) dsqpVar2;
                        dspd B = dspd.B(this.g.a());
                        if (dphrVar.c) {
                            dphrVar.bF();
                            dphrVar.c = false;
                        }
                        dpie dpieVar = (dpie) dphrVar.b;
                        dpieVar.A = B.J();
                        dpieVar.a |= 134217728;
                        dvzoVar.g(i4, dphrVar);
                    }
                }
                dsqp dsqpVar3 = (dsqp) dwbcVar.cu(5);
                dsqpVar3.bC(dwbcVar);
                dwaz dwazVar = (dwaz) dsqpVar3;
                dsqp dsqpVar4 = (dsqp) dwaaVar.cu(5);
                dsqpVar4.bC(dwaaVar);
                dvzz dvzzVar = (dvzz) dsqpVar4;
                if (dvzzVar.c) {
                    dvzzVar.bF();
                    dvzzVar.c = false;
                }
                dwaa dwaaVar2 = (dwaa) dvzzVar.b;
                dvzu bK = dvzoVar.bK();
                bK.getClass();
                dwaaVar2.b = bK;
                dwaaVar2.a |= 1;
                if (dwazVar.c) {
                    dwazVar.bF();
                    dwazVar.c = false;
                }
                dwbc dwbcVar2 = (dwbc) dwazVar.b;
                dwaa bK2 = dvzzVar.bK();
                bK2.getClass();
                dwbcVar2.b = bK2;
                dwbcVar2.a |= 1;
                tmbVar.b(a3, new amsy((dwbc) dwazVar.bK(), amsyVar2.c), dwawVar, eapdVar, tgvVar.d());
                if (this.e.a(amteVar.a)) {
                    this.e.b(amteVar.a);
                }
                return deha.a(tgk.COMPLETED);
            } else {
                deig d = deig.d();
                deha.q(this.f.a(amteVar), new tht(this, tgvVar.a(), d), this.h);
                return d;
            }
        }
        throw null;
    }

    @Override // defpackage.tgy
    public final void b(btlu btluVar) {
        this.b.c(btluVar, false);
    }
}

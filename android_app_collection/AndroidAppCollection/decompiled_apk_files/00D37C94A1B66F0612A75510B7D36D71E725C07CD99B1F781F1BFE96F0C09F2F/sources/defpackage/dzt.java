package defpackage;

import android.os.Build;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzt implements Runnable {
    public final /* synthetic */ eai a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzt(eai eaiVar) {
        this.a = eaiVar;
    }

    public /* synthetic */ dzt(eai eaiVar, int i) {
        this.b = i;
        this.a = eaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                eai eaiVar = this.a;
                new yvz(eaiVar.f, (ywa) eaiVar.ar.get(), (yni) eaiVar.z.get()).a();
                return;
            case 1:
                this.a.o.get();
                return;
            case 2:
                this.a.q.get();
                return;
            case 3:
                ((jnp) this.a.R.get()).a();
                return;
            case 4:
                eai eaiVar2 = this.a;
                afuy afuyVar = (afuy) eaiVar2.ba.get();
                ((yni) eaiVar2.z.get()).g(afuyVar);
                afuyVar.b();
                return;
            case 5:
                eai eaiVar3 = this.a;
                if (Build.VERSION.SDK_INT < 23 || !agbo.d(eaiVar3.bu)) {
                    return;
                }
                ((fae) eaiVar3.aB.get()).a(eaiVar3.f);
                return;
            case 6:
                ((zej) this.a.aL.get()).a();
                return;
            case 7:
                eai eaiVar4 = this.a;
                if (eaiVar4.g.c(ywk.S) == 10) {
                    return;
                }
                ((afse) eaiVar4.V.get()).c();
                return;
            case 8:
                eai eaiVar5 = this.a;
                aaaw.d((aavp) eaiVar5.K.get());
                vwl.a((yjs) eaiVar5.ap.get(), eaiVar5.h.c());
                return;
            case 9:
                ((jgo) this.a.P.get()).c();
                return;
            case 10:
                ((aisl) this.a.aT.get()).a();
                return;
            case 11:
                this.a.r.get();
                return;
            case 12:
                eai eaiVar6 = this.a;
                ylx.i(eaiVar6.i, new eah(eaiVar6));
                return;
            case 13:
                ((acux) this.a.j.get()).f();
                return;
            case 14:
                eai eaiVar7 = this.a;
                ((acvp) eaiVar7.M.get()).f();
                eaiVar7.d.i.d().O(eaiVar7.bs).M(300L, TimeUnit.SECONDS, eaiVar7.b).G(eaiVar7.b).p(15L, TimeUnit.SECONDS, eaiVar7.b).T(new dzu(eaiVar7, 1), new dzu(eaiVar7, 2));
                return;
            case 15:
                ((akpx) this.a.aa.get()).c();
                return;
            case 16:
                ((acrr) this.a.ax.get()).b();
                return;
            case 17:
                ((jcq) this.a.bb.get()).d();
                return;
            case 18:
                final eai eaiVar8 = this.a;
                ite iteVar = (ite) eaiVar8.k.get();
                iteVar.f = new aaby((aabw) eaiVar8.aO.get());
                iteVar.n();
                eaiVar8.d.b().R(new aypv() { // from class: eag
                    @Override // defpackage.aypv
                    public final void a() {
                        ((aabw) eai.this.aO.get()).b(false);
                    }
                });
                return;
            case 19:
                final eai eaiVar9 = this.a;
                aohk.f = new eae();
                aohk.d(new aohh() { // from class: ead
                    @Override // defpackage.aohh
                    public final void a(String str) {
                        zgd.a(eai.this.f, str);
                    }
                });
                return;
            default:
                final eai eaiVar10 = this.a;
                eaiVar10.af.get();
                aaca aacaVar = (aaca) eaiVar10.aN.get();
                aqxo.z(aacaVar.c.get(), "BrowseFirstController not initialized");
                if (aacaVar.b) {
                    if (!((yrj) eaiVar10.aq.get()).o() || ((edw) eaiVar10.as.get()).a() != 2) {
                        ((aabw) eaiVar10.aO.get()).b(false);
                    } else {
                        aynr a = eaiVar10.d.a();
                        yxd yxdVar = eaiVar10.d.g;
                        ayor ayorVar = azpj.d;
                        yxc c = yxd.c(1, a);
                        c.b("bfr", new dzt(eaiVar10, 18));
                        yxdVar.n(ayorVar, c);
                    }
                } else {
                    ylx.k(eaiVar10.i, eaiVar10.a, dzl.c, new ylw() { // from class: dzz
                        @Override // defpackage.ylw, defpackage.zdt
                        public final void a(Object obj) {
                            eai eaiVar11 = eai.this;
                            if (((Boolean) obj).booleanValue() || !((Boolean) eaiVar11.aY.get()).booleanValue()) {
                                return;
                            }
                            aveq aveqVar = eaiVar11.bu.b().u;
                            if (aveqVar == null) {
                                aveqVar = aveq.a;
                            }
                            apgx apgxVar = aveqVar.g;
                            if (apgxVar == null) {
                                apgxVar = apgx.a;
                            }
                            if (!apgxVar.j || !((yrj) eaiVar11.aq.get()).o() || ((edw) eaiVar11.as.get()).a() != 2) {
                                return;
                            }
                            aynr a2 = eaiVar11.d.a();
                            yxd yxdVar2 = eaiVar11.d.g;
                            ayor ayorVar2 = azpj.d;
                            yxc c2 = yxd.c(1, a2);
                            c2.b("ebr", new dzv(eaiVar11, 18));
                            yxdVar2.n(ayorVar2, c2);
                        }
                    });
                }
                ((aapk) eaiVar10.ag.get()).b();
                ((isi) eaiVar10.ah.get()).a();
                eaiVar10.ai.get();
                return;
        }
    }
}

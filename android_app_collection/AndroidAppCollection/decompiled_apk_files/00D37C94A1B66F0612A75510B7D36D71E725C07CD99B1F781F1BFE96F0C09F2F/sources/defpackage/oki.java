package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: oki  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oki implements Callable {
    public final /* synthetic */ okq a;
    private final /* synthetic */ int b;

    public /* synthetic */ oki(okq okqVar) {
        this.a = okqVar;
    }

    public /* synthetic */ oki(okq okqVar, int i) {
        this.b = i;
        this.a = okqVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        if (i == 0) {
            okq okqVar = this.a;
            return okqVar.e.a().ag(1L).as(new okn(okqVar, 2));
        } else if (i == 1) {
            okq okqVar2 = this.a;
            return okqVar2.g.X(okqVar2.h).as(new okn(okqVar2, 1));
        } else if (i == 2) {
            final okq okqVar3 = this.a;
            return okqVar3.e.a().X(okqVar3.h).F(npy.s).as(new ayqb() { // from class: oko
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    okq okqVar4 = okq.this;
                    aawr aawrVar = (aawr) obj;
                    boolean z = false;
                    if (aawrVar != null && aawrVar.a != null) {
                        amuk amukVar = okqVar4.p;
                        okqVar4.p = amuk.n(ayoi.T(aawrVar).V(oav.m).K(oav.n).V(oav.o).K(oav.p).V(oav.q).I(noc.k).V(oav.r).av());
                        final olr olrVar = okqVar4.l;
                        amuk amukVar2 = okqVar4.p;
                        amvn amvnVar = !olrVar.c.isEmpty() ? olrVar.c : (amvn) ((ayos) ayoi.Q(olrVar.a.i()).L(new ayqe() { // from class: olp
                            @Override // defpackage.ayqe
                            public final Object a(Object obj2) {
                                olr olrVar2 = olr.this;
                                final Integer num = (Integer) obj2;
                                ayoc v = ayoc.v(num);
                                final gbq gbqVar = olrVar2.a;
                                gbqVar.getClass();
                                ayoc h = v.w(new ayqe() { // from class: oln
                                    @Override // defpackage.ayqe
                                    public final Object a(Object obj3) {
                                        return gbq.this.f(((Integer) obj3).intValue());
                                    }
                                }).h(hqc.e);
                                final olc olcVar = olrVar2.b;
                                return h.w(new ayqe() { // from class: olo
                                    @Override // defpackage.ayqe
                                    public final Object a(Object obj3) {
                                        return olc.this.a((PaneDescriptor) obj3);
                                    }
                                }).r(noc.m).w(olg.e).w(new ayqe() { // from class: olf
                                    @Override // defpackage.ayqe
                                    public final Object a(Object obj3) {
                                        return ampr.a((String) obj3, num);
                                    }
                                });
                            }
                        }).V(olg.c).ay(yps.i)).U();
                        int a = olrVar.a.a();
                        amvn amvnVar2 = (amvn) ((ayos) ayoi.Q(amukVar2).V(oav.t).I(noc.m).V(olg.e).ay(yps.i)).U();
                        final amup amupVar = (amup) ayoi.Q(amvnVar).I(new olj(amvnVar2, 1)).I(noc.l).ay(new ole(olg.b, oav.u));
                        ayoi I = ayoi.Q(amvnVar).I(new olj(amvnVar2)).I(new olh(a, 1));
                        ayqb ayqbVar = new ayqb() { // from class: olm
                            @Override // defpackage.ayqb
                            public final void a(Object obj2) {
                                olr.this.a.p(((okw) obj2).c);
                            }
                        };
                        Iterator it = I.av().iterator();
                        while (it.hasNext()) {
                            try {
                                ayqbVar.a(it.next());
                            } catch (Throwable th) {
                                bapv.j(th);
                                ((aypg) it).qr();
                                throw azom.b(th);
                            }
                        }
                        olrVar.c = (amvn) ((ayos) ayoi.Q(amukVar2).V(oav.t).I(noc.m).V(olg.e).al(olr.a(), nti.i).I(new oli(amupVar, 1)).V(new ayqe() { // from class: olq
                            @Override // defpackage.ayqe
                            public final Object a(Object obj2) {
                                amup amupVar2 = amup.this;
                                ampr amprVar = (ampr) obj2;
                                okv a2 = okw.a();
                                a2.c((String) amprVar.a);
                                a2.d(((Integer) amprVar.b).intValue());
                                a2.b(((Integer) amupVar2.get(amprVar.a)).intValue());
                                return a2.a();
                            }
                        }).v(ayoi.Q(amukVar2).V(oav.t).I(noc.m).V(olg.e).al(olr.a(), nti.i).I(new oli(amupVar)).al(olr.a().I(new oli(amupVar, 2)).I(new olh(a)), nti.g)).ay(yps.i)).U();
                        amuk amukVar3 = okqVar4.p;
                        if (amukVar.size() == amukVar3.size()) {
                            for (int i2 = 0; i2 < amukVar.size(); i2++) {
                                meq meqVar = (meq) amukVar.get(i2);
                                meq meqVar2 = (meq) amukVar3.get(i2);
                                meqVar2.getClass();
                                if (meqVar.a.getClass().isInstance(meqVar2.a)) {
                                    mep mepVar = meqVar.i;
                                    aoqu aoquVar = meqVar.a;
                                    if (mepVar.a(aoquVar, (aoqu) aoquVar.getClass().cast(meqVar2.a))) {
                                    }
                                }
                            }
                        }
                        z = true;
                        break;
                    }
                    okqVar4.v(z);
                }
            });
        } else if (i == 3) {
            okq okqVar4 = this.a;
            return okqVar4.k.V(oav.k).B().ab(1L).as(new okn(okqVar4, 3));
        } else if (i == 4) {
            okq okqVar5 = this.a;
            return okqVar5.f.d().Z(new okn(okqVar5));
        } else {
            final okq okqVar6 = this.a;
            return ayoi.m(okqVar6.c.h(), okqVar6.b.h().af(oav.l), new aypx() { // from class: okh
                @Override // defpackage.aypx
                public final Object a(Object obj, Object obj2) {
                    okq okqVar7 = okq.this;
                    ezx ezxVar = (ezx) obj;
                    fte fteVar = (fte) obj2;
                    izj izjVar = okqVar7.t;
                    atcj atcjVar = okqVar7.v.b().n;
                    if (atcjVar == null) {
                        atcjVar = atcj.a;
                    }
                    boolean z = atcjVar.k;
                    boolean z2 = true;
                    if (ezxVar.b() || ezxVar.i() || (!z && izjVar != null && izjVar.h())) {
                        z2 = false;
                    }
                    okqVar7.s = z2;
                    okqVar7.r = fteVar.b;
                    if (!z2) {
                        ftd a = fte.a();
                        a.b(false);
                        return Optional.of(a.a());
                    } else if (ezxVar.j() || !ezxVar.f()) {
                        return Optional.of(fteVar);
                    } else {
                        return Optional.empty();
                    }
                }
            }).as(new okn(okqVar6, 4));
        }
    }
}

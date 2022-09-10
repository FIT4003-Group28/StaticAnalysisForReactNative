package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: csjl  reason: default package */
/* loaded from: classes5.dex */
public final class csjl implements csgb<csir> {
    public final csit a;
    public final csgj b;
    public final boolean c = false;
    private final csjy d;

    public csjl(csit csitVar, csgj csgjVar, csjy csjyVar) {
        this.a = csitVar;
        this.b = csgjVar;
        this.d = csjyVar;
    }

    @Override // defpackage.csgb
    public final dehn<Void> a(final csge<csir> csgeVar) {
        final csir csirVar = csgeVar.a;
        final String a = this.a.a(csirVar);
        if (a.isEmpty()) {
            return deha.a(null);
        }
        final dehn<dssj> b = this.a.b(csirVar, csgeVar.b);
        final dehn<int[]> d = this.a.d(csgeVar.b);
        csjy csjyVar = this.d;
        List<cshb> list = csirVar.b;
        final dehn a2 = deha.a(null);
        final csgz csgzVar = csirVar.c.a;
        final ArrayList arrayList = new ArrayList();
        csjyVar.b.a(csgzVar, csgzVar.c, null, arrayList);
        final ArrayList arrayList2 = new ArrayList();
        csjyVar.c.a(csgzVar, csgzVar.c, null, arrayList2);
        final dehn b2 = deha.n(dcbg.d(arrayList, arrayList2)).b(new Callable(csirVar, csgzVar, arrayList, arrayList2, a2) { // from class: csjx
            private final csir a;
            private final csgz b;
            private final List c;
            private final List d;
            private final dehn e;

            {
                this.a = csirVar;
                this.b = csgzVar;
                this.c = arrayList;
                this.d = arrayList2;
                this.e = a2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object b3;
                Object b4;
                Object b5;
                csir csirVar2 = this.a;
                csgz csgzVar2 = this.b;
                List<dehn> list2 = this.c;
                List<dehn> list3 = this.d;
                dehn dehnVar = this.e;
                ddbx bZ = ddby.g.bZ();
                ddxz ddxzVar = csirVar2.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddby ddbyVar = (ddby) bZ.b;
                ddxzVar.getClass();
                ddbyVar.b = ddxzVar;
                ddbyVar.a |= 1;
                ddxz a3 = csjf.a(csirVar2, true);
                dbsk.m(a3 != null, "No Parent Event");
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddby ddbyVar2 = (ddby) bZ.b;
                a3.getClass();
                ddbyVar2.d = a3;
                ddbyVar2.a |= 2;
                ddxx ddxxVar = csin.a(csirVar2).c;
                if (ddxxVar == null) {
                    ddxxVar = ddxx.j;
                }
                ddhd ddhdVar = (ddhd) ddhe.j.bZ();
                if (ddhdVar.c) {
                    ddhdVar.bF();
                    ddhdVar.c = false;
                }
                ddhe ddheVar = (ddhe) ddhdVar.b;
                ddxxVar.getClass();
                ddheVar.b = ddxxVar;
                ddheVar.a |= 1;
                deaf b6 = deaf.b(csgzVar2.b);
                if (b6 == null) {
                    b6 = deaf.UNASSIGNED_USER_ACTION_ID;
                }
                int i = b6.Q;
                if (ddhdVar.c) {
                    ddhdVar.bF();
                    ddhdVar.c = false;
                }
                ddhe ddheVar2 = (ddhe) ddhdVar.b;
                ddheVar2.a |= 16;
                ddheVar2.d = i;
                deaf b7 = deaf.b(csgzVar2.b);
                if (b7 == null) {
                    b7 = deaf.UNASSIGNED_USER_ACTION_ID;
                }
                int i2 = b7.Q;
                if (ddhdVar.c) {
                    ddhdVar.bF();
                    ddhdVar.c = false;
                }
                ddhe ddheVar3 = (ddhe) ddhdVar.b;
                ddheVar3.a |= 16;
                ddheVar3.d = i2;
                for (Integer num : csgzVar2.c) {
                    switch (num.intValue()) {
                        case 100000001:
                            dsqv<csgz, csik> dsqvVar = csii.a;
                            csgzVar2.f(dsqvVar);
                            Object l = csgzVar2.V.l(dsqvVar.d);
                            if (l == null) {
                                b3 = dsqvVar.b;
                            } else {
                                b3 = dsqvVar.b(l);
                            }
                            dead b8 = dead.b(((csik) b3).a);
                            if (b8 == null) {
                                b8 = dead.UNASSIGNED_DIRECTIONAL_MOVEMENT_ID;
                            }
                            int i3 = b8.f;
                            if (ddhdVar.c) {
                                ddhdVar.bF();
                                ddhdVar.c = false;
                            }
                            ddhe ddheVar4 = (ddhe) ddhdVar.b;
                            ddheVar4.a |= 32;
                            ddheVar4.e = i3;
                            break;
                        case 100000002:
                            dsqv<csgz, deab> dsqvVar2 = csii.b;
                            csgzVar2.f(dsqvVar2);
                            Object l2 = csgzVar2.V.l(dsqvVar2.d);
                            if (l2 == null) {
                                b4 = dsqvVar2.b;
                            } else {
                                b4 = dsqvVar2.b(l2);
                            }
                            deaa b9 = deaa.b(((deab) b4).b);
                            if (b9 == null) {
                                b9 = deaa.TOGGLE_UNDEFINED;
                            }
                            int i4 = b9.d;
                            if (ddhdVar.c) {
                                ddhdVar.bF();
                                ddhdVar.c = false;
                            }
                            ddhe ddheVar5 = (ddhe) ddhdVar.b;
                            ddheVar5.a |= 64;
                            ddheVar5.f = i4;
                            break;
                        case 100000003:
                            dsqv<csgz, csjj> dsqvVar3 = csjz.b;
                            csgzVar2.f(dsqvVar3);
                            Object l3 = csgzVar2.V.l(dsqvVar3.d);
                            if (l3 == null) {
                                b5 = dsqvVar3.b;
                            } else {
                                b5 = dsqvVar3.b(l3);
                            }
                            int i5 = ((csjj) b5).a;
                            if (ddhdVar.c) {
                                ddhdVar.bF();
                                ddhdVar.c = false;
                            }
                            ddhe ddheVar6 = (ddhe) ddhdVar.b;
                            ddheVar6.a |= 128;
                            ddheVar6.g = i5;
                            break;
                    }
                }
                if (!list2.isEmpty()) {
                    ddbv ddbvVar = (ddbv) ddbw.a.bZ();
                    for (dehn dehnVar2 : list2) {
                        ((csiv) deha.r(dehnVar2)).a(ddbvVar);
                    }
                    if (ddhdVar.c) {
                        ddhdVar.bF();
                        ddhdVar.c = false;
                    }
                    ddhe ddheVar7 = (ddhe) ddhdVar.b;
                    ddbw ddbwVar = (ddbw) ddbvVar.bK();
                    ddbwVar.getClass();
                    ddheVar7.i = ddbwVar;
                    ddheVar7.a |= 16384;
                }
                if (!list3.isEmpty()) {
                    for (dehn dehnVar3 : list3) {
                        ((csiv) deha.r(dehnVar3)).a(ddhdVar);
                    }
                }
                ddhh[] ddhhVarArr = (ddhh[]) deha.r(dehnVar);
                if (ddhhVarArr != null) {
                    for (ddhh ddhhVar : ddhhVarArr) {
                        if (ddhdVar.c) {
                            ddhdVar.bF();
                            ddhdVar.c = false;
                        }
                        ddhe ddheVar8 = (ddhe) ddhdVar.b;
                        ddhk ddhkVar = (ddhk) ddhhVar.bK();
                        ddhkVar.getClass();
                        dsrj<ddhk> dsrjVar = ddheVar8.h;
                        if (!dsrjVar.a()) {
                            ddheVar8.h = dsqw.cl(dsrjVar);
                        }
                        ddheVar8.h.add(ddhkVar);
                    }
                }
                ddhe ddheVar9 = (ddhe) ddhdVar.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddby ddbyVar3 = (ddby) bZ.b;
                ddheVar9.getClass();
                ddbyVar3.e = ddheVar9;
                ddbyVar3.a |= 16;
                return bZ.bK();
            }
        }, dege.a);
        return deha.m(b, b2, d).a(new deff(this, csirVar, a, b, b2, d, csgeVar) { // from class: csjk
            private final csjl a;
            private final csir b;
            private final String c;
            private final dehn d;
            private final dehn e;
            private final dehn f;
            private final csge g;

            {
                this.a = this;
                this.b = csirVar;
                this.c = a;
                this.d = b;
                this.e = b2;
                this.f = d;
                this.g = csgeVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                csjl csjlVar = this.a;
                csir csirVar2 = this.b;
                String str = this.c;
                dehn dehnVar = this.d;
                dehn dehnVar2 = this.e;
                dehn dehnVar3 = this.f;
                csge csgeVar2 = this.g;
                dsrb f = csjlVar.a.c(csirVar2).f();
                csgj csgjVar = csjlVar.b;
                csgh i = csgi.i();
                i.b(str);
                i.c((dssj) deha.r(dehnVar));
                csgf csgfVar = (csgf) i;
                csgfVar.a = (ddby) deha.r(dehnVar2);
                csgfVar.b = f != null ? Integer.valueOf(f.a()) : null;
                csgfVar.e = (int[]) deha.r(dehnVar3);
                i.d(csjlVar.a.e(csirVar2));
                csgfVar.c = Long.valueOf(csfr.b(csirVar2.d) / 1000);
                csgfVar.d = Long.valueOf(csirVar2.d / 1000);
                return csgjVar.a(i.a(), csgeVar2.b);
            }
        }, dege.a);
    }

    @Override // defpackage.csgb
    public final Set<Class<? extends csir>> b() {
        return dcep.B(csir.class);
    }
}

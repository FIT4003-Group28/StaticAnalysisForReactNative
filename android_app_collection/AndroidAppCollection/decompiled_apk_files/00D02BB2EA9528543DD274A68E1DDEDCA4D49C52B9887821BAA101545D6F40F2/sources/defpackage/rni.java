package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: rni  reason: default package */
/* loaded from: classes7.dex */
public final class rni implements rzn {
    public final gga a;
    private final dcdn<ror, rnh> b;
    private final rmr c;

    public rni(gga ggaVar, btvo btvoVar, rmr rmrVar, gfq gfqVar) {
        this.a = ggaVar;
        this.c = rmrVar;
        ArrayList arrayList = new ArrayList(Arrays.asList(e(ror.TRAVEL_MODE, new rnh(this) { // from class: rmt
            private final rni a;

            {
                this.a = this;
            }

            @Override // defpackage.rnh
            public final void a(rzp rzpVar) {
                rni rniVar = this.a;
                rom romVar = new rom();
                romVar.B(rzpVar.i());
                rniVar.a(romVar);
            }
        }), e(ror.SCHEDULE, new rnh(this) { // from class: rmw
            private final rni a;

            {
                this.a = this;
            }

            @Override // defpackage.rnh
            public final void a(rzp rzpVar) {
                rni rniVar = this.a;
                rob robVar = new rob();
                robVar.B(rzpVar.i());
                rniVar.a(robVar);
            }
        }), e(ror.TRANSIT_ROUTE_TO_WORK, new rnh(this) { // from class: rmx
            private final rni a;

            {
                this.a = this;
            }

            @Override // defpackage.rnh
            public final void a(rzp rzpVar) {
                this.a.a(rol.aR(rzpVar, dndr.HOME, dndr.WORK));
            }
        }), e(ror.TRANSIT_ROUTE_TO_HOME, new rnh(this) { // from class: rmy
            private final rni a;

            {
                this.a = this;
            }

            @Override // defpackage.rnh
            public final void a(rzp rzpVar) {
                this.a.a(rol.aR(rzpVar, dndr.WORK, dndr.HOME));
            }
        }), e(ror.RECEIPT, new rng(this, gfqVar)), e(ror.HOME, new rnh(this) { // from class: rmz
            private final rni a;

            {
                this.a = this;
            }

            @Override // defpackage.rnh
            public final void a(rzp rzpVar) {
                this.a.b(dndr.HOME, rzpVar);
            }
        }), e(ror.WORK, new rnh(this) { // from class: rna
            private final rni a;

            {
                this.a = this;
            }

            @Override // defpackage.rnh
            public final void a(rzp rzpVar) {
                this.a.b(dndr.WORK, rzpVar);
            }
        }), e(ror.INFERRED_HOME, new rnh(this) { // from class: rnb
            private final rni a;

            {
                this.a = this;
            }

            @Override // defpackage.rnh
            public final void a(rzp rzpVar) {
                this.a.b(dndr.INFERRED_HOME, rzpVar);
            }
        }), e(ror.INFERRED_WORK, new rnh(this) { // from class: rnc
            private final rni a;

            {
                this.a = this;
            }

            @Override // defpackage.rnh
            public final void a(rzp rzpVar) {
                this.a.b(dndr.INFERRED_WORK, rzpVar);
            }
        })));
        if (sif.b(btvoVar)) {
            arrayList.add(e(ror.MULTIMODAL_ROUTE_TO_WORK, new rnh(this) { // from class: rnd
                private final rni a;

                {
                    this.a = this;
                }

                @Override // defpackage.rnh
                public final void a(rzp rzpVar) {
                    this.a.a(rnx.aR(rzpVar, dndr.HOME, dndr.WORK));
                }
            }));
            arrayList.add(e(ror.MULTIMODAL_ROUTE_TO_HOME, new rnh(this) { // from class: rne
                private final rni a;

                {
                    this.a = this;
                }

                @Override // defpackage.rnh
                public final void a(rzp rzpVar) {
                    this.a.a(rnx.aR(rzpVar, dndr.WORK, dndr.HOME));
                }
            }));
        }
        if (btvoVar.getCommuteSetupParameters().k) {
            arrayList.add(e(ror.TRANSIT_ROUTE_BUILDER_TO_WORK, new rnh(this) { // from class: rmu
                private final rni a;

                {
                    this.a = this;
                }

                @Override // defpackage.rnh
                public final void a(rzp rzpVar) {
                    this.a.a(rnx.aR(rzpVar, dndr.HOME, dndr.WORK));
                }
            }));
            arrayList.add(e(ror.TRANSIT_ROUTE_BUILDER_TO_HOME, new rnh(this) { // from class: rmv
                private final rni a;

                {
                    this.a = this;
                }

                @Override // defpackage.rnh
                public final void a(rzp rzpVar) {
                    this.a.a(rnx.aR(rzpVar, dndr.WORK, dndr.HOME));
                }
            }));
        }
        dcdg p = dcdn.p();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rnf rnfVar = (rnf) arrayList.get(i);
            p.f(rnfVar.a(), rnfVar.b());
        }
        this.b = p.b();
    }

    private static rnf e(ror rorVar, rnh rnhVar) {
        return new rlz(rorVar, rnhVar);
    }

    public final void a(ges gesVar) {
        gga ggaVar = this.a;
        if (ggaVar.aZ) {
            ggaVar.D(gesVar);
        }
    }

    public final void b(final dndr dndrVar, final rzp rzpVar) {
        final rmr rmrVar = this.c;
        rmrVar.c.c(new sib(rmrVar, dndrVar, rzpVar) { // from class: rmo
            private final rmr a;
            private final dndr b;
            private final rzp c;

            {
                this.a = rmrVar;
                this.b = dndrVar;
                this.c = rzpVar;
            }

            @Override // defpackage.sib
            public final void a(qjn qjnVar) {
                dndr dndrVar2;
                rmr rmrVar2 = this.a;
                dndr dndrVar3 = this.b;
                rzp rzpVar2 = this.c;
                dbsk.a(dndrVar3 == dndr.HOME || dndrVar3 == dndr.WORK || dndrVar3 == dndr.INFERRED_HOME || dndrVar3 == dndr.INFERRED_WORK);
                rmq rmqVar = new rmq(rzpVar2);
                int ordinal = dndrVar3.ordinal();
                if (ordinal == 1 || ordinal == 2) {
                    dndrVar2 = dndrVar3;
                } else if (ordinal == 5) {
                    dndrVar2 = dndr.HOME;
                } else if (ordinal != 6) {
                    String valueOf = String.valueOf(dndrVar3);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("Unexpected alias type: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                } else {
                    dndrVar2 = dndr.WORK;
                }
                boolean z = dndrVar3 == dndr.INFERRED_HOME || dndrVar3 == dndr.INFERRED_WORK;
                dndr dndrVar4 = dndr.HOME;
                dndr dndrVar5 = dndrVar2 == dndrVar4 ? dndr.WORK : dndr.HOME;
                String string = dndrVar2 == dndrVar4 ? rmrVar2.a.getString(R.string.SET_HOME_LOCATION_PAGE_TITLE) : rmrVar2.a.getString(R.string.SET_WORK_LOCATION_PAGE_TITLE);
                int i = dndrVar2 == dndrVar4 ? 2131232034 : 2131232038;
                int i2 = dndrVar2 == dndrVar4 ? R.drawable.pin_work_gray : R.drawable.pin_home_gray;
                akqq a = rmr.a(qjnVar, dndrVar3);
                akqq a2 = rmr.a(qjnVar, dndrVar5);
                dcdc<anec> f = a2 != null ? dcdc.f(new andz(i2, a2)) : dcdc.e();
                if (a == null && a2 != null) {
                    rzm rzmVar = (rzm) rzpVar2;
                    if (rzmVar.a.contains(ror.HOME) || rzmVar.a.contains(ror.WORK)) {
                        a = a2.w(new akqq(0.001d, -0.001d));
                    }
                }
                rri rriVar = new rri();
                ddho ddhoVar = dndrVar2 == dndrVar4 ? dtxl.cq : dtxl.dT;
                ddho ddhoVar2 = dndrVar2 == dndrVar4 ? dtxl.co : dtxl.dR;
                ddho ddhoVar3 = dndrVar2 == dndrVar4 ? dtxl.cp : dtxl.dS;
                aneb z2 = anee.z();
                z2.r(string);
                z2.s(rriVar);
                andx andxVar = (andx) z2;
                andxVar.c = a;
                z2.b(true);
                z2.k(i);
                z2.i(f);
                z2.g(ddhoVar);
                z2.c(ddhoVar2);
                z2.e(ddhoVar3);
                z2.m();
                if (!((rzm) rzpVar2).c.isEmpty()) {
                    andxVar.b = rmrVar2.a.getString(R.string.COMMUTE_FOOTER_NEXT_BUTTON);
                }
                if (rmrVar2.d.a(dndrVar2).i) {
                    z2.o(true);
                    andxVar.d = rmrVar2.e.a(dndrVar2, batf.DROPPED_PIN_CALLOUT);
                    z2.n(true);
                }
                if (z) {
                    z2.f(false);
                } else {
                    boolean z3 = a != null;
                    if (rmrVar2.d.a(dndrVar2).g) {
                        z2.l(z3);
                        z2.f(true);
                        andxVar.e = rmrVar2.e.a(dndrVar2, batf.NO_MOVE_SAVE_WARNING);
                    }
                }
                axwv n = axww.n();
                n.b(dndrVar2);
                axvv axvvVar = (axvv) n;
                axvvVar.a = ddhoVar;
                axvvVar.b = null;
                axvvVar.e = null;
                axvvVar.d = rmqVar;
                n.e(false);
                axvvVar.f = z2.a();
                if (z) {
                    n.d(true);
                } else {
                    azva a3 = dndrVar2 == dndrVar4 ? qjnVar.a() : qjnVar.b();
                    if (a3 != null) {
                        n.c(a3.d);
                        n.d(!akqi.d(a3.c));
                    }
                }
                rmrVar2.b.a().N(n.h());
            }
        });
    }

    @Override // defpackage.rzn
    public final void c(rzp rzpVar) {
        rnh rnhVar = this.b.get(((rzm) rzpVar).b);
        dbsk.s(rnhVar);
        rnhVar.a(rzpVar);
    }

    @Override // defpackage.rzn
    public final void d(dpol dpolVar, boolean z, dngu dnguVar, dngu dnguVar2) {
        if (this.a.K() instanceof rlp) {
            rlp rlpVar = (rlp) this.a.K();
            dbsk.s(rlpVar);
            Bundle bundle = new Bundle();
            bvrs.k(bundle, "toWorkTime", dnguVar);
            bvrs.k(bundle, "leaveWorkTime", dnguVar2);
            bundle.putInt("dayOfWeek", dpolVar.i);
            bundle.putBoolean("applyAllSelectedDays", z);
            rlt rltVar = new rlt();
            rltVar.B(bundle);
            rlpVar.aZ(rltVar);
        }
    }
}

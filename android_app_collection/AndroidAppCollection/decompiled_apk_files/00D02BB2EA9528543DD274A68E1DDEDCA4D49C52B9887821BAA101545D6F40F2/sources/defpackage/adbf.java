package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adbf  reason: default package */
/* loaded from: classes.dex */
public final class adbf extends adae<adbc<?>> {
    public static final /* synthetic */ int b = 0;
    private final awvv<dvhu> c;
    private final dpwr d;
    private final absg e;
    private final dxio<akla> f;
    private final cbqg g;
    private final cbea h;
    private List<dhxz> i;
    private dcdc<cqix<adbc<?>>> j;

    public adbf(final dpwr dpwrVar, absg absgVar, dxio<akla> dxioVar, final acyr acyrVar, btvo btvoVar, cbqg cbqgVar, cbea cbeaVar) {
        super(dbud.a(new dbty(dpwrVar, acyrVar) { // from class: adbe
            private final dpwr a;
            private final acyr b;

            {
                this.a = dpwrVar;
                this.b = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dpwr dpwrVar2 = this.a;
                acyr acyrVar2 = this.b;
                int i = adbf.b;
                switch (dpwrVar2.ordinal()) {
                    case 1:
                    case 3:
                    case 6:
                        dktp dktpVar = acyrVar2.a().l;
                        if (dktpVar == null) {
                            dktpVar = dktp.e;
                        }
                        int a = dkto.a(dktpVar.b);
                        if (a != 0 && a != 1) {
                            dktp dktpVar2 = acyrVar2.a().l;
                            return dktpVar2 == null ? dktp.e : dktpVar2;
                        }
                        break;
                    case 2:
                    case 4:
                    case 5:
                    case 7:
                        dktp dktpVar3 = acyrVar2.a().m;
                        if (dktpVar3 == null) {
                            dktpVar3 = dktp.e;
                        }
                        int a2 = dkto.a(dktpVar3.b);
                        if (a2 != 0 && a2 != 1) {
                            dktp dktpVar4 = acyrVar2.a().m;
                            return dktpVar4 == null ? dktp.e : dktpVar4;
                        }
                        break;
                }
                dktm bZ = dktp.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dktp dktpVar5 = (dktp) bZ.b;
                dktpVar5.b = 3;
                int i2 = dktpVar5.a | 1;
                dktpVar5.a = i2;
                dktpVar5.a = i2 | 2;
                dktpVar5.c = false;
                dktp dktpVar6 = (dktp) bZ.b;
                dktpVar6.a |= 4;
                dktpVar6.d = true;
                return bZ.bK();
            }
        }));
        awvv<dvhu> awvvVar;
        if (!btvoVar.getEnableFeatureParameters().aP) {
            awvvVar = awvv.f;
        } else {
            switch (dpwrVar.ordinal()) {
                case 1:
                    awvvVar = awvv.u;
                    break;
                case 2:
                case 4:
                    awvvVar = awvv.t;
                    break;
                case 3:
                case 5:
                    awvvVar = awvv.v;
                    break;
                case 6:
                case 7:
                    awvvVar = awvv.w;
                    break;
                default:
                    String valueOf = String.valueOf(dpwrVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb.append("Unsupported card placement: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
        this.c = awvvVar;
        this.d = dpwrVar;
        this.e = absgVar;
        this.f = dxioVar;
        this.i = dcdc.e();
        this.j = dcdc.e();
        this.g = cbqgVar;
        this.h = cbeaVar;
    }

    private static <T extends aklb> cqix<adbc<T>> q(cqix<T> cqixVar) {
        return cqgr.fT(new adbk(cqixVar.a()), new adbd(cqixVar.b()));
    }

    private final void r(awwb awwbVar) {
        dbsg a = awwbVar.a(this.c);
        if (!a.a()) {
            return;
        }
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        boolean z = false;
        for (dhxw dhxwVar : ((dvhu) a.b()).b) {
            dpwr dpwrVar = this.d;
            dpwr b2 = dpwr.b(dhxwVar.b);
            if (b2 == null) {
                b2 = dpwr.UNKNOWN_MAJOR_EVENT_CARD_PLACEMENT;
            }
            if (dpwrVar.equals(b2)) {
                F2.i(dhxwVar.c);
                for (cqix<? extends aklb> cqixVar : this.f.a().b(dhxwVar, dbpy.a, this.e)) {
                    F.g(q(cqixVar));
                    z = true;
                }
            }
        }
        if (z) {
            cbqg cbqgVar = this.g;
            if (cbqgVar.a.getEventsUgcParameters().j && cbqgVar.a() && this.d.equals(dpwr.HOMESCREEN_EXPLORE)) {
                F.g(q(cqgr.fT(new cbpp(), this.h.a(this.e == absg.AREA_EXPLORE ? dtxj.bX : dtxr.M, this.e == absg.AREA_EXPLORE ? dtxj.bY : dtxr.N))));
            }
        }
        dcdc f = F2.f();
        if (this.i.equals(f)) {
            return;
        }
        this.i = f;
        this.j = F.f();
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean e() {
        return this.d == dpwr.HOMESCREEN_EXPLORE_HERO;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.i = dcdc.e();
        this.j = dcdc.e();
        r(awwbVar);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (awwbVar.c(this.c).a()) {
            r(awwbVar);
        }
    }

    @Override // defpackage.adae
    public final List<cqix<adbc<?>>> k(List<cqix<?>> list) {
        return this.j;
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(this.c);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

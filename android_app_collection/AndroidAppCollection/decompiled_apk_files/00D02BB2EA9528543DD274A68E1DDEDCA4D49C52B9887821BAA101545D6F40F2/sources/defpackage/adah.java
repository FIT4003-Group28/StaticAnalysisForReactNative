package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adah  reason: default package */
/* loaded from: classes.dex */
public final class adah extends adae<adbc<?>> {
    public static final /* synthetic */ int b = 0;
    private final dpwr c;
    private final dxio<akla> d;
    private final absg e;
    private List<dhxz> f;
    private dcdc<cqix<adbc<?>>> g;

    public adah(dpwr dpwrVar, absg absgVar, dxio<akla> dxioVar, final acyr acyrVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adag
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adah.b;
                dktp dktpVar = acyrVar2.a().o;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = dpwrVar;
        this.e = absgVar;
        this.d = dxioVar;
        this.f = dcdc.e();
        this.g = dcdc.e();
    }

    private final void q(awwb awwbVar) {
        dvhu dvhuVar = (dvhu) awwbVar.a(awvv.r).f();
        if (dvhuVar == null) {
            return;
        }
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        for (dhxw dhxwVar : dvhuVar.b) {
            dpwr dpwrVar = this.c;
            dpwr b2 = dpwr.b(dhxwVar.b);
            if (b2 == null) {
                b2 = dpwr.UNKNOWN_MAJOR_EVENT_CARD_PLACEMENT;
            }
            if (dpwrVar.equals(b2)) {
                F2.i(dhxwVar.c);
                for (cqix<? extends aklb> cqixVar : this.d.a().b(dhxwVar, dbpy.a, this.e)) {
                    F.g(cqgr.fT(new adbk(cqixVar.a()), new adbd(cqixVar.b())));
                }
            }
        }
        dcdc f = F2.f();
        if (this.f.equals(f)) {
            return;
        }
        this.f = f;
        this.g = F.f();
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.f = dcdc.e();
        this.g = dcdc.e();
        q(awwbVar);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (awwbVar.c(awvv.r).a()) {
            q(awwbVar);
        }
    }

    @Override // defpackage.adae
    public final List<cqix<adbc<?>>> k(List<cqix<?>> list) {
        return this.g;
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.r);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adoi  reason: default package */
/* loaded from: classes2.dex */
public final class adoi extends adae<advt> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final dxio<adye> d;

    public adoi(abfa abfaVar, final acyr acyrVar, final adyf adyfVar, final absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adog
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adoi.b;
                dktp dktpVar = acyrVar2.a().K;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        this.d = btsp.b(new dbty(adyfVar, absgVar) { // from class: adoh
            private final adyf a;
            private final absg b;

            {
                this.a = adyfVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adyf adyfVar2 = this.a;
                absg absgVar2 = this.b;
                int i = adoi.b;
                gga a = adyfVar2.a.a();
                adyf.a(a, 1);
                huc a2 = adyfVar2.b.a();
                adyf.a(a2, 2);
                adyf.a(adyfVar2.c.a(), 3);
                adxp a3 = adyfVar2.d.a();
                adyf.a(a3, 4);
                bvpe a4 = adyfVar2.e.a();
                adyf.a(a4, 5);
                adyf.a(absgVar2, 6);
                return new adye(a, a2, a3, a4, absgVar2);
            }
        });
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.d.a().g((dvhg) awwbVar.a(awvv.J).f());
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (awwbVar.c(awvv.J).b()) {
            return;
        }
        this.d.a().g((dvhg) awwbVar.a(awvv.J).f());
    }

    @Override // defpackage.adae
    protected final List<cqix<advt>> k(List<cqix<?>> list) {
        if (!this.c.t() || !this.d.a().a().booleanValue()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new advd(), this.d.a()));
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> l() {
        return dcep.B(awvv.J);
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

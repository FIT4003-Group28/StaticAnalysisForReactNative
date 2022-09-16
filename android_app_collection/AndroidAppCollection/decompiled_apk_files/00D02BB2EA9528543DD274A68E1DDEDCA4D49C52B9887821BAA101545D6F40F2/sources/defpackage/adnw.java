package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adnw  reason: default package */
/* loaded from: classes2.dex */
public final class adnw extends adae<advt> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final dxio<adwr> d;

    public adnw(abfa abfaVar, final acyr acyrVar, final adws adwsVar, final absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adnu
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adnw.b;
                dktp dktpVar = acyrVar2.a().G;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        this.d = btsp.b(new dbty(adwsVar, absgVar) { // from class: adnv
            private final adws a;
            private final absg b;

            {
                this.a = adwsVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adws adwsVar2 = this.a;
                absg absgVar2 = this.b;
                int i = adnw.b;
                gga a = adwsVar2.a.a();
                adws.a(a, 1);
                huc a2 = adwsVar2.b.a();
                adws.a(a2, 2);
                adws.a(adwsVar2.c.a(), 3);
                adxh a3 = adwsVar2.d.a();
                adws.a(a3, 4);
                bvpe a4 = adwsVar2.e.a();
                adws.a(a4, 5);
                adws.a(absgVar2, 6);
                return new adwr(a, a2, a3, a4, absgVar2);
            }
        });
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.d.a().f((dvhg) awwbVar.a(awvv.J).f());
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (awwbVar.c(awvv.J).b()) {
            return;
        }
        this.d.a().f((dvhg) awwbVar.a(awvv.J).f());
    }

    @Override // defpackage.adae
    protected final List<cqix<advt>> k(List<cqix<?>> list) {
        if (!this.c.q() || !this.d.a().a().booleanValue()) {
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

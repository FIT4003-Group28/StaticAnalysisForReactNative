package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adns  reason: default package */
/* loaded from: classes2.dex */
public final class adns extends adae<advt> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final dxio<adwo> d;

    public adns(abfa abfaVar, final acyr acyrVar, final adwp adwpVar, final absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adnq
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adns.b;
                dktp dktpVar = acyrVar2.a().L;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        btsp b2 = btsp.b(new dbty(adwpVar, absgVar) { // from class: adnr
            private final adwp a;
            private final absg b;

            {
                this.a = adwpVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adwp adwpVar2 = this.a;
                absg absgVar2 = this.b;
                int i = adns.b;
                gga a = adwpVar2.a.a();
                adwp.a(a, 1);
                huc a2 = adwpVar2.b.a();
                adwp.a(a2, 2);
                adwp.a(adwpVar2.c.a(), 3);
                abfa a3 = adwpVar2.d.a();
                adwp.a(a3, 4);
                adxl a4 = adwpVar2.e.a();
                adwp.a(a4, 5);
                bvpe a5 = adwpVar2.f.a();
                adwp.a(a5, 6);
                adwp.a(absgVar2, 7);
                return new adwo(a, a2, a3, a4, a5, absgVar2);
            }
        });
        this.d = b2;
        if (abfaVar.a.getPassiveAssistParameters().a().N) {
            b2.a();
        }
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
        if (!this.c.u() || !this.d.a().a().booleanValue()) {
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

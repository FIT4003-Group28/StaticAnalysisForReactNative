package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adoa  reason: default package */
/* loaded from: classes2.dex */
public final class adoa extends adae<advt> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final dxio<adxb> d;

    public adoa(abfa abfaVar, final acyr acyrVar, final adxc adxcVar, final absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adny
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adoa.b;
                dktp dktpVar = acyrVar2.a().H;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        this.d = btsp.b(new dbty(adxcVar, absgVar) { // from class: adnz
            private final adxc a;
            private final absg b;

            {
                this.a = adxcVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adxc adxcVar2 = this.a;
                absg absgVar2 = this.b;
                int i = adoa.b;
                gga a = adxcVar2.a.a();
                adxc.a(a, 1);
                huc a2 = adxcVar2.b.a();
                adxc.a(a2, 2);
                adxc.a(adxcVar2.c.a(), 3);
                adxh a3 = adxcVar2.d.a();
                adxc.a(a3, 4);
                bvpe a4 = adxcVar2.e.a();
                adxc.a(a4, 5);
                adxc.a(absgVar2, 6);
                return new adxb(a, a2, a3, a4, absgVar2);
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
        if (!this.c.r() || !this.d.a().a().booleanValue()) {
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

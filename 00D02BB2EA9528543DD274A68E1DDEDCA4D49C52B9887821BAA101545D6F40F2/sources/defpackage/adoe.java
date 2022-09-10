package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adoe  reason: default package */
/* loaded from: classes2.dex */
public final class adoe extends adae<advq> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final dxio<adxq> d;

    public adoe(abfa abfaVar, final acyr acyrVar, final adxr adxrVar, final absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adoc
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adoe.b;
                dktp dktpVar = acyrVar2.a().I;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        this.d = btsp.b(new dbty(adxrVar, absgVar) { // from class: adod
            private final adxr a;
            private final absg b;

            {
                this.a = adxrVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adxr adxrVar2 = this.a;
                absg absgVar2 = this.b;
                int i = adoe.b;
                gga a = adxrVar2.a.a();
                adxr.a(a, 1);
                adxr.a(adxrVar2.b.a(), 2);
                adxf a2 = adxrVar2.c.a();
                adxr.a(a2, 3);
                adxh a3 = adxrVar2.d.a();
                adxr.a(a3, 4);
                adxr.a(absgVar2, 5);
                return new adxq(a, a2, a3, absgVar2);
            }
        });
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.d.a().k((dvhg) awwbVar.a(awvv.J).f());
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (awwbVar.c(awvv.J).b()) {
            return;
        }
        this.d.a().k((dvhg) awwbVar.a(awvv.J).f());
    }

    @Override // defpackage.adae
    protected final List<cqix<advq>> k(List<cqix<?>> list) {
        if (!this.c.s() || !this.d.a().a().booleanValue()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adry(), this.d.a()));
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

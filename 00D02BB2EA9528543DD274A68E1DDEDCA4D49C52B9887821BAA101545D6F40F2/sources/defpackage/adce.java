package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adce  reason: default package */
/* loaded from: classes.dex */
public final class adce extends adae<adcg> {
    public static final /* synthetic */ int b = 0;
    private final dxio<adch> c;

    public adce(final acyr acyrVar, final adci adciVar, final absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adcc
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adce.b;
                dktp dktpVar = acyrVar2.a().p;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = btsp.b(new dbty(adciVar, absgVar) { // from class: adcd
            private final adci a;
            private final absg b;

            {
                this.a = adciVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adci adciVar2 = this.a;
                absg absgVar2 = this.b;
                int i = adce.b;
                absx a = adciVar2.a.a();
                adci.a(a, 1);
                acwt a2 = adciVar2.b.a();
                adci.a(a2, 2);
                adci.a(absgVar2, 3);
                return new adch(a, a2, absgVar2);
            }
        });
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.c.a().b((dviz) awwbVar.a(awvv.q).f());
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        dviz dvizVar = (dviz) awwbVar.a(awvv.q).f();
        if (dvizVar != null || !awwbVar.c(awvv.q).b()) {
            this.c.a().b(dvizVar);
        }
    }

    @Override // defpackage.adae
    public final List<cqix<adcg>> k(List<cqix<?>> list) {
        if (this.c.a().c()) {
            return dcdc.f(cqgr.fT(new adgk(), this.c.a()));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.q);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

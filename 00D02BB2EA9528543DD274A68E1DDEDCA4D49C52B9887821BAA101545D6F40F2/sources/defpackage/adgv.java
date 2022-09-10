package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adgv  reason: default package */
/* loaded from: classes.dex */
public final class adgv extends adae<adhd> {
    public static final /* synthetic */ int b = 0;
    private final dxio<adhe> c;

    public adgv(final acyr acyrVar, final adhf adhfVar, final abse abseVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adgt
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adgv.b;
                dktp dktpVar = acyrVar2.a().r;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = btsp.b(new dbty(adhfVar, abseVar) { // from class: adgu
            private final adhf a;
            private final abse b;

            {
                this.a = adhfVar;
                this.b = abseVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adhf adhfVar2 = this.a;
                abse abseVar2 = this.b;
                int i = adgv.b;
                adhf.a(adhfVar2.a.a(), 1);
                abud a = adhfVar2.b.a();
                adhf.a(a, 2);
                acwt a2 = adhfVar2.c.a();
                adhf.a(a2, 3);
                abfc a3 = adhfVar2.d.a();
                adhf.a(a3, 4);
                adhf.a(abseVar2, 5);
                return new adhe(a, a2, a3, abseVar2);
            }
        });
    }

    private final void q(awwb awwbVar, boolean z) {
        dviz dvizVar = (dviz) awwbVar.a(awvv.d).f();
        if (z || dvizVar != null || !awwbVar.c(awvv.d).b()) {
            this.c.a().h(dvizVar);
        }
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean e() {
        return true;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.c.a().g(awwbVar);
        q(awwbVar, true);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        this.c.a().g(awwbVar);
        q(awwbVar, false);
    }

    @Override // defpackage.adae
    protected final List<cqix<adhd>> k(List<cqix<?>> list) {
        if (this.c.a().f()) {
            return dcdc.f(cqgr.fT(new adhc(), this.c.a()));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> l() {
        return dcmr.a;
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> m() {
        return dcep.B(awvv.d);
    }
}

package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adkf  reason: default package */
/* loaded from: classes.dex */
public final class adkf extends adae<adkk> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final absg d;
    private final adkl e;

    public adkf(abfa abfaVar, final acyr acyrVar, adkm adkmVar, absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adke
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adkf.b;
                dktp dktpVar = acyrVar2.a().w;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        this.d = absgVar;
        abwh a = adkmVar.a.a();
        adkm.a(a, 1);
        acwt a2 = adkmVar.b.a();
        adkm.a(a2, 2);
        adkm.a(absgVar, 3);
        this.e = new adkl(a, a2, absgVar);
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean e() {
        return this.c.v() && this.d == absg.HOME_SCREEN_EXPLORE_TAB;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.e.b((dviz) awwbVar.a(awvv.x).f());
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (((dviz) awwbVar.a(awvv.x).f()) != null || !awwbVar.c(awvv.x).b()) {
            i(awwbVar);
        }
    }

    @Override // defpackage.adae
    public final List<cqix<adkk>> k(List<cqix<?>> list) {
        if (!this.e.c()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adkj(), this.e));
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.x);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

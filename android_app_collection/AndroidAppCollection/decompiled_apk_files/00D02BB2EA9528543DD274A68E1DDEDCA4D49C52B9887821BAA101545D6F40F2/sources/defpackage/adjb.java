package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adjb  reason: default package */
/* loaded from: classes.dex */
public final class adjb extends adae<adjg> {
    public static final /* synthetic */ int b = 0;
    private final adjh c;

    public adjb(final acyr acyrVar, adji adjiVar, absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adja
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adjb.b;
                dktp dktpVar = acyrVar2.a().B;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        abva a = adjiVar.a.a();
        adji.a(a, 1);
        acwt a2 = adjiVar.b.a();
        adji.a(a2, 2);
        adji.a(absgVar, 3);
        this.c = new adjh(a, a2, absgVar);
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.c.b((dvhw) awwbVar.a(awvv.B).f());
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (!awwbVar.c(awvv.B).b() || awwbVar.a(awvv.B).a()) {
            i(awwbVar);
        }
    }

    @Override // defpackage.adae
    public final List<cqix<adjg>> k(List<cqix<?>> list) {
        if (!this.c.c()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adjf(), this.c));
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.B);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

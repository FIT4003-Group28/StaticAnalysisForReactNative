package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adis  reason: default package */
/* loaded from: classes2.dex */
public final class adis extends adae<adix> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final adiy d;
    @dzsi
    private final btlu e;

    public adis(abfa abfaVar, final acyr acyrVar, adiz adizVar, akfa akfaVar, abse abseVar, ilo iloVar) {
        super(o(dbud.a(new dbty(acyrVar) { // from class: adir
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adis.b;
                dktp dktpVar = acyrVar2.a().F;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        abum a = adizVar.a.a();
        adiz.a(a, 1);
        acwt a2 = adizVar.b.a();
        adiz.a(a2, 2);
        adiz.a(abseVar, 3);
        adiz.a(iloVar, 4);
        this.d = new adiy(a, a2, abseVar, iloVar);
        this.e = akfaVar.j();
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        if (!this.c.n()) {
            return;
        }
        this.d.b((dvhw) awwbVar.a(awvv.F).f());
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (!this.c.n()) {
            return;
        }
        dvhw dvhwVar = (dvhw) awwbVar.a(awvv.F).f();
        if (dvhwVar == null && awwbVar.c(awvv.F).b()) {
            return;
        }
        this.d.b(dvhwVar);
    }

    @Override // defpackage.adae
    public final List<cqix<adix>> k(List<cqix<?>> list) {
        btlu btluVar;
        if (!this.c.n() || !this.d.c() || (btluVar = this.e) == null || !btluVar.u()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adiw(), this.d));
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.F);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

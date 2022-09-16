package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adka  reason: default package */
/* loaded from: classes.dex */
public final class adka extends adae<adjw> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final adjx d;

    public adka(abfa abfaVar, final acyr acyrVar, adjy adjyVar) {
        super(o(dbud.a(new dbty(acyrVar) { // from class: adjz
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adka.b;
                dktp dktpVar = acyrVar2.a().A;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        this.d = adjyVar.a(dbpy.a, absg.HOME_SCREEN_EXPLORE_TAB);
    }

    private final void q(awwb awwbVar) {
        if (this.c.i() && awwbVar.a(awvv.A).a()) {
            this.d.b((dvit) awwbVar.a(awvv.A).b());
        }
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        q(awwbVar);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (awwbVar.a(awvv.A).a() || !awwbVar.c(awvv.A).b()) {
            q(awwbVar);
        }
    }

    @Override // defpackage.adae
    public final List<cqix<adjw>> k(List<cqix<?>> list) {
        if (!this.c.i() || !this.d.c().booleanValue()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adjv(), this.d));
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.A);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

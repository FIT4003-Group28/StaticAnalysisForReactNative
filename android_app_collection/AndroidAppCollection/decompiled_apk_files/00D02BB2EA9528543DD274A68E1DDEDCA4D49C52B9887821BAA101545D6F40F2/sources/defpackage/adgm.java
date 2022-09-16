package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adgm  reason: default package */
/* loaded from: classes.dex */
public final class adgm extends adae<adgq> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final adgr d;

    public adgm(abfa abfaVar, final acyr acyrVar, adgs adgsVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adgl
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adgm.b;
                dktp dktpVar = acyrVar2.a().x;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        this.d = adgsVar.a(absg.HOME_SCREEN_EXPLORE_TAB);
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean e() {
        return this.c.v();
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.d.b((dvhw) awwbVar.a(awvv.y).f());
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (((dvhw) awwbVar.a(awvv.y).f()) != null || !awwbVar.c(awvv.y).b()) {
            i(awwbVar);
        }
    }

    @Override // defpackage.adae
    public final List<cqix<adgq>> k(List<cqix<?>> list) {
        if (!this.d.c()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adgp(), this.d));
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.y);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

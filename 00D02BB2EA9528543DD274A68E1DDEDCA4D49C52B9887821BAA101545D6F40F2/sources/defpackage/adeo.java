package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adeo  reason: default package */
/* loaded from: classes2.dex */
public final class adeo extends adae<adep> {
    public static final /* synthetic */ int b = 0;
    private final ader c;

    public adeo(final acyr acyrVar, ader aderVar) {
        super(o(dbud.a(new dbty(acyrVar) { // from class: aden
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adeo.b;
                dktp dktpVar = acyrVar2.a().T;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = aderVar;
    }

    private final void q(awwb awwbVar) {
        dbsg a = awwbVar.a(awvv.M);
        if (!a.a() || ((dqsb) a.b()).c.size() <= 0) {
            this.c.g(dbpy.a);
        } else {
            this.c.g(dbsg.i(((dqsb) a.b()).c.get(0)));
        }
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean b() {
        return false;
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean e() {
        return true;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        q(awwbVar);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        q(awwbVar);
    }

    @Override // defpackage.adae
    public final List<cqix<adep>> k(List<cqix<?>> list) {
        if (this.c.a().booleanValue()) {
            return dcdc.f(cqgr.fT(new adem(), this.c));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.M);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

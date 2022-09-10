package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adkc  reason: default package */
/* loaded from: classes2.dex */
public final class adkc extends adae<adjw> {
    public static final /* synthetic */ int b = 0;
    private final adjx c;

    public adkc(final acyr acyrVar, adjy adjyVar, ilo iloVar) {
        super(o(dbud.a(new dbty(acyrVar) { // from class: adkb
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adkc.b;
                dktp dktpVar = acyrVar2.a().z;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = adjyVar.a(dbsg.i(iloVar), absg.AREA_EXPLORE);
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
    }

    @Override // defpackage.adae
    public final List<cqix<adjw>> k(List<cqix<?>> list) {
        if (this.c.c().booleanValue()) {
            return dcdc.f(cqgr.fT(new adjv(), this.c));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcmr.a;
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}

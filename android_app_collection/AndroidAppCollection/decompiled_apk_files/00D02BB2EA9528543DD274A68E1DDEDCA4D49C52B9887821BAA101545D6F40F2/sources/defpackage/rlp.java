package defpackage;

import android.app.Application;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: rlp  reason: default package */
/* loaded from: classes7.dex */
public final class rlp extends rmf<sab> implements gfw {
    public sbo a;
    private sab ae;

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (!(obj instanceof rls)) {
            return;
        }
        rls rlsVar = (rls) obj;
        this.ae.c(rlsVar.a(), Boolean.valueOf(rlsVar.b()), rlsVar.c(), rlsVar.d());
    }

    @Override // defpackage.rmf
    protected final cqiw<sab> g() {
        return new rpw();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rmf
    public final egu i(egj egjVar) {
        egjVar.ag(w());
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.ak(jkc.q, jkc.q);
        return egjVar.a();
    }

    @Override // defpackage.rmf
    protected final /* bridge */ /* synthetic */ sab q(rzp rzpVar) {
        Bundle bundle = this.o;
        sbo sboVar = this.a;
        boolean z = bundle.getBoolean("hasFlipButton");
        Application a = sboVar.a.a();
        sbo.a(a, 1);
        sfd a2 = sboVar.b.a();
        sbo.a(a2, 2);
        qjk a3 = sboVar.c.a();
        sbo.a(a3, 3);
        cqhn a4 = sboVar.d.a();
        sbo.a(a4, 4);
        sbm a5 = sboVar.e.a();
        sbo.a(a5, 5);
        sev a6 = sboVar.f.a();
        sbo.a(a6, 6);
        sei a7 = sboVar.g.a();
        sbo.a(a7, 7);
        dehq a8 = sboVar.h.a();
        sbo.a(a8, 8);
        cpv a9 = sboVar.i.a();
        sbo.a(a9, 9);
        sbo.a(rzpVar, 12);
        sbn sbnVar = new sbn(a, a2, a3, a4, a5, a6, a7, a8, a9, z, true, rzpVar);
        this.ae = sbnVar;
        return sbnVar;
    }
}

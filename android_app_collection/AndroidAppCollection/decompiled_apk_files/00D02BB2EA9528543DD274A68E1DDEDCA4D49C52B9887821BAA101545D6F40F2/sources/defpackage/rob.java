package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rob  reason: default package */
/* loaded from: classes7.dex */
public final class rob extends rmf<sar> {
    public seq a;
    public sfb ae;

    @Override // defpackage.rmf
    protected final cqiw<sar> g() {
        return new rsu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rmf
    public final egu i(egj egjVar) {
        egjVar.ag(w());
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.ak(jkc.q, jkc.q);
        return egjVar.a();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxl.f12do;
    }

    @Override // defpackage.rmf
    protected final /* bridge */ /* synthetic */ sar q(rzp rzpVar) {
        seq seqVar = this.a;
        Application a = seqVar.a.a();
        seq.a(a, 1);
        cqhn a2 = seqVar.b.a();
        seq.a(a2, 2);
        qjk a3 = seqVar.c.a();
        seq.a(a3, 3);
        sfd a4 = seqVar.d.a();
        seq.a(a4, 4);
        sev a5 = seqVar.e.a();
        seq.a(a5, 5);
        sei a6 = seqVar.f.a();
        seq.a(a6, 6);
        dehq a7 = seqVar.g.a();
        seq.a(a7, 7);
        cpv a8 = seqVar.h.a();
        seq.a(a8, 8);
        seq.a(rzpVar, 9);
        final sep sepVar = new sep(a, a2, a3, a4, a5, a6, a7, a8, rzpVar);
        sfb sfbVar = this.ae;
        Application a9 = sfbVar.a.a();
        sfb.a(a9, 1);
        sey a10 = sfbVar.b.a();
        sfb.a(a10, 2);
        qjk a11 = sfbVar.c.a();
        sfb.a(a11, 3);
        Executor a12 = sfbVar.d.a();
        sfb.a(a12, 4);
        sfb.a(rzpVar, 5);
        sfa sfaVar = new sfa(a9, a10, a11, a12, rzpVar);
        deha.q(sfaVar.c.w(), new sez(sfaVar, new Runnable(sepVar) { // from class: roa
            private final sep a;

            {
                this.a = sepVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.u();
            }
        }), sfaVar.d);
        return sepVar;
    }
}

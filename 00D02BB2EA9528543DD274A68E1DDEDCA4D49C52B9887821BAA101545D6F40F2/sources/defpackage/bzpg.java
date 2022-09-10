package defpackage;

import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.ConsentFlowConfig;
/* compiled from: PG */
/* renamed from: bzpg  reason: default package */
/* loaded from: classes4.dex */
final class bzpg implements cpcl<cpey> {
    @dzsi
    final awnl a;
    final /* synthetic */ bzph b;

    public bzpg(@dzsi bzph bzphVar, awnl awnlVar) {
        this.b = bzphVar;
        this.a = awnlVar;
    }

    private final void b(cpey cpeyVar) {
        int d = this.b.d.a().d(this.a);
        this.a.b(this.b.b, 100, null);
        try {
            ((cpdp) cpeyVar.a).b(this.b.b, d, bzph.a);
        } catch (IntentSender.SendIntentException unused) {
        }
    }

    @Override // defpackage.cpcl
    public final /* bridge */ /* synthetic */ void c(cpey cpeyVar) {
        cpey cpeyVar2 = cpeyVar;
        Status a = ((cpdp) cpeyVar2.a).a();
        if (a.d()) {
            ConsentFlowConfig consentFlowConfig = bzph.a;
            return;
        }
        int i = a.g;
        if (i == 4500) {
            b(cpeyVar2);
            return;
        }
        ConsentFlowConfig consentFlowConfig2 = bzph.a;
        ((ckco) this.b.c.a(ckid.c)).a(bzph.b(i));
    }
}

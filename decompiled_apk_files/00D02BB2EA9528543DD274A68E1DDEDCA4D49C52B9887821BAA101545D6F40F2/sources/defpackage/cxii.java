package defpackage;

import android.content.BroadcastReceiver;
/* compiled from: PG */
/* renamed from: cxii  reason: default package */
/* loaded from: classes5.dex */
final class cxii implements degu<Void> {
    final /* synthetic */ long a;
    final /* synthetic */ BroadcastReceiver.PendingResult b;
    final /* synthetic */ cxij c;

    public cxii(cxij cxijVar, long j, BroadcastReceiver.PendingResult pendingResult) {
        this.c = cxijVar;
        this.a = j;
        this.b = pendingResult;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cxij cxijVar = this.c;
        cxijVar.a.b(3009, cxijVar.b.e() - this.a, null);
        this.b.finish();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r10) {
        cxij cxijVar = this.c;
        cxijVar.a.c(3009, true, cxijVar.b.e() - this.a, null, null, null, null);
        this.b.finish();
    }
}

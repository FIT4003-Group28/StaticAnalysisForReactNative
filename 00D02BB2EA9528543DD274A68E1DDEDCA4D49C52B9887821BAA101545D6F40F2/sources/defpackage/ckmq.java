package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: ckmq  reason: default package */
/* loaded from: classes4.dex */
final class ckmq implements Runnable {
    final /* synthetic */ cqat a;
    final /* synthetic */ cwsv b;
    final /* synthetic */ ckms c;
    final /* synthetic */ ckmm d;
    final /* synthetic */ ckmt e;

    public ckmq(ckmt ckmtVar, cqat cqatVar, cwsv cwsvVar, ckms ckmsVar, ckmm ckmmVar) {
        this.e = ckmtVar;
        this.a = cqatVar;
        this.b = cwsvVar;
        this.c = ckmsVar;
        this.d = ckmmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long e = this.a.e();
        ckmt ckmtVar = this.e;
        if (e - ckmtVar.h >= 100) {
            dbsg<cwsv> a = ckmt.a(this.b, ckmtVar.g, this.c);
            if (!a.a() || !this.e.f) {
                return;
            }
            this.d.t(a.b());
            this.e.f = false;
            return;
        }
        Handler handler = ckmtVar.c;
        Runnable runnable = ckmtVar.d;
        dbsk.s(runnable);
        handler.postDelayed(runnable, 100L);
    }
}

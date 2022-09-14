package defpackage;
/* compiled from: PG */
/* renamed from: degj  reason: default package */
/* loaded from: classes6.dex */
final class degj implements Runnable {
    final /* synthetic */ deiv a;
    final /* synthetic */ deig b;
    final /* synthetic */ dehn c;
    final /* synthetic */ dehn d;
    final /* synthetic */ degl e;

    public degj(deiv deivVar, deig deigVar, dehn dehnVar, dehn dehnVar2, degl deglVar) {
        this.a = deivVar;
        this.b = deigVar;
        this.c = dehnVar;
        this.d = dehnVar2;
        this.e = deglVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isDone()) {
            this.b.p(this.c);
        } else if (!this.d.isCancelled() || !this.e.compareAndSet(degk.NOT_RUN, degk.CANCELLED)) {
        } else {
            this.a.cancel(false);
        }
    }
}

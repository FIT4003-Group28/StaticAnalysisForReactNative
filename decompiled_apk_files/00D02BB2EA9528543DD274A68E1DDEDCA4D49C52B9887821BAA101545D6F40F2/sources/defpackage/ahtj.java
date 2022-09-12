package defpackage;
/* compiled from: PG */
/* renamed from: ahtj  reason: default package */
/* loaded from: classes.dex */
final class ahtj implements Runnable {
    final /* synthetic */ ahtn a;

    public ahtj(ahtn ahtnVar) {
        this.a = ahtnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.d.compareAndSet(ahtm.SUBSCRIBED, ahtm.FINISHED)) {
            return;
        }
        this.a.e();
        this.a.b.c();
    }
}

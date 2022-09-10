package defpackage;
/* compiled from: PG */
/* renamed from: ahtk  reason: default package */
/* loaded from: classes.dex */
final class ahtk implements Runnable {
    final /* synthetic */ ahtn a;

    public ahtk(ahtn ahtnVar) {
        this.a = ahtnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.e.getAndSet(true)) {
            this.a.c.l();
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bkx  reason: default package */
/* loaded from: classes2.dex */
final class bkx implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bky b;

    public bkx(bky bkyVar, Runnable runnable) {
        this.b = bkyVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.b.a();
        }
    }
}

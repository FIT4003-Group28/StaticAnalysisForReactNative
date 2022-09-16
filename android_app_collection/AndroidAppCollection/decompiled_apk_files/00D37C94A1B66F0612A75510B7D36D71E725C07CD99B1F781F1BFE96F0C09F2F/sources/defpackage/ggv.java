package defpackage;
/* compiled from: PG */
/* renamed from: ggv  reason: default package */
/* loaded from: classes3.dex */
final class ggv implements Runnable {
    final /* synthetic */ ggw a;

    public ggv(ggw ggwVar) {
        this.a = ggwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            Runnable runnable = this.a.a;
            if (runnable != null) {
                runnable.run();
                this.a.a = null;
            }
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: acfv  reason: default package */
/* loaded from: classes2.dex */
final class acfv implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ acgb b;

    public acfv(acgb acgbVar, Runnable runnable) {
        this.b = acgbVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b.g.b()) {
            return;
        }
        this.a.run();
    }
}

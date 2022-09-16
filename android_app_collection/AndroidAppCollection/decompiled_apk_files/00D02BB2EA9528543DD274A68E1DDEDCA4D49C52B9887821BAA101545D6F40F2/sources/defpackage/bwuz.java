package defpackage;
/* compiled from: PG */
/* renamed from: bwuz  reason: default package */
/* loaded from: classes4.dex */
final class bwuz implements Runnable {
    final /* synthetic */ Runnable a;

    public bwuz(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}

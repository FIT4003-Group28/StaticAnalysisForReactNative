package defpackage;
/* compiled from: PG */
/* renamed from: bvpk  reason: default package */
/* loaded from: classes.dex */
public final class bvpk implements Runnable {
    @dzsi
    private volatile Runnable a;

    private bvpk(Runnable runnable) {
        dbsk.s(runnable);
        this.a = runnable;
    }

    public static bvpk a(Runnable runnable) {
        return new bvpk(runnable);
    }

    public final void b() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}

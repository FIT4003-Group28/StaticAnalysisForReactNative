package defpackage;
/* compiled from: PG */
/* renamed from: aybv  reason: default package */
/* loaded from: classes2.dex */
public final class aybv implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public aybv(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b) {
            this.c = true;
            this.a.run();
        }
    }
}

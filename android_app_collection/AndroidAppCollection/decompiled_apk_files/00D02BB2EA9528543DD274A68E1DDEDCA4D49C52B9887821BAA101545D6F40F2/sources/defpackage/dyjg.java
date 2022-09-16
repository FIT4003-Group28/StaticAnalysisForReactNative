package defpackage;
/* compiled from: PG */
/* renamed from: dyjg  reason: default package */
/* loaded from: classes6.dex */
public final class dyjg implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public dyjg(Runnable runnable) {
        dbsk.t(runnable, "task");
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

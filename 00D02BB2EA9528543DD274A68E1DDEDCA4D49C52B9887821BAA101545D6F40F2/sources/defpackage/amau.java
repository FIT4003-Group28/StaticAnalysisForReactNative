package defpackage;
/* compiled from: PG */
/* renamed from: amau  reason: default package */
/* loaded from: classes.dex */
public final class amau implements Runnable {
    private final amaw a;
    private final Runnable b;

    public amau(amaw amawVar, Runnable runnable) {
        this.a = amawVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amaw amawVar = this.a;
        dcqe dcqeVar = amaw.a;
        amawVar.b.lock();
        this.b.run();
        this.a.b.unlock();
    }
}

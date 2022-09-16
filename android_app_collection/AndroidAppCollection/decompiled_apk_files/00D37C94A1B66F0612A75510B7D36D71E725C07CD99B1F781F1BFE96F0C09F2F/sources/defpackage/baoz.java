package defpackage;
/* compiled from: PG */
/* renamed from: baoz  reason: default package */
/* loaded from: classes2.dex */
public final class baoz {
    private Thread a = Thread.currentThread();

    public final void a() {
        if (this.a == null) {
            this.a = Thread.currentThread();
        }
        if (Thread.currentThread() == this.a) {
            return;
        }
        throw new IllegalStateException("Wrong thread");
    }

    public final void b() {
        this.a = null;
    }
}

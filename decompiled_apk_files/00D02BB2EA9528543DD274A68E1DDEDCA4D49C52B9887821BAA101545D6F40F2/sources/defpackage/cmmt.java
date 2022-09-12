package defpackage;
/* compiled from: PG */
/* renamed from: cmmt  reason: default package */
/* loaded from: classes5.dex */
public final class cmmt {
    private boolean a;

    public final synchronized boolean a() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized boolean c() {
        return this.a;
    }

    public final synchronized void d() {
        this.a = false;
    }
}

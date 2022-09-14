package defpackage;
/* compiled from: PG */
/* renamed from: cyvd  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyvd<T1, T2> {
    private T1 a;
    private T2 b;
    private boolean c = false;
    private boolean d = false;

    private final void e() {
        if (d()) {
            a(this.a, this.b);
        }
    }

    protected abstract void a(T1 t1, T2 t2);

    public final synchronized void b(T1 t1) {
        if (!this.c) {
            this.a = t1;
            this.c = true;
            e();
        } else {
            throw new IllegalStateException("First result has already been provided.");
        }
    }

    public final synchronized void c(T2 t2) {
        if (!this.d) {
            this.b = t2;
            this.d = true;
            e();
        } else {
            throw new IllegalStateException("Second result has already been provided.");
        }
    }

    public final synchronized boolean d() {
        boolean z;
        if (this.c) {
            if (this.d) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}

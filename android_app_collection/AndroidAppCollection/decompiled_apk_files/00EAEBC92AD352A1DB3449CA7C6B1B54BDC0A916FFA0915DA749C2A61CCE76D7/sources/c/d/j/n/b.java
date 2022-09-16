package c.d.j.n;
/* loaded from: classes.dex */
public abstract class b<T> implements k<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3395a = false;

    public static int a(boolean z) {
        return z ? 1 : 0;
    }

    public static boolean a(int i) {
        return (i & 1) == 1;
    }

    public static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean b(int i) {
        return !a(i);
    }

    public static boolean b(int i, int i2) {
        return (i & i2) == i2;
    }

    public static int c(int i, int i2) {
        return i & (~i2);
    }

    @Override // c.d.j.n.k
    public synchronized void a() {
        if (this.f3395a) {
            return;
        }
        this.f3395a = true;
        try {
            b();
        } catch (Exception e2) {
            a(e2);
        }
    }

    @Override // c.d.j.n.k
    public synchronized void a(float f2) {
        if (this.f3395a) {
            return;
        }
        try {
            b(f2);
        } catch (Exception e2) {
            a(e2);
        }
    }

    protected void a(Exception exc) {
        c.d.d.e.a.c(getClass(), "unhandled exception", exc);
    }

    @Override // c.d.j.n.k
    public synchronized void a(T t, int i) {
        if (this.f3395a) {
            return;
        }
        this.f3395a = a(i);
        try {
            b((b<T>) t, i);
        } catch (Exception e2) {
            a(e2);
        }
    }

    @Override // c.d.j.n.k
    public synchronized void a(Throwable th) {
        if (this.f3395a) {
            return;
        }
        this.f3395a = true;
        try {
            b(th);
        } catch (Exception e2) {
            a(e2);
        }
    }

    protected abstract void b();

    protected abstract void b(float f2);

    protected abstract void b(T t, int i);

    protected abstract void b(Throwable th);
}

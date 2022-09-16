package c.d.j.k;

import java.io.Closeable;
/* loaded from: classes.dex */
public abstract class b implements Closeable, e {
    public g c() {
        return f.f3386d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract int d();

    public boolean e() {
        return false;
    }

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        c.d.d.e.a.c("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public abstract boolean isClosed();
}

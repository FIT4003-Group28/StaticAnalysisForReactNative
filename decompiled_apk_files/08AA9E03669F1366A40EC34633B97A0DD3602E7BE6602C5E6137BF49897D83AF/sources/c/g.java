package c;
/* compiled from: ForwardingSink.java */
/* loaded from: classes.dex */
public abstract class g implements s {
    private final s delegate;

    public g(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = sVar;
    }

    public final s delegate() {
        return this.delegate;
    }

    @Override // c.s
    public void write(c cVar, long j) {
        this.delegate.write(cVar, j);
    }

    @Override // c.s, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // c.s
    public u timeout() {
        return this.delegate.timeout();
    }

    @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}

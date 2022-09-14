package h;
/* loaded from: classes.dex */
public abstract class g implements u {
    private final u delegate;

    public g(u uVar) {
        if (uVar != null) {
            this.delegate = uVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // h.u, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final u delegate() {
        return this.delegate;
    }

    @Override // h.u, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // h.u
    public w timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }

    @Override // h.u
    public void write(c cVar, long j) {
        this.delegate.write(cVar, j);
    }
}

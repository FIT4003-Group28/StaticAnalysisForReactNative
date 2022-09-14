package h;
/* loaded from: classes.dex */
public abstract class h implements v {
    private final v delegate;

    public h(v vVar) {
        if (vVar != null) {
            this.delegate = vVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final v delegate() {
        return this.delegate;
    }

    @Override // h.v
    public long read(c cVar, long j) {
        return this.delegate.read(cVar, j);
    }

    @Override // h.v
    public w timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}

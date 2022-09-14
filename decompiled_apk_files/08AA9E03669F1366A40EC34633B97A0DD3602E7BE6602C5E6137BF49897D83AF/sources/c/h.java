package c;
/* compiled from: ForwardingSource.java */
/* loaded from: classes.dex */
public abstract class h implements t {
    private final t delegate;

    public h(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = tVar;
    }

    public final t delegate() {
        return this.delegate;
    }

    @Override // c.t
    public long read(c cVar, long j) {
        return this.delegate.read(cVar, j);
    }

    @Override // c.t
    public u timeout() {
        return this.delegate.timeout();
    }

    @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}

package c;

import java.io.IOException;
/* compiled from: Pipe.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    final long f1304a;

    /* renamed from: c  reason: collision with root package name */
    boolean f1306c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1307d;

    /* renamed from: b  reason: collision with root package name */
    final c f1305b = new c();
    private final s e = new a();
    private final t f = new b();

    public m(long j) {
        if (j < 1) {
            throw new IllegalArgumentException("maxBufferSize < 1: " + j);
        }
        this.f1304a = j;
    }

    public t a() {
        return this.f;
    }

    public s b() {
        return this.e;
    }

    /* compiled from: Pipe.java */
    /* loaded from: classes.dex */
    final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        final u f1308a = new u();

        a() {
        }

        @Override // c.s
        public void write(c cVar, long j) {
            synchronized (m.this.f1305b) {
                if (m.this.f1306c) {
                    throw new IllegalStateException("closed");
                }
                while (j > 0) {
                    if (m.this.f1307d) {
                        throw new IOException("source is closed");
                    }
                    long a2 = m.this.f1304a - m.this.f1305b.a();
                    if (a2 == 0) {
                        this.f1308a.waitUntilNotified(m.this.f1305b);
                    } else {
                        long min = Math.min(a2, j);
                        m.this.f1305b.write(cVar, min);
                        j -= min;
                        m.this.f1305b.notifyAll();
                    }
                }
            }
        }

        @Override // c.s, java.io.Flushable
        public void flush() {
            synchronized (m.this.f1305b) {
                if (m.this.f1306c) {
                    throw new IllegalStateException("closed");
                }
                if (m.this.f1307d && m.this.f1305b.a() > 0) {
                    throw new IOException("source is closed");
                }
            }
        }

        @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (m.this.f1305b) {
                if (m.this.f1306c) {
                    return;
                }
                if (m.this.f1307d && m.this.f1305b.a() > 0) {
                    throw new IOException("source is closed");
                }
                m.this.f1306c = true;
                m.this.f1305b.notifyAll();
            }
        }

        @Override // c.s
        public u timeout() {
            return this.f1308a;
        }
    }

    /* compiled from: Pipe.java */
    /* loaded from: classes.dex */
    final class b implements t {

        /* renamed from: a  reason: collision with root package name */
        final u f1310a = new u();

        b() {
        }

        @Override // c.t
        public long read(c cVar, long j) {
            synchronized (m.this.f1305b) {
                if (m.this.f1307d) {
                    throw new IllegalStateException("closed");
                }
                while (m.this.f1305b.a() == 0) {
                    if (m.this.f1306c) {
                        return -1L;
                    }
                    this.f1310a.waitUntilNotified(m.this.f1305b);
                }
                long read = m.this.f1305b.read(cVar, j);
                m.this.f1305b.notifyAll();
                return read;
            }
        }

        @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (m.this.f1305b) {
                m.this.f1307d = true;
                m.this.f1305b.notifyAll();
            }
        }

        @Override // c.t
        public u timeout() {
            return this.f1310a;
        }
    }
}

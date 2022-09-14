package h;

import java.io.IOException;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    final long f10167a;

    /* renamed from: c  reason: collision with root package name */
    boolean f10169c;

    /* renamed from: d  reason: collision with root package name */
    boolean f10170d;

    /* renamed from: g  reason: collision with root package name */
    private u f10173g;

    /* renamed from: b  reason: collision with root package name */
    final c f10168b = new c();

    /* renamed from: e  reason: collision with root package name */
    private final u f10171e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final v f10172f = new b();

    /* loaded from: classes.dex */
    final class a implements u {

        /* renamed from: b  reason: collision with root package name */
        final o f10174b = new o();

        a() {
        }

        @Override // h.u, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            u uVar;
            synchronized (n.this.f10168b) {
                if (n.this.f10169c) {
                    return;
                }
                if (n.this.f10173g != null) {
                    uVar = n.this.f10173g;
                } else {
                    if (n.this.f10170d && n.this.f10168b.e() > 0) {
                        throw new IOException("source is closed");
                    }
                    n.this.f10169c = true;
                    n.this.f10168b.notifyAll();
                    uVar = null;
                }
                if (uVar == null) {
                    return;
                }
                this.f10174b.a(uVar.timeout());
                try {
                    uVar.close();
                } finally {
                    this.f10174b.a();
                }
            }
        }

        @Override // h.u, java.io.Flushable
        public void flush() {
            u uVar;
            synchronized (n.this.f10168b) {
                if (n.this.f10169c) {
                    throw new IllegalStateException("closed");
                }
                if (n.this.f10173g != null) {
                    uVar = n.this.f10173g;
                } else {
                    if (n.this.f10170d && n.this.f10168b.e() > 0) {
                        throw new IOException("source is closed");
                    }
                    uVar = null;
                }
            }
            if (uVar != null) {
                this.f10174b.a(uVar.timeout());
                try {
                    uVar.flush();
                } finally {
                    this.f10174b.a();
                }
            }
        }

        @Override // h.u
        public w timeout() {
            return this.f10174b;
        }

        @Override // h.u
        public void write(c cVar, long j) {
            u uVar;
            synchronized (n.this.f10168b) {
                if (n.this.f10169c) {
                    throw new IllegalStateException("closed");
                }
                while (true) {
                    if (j <= 0) {
                        uVar = null;
                        break;
                    } else if (n.this.f10173g != null) {
                        uVar = n.this.f10173g;
                        break;
                    } else if (n.this.f10170d) {
                        throw new IOException("source is closed");
                    } else {
                        long e2 = n.this.f10167a - n.this.f10168b.e();
                        if (e2 == 0) {
                            this.f10174b.waitUntilNotified(n.this.f10168b);
                        } else {
                            long min = Math.min(e2, j);
                            n.this.f10168b.write(cVar, min);
                            j -= min;
                            n.this.f10168b.notifyAll();
                        }
                    }
                }
            }
            if (uVar != null) {
                this.f10174b.a(uVar.timeout());
                try {
                    uVar.write(cVar, j);
                } finally {
                    this.f10174b.a();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    final class b implements v {

        /* renamed from: b  reason: collision with root package name */
        final w f10176b = new w();

        b() {
        }

        @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (n.this.f10168b) {
                n.this.f10170d = true;
                n.this.f10168b.notifyAll();
            }
        }

        @Override // h.v
        public long read(c cVar, long j) {
            synchronized (n.this.f10168b) {
                if (!n.this.f10170d) {
                    while (n.this.f10168b.e() == 0) {
                        if (n.this.f10169c) {
                            return -1L;
                        }
                        this.f10176b.waitUntilNotified(n.this.f10168b);
                    }
                    long read = n.this.f10168b.read(cVar, j);
                    n.this.f10168b.notifyAll();
                    return read;
                }
                throw new IllegalStateException("closed");
            }
        }

        @Override // h.v
        public w timeout() {
            return this.f10176b;
        }
    }

    public n(long j) {
        if (j >= 1) {
            this.f10167a = j;
            return;
        }
        throw new IllegalArgumentException("maxBufferSize < 1: " + j);
    }

    public final u a() {
        return this.f10171e;
    }

    public final v b() {
        return this.f10172f;
    }
}

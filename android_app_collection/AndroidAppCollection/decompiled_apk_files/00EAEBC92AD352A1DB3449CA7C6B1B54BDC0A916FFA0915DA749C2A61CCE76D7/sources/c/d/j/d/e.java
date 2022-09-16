package c.d.j.d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class e {

    /* renamed from: h  reason: collision with root package name */
    private static final Class<?> f3191h = e.class;

    /* renamed from: a  reason: collision with root package name */
    private final c.d.b.b.i f3192a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.d.g.h f3193b;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.d.g.k f3194c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f3195d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f3196e;

    /* renamed from: f  reason: collision with root package name */
    private final u f3197f = u.b();

    /* renamed from: g  reason: collision with root package name */
    private final n f3198g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<c.d.j.k.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f3199a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.d.b.a.d f3200b;

        a(AtomicBoolean atomicBoolean, c.d.b.a.d dVar) {
            this.f3199a = atomicBoolean;
            this.f3200b = dVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public c.d.j.k.d mo136call() {
            try {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a("BufferedDiskCache#getAsync");
                }
                if (this.f3199a.get()) {
                    throw new CancellationException();
                }
                c.d.j.k.d b2 = e.this.f3197f.b(this.f3200b);
                if (b2 != null) {
                    c.d.d.e.a.b(e.f3191h, "Found image for %s in staging area", this.f3200b.a());
                    e.this.f3198g.d(this.f3200b);
                } else {
                    c.d.d.e.a.b(e.f3191h, "Did not find image for %s in staging area", this.f3200b.a());
                    e.this.f3198g.a();
                    try {
                        c.d.d.g.g e2 = e.this.e(this.f3200b);
                        if (e2 == null) {
                            return null;
                        }
                        c.d.d.h.a a2 = c.d.d.h.a.a(e2);
                        try {
                            b2 = new c.d.j.k.d(a2);
                        } finally {
                            c.d.d.h.a.b(a2);
                        }
                    } catch (Exception unused) {
                        if (c.d.j.p.b.c()) {
                            c.d.j.p.b.a();
                        }
                        return null;
                    }
                }
                if (!Thread.interrupted()) {
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                    return b2;
                }
                c.d.d.e.a.b(e.f3191h, "Host thread was interrupted, decreasing reference count");
                if (b2 != null) {
                    b2.close();
                }
                throw new InterruptedException();
            } finally {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.d.b.a.d f3202b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.d.j.k.d f3203c;

        b(c.d.b.a.d dVar, c.d.j.k.d dVar2) {
            this.f3202b = dVar;
            this.f3203c = dVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a("BufferedDiskCache#putAsync");
                }
                e.this.c(this.f3202b, this.f3203c);
            } finally {
                e.this.f3197f.b(this.f3202b, this.f3203c);
                c.d.j.k.d.c(this.f3203c);
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.d.b.a.d f3205a;

        c(c.d.b.a.d dVar) {
            this.f3205a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            try {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a("BufferedDiskCache#remove");
                }
                e.this.f3197f.c(this.f3205a);
                e.this.f3192a.a(this.f3205a);
            } finally {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Callable<Void> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            e.this.f3197f.a();
            e.this.f3192a.a();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.d.j.d.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0084e implements c.d.b.a.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.d.j.k.d f3208a;

        C0084e(c.d.j.k.d dVar) {
            this.f3208a = dVar;
        }

        @Override // c.d.b.a.j
        public void a(OutputStream outputStream) {
            e.this.f3194c.a(this.f3208a.h(), outputStream);
        }
    }

    public e(c.d.b.b.i iVar, c.d.d.g.h hVar, c.d.d.g.k kVar, Executor executor, Executor executor2, n nVar) {
        this.f3192a = iVar;
        this.f3193b = hVar;
        this.f3194c = kVar;
        this.f3195d = executor;
        this.f3196e = executor2;
        this.f3198g = nVar;
    }

    private b.f<c.d.j.k.d> b(c.d.b.a.d dVar, c.d.j.k.d dVar2) {
        c.d.d.e.a.b(f3191h, "Found image for %s in staging area", dVar.a());
        this.f3198g.d(dVar);
        return b.f.b(dVar2);
    }

    private b.f<c.d.j.k.d> b(c.d.b.a.d dVar, AtomicBoolean atomicBoolean) {
        try {
            return b.f.a(new a(atomicBoolean, dVar), this.f3195d);
        } catch (Exception e2) {
            c.d.d.e.a.b(f3191h, e2, "Failed to schedule disk-cache read for %s", dVar.a());
            return b.f.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(c.d.b.a.d dVar, c.d.j.k.d dVar2) {
        c.d.d.e.a.b(f3191h, "About to write to disk-cache for key %s", dVar.a());
        try {
            this.f3192a.a(dVar, new C0084e(dVar2));
            c.d.d.e.a.b(f3191h, "Successful disk-cache write for key %s", dVar.a());
        } catch (IOException e2) {
            c.d.d.e.a.b(f3191h, e2, "Failed to write to disk-cache for key %s", dVar.a());
        }
    }

    private boolean d(c.d.b.a.d dVar) {
        c.d.j.k.d b2 = this.f3197f.b(dVar);
        if (b2 != null) {
            b2.close();
            c.d.d.e.a.b(f3191h, "Found image for %s in staging area", dVar.a());
            this.f3198g.d(dVar);
            return true;
        }
        c.d.d.e.a.b(f3191h, "Did not find image for %s in staging area", dVar.a());
        this.f3198g.a();
        try {
            return this.f3192a.b(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.d.d.g.g e(c.d.b.a.d dVar) {
        try {
            c.d.d.e.a.b(f3191h, "Disk cache read for %s", dVar.a());
            c.d.a.a c2 = this.f3192a.c(dVar);
            if (c2 == null) {
                c.d.d.e.a.b(f3191h, "Disk cache miss for %s", dVar.a());
                this.f3198g.f();
                return null;
            }
            c.d.d.e.a.b(f3191h, "Found entry in disk cache for %s", dVar.a());
            this.f3198g.b(dVar);
            InputStream a2 = c2.a();
            c.d.d.g.g mo189a = this.f3193b.mo189a(a2, (int) c2.size());
            a2.close();
            c.d.d.e.a.b(f3191h, "Successful read from disk cache for %s", dVar.a());
            return mo189a;
        } catch (IOException e2) {
            c.d.d.e.a.b(f3191h, e2, "Exception reading from cache for %s", dVar.a());
            this.f3198g.e();
            throw e2;
        }
    }

    public b.f<Void> a() {
        this.f3197f.a();
        try {
            return b.f.a(new d(), this.f3196e);
        } catch (Exception e2) {
            c.d.d.e.a.b(f3191h, e2, "Failed to schedule disk-cache clear", new Object[0]);
            return b.f.b(e2);
        }
    }

    public b.f<c.d.j.k.d> a(c.d.b.a.d dVar, AtomicBoolean atomicBoolean) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("BufferedDiskCache#get");
            }
            c.d.j.k.d b2 = this.f3197f.b(dVar);
            if (b2 != null) {
                return b(dVar, b2);
            }
            b.f<c.d.j.k.d> b3 = b(dVar, atomicBoolean);
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
            return b3;
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }

    public void a(c.d.b.a.d dVar, c.d.j.k.d dVar2) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("BufferedDiskCache#put");
            }
            c.d.d.d.i.a(dVar);
            c.d.d.d.i.a(c.d.j.k.d.e(dVar2));
            this.f3197f.a(dVar, dVar2);
            c.d.j.k.d b2 = c.d.j.k.d.b(dVar2);
            try {
                this.f3196e.execute(new b(dVar, b2));
            } catch (Exception e2) {
                c.d.d.e.a.b(f3191h, e2, "Failed to schedule disk-cache write for %s", dVar.a());
                this.f3197f.b(dVar, dVar2);
                c.d.j.k.d.c(b2);
            }
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }

    public boolean a(c.d.b.a.d dVar) {
        return this.f3197f.a(dVar) || this.f3192a.d(dVar);
    }

    public boolean b(c.d.b.a.d dVar) {
        if (a(dVar)) {
            return true;
        }
        return d(dVar);
    }

    public b.f<Void> c(c.d.b.a.d dVar) {
        c.d.d.d.i.a(dVar);
        this.f3197f.c(dVar);
        try {
            return b.f.a(new c(dVar), this.f3196e);
        } catch (Exception e2) {
            c.d.d.e.a.b(f3191h, e2, "Failed to schedule disk-cache remove for %s", dVar.a());
            return b.f.b(e2);
        }
    }
}

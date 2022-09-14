package c.d.d.h;

import c.d.d.d.i;
import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes.dex */
public final class a<T> implements Cloneable, Closeable {

    /* renamed from: f  reason: collision with root package name */
    private static Class<a> f2835f = a.class;

    /* renamed from: g  reason: collision with root package name */
    private static final c.d.d.h.c<Closeable> f2836g = new C0071a();

    /* renamed from: h  reason: collision with root package name */
    private static final c f2837h = new b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f2838b = false;

    /* renamed from: c  reason: collision with root package name */
    private final d<T> f2839c;

    /* renamed from: d  reason: collision with root package name */
    private final c f2840d;

    /* renamed from: e  reason: collision with root package name */
    private final Throwable f2841e;

    /* renamed from: c.d.d.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0071a implements c.d.d.h.c<Closeable> {
        C0071a() {
        }

        @Override // c.d.d.h.c
        public void a(Closeable closeable) {
            try {
                c.d.d.d.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    static class b implements c {
        b() {
        }

        @Override // c.d.d.h.a.c
        public void a(d<Object> dVar, Throwable th) {
            c.d.d.e.a.c(a.f2835f, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(dVar)), dVar.c().getClass().getName());
        }

        @Override // c.d.d.h.a.c
        public boolean a() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(d<Object> dVar, Throwable th);

        boolean a();
    }

    private a(d<T> dVar, c cVar, Throwable th) {
        i.a(dVar);
        this.f2839c = dVar;
        dVar.a();
        this.f2840d = cVar;
        this.f2841e = th;
    }

    private a(T t, c.d.d.h.c<T> cVar, c cVar2, Throwable th) {
        this.f2839c = new d<>(t, cVar);
        this.f2840d = cVar2;
        this.f2841e = th;
    }

    public static <T> a<T> a(a<T> aVar) {
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lc/d/d/h/a<TT;>; */
    public static a a(Closeable closeable) {
        return a(closeable, f2836g);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Lc/d/d/h/a$c;)Lc/d/d/h/a<TT;>; */
    public static a a(Closeable closeable, c cVar) {
        Throwable th = null;
        if (closeable == null) {
            return null;
        }
        c.d.d.h.c<Closeable> cVar2 = f2836g;
        if (cVar.a()) {
            th = new Throwable();
        }
        return new a(closeable, cVar2, cVar, th);
    }

    public static <T> a<T> a(T t, c.d.d.h.c<T> cVar) {
        return a(t, cVar, f2837h);
    }

    public static <T> a<T> a(T t, c.d.d.h.c<T> cVar, c cVar2) {
        Throwable th = null;
        if (t == null) {
            return null;
        }
        if (cVar2.a()) {
            th = new Throwable();
        }
        return new a<>(t, cVar, cVar2, th);
    }

    public static void b(a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static boolean c(a<?> aVar) {
        return aVar != null && aVar.d();
    }

    public synchronized a<T> a() {
        if (d()) {
            return m124clone();
        }
        return null;
    }

    public synchronized T b() {
        i.b(!this.f2838b);
        return this.f2839c.c();
    }

    public int c() {
        if (d()) {
            return System.identityHashCode(this.f2839c.c());
        }
        return 0;
    }

    /* renamed from: clone */
    public synchronized a<T> m124clone() {
        i.b(d());
        return new a<>(this.f2839c, this.f2840d, this.f2841e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f2838b) {
                return;
            }
            this.f2838b = true;
            this.f2839c.b();
        }
    }

    public synchronized boolean d() {
        return !this.f2838b;
    }

    protected void finalize() {
        try {
            synchronized (this) {
                if (this.f2838b) {
                    return;
                }
                this.f2840d.a(this.f2839c, this.f2841e);
                close();
            }
        } finally {
            super.finalize();
        }
    }
}

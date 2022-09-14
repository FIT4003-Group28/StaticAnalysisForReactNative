package com.facebook.common.h;

import com.facebook.common.d.i;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
/* compiled from: CloseableReference.java */
/* loaded from: classes.dex */
public abstract class a<T> implements Closeable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static Class<a> f2291a = a.class;

    /* renamed from: b  reason: collision with root package name */
    private static final c<Closeable> f2292b = new c<Closeable>() { // from class: com.facebook.common.h.a.1
        @Override // com.facebook.common.h.c
        public void a(Closeable closeable) {
            try {
                com.facebook.common.d.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f2293c = true;

    public abstract T a();

    @Override // 
    /* renamed from: b */
    public abstract a<T> clone();

    public abstract a<T> c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract boolean d();

    public abstract int e();

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lcom/facebook/common/h/a<TT;>; */
    public static a a(Closeable closeable) {
        if (closeable == null) {
            return null;
        }
        return b(closeable, f2292b);
    }

    public static <T> a<T> a(T t, c<T> cVar) {
        if (t == null) {
            return null;
        }
        return b(t, cVar);
    }

    private static <T> a<T> b(T t, c<T> cVar) {
        if (f2293c) {
            return new C0049a(t, cVar);
        }
        return new b(t, cVar);
    }

    public static boolean a(a<?> aVar) {
        return aVar != null && aVar.d();
    }

    public static <T> a<T> b(a<T> aVar) {
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public static void c(a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CloseableReference.java */
    /* loaded from: classes.dex */
    public static class b<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        private static final ReferenceQueue<a> f2296a = new ReferenceQueue<>();

        /* renamed from: b  reason: collision with root package name */
        private final d<T> f2297b;

        /* renamed from: c  reason: collision with root package name */
        private final C0050a f2298c;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: CloseableReference.java */
        /* renamed from: com.facebook.common.h.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0050a extends PhantomReference<a> {

            /* renamed from: a  reason: collision with root package name */
            private static C0050a f2299a;

            /* renamed from: b  reason: collision with root package name */
            private final d f2300b;

            /* renamed from: c  reason: collision with root package name */
            private C0050a f2301c;

            /* renamed from: d  reason: collision with root package name */
            private C0050a f2302d;
            private boolean e;

            public C0050a(b bVar, ReferenceQueue<? super a> referenceQueue) {
                super(bVar, referenceQueue);
                this.f2300b = bVar.f2297b;
                synchronized (C0050a.class) {
                    if (f2299a != null) {
                        f2299a.f2301c = this;
                        this.f2302d = f2299a;
                    }
                    f2299a = this;
                }
            }

            public synchronized boolean a() {
                return this.e;
            }

            public void a(boolean z) {
                synchronized (this) {
                    if (this.e) {
                        return;
                    }
                    this.e = true;
                    synchronized (C0050a.class) {
                        if (this.f2302d != null) {
                            this.f2302d.f2301c = this.f2301c;
                        }
                        if (this.f2301c != null) {
                            this.f2301c.f2302d = this.f2302d;
                        } else {
                            f2299a = this.f2302d;
                        }
                    }
                    if (!z) {
                        com.facebook.common.e.a.b((Class<?>) a.f2291a, "GCed without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2300b)), this.f2300b.a().getClass().getSimpleName());
                    }
                    this.f2300b.d();
                }
            }
        }

        static {
            new Thread(new Runnable() { // from class: com.facebook.common.h.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    while (true) {
                        try {
                            ((C0050a) b.f2296a.remove()).a(false);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }, "CloseableReferenceDestructorThread").start();
        }

        private b(d<T> dVar) {
            this.f2297b = (d) i.a(dVar);
            dVar.c();
            this.f2298c = new C0050a(this, f2296a);
        }

        private b(T t, c<T> cVar) {
            this.f2297b = new d<>(t, cVar);
            this.f2298c = new C0050a(this, f2296a);
        }

        @Override // com.facebook.common.h.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2298c.a(true);
        }

        @Override // com.facebook.common.h.a
        public T a() {
            T a2;
            synchronized (this.f2298c) {
                i.b(!this.f2298c.a());
                a2 = this.f2297b.a();
            }
            return a2;
        }

        @Override // com.facebook.common.h.a
        /* renamed from: b */
        public a<T> clone() {
            b bVar;
            synchronized (this.f2298c) {
                i.b(!this.f2298c.a());
                bVar = new b(this.f2297b);
            }
            return bVar;
        }

        @Override // com.facebook.common.h.a
        public a<T> c() {
            synchronized (this.f2298c) {
                if (!this.f2298c.a()) {
                    return new b(this.f2297b);
                }
                return null;
            }
        }

        @Override // com.facebook.common.h.a
        public boolean d() {
            return !this.f2298c.a();
        }

        @Override // com.facebook.common.h.a
        public int e() {
            int identityHashCode;
            synchronized (this.f2298c) {
                identityHashCode = d() ? System.identityHashCode(this.f2297b.a()) : 0;
            }
            return identityHashCode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CloseableReference.java */
    /* renamed from: com.facebook.common.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0049a<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2294a;

        /* renamed from: b  reason: collision with root package name */
        private final d<T> f2295b;

        private C0049a(d<T> dVar) {
            this.f2294a = false;
            this.f2295b = (d) i.a(dVar);
            dVar.c();
        }

        private C0049a(T t, c<T> cVar) {
            this.f2294a = false;
            this.f2295b = new d<>(t, cVar);
        }

        protected void finalize() {
            try {
                synchronized (this) {
                    if (this.f2294a) {
                        return;
                    }
                    com.facebook.common.e.a.b((Class<?>) a.f2291a, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2295b)), this.f2295b.a().getClass().getSimpleName());
                    close();
                }
            } finally {
                super.finalize();
            }
        }

        @Override // com.facebook.common.h.a
        public synchronized T a() {
            i.b(!this.f2294a);
            return this.f2295b.a();
        }

        @Override // com.facebook.common.h.a
        /* renamed from: b */
        public synchronized a<T> clone() {
            i.b(d());
            return new C0049a(this.f2295b);
        }

        @Override // com.facebook.common.h.a
        public synchronized a<T> c() {
            if (d()) {
                return clone();
            }
            return null;
        }

        @Override // com.facebook.common.h.a
        public synchronized boolean d() {
            return !this.f2294a;
        }

        @Override // com.facebook.common.h.a
        public int e() {
            if (d()) {
                return System.identityHashCode(this.f2295b.a());
            }
            return 0;
        }

        @Override // com.facebook.common.h.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this) {
                if (this.f2294a) {
                    return;
                }
                this.f2294a = true;
                this.f2295b.d();
            }
        }
    }
}

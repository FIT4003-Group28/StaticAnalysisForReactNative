package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final d f5305b = new d(null);

    /* renamed from: c  reason: collision with root package name */
    private static final ReferenceQueue f5306c = new ReferenceQueue();

    /* renamed from: a  reason: collision with root package name */
    private static final c f5304a = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final Thread f5307d = new C0117a("HybridData DestructorThread");

    /* renamed from: com.facebook.jni.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0117a extends Thread {
        C0117a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    b bVar = (b) a.f5306c.remove();
                    bVar.a();
                    if (bVar.f5309b == null) {
                        a.f5305b.a();
                    }
                    c.c(bVar);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends PhantomReference<Object> {

        /* renamed from: a  reason: collision with root package name */
        private b f5308a;

        /* renamed from: b  reason: collision with root package name */
        private b f5309b;

        private b() {
            super(null, a.f5306c);
        }

        /* synthetic */ b(C0117a c0117a) {
            this();
        }

        public b(Object obj) {
            super(obj, a.f5306c);
            a.f5305b.a(this);
        }

        protected abstract void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final b f5310a = new e(null);

        public c() {
            this.f5310a.f5308a = new e(null);
            this.f5310a.f5308a.f5309b = this.f5310a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(b bVar) {
            bVar.f5308a.f5309b = bVar.f5309b;
            bVar.f5309b.f5308a = bVar.f5308a;
        }

        public void a(b bVar) {
            bVar.f5308a = this.f5310a.f5308a;
            this.f5310a.f5308a = bVar;
            bVar.f5308a.f5309b = bVar;
            bVar.f5309b = this.f5310a;
        }
    }

    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicReference<b> f5311a;

        private d() {
            this.f5311a = new AtomicReference<>();
        }

        /* synthetic */ d(C0117a c0117a) {
            this();
        }

        public void a() {
            b andSet = this.f5311a.getAndSet(null);
            while (andSet != null) {
                b bVar = andSet.f5308a;
                a.f5304a.a(andSet);
                andSet = bVar;
            }
        }

        public void a(b bVar) {
            b bVar2;
            do {
                bVar2 = this.f5311a.get();
                bVar.f5308a = bVar2;
            } while (!this.f5311a.compareAndSet(bVar2, bVar));
        }
    }

    /* loaded from: classes.dex */
    private static class e extends b {
        private e() {
            super((C0117a) null);
        }

        /* synthetic */ e(C0117a c0117a) {
            this();
        }

        @Override // com.facebook.jni.a.b
        protected void a() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        f5307d.start();
    }
}

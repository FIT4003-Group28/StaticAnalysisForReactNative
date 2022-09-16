package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: DestructorThread.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static c f3015b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static ReferenceQueue f3016c = new ReferenceQueue();

    /* renamed from: a  reason: collision with root package name */
    private static b f3014a = new b();

    /* renamed from: d  reason: collision with root package name */
    private static Thread f3017d = new Thread("HybridData DestructorThread") { // from class: com.facebook.jni.a.1
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    AbstractC0063a abstractC0063a = (AbstractC0063a) a.f3016c.remove();
                    abstractC0063a.a();
                    if (abstractC0063a.f3019b == null) {
                        a.f3015b.a();
                    }
                    b.c(abstractC0063a);
                } catch (InterruptedException unused) {
                }
            }
        }
    };

    /* compiled from: DestructorThread.java */
    /* renamed from: com.facebook.jni.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0063a extends PhantomReference<Object> {

        /* renamed from: a  reason: collision with root package name */
        private AbstractC0063a f3018a;

        /* renamed from: b  reason: collision with root package name */
        private AbstractC0063a f3019b;

        abstract void a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0063a(Object obj) {
            super(obj, a.f3016c);
            a.f3015b.a(this);
        }

        private AbstractC0063a() {
            super(null, a.f3016c);
        }
    }

    static {
        f3017d.start();
    }

    /* compiled from: DestructorThread.java */
    /* loaded from: classes.dex */
    private static class d extends AbstractC0063a {
        private d() {
            super();
        }

        @Override // com.facebook.jni.a.AbstractC0063a
        void a() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    /* compiled from: DestructorThread.java */
    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private AtomicReference<AbstractC0063a> f3021a;

        private c() {
            this.f3021a = new AtomicReference<>();
        }

        public void a(AbstractC0063a abstractC0063a) {
            AbstractC0063a abstractC0063a2;
            do {
                abstractC0063a2 = this.f3021a.get();
                abstractC0063a.f3018a = abstractC0063a2;
            } while (!this.f3021a.compareAndSet(abstractC0063a2, abstractC0063a));
        }

        public void a() {
            AbstractC0063a andSet = this.f3021a.getAndSet(null);
            while (andSet != null) {
                AbstractC0063a abstractC0063a = andSet.f3018a;
                a.f3014a.a(andSet);
                andSet = abstractC0063a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DestructorThread.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private AbstractC0063a f3020a = new d();

        public b() {
            this.f3020a.f3018a = new d();
            this.f3020a.f3018a.f3019b = this.f3020a;
        }

        public void a(AbstractC0063a abstractC0063a) {
            abstractC0063a.f3018a = this.f3020a.f3018a;
            this.f3020a.f3018a = abstractC0063a;
            abstractC0063a.f3018a.f3019b = abstractC0063a;
            abstractC0063a.f3019b = this.f3020a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(AbstractC0063a abstractC0063a) {
            abstractC0063a.f3018a.f3019b = abstractC0063a.f3019b;
            abstractC0063a.f3019b.f3018a = abstractC0063a.f3018a;
        }
    }
}

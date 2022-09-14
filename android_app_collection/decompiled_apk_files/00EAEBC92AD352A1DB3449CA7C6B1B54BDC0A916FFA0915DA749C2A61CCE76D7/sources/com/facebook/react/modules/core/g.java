package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public class g {

    /* renamed from: g  reason: collision with root package name */
    private static g f5619g;

    /* renamed from: a  reason: collision with root package name */
    private volatile com.facebook.react.modules.core.a f5620a;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5622c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private int f5624e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5625f = false;

    /* renamed from: b  reason: collision with root package name */
    private final d f5621b = new d(this, null);

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<a.AbstractC0125a>[] f5623d = new ArrayDeque[c.values().length];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f5627b;

        b(Runnable runnable) {
            this.f5627b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.class) {
                if (g.this.f5620a == null) {
                    g.this.f5620a = com.facebook.react.modules.core.a.b();
                }
            }
            Runnable runnable = this.f5627b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f5635b;

        c(int i) {
            this.f5635b = i;
        }

        int a() {
            return this.f5635b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends a.AbstractC0125a {
        private d() {
        }

        /* synthetic */ d(g gVar, a aVar) {
            this();
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0125a
        public void a(long j) {
            synchronized (g.this.f5622c) {
                g.this.f5625f = false;
                for (int i = 0; i < g.this.f5623d.length; i++) {
                    ArrayDeque arrayDeque = g.this.f5623d[i];
                    int size = arrayDeque.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        a.AbstractC0125a abstractC0125a = (a.AbstractC0125a) arrayDeque.pollFirst();
                        if (abstractC0125a != null) {
                            abstractC0125a.a(j);
                            g.e(g.this);
                        } else {
                            c.d.d.e.a.b("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                g.this.c();
            }
        }
    }

    private g() {
        int i = 0;
        while (true) {
            ArrayDeque<a.AbstractC0125a>[] arrayDequeArr = this.f5623d;
            if (i >= arrayDequeArr.length) {
                a((Runnable) null);
                return;
            } else {
                arrayDequeArr[i] = new ArrayDeque<>();
                i++;
            }
        }
    }

    public static g a() {
        c.d.k.a.a.a(f5619g, "ReactChoreographer needs to be initialized.");
        return f5619g;
    }

    public static void b() {
        if (f5619g == null) {
            f5619g = new g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        c.d.k.a.a.a(this.f5624e >= 0);
        if (this.f5624e != 0 || !this.f5625f) {
            return;
        }
        if (this.f5620a != null) {
            this.f5620a.b(this.f5621b);
        }
        this.f5625f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f5620a.a(this.f5621b);
        this.f5625f = true;
    }

    static /* synthetic */ int e(g gVar) {
        int i = gVar.f5624e;
        gVar.f5624e = i - 1;
        return i;
    }

    public void a(c cVar, a.AbstractC0125a abstractC0125a) {
        synchronized (this.f5622c) {
            this.f5623d[cVar.a()].addLast(abstractC0125a);
            boolean z = true;
            this.f5624e++;
            if (this.f5624e <= 0) {
                z = false;
            }
            c.d.k.a.a.a(z);
            if (!this.f5625f) {
                if (this.f5620a == null) {
                    a(new a());
                } else {
                    d();
                }
            }
        }
    }

    public void a(Runnable runnable) {
        UiThreadUtil.runOnUiThread(new b(runnable));
    }

    public void b(c cVar, a.AbstractC0125a abstractC0125a) {
        synchronized (this.f5622c) {
            if (this.f5623d[cVar.a()].removeFirstOccurrence(abstractC0125a)) {
                this.f5624e--;
                c();
            } else {
                c.d.d.e.a.b("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }
}

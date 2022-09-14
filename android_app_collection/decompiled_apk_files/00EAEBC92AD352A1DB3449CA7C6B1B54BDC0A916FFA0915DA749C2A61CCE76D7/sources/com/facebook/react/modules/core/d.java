package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.i;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f5599a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.modules.core.c f5600b;

    /* renamed from: c  reason: collision with root package name */
    private final g f5601c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.react.devsupport.h.c f5602d;
    private c m;

    /* renamed from: e  reason: collision with root package name */
    private final Object f5603e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Object f5604f = new Object();
    private final AtomicBoolean i = new AtomicBoolean(true);
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final f k = new f(this, null);
    private final C0127d l = new C0127d(this, null);
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    /* renamed from: g  reason: collision with root package name */
    private final PriorityQueue<e> f5605g = new PriorityQueue<>(11, new a(this));

    /* renamed from: h  reason: collision with root package name */
    private final SparseArray<e> f5606h = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<e> {
        a(d dVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            int i = ((eVar.f5616d - eVar2.f5616d) > 0L ? 1 : ((eVar.f5616d - eVar2.f5616d) == 0L ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i < 0 ? -1 : 1;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f5607b;

        b(boolean z) {
            this.f5607b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.f5604f) {
                if (this.f5607b) {
                    d.this.j();
                } else {
                    d.this.e();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f5609b = false;

        /* renamed from: c  reason: collision with root package name */
        private final long f5610c;

        public c(long j) {
            this.f5610c = j;
        }

        public void a() {
            this.f5609b = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (this.f5609b) {
                return;
            }
            long c2 = i.c() - (this.f5610c / 1000000);
            long a2 = i.a() - c2;
            if (16.666666f - ((float) c2) < 1.0f) {
                return;
            }
            synchronized (d.this.f5604f) {
                z = d.this.p;
            }
            if (z) {
                d.this.f5600b.callIdleCallbacks(a2);
            }
            d.this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0127d extends a.AbstractC0125a {
        private C0127d() {
        }

        /* synthetic */ C0127d(d dVar, a aVar) {
            this();
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0125a
        public void a(long j) {
            if (!d.this.i.get() || d.this.j.get()) {
                if (d.this.m != null) {
                    d.this.m.a();
                }
                d dVar = d.this;
                dVar.m = new c(j);
                d.this.f5599a.runOnJSQueueThread(d.this.m);
                d.this.f5601c.a(g.c.IDLE_EVENT, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f5613a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f5614b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5615c;

        /* renamed from: d  reason: collision with root package name */
        private long f5616d;

        private e(int i, long j, int i2, boolean z) {
            this.f5613a = i;
            this.f5616d = j;
            this.f5615c = i2;
            this.f5614b = z;
        }

        /* synthetic */ e(int i, long j, int i2, boolean z, a aVar) {
            this(i, j, i2, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f extends a.AbstractC0125a {

        /* renamed from: b  reason: collision with root package name */
        private WritableArray f5617b;

        private f() {
            this.f5617b = null;
        }

        /* synthetic */ f(d dVar, a aVar) {
            this();
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0125a
        public void a(long j) {
            if (!d.this.i.get() || d.this.j.get()) {
                long j2 = j / 1000000;
                synchronized (d.this.f5603e) {
                    while (!d.this.f5605g.isEmpty() && ((e) d.this.f5605g.peek()).f5616d < j2) {
                        e eVar = (e) d.this.f5605g.poll();
                        if (this.f5617b == null) {
                            this.f5617b = Arguments.createArray();
                        }
                        this.f5617b.pushInt(eVar.f5613a);
                        if (eVar.f5614b) {
                            eVar.f5616d = eVar.f5615c + j2;
                            d.this.f5605g.add(eVar);
                        } else {
                            d.this.f5606h.remove(eVar.f5613a);
                        }
                    }
                }
                if (this.f5617b != null) {
                    d.this.f5600b.callTimers(this.f5617b);
                    this.f5617b = null;
                }
                d.this.f5601c.a(g.c.TIMERS_EVENTS, this);
            }
        }
    }

    public d(ReactApplicationContext reactApplicationContext, com.facebook.react.modules.core.c cVar, g gVar, com.facebook.react.devsupport.h.c cVar2) {
        this.f5599a = reactApplicationContext;
        this.f5600b = cVar;
        this.f5601c = gVar;
        this.f5602d = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.o) {
            this.f5601c.b(g.c.IDLE_EVENT, this.l);
            this.o = false;
        }
    }

    private void f() {
        com.facebook.react.c0.b a2 = com.facebook.react.c0.b.a(this.f5599a);
        if (!this.n || !this.i.get() || a2.a()) {
            return;
        }
        this.f5601c.b(g.c.TIMERS_EVENTS, this.k);
        this.n = false;
    }

    private void g() {
        if (!this.i.get() || this.j.get()) {
            return;
        }
        f();
    }

    private void h() {
        synchronized (this.f5604f) {
            if (this.p) {
                j();
            }
        }
    }

    private void i() {
        if (!this.n) {
            this.f5601c.a(g.c.TIMERS_EVENTS, this.k);
            this.n = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!this.o) {
            this.f5601c.a(g.c.IDLE_EVENT, this.l);
            this.o = true;
        }
    }

    public void a() {
        f();
        g();
    }

    public void a(int i) {
        synchronized (this.f5603e) {
            e eVar = this.f5606h.get(i);
            if (eVar == null) {
                return;
            }
            this.f5606h.remove(i);
            this.f5605g.remove(eVar);
        }
    }

    public void a(int i, int i2, double d2, boolean z) {
        long a2 = i.a();
        long j = (long) d2;
        if (this.f5602d.a() && Math.abs(j - a2) > 60000) {
            this.f5600b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0L, (j - a2) + i2);
        if (i2 != 0 || z) {
            a(i, max, z);
            return;
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        this.f5600b.callTimers(createArray);
    }

    public void a(int i, long j, boolean z) {
        e eVar = new e(i, (i.b() / 1000000) + j, (int) j, z, null);
        synchronized (this.f5603e) {
            this.f5605g.add(eVar);
            this.f5606h.put(i, eVar);
        }
    }

    public void a(boolean z) {
        synchronized (this.f5604f) {
            this.p = z;
        }
        UiThreadUtil.runOnUiThread(new b(z));
    }

    public void b() {
        this.i.set(true);
        f();
        g();
    }

    public void b(int i) {
        if (!com.facebook.react.c0.b.a(this.f5599a).a()) {
            this.j.set(false);
            f();
            g();
        }
    }

    public void c() {
        this.i.set(false);
        i();
        h();
    }

    public void c(int i) {
        if (!this.j.getAndSet(true)) {
            i();
            h();
        }
    }

    public void d() {
        f();
        e();
    }
}

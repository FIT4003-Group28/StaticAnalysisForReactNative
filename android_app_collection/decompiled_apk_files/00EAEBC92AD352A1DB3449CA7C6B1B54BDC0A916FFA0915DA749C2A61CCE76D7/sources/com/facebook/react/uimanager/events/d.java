package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class d implements LifecycleEventListener {
    private static final Comparator<com.facebook.react.uimanager.events.c> r = new a();

    /* renamed from: d  reason: collision with root package name */
    private final ReactApplicationContext f5902d;
    private volatile ReactEventEmitter o;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5900b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Object f5901c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final LongSparseArray<Integer> f5903e = new LongSparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Short> f5904f = com.facebook.react.common.f.b();

    /* renamed from: g  reason: collision with root package name */
    private final c f5905g = new c(this, null);

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<com.facebook.react.uimanager.events.c> f5906h = new ArrayList<>();
    private final ArrayList<e> i = new ArrayList<>();
    private final List<com.facebook.react.uimanager.events.a> j = new ArrayList();
    private final C0132d k = new C0132d(this, null);
    private final AtomicInteger l = new AtomicInteger();
    private com.facebook.react.uimanager.events.c[] m = new com.facebook.react.uimanager.events.c[16];
    private int n = 0;
    private short p = 0;
    private volatile boolean q = false;

    /* loaded from: classes.dex */
    static class a implements Comparator<com.facebook.react.uimanager.events.c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(com.facebook.react.uimanager.events.c cVar, com.facebook.react.uimanager.events.c cVar2) {
            if (cVar == null && cVar2 == null) {
                return 0;
            }
            if (cVar == null) {
                return -1;
            }
            if (cVar2 == null) {
                return 1;
            }
            int i = ((cVar.e() - cVar2.e()) > 0L ? 1 : ((cVar.e() - cVar2.e()) == 0L ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i < 0 ? -1 : 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.g();
        }
    }

    /* loaded from: classes.dex */
    private class c implements Runnable {
        private c() {
        }

        /* synthetic */ c(d dVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.systrace.a.a(0L, "DispatchEventsRunnable");
            try {
                com.facebook.systrace.a.b(0L, "ScheduleDispatchFrameCallback", d.this.l.getAndIncrement());
                d.this.q = false;
                c.d.k.a.a.a(d.this.o);
                synchronized (d.this.f5901c) {
                    if (d.this.n > 0) {
                        if (d.this.n > 1) {
                            Arrays.sort(d.this.m, 0, d.this.n, d.r);
                        }
                        for (int i = 0; i < d.this.n; i++) {
                            com.facebook.react.uimanager.events.c cVar = d.this.m[i];
                            if (cVar != null) {
                                com.facebook.systrace.a.b(0L, cVar.d(), cVar.f());
                                cVar.a(d.this.o);
                                cVar.b();
                            }
                        }
                        d.this.d();
                        d.this.f5903e.clear();
                    }
                }
                for (com.facebook.react.uimanager.events.a aVar : d.this.j) {
                    aVar.a();
                }
            } finally {
                com.facebook.systrace.a.a(0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.events.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0132d extends a.AbstractC0125a {

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f5909b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5910c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.react.uimanager.events.d$d$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0132d.this.b();
            }
        }

        private C0132d() {
            this.f5909b = false;
            this.f5910c = false;
        }

        /* synthetic */ C0132d(d dVar, a aVar) {
            this();
        }

        private void e() {
            com.facebook.react.modules.core.g.a().a(g.c.TIMERS_EVENTS, d.this.k);
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0125a
        public void a(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.f5910c) {
                this.f5909b = false;
            } else {
                e();
            }
            com.facebook.systrace.a.a(0L, "ScheduleDispatchFrameCallback");
            try {
                d.this.f();
                if (!d.this.q) {
                    d.this.q = true;
                    com.facebook.systrace.a.d(0L, "ScheduleDispatchFrameCallback", d.this.l.get());
                    d.this.f5902d.runOnJSQueueThread(d.this.f5905g);
                }
            } finally {
                com.facebook.systrace.a.a(0L);
            }
        }

        public void b() {
            if (!this.f5909b) {
                this.f5909b = true;
                e();
            }
        }

        public void c() {
            if (this.f5909b) {
                return;
            }
            if (d.this.f5902d.isOnUiQueueThread()) {
                b();
            } else {
                d.this.f5902d.runOnUiQueueThread(new a());
            }
        }

        public void d() {
            this.f5910c = true;
        }
    }

    public d(ReactApplicationContext reactApplicationContext) {
        this.f5902d = reactApplicationContext;
        this.f5902d.addLifecycleEventListener(this);
        this.o = new ReactEventEmitter(this.f5902d);
    }

    private long a(int i, String str, short s) {
        short s2;
        Short sh = this.f5904f.get(str);
        if (sh != null) {
            s2 = sh.shortValue();
        } else {
            short s3 = this.p;
            this.p = (short) (s3 + 1);
            this.f5904f.put(str, Short.valueOf(s3));
            s2 = s3;
        }
        return a(i, s2, s);
    }

    private static long a(int i, short s, short s2) {
        return ((s & 65535) << 32) | i | ((s2 & 65535) << 48);
    }

    private void b(com.facebook.react.uimanager.events.c cVar) {
        int i = this.n;
        com.facebook.react.uimanager.events.c[] cVarArr = this.m;
        if (i == cVarArr.length) {
            this.m = (com.facebook.react.uimanager.events.c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        com.facebook.react.uimanager.events.c[] cVarArr2 = this.m;
        int i2 = this.n;
        this.n = i2 + 1;
        cVarArr2[i2] = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Arrays.fill(this.m, 0, this.n, (Object) null);
        this.n = 0;
    }

    private void e() {
        if (this.o != null) {
            this.k.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (this.f5900b) {
            synchronized (this.f5901c) {
                for (int i = 0; i < this.f5906h.size(); i++) {
                    com.facebook.react.uimanager.events.c cVar = this.f5906h.get(i);
                    if (!cVar.a()) {
                        b(cVar);
                    } else {
                        long a2 = a(cVar.g(), cVar.d(), cVar.c());
                        Integer num = this.f5903e.get(a2);
                        com.facebook.react.uimanager.events.c cVar2 = null;
                        if (num == null) {
                            this.f5903e.put(a2, Integer.valueOf(this.n));
                        } else {
                            com.facebook.react.uimanager.events.c cVar3 = this.m[num.intValue()];
                            com.facebook.react.uimanager.events.c a3 = cVar.a(cVar3);
                            if (a3 != cVar3) {
                                this.f5903e.put(a2, Integer.valueOf(this.n));
                                this.m[num.intValue()] = null;
                                cVar2 = cVar3;
                                cVar = a3;
                            } else {
                                cVar2 = cVar;
                                cVar = null;
                            }
                        }
                        if (cVar != null) {
                            b(cVar);
                        }
                        if (cVar2 != null) {
                            cVar2.b();
                        }
                    }
                }
            }
            this.f5906h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        UiThreadUtil.assertOnUiThread();
        this.k.d();
    }

    public void a() {
        e();
    }

    public void a(int i, RCTEventEmitter rCTEventEmitter) {
        this.o.register(i, rCTEventEmitter);
    }

    public void a(com.facebook.react.uimanager.events.a aVar) {
        this.j.add(aVar);
    }

    public void a(com.facebook.react.uimanager.events.c cVar) {
        c.d.k.a.a.a(cVar.h(), "Dispatched event hasn't been initialized");
        Iterator<e> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
        synchronized (this.f5900b) {
            this.f5906h.add(cVar);
            com.facebook.systrace.a.d(0L, cVar.d(), cVar.f());
        }
        e();
    }

    public void a(e eVar) {
        this.i.add(eVar);
    }

    public void b() {
        UiThreadUtil.runOnUiThread(new b());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        g();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        g();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        e();
    }
}

package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.ap;
import com.facebook.react.bridge.x;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: EventDispatcher.java */
/* loaded from: classes.dex */
public class c implements x {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<com.facebook.react.uimanager.events.b> f3879a = new Comparator<com.facebook.react.uimanager.events.b>() { // from class: com.facebook.react.uimanager.events.c.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(com.facebook.react.uimanager.events.b bVar, com.facebook.react.uimanager.events.b bVar2) {
            if (bVar == null && bVar2 == null) {
                return 0;
            }
            if (bVar == null) {
                return -1;
            }
            if (bVar2 == null) {
                return 1;
            }
            int i = ((bVar.e() - bVar2.e()) > 0L ? 1 : ((bVar.e() - bVar2.e()) == 0L ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i < 0 ? -1 : 1;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final ah f3882d;
    private volatile RCTEventEmitter n;

    /* renamed from: b  reason: collision with root package name */
    private final Object f3880b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Object f3881c = new Object();
    private final LongSparseArray<Integer> e = new LongSparseArray<>();
    private final Map<String, Short> f = com.facebook.react.b.f.a();
    private final a g = new a();
    private final ArrayList<com.facebook.react.uimanager.events.b> h = new ArrayList<>();
    private final ArrayList<d> i = new ArrayList<>();
    private final b j = new b();
    private final AtomicInteger k = new AtomicInteger();
    private com.facebook.react.uimanager.events.b[] l = new com.facebook.react.uimanager.events.b[16];
    private int m = 0;
    private short o = 0;
    private volatile boolean p = false;

    private static long a(int i, short s, short s2) {
        return ((s & 65535) << 32) | i | ((s2 & 65535) << 48);
    }

    public c(ah ahVar) {
        this.f3882d = ahVar;
        this.f3882d.a(this);
    }

    public void a(com.facebook.react.uimanager.events.b bVar) {
        com.facebook.j.a.a.a(bVar.h(), "Dispatched event hasn't been initialized");
        Iterator<d> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        synchronized (this.f3880b) {
            this.h.add(bVar);
            com.facebook.m.a.d(0L, bVar.a(), bVar.g());
        }
        if (this.n != null) {
            this.j.e();
        }
    }

    public void a(d dVar) {
        this.i.add(dVar);
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        if (this.n == null) {
            this.n = (RCTEventEmitter) this.f3882d.a(RCTEventEmitter.class);
        }
        this.j.e();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
        c();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
        c();
    }

    public void a() {
        ap.a(new Runnable() { // from class: com.facebook.react.uimanager.events.c.2
            @Override // java.lang.Runnable
            public void run() {
                c.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ap.b();
        this.j.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.f3880b) {
            synchronized (this.f3881c) {
                for (int i = 0; i < this.h.size(); i++) {
                    com.facebook.react.uimanager.events.b bVar = this.h.get(i);
                    if (!bVar.b()) {
                        b(bVar);
                    } else {
                        long a2 = a(bVar.d(), bVar.a(), bVar.f());
                        Integer num = this.e.get(a2);
                        com.facebook.react.uimanager.events.b bVar2 = null;
                        if (num == null) {
                            this.e.put(a2, Integer.valueOf(this.m));
                        } else {
                            com.facebook.react.uimanager.events.b bVar3 = this.l[num.intValue()];
                            com.facebook.react.uimanager.events.b a3 = bVar.a(bVar3);
                            if (a3 != bVar3) {
                                this.e.put(a2, Integer.valueOf(this.m));
                                this.l[num.intValue()] = null;
                                bVar2 = bVar3;
                                bVar = a3;
                            } else {
                                bVar2 = bVar;
                                bVar = null;
                            }
                        }
                        if (bVar != null) {
                            b(bVar);
                        }
                        if (bVar2 != null) {
                            bVar2.i();
                        }
                    }
                }
            }
            this.h.clear();
        }
    }

    private long a(int i, String str, short s) {
        short s2;
        Short sh = this.f.get(str);
        if (sh != null) {
            s2 = sh.shortValue();
        } else {
            short s3 = this.o;
            this.o = (short) (s3 + 1);
            this.f.put(str, Short.valueOf(s3));
            s2 = s3;
        }
        return a(i, s2, s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventDispatcher.java */
    /* loaded from: classes.dex */
    public class b extends a.AbstractC0069a {

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f3886b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3887c;

        private b() {
            this.f3886b = false;
            this.f3887c = false;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0069a
        public void b(long j) {
            ap.b();
            if (this.f3887c) {
                this.f3886b = false;
            } else {
                f();
            }
            com.facebook.m.a.a(0L, "ScheduleDispatchFrameCallback");
            try {
                c.this.d();
                if (c.this.m > 0 && !c.this.p) {
                    c.this.p = true;
                    com.facebook.m.a.d(0L, "ScheduleDispatchFrameCallback", c.this.k.get());
                    c.this.f3882d.c(c.this.g);
                }
            } finally {
                com.facebook.m.a.b(0L);
            }
        }

        public void c() {
            this.f3887c = true;
        }

        public void d() {
            if (!this.f3886b) {
                this.f3886b = true;
                f();
            }
        }

        private void f() {
            com.facebook.react.modules.core.e.b().a(e.a.TIMERS_EVENTS, c.this.j);
        }

        public void e() {
            if (this.f3886b) {
                return;
            }
            if (!c.this.f3882d.g()) {
                c.this.f3882d.a(new Runnable() { // from class: com.facebook.react.uimanager.events.c.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.d();
                    }
                });
            } else {
                d();
            }
        }
    }

    /* compiled from: EventDispatcher.java */
    /* loaded from: classes.dex */
    private class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.m.a.a(0L, "DispatchEventsRunnable");
            try {
                com.facebook.m.a.e(0L, "ScheduleDispatchFrameCallback", c.this.k.getAndIncrement());
                c.this.p = false;
                com.facebook.j.a.a.b(c.this.n);
                synchronized (c.this.f3881c) {
                    if (c.this.m > 1) {
                        Arrays.sort(c.this.l, 0, c.this.m, c.f3879a);
                    }
                    for (int i = 0; i < c.this.m; i++) {
                        com.facebook.react.uimanager.events.b bVar = c.this.l[i];
                        if (bVar != null) {
                            com.facebook.m.a.e(0L, bVar.a(), bVar.g());
                            bVar.a(c.this.n);
                            bVar.i();
                        }
                    }
                    c.this.e();
                    c.this.e.clear();
                }
            } finally {
                com.facebook.m.a.b(0L);
            }
        }
    }

    private void b(com.facebook.react.uimanager.events.b bVar) {
        if (this.m == this.l.length) {
            this.l = (com.facebook.react.uimanager.events.b[]) Arrays.copyOf(this.l, this.l.length * 2);
        }
        com.facebook.react.uimanager.events.b[] bVarArr = this.l;
        int i = this.m;
        this.m = i + 1;
        bVarArr[i] = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Arrays.fill(this.l, 0, this.m, (Object) null);
        this.m = 0;
    }
}

package com.facebook.react.uimanager;

import android.os.SystemClock;
import com.facebook.react.modules.core.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: UIViewOperationQueue.java */
/* loaded from: classes.dex */
public class ao {

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.uimanager.k f3758b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.react.a.d f3759c;
    private final g f;
    private final com.facebook.react.bridge.ah g;
    private com.facebook.react.uimanager.b.a k;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f3757a = new int[4];

    /* renamed from: d  reason: collision with root package name */
    private final Object f3760d = new Object();
    private final Object e = new Object();
    private ArrayList<s> h = new ArrayList<>();
    private ArrayList<Runnable> i = new ArrayList<>();
    private ArrayDeque<s> j = new ArrayDeque<>();
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    public interface s {
        void a();
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private abstract class w implements s {

        /* renamed from: b  reason: collision with root package name */
        public int f3810b;

        public w(int i) {
            this.f3810b = i;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class n extends w {
        public n(int i) {
            super(i);
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3758b.c(this.f3810b);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class u extends w {

        /* renamed from: d  reason: collision with root package name */
        private final y f3807d;

        private u(int i, y yVar) {
            super(i);
            this.f3807d = yVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3758b.a(this.f3810b, this.f3807d);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class t extends w {

        /* renamed from: d  reason: collision with root package name */
        private final int f3805d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;

        public t(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i2);
            this.f3805d = i;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = i6;
            com.facebook.m.a.d(0L, "updateLayout", this.f3810b);
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            com.facebook.m.a.e(0L, "updateLayout", this.f3810b);
            ao.this.f3758b.a(this.f3805d, this.f3810b, this.e, this.f, this.g, this.h);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class e extends w {

        /* renamed from: d  reason: collision with root package name */
        private final af f3775d;
        private final String e;
        private final y f;

        public e(af afVar, int i, String str, y yVar) {
            super(i);
            this.f3775d = afVar;
            this.e = str;
            this.f = yVar;
            com.facebook.m.a.d(0L, "createView", this.f3810b);
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            com.facebook.m.a.e(0L, "createView", this.f3810b);
            ao.this.f3758b.a(this.f3775d, this.f3810b, this.e, this.f);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class i extends w {

        /* renamed from: d  reason: collision with root package name */
        private final int[] f3785d;
        private final ap[] e;
        private final int[] f;

        public i(int i, int[] iArr, ap[] apVarArr, int[] iArr2) {
            super(i);
            this.f3785d = iArr;
            this.e = apVarArr;
            this.f = iArr2;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3758b.a(this.f3810b, this.f3785d, this.e, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    public final class v extends w {

        /* renamed from: d  reason: collision with root package name */
        private final Object f3809d;

        public v(int i, Object obj) {
            super(i);
            this.f3809d = obj;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3758b.a(this.f3810b, this.f3809d);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class c extends w {

        /* renamed from: d  reason: collision with root package name */
        private final int f3771d;
        private final boolean e;
        private final boolean f;

        public c(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.f3771d = i2;
            this.f = z;
            this.e = z2;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            if (!this.f) {
                ao.this.f3758b.a(this.f3810b, this.f3771d, this.e);
            } else {
                ao.this.f3758b.b();
            }
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class f extends w {

        /* renamed from: d  reason: collision with root package name */
        private final int f3777d;
        private final com.facebook.react.bridge.am e;

        public f(int i, int i2, com.facebook.react.bridge.am amVar) {
            super(i);
            this.f3777d = i2;
            this.e = amVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3758b.a(this.f3810b, this.f3777d, this.e);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class q extends w {

        /* renamed from: d  reason: collision with root package name */
        private final com.facebook.react.bridge.am f3801d;
        private final com.facebook.react.bridge.d e;

        public q(int i, com.facebook.react.bridge.am amVar, com.facebook.react.bridge.d dVar) {
            super(i);
            this.f3801d = amVar;
            this.e = dVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3758b.a(this.f3810b, this.f3801d, this.e);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private static abstract class b implements s {

        /* renamed from: b  reason: collision with root package name */
        protected final int f3769b;

        public b(int i) {
            this.f3769b = i;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class l extends b {

        /* renamed from: c  reason: collision with root package name */
        private final com.facebook.react.a.a f3793c;

        private l(com.facebook.react.a.a aVar) {
            super(aVar.c());
            this.f3793c = aVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3759c.a(this.f3793c);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class a extends b {

        /* renamed from: c  reason: collision with root package name */
        private final int f3767c;

        /* renamed from: d  reason: collision with root package name */
        private final com.facebook.react.bridge.d f3768d;

        private a(int i, int i2, com.facebook.react.bridge.d dVar) {
            super(i2);
            this.f3767c = i;
            this.f3768d = dVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            com.facebook.react.a.a a2 = ao.this.f3759c.a(this.f3769b);
            if (a2 != null) {
                ao.this.f3758b.a(this.f3767c, a2, this.f3768d);
                return;
            }
            throw new com.facebook.react.uimanager.e("Animation with id " + this.f3769b + " was not found");
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class m extends b {
        private m(int i) {
            super(i);
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            com.facebook.react.a.a a2 = ao.this.f3759c.a(this.f3769b);
            if (a2 != null) {
                a2.b();
            }
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class p implements s {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3799b;

        private p(boolean z) {
            this.f3799b = z;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3758b.a(this.f3799b);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class d implements s {

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.react.bridge.an f3773b;

        private d(com.facebook.react.bridge.an anVar) {
            this.f3773b = anVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3758b.a(this.f3773b);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class k implements s {

        /* renamed from: b  reason: collision with root package name */
        private final int f3790b;

        /* renamed from: c  reason: collision with root package name */
        private final com.facebook.react.bridge.d f3791c;

        private k(int i, com.facebook.react.bridge.d dVar) {
            this.f3790b = i;
            this.f3791c = dVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            try {
                ao.this.f3758b.a(this.f3790b, ao.this.f3757a);
                float c2 = com.facebook.react.uimanager.o.c(ao.this.f3757a[0]);
                float c3 = com.facebook.react.uimanager.o.c(ao.this.f3757a[1]);
                this.f3791c.a(0, 0, Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[2])), Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[3])), Float.valueOf(c2), Float.valueOf(c3));
            } catch (com.facebook.react.uimanager.m unused) {
                this.f3791c.a(new Object[0]);
            }
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class j implements s {

        /* renamed from: b  reason: collision with root package name */
        private final int f3787b;

        /* renamed from: c  reason: collision with root package name */
        private final com.facebook.react.bridge.d f3788c;

        private j(int i, com.facebook.react.bridge.d dVar) {
            this.f3787b = i;
            this.f3788c = dVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            try {
                ao.this.f3758b.b(this.f3787b, ao.this.f3757a);
                this.f3788c.a(Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[0])), Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[1])), Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[2])), Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[3])));
            } catch (com.facebook.react.uimanager.m unused) {
                this.f3788c.a(new Object[0]);
            }
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class h implements s {

        /* renamed from: b  reason: collision with root package name */
        private final int f3781b;

        /* renamed from: c  reason: collision with root package name */
        private final float f3782c;

        /* renamed from: d  reason: collision with root package name */
        private final float f3783d;
        private final com.facebook.react.bridge.d e;

        private h(int i, float f, float f2, com.facebook.react.bridge.d dVar) {
            this.f3781b = i;
            this.f3782c = f;
            this.f3783d = f2;
            this.e = dVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            try {
                ao.this.f3758b.a(this.f3781b, ao.this.f3757a);
                float f = ao.this.f3757a[0];
                float f2 = ao.this.f3757a[1];
                int a2 = ao.this.f3758b.a(this.f3781b, this.f3782c, this.f3783d);
                try {
                    ao.this.f3758b.a(a2, ao.this.f3757a);
                    this.e.a(Integer.valueOf(a2), Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[0] - f)), Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[1] - f2)), Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[2])), Float.valueOf(com.facebook.react.uimanager.o.c(ao.this.f3757a[3])));
                } catch (com.facebook.react.uimanager.e unused) {
                    this.e.a(new Object[0]);
                }
            } catch (com.facebook.react.uimanager.e unused2) {
                this.e.a(new Object[0]);
            }
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class r implements s {

        /* renamed from: b  reason: collision with root package name */
        private final ai f3803b;

        public r(ai aiVar) {
            this.f3803b = aiVar;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            this.f3803b.a(ao.this.f3758b);
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private final class o extends w {

        /* renamed from: d  reason: collision with root package name */
        private final int f3797d;

        private o(int i, int i2) {
            super(i);
            this.f3797d = i2;
        }

        @Override // com.facebook.react.uimanager.ao.s
        public void a() {
            ao.this.f3758b.a(this.f3810b, this.f3797d);
        }
    }

    public ao(com.facebook.react.bridge.ah ahVar, com.facebook.react.uimanager.k kVar, int i2) {
        this.f3758b = kVar;
        this.f3759c = kVar.a();
        this.f = new g(ahVar, i2 == -1 ? 8 : i2);
        this.g = ahVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.facebook.react.uimanager.k a() {
        return this.f3758b;
    }

    public void a(com.facebook.react.uimanager.b.a aVar) {
        this.k = aVar;
    }

    public Map<String, Long> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.p));
        hashMap.put("LayoutTime", Long.valueOf(this.q));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.r));
        hashMap.put("RunStartTime", Long.valueOf(this.s));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.t));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.u));
        return hashMap;
    }

    public boolean c() {
        return this.h.isEmpty();
    }

    public void a(int i2, ad adVar, af afVar) {
        this.f3758b.a(i2, adVar, afVar);
    }

    public void a(int i2) {
        this.h.add(new n(i2));
    }

    public void a(int i2, int i3, boolean z) {
        this.h.add(new c(i2, i3, false, z));
    }

    public void d() {
        this.h.add(new c(0, 0, true, false));
    }

    public void a(int i2, int i3, com.facebook.react.bridge.am amVar) {
        this.h.add(new f(i2, i3, amVar));
    }

    public void a(int i2, Object obj) {
        this.h.add(new v(i2, obj));
    }

    public void a(int i2, com.facebook.react.bridge.am amVar, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        this.h.add(new q(i2, amVar, dVar2));
    }

    public void a(af afVar, int i2, String str, y yVar) {
        synchronized (this.e) {
            this.j.addLast(new e(afVar, i2, str, yVar));
        }
    }

    public void a(int i2, String str, y yVar) {
        this.h.add(new u(i2, yVar));
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.h.add(new t(i2, i3, i4, i5, i6, i7));
    }

    public void a(int i2, int[] iArr, ap[] apVarArr, int[] iArr2) {
        this.h.add(new i(i2, iArr, apVarArr, iArr2));
    }

    public void a(com.facebook.react.a.a aVar) {
        this.h.add(new l(aVar));
    }

    public void a(int i2, int i3, com.facebook.react.bridge.d dVar) {
        this.h.add(new a(i2, i3, dVar));
    }

    public void b(int i2) {
        this.h.add(new m(i2));
    }

    public void a(boolean z) {
        this.h.add(new p(z));
    }

    public void a(com.facebook.react.bridge.an anVar, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        this.h.add(new d(anVar));
    }

    public void a(int i2, com.facebook.react.bridge.d dVar) {
        this.h.add(new k(i2, dVar));
    }

    public void b(int i2, com.facebook.react.bridge.d dVar) {
        this.h.add(new j(i2, dVar));
    }

    public void a(int i2, float f2, float f3, com.facebook.react.bridge.d dVar) {
        this.h.add(new h(i2, f2, f3, dVar));
    }

    public void a(int i2, int i3) {
        this.h.add(new o(i2, i3));
    }

    public void a(ai aiVar) {
        this.h.add(new r(aiVar));
    }

    public void b(ai aiVar) {
        this.h.add(0, new r(aiVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i2, final long j2, final long j3) {
        final ArrayList<s> arrayList;
        final ArrayDeque<s> arrayDeque;
        com.facebook.m.b.a(0L, "UIViewOperationQueue.dispatchViewUpdates").a("batchId", i2).a();
        try {
            final long uptimeMillis = SystemClock.uptimeMillis();
            ArrayDeque<s> arrayDeque2 = null;
            if (!this.h.isEmpty()) {
                ArrayList<s> arrayList2 = this.h;
                this.h = new ArrayList<>();
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            synchronized (this.e) {
                if (!this.j.isEmpty()) {
                    arrayDeque2 = this.j;
                    this.j = new ArrayDeque<>();
                }
                arrayDeque = arrayDeque2;
            }
            if (this.k != null) {
                this.k.c();
            }
            Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.ao.1
                @Override // java.lang.Runnable
                public void run() {
                    com.facebook.m.b.a(0L, "DispatchUI").a("BatchId", i2).a();
                    try {
                        try {
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            if (arrayDeque != null) {
                                Iterator it = arrayDeque.iterator();
                                while (it.hasNext()) {
                                    ((s) it.next()).a();
                                }
                            }
                            if (arrayList != null) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((s) it2.next()).a();
                                }
                            }
                            if (ao.this.n && ao.this.p == 0) {
                                ao.this.p = j2;
                                ao.this.q = j3;
                                ao.this.r = uptimeMillis;
                                ao.this.s = uptimeMillis2;
                                com.facebook.m.a.a(0L, "delayBeforeDispatchViewUpdates", 0, ao.this.p * 1000000);
                                com.facebook.m.a.b(0L, "delayBeforeDispatchViewUpdates", 0, ao.this.r * 1000000);
                                com.facebook.m.a.a(0L, "delayBeforeBatchRunStart", 0, ao.this.r * 1000000);
                                com.facebook.m.a.b(0L, "delayBeforeBatchRunStart", 0, ao.this.s * 1000000);
                            }
                            ao.this.f3758b.c();
                            if (ao.this.k != null) {
                                ao.this.k.d();
                            }
                            com.facebook.m.a.b(0L);
                        } catch (Exception e2) {
                            ao.this.m = true;
                            throw e2;
                        }
                    } catch (Throwable th) {
                        com.facebook.m.a.b(0L);
                        throw th;
                    }
                }
            };
            com.facebook.m.b.a(0L, "acquiring mDispatchRunnablesLock").a("batchId", i2).a();
            synchronized (this.f3760d) {
                com.facebook.m.a.b(0L);
                this.i.add(runnable);
            }
            if (!this.l) {
                com.facebook.react.bridge.ap.a(new com.facebook.react.bridge.l(this.g) { // from class: com.facebook.react.uimanager.ao.2
                    @Override // com.facebook.react.bridge.l
                    public void a() {
                        ao.this.g();
                    }
                });
            }
        } finally {
            com.facebook.m.a.b(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.l = true;
        com.facebook.react.modules.core.e.b().a(e.a.DISPATCH_UI, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.l = false;
        com.facebook.react.modules.core.e.b().b(e.a.DISPATCH_UI, this.f);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.m) {
            com.facebook.common.e.a.c("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f3760d) {
            if (this.i.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.i;
            this.i = new ArrayList<>();
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.n) {
                this.t = SystemClock.uptimeMillis() - uptimeMillis;
                this.u = this.o;
                this.n = false;
                com.facebook.m.a.a(0L, "batchedExecutionTime", 0, 1000000 * uptimeMillis);
                com.facebook.m.a.b(0L, "batchedExecutionTime", 0);
            }
            this.o = 0L;
        }
    }

    /* compiled from: UIViewOperationQueue.java */
    /* loaded from: classes.dex */
    private class g extends com.facebook.react.uimanager.d {

        /* renamed from: b  reason: collision with root package name */
        private final int f3779b;

        private g(com.facebook.react.bridge.aj ajVar, int i) {
            super(ajVar);
            this.f3779b = i;
        }

        @Override // com.facebook.react.uimanager.d
        public void a(long j) {
            if (ao.this.m) {
                com.facebook.common.e.a.c("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            com.facebook.m.a.a(0L, "dispatchNonBatchedUIOperations");
            try {
                c(j);
                com.facebook.m.a.b(0L);
                ao.this.g();
                com.facebook.react.modules.core.e.b().a(e.a.DISPATCH_UI, this);
            } catch (Throwable th) {
                com.facebook.m.a.b(0L);
                throw th;
            }
        }

        private void c(long j) {
            s sVar;
            while (16 - ((System.nanoTime() - j) / 1000000) >= this.f3779b) {
                synchronized (ao.this.e) {
                    if (ao.this.j.isEmpty()) {
                        return;
                    }
                    sVar = (s) ao.this.j.pollFirst();
                }
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    sVar.a();
                    ao.this.o += SystemClock.uptimeMillis() - uptimeMillis;
                } catch (Exception e) {
                    ao.this.m = true;
                    throw e;
                }
            }
        }
    }
}

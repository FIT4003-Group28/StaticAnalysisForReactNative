package com.facebook.imagepipeline.d;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.android.internal.util.Predicate;
import com.facebook.imagepipeline.c.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: CountingMemoryCache.java */
/* loaded from: classes.dex */
public class h<K, V> implements com.facebook.common.g.b, t<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final long f2581a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b  reason: collision with root package name */
    final g<K, b<K, V>> f2582b;

    /* renamed from: c  reason: collision with root package name */
    final g<K, b<K, V>> f2583c;
    protected u e;
    private final ac<V> f;
    private final a g;
    private final com.facebook.common.d.k<u> h;

    /* renamed from: d  reason: collision with root package name */
    final Map<Bitmap, Object> f2584d = new WeakHashMap();
    private long i = SystemClock.uptimeMillis();

    /* compiled from: CountingMemoryCache.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: CountingMemoryCache.java */
    /* loaded from: classes.dex */
    public interface c<K> {
        void a(K k, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CountingMemoryCache.java */
    /* loaded from: classes.dex */
    public static class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f2590a;

        /* renamed from: b  reason: collision with root package name */
        public final com.facebook.common.h.a<V> f2591b;

        /* renamed from: c  reason: collision with root package name */
        public int f2592c = 0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2593d = false;
        public final c<K> e;

        private b(K k, com.facebook.common.h.a<V> aVar, c<K> cVar) {
            this.f2590a = (K) com.facebook.common.d.i.a(k);
            this.f2591b = (com.facebook.common.h.a) com.facebook.common.d.i.a(com.facebook.common.h.a.b(aVar));
            this.e = cVar;
        }

        static <K, V> b<K, V> a(K k, com.facebook.common.h.a<V> aVar, c<K> cVar) {
            return new b<>(k, aVar, cVar);
        }
    }

    public h(ac<V> acVar, a aVar, com.facebook.common.d.k<u> kVar, com.facebook.imagepipeline.c.f fVar, boolean z) {
        this.f = acVar;
        this.f2582b = new g<>(a((ac) acVar));
        this.f2583c = new g<>(a((ac) acVar));
        this.g = aVar;
        this.h = kVar;
        this.e = this.h.b();
        if (z) {
            fVar.a(new f.a() { // from class: com.facebook.imagepipeline.d.h.1
            });
        }
    }

    private ac<b<K, V>> a(final ac<V> acVar) {
        return new ac<b<K, V>>() { // from class: com.facebook.imagepipeline.d.h.2
            @Override // com.facebook.imagepipeline.d.ac
            public /* bridge */ /* synthetic */ int a(Object obj) {
                return a((b) ((b) obj));
            }

            public int a(b<K, V> bVar) {
                return acVar.a(bVar.f2591b.a());
            }
        };
    }

    @Override // com.facebook.imagepipeline.d.t
    public com.facebook.common.h.a<V> a(K k, com.facebook.common.h.a<V> aVar) {
        return a(k, aVar, null);
    }

    public com.facebook.common.h.a<V> a(K k, com.facebook.common.h.a<V> aVar, c<K> cVar) {
        b<K, V> b2;
        com.facebook.common.h.a<V> aVar2;
        com.facebook.common.h.a<V> aVar3;
        com.facebook.common.d.i.a(k);
        com.facebook.common.d.i.a(aVar);
        c();
        synchronized (this) {
            b2 = this.f2582b.b((g<K, b<K, V>>) k);
            b<K, V> b3 = this.f2583c.b((g<K, b<K, V>>) k);
            aVar2 = null;
            if (b3 != null) {
                f(b3);
                aVar3 = i(b3);
            } else {
                aVar3 = null;
            }
            if (b((h<K, V>) aVar.a())) {
                b<K, V> a2 = b.a(k, aVar, cVar);
                this.f2583c.a(k, a2);
                aVar2 = a((b) a2);
            }
        }
        com.facebook.common.h.a.c(aVar3);
        d(b2);
        d();
        return aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (b() <= (r3.e.f2612a - r4)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean b(V r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.facebook.imagepipeline.d.ac<V> r0 = r3.f     // Catch: java.lang.Throwable -> L28
            int r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L28
            com.facebook.imagepipeline.d.u r0 = r3.e     // Catch: java.lang.Throwable -> L28
            int r0 = r0.e     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r4 > r0) goto L25
            int r0 = r3.a()     // Catch: java.lang.Throwable -> L28
            com.facebook.imagepipeline.d.u r2 = r3.e     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f2613b     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r1
            if (r0 > r2) goto L25
            int r0 = r3.b()     // Catch: java.lang.Throwable -> L28
            com.facebook.imagepipeline.d.u r2 = r3.e     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f2612a     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r4
            if (r0 > r2) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            monitor-exit(r3)
            return r1
        L28:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.d.h.b(java.lang.Object):boolean");
    }

    @Override // com.facebook.imagepipeline.d.t
    public com.facebook.common.h.a<V> a(K k) {
        b<K, V> b2;
        com.facebook.common.h.a<V> a2;
        com.facebook.common.d.i.a(k);
        synchronized (this) {
            b2 = this.f2582b.b((g<K, b<K, V>>) k);
            b<K, V> a3 = this.f2583c.a((g<K, b<K, V>>) k);
            a2 = a3 != null ? a((b) a3) : null;
        }
        d(b2);
        c();
        d();
        return a2;
    }

    private synchronized com.facebook.common.h.a<V> a(final b<K, V> bVar) {
        g(bVar);
        return com.facebook.common.h.a.a(bVar.f2591b.a(), new com.facebook.common.h.c<V>() { // from class: com.facebook.imagepipeline.d.h.3
            @Override // com.facebook.common.h.c
            public void a(V v) {
                h.this.b(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(b<K, V> bVar) {
        boolean c2;
        com.facebook.common.h.a<V> i;
        com.facebook.common.d.i.a(bVar);
        synchronized (this) {
            h(bVar);
            c2 = c(bVar);
            i = i(bVar);
        }
        com.facebook.common.h.a.c(i);
        if (!c2) {
            bVar = null;
        }
        e(bVar);
        c();
        d();
    }

    private synchronized boolean c(b<K, V> bVar) {
        if (bVar.f2593d || bVar.f2592c != 0) {
            return false;
        }
        this.f2582b.a(bVar.f2590a, bVar);
        return true;
    }

    @Override // com.facebook.imagepipeline.d.t
    public int a(Predicate<K> predicate) {
        ArrayList<b<K, V>> b2;
        ArrayList<b<K, V>> b3;
        synchronized (this) {
            b2 = this.f2582b.b((Predicate) predicate);
            b3 = this.f2583c.b((Predicate) predicate);
            c(b3);
        }
        a((ArrayList) b3);
        b((ArrayList) b2);
        c();
        d();
        return b3.size();
    }

    @Override // com.facebook.imagepipeline.d.t
    public synchronized boolean b(Predicate<K> predicate) {
        return !this.f2583c.a((Predicate) predicate).isEmpty();
    }

    private synchronized void c() {
        if (this.i + f2581a > SystemClock.uptimeMillis()) {
            return;
        }
        this.i = SystemClock.uptimeMillis();
        this.e = this.h.b();
    }

    private void d() {
        ArrayList<b<K, V>> a2;
        synchronized (this) {
            a2 = a(Math.min(this.e.f2615d, this.e.f2613b - a()), Math.min(this.e.f2614c, this.e.f2612a - b()));
            c(a2);
        }
        a((ArrayList) a2);
        b((ArrayList) a2);
    }

    private synchronized ArrayList<b<K, V>> a(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f2582b.a() > max || this.f2582b.b() > max2) {
            ArrayList<b<K, V>> arrayList = new ArrayList<>();
            while (true) {
                if (this.f2582b.a() <= max && this.f2582b.b() <= max2) {
                    return arrayList;
                }
                K c2 = this.f2582b.c();
                this.f2582b.b((g<K, b<K, V>>) c2);
                arrayList.add(this.f2583c.b((g<K, b<K, V>>) c2));
            }
        } else {
            return null;
        }
    }

    private void a(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                com.facebook.common.h.a.c(i(it.next()));
            }
        }
    }

    private void b(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                d(it.next());
            }
        }
    }

    private static <K, V> void d(b<K, V> bVar) {
        if (bVar == null || bVar.e == null) {
            return;
        }
        bVar.e.a(bVar.f2590a, false);
    }

    private static <K, V> void e(b<K, V> bVar) {
        if (bVar == null || bVar.e == null) {
            return;
        }
        bVar.e.a(bVar.f2590a, true);
    }

    private synchronized void c(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    private synchronized void f(b<K, V> bVar) {
        com.facebook.common.d.i.a(bVar);
        com.facebook.common.d.i.b(!bVar.f2593d);
        bVar.f2593d = true;
    }

    private synchronized void g(b<K, V> bVar) {
        com.facebook.common.d.i.a(bVar);
        com.facebook.common.d.i.b(!bVar.f2593d);
        bVar.f2592c++;
    }

    private synchronized void h(b<K, V> bVar) {
        com.facebook.common.d.i.a(bVar);
        com.facebook.common.d.i.b(bVar.f2592c > 0);
        bVar.f2592c--;
    }

    private synchronized com.facebook.common.h.a<V> i(b<K, V> bVar) {
        com.facebook.common.d.i.a(bVar);
        return (!bVar.f2593d || bVar.f2592c != 0) ? null : bVar.f2591b;
    }

    public synchronized int a() {
        return this.f2583c.a() - this.f2582b.a();
    }

    public synchronized int b() {
        return this.f2583c.b() - this.f2582b.b();
    }
}

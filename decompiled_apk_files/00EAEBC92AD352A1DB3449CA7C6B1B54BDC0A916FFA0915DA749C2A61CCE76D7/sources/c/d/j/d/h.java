package c.d.j.d;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class h<K, V> implements p<K, V>, c.d.d.g.b {

    /* renamed from: a  reason: collision with root package name */
    final g<K, d<K, V>> f3213a;

    /* renamed from: b  reason: collision with root package name */
    final g<K, d<K, V>> f3214b;

    /* renamed from: c  reason: collision with root package name */
    private final v<V> f3215c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.d.d.l<q> f3216d;

    /* renamed from: e  reason: collision with root package name */
    protected q f3217e;

    /* renamed from: f  reason: collision with root package name */
    private long f3218f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements v<d<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f3219a;

        a(h hVar, v vVar) {
            this.f3219a = vVar;
        }

        public int a(d<K, V> dVar) {
            return this.f3219a.a(dVar.f3223b.b());
        }

        @Override // c.d.j.d.v
        public /* bridge */ /* synthetic */ int a(Object obj) {
            return a((d) ((d) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements c.d.d.h.c<V> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f3220a;

        b(d dVar) {
            this.f3220a = dVar;
        }

        @Override // c.d.d.h.c
        public void a(V v) {
            h.this.i(this.f3220a);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f3222a;

        /* renamed from: b  reason: collision with root package name */
        public final c.d.d.h.a<V> f3223b;

        /* renamed from: c  reason: collision with root package name */
        public int f3224c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3225d;

        /* renamed from: e  reason: collision with root package name */
        public final e<K> f3226e;

        private d(K k, c.d.d.h.a<V> aVar, e<K> eVar) {
            c.d.d.d.i.a(k);
            this.f3222a = k;
            c.d.d.h.a<V> a2 = c.d.d.h.a.a((c.d.d.h.a) aVar);
            c.d.d.d.i.a(a2);
            this.f3223b = a2;
            this.f3224c = 0;
            this.f3225d = false;
            this.f3226e = eVar;
        }

        static <K, V> d<K, V> a(K k, c.d.d.h.a<V> aVar, e<K> eVar) {
            return new d<>(k, aVar, eVar);
        }
    }

    /* loaded from: classes.dex */
    public interface e<K> {
        void a(K k, boolean z);
    }

    public h(v<V> vVar, c cVar, c.d.d.d.l<q> lVar) {
        new WeakHashMap();
        this.f3215c = vVar;
        this.f3213a = new g<>(a(vVar));
        this.f3214b = new g<>(a(vVar));
        this.f3216d = lVar;
        this.f3217e = this.f3216d.mo139get();
        this.f3218f = SystemClock.uptimeMillis();
    }

    private v<d<K, V>> a(v<V> vVar) {
        return new a(this, vVar);
    }

    private synchronized ArrayList<d<K, V>> a(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f3213a.a() > max || this.f3213a.c() > max2) {
            ArrayList<d<K, V>> arrayList = new ArrayList<>();
            while (true) {
                if (this.f3213a.a() <= max && this.f3213a.c() <= max2) {
                    return arrayList;
                }
                K b2 = this.f3213a.b();
                this.f3213a.b((g<K, d<K, V>>) b2);
                arrayList.add(this.f3214b.b((g<K, d<K, V>>) b2));
            }
        } else {
            return null;
        }
    }

    private synchronized void a(d<K, V> dVar) {
        c.d.d.d.i.a(dVar);
        c.d.d.d.i.b(dVar.f3224c > 0);
        dVar.f3224c--;
    }

    private synchronized void a(ArrayList<d<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<d<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }
    }

    private synchronized void b(d<K, V> dVar) {
        c.d.d.d.i.a(dVar);
        c.d.d.d.i.b(!dVar.f3225d);
        dVar.f3224c++;
    }

    private void b(ArrayList<d<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<d<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                c.d.d.h.a.b(h(it.next()));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (b() <= (r3.f3217e.f3234a - r4)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean b(V r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            c.d.j.d.v<V> r0 = r3.f3215c     // Catch: java.lang.Throwable -> L28
            int r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L28
            c.d.j.d.q r0 = r3.f3217e     // Catch: java.lang.Throwable -> L28
            int r0 = r0.f3238e     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r4 > r0) goto L25
            int r0 = r3.a()     // Catch: java.lang.Throwable -> L28
            c.d.j.d.q r2 = r3.f3217e     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f3235b     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r1
            if (r0 > r2) goto L25
            int r0 = r3.b()     // Catch: java.lang.Throwable -> L28
            c.d.j.d.q r2 = r3.f3217e     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f3234a     // Catch: java.lang.Throwable -> L28
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
        throw new UnsupportedOperationException("Method not decompiled: c.d.j.d.h.b(java.lang.Object):boolean");
    }

    private void c() {
        ArrayList<d<K, V>> a2;
        synchronized (this) {
            a2 = a(Math.min(this.f3217e.f3237d, this.f3217e.f3235b - a()), Math.min(this.f3217e.f3236c, this.f3217e.f3234a - b()));
            a(a2);
        }
        b((ArrayList) a2);
        c(a2);
    }

    private synchronized void c(d<K, V> dVar) {
        c.d.d.d.i.a(dVar);
        c.d.d.d.i.b(!dVar.f3225d);
        dVar.f3225d = true;
    }

    private void c(ArrayList<d<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<d<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    private synchronized void d() {
        if (this.f3218f + this.f3217e.f3239f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f3218f = SystemClock.uptimeMillis();
        this.f3217e = this.f3216d.mo139get();
    }

    private synchronized boolean d(d<K, V> dVar) {
        boolean z;
        if (dVar.f3225d || dVar.f3224c != 0) {
            z = false;
        } else {
            this.f3213a.a(dVar.f3222a, dVar);
            z = true;
        }
        return z;
    }

    private static <K, V> void e(d<K, V> dVar) {
        e<K> eVar;
        if (dVar == null || (eVar = dVar.f3226e) == null) {
            return;
        }
        eVar.a(dVar.f3222a, true);
    }

    private static <K, V> void f(d<K, V> dVar) {
        e<K> eVar;
        if (dVar == null || (eVar = dVar.f3226e) == null) {
            return;
        }
        eVar.a(dVar.f3222a, false);
    }

    private synchronized c.d.d.h.a<V> g(d<K, V> dVar) {
        b((d) dVar);
        return c.d.d.h.a.a(dVar.f3223b.b(), new b(dVar));
    }

    private synchronized c.d.d.h.a<V> h(d<K, V> dVar) {
        c.d.d.d.i.a(dVar);
        return (!dVar.f3225d || dVar.f3224c != 0) ? null : dVar.f3223b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(d<K, V> dVar) {
        boolean d2;
        c.d.d.h.a<V> h2;
        c.d.d.d.i.a(dVar);
        synchronized (this) {
            a(dVar);
            d2 = d(dVar);
            h2 = h(dVar);
        }
        c.d.d.h.a.b(h2);
        if (!d2) {
            dVar = null;
        }
        e(dVar);
        d();
        c();
    }

    public synchronized int a() {
        return this.f3214b.a() - this.f3213a.a();
    }

    @Override // c.d.j.d.p
    public int a(c.d.d.d.j<K> jVar) {
        ArrayList<d<K, V>> b2;
        ArrayList<d<K, V>> b3;
        synchronized (this) {
            b2 = this.f3213a.b((c.d.d.d.j) jVar);
            b3 = this.f3214b.b((c.d.d.d.j) jVar);
            a(b3);
        }
        b((ArrayList) b3);
        c(b2);
        d();
        c();
        return b3.size();
    }

    @Override // c.d.j.d.p
    public c.d.d.h.a<V> a(K k, c.d.d.h.a<V> aVar) {
        return a(k, aVar, null);
    }

    public c.d.d.h.a<V> a(K k, c.d.d.h.a<V> aVar, e<K> eVar) {
        d<K, V> b2;
        c.d.d.h.a<V> aVar2;
        c.d.d.h.a<V> aVar3;
        c.d.d.d.i.a(k);
        c.d.d.d.i.a(aVar);
        d();
        synchronized (this) {
            b2 = this.f3213a.b((g<K, d<K, V>>) k);
            d<K, V> b3 = this.f3214b.b((g<K, d<K, V>>) k);
            aVar2 = null;
            if (b3 != null) {
                c(b3);
                aVar3 = h(b3);
            } else {
                aVar3 = null;
            }
            if (b((h<K, V>) aVar.b())) {
                d<K, V> a2 = d.a(k, aVar, eVar);
                this.f3214b.a(k, a2);
                aVar2 = g(a2);
            }
        }
        c.d.d.h.a.b(aVar3);
        f(b2);
        c();
        return aVar2;
    }

    public synchronized int b() {
        return this.f3214b.c() - this.f3213a.c();
    }

    @Override // c.d.j.d.p
    public synchronized boolean b(c.d.d.d.j<K> jVar) {
        return !this.f3214b.a((c.d.d.d.j) jVar).isEmpty();
    }

    @Override // c.d.j.d.p
    public c.d.d.h.a<V> get(K k) {
        d<K, V> b2;
        c.d.d.h.a<V> g2;
        c.d.d.d.i.a(k);
        synchronized (this) {
            b2 = this.f3213a.b((g<K, d<K, V>>) k);
            d<K, V> a2 = this.f3214b.a((g<K, d<K, V>>) k);
            g2 = a2 != null ? g(a2) : null;
        }
        f(b2);
        d();
        c();
        return g2;
    }
}

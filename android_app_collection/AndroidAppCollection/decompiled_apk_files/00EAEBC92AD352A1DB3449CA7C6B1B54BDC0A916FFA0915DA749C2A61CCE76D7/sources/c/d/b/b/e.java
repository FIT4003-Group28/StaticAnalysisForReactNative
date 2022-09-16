package c.d.b.b;

import android.content.Context;
import c.d.b.a.a;
import c.d.b.a.c;
import c.d.b.b.d;
import c.d.d.i.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class e implements i, c.d.d.a.a {
    private static final Class<?> q = e.class;
    private static final long r = TimeUnit.HOURS.toMillis(2);
    private static final long s = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final long f2773a;

    /* renamed from: b  reason: collision with root package name */
    private final long f2774b;

    /* renamed from: c  reason: collision with root package name */
    private final CountDownLatch f2775c;

    /* renamed from: d  reason: collision with root package name */
    private long f2776d;

    /* renamed from: e  reason: collision with root package name */
    private final c.d.b.a.c f2777e;

    /* renamed from: f  reason: collision with root package name */
    final Set<String> f2778f;

    /* renamed from: g  reason: collision with root package name */
    private long f2779g;

    /* renamed from: h  reason: collision with root package name */
    private final c.d.d.i.a f2780h;
    private final d i;
    private final h j;
    private final c.d.b.a.a k;
    private final boolean l;
    private final b m;
    private final com.facebook.common.time.a n;
    private final Object o = new Object();
    private boolean p;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.o) {
                e.this.c();
            }
            e.this.p = true;
            e.this.f2775c.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2782a = false;

        /* renamed from: b  reason: collision with root package name */
        private long f2783b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f2784c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f2784c;
        }

        public synchronized void a(long j, long j2) {
            if (this.f2782a) {
                this.f2783b += j;
                this.f2784c += j2;
            }
        }

        public synchronized long b() {
            return this.f2783b;
        }

        public synchronized void b(long j, long j2) {
            this.f2784c = j2;
            this.f2783b = j;
            this.f2782a = true;
        }

        public synchronized boolean c() {
            return this.f2782a;
        }

        public synchronized void d() {
            this.f2782a = false;
            this.f2784c = -1L;
            this.f2783b = -1L;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f2785a;

        /* renamed from: b  reason: collision with root package name */
        public final long f2786b;

        /* renamed from: c  reason: collision with root package name */
        public final long f2787c;

        public c(long j, long j2, long j3) {
            this.f2785a = j;
            this.f2786b = j2;
            this.f2787c = j3;
        }
    }

    public e(d dVar, h hVar, c cVar, c.d.b.a.c cVar2, c.d.b.a.a aVar, c.d.d.a.b bVar, Context context, Executor executor, boolean z) {
        this.f2773a = cVar.f2786b;
        long j = cVar.f2787c;
        this.f2774b = j;
        this.f2776d = j;
        this.f2780h = c.d.d.i.a.b();
        this.i = dVar;
        this.j = hVar;
        this.f2779g = -1L;
        this.f2777e = cVar2;
        long j2 = cVar.f2785a;
        this.k = aVar;
        this.m = new b();
        this.n = com.facebook.common.time.c.a();
        this.l = z;
        this.f2778f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (!this.l) {
            this.f2775c = new CountDownLatch(0);
            return;
        }
        this.f2775c = new CountDownLatch(1);
        executor.execute(new a());
    }

    private c.d.a.a a(d.b bVar, c.d.b.a.d dVar, String str) {
        c.d.a.a a2;
        synchronized (this.o) {
            a2 = bVar.a(dVar);
            this.f2778f.add(str);
            this.m.a(a2.size(), 1L);
        }
        return a2;
    }

    private d.b a(String str, c.d.b.a.d dVar) {
        b();
        return this.i.a(str, dVar);
    }

    private Collection<d.a> a(Collection<d.a> collection) {
        long now = this.n.now() + r;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (d.a aVar : collection) {
            if (aVar.c() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.j.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void a(long j, c.a aVar) {
        try {
            Collection<d.a> a2 = a(this.i.mo115b());
            long b2 = this.m.b();
            long j2 = b2 - j;
            int i = 0;
            long j3 = 0;
            for (d.a aVar2 : a2) {
                if (j3 > j2) {
                    break;
                }
                long a3 = this.i.a(aVar2);
                this.f2778f.remove(aVar2.a());
                if (a3 > 0) {
                    i++;
                    j3 += a3;
                    j b3 = j.b();
                    b3.a(aVar2.a());
                    b3.a(aVar);
                    b3.c(a3);
                    b3.b(b2 - j3);
                    b3.a(j);
                    this.f2777e.c(b3);
                    b3.a();
                }
            }
            this.m.a(-j3, -i);
            this.i.d();
        } catch (IOException e2) {
            c.d.b.a.a aVar3 = this.k;
            a.EnumC0068a enumC0068a = a.EnumC0068a.EVICTION;
            Class<?> cls = q;
            aVar3.a(enumC0068a, cls, "evictAboveSize: " + e2.getMessage(), e2);
            throw e2;
        }
    }

    private void b() {
        synchronized (this.o) {
            boolean c2 = c();
            e();
            long b2 = this.m.b();
            if (b2 > this.f2776d && !c2) {
                this.m.d();
                c();
            }
            if (b2 > this.f2776d) {
                a((this.f2776d * 9) / 10, c.a.CACHE_FULL);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        long now = this.n.now();
        if (this.m.c()) {
            long j = this.f2779g;
            if (j != -1 && now - j <= s) {
                return false;
            }
        }
        return d();
    }

    private boolean d() {
        long j;
        long now = this.n.now();
        long j2 = r + now;
        Set<String> hashSet = (!this.l || !this.f2778f.isEmpty()) ? this.l ? new HashSet<>() : null : this.f2778f;
        try {
            long j3 = -1;
            int i = 0;
            int i2 = 0;
            long j4 = 0;
            boolean z = false;
            int i3 = 0;
            for (d.a aVar : this.i.mo115b()) {
                i3++;
                j4 += aVar.b();
                if (aVar.c() > j2) {
                    i++;
                    j = j2;
                    int b2 = (int) (i2 + aVar.b());
                    j3 = Math.max(aVar.c() - now, j3);
                    i2 = b2;
                    z = true;
                } else {
                    j = j2;
                    if (this.l) {
                        hashSet.add(aVar.a());
                    }
                }
                j2 = j;
            }
            if (z) {
                this.k.a(a.EnumC0068a.READ_INVALID_ENTRY, q, "Future timestamp found in " + i + " files , with a total size of " + i2 + " bytes, and a maximum time delta of " + j3 + "ms", null);
            }
            long j5 = i3;
            if (this.m.a() != j5 || this.m.b() != j4) {
                if (this.l && this.f2778f != hashSet) {
                    this.f2778f.clear();
                    this.f2778f.addAll(hashSet);
                }
                this.m.b(j4, j5);
            }
            this.f2779g = now;
            return true;
        } catch (IOException e2) {
            this.k.a(a.EnumC0068a.GENERIC_IO, q, "calcFileCacheSize: " + e2.getMessage(), e2);
            return false;
        }
    }

    private void e() {
        this.f2776d = this.f2780h.a(this.i.c() ? a.EnumC0072a.EXTERNAL : a.EnumC0072a.INTERNAL, this.f2774b - this.m.b()) ? this.f2773a : this.f2774b;
    }

    @Override // c.d.b.b.i
    public c.d.a.a a(c.d.b.a.d dVar, c.d.b.a.j jVar) {
        String a2;
        j b2 = j.b();
        b2.a(dVar);
        this.f2777e.g(b2);
        synchronized (this.o) {
            a2 = c.d.b.a.e.a(dVar);
        }
        b2.a(a2);
        try {
            try {
                d.b a3 = a(a2, dVar);
                try {
                    a3.a(jVar, dVar);
                    c.d.a.a a4 = a(a3, dVar, a2);
                    b2.c(a4.size());
                    b2.b(this.m.b());
                    this.f2777e.b(b2);
                    return a4;
                } finally {
                    if (!a3.x()) {
                        c.d.d.e.a.a(q, "Failed to delete temp file");
                    }
                }
            } catch (IOException e2) {
                b2.a(e2);
                this.f2777e.e(b2);
                c.d.d.e.a.a(q, "Failed inserting a file into the cache", (Throwable) e2);
                throw e2;
            }
        } finally {
            b2.a();
        }
    }

    @Override // c.d.b.b.i
    public void a() {
        synchronized (this.o) {
            try {
                this.i.a();
                this.f2778f.clear();
                this.f2777e.a();
            } catch (IOException | NullPointerException e2) {
                c.d.b.a.a aVar = this.k;
                a.EnumC0068a enumC0068a = a.EnumC0068a.EVICTION;
                Class<?> cls = q;
                aVar.a(enumC0068a, cls, "clearAll: " + e2.getMessage(), e2);
            }
            this.m.d();
        }
    }

    @Override // c.d.b.b.i
    public void a(c.d.b.a.d dVar) {
        synchronized (this.o) {
            try {
                List<String> b2 = c.d.b.a.e.b(dVar);
                for (int i = 0; i < b2.size(); i++) {
                    String str = b2.get(i);
                    this.i.a(str);
                    this.f2778f.remove(str);
                }
            } catch (IOException e2) {
                c.d.b.a.a aVar = this.k;
                a.EnumC0068a enumC0068a = a.EnumC0068a.DELETE_FILE;
                Class<?> cls = q;
                aVar.a(enumC0068a, cls, "delete: " + e2.getMessage(), e2);
            }
        }
    }

    @Override // c.d.b.b.i
    public boolean b(c.d.b.a.d dVar) {
        synchronized (this.o) {
            if (d(dVar)) {
                return true;
            }
            try {
                List<String> b2 = c.d.b.a.e.b(dVar);
                for (int i = 0; i < b2.size(); i++) {
                    String str = b2.get(i);
                    if (this.i.b(str, dVar)) {
                        this.f2778f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // c.d.b.b.i
    public c.d.a.a c(c.d.b.a.d dVar) {
        c.d.a.a aVar;
        j b2 = j.b();
        b2.a(dVar);
        try {
            synchronized (this.o) {
                List<String> b3 = c.d.b.a.e.b(dVar);
                String str = null;
                aVar = null;
                for (int i = 0; i < b3.size(); i++) {
                    str = b3.get(i);
                    b2.a(str);
                    aVar = this.i.c(str, dVar);
                    if (aVar != null) {
                        break;
                    }
                }
                if (aVar == null) {
                    this.f2777e.a(b2);
                    this.f2778f.remove(str);
                } else {
                    this.f2777e.f(b2);
                    this.f2778f.add(str);
                }
            }
            return aVar;
        } catch (IOException e2) {
            this.k.a(a.EnumC0068a.GENERIC_IO, q, "getResource", e2);
            b2.a(e2);
            this.f2777e.d(b2);
            return null;
        } finally {
            b2.a();
        }
    }

    @Override // c.d.b.b.i
    public boolean d(c.d.b.a.d dVar) {
        synchronized (this.o) {
            List<String> b2 = c.d.b.a.e.b(dVar);
            for (int i = 0; i < b2.size(); i++) {
                if (this.f2778f.contains(b2.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }
}

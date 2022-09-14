package com.facebook.b.b;

import android.content.Context;
import com.facebook.b.a.a;
import com.facebook.b.a.c;
import com.facebook.b.b.d;
import com.facebook.common.j.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: DiskStorageCache.java */
/* loaded from: classes.dex */
public class e implements i, com.facebook.common.a.a {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f2211b = e.class;

    /* renamed from: c  reason: collision with root package name */
    private static final long f2212c = TimeUnit.HOURS.toMillis(2);

    /* renamed from: d  reason: collision with root package name */
    private static final long f2213d = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    final Set<String> f2214a;
    private final long e;
    private final long f;
    private final CountDownLatch g;
    private long h;
    private final com.facebook.b.a.c i;
    private final long k;
    private final d m;
    private final h n;
    private final com.facebook.b.a.a o;
    private final boolean p;
    private final com.facebook.common.time.a r;
    private boolean t;
    private final Object s = new Object();
    private final com.facebook.common.j.a l = com.facebook.common.j.a.a();
    private long j = -1;
    private final a q = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskStorageCache.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2216a = false;

        /* renamed from: b  reason: collision with root package name */
        private long f2217b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f2218c = -1;

        a() {
        }

        public synchronized boolean a() {
            return this.f2216a;
        }

        public synchronized void b() {
            this.f2216a = false;
            this.f2218c = -1L;
            this.f2217b = -1L;
        }

        public synchronized void a(long j, long j2) {
            this.f2218c = j2;
            this.f2217b = j;
            this.f2216a = true;
        }

        public synchronized void b(long j, long j2) {
            if (this.f2216a) {
                this.f2217b += j;
                this.f2218c += j2;
            }
        }

        public synchronized long c() {
            return this.f2217b;
        }

        public synchronized long d() {
            return this.f2218c;
        }
    }

    /* compiled from: DiskStorageCache.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f2219a;

        /* renamed from: b  reason: collision with root package name */
        public final long f2220b;

        /* renamed from: c  reason: collision with root package name */
        public final long f2221c;

        public b(long j, long j2, long j3) {
            this.f2219a = j;
            this.f2220b = j2;
            this.f2221c = j3;
        }
    }

    public e(d dVar, h hVar, b bVar, com.facebook.b.a.c cVar, com.facebook.b.a.a aVar, com.facebook.common.a.b bVar2, Context context, Executor executor, boolean z) {
        this.e = bVar.f2220b;
        this.f = bVar.f2221c;
        this.h = bVar.f2221c;
        this.m = dVar;
        this.n = hVar;
        this.i = cVar;
        this.k = bVar.f2219a;
        this.o = aVar;
        if (bVar2 != null) {
            bVar2.a(this);
        }
        this.r = com.facebook.common.time.b.b();
        this.p = z;
        this.f2214a = new HashSet();
        if (this.p) {
            this.g = new CountDownLatch(1);
            executor.execute(new Runnable() { // from class: com.facebook.b.b.e.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (e.this.s) {
                        e.this.d();
                    }
                    e.this.t = true;
                    e.this.g.countDown();
                }
            });
            return;
        }
        this.g = new CountDownLatch(0);
    }

    @Override // com.facebook.b.b.i
    public com.facebook.a.a a(com.facebook.b.a.d dVar) {
        com.facebook.a.a aVar;
        j a2 = j.a().a(dVar);
        try {
            synchronized (this.s) {
                List<String> a3 = com.facebook.b.a.e.a(dVar);
                String str = null;
                aVar = null;
                for (int i = 0; i < a3.size(); i++) {
                    str = a3.get(i);
                    a2.a(str);
                    aVar = this.m.b(str, dVar);
                    if (aVar != null) {
                        break;
                    }
                }
                if (aVar == null) {
                    this.i.b(a2);
                    this.f2214a.remove(str);
                } else {
                    this.i.a(a2);
                    this.f2214a.add(str);
                }
            }
            return aVar;
        } catch (IOException e) {
            this.o.a(a.EnumC0042a.GENERIC_IO, f2211b, "getResource", e);
            a2.a(e);
            this.i.e(a2);
            return null;
        } finally {
            a2.b();
        }
    }

    private d.b a(String str, com.facebook.b.a.d dVar) {
        b();
        return this.m.a(str, dVar);
    }

    private com.facebook.a.a a(d.b bVar, com.facebook.b.a.d dVar, String str) {
        com.facebook.a.a a2;
        synchronized (this.s) {
            a2 = bVar.a(dVar);
            this.f2214a.add(str);
            this.q.b(a2.b(), 1L);
        }
        return a2;
    }

    @Override // com.facebook.b.b.i
    public com.facebook.a.a a(com.facebook.b.a.d dVar, com.facebook.b.a.j jVar) {
        String b2;
        j a2 = j.a().a(dVar);
        this.i.c(a2);
        synchronized (this.s) {
            b2 = com.facebook.b.a.e.b(dVar);
        }
        a2.a(b2);
        try {
            try {
                d.b a3 = a(b2, dVar);
                try {
                    a3.a(jVar, dVar);
                    com.facebook.a.a a4 = a(a3, dVar, b2);
                    a2.a(a4.b()).b(this.q.c());
                    this.i.d(a2);
                    return a4;
                } finally {
                    if (!a3.a()) {
                        com.facebook.common.e.a.d(f2211b, "Failed to delete temp file");
                    }
                }
            } finally {
                a2.b();
            }
        } catch (IOException e) {
            a2.a(e);
            this.i.f(a2);
            com.facebook.common.e.a.b(f2211b, "Failed inserting a file into the cache", (Throwable) e);
            throw e;
        }
    }

    private void b() {
        synchronized (this.s) {
            boolean d2 = d();
            c();
            long c2 = this.q.c();
            if (c2 > this.h && !d2) {
                this.q.b();
                d();
            }
            if (c2 > this.h) {
                a((this.h * 9) / 10, c.a.CACHE_FULL);
            }
        }
    }

    private void a(long j, c.a aVar) {
        try {
            Collection<d.a> a2 = a(this.m.e());
            long c2 = this.q.c();
            long j2 = c2 - j;
            int i = 0;
            Iterator<d.a> it = a2.iterator();
            long j3 = 0;
            while (it.hasNext()) {
                d.a next = it.next();
                if (j3 > j2) {
                    break;
                }
                long a3 = this.m.a(next);
                Iterator<d.a> it2 = it;
                this.f2214a.remove(next.a());
                if (a3 > 0) {
                    i++;
                    j3 += a3;
                    j c3 = j.a().a(next.a()).a(aVar).a(a3).b(c2 - j3).c(j);
                    this.i.g(c3);
                    c3.b();
                }
                it = it2;
            }
            this.q.b(-j3, -i);
            this.m.b();
        } catch (IOException e) {
            com.facebook.b.a.a aVar2 = this.o;
            a.EnumC0042a enumC0042a = a.EnumC0042a.EVICTION;
            Class<?> cls = f2211b;
            aVar2.a(enumC0042a, cls, "evictAboveSize: " + e.getMessage(), e);
            throw e;
        }
    }

    private Collection<d.a> a(Collection<d.a> collection) {
        long a2 = this.r.a() + f2212c;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (d.a aVar : collection) {
            if (aVar.b() > a2) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.n.a());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void c() {
        if (this.l.a(this.m.a() ? a.EnumC0052a.EXTERNAL : a.EnumC0052a.INTERNAL, this.f - this.q.c())) {
            this.h = this.e;
        } else {
            this.h = this.f;
        }
    }

    @Override // com.facebook.b.b.i
    public void a() {
        synchronized (this.s) {
            try {
                this.m.c();
                this.f2214a.clear();
                this.i.a();
            } catch (IOException e) {
                com.facebook.b.a.a aVar = this.o;
                a.EnumC0042a enumC0042a = a.EnumC0042a.EVICTION;
                Class<?> cls = f2211b;
                aVar.a(enumC0042a, cls, "clearAll: " + e.getMessage(), e);
            }
            this.q.b();
        }
    }

    @Override // com.facebook.b.b.i
    public boolean b(com.facebook.b.a.d dVar) {
        synchronized (this.s) {
            List<String> a2 = com.facebook.b.a.e.a(dVar);
            for (int i = 0; i < a2.size(); i++) {
                if (this.f2214a.contains(a2.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.facebook.b.b.i
    public boolean c(com.facebook.b.a.d dVar) {
        synchronized (this.s) {
            if (b(dVar)) {
                return true;
            }
            try {
                List<String> a2 = com.facebook.b.a.e.a(dVar);
                for (int i = 0; i < a2.size(); i++) {
                    String str = a2.get(i);
                    if (this.m.c(str, dVar)) {
                        this.f2214a.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        long a2 = this.r.a();
        if (!this.q.a() || this.j == -1 || a2 - this.j > f2213d) {
            return e();
        }
        return false;
    }

    private boolean e() {
        Set<String> hashSet;
        long j;
        long j2;
        long a2 = this.r.a();
        long j3 = f2212c + a2;
        if (this.p && this.f2214a.isEmpty()) {
            hashSet = this.f2214a;
        } else {
            hashSet = this.p ? new HashSet<>() : null;
        }
        try {
            Iterator<d.a> it = this.m.e().iterator();
            long j4 = -1;
            int i = 0;
            int i2 = 0;
            long j5 = 0;
            boolean z = false;
            int i3 = 0;
            while (it.hasNext()) {
                Iterator<d.a> it2 = it;
                d.a next = it.next();
                i3++;
                j5 += next.d();
                if (next.b() > j3) {
                    i++;
                    j2 = j3;
                    j4 = Math.max(next.b() - a2, j4);
                    i2 = (int) (i2 + next.d());
                    z = true;
                } else {
                    j2 = j3;
                    if (this.p) {
                        hashSet.add(next.a());
                    }
                }
                it = it2;
                j3 = j2;
            }
            if (z) {
                com.facebook.b.a.a aVar = this.o;
                a.EnumC0042a enumC0042a = a.EnumC0042a.READ_INVALID_ENTRY;
                Class<?> cls = f2211b;
                StringBuilder sb = new StringBuilder();
                j = a2;
                sb.append("Future timestamp found in ");
                sb.append(i);
                sb.append(" files , with a total size of ");
                sb.append(i2);
                sb.append(" bytes, and a maximum time delta of ");
                sb.append(j4);
                sb.append("ms");
                aVar.a(enumC0042a, cls, sb.toString(), null);
            } else {
                j = a2;
            }
            long j6 = i3;
            if (this.q.d() != j6 || this.q.c() != j5) {
                if (this.p && this.f2214a != hashSet) {
                    this.f2214a.clear();
                    this.f2214a.addAll(hashSet);
                }
                this.q.a(j5, j6);
            }
            this.j = j;
            return true;
        } catch (IOException e) {
            this.o.a(a.EnumC0042a.GENERIC_IO, f2211b, "calcFileCacheSize: " + e.getMessage(), e);
            return false;
        }
    }
}

package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dbwu  reason: default package */
/* loaded from: classes.dex */
public final class dbwu<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final Logger a = Logger.getLogger(dbwu.class.getName());
    static final dbwg<Object, Object> t = new dbuw();
    static final Queue<?> u = new dbux();
    final int b;
    final int c;
    final dbvx<K, V>[] d;
    final int e;
    final dbrl<Object> f;
    final dbrl<Object> g;
    final dbvz h;
    final dbvz i;
    final long j;
    final dbwz<K, V> k;
    final long l;
    final long m;
    final long n;
    final Queue<dbwy<K, V>> o;
    final dbwx<K, V> p;
    final dbug q;
    final dbvj r;
    public final dbus<? super K, V> s;
    Set<K> v;
    Collection<V> w;
    Set<Map.Entry<K, V>> x;
    public final dbuk y;

    public dbwu(dbuo<? super K, ? super V> dbuoVar, dbus<? super K, V> dbusVar) {
        long j;
        int i = dbuoVar.e;
        this.e = Math.min(i == -1 ? 4 : i, (int) ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        dbvz b = dbuoVar.b();
        this.h = b;
        this.i = dbuoVar.c();
        this.f = (dbrl) dbsc.a(dbuoVar.m, dbuoVar.b().a());
        this.g = (dbrl) dbsc.a(dbuoVar.n, dbuoVar.c().a());
        if (dbuoVar.k == 0 || dbuoVar.l == 0) {
            j = 0;
        } else {
            j = dbuoVar.h == null ? dbuoVar.f : dbuoVar.g;
        }
        this.j = j;
        this.k = (dbwz) dbsc.a(dbuoVar.h, dbun.a);
        long j2 = dbuoVar.l;
        this.l = j2 == -1 ? 0L : j2;
        long j3 = dbuoVar.k;
        this.m = j3 == -1 ? 0L : j3;
        this.n = 0L;
        dbwx<K, V> dbwxVar = (dbwx) dbsc.a(dbuoVar.o, dbum.a);
        this.p = dbwxVar;
        this.o = dbwxVar == dbum.a ? (Queue<dbwy<K, V>>) u : new ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = f() || d();
        dbug dbugVar = dbuoVar.p;
        this.q = dbugVar == null ? z ? dbug.b : dbuo.b : dbugVar;
        this.r = dbvj.b(b, e() || d(), c() || f());
        this.y = (dbuk) ((dbuc) dbuoVar.q).a;
        this.s = dbusVar;
        int i4 = dbuoVar.d;
        int min = Math.min(i4 == -1 ? 16 : i4, 1073741824);
        if (a() && !b()) {
            min = (int) Math.min(min, j);
        }
        int i5 = 1;
        int i6 = 0;
        while (i5 < this.e && (!a() || i5 * 20 <= this.j)) {
            i6++;
            i5 += i5;
        }
        this.c = 32 - i6;
        this.b = i5 - 1;
        this.d = new dbvx[i5];
        int i7 = min / i5;
        while (i3 < (i7 * i5 < min ? i7 + 1 : i7)) {
            i3 += i3;
        }
        if (a()) {
            long j4 = this.j;
            long j5 = i5;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                dbvx<K, V>[] dbvxVarArr = this.d;
                if (i2 >= dbvxVarArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                dbvxVarArr[i2] = t(i3, j6, (dbuk) ((dbuc) dbuoVar.q).a);
                i2++;
            }
        } else {
            while (true) {
                dbvx<K, V>[] dbvxVarArr2 = this.d;
                if (i2 >= dbvxVarArr2.length) {
                    return;
                }
                dbvxVarArr2[i2] = t(i3, -1L, (dbuk) ((dbuc) dbuoVar.q).a);
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> dbwv<K, V> i() {
        return dbvw.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void m(dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
        dbwvVar.i(dbwvVar2);
        dbwvVar2.k(dbwvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void n(dbwv<K, V> dbwvVar) {
        dbvw dbvwVar = dbvw.a;
        dbwvVar.i(dbvwVar);
        dbwvVar.k(dbvwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void o(dbwv<K, V> dbwvVar, dbwv<K, V> dbwvVar2) {
        dbwvVar.o(dbwvVar2);
        dbwvVar2.q(dbwvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void p(dbwv<K, V> dbwvVar) {
        dbvw dbvwVar = dbvw.a;
        dbwvVar.o(dbvwVar);
        dbwvVar.q(dbvwVar);
    }

    public static <E> ArrayList<E> s(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        dcgh.g(arrayList, collection.iterator());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.k != dbun.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.m > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089 A[Catch: all -> 0x00b0, LOOP:5: B:34:0x0089->B:36:0x0091, LOOP_START, TryCatch #0 {all -> 0x00b0, blocks: (B:7:0x0010, B:8:0x001e, B:10:0x0024, B:12:0x002c, B:14:0x0036, B:18:0x0047, B:20:0x004c, B:19:0x004a, B:21:0x005a, B:22:0x005f, B:24:0x0063, B:26:0x0069, B:27:0x0070, B:29:0x0078, B:31:0x0080, B:37:0x0092, B:34:0x0089), top: B:44:0x0010 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r12 = this;
            dbvx<K, V>[] r0 = r12.d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto Lbc
            r4 = r0[r3]
            int r5 = r4.b
            if (r5 == 0) goto Lb8
            r4.lock()
            dbwu<K, V> r5 = r4.a     // Catch: java.lang.Throwable -> Lb0
            dbug r5 = r5.q     // Catch: java.lang.Throwable -> Lb0
            long r5 = r5.a()     // Catch: java.lang.Throwable -> Lb0
            r4.w(r5)     // Catch: java.lang.Throwable -> Lb0
            java.util.concurrent.atomic.AtomicReferenceArray<dbwv<K, V>> r5 = r4.f     // Catch: java.lang.Throwable -> Lb0
            r6 = 0
        L1e:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> Lb0
            if (r6 >= r7) goto L62
            java.lang.Object r7 = r5.get(r6)     // Catch: java.lang.Throwable -> Lb0
            dbwv r7 = (defpackage.dbwv) r7     // Catch: java.lang.Throwable -> Lb0
        L2a:
            if (r7 == 0) goto L5f
            dbwg r8 = r7.a()     // Catch: java.lang.Throwable -> Lb0
            boolean r8 = r8.e()     // Catch: java.lang.Throwable -> Lb0
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r7.e()     // Catch: java.lang.Throwable -> Lb0
            dbwg r9 = r7.a()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> Lb0
            if (r8 == 0) goto L4a
            if (r9 != 0) goto L47
            goto L4a
        L47:
            dbww r10 = defpackage.dbww.EXPLICIT     // Catch: java.lang.Throwable -> Lb0
            goto L4c
        L4a:
            dbww r10 = defpackage.dbww.COLLECTED     // Catch: java.lang.Throwable -> Lb0
        L4c:
            r7.d()     // Catch: java.lang.Throwable -> Lb0
            dbwg r11 = r7.a()     // Catch: java.lang.Throwable -> Lb0
            int r11 = r11.a()     // Catch: java.lang.Throwable -> Lb0
            r4.y(r8, r9, r11, r10)     // Catch: java.lang.Throwable -> Lb0
        L5a:
            dbwv r7 = r7.c()     // Catch: java.lang.Throwable -> Lb0
            goto L2a
        L5f:
            int r6 = r6 + 1
            goto L1e
        L62:
            r6 = 0
        L63:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> Lb0
            if (r6 >= r7) goto L70
            r7 = 0
            r5.set(r6, r7)     // Catch: java.lang.Throwable -> Lb0
            int r6 = r6 + 1
            goto L63
        L70:
            dbwu<K, V> r5 = r4.a     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = r5.g()     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L80
        L78:
            java.lang.ref.ReferenceQueue<K> r5 = r4.h     // Catch: java.lang.Throwable -> Lb0
            java.lang.ref.Reference r5 = r5.poll()     // Catch: java.lang.Throwable -> Lb0
            if (r5 != 0) goto L78
        L80:
            dbwu<K, V> r5 = r4.a     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = r5.h()     // Catch: java.lang.Throwable -> Lb0
            if (r5 != 0) goto L89
            goto L92
        L89:
            java.lang.ref.ReferenceQueue<V> r5 = r4.i     // Catch: java.lang.Throwable -> Lb0
            java.lang.ref.Reference r5 = r5.poll()     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L92
            goto L89
        L92:
            java.util.Queue<dbwv<K, V>> r5 = r4.l     // Catch: java.lang.Throwable -> Lb0
            r5.clear()     // Catch: java.lang.Throwable -> Lb0
            java.util.Queue<dbwv<K, V>> r5 = r4.m     // Catch: java.lang.Throwable -> Lb0
            r5.clear()     // Catch: java.lang.Throwable -> Lb0
            java.util.concurrent.atomic.AtomicInteger r5 = r4.k     // Catch: java.lang.Throwable -> Lb0
            r5.set(r2)     // Catch: java.lang.Throwable -> Lb0
            int r5 = r4.d     // Catch: java.lang.Throwable -> Lb0
            int r5 = r5 + 1
            r4.d = r5     // Catch: java.lang.Throwable -> Lb0
            r4.b = r2     // Catch: java.lang.Throwable -> Lb0
            r4.unlock()
            r4.x()
            goto Lb8
        Lb0:
            r0 = move-exception
            r4.unlock()
            r4.x()
            throw r0
        Lb8:
            int r3 = r3 + 1
            goto L5
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbwu.clear():void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        dbwv<K, V> o;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int j = j(obj);
        dbvx<K, V> k = k(j);
        try {
            if (k.b != 0 && (o = k.o(obj, j, k.a.q.a())) != null) {
                if (o.a().get() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            k.v();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long a2 = this.q.a();
        dbvx<K, V>[] dbvxVarArr = this.d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = dbvxVarArr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                dbvx<K, V> dbvxVar = dbvxVarArr[i2];
                int i3 = dbvxVar.b;
                AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = dbvxVar.f;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    dbwv<K, V> dbwvVar = atomicReferenceArray.get(i4);
                    while (dbwvVar != null) {
                        dbvx<K, V>[] dbvxVarArr2 = dbvxVarArr;
                        V p = dbvxVar.p(dbwvVar, a2);
                        long j3 = a2;
                        if (p != null && this.g.c(obj, p)) {
                            return true;
                        }
                        dbwvVar = dbwvVar.c();
                        dbvxVarArr = dbvxVarArr2;
                        a2 = j3;
                    }
                }
                j2 += dbvxVar.d;
                i2++;
                a2 = a2;
            }
            long j4 = a2;
            dbvx<K, V>[] dbvxVarArr3 = dbvxVarArr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            dbvxVarArr = dbvxVarArr3;
            a2 = j4;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.l > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return d() || a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.x;
        if (set != null) {
            return set;
        }
        dbvl dbvlVar = new dbvl(this);
        this.x = dbvlVar;
        return dbvlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        return c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return this.h != dbvz.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int j = j(obj);
        return k(j).c(obj, j);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this.i != dbvz.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        dbvx<K, V>[] dbvxVarArr = this.d;
        long j = 0;
        for (int i = 0; i < dbvxVarArr.length; i++) {
            if (dbvxVarArr[i].b != 0) {
                return false;
            }
            j += dbvxVarArr[i].d;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < dbvxVarArr.length; i2++) {
                if (dbvxVarArr[i2].b != 0) {
                    return false;
                }
                j -= dbvxVarArr[i2].d;
            }
            return j == 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int j(Object obj) {
        int d = this.f.d(obj);
        int i = d + ((d << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbvx<K, V> k(int i) {
        return this.d[(i >>> this.c) & this.b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.v;
        if (set != null) {
            return set;
        }
        dbvo dbvoVar = new dbvo(this);
        this.v = dbvoVar;
        return dbvoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l(dbwv<K, V> dbwvVar, long j) {
        dbsk.s(dbwvVar);
        if (!d() || j - dbwvVar.f() < this.l) {
            return c() && j - dbwvVar.l() >= this.m;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        dbsk.s(k);
        dbsk.s(v);
        int j = j(k);
        return k(j).q(k, j, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        dbsk.s(k);
        dbsk.s(v);
        int j = j(k);
        return k(j).q(k, j, v, true);
    }

    /* JADX WARN: Finally extract failed */
    public final V q(K k, dbus<? super K, V> dbusVar) {
        dbvr<K, V> dbvrVar;
        dbwg<K, V> dbwgVar;
        boolean z;
        V e;
        dbwv<K, V> n;
        dbsk.s(k);
        int j = j(k);
        dbvx<K, V> k2 = k(j);
        dbsk.s(k);
        dbsk.s(dbusVar);
        try {
            try {
                try {
                    if (k2.b != 0 && (n = k2.n(k, j)) != null) {
                        long a2 = k2.a.q.a();
                        V p = k2.p(n, a2);
                        if (p != null) {
                            k2.h(n, a2);
                            dbuk dbukVar = k2.n;
                            e = (V) dbvx.B(p);
                        } else {
                            dbwg<K, V> a3 = n.a();
                            if (a3.d()) {
                                e = k2.d(n, k, a3);
                            }
                        }
                        return e;
                    }
                    long a4 = k2.a.q.a();
                    k2.w(a4);
                    int i = k2.b - 1;
                    AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = k2.f;
                    int length = (atomicReferenceArray.length() - 1) & j;
                    dbwv<K, V> dbwvVar = atomicReferenceArray.get(length);
                    dbwv<K, V> dbwvVar2 = dbwvVar;
                    while (true) {
                        dbvrVar = null;
                        if (dbwvVar2 == null) {
                            dbwgVar = null;
                            break;
                        }
                        K e2 = dbwvVar2.e();
                        if (dbwvVar2.d() != j || e2 == null || !k2.a.f.c(k, e2)) {
                            dbwvVar2 = dbwvVar2.c();
                        } else {
                            dbwgVar = dbwvVar2.a();
                            if (dbwgVar.d()) {
                                z = false;
                            } else {
                                V v = dbwgVar.get();
                                if (v == null) {
                                    k2.y(e2, null, dbwgVar.a(), dbww.COLLECTED);
                                } else if (k2.a.l(dbwvVar2, a4)) {
                                    k2.y(e2, v, dbwgVar.a(), dbww.EXPIRED);
                                } else {
                                    k2.i(dbwvVar2, a4);
                                    dbuk dbukVar2 = k2.n;
                                    e = v;
                                }
                                k2.l.remove(dbwvVar2);
                                k2.m.remove(dbwvVar2);
                                k2.b = i;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        dbvrVar = new dbvr<>();
                        if (dbwvVar2 == null) {
                            dbwvVar2 = k2.a(k, j, dbwvVar);
                            dbwvVar2.b(dbvrVar);
                            atomicReferenceArray.set(length, dbwvVar2);
                        } else {
                            dbwvVar2.b(dbvrVar);
                        }
                    }
                    if (z) {
                        try {
                            synchronized (dbwvVar2) {
                                e = k2.e(k, j, dbvrVar, dbvrVar.j(k, dbusVar));
                            }
                            dbuk dbukVar3 = k2.n;
                        } catch (Throwable th) {
                            dbuk dbukVar4 = k2.n;
                            throw th;
                        }
                    } else {
                        e = k2.d(dbwvVar2, k, dbwgVar);
                    }
                    return e;
                } finally {
                    k2.unlock();
                    k2.x();
                }
                k2.lock();
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof Error) {
                    throw new degf((Error) cause);
                }
                if (!(cause instanceof RuntimeException)) {
                    throw e3;
                }
                throw new deiw(cause);
            }
        } finally {
            k2.v();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<K, V> r(java.util.Set<? extends K> r7, defpackage.dbus<? super K, V> r8) {
        /*
            r6 = this;
            defpackage.dbsk.s(r8)
            dbtp r0 = defpackage.dbtp.b()
            r1 = 0
            r2 = 1
            java.util.Map r7 = r8.a(r7)     // Catch: java.lang.Throwable -> L95 java.lang.Error -> L97 java.lang.Exception -> L9e java.lang.RuntimeException -> La5 java.lang.InterruptedException -> Lac defpackage.dbur -> Lba
            if (r7 == 0) goto L6b
            r0.g()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r5 == 0) goto L37
            if (r4 != 0) goto L33
            goto L37
        L33:
            r6.put(r5, r4)
            goto L1a
        L37:
            r1 = 1
            goto L1a
        L39:
            if (r1 != 0) goto L41
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.d(r8)
            return r7
        L41:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.d(r7)
            dbuq r7 = new dbuq
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 42
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r8 = " returned null keys or values from loadAll"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.<init>(r8)
            throw r7
        L6b:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.d(r7)
            dbuq r7 = new dbuq
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 31
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r8 = " returned null map from loadAll"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.<init>(r8)
            throw r7
        L95:
            r7 = move-exception
            goto Lbe
        L97:
            r7 = move-exception
            degf r8 = new degf     // Catch: java.lang.Throwable -> L95
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L95
            throw r8     // Catch: java.lang.Throwable -> L95
        L9e:
            r7 = move-exception
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L95
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L95
            throw r8     // Catch: java.lang.Throwable -> L95
        La5:
            r7 = move-exception
            deiw r8 = new deiw     // Catch: java.lang.Throwable -> L95
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L95
            throw r8     // Catch: java.lang.Throwable -> L95
        Lac:
            r7 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L95
            r8.interrupt()     // Catch: java.lang.Throwable -> L95
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L95
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L95
            throw r8     // Catch: java.lang.Throwable -> L95
        Lba:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r7 = move-exception
            r1 = 1
        Lbe:
            if (r1 != 0) goto Lc5
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.d(r8)
        Lc5:
            goto Lc7
        Lc6:
            throw r7
        Lc7:
            goto Lc6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbwu.r(java.util.Set, dbus):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        r7 = r4.a();
        r13 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r13 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        r0 = defpackage.dbww.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r7.e() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        r0 = defpackage.dbww.COLLECTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        r9.d++;
        r10.set(r11, r9.A(r3, r4, r5, r13, r7, r8));
        r9.b--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return r13;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            int r1 = r12.j(r13)
            dbvx r9 = r12.k(r1)
            r9.lock()
            dbwu<K, V> r2 = r9.a     // Catch: java.lang.Throwable -> L86
            dbug r2 = r2.q     // Catch: java.lang.Throwable -> L86
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L86
            r9.w(r2)     // Catch: java.lang.Throwable -> L86
            int r2 = r9.b     // Catch: java.lang.Throwable -> L86
            java.util.concurrent.atomic.AtomicReferenceArray<dbwv<K, V>> r10 = r9.f     // Catch: java.lang.Throwable -> L86
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L86
            int r2 = r2 + (-1)
            r11 = r1 & r2
            java.lang.Object r2 = r10.get(r11)     // Catch: java.lang.Throwable -> L86
            r3 = r2
            dbwv r3 = (defpackage.dbwv) r3     // Catch: java.lang.Throwable -> L86
            r4 = r3
        L2e:
            if (r4 == 0) goto L7f
            java.lang.Object r5 = r4.e()     // Catch: java.lang.Throwable -> L86
            int r2 = r4.d()     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L7a
            if (r5 == 0) goto L7a
            dbwu<K, V> r2 = r9.a     // Catch: java.lang.Throwable -> L86
            dbrl<java.lang.Object> r2 = r2.f     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.c(r13, r5)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L7a
            dbwg r7 = r4.a()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L86
            if (r13 == 0) goto L54
            dbww r0 = defpackage.dbww.EXPLICIT     // Catch: java.lang.Throwable -> L86
        L52:
            r8 = r0
            goto L5d
        L54:
            boolean r1 = r7.e()     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L7f
            dbww r0 = defpackage.dbww.COLLECTED     // Catch: java.lang.Throwable -> L86
            goto L52
        L5d:
            int r0 = r9.d     // Catch: java.lang.Throwable -> L86
            int r0 = r0 + 1
            r9.d = r0     // Catch: java.lang.Throwable -> L86
            r2 = r9
            r6 = r13
            dbwv r0 = r2.A(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L86
            int r1 = r9.b     // Catch: java.lang.Throwable -> L86
            int r1 = r1 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> L86
            r9.b = r1     // Catch: java.lang.Throwable -> L86
            r9.unlock()
            r9.x()
            r0 = r13
            goto L85
        L7a:
            dbwv r4 = r4.c()     // Catch: java.lang.Throwable -> L86
            goto L2e
        L7f:
            r9.unlock()
            r9.x()
        L85:
            return r0
        L86:
            r13 = move-exception
            r9.unlock()
            r9.x()
            goto L8f
        L8e:
            throw r13
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbwu.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k, V v) {
        dbsk.s(k);
        dbsk.s(v);
        int j = j(k);
        dbvx<K, V> k2 = k(j);
        k2.lock();
        try {
            long a2 = k2.a.q.a();
            k2.w(a2);
            AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = k2.f;
            int length = j & (atomicReferenceArray.length() - 1);
            dbwv<K, V> dbwvVar = atomicReferenceArray.get(length);
            dbwv<K, V> dbwvVar2 = dbwvVar;
            while (true) {
                if (dbwvVar2 == null) {
                    break;
                }
                K e = dbwvVar2.e();
                if (dbwvVar2.d() != j || e == null || !k2.a.f.c(k, e)) {
                    dbwvVar2 = dbwvVar2.c();
                } else {
                    dbwg<K, V> a3 = dbwvVar2.a();
                    V v2 = a3.get();
                    if (v2 != null) {
                        k2.d++;
                        k2.y(k, v2, a3.a(), dbww.REPLACED);
                        k2.C(dbwvVar2, v, a2);
                        k2.m(dbwvVar2);
                        return v2;
                    } else if (a3.e()) {
                        int i = k2.b;
                        k2.d++;
                        atomicReferenceArray.set(length, k2.A(dbwvVar, dbwvVar2, e, null, a3, dbww.COLLECTED));
                        k2.b--;
                    }
                }
            }
            return null;
        } finally {
            k2.unlock();
            k2.x();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (dbvx<K, V> dbvxVar : this.d) {
            j += Math.max(0, dbvxVar.b);
        }
        return decl.b(j);
    }

    final dbvx<K, V> t(int i, long j, dbuk dbukVar) {
        return new dbvx<>(this, i, j, dbukVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.w;
        if (collection != null) {
            return collection;
        }
        dbwh dbwhVar = new dbwh(this);
        this.w = dbwhVar;
        return dbwhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        r7 = r4.a();
        r13 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r9.a.g.c(r14, r13) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        r14 = defpackage.dbww.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r13 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r7.e() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        r14 = defpackage.dbww.COLLECTED;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        r9.d++;
        r10.set(r11, r9.A(r3, r4, r5, r6, r7, r14));
        r9.b--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r14 != defpackage.dbww.EXPLICIT) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        r0 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L9a
            if (r14 != 0) goto L7
            goto L9a
        L7:
            int r1 = r12.j(r13)
            dbvx r9 = r12.k(r1)
            r9.lock()
            dbwu<K, V> r2 = r9.a     // Catch: java.lang.Throwable -> L92
            dbug r2 = r2.q     // Catch: java.lang.Throwable -> L92
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L92
            r9.w(r2)     // Catch: java.lang.Throwable -> L92
            int r2 = r9.b     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.atomic.AtomicReferenceArray<dbwv<K, V>> r10 = r9.f     // Catch: java.lang.Throwable -> L92
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L92
            int r2 = r2 + (-1)
            r11 = r1 & r2
            java.lang.Object r2 = r10.get(r11)     // Catch: java.lang.Throwable -> L92
            r3 = r2
            dbwv r3 = (defpackage.dbwv) r3     // Catch: java.lang.Throwable -> L92
            r4 = r3
        L31:
            if (r4 == 0) goto L8b
            java.lang.Object r5 = r4.e()     // Catch: java.lang.Throwable -> L92
            int r2 = r4.d()     // Catch: java.lang.Throwable -> L92
            if (r2 != r1) goto L86
            if (r5 == 0) goto L86
            dbwu<K, V> r2 = r9.a     // Catch: java.lang.Throwable -> L92
            dbrl<java.lang.Object> r2 = r2.f     // Catch: java.lang.Throwable -> L92
            boolean r2 = r2.c(r13, r5)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L86
            dbwg r7 = r4.a()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L92
            dbwu<K, V> r1 = r9.a     // Catch: java.lang.Throwable -> L92
            dbrl<java.lang.Object> r1 = r1.g     // Catch: java.lang.Throwable -> L92
            boolean r14 = r1.c(r14, r13)     // Catch: java.lang.Throwable -> L92
            if (r14 == 0) goto L5f
            dbww r14 = defpackage.dbww.EXPLICIT     // Catch: java.lang.Throwable -> L92
        L5d:
            r6 = r13
            goto L6b
        L5f:
            if (r13 != 0) goto L8b
            boolean r13 = r7.e()     // Catch: java.lang.Throwable -> L92
            if (r13 == 0) goto L8b
            dbww r14 = defpackage.dbww.COLLECTED     // Catch: java.lang.Throwable -> L92
            r13 = 0
            goto L5d
        L6b:
            int r13 = r9.d     // Catch: java.lang.Throwable -> L92
            r1 = 1
            int r13 = r13 + r1
            r9.d = r13     // Catch: java.lang.Throwable -> L92
            r2 = r9
            r8 = r14
            dbwv r13 = r2.A(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L92
            int r2 = r9.b     // Catch: java.lang.Throwable -> L92
            int r2 = r2 + (-1)
            r10.set(r11, r13)     // Catch: java.lang.Throwable -> L92
            r9.b = r2     // Catch: java.lang.Throwable -> L92
            dbww r13 = defpackage.dbww.EXPLICIT     // Catch: java.lang.Throwable -> L92
            if (r14 != r13) goto L8b
            r0 = 1
            goto L8b
        L86:
            dbwv r4 = r4.c()     // Catch: java.lang.Throwable -> L92
            goto L31
        L8b:
            r9.unlock()
            r9.x()
            return r0
        L92:
            r13 = move-exception
            r9.unlock()
            r9.x()
            throw r13
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbwu.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        dbsk.s(k);
        dbsk.s(v2);
        if (v == null) {
            return false;
        }
        int j = j(k);
        dbvx<K, V> k2 = k(j);
        k2.lock();
        try {
            long a2 = k2.a.q.a();
            k2.w(a2);
            AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = k2.f;
            int length = j & (atomicReferenceArray.length() - 1);
            dbwv<K, V> dbwvVar = atomicReferenceArray.get(length);
            dbwv<K, V> dbwvVar2 = dbwvVar;
            while (true) {
                if (dbwvVar2 == null) {
                    break;
                }
                K e = dbwvVar2.e();
                if (dbwvVar2.d() != j || e == null || !k2.a.f.c(k, e)) {
                    dbwvVar2 = dbwvVar2.c();
                } else {
                    dbwg<K, V> a3 = dbwvVar2.a();
                    V v3 = a3.get();
                    if (v3 == null) {
                        if (a3.e()) {
                            int i = k2.b;
                            k2.d++;
                            atomicReferenceArray.set(length, k2.A(dbwvVar, dbwvVar2, e, null, a3, dbww.COLLECTED));
                            k2.b--;
                        }
                    } else if (k2.a.g.c(v, v3)) {
                        k2.d++;
                        k2.y(k, v3, a3.a(), dbww.REPLACED);
                        k2.C(dbwvVar2, v2, a2);
                        k2.m(dbwvVar2);
                        k2.unlock();
                        k2.x();
                        return true;
                    } else {
                        k2.i(dbwvVar2, a2);
                    }
                }
            }
            return false;
        } finally {
            k2.unlock();
            k2.x();
        }
    }
}

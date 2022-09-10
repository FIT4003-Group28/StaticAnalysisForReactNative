package defpackage;

import com.google.ar.core.ImageMetadata;
import defpackage.dchv;
import defpackage.dcia;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dciv  reason: default package */
/* loaded from: classes.dex */
public final class dciv<K, V, E extends dchv<K, V, E>, S extends dcia<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final dcis<Object, Object, dchr> g = new dchn();
    private static final long serialVersionUID = 5;
    final transient int a;
    final transient int b;
    final transient dcia<K, V, E, S>[] c;
    final int d;
    final dbrl<Object> e;
    final transient dchw<K, V, E, S> f;
    transient Set<K> h;
    transient Collection<V> i;
    transient Set<Map.Entry<K, V>> j;

    public dciv(dchm dchmVar, dchw<K, V, E, S> dchwVar) {
        this.d = Math.min(dchmVar.b(), (int) ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        this.e = (dbrl) dbsc.a(dchmVar.f, dchmVar.c().a());
        this.f = dchwVar;
        int min = Math.min(dchmVar.a(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.d) {
            i4++;
            i3 += i3;
        }
        this.b = 32 - i4;
        this.a = i3 - 1;
        this.c = new dcia[i3];
        int i5 = min / i3;
        while (i2 < (i3 * i5 < min ? i5 + 1 : i5)) {
            i2 += i2;
        }
        while (true) {
            dcia<K, V, E, S>[] dciaVarArr = this.c;
            if (i < dciaVarArr.length) {
                dciaVarArr[i] = this.f.f(this, i2);
                i++;
            } else {
                return;
            }
        }
    }

    public static <E> ArrayList<E> d(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        dcgh.g(arrayList, collection.iterator());
        return arrayList;
    }

    final int a(Object obj) {
        int d = this.e.d(obj);
        int i = d + ((d << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcia<K, V, E, S> b(int i) {
        return this.c[(i >>> this.b) & this.a];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbrl<Object> c() {
        return this.f.b().a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        dcia<K, V, E, S>[] dciaVarArr = this.c;
        int length = dciaVarArr.length;
        for (int i = 0; i < length; i++) {
            dcia<K, V, E, S> dciaVar = dciaVarArr[i];
            if (dciaVar.b != 0) {
                dciaVar.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = dciaVar.e;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    dciaVar.b();
                    dciaVar.g.set(0);
                    dciaVar.c++;
                    dciaVar.b = 0;
                } finally {
                    dciaVar.unlock();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        E h;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a = a(obj);
        dcia<K, V, E, S> b = b(a);
        try {
            if (b.b != 0 && (h = b.h(obj, a)) != null) {
                if (h.d() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            b.l();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object d;
        if (obj == null) {
            return false;
        }
        dcia<K, V, E, S>[] dciaVarArr = this.c;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (dcia<K, V, E, S> dciaVar : dciaVarArr) {
                int i2 = dciaVar.b;
                AtomicReferenceArray<E> atomicReferenceArray = dciaVar.e;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (E e = atomicReferenceArray.get(i3); e != null; e = e.c()) {
                        if (e.a() == null || (d = e.d()) == null) {
                            dciaVar.e();
                            d = null;
                        }
                        if (d != null && c().c(obj, d)) {
                            return true;
                        }
                    }
                }
                j2 += dciaVar.c;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.j;
        if (set != null) {
            return set;
        }
        dcht dchtVar = new dcht(this);
        this.j = dchtVar;
        return dchtVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int a = a(obj);
        dcia<K, V, E, S> b = b(a);
        try {
            E h = b.h(obj, a);
            if (h != null && (v = (V) h.d()) == null) {
                b.e();
            }
            return v;
        } finally {
            b.l();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        dcia<K, V, E, S>[] dciaVarArr = this.c;
        long j = 0;
        for (int i = 0; i < dciaVarArr.length; i++) {
            if (dciaVarArr[i].b != 0) {
                return false;
            }
            j += dciaVarArr[i].c;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < dciaVarArr.length; i2++) {
                if (dciaVarArr[i2].b != 0) {
                    return false;
                }
                j -= dciaVarArr[i2].c;
            }
            return j == 0;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.h;
        if (set != null) {
            return set;
        }
        dchy dchyVar = new dchy(this);
        this.h = dchyVar;
        return dchyVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        dbsk.s(k);
        dbsk.s(v);
        int a = a(k);
        return b(a).i(k, a, v, false);
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
        int a = a(k);
        return b(a).i(k, a, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        r10 = (V) r6.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (defpackage.dcia.k(r6) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        r2.c++;
        r3.set(r4, r2.j(r5, r6));
        r2.b--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        return r10;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r9.a(r10)
            dcia r2 = r9.b(r1)
            r2.lock()
            r2.m()     // Catch: java.lang.Throwable -> L6b
            int r3 = r2.b     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.atomic.AtomicReferenceArray<E extends dchv<K, V, E>> r3 = r2.e     // Catch: java.lang.Throwable -> L6b
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L6b
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L6b
            dchv r5 = (defpackage.dchv) r5     // Catch: java.lang.Throwable -> L6b
            r6 = r5
        L24:
            if (r6 == 0) goto L67
            java.lang.Object r7 = r6.a()     // Catch: java.lang.Throwable -> L6b
            int r8 = r6.b()     // Catch: java.lang.Throwable -> L6b
            if (r8 != r1) goto L62
            if (r7 == 0) goto L62
            dciv<K, V, E extends dchv<K, V, E>, S extends dcia<K, V, E, S>> r8 = r2.a     // Catch: java.lang.Throwable -> L6b
            dbrl<java.lang.Object> r8 = r8.e     // Catch: java.lang.Throwable -> L6b
            boolean r7 = r8.c(r10, r7)     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L62
            java.lang.Object r10 = r6.d()     // Catch: java.lang.Throwable -> L6b
            if (r10 == 0) goto L43
            goto L4a
        L43:
            boolean r1 = defpackage.dcia.k(r6)     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L4a
            goto L67
        L4a:
            int r0 = r2.c     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 + 1
            r2.c = r0     // Catch: java.lang.Throwable -> L6b
            dchv r0 = r2.j(r5, r6)     // Catch: java.lang.Throwable -> L6b
            int r1 = r2.b     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 + (-1)
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L6b
            r2.b = r1     // Catch: java.lang.Throwable -> L6b
            r2.unlock()
            r0 = r10
            goto L6a
        L62:
            dchv r6 = r6.c()     // Catch: java.lang.Throwable -> L6b
            goto L24
        L67:
            r2.unlock()
        L6a:
            return r0
        L6b:
            r10 = move-exception
            r2.unlock()
            goto L71
        L70:
            throw r10
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dciv.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V replace(K r10, V r11) {
        /*
            r9 = this;
            defpackage.dbsk.s(r10)
            defpackage.dbsk.s(r11)
            int r0 = r9.a(r10)
            dcia r1 = r9.b(r0)
            r1.lock()
            r1.m()     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicReferenceArray<E extends dchv<K, V, E>> r2 = r1.e     // Catch: java.lang.Throwable -> L76
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + (-1)
            r3 = r3 & r0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L76
            dchv r4 = (defpackage.dchv) r4     // Catch: java.lang.Throwable -> L76
            r5 = r4
        L24:
            r6 = 0
            if (r5 == 0) goto L72
            java.lang.Object r7 = r5.a()     // Catch: java.lang.Throwable -> L76
            int r8 = r5.b()     // Catch: java.lang.Throwable -> L76
            if (r8 != r0) goto L6d
            if (r7 == 0) goto L6d
            dciv<K, V, E extends dchv<K, V, E>, S extends dcia<K, V, E, S>> r8 = r1.a     // Catch: java.lang.Throwable -> L76
            dbrl<java.lang.Object> r8 = r8.e     // Catch: java.lang.Throwable -> L76
            boolean r7 = r8.c(r10, r7)     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L6d
            java.lang.Object r10 = r5.d()     // Catch: java.lang.Throwable -> L76
            if (r10 != 0) goto L5f
            boolean r10 = defpackage.dcia.k(r5)     // Catch: java.lang.Throwable -> L76
            if (r10 == 0) goto L72
            int r10 = r1.b     // Catch: java.lang.Throwable -> L76
            int r10 = r1.c     // Catch: java.lang.Throwable -> L76
            int r10 = r10 + 1
            r1.c = r10     // Catch: java.lang.Throwable -> L76
            dchv r10 = r1.j(r4, r5)     // Catch: java.lang.Throwable -> L76
            int r11 = r1.b     // Catch: java.lang.Throwable -> L76
            int r11 = r11 + (-1)
            r2.set(r3, r10)     // Catch: java.lang.Throwable -> L76
            r1.b = r11     // Catch: java.lang.Throwable -> L76
            goto L72
        L5f:
            int r0 = r1.c     // Catch: java.lang.Throwable -> L76
            int r0 = r0 + 1
            r1.c = r0     // Catch: java.lang.Throwable -> L76
            r1.c(r5, r11)     // Catch: java.lang.Throwable -> L76
            r1.unlock()
            r6 = r10
            goto L75
        L6d:
            dchv r5 = r5.c()     // Catch: java.lang.Throwable -> L76
            goto L24
        L72:
            r1.unlock()
        L75:
            return r6
        L76:
            r10 = move-exception
            r1.unlock()
            goto L7c
        L7b:
            throw r10
        L7c:
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dciv.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (dcia<K, V, E, S> dciaVar : this.c) {
            j += dciaVar.b;
        }
        return decl.b(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.i;
        if (collection != null) {
            return collection;
        }
        dcik dcikVar = new dcik(this);
        this.i = dcikVar;
        return dcikVar;
    }

    Object writeReplace() {
        dcic a = this.f.a();
        dcic b = this.f.b();
        dbrl<Object> dbrlVar = this.e;
        this.f.b().a();
        return new dcib(a, b, dbrlVar, this.d, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r2.a.c().c(r11, r6.d()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (defpackage.dcia.k(r6) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        r2.c++;
        r3.set(r4, r2.j(r5, r6));
        r2.b--;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L79
            if (r11 != 0) goto L7
            goto L79
        L7:
            int r1 = r9.a(r10)
            dcia r2 = r9.b(r1)
            r2.lock()
            r2.m()     // Catch: java.lang.Throwable -> L74
            int r3 = r2.b     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.atomic.AtomicReferenceArray<E extends dchv<K, V, E>> r3 = r2.e     // Catch: java.lang.Throwable -> L74
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L74
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L74
            dchv r5 = (defpackage.dchv) r5     // Catch: java.lang.Throwable -> L74
            r6 = r5
        L27:
            if (r6 == 0) goto L70
            java.lang.Object r7 = r6.a()     // Catch: java.lang.Throwable -> L74
            int r8 = r6.b()     // Catch: java.lang.Throwable -> L74
            if (r8 != r1) goto L6b
            if (r7 == 0) goto L6b
            dciv<K, V, E extends dchv<K, V, E>, S extends dcia<K, V, E, S>> r8 = r2.a     // Catch: java.lang.Throwable -> L74
            dbrl<java.lang.Object> r8 = r8.e     // Catch: java.lang.Throwable -> L74
            boolean r7 = r8.c(r10, r7)     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L6b
            java.lang.Object r10 = r6.d()     // Catch: java.lang.Throwable -> L74
            dciv<K, V, E extends dchv<K, V, E>, S extends dcia<K, V, E, S>> r1 = r2.a     // Catch: java.lang.Throwable -> L74
            dbrl r1 = r1.c()     // Catch: java.lang.Throwable -> L74
            boolean r10 = r1.c(r11, r10)     // Catch: java.lang.Throwable -> L74
            r11 = 1
            if (r10 == 0) goto L52
            r0 = 1
            goto L58
        L52:
            boolean r10 = defpackage.dcia.k(r6)     // Catch: java.lang.Throwable -> L74
            if (r10 == 0) goto L70
        L58:
            int r10 = r2.c     // Catch: java.lang.Throwable -> L74
            int r10 = r10 + r11
            r2.c = r10     // Catch: java.lang.Throwable -> L74
            dchv r10 = r2.j(r5, r6)     // Catch: java.lang.Throwable -> L74
            int r11 = r2.b     // Catch: java.lang.Throwable -> L74
            int r11 = r11 + (-1)
            r3.set(r4, r10)     // Catch: java.lang.Throwable -> L74
            r2.b = r11     // Catch: java.lang.Throwable -> L74
            goto L70
        L6b:
            dchv r6 = r6.c()     // Catch: java.lang.Throwable -> L74
            goto L27
        L70:
            r2.unlock()
            return r0
        L74:
            r10 = move-exception
            r2.unlock()
            throw r10
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dciv.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        dbsk.s(k);
        dbsk.s(v2);
        if (v == null) {
            return false;
        }
        int a = a(k);
        dcia<K, V, E, S> b = b(a);
        b.lock();
        try {
            b.m();
            AtomicReferenceArray<E> atomicReferenceArray = b.e;
            int length = (atomicReferenceArray.length() - 1) & a;
            E e = atomicReferenceArray.get(length);
            E e2 = e;
            while (true) {
                if (e2 == null) {
                    break;
                }
                Object a2 = e2.a();
                if (e2.b() != a || a2 == null || !b.a.e.c(k, a2)) {
                    e2 = (E) e2.c();
                } else {
                    Object d = e2.d();
                    if (d == null) {
                        if (dcia.k(e2)) {
                            int i = b.b;
                            b.c++;
                            atomicReferenceArray.set(length, b.j(e, e2));
                            b.b--;
                        }
                    } else if (b.a.c().c(v, d)) {
                        b.c++;
                        b.c(e2, v2);
                        b.unlock();
                        return true;
                    }
                }
            }
            return false;
        } finally {
            b.unlock();
        }
    }
}

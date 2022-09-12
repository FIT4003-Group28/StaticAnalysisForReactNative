package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: PG */
/* renamed from: dcey  reason: default package */
/* loaded from: classes5.dex */
public final class dcey<K, V> extends dcez<K, V> implements NavigableMap<K, V> {
    private static final dcey<Comparable, Object> e = new dcey<>(dcfc.P(dcln.a), dcdc.e());
    private static final long serialVersionUID = 0;
    public final transient dcms<K> a;
    public final transient dcdc<V> d;
    private transient dcey<K, V> f;

    public dcey(dcms<K> dcmsVar, dcdc<V> dcdcVar) {
        this(dcmsVar, dcdcVar, null);
    }

    public dcey(dcms<K> dcmsVar, dcdc<V> dcdcVar, dcey<K, V> dceyVar) {
        this.a = dcmsVar;
        this.d = dcdcVar;
        this.f = dceyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> dcey<K, V> e(Comparator<? super K> comparator) {
        return dcln.a.equals(comparator) ? (dcey<K, V>) e : new dcey<>(dcfc.P(comparator), dcdc.e());
    }

    private final dcey<K, V> w(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return e(comparator());
        }
        return new dcey<>(this.a.g(i, i2), this.d.subList(i, i2));
    }

    @Override // defpackage.dcdn
    public final dcep<Map.Entry<K, V>> SM() {
        if (!isEmpty()) {
            return new dcev(this);
        }
        return dcmr.a;
    }

    @Override // defpackage.dcdn
    public final boolean c() {
        return this.a.SI() || this.d.SI();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final K ceilingKey(K k) {
        return (K) dcjz.F(ceilingEntry(k));
    }

    @Override // java.util.SortedMap
    public final Comparator<? super K> comparator() {
        return this.a.b;
    }

    @Override // defpackage.dcdn
    public final dcep<K> d() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.a.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        dcey<K, V> dceyVar = this.f;
        return dceyVar == null ? isEmpty() ? e(dclu.d(comparator()).c()) : new dcey((dcms) this.a.descendingSet(), this.d.SL(), this) : dceyVar;
    }

    @Override // defpackage.dcdn, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().v().get(0);
    }

    @Override // java.util.SortedMap
    public final K firstKey() {
        return this.a.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final K floorKey(K k) {
        return (K) dcjz.F(floorEntry(k));
    }

    @Override // defpackage.dcdn
    public final dccr<V> g() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.dcdn
    public final dccr<V> h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final K higherKey(K k) {
        return (K) dcjz.F(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    /* renamed from: i */
    public final dcey<K, V> headMap(K k, boolean z) {
        dcms<K> dcmsVar = this.a;
        dbsk.s(k);
        return w(0, dcmsVar.e(k, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    /* renamed from: j */
    public final dcey<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        dbsk.s(k);
        dbsk.s(k2);
        dbsk.j(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    @Override // defpackage.dcdn, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return this.a;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().v().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final K lastKey() {
        return this.a.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final K lowerKey(K k) {
        return (K) dcjz.F(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
        return this.a;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // defpackage.dcdn
    public final /* bridge */ /* synthetic */ dcep u() {
        return this.a;
    }

    @Override // java.util.NavigableMap
    /* renamed from: v */
    public final dcey<K, V> tailMap(K k, boolean z) {
        dcms<K> dcmsVar = this.a;
        dbsk.s(k);
        return w(dcmsVar.f(k, z), size());
    }

    @Override // defpackage.dcdn, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.d;
    }

    @Override // defpackage.dcdn
    Object writeReplace() {
        return new dcex(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r4 < 0) goto L3;
     */
    @Override // defpackage.dcdn, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r4) {
        /*
            r3 = this;
            dcms<K> r0 = r3.a
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = -1
            goto L12
        L7:
            dcdc<E> r2 = r0.d     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator<? super E> r0 = r0.b     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            dcdc<V> r0 = r3.d
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcey.get(java.lang.Object):java.lang.Object");
    }
}

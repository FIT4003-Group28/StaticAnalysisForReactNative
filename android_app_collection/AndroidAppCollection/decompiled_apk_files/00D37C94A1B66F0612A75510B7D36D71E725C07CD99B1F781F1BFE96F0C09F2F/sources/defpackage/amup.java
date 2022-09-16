package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: PG */
/* renamed from: amup  reason: default package */
/* loaded from: classes.dex */
public abstract class amup implements Map, Serializable, j$.util.Map {
    public static final /* synthetic */ int a = 0;
    private transient amvn b;
    private transient amvn c;
    private transient amub d;

    public static amum h() {
        return new amum();
    }

    public static amum i(int i) {
        araa.v(i, "expectedSize");
        return new amum(i);
    }

    public static amup j(Map map) {
        if (!(map instanceof amup) || (map instanceof SortedMap)) {
            Set entrySet = map.entrySet();
            amum amumVar = new amum(entrySet instanceof Collection ? entrySet.size() : 4);
            amumVar.g(entrySet);
            return amumVar.b();
        }
        amup amupVar = (amup) map;
        amupVar.sf();
        return amupVar;
    }

    public static amup k(Object obj, Object obj2) {
        araa.t(obj, obj2);
        return amyc.a(1, new Object[]{obj, obj2});
    }

    public static amup l(Object obj, Object obj2, Object obj3, Object obj4) {
        araa.t(obj, obj2);
        araa.t(obj3, obj4);
        return amyc.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static amup m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        araa.t(obj, obj2);
        araa.t(obj3, obj4);
        araa.t(obj5, obj6);
        return amyc.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static amup n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        araa.t(obj, obj2);
        araa.t(obj3, obj4);
        araa.t(obj5, obj6);
        araa.t(obj7, obj8);
        return amyc.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static amup o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        araa.t(obj, obj2);
        araa.t(obj3, obj4);
        araa.t(obj5, obj6);
        araa.t(obj7, obj8);
        araa.t(obj9, obj10);
        return amyc.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract amub d();

    @Override // java.util.Map, j$.util.Map
    /* renamed from: e */
    public amub values() {
        amub amubVar = this.d;
        if (amubVar == null) {
            amub d = d();
            this.d = d;
            return d;
        }
        return amubVar;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public abstract amvn g();

    @Override // java.util.Map, j$.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        return amyv.b(entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: p */
    public final amvn entrySet() {
        amvn amvnVar = this.b;
        if (amvnVar == null) {
            amvn sd = sd();
            this.b = sd;
            return sd;
        }
        return amvnVar;
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: q */
    public final amvn keySet() {
        amvn amvnVar = this.c;
        if (amvnVar == null) {
            amvn g = g();
            this.c = g;
            return g;
        }
        return amvnVar;
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public abstract amvn sd();

    public amzs se() {
        throw null;
    }

    public abstract void sf();

    public final String toString() {
        int size = size();
        araa.v(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    Object writeReplace() {
        return new amuo(this);
    }
}

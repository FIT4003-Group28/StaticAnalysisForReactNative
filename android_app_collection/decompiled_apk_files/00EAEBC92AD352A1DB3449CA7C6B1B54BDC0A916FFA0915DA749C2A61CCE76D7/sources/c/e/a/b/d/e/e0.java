package c.e.a.b.d.e;

import java.util.Map;
/* loaded from: classes.dex */
final class e0<K, V> extends d0<Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    private final transient b0<K, V> f3892d;

    /* renamed from: e  reason: collision with root package name */
    private final transient Object[] f3893e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f3894f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(b0<K, V> b0Var, Object[] objArr, int i, int i2) {
        this.f3892d = b0Var;
        this.f3893e = objArr;
        this.f3894f = i2;
    }

    @Override // c.e.a.b.d.e.x
    final int a(Object[] objArr, int i) {
        return b().a(objArr, i);
    }

    @Override // c.e.a.b.d.e.x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3892d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // c.e.a.b.d.e.d0
    final w<Map.Entry<K, V>> f() {
        return new h0(this);
    }

    @Override // c.e.a.b.d.e.d0, c.e.a.b.d.e.x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: j */
    public final l0<Map.Entry<K, V>> iterator() {
        return (l0) b().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3894f;
    }
}

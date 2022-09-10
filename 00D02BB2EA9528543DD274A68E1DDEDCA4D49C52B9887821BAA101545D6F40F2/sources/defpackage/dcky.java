package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcky  reason: default package */
/* loaded from: classes5.dex */
class dcky<K, V> extends dcbp<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final dcka<K, V> a;
    transient Collection<Map.Entry<K, V>> b;
    transient Set<K> c;
    transient Map<K, Collection<V>> d;

    public dcky(dcka<K, V> dckaVar) {
        this.a = dckaVar;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final boolean G(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final boolean H(dcka<? extends K, ? extends V> dckaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final Collection<Map.Entry<K, V>> I() {
        Collection<Map.Entry<K, V>> dcjvVar;
        Collection<Map.Entry<K, V>> collection = this.b;
        if (collection == null) {
            Collection<Map.Entry<K, V>> I = this.a.I();
            if (I instanceof Set) {
                dcjvVar = new dcjw<>(Collections.unmodifiableSet((Set) I));
            } else {
                dcjvVar = new dcjv<>(Collections.unmodifiableCollection(I));
            }
            this.b = dcjvVar;
            return dcjvVar;
        }
        return collection;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final Set<K> J() {
        Set<K> set = this.c;
        if (set == null) {
            Set<K> unmodifiableSet = Collections.unmodifiableSet(this.a.J());
            this.c = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final Collection<V> K() {
        throw null;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final Map<K, Collection<V>> L() {
        Map<K, Collection<V>> map = this.d;
        if (map == null) {
            Map<K, Collection<V>> unmodifiableMap = Collections.unmodifiableMap(dcjz.s(this.a.L(), new dckx()));
            this.d = unmodifiableMap;
            return unmodifiableMap;
        }
        return map;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final void M(K k, Iterable<? extends V> iterable) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcbp, defpackage.dcbq
    /* renamed from: b */
    public dcka<K, V> SC() {
        return this.a;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public Collection<V> f(K k) {
        return dckz.c(((dcbm) this.a).f(k));
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final boolean n(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final void p() {
        throw new UnsupportedOperationException();
    }
}

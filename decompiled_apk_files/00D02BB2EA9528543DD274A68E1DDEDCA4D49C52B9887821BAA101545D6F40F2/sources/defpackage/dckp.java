package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dckp  reason: default package */
/* loaded from: classes5.dex */
final class dckp<K, V> extends dcjy<K, Collection<V>> {
    public final dcka<K, V> a;

    public dckp(dcka<K, V> dckaVar) {
        this.a = dckaVar;
    }

    @Override // defpackage.dcjy
    public final Set<Map.Entry<K, Collection<V>>> a() {
        return new dcko(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.p();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.m(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return ((dcgz) this.a).f(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.a.D();
    }

    @Override // defpackage.dcjy, java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return this.a.J();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (containsKey(obj)) {
            return ((dcgz) this.a).d(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.J().size();
    }
}

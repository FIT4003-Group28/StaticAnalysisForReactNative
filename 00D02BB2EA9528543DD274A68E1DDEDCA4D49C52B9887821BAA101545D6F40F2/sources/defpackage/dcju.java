package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcju  reason: default package */
/* loaded from: classes5.dex */
public final class dcju<K, V1, V2> extends dcjs<K, V2> {
    final Map<K, V1> a;
    final dcjj<? super K, ? super V1, V2> b;

    public dcju(Map<K, V1> map, dcjj<? super K, ? super V1, V2> dcjjVar) {
        dbsk.s(map);
        this.a = map;
        dbsk.s(dcjjVar);
        this.b = dcjjVar;
    }

    @Override // defpackage.dcjs
    public final Iterator<Map.Entry<K, V2>> a() {
        return dcgh.l(this.a.entrySet().iterator(), dcjz.w(this.b));
    }

    @Override // defpackage.dcjs, java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V2 get(Object obj) {
        V1 v1 = this.a.get(obj);
        if (v1 != null || this.a.containsKey(obj)) {
            return this.b.a(obj, v1);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V2 remove(Object obj) {
        if (this.a.containsKey(obj)) {
            return this.b.a(obj, (V1) this.a.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V2> values() {
        return new dcjx(this);
    }
}

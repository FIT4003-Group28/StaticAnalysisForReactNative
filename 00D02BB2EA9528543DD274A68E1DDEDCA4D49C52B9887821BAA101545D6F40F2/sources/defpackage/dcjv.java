package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcjv  reason: default package */
/* loaded from: classes5.dex */
class dcjv<K, V> extends dcbh<Map.Entry<K, V>> {
    private final Collection<Map.Entry<K, V>> a;

    public dcjv(Collection<Map.Entry<K, V>> collection) {
        this.a = collection;
    }

    @Override // defpackage.dcbh, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbh
    protected final Collection<Map.Entry<K, V>> b() {
        return this.a;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return dcjz.r(this.a.iterator());
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return e();
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) dclq.e(this, tArr);
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: debj  reason: default package */
/* loaded from: classes6.dex */
final class debj<K, V> extends dcbh<Map.Entry<K, V>> {
    final Collection<Map.Entry<K, V>> a;

    public debj(Collection<Map.Entry<K, V>> collection) {
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
        return dcgh.l(this.a.iterator(), new debi());
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

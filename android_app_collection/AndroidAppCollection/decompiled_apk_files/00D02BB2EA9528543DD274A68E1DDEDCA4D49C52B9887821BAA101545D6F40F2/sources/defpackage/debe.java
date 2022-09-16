package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: debe  reason: default package */
/* loaded from: classes6.dex */
final class debe<K, V> extends dcbs<Map.Entry<K, Collection<V>>> {
    private final Set<Map.Entry<K, Collection<V>>> a;

    public debe(Set<Map.Entry<K, Collection<V>>> set) {
        this.a = set;
    }

    @Override // defpackage.dcbh, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbs
    protected final Set<Map.Entry<K, Collection<V>>> a() {
        return this.a;
    }

    @Override // defpackage.dcbs, defpackage.dcbh
    protected final /* bridge */ /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return dcgh.l(this.a.iterator(), new debd());
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

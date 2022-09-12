package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbxj  reason: default package */
/* loaded from: classes.dex */
public class dbxj<K, V> extends dbye<K, V> implements dcha<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    /* JADX INFO: Access modifiers changed from: protected */
    public dbxj(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // defpackage.dbye
    public final <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // defpackage.dbye
    public final Collection<V> b(K k, Collection<V> collection) {
        return q(k, (List) collection, null);
    }

    @Override // defpackage.dbye, defpackage.dcka
    /* renamed from: c */
    public final List<V> f(K k) {
        return (List) super.f(k);
    }

    @Override // defpackage.dbye
    /* renamed from: d */
    public final List<V> g(Object obj) {
        return (List) super.g(obj);
    }

    @Override // defpackage.dcha
    public final List<V> e(K k, Iterable<? extends V> iterable) {
        return (List) super.o(k, iterable);
    }

    @Override // defpackage.dbye
    public /* bridge */ /* synthetic */ Collection h() {
        throw null;
    }

    @Override // defpackage.dbye
    public final /* bridge */ /* synthetic */ Collection i() {
        return Collections.emptyList();
    }
}

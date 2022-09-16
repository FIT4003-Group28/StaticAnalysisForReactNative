package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbys  reason: default package */
/* loaded from: classes.dex */
public class dbys<K, V> extends dbye<K, V> implements dcna<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    /* JADX INFO: Access modifiers changed from: protected */
    public dbys(Map<K, Collection<V>> map) {
        super(map);
    }

    public final void N(K k, Iterable<? extends V> iterable) {
        Set set = (Set) super.o(k, iterable);
    }

    @Override // defpackage.dbye
    public <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // defpackage.dbye
    public Collection<V> b(K k, Collection<V> collection) {
        return new dbyc(this, k, (Set) collection);
    }

    @Override // defpackage.dbye, defpackage.dcka
    /* renamed from: c */
    public final Set<V> f(K k) {
        return (Set) super.f(k);
    }

    @Override // defpackage.dbyn, defpackage.dcka
    /* renamed from: d */
    public final Set<Map.Entry<K, V>> I() {
        return (Set) super.I();
    }

    @Override // defpackage.dbye
    /* renamed from: e */
    public final Set<V> g(Object obj) {
        return (Set) super.g(obj);
    }

    @Override // defpackage.dbye
    public /* bridge */ /* synthetic */ Collection h() {
        throw null;
    }

    @Override // defpackage.dbye
    public final /* bridge */ /* synthetic */ Collection i() {
        return Collections.emptySet();
    }
}

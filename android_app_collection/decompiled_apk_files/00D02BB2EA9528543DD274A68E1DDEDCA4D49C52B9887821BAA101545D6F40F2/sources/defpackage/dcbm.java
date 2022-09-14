package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dcbm  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcbm<K, V> extends dcbp<K, V> implements dcha<K, V> {
    protected abstract dcha<K, V> a();

    @Override // defpackage.dcbp
    protected /* bridge */ /* synthetic */ dcka b() {
        throw null;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    /* renamed from: c */
    public List<V> f(K k) {
        return a().c(k);
    }

    @Override // defpackage.dcha
    public final List<V> d(Object obj) {
        throw null;
    }

    @Override // defpackage.dcha
    public List<V> e(K k, Iterable<? extends V> iterable) {
        return a().e(k, iterable);
    }
}

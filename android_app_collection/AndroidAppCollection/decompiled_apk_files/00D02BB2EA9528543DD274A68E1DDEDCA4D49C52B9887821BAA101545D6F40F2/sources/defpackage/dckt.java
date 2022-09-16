package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: dckt  reason: default package */
/* loaded from: classes5.dex */
public final class dckt<K, V1, V2> extends dckv<K, V1, V2> implements dcha<K, V2> {
    public dckt(dcha<K, V1> dchaVar, dcjj<? super K, ? super V1, V2> dcjjVar) {
        super(dchaVar, dcjjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.dckv
    /* renamed from: a */
    public final List<V2> b(K k, Collection<V1> collection) {
        return dchl.k((List) collection, dcjz.v(this.b, k));
    }

    @Override // defpackage.dckv, defpackage.dcka
    /* renamed from: c */
    public final List<V2> f(K k) {
        return b(k, this.a.f(k));
    }

    @Override // defpackage.dcha
    public final List<V2> d(Object obj) {
        throw null;
    }

    @Override // defpackage.dcha
    public final List<V2> e(K k, Iterable<? extends V2> iterable) {
        throw new UnsupportedOperationException();
    }
}

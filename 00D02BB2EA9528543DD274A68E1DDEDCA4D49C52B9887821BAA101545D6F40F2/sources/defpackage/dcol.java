package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dcol  reason: default package */
/* loaded from: classes5.dex */
public final class dcol<K, V> extends dcon<K, V> implements dcha<K, V> {
    private static final long serialVersionUID = 0;

    public dcol(dcha<K, V> dchaVar, Object obj) {
        super(dchaVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.dcon
    /* renamed from: a */
    public final dcha<K, V> b() {
        return (dcha) super.b();
    }

    @Override // defpackage.dcon, defpackage.dcka
    /* renamed from: c */
    public final List<V> f(K k) {
        List<V> d;
        synchronized (this.g) {
            d = dcos.d(b().c(k), this.g);
        }
        return d;
    }

    @Override // defpackage.dcha
    public final List<V> d(Object obj) {
        throw null;
    }

    @Override // defpackage.dcha
    public final List<V> e(K k, Iterable<? extends V> iterable) {
        List<V> e;
        synchronized (this.g) {
            e = b().e(k, iterable);
        }
        return e;
    }
}

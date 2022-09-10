package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dccm  reason: default package */
/* loaded from: classes5.dex */
public final class dccm<K, V> extends dcdg<K, V> {
    public dccm() {
    }

    @Override // defpackage.dcdg
    /* renamed from: a */
    public final dcco<K, V> b() {
        int i = this.b;
        return i == 0 ? dcmh.a : new dcmh(this.a, i);
    }

    @Override // defpackage.dcdg
    public final /* bridge */ /* synthetic */ dcdg c(Map map) {
        super.c(map);
        return this;
    }

    public final void d(K k, V v) {
        super.f(k, v);
    }

    @Override // defpackage.dcdg
    public final /* bridge */ /* synthetic */ void e(Iterable iterable) {
        super.e(iterable);
    }

    public dccm(int i) {
        super(i);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dcih  reason: default package */
/* loaded from: classes.dex */
final class dcih<K, V> extends dchp<K, V, dcih<K, V>> implements dcir<K, V, dcih<K, V>> {
    public volatile dcis<K, V, dcih<K, V>> d;

    public dcih(K k, int i, dcih<K, V> dcihVar) {
        super(k, i, dcihVar);
        this.d = (dcis<K, V, dcih<K, V>>) dciv.g;
    }

    @Override // defpackage.dchv
    public final V d() {
        return this.d.get();
    }

    @Override // defpackage.dcir
    public final dcis<K, V, dcih<K, V>> e() {
        return this.d;
    }
}

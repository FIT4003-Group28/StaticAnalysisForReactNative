package defpackage;
/* compiled from: PG */
/* renamed from: dcie  reason: default package */
/* loaded from: classes5.dex */
final class dcie<K, V> extends dchp<K, V, dcie<K, V>> implements dchv<K, V, dcie<K, V>> {
    public volatile V d;

    public dcie(K k, int i, dcie<K, V> dcieVar) {
        super(k, i, dcieVar);
        this.d = null;
    }

    @Override // defpackage.dchv
    public final V d() {
        return this.d;
    }
}

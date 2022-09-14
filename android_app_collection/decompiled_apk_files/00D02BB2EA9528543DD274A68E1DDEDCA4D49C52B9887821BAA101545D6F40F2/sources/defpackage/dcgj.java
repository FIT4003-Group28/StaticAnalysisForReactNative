package defpackage;
/* compiled from: PG */
/* renamed from: dcgj  reason: default package */
/* loaded from: classes5.dex */
final class dcgj<K, V> extends dccs<K, V> implements dcgm<K, V> {
    final int c;
    dcgj<K, V> d;
    dcgm<K, V> e;
    dcgm<K, V> f;
    dcgj<K, V> g;
    dcgj<K, V> h;

    public dcgj(K k, V v, int i, dcgj<K, V> dcgjVar) {
        super(k, v);
        this.c = i;
        this.d = dcgjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Object obj, int i) {
        return this.c == i && dbsd.a(this.b, obj);
    }

    @Override // defpackage.dcgm
    public final dcgm<K, V> b() {
        return this.f;
    }

    @Override // defpackage.dcgm
    public final void c(dcgm<K, V> dcgmVar) {
        this.e = dcgmVar;
    }

    @Override // defpackage.dcgm
    public final void d(dcgm<K, V> dcgmVar) {
        this.f = dcgmVar;
    }
}

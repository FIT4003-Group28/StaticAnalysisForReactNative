package defpackage;
/* compiled from: PG */
/* renamed from: dcbx  reason: default package */
/* loaded from: classes5.dex */
final class dcbx<K, V> extends dbyj<V, K> {
    final dccf<K, V> a;
    final V b;
    int c;

    public dcbx(dccf<K, V> dccfVar, int i) {
        this.a = dccfVar;
        this.b = dccfVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            dccf<K, V> dccfVar = this.a;
            if (i <= dccfVar.c && dbsd.a(this.b, dccfVar.b[i])) {
                return;
            }
        }
        this.c = this.a.d(this.b);
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final V getKey() {
        return this.b;
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final K getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // defpackage.dbyj, java.util.Map.Entry
    public final K setValue(K k) {
        a();
        int i = this.c;
        if (i == -1) {
            return this.a.k(this.b, k);
        }
        K k2 = this.a.a[i];
        if (dbsd.a(k2, k)) {
            return k;
        }
        this.a.l(this.c, k);
        return k2;
    }
}

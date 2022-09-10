package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcmh  reason: default package */
/* loaded from: classes5.dex */
public final class dcmh<K, V> extends dcco<K, V> {
    static final dcmh<Object, Object> a = new dcmh<>();
    final transient Object[] d;
    public final transient dcmh<V, K> e;
    private final transient Object f;
    private final transient int g;
    private final transient int h;

    /* JADX WARN: Multi-variable type inference failed */
    private dcmh() {
        this.f = null;
        this.d = new Object[0];
        this.g = 0;
        this.h = 0;
        this.e = this;
    }

    private dcmh(Object obj, Object[] objArr, int i, dcmh<V, K> dcmhVar) {
        this.f = obj;
        this.d = objArr;
        this.g = 1;
        this.h = i;
        this.e = dcmhVar;
    }

    public dcmh(Object[] objArr, int i) {
        this.d = objArr;
        this.h = i;
        this.g = 0;
        int J = i >= 2 ? dcep.J(i) : 0;
        this.f = dcmn.i(objArr, i, J, 0);
        this.e = new dcmh<>(dcmn.i(objArr, i, J, 1), objArr, i, this);
    }

    @Override // defpackage.dcdn
    public final dcep<Map.Entry<K, V>> SM() {
        return new dcmk(this, this.d, this.g, this.h);
    }

    @Override // defpackage.dcdn
    public final boolean c() {
        return false;
    }

    @Override // defpackage.dcdn
    public final dcep<K> d() {
        return new dcml(this, new dcmm(this.d, this.g, this.h));
    }

    @Override // defpackage.dcco
    public final dcco<V, K> e() {
        return this.e;
    }

    @Override // defpackage.dcdn, java.util.Map
    public final V get(Object obj) {
        return (V) dcmn.j(this.f, this.d, this.h, this.g, obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }
}

package c.d.j.d;
/* loaded from: classes.dex */
public class o<K, V> implements p<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final p<K, V> f3232a;

    /* renamed from: b  reason: collision with root package name */
    private final r f3233b;

    public o(p<K, V> pVar, r rVar) {
        this.f3232a = pVar;
        this.f3233b = rVar;
    }

    @Override // c.d.j.d.p
    public int a(c.d.d.d.j<K> jVar) {
        return this.f3232a.a(jVar);
    }

    @Override // c.d.j.d.p
    public c.d.d.h.a<V> a(K k, c.d.d.h.a<V> aVar) {
        this.f3233b.b();
        return this.f3232a.a(k, aVar);
    }

    @Override // c.d.j.d.p
    public boolean b(c.d.d.d.j<K> jVar) {
        return this.f3232a.b(jVar);
    }

    @Override // c.d.j.d.p
    public c.d.d.h.a<V> get(K k) {
        c.d.d.h.a<V> aVar = this.f3232a.get(k);
        if (aVar == null) {
            this.f3233b.a();
        } else {
            this.f3233b.a(k);
        }
        return aVar;
    }
}

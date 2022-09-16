package c.e.a.b.d.e;
/* loaded from: classes.dex */
final class g0<K> extends d0<K> {

    /* renamed from: d  reason: collision with root package name */
    private final transient b0<K, ?> f3908d;

    /* renamed from: e  reason: collision with root package name */
    private final transient w<K> f3909e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(b0<K, ?> b0Var, w<K> wVar) {
        this.f3908d = b0Var;
        this.f3909e = wVar;
    }

    @Override // c.e.a.b.d.e.x
    final int a(Object[] objArr, int i) {
        return b().a(objArr, i);
    }

    @Override // c.e.a.b.d.e.d0
    public final w<K> b() {
        return this.f3909e;
    }

    @Override // c.e.a.b.d.e.x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3908d.get(obj) != null;
    }

    @Override // c.e.a.b.d.e.d0, c.e.a.b.d.e.x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: j */
    public final l0<K> iterator() {
        return (l0) b().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3908d.size();
    }
}

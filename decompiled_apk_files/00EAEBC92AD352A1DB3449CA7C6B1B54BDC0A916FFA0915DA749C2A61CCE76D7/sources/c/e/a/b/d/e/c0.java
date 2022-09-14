package c.e.a.b.d.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0<E> extends w<E> {

    /* renamed from: f  reason: collision with root package name */
    static final w<Object> f3871f = new c0(new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f3872d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f3873e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(Object[] objArr, int i) {
        this.f3872d = objArr;
        this.f3873e = i;
    }

    @Override // c.e.a.b.d.e.x
    final int a() {
        return this.f3873e;
    }

    @Override // c.e.a.b.d.e.w, c.e.a.b.d.e.x
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.f3872d, 0, objArr, i, this.f3873e);
        return i + this.f3873e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.e.x
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        m.a(i, this.f3873e);
        return (E) this.f3872d[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.e.x
    public final Object[] k() {
        return this.f3872d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3873e;
    }
}

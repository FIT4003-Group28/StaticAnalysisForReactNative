package c.e.a.b.d.e;
/* loaded from: classes.dex */
final class y extends w<E> {

    /* renamed from: d  reason: collision with root package name */
    private final transient int f4014d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f4015e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ w f4016f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(w wVar, int i, int i2) {
        this.f4016f = wVar;
        this.f4014d = i;
        this.f4015e = i2;
    }

    @Override // c.e.a.b.d.e.x
    final int a() {
        return this.f4016f.g() + this.f4014d + this.f4015e;
    }

    @Override // c.e.a.b.d.e.w, java.util.List
    /* renamed from: a */
    public final w<E> subList(int i, int i2) {
        m.a(i, i2, this.f4015e);
        w wVar = this.f4016f;
        int i3 = this.f4014d;
        return (w) wVar.subList(i + i3, i2 + i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.e.x
    public final int g() {
        return this.f4016f.g() + this.f4014d;
    }

    @Override // java.util.List
    public final E get(int i) {
        m.a(i, this.f4015e);
        return this.f4016f.get(i + this.f4014d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.e.x
    public final Object[] k() {
        return this.f4016f.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4015e;
    }
}

package c.e.a.b.d.e;
/* loaded from: classes.dex */
final class j0 extends w<Object> {

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f3927d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f3928e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f3929f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(Object[] objArr, int i, int i2) {
        this.f3927d = objArr;
        this.f3928e = i;
        this.f3929f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m.a(i, this.f3929f);
        return this.f3927d[(i * 2) + this.f3928e];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3929f;
    }
}

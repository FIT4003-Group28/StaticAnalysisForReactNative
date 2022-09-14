package c.d.j.n;
/* loaded from: classes.dex */
public abstract class n<I, O> extends b<I> {

    /* renamed from: b  reason: collision with root package name */
    private final k<O> f3502b;

    public n(k<O> kVar) {
        this.f3502b = kVar;
    }

    @Override // c.d.j.n.b
    protected void b() {
        this.f3502b.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.j.n.b
    public void b(float f2) {
        this.f3502b.a(f2);
    }

    @Override // c.d.j.n.b
    protected void b(Throwable th) {
        this.f3502b.a(th);
    }

    public k<O> c() {
        return this.f3502b;
    }
}

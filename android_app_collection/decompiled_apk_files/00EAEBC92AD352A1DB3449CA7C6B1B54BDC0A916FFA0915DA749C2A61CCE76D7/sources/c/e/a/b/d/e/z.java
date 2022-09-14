package c.e.a.b.d.e;
/* loaded from: classes.dex */
final class z<E> extends s<E> {

    /* renamed from: d  reason: collision with root package name */
    private final w<E> f4025d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(w<E> wVar, int i) {
        super(wVar.size(), i);
        this.f4025d = wVar;
    }

    @Override // c.e.a.b.d.e.s
    protected final E a(int i) {
        return this.f4025d.get(i);
    }
}

package c.e.a.a.i.y;
/* loaded from: classes.dex */
public final class d implements d.b.b<a> {

    /* renamed from: a  reason: collision with root package name */
    private static final d f3826a = new d();

    public static d a() {
        return f3826a;
    }

    public static a b() {
        a b2 = b.b();
        d.b.d.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public a mo254get() {
        return b();
    }
}

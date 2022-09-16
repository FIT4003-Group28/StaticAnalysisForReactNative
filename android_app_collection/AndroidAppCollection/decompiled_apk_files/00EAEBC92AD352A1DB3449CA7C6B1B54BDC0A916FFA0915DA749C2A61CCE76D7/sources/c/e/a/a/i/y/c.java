package c.e.a.a.i.y;
/* loaded from: classes.dex */
public final class c implements d.b.b<a> {

    /* renamed from: a  reason: collision with root package name */
    private static final c f3825a = new c();

    public static c a() {
        return f3825a;
    }

    public static a b() {
        a a2 = b.a();
        d.b.d.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public a mo254get() {
        return b();
    }
}

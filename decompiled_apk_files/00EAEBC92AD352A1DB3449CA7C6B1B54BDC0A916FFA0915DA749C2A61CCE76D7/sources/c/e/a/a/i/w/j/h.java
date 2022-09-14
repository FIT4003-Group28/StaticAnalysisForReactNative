package c.e.a.a.i.w.j;
/* loaded from: classes.dex */
public final class h implements d.b.b<d> {

    /* renamed from: a  reason: collision with root package name */
    private static final h f3791a = new h();

    public static h a() {
        return f3791a;
    }

    public static d b() {
        d c2 = e.c();
        d.b.d.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public d mo254get() {
        return b();
    }
}

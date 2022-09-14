package c.e.a.a.i.w.j;
/* loaded from: classes.dex */
public final class f implements d.b.b<String> {

    /* renamed from: a  reason: collision with root package name */
    private static final f f3787a = new f();

    public static f a() {
        return f3787a;
    }

    public static String b() {
        String a2 = e.a();
        d.b.d.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // javax.inject.Provider
    /* renamed from: get  reason: collision with other method in class */
    public String mo254get() {
        return b();
    }
}

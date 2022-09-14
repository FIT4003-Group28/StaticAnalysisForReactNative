package c.e.a.a.i;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class j implements d.b.b<Executor> {

    /* renamed from: a  reason: collision with root package name */
    private static final j f3713a = new j();

    public static j a() {
        return f3713a;
    }

    public static Executor b() {
        Executor a2 = i.a();
        d.b.d.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // javax.inject.Provider
    /* renamed from: get  reason: collision with other method in class */
    public Executor mo254get() {
        return b();
    }
}

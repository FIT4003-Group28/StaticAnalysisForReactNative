package d.b;
/* loaded from: classes.dex */
public final class c<T> implements b<T>, d.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f10118a;

    static {
        new c(null);
    }

    private c(T t) {
        this.f10118a = t;
    }

    public static <T> b<T> a(T t) {
        d.a(t, "instance cannot be null");
        return new c(t);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public T mo254get() {
        return this.f10118a;
    }
}

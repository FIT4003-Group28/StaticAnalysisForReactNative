package d.b;

import javax.inject.Provider;
/* loaded from: classes.dex */
public final class a<T> implements Provider<T>, d.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f10115c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Provider<T> f10116a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f10117b = f10115c;

    private a(Provider<T> provider) {
        this.f10116a = provider;
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != f10115c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static <P extends Provider<T>, T> Provider<T> a(P p) {
        d.a(p);
        return p instanceof a ? p : new a(p);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public T mo254get() {
        T t = (T) this.f10117b;
        if (t == f10115c) {
            synchronized (this) {
                t = this.f10117b;
                if (t == f10115c) {
                    t = this.f10116a.mo254get();
                    a(this.f10117b, t);
                    this.f10117b = t;
                    this.f10116a = null;
                }
            }
        }
        return t;
    }
}

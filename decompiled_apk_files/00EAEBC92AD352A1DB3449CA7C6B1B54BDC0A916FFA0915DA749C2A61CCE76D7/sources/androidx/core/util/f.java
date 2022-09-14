package androidx.core.util;
/* loaded from: classes.dex */
public class f<T> extends Pools$SimplePool<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f1595c;

    public f(int i) {
        super(i);
        this.f1595c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.e
    public T a() {
        T t;
        synchronized (this.f1595c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.e
    public boolean a(T t) {
        boolean a2;
        synchronized (this.f1595c) {
            a2 = super.a(t);
        }
        return a2;
    }
}

package c.d.d.h;

import java.lang.ref.SoftReference;
/* loaded from: classes.dex */
public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    SoftReference<T> f2842a = null;

    /* renamed from: b  reason: collision with root package name */
    SoftReference<T> f2843b = null;

    /* renamed from: c  reason: collision with root package name */
    SoftReference<T> f2844c = null;

    public void a() {
        SoftReference<T> softReference = this.f2842a;
        if (softReference != null) {
            softReference.clear();
            this.f2842a = null;
        }
        SoftReference<T> softReference2 = this.f2843b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f2843b = null;
        }
        SoftReference<T> softReference3 = this.f2844c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f2844c = null;
        }
    }

    public void a(T t) {
        this.f2842a = new SoftReference<>(t);
        this.f2843b = new SoftReference<>(t);
        this.f2844c = new SoftReference<>(t);
    }

    public T b() {
        SoftReference<T> softReference = this.f2842a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }
}

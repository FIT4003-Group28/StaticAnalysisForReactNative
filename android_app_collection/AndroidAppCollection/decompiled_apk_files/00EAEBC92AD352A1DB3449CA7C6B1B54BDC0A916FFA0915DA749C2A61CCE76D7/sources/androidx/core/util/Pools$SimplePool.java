package androidx.core.util;
/* loaded from: classes.dex */
public class Pools$SimplePool<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f1589a;

    /* renamed from: b  reason: collision with root package name */
    private int f1590b;

    public Pools$SimplePool(int i) {
        if (i > 0) {
            this.f1589a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean b(T t) {
        for (int i = 0; i < this.f1590b; i++) {
            if (this.f1589a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.e
    public T a() {
        int i = this.f1590b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f1589a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f1590b = i - 1;
            return t;
        }
        return null;
    }

    @Override // androidx.core.util.e
    public boolean a(T t) {
        if (!b(t)) {
            int i = this.f1590b;
            Object[] objArr = this.f1589a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f1590b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}

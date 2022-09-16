package defpackage;
/* compiled from: PG */
/* renamed from: dz  reason: default package */
/* loaded from: classes6.dex */
final class dz<T> {
    public final Object[] a = new Object[256];
    public int b;

    public final T a() {
        int i = this.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.b = i2;
            return t;
        }
        return null;
    }

    public final void b(T t) {
        int i = this.b;
        if (i < 256) {
            this.a[i] = t;
            this.b = i + 1;
        }
    }
}

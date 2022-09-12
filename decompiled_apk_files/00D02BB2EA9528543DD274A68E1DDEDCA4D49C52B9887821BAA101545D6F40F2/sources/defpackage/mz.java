package defpackage;
/* compiled from: PG */
/* renamed from: mz  reason: default package */
/* loaded from: classes.dex */
public class mz<T> implements my<T> {
    private final Object[] a;
    private int b;

    public mz(int i) {
        this.a = new Object[i];
    }

    @Override // defpackage.my
    public T a() {
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

    @Override // defpackage.my
    public boolean b(T t) {
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                Object[] objArr = this.a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = t;
                this.b = i2 + 1;
                return true;
            } else if (this.a[i] == t) {
                throw new IllegalStateException("Already in the pool!");
            } else {
                i++;
            }
        }
    }
}

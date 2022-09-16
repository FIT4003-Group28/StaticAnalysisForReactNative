package defpackage;
/* compiled from: PG */
/* renamed from: ain  reason: default package */
/* loaded from: classes.dex */
public final class ain<E> implements Cloneable {
    public static final Object a = new Object();
    public boolean b;
    public int[] c;
    public Object[] d;
    public int e;

    public ain() {
        this(10);
    }

    /* renamed from: a */
    public final ain<E> clone() {
        try {
            ain<E> ainVar = (ain) super.clone();
            ainVar.c = (int[]) this.c.clone();
            ainVar.d = (Object[]) this.d.clone();
            return ainVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final E b(int i) {
        return c(i, null);
    }

    public final E c(int i, E e) {
        int e2 = aii.e(this.c, this.e, i);
        if (e2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[e2] != a) {
                return (E) objArr[e2];
            }
        }
        return e;
    }

    public final void d() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void e(int i, E e) {
        int e2 = aii.e(this.c, this.e, i);
        if (e2 >= 0) {
            this.d[e2] = e;
            return;
        }
        int i2 = e2 ^ (-1);
        int i3 = this.e;
        if (i2 < i3) {
            Object[] objArr = this.d;
            if (objArr[i2] == a) {
                this.c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.b && i3 >= this.c.length) {
            d();
            i2 = aii.e(this.c, this.e, i) ^ (-1);
        }
        int i4 = this.e;
        if (i4 >= this.c.length) {
            int a2 = aii.a(i4 + 1);
            int[] iArr = new int[a2];
            Object[] objArr2 = new Object[a2];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = iArr;
            this.d = objArr2;
        }
        int i5 = this.e - i2;
        if (i5 != 0) {
            int[] iArr3 = this.c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = e;
        this.e++;
    }

    public final int f() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public final int g(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public final E h(int i) {
        if (this.b) {
            d();
        }
        return (E) this.d[i];
    }

    public final int i(E e) {
        if (this.b) {
            d();
        }
        for (int i = 0; i < this.e; i++) {
            if (this.d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public final void j(int i, E e) {
        int i2 = this.e;
        if (i2 == 0 || i > this.c[i2 - 1]) {
            if (this.b && i2 >= this.c.length) {
                d();
            }
            int i3 = this.e;
            if (i3 >= this.c.length) {
                int a2 = aii.a(i3 + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                int[] iArr2 = this.c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = iArr;
                this.d = objArr;
            }
            this.c[i3] = i;
            this.d[i3] = e;
            this.e = i3 + 1;
            return;
        }
        e(i, e);
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(g(i));
            sb.append('=');
            E h = h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ain(int i) {
        this.b = false;
        if (i == 0) {
            this.c = aii.a;
            this.d = aii.c;
            return;
        }
        int a2 = aii.a(i);
        this.c = new int[a2];
        this.d = new Object[a2];
    }
}

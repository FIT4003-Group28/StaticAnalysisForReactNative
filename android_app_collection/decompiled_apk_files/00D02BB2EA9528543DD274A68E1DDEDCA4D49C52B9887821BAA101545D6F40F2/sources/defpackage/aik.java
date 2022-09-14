package defpackage;
/* compiled from: PG */
/* renamed from: aik  reason: default package */
/* loaded from: classes.dex */
public final class aik<E> implements Cloneable {
    public static final Object a = new Object();
    public boolean b;
    public long[] c;
    public Object[] d;
    public int e;

    public aik() {
        this(10);
    }

    private final void k() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    /* renamed from: a */
    public final aik<E> clone() {
        try {
            aik<E> aikVar = (aik) super.clone();
            aikVar.c = (long[]) this.c.clone();
            aikVar.d = (Object[]) this.d.clone();
            return aikVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final E b(long j) {
        return c(j, null);
    }

    public final E c(long j, E e) {
        int f = aii.f(this.c, this.e, j);
        if (f >= 0) {
            Object[] objArr = this.d;
            if (objArr[f] != a) {
                return (E) objArr[f];
            }
        }
        return e;
    }

    public final void d(long j, E e) {
        int f = aii.f(this.c, this.e, j);
        if (f >= 0) {
            this.d[f] = e;
            return;
        }
        int i = f ^ (-1);
        int i2 = this.e;
        if (i < i2) {
            Object[] objArr = this.d;
            if (objArr[i] == a) {
                this.c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.b && i2 >= this.c.length) {
            k();
            i = aii.f(this.c, this.e, j) ^ (-1);
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int b = aii.b(i3 + 1);
            long[] jArr = new long[b];
            Object[] objArr2 = new Object[b];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i4 = this.e - i;
        if (i4 != 0) {
            long[] jArr3 = this.c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i5, this.e - i);
        }
        this.c[i] = j;
        this.d[i] = e;
        this.e++;
    }

    public final int e() {
        if (this.b) {
            k();
        }
        return this.e;
    }

    public final long f(int i) {
        if (this.b) {
            k();
        }
        return this.c[i];
    }

    public final E g(int i) {
        if (this.b) {
            k();
        }
        return (E) this.d[i];
    }

    public final int h(long j) {
        if (this.b) {
            k();
        }
        return aii.f(this.c, this.e, j);
    }

    public final void i() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final void j(long j, E e) {
        int i = this.e;
        if (i == 0 || j > this.c[i - 1]) {
            if (this.b && i >= this.c.length) {
                k();
            }
            int i2 = this.e;
            if (i2 >= this.c.length) {
                int b = aii.b(i2 + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = jArr;
                this.d = objArr;
            }
            this.c[i2] = j;
            this.d[i2] = e;
            this.e = i2 + 1;
            return;
        }
        d(j, e);
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(f(i));
            sb.append('=');
            E g = g(i);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public aik(int i) {
        this.b = false;
        if (i == 0) {
            this.c = aii.b;
            this.d = aii.c;
            return;
        }
        int b = aii.b(i);
        this.c = new long[b];
        this.d = new Object[b];
    }
}

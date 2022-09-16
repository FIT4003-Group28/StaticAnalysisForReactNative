package a.e;
/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f133f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f134b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f135c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f136d;

    /* renamed from: e  reason: collision with root package name */
    private int f137e;

    public d() {
        this(10);
    }

    public d(int i) {
        this.f134b = false;
        if (i == 0) {
            this.f135c = c.f131b;
            this.f136d = c.f132c;
            return;
        }
        int c2 = c.c(i);
        this.f135c = new long[c2];
        this.f136d = new Object[c2];
    }

    private void c() {
        int i = this.f137e;
        long[] jArr = this.f135c;
        Object[] objArr = this.f136d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f133f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f134b = false;
        this.f137e = i2;
    }

    public long a(int i) {
        if (this.f134b) {
            c();
        }
        return this.f135c[i];
    }

    public void a() {
        int i = this.f137e;
        Object[] objArr = this.f136d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f137e = 0;
        this.f134b = false;
    }

    public void a(long j, E e2) {
        int i = this.f137e;
        if (i != 0 && j <= this.f135c[i - 1]) {
            c(j, e2);
            return;
        }
        if (this.f134b && this.f137e >= this.f135c.length) {
            c();
        }
        int i2 = this.f137e;
        if (i2 >= this.f135c.length) {
            int c2 = c.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr = new Object[c2];
            long[] jArr2 = this.f135c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f136d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f135c = jArr;
            this.f136d = objArr;
        }
        this.f135c[i2] = j;
        this.f136d[i2] = e2;
        this.f137e = i2 + 1;
    }

    public boolean a(long j) {
        return d(j) >= 0;
    }

    public int b() {
        if (this.f134b) {
            c();
        }
        return this.f137e;
    }

    public E b(long j, E e2) {
        int a2 = c.a(this.f135c, this.f137e, j);
        if (a2 >= 0) {
            Object[] objArr = this.f136d;
            if (objArr[a2] != f133f) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public void b(int i) {
        Object[] objArr = this.f136d;
        Object obj = objArr[i];
        Object obj2 = f133f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f134b = true;
        }
    }

    @Deprecated
    public void b(long j) {
        e(j);
    }

    public E c(int i) {
        if (this.f134b) {
            c();
        }
        return (E) this.f136d[i];
    }

    public E c(long j) {
        return b(j, null);
    }

    public void c(long j, E e2) {
        int a2 = c.a(this.f135c, this.f137e, j);
        if (a2 >= 0) {
            this.f136d[a2] = e2;
            return;
        }
        int i = ~a2;
        if (i < this.f137e) {
            Object[] objArr = this.f136d;
            if (objArr[i] == f133f) {
                this.f135c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f134b && this.f137e >= this.f135c.length) {
            c();
            i = ~c.a(this.f135c, this.f137e, j);
        }
        int i2 = this.f137e;
        if (i2 >= this.f135c.length) {
            int c2 = c.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr2 = new Object[c2];
            long[] jArr2 = this.f135c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f136d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f135c = jArr;
            this.f136d = objArr2;
        }
        int i3 = this.f137e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f135c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f136d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f137e - i);
        }
        this.f135c[i] = j;
        this.f136d[i] = e2;
        this.f137e++;
    }

    /* renamed from: clone */
    public d<E> m4clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f135c = (long[]) this.f135c.clone();
            dVar.f136d = (Object[]) this.f136d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public int d(long j) {
        if (this.f134b) {
            c();
        }
        return c.a(this.f135c, this.f137e, j);
    }

    public void e(long j) {
        int a2 = c.a(this.f135c, this.f137e, j);
        if (a2 >= 0) {
            Object[] objArr = this.f136d;
            Object obj = objArr[a2];
            Object obj2 = f133f;
            if (obj == obj2) {
                return;
            }
            objArr[a2] = obj2;
            this.f134b = true;
        }
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f137e * 28);
        sb.append('{');
        for (int i = 0; i < this.f137e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            E c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

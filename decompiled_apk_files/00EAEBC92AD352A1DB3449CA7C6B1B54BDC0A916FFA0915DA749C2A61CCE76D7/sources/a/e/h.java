package a.e;
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f168f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f169b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f170c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f171d;

    /* renamed from: e  reason: collision with root package name */
    private int f172e;

    public h() {
        this(10);
    }

    public h(int i) {
        this.f169b = false;
        if (i == 0) {
            this.f170c = c.f130a;
            this.f171d = c.f132c;
            return;
        }
        int b2 = c.b(i);
        this.f170c = new int[b2];
        this.f171d = new Object[b2];
    }

    private void c() {
        int i = this.f172e;
        int[] iArr = this.f170c;
        Object[] objArr = this.f171d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f168f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f169b = false;
        this.f172e = i2;
    }

    public int a(E e2) {
        if (this.f169b) {
            c();
        }
        for (int i = 0; i < this.f172e; i++) {
            if (this.f171d[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public E a(int i) {
        return b(i, null);
    }

    public void a() {
        int i = this.f172e;
        Object[] objArr = this.f171d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f172e = 0;
        this.f169b = false;
    }

    public void a(int i, E e2) {
        int i2 = this.f172e;
        if (i2 != 0 && i <= this.f170c[i2 - 1]) {
            c(i, e2);
            return;
        }
        if (this.f169b && this.f172e >= this.f170c.length) {
            c();
        }
        int i3 = this.f172e;
        if (i3 >= this.f170c.length) {
            int b2 = c.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr = new Object[b2];
            int[] iArr2 = this.f170c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f171d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f170c = iArr;
            this.f171d = objArr;
        }
        this.f170c[i3] = i;
        this.f171d[i3] = e2;
        this.f172e = i3 + 1;
    }

    public int b() {
        if (this.f169b) {
            c();
        }
        return this.f172e;
    }

    public int b(int i) {
        if (this.f169b) {
            c();
        }
        return c.a(this.f170c, this.f172e, i);
    }

    public E b(int i, E e2) {
        int a2 = c.a(this.f170c, this.f172e, i);
        if (a2 >= 0) {
            Object[] objArr = this.f171d;
            if (objArr[a2] != f168f) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int c(int i) {
        if (this.f169b) {
            c();
        }
        return this.f170c[i];
    }

    public void c(int i, E e2) {
        int a2 = c.a(this.f170c, this.f172e, i);
        if (a2 >= 0) {
            this.f171d[a2] = e2;
            return;
        }
        int i2 = ~a2;
        if (i2 < this.f172e) {
            Object[] objArr = this.f171d;
            if (objArr[i2] == f168f) {
                this.f170c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f169b && this.f172e >= this.f170c.length) {
            c();
            i2 = ~c.a(this.f170c, this.f172e, i);
        }
        int i3 = this.f172e;
        if (i3 >= this.f170c.length) {
            int b2 = c.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr2 = new Object[b2];
            int[] iArr2 = this.f170c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f171d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f170c = iArr;
            this.f171d = objArr2;
        }
        int i4 = this.f172e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f170c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f171d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f172e - i2);
        }
        this.f170c[i2] = i;
        this.f171d[i2] = e2;
        this.f172e++;
    }

    /* renamed from: clone */
    public h<E> m6clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f170c = (int[]) this.f170c.clone();
            hVar.f171d = (Object[]) this.f171d.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public void d(int i) {
        int a2 = c.a(this.f170c, this.f172e, i);
        if (a2 >= 0) {
            Object[] objArr = this.f171d;
            Object obj = objArr[a2];
            Object obj2 = f168f;
            if (obj == obj2) {
                return;
            }
            objArr[a2] = obj2;
            this.f169b = true;
        }
    }

    public E e(int i) {
        if (this.f169b) {
            c();
        }
        return (E) this.f171d[i];
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f172e * 28);
        sb.append('{');
        for (int i = 0; i < this.f172e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(c(i));
            sb.append('=');
            E e2 = e(i);
            if (e2 != this) {
                sb.append(e2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

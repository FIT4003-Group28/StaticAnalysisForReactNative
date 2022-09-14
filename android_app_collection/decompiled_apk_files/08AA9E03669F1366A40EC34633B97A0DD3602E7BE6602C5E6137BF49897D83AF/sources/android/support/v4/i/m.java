package android.support.v4.i;
/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public class m<E> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f477a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f478b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f479c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f480d;
    private int e;

    public m() {
        this(10);
    }

    public m(int i) {
        this.f478b = false;
        if (i == 0) {
            this.f479c = c.f446a;
            this.f480d = c.f448c;
        } else {
            int a2 = c.a(i);
            this.f479c = new int[a2];
            this.f480d = new Object[a2];
        }
        this.e = 0;
    }

    /* renamed from: a */
    public m<E> clone() {
        try {
            m<E> mVar = (m) super.clone();
            try {
                mVar.f479c = (int[]) this.f479c.clone();
                mVar.f480d = (Object[]) this.f480d.clone();
                return mVar;
            } catch (CloneNotSupportedException unused) {
                return mVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public E a(int i) {
        return a(i, null);
    }

    public E a(int i, E e) {
        int a2 = c.a(this.f479c, this.e, i);
        return (a2 < 0 || this.f480d[a2] == f477a) ? e : (E) this.f480d[a2];
    }

    public void b(int i) {
        int a2 = c.a(this.f479c, this.e, i);
        if (a2 < 0 || this.f480d[a2] == f477a) {
            return;
        }
        this.f480d[a2] = f477a;
        this.f478b = true;
    }

    public void c(int i) {
        b(i);
    }

    private void d() {
        int i = this.e;
        int[] iArr = this.f479c;
        Object[] objArr = this.f480d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f477a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f478b = false;
        this.e = i2;
    }

    public void b(int i, E e) {
        int a2 = c.a(this.f479c, this.e, i);
        if (a2 >= 0) {
            this.f480d[a2] = e;
            return;
        }
        int i2 = ~a2;
        if (i2 < this.e && this.f480d[i2] == f477a) {
            this.f479c[i2] = i;
            this.f480d[i2] = e;
            return;
        }
        if (this.f478b && this.e >= this.f479c.length) {
            d();
            i2 = ~c.a(this.f479c, this.e, i);
        }
        if (this.e >= this.f479c.length) {
            int a3 = c.a(this.e + 1);
            int[] iArr = new int[a3];
            Object[] objArr = new Object[a3];
            System.arraycopy(this.f479c, 0, iArr, 0, this.f479c.length);
            System.arraycopy(this.f480d, 0, objArr, 0, this.f480d.length);
            this.f479c = iArr;
            this.f480d = objArr;
        }
        if (this.e - i2 != 0) {
            int i3 = i2 + 1;
            System.arraycopy(this.f479c, i2, this.f479c, i3, this.e - i2);
            System.arraycopy(this.f480d, i2, this.f480d, i3, this.e - i2);
        }
        this.f479c[i2] = i;
        this.f480d[i2] = e;
        this.e++;
    }

    public int b() {
        if (this.f478b) {
            d();
        }
        return this.e;
    }

    public int d(int i) {
        if (this.f478b) {
            d();
        }
        return this.f479c[i];
    }

    public E e(int i) {
        if (this.f478b) {
            d();
        }
        return (E) this.f480d[i];
    }

    public int f(int i) {
        if (this.f478b) {
            d();
        }
        return c.a(this.f479c, this.e, i);
    }

    public void c() {
        int i = this.e;
        Object[] objArr = this.f480d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f478b = false;
    }

    public void c(int i, E e) {
        if (this.e != 0 && i <= this.f479c[this.e - 1]) {
            b(i, e);
            return;
        }
        if (this.f478b && this.e >= this.f479c.length) {
            d();
        }
        int i2 = this.e;
        if (i2 >= this.f479c.length) {
            int a2 = c.a(i2 + 1);
            int[] iArr = new int[a2];
            Object[] objArr = new Object[a2];
            System.arraycopy(this.f479c, 0, iArr, 0, this.f479c.length);
            System.arraycopy(this.f480d, 0, objArr, 0, this.f480d.length);
            this.f479c = iArr;
            this.f480d = objArr;
        }
        this.f479c[i2] = i;
        this.f480d[i2] = e;
        this.e = i2 + 1;
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(d(i));
            sb.append('=');
            E e = e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

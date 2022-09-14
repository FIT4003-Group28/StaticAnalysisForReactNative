package android.support.v4.i;
/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f451a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f452b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f453c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f454d;
    private int e;

    public f() {
        this(10);
    }

    public f(int i) {
        this.f452b = false;
        if (i == 0) {
            this.f453c = c.f447b;
            this.f454d = c.f448c;
        } else {
            int b2 = c.b(i);
            this.f453c = new long[b2];
            this.f454d = new Object[b2];
        }
        this.e = 0;
    }

    /* renamed from: a */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            try {
                fVar.f453c = (long[]) this.f453c.clone();
                fVar.f454d = (Object[]) this.f454d.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                return fVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public E a(long j) {
        return a(j, null);
    }

    public E a(long j, E e) {
        int a2 = c.a(this.f453c, this.e, j);
        return (a2 < 0 || this.f454d[a2] == f451a) ? e : (E) this.f454d[a2];
    }

    public void b(long j) {
        int a2 = c.a(this.f453c, this.e, j);
        if (a2 < 0 || this.f454d[a2] == f451a) {
            return;
        }
        this.f454d[a2] = f451a;
        this.f452b = true;
    }

    private void c() {
        int i = this.e;
        long[] jArr = this.f453c;
        Object[] objArr = this.f454d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f451a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f452b = false;
        this.e = i2;
    }

    public void b(long j, E e) {
        int a2 = c.a(this.f453c, this.e, j);
        if (a2 >= 0) {
            this.f454d[a2] = e;
            return;
        }
        int i = ~a2;
        if (i < this.e && this.f454d[i] == f451a) {
            this.f453c[i] = j;
            this.f454d[i] = e;
            return;
        }
        if (this.f452b && this.e >= this.f453c.length) {
            c();
            i = ~c.a(this.f453c, this.e, j);
        }
        if (this.e >= this.f453c.length) {
            int b2 = c.b(this.e + 1);
            long[] jArr = new long[b2];
            Object[] objArr = new Object[b2];
            System.arraycopy(this.f453c, 0, jArr, 0, this.f453c.length);
            System.arraycopy(this.f454d, 0, objArr, 0, this.f454d.length);
            this.f453c = jArr;
            this.f454d = objArr;
        }
        if (this.e - i != 0) {
            int i2 = i + 1;
            System.arraycopy(this.f453c, i, this.f453c, i2, this.e - i);
            System.arraycopy(this.f454d, i, this.f454d, i2, this.e - i);
        }
        this.f453c[i] = j;
        this.f454d[i] = e;
        this.e++;
    }

    public int b() {
        if (this.f452b) {
            c();
        }
        return this.e;
    }

    public long a(int i) {
        if (this.f452b) {
            c();
        }
        return this.f453c[i];
    }

    public E b(int i) {
        if (this.f452b) {
            c();
        }
        return (E) this.f454d[i];
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
            sb.append(a(i));
            sb.append('=');
            E b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

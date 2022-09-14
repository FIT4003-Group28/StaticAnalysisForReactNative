package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class t7 {

    /* renamed from: f  reason: collision with root package name */
    private static final t7 f4429f = new t7(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f4430a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f4431b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f4432c;

    /* renamed from: d  reason: collision with root package name */
    private int f4433d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4434e;

    private t7() {
        this(0, new int[8], new Object[8], true);
    }

    private t7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f4433d = -1;
        this.f4430a = i;
        this.f4431b = iArr;
        this.f4432c = objArr;
        this.f4434e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t7 a(t7 t7Var, t7 t7Var2) {
        int i = t7Var.f4430a + t7Var2.f4430a;
        int[] copyOf = Arrays.copyOf(t7Var.f4431b, i);
        System.arraycopy(t7Var2.f4431b, 0, copyOf, t7Var.f4430a, t7Var2.f4430a);
        Object[] copyOf2 = Arrays.copyOf(t7Var.f4432c, i);
        System.arraycopy(t7Var2.f4432c, 0, copyOf2, t7Var.f4430a, t7Var2.f4430a);
        return new t7(i, copyOf, copyOf2, true);
    }

    private static void a(int i, Object obj, o8 o8Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            o8Var.e(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            o8Var.c(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            o8Var.a(i2, (v3) obj);
        } else if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(j5.d());
            }
            o8Var.d(i2, ((Integer) obj).intValue());
        } else if (o8Var.f() == b5.f.k) {
            o8Var.a(i2);
            ((t7) obj).b(o8Var);
            o8Var.b(i2);
        } else {
            o8Var.b(i2);
            ((t7) obj).b(o8Var);
            o8Var.a(i2);
        }
    }

    public static t7 d() {
        return f4429f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t7 e() {
        return new t7();
    }

    public final void a() {
        this.f4434e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        if (this.f4434e) {
            int i2 = this.f4430a;
            if (i2 == this.f4431b.length) {
                int i3 = this.f4430a + (i2 < 4 ? 8 : i2 >> 1);
                this.f4431b = Arrays.copyOf(this.f4431b, i3);
                this.f4432c = Arrays.copyOf(this.f4432c, i3);
            }
            int[] iArr = this.f4431b;
            int i4 = this.f4430a;
            iArr[i4] = i;
            this.f4432c[i4] = obj;
            this.f4430a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(o8 o8Var) {
        if (o8Var.f() == b5.f.l) {
            for (int i = this.f4430a - 1; i >= 0; i--) {
                o8Var.a(this.f4431b[i] >>> 3, this.f4432c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f4430a; i2++) {
            o8Var.a(this.f4431b[i2] >>> 3, this.f4432c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f4430a; i2++) {
            q6.a(sb, i, String.valueOf(this.f4431b[i2] >>> 3), this.f4432c[i2]);
        }
    }

    public final int b() {
        int i = this.f4433d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4430a; i3++) {
            i2 += j4.d(this.f4431b[i3] >>> 3, (v3) this.f4432c[i3]);
        }
        this.f4433d = i2;
        return i2;
    }

    public final void b(o8 o8Var) {
        if (this.f4430a == 0) {
            return;
        }
        if (o8Var.f() == b5.f.k) {
            for (int i = 0; i < this.f4430a; i++) {
                a(this.f4431b[i], this.f4432c[i], o8Var);
            }
            return;
        }
        for (int i2 = this.f4430a - 1; i2 >= 0; i2--) {
            a(this.f4431b[i2], this.f4432c[i2], o8Var);
        }
    }

    public final int c() {
        int e2;
        int i = this.f4433d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4430a; i3++) {
            int i4 = this.f4431b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                e2 = j4.e(i5, ((Long) this.f4432c[i3]).longValue());
            } else if (i6 == 1) {
                e2 = j4.g(i5, ((Long) this.f4432c[i3]).longValue());
            } else if (i6 == 2) {
                e2 = j4.c(i5, (v3) this.f4432c[i3]);
            } else if (i6 == 3) {
                e2 = (j4.e(i5) << 1) + ((t7) this.f4432c[i3]).c();
            } else if (i6 != 5) {
                throw new IllegalStateException(j5.d());
            } else {
                e2 = j4.i(i5, ((Integer) this.f4432c[i3]).intValue());
            }
            i2 += e2;
        }
        this.f4433d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        int i = this.f4430a;
        if (i == t7Var.f4430a) {
            int[] iArr = this.f4431b;
            int[] iArr2 = t7Var.f4431b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f4432c;
                Object[] objArr2 = t7Var.f4432c;
                int i3 = this.f4430a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4430a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f4431b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f4432c;
        int i7 = this.f4430a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}

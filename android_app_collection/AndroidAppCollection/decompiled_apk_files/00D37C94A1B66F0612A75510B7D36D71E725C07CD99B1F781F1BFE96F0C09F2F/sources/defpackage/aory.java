package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aory  reason: default package */
/* loaded from: classes.dex */
public final class aory {
    public static final aory a = new aory(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private aory() {
        this(0, new int[8], new Object[8], true);
    }

    private aory(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aory b(aory aoryVar, aory aoryVar2) {
        int i = aoryVar.b + aoryVar2.b;
        int[] copyOf = Arrays.copyOf(aoryVar.c, i);
        System.arraycopy(aoryVar2.c, 0, copyOf, aoryVar.b, aoryVar2.b);
        Object[] copyOf2 = Arrays.copyOf(aoryVar.d, i);
        System.arraycopy(aoryVar2.d, 0, copyOf2, aoryVar.b, aoryVar2.b);
        return new aory(i, copyOf, copyOf2, true);
    }

    public static aory c() {
        return new aory();
    }

    public final int a() {
        int af;
        int i = this.e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.b; i3++) {
                int i4 = this.c[i3];
                int a2 = aosl.a(i4);
                int b = aosl.b(i4);
                if (b == 0) {
                    af = aool.af(a2, ((Long) this.d[i3]).longValue());
                } else if (b == 1) {
                    ((Long) this.d[i3]).longValue();
                    af = aool.aB(a2);
                } else if (b == 2) {
                    af = aool.I(a2, (aoob) this.d[i3]);
                } else if (b == 3) {
                    int ac = aool.ac(a2);
                    af = ac + ac + ((aory) this.d[i3]).a();
                } else if (b == 5) {
                    ((Integer) this.d[i3]).intValue();
                    af = aool.aA(a2);
                } else {
                    throw new IllegalStateException(aopx.a());
                }
                i2 += af;
            }
            this.e = i2;
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.f) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e() {
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aory)) {
            return false;
        }
        aory aoryVar = (aory) obj;
        int i = this.b;
        if (i == aoryVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = aoryVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = aoryVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        d();
        int i2 = this.b;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.c = Arrays.copyOf(iArr, i3);
            this.d = Arrays.copyOf(this.d, i3);
        }
        int[] iArr2 = this.c;
        int i4 = this.b;
        iArr2[i4] = i;
        this.d[i4] = obj;
        this.b = i4 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(int i, aoog aoogVar) {
        int n;
        d();
        int a2 = aosl.a(i);
        int b = aosl.b(i);
        if (b == 0) {
            f(i, Long.valueOf(aoogVar.q()));
            return true;
        } else if (b == 1) {
            f(i, Long.valueOf(aoogVar.p()));
            return true;
        } else if (b == 2) {
            f(i, aoogVar.x());
            return true;
        } else if (b != 3) {
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                f(i, Integer.valueOf(aoogVar.h()));
                return true;
            }
            throw aopx.a();
        } else {
            aory aoryVar = new aory();
            do {
                n = aoogVar.n();
                if (n == 0) {
                    break;
                }
            } while (aoryVar.g(n, aoogVar));
            aoogVar.B(aosl.c(a2, 4));
            f(i, aoryVar);
            return true;
        }
    }

    public final void h(aoom aoomVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int a2 = aosl.a(i2);
                int b = aosl.b(i2);
                if (b == 0) {
                    aoomVar.j(a2, ((Long) obj).longValue());
                } else if (b == 1) {
                    aoomVar.f(a2, ((Long) obj).longValue());
                } else if (b == 2) {
                    aoomVar.b(a2, (aoob) obj);
                } else if (b == 3) {
                    aoomVar.a.B(a2, 3);
                    ((aory) obj).h(aoomVar);
                    aoomVar.a.B(a2, 4);
                } else if (b == 5) {
                    aoomVar.e(a2, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(aopx.a());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}

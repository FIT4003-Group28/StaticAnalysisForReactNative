package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dsty  reason: default package */
/* loaded from: classes.dex */
public final class dsty {
    public static final dsty a = new dsty(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private dsty() {
        this(0, new int[8], new Object[8], true);
    }

    private dsty(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsty a() {
        return new dsty(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsty b(dsty dstyVar, dsty dstyVar2) {
        int i = dstyVar.b + dstyVar2.b;
        int[] copyOf = Arrays.copyOf(dstyVar.c, i);
        System.arraycopy(dstyVar2.c, 0, copyOf, dstyVar.b, dstyVar2.b);
        Object[] copyOf2 = Arrays.copyOf(dstyVar.d, i);
        System.arraycopy(dstyVar2.d, 0, copyOf2, dstyVar.b, dstyVar2.b);
        return new dsty(i, copyOf, copyOf2, true);
    }

    public final void c() {
        this.f = false;
    }

    public final int d() {
        int S;
        int i = this.e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.b; i3++) {
                int i4 = this.c[i3];
                int b = dsut.b(i4);
                int a2 = dsut.a(i4);
                if (a2 == 0) {
                    S = dspp.S(b, ((Long) this.d[i3]).longValue());
                } else if (a2 == 1) {
                    Long l = (Long) this.d[i3];
                    S = dspp.av(b);
                } else if (a2 == 2) {
                    S = dspp.W(b, (dspd) this.d[i3]);
                } else if (a2 == 3) {
                    int Y = dspp.Y(b);
                    S = Y + Y + ((dsty) this.d[i3]).d();
                } else if (a2 == 5) {
                    Integer num = (Integer) this.d[i3];
                    S = dspp.au(b);
                } else {
                    throw new IllegalStateException(dsrm.f());
                }
                i2 += S;
            }
            this.e = i2;
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, Object obj) {
        if (this.f) {
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
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dsty)) {
            return false;
        }
        dsty dstyVar = (dsty) obj;
        int i = this.b;
        if (i == dstyVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = dstyVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = dstyVar.d;
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

    public final void f(dspq dspqVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int b = dsut.b(i2);
                int a2 = dsut.a(i2);
                if (a2 == 0) {
                    dspqVar.b(b, ((Long) obj).longValue());
                } else if (a2 == 1) {
                    dspqVar.i(b, ((Long) obj).longValue());
                } else if (a2 == 2) {
                    dspqVar.m(b, (dspd) obj);
                } else if (a2 == 3) {
                    dspqVar.a.aB(b, 3);
                    ((dsty) obj).f(dspqVar);
                    dspqVar.a.aB(b, 4);
                } else if (a2 == 5) {
                    dspqVar.j(b, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(dsrm.f());
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

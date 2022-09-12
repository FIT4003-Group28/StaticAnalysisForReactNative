package defpackage;
/* compiled from: PG */
/* renamed from: clss  reason: default package */
/* loaded from: classes5.dex */
public final class clss {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!clst.c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.b = clst.a[3 - i3];
        int i6 = clst.b[i5];
        this.d = i6;
        int i7 = 2;
        if (i2 == 2) {
            this.d = i6 / 2;
        } else if (i2 == 0) {
            this.d = i6 / 4;
        }
        int i8 = (i >>> 9) & 1;
        this.g = clst.d(i2, i3);
        if (i3 == 3) {
            int i9 = i2 == 3 ? clst.c[i4 - 1] : clst.d[i4 - 1];
            this.f = i9;
            this.c = (((i9 * 12) / this.d) + i8) * 4;
        } else {
            int i10 = 144;
            if (i2 == 3) {
                int i11 = i3 == 2 ? clst.e[i4 - 1] : clst.f[i4 - 1];
                this.f = i11;
                this.c = ((i11 * 144) / this.d) + i8;
            } else {
                int i12 = clst.g[i4 - 1];
                this.f = i12;
                if (i3 == 1) {
                    i10 = 72;
                }
                this.c = ((i10 * i12) / this.d) + i8;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i7 = 1;
        }
        this.e = i7;
        return true;
    }
}

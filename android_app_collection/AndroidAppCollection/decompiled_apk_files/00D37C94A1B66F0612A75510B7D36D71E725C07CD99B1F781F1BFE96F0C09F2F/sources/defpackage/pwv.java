package defpackage;
/* compiled from: PG */
/* renamed from: pwv  reason: default package */
/* loaded from: classes4.dex */
public final class pwv {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public pwv(byte[] bArr, int i, int i2) {
        d(bArr, i, i2);
    }

    private final void h() {
        int i;
        int i2 = this.c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.b) && (i2 != i || this.d != 0))) {
            z = false;
        }
        ptx.e(z);
    }

    private final boolean i(int i) {
        if (i < 2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public final int a(int i) {
        int i2;
        int i3;
        this.d += i;
        int i4 = 0;
        while (true) {
            i2 = this.d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            byte[] bArr = this.a;
            int i6 = this.c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != i(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        byte[] bArr2 = this.a;
        int i7 = this.c;
        int i8 = ((-1) >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            if (true != i(i7 + 1)) {
                i3 = 1;
            }
            this.c = i7 + i3;
        }
        h();
        return i8;
    }

    public final int b() {
        int i = 0;
        int i2 = 0;
        while (!g()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = a(i2);
        }
        return i3 + i;
    }

    public final int c() {
        int b = b();
        return (b % 2 == 0 ? -1 : 1) * ((b + 1) / 2);
    }

    public final void d(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        h();
    }

    public final void e() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.c;
            if (true == i(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        h();
    }

    public final void f(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.c) {
                if (i(i2)) {
                    this.c++;
                    i2 += 2;
                }
            } else {
                h();
                return;
            }
        }
    }

    public final boolean g() {
        boolean z = (this.a[this.c] & (128 >> this.d)) != 0;
        e();
        return z;
    }
}

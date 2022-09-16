package defpackage;
/* compiled from: PG */
/* renamed from: cmnl  reason: default package */
/* loaded from: classes5.dex */
public final class cmnl {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public cmnl(byte[] bArr, int i, int i2) {
        a(bArr, i, i2);
    }

    private final boolean h(int i) {
        if (i < 2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    private final void i() {
        int i;
        int i2 = this.c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.b) && (i2 != i || this.d != 0))) {
            z = false;
        }
        cmmn.c(z);
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        i();
    }

    public final void b() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.c;
            if (true == h(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        i();
    }

    public final void c(int i) {
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
                if (h(i2)) {
                    this.c++;
                    i2 += 2;
                }
            } else {
                i();
                return;
            }
        }
    }

    public final boolean d() {
        boolean z = (this.a[this.c] & (128 >> this.d)) != 0;
        b();
        return z;
    }

    public final int e(int i) {
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
            if (true != h(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        byte[] bArr2 = this.a;
        int i7 = this.c;
        int i8 = ((-1) >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            if (true != h(i7 + 1)) {
                i3 = 1;
            }
            this.c = i7 + i3;
        }
        i();
        return i8;
    }

    public final int f() {
        int g = g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }

    public final int g() {
        int i = 0;
        int i2 = 0;
        while (!d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = e(i2);
        }
        return i3 + i;
    }
}

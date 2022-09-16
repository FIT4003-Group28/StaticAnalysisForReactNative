package defpackage;

import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: ozt  reason: default package */
/* loaded from: classes4.dex */
final class ozt {
    public final byte[] a;
    private final int b;
    private int c;
    private int d;

    public ozt(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.b = length * 8;
    }

    public final int a() {
        return (this.c * 8) + this.d;
    }

    public final int b(int i) {
        int i2;
        int i3;
        int i4;
        pce.d(a() + i <= this.b);
        if (i == 0) {
            return 0;
        }
        int i5 = this.d;
        if (i5 != 0) {
            i2 = Math.min(i, 8 - i5);
            byte[] bArr = this.a;
            int i6 = this.c;
            byte b = bArr[i6];
            int i7 = this.d;
            i3 = (b >>> i7) & (PrivateKeyType.INVALID >>> (8 - i2));
            int i8 = i7 + i2;
            this.d = i8;
            if (i8 == 8) {
                this.c = i6 + 1;
                this.d = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i9 = i - i2;
        if (i9 > 7) {
            int i10 = i9 >> 3;
            for (int i11 = 0; i11 < i10; i11++) {
                byte[] bArr2 = this.a;
                this.c = this.c + 1;
                i3 = (int) (((bArr2[i4] & 255) << i2) | i3);
                i2 += 8;
            }
        }
        if (i <= i2) {
            return i3;
        }
        int i12 = i - i2;
        byte b2 = this.a[this.c];
        this.d += i12;
        return (((PrivateKeyType.INVALID >>> (8 - i12)) & b2) << i2) | i3;
    }

    public final void c(int i) {
        pce.d(a() + i <= this.b);
        int i2 = this.c + (i / 8);
        this.c = i2;
        int i3 = this.d + (i % 8);
        this.d = i3;
        if (i3 > 7) {
            this.c = i2 + 1;
            this.d = i3 - 8;
        }
    }

    public final boolean d() {
        return b(1) == 1;
    }
}

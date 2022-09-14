package defpackage;
/* compiled from: PG */
/* renamed from: clvl  reason: default package */
/* loaded from: classes5.dex */
public final class clvl {
    public int a;
    public int b;
    private final byte[] c;
    private final int d;

    public clvl(byte[] bArr) {
        this.c = bArr;
        this.d = bArr.length;
    }

    public final boolean a() {
        byte b = this.c[this.a];
        int i = this.b;
        c(1);
        return 1 == (((b & 255) >> i) & 1);
    }

    public final int b(int i) {
        int i2 = this.a;
        int min = Math.min(i, 8 - this.b);
        int i3 = i2 + 1;
        int i4 = ((this.c[i2] & 255) >> this.b) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.c[i3] & 255) << min;
            min += 8;
            i3++;
        }
        c(i);
        return ((-1) >>> (32 - i)) & i4;
    }

    public final void c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.a + i3;
        this.a = i4;
        int i5 = this.b + (i - (i3 * 8));
        this.b = i5;
        if (i5 > 7) {
            i4++;
            this.a = i4;
            i5 -= 8;
            this.b = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.d) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        cmmn.c(z);
    }
}

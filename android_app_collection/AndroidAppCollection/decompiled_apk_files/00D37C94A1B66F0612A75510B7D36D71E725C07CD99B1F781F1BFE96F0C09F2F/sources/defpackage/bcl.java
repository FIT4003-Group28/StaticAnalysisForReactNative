package defpackage;
/* compiled from: PG */
/* renamed from: bcl  reason: default package */
/* loaded from: classes2.dex */
final class bcl {
    public final bcm a = new bcm();
    public final pwu b = new pwu(new byte[65025], 0);
    public int c = -1;
    public boolean d;
    private int e;

    private final int b(int i) {
        int i2;
        int i3 = 0;
        this.e = 0;
        do {
            int i4 = this.e;
            int i5 = i + i4;
            bcm bcmVar = this.a;
            if (i5 >= bcmVar.c) {
                break;
            }
            int[] iArr = bcmVar.f;
            this.e = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean a(azf azfVar) {
        ptx.e(true);
        if (this.d) {
            this.d = false;
            this.b.C(0);
        }
        while (!this.d) {
            int i = this.c;
            if (i < 0) {
                if (!this.a.c(azfVar) || !this.a.b(azfVar, true)) {
                    return false;
                }
                bcm bcmVar = this.a;
                int i2 = bcmVar.d;
                if ((bcmVar.a & 1) == 1 && this.b.c == 0) {
                    i2 += b(0);
                    i = this.e;
                } else {
                    i = 0;
                }
                if (!asg.e(azfVar, i2)) {
                    return false;
                }
                this.c = i;
            }
            int b = b(i);
            int i3 = this.c + this.e;
            if (b > 0) {
                pwu pwuVar = this.b;
                pwuVar.z(pwuVar.c + b);
                pwu pwuVar2 = this.b;
                if (!asg.d(azfVar, pwuVar2.a, pwuVar2.c, b)) {
                    return false;
                }
                pwu pwuVar3 = this.b;
                pwuVar3.F(pwuVar3.c + b);
                this.d = this.a.f[i3 + (-1)] != 255;
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}

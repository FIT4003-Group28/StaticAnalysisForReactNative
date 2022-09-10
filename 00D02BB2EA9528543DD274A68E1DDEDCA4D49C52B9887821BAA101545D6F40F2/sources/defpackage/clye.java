package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clye  reason: default package */
/* loaded from: classes5.dex */
final class clye {
    public final clyf a = new clyf();
    public final cmnk b = new cmnk(new byte[65025], 0);
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
            clyf clyfVar = this.a;
            if (i5 >= clyfVar.c) {
                break;
            }
            int[] iArr = clyfVar.f;
            this.e = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean a(cluk clukVar) {
        cmmn.c(true);
        if (this.d) {
            this.d = false;
            this.b.a(0);
        }
        while (!this.d) {
            int i = this.c;
            if (i < 0) {
                if (!this.a.b(clukVar) || !this.a.d(clukVar, true)) {
                    return false;
                }
                clyf clyfVar = this.a;
                int i2 = clyfVar.d;
                if ((clyfVar.a & 1) == 1 && this.b.c == 0) {
                    i2 += b(0);
                    i = this.e;
                } else {
                    i = 0;
                }
                clukVar.d(i2);
                this.c = i;
            }
            int b = b(i);
            int i3 = this.c + this.e;
            if (b > 0) {
                int g = this.b.g();
                cmnk cmnkVar = this.b;
                int i4 = cmnkVar.c + b;
                if (g < i4) {
                    cmnkVar.c(Arrays.copyOf(cmnkVar.a, i4), this.b.c);
                }
                cmnk cmnkVar2 = this.b;
                clukVar.c(cmnkVar2.a, cmnkVar2.c, b);
                cmnk cmnkVar3 = this.b;
                cmnkVar3.e(cmnkVar3.c + b);
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

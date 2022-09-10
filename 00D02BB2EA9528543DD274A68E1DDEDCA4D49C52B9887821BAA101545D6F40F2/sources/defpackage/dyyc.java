package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dyyc  reason: default package */
/* loaded from: classes6.dex */
final class dyyc {
    public final eaiz a;
    dyya[] b;
    int c;
    public int d;
    private final int e = 4096;
    private int f;

    public dyyc(eaiz eaizVar) {
        dyya[] dyyaVarArr = new dyya[8];
        this.b = dyyaVarArr;
        this.d = dyyaVarArr.length - 1;
        this.a = eaizVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2, int i3) {
        if (i < i2) {
            this.a.M(i | i3);
            return;
        }
        this.a.M(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.a.M(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.a.M(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(eajc eajcVar) {
        a(eajcVar.h(), 127, 0);
        this.a.I(eajcVar);
    }

    public final void c(dyya dyyaVar) {
        int i;
        int i2 = dyyaVar.h;
        if (i2 > 4096) {
            Arrays.fill(this.b, (Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.f = 0;
            return;
        }
        int i3 = (this.f + i2) - 4096;
        if (i3 > 0) {
            int length = this.b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.b[length].h;
                i3 -= i5;
                this.f -= i5;
                this.c--;
                i4++;
                length--;
            }
            dyya[] dyyaVarArr = this.b;
            int i6 = i + 1;
            System.arraycopy(dyyaVarArr, i6, dyyaVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c;
        dyya[] dyyaVarArr2 = this.b;
        int length2 = dyyaVarArr2.length;
        if (i7 + 1 > length2) {
            dyya[] dyyaVarArr3 = new dyya[length2 + length2];
            System.arraycopy(dyyaVarArr2, 0, dyyaVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = dyyaVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        this.b[i8] = dyyaVar;
        this.c++;
        this.f += i2;
    }
}

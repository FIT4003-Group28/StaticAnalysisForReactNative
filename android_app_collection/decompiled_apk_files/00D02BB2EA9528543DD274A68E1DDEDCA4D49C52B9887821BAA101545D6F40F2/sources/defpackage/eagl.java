package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: eagl  reason: default package */
/* loaded from: classes6.dex */
final class eagl {
    public final eaiz a;
    public boolean c;
    eagj[] e;
    int f;
    public int b = Integer.MAX_VALUE;
    int g = 0;
    int h = 0;
    int d = 4096;

    public eagl(eaiz eaizVar) {
        eagj[] eagjVarArr = new eagj[8];
        this.e = eagjVarArr;
        this.f = eagjVarArr.length - 1;
        this.a = eaizVar;
    }

    public final void a() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(eagj eagjVar) {
        int i = eagjVar.i;
        int i2 = this.d;
        if (i > i2) {
            a();
            return;
        }
        e((this.h + i) - i2);
        int i3 = this.g;
        eagj[] eagjVarArr = this.e;
        int length = eagjVarArr.length;
        if (i3 + 1 > length) {
            eagj[] eagjVarArr2 = new eagj[length + length];
            System.arraycopy(eagjVarArr, 0, eagjVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = eagjVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = eagjVar;
        this.g++;
        this.h += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i, int i2, int i3) {
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
    public final void d(eajc eajcVar) {
        int[] iArr = eaho.a;
        long j = 0;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < eajcVar.h(); i2++) {
            j2 += eaho.b[eajcVar.g(i2) & 255];
        }
        if (((int) ((j2 + 7) >> 3)) >= eajcVar.h()) {
            c(eajcVar.h(), 127, 0);
            this.a.I(eajcVar);
            return;
        }
        eaiz eaizVar = new eaiz();
        byte b = 0;
        while (i < eajcVar.h()) {
            int g = eajcVar.g(i) & 255;
            int i3 = eaho.a[g];
            byte b2 = eaho.b[g];
            j = (j << b2) | i3;
            int i4 = b + b2;
            while (i4 >= 8) {
                i4 = (i4 == 1 ? 1 : 0) - 8;
                eaizVar.M((int) (j >> i4));
            }
            i++;
            b = i4;
        }
        if (b > 0) {
            eaizVar.M((int) ((j << (8 - b)) | (255 >>> b)));
        }
        eajc n = eaizVar.n();
        c(n.h(), 127, 128);
        this.a.I(n);
    }

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].i;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            eagj[] eagjVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(eagjVarArr, i5, eagjVarArr, i5 + i3, this.g);
            eagj[] eagjVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(eagjVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }
}

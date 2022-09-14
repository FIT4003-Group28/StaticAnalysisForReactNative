package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eagk  reason: default package */
/* loaded from: classes6.dex */
public final class eagk {
    public final eajb b;
    eagj[] d;
    int e;
    public final List<eagj> a = new ArrayList();
    int f = 0;
    int g = 0;
    public int c = 4096;

    public eagk(eajy eajyVar) {
        eagj[] eagjVarArr = new eagj[8];
        this.d = eagjVarArr;
        this.e = eagjVarArr.length - 1;
        this.b = eajl.a(eajyVar);
    }

    public static final boolean h(int i) {
        if (i >= 0) {
            int length = eagm.a.length;
            return i <= 60;
        }
        return false;
    }

    private final int i() {
        return this.b.h() & 255;
    }

    public final void a() {
        Arrays.fill(this.d, (Object) null);
        this.e = this.d.length - 1;
        this.f = 0;
        this.g = 0;
    }

    public final int b(int i) {
        return this.e + 1 + i;
    }

    public final eajc c(int i) {
        if (h(i)) {
            return eagm.a[i].g;
        }
        int length = eagm.a.length;
        int b = b(i - 61);
        if (b >= 0) {
            eagj[] eagjVarArr = this.d;
            if (b < eagjVarArr.length) {
                return eagjVarArr[b].g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i, int i2) {
        int i3 = i & i2;
        if (i3 >= i2) {
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        } else {
            return i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eajc e() {
        int i = i();
        int d = d(i, 127);
        if ((i & 128) == 128) {
            eaho eahoVar = eaho.c;
            byte[] w = this.b.w(d);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            eahn eahnVar = eahoVar.d;
            int i2 = 0;
            int i3 = 0;
            for (byte b : w) {
                i3 = (i3 << 8) | (b & 255);
                i2 += 8;
                while (i2 >= 8) {
                    int i4 = i2 - 8;
                    eahnVar = eahnVar.a[(i3 >>> i4) & 255];
                    if (eahnVar.a == null) {
                        byteArrayOutputStream.write(eahnVar.b);
                        i2 -= eahnVar.c;
                        eahnVar = eahoVar.d;
                    } else {
                        i2 = i4;
                    }
                }
            }
            while (i2 > 0) {
                eahn eahnVar2 = eahnVar.a[(i3 << (8 - i2)) & 255];
                if (eahnVar2.a != null || eahnVar2.c > i2) {
                    break;
                }
                byteArrayOutputStream.write(eahnVar2.b);
                i2 -= eahnVar2.c;
                eahnVar = eahoVar.d;
            }
            return eajc.a(byteArrayOutputStream.toByteArray());
        }
        return this.b.o(d);
    }

    public final void f(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.d[length].i;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
                length--;
            }
            eagj[] eagjVarArr = this.d;
            int i5 = i2 + 1;
            System.arraycopy(eagjVarArr, i5, eagjVarArr, i5 + i3, this.f);
            this.e += i3;
        }
    }

    public final void g(eagj eagjVar) {
        this.a.add(eagjVar);
        int i = eagjVar.i;
        int i2 = this.c;
        if (i > i2) {
            a();
            return;
        }
        f((this.g + i) - i2);
        int i3 = this.f;
        eagj[] eagjVarArr = this.d;
        int length = eagjVarArr.length;
        if (i3 + 1 > length) {
            eagj[] eagjVarArr2 = new eagj[length + length];
            System.arraycopy(eagjVarArr, 0, eagjVarArr2, length, length);
            this.e = this.d.length - 1;
            this.d = eagjVarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = eagjVar;
        this.f++;
        this.g += i;
    }
}

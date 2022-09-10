package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyyb  reason: default package */
/* loaded from: classes6.dex */
public final class dyyb {
    public final eajb b;
    dyya[] e;
    int f;
    public final List<dyya> a = new ArrayList();
    int g = 0;
    int h = 0;
    public int c = 4096;
    public int d = 4096;

    public dyyb(eajy eajyVar) {
        dyya[] dyyaVarArr = new dyya[8];
        this.e = dyyaVarArr;
        this.f = dyyaVarArr.length - 1;
        this.b = eajl.a(eajyVar);
    }

    public static final boolean g(int i) {
        if (i >= 0) {
            int length = dyyd.b.length;
            return i <= 60;
        }
        return false;
    }

    private final void h() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final int i() {
        return this.b.h() & 255;
    }

    private final void j(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].h;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            dyya[] dyyaVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(dyyaVarArr, i5, dyyaVarArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    public final void a() {
        int i = this.d;
        int i2 = this.h;
        if (i < i2) {
            if (i == 0) {
                h();
            } else {
                j(i2 - i);
            }
        }
    }

    public final int b(int i) {
        return this.f + 1 + i;
    }

    public final eajc c(int i) {
        if (g(i)) {
            return dyyd.b[i].f;
        }
        int length = dyyd.b.length;
        int b = b(i - 61);
        if (b >= 0) {
            dyya[] dyyaVarArr = this.e;
            if (b < dyyaVarArr.length) {
                return dyyaVarArr[b].f;
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Header index too large ");
        sb.append(i + 1);
        throw new IOException(sb.toString());
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
            dyyk dyykVar = dyyk.a;
            byte[] w = this.b.w(d);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dyyj dyyjVar = dyykVar.b;
            int i2 = 0;
            int i3 = 0;
            for (byte b : w) {
                i3 = (i3 << 8) | (b & 255);
                i2 += 8;
                while (i2 >= 8) {
                    int i4 = i2 - 8;
                    dyyjVar = dyyjVar.a[(i3 >>> i4) & 255];
                    if (dyyjVar.a == null) {
                        byteArrayOutputStream.write(dyyjVar.b);
                        i2 -= dyyjVar.c;
                        dyyjVar = dyykVar.b;
                    } else {
                        i2 = i4;
                    }
                }
            }
            while (i2 > 0) {
                dyyj dyyjVar2 = dyyjVar.a[(i3 << (8 - i2)) & 255];
                if (dyyjVar2.a != null || dyyjVar2.c > i2) {
                    break;
                }
                byteArrayOutputStream.write(dyyjVar2.b);
                i2 -= dyyjVar2.c;
                dyyjVar = dyykVar.b;
            }
            return eajc.a(byteArrayOutputStream.toByteArray());
        }
        return this.b.o(d);
    }

    public final void f(dyya dyyaVar) {
        this.a.add(dyyaVar);
        int i = dyyaVar.h;
        int i2 = this.d;
        if (i > i2) {
            h();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g;
        dyya[] dyyaVarArr = this.e;
        int length = dyyaVarArr.length;
        if (i3 + 1 > length) {
            dyya[] dyyaVarArr2 = new dyya[length + length];
            System.arraycopy(dyyaVarArr, 0, dyyaVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = dyyaVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = dyyaVar;
        this.g++;
        this.h += i;
    }
}

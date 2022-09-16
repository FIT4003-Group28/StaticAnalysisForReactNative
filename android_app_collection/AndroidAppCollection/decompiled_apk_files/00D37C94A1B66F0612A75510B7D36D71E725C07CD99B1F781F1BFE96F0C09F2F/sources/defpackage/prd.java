package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: prd  reason: default package */
/* loaded from: classes4.dex */
final class prd {
    public final int a;
    public final pwu b;
    public prc c;
    public prc d;
    public prc e;
    public long f;
    public final axf g;

    public prd(axf axfVar) {
        this.g = axfVar;
        int i = axfVar.a;
        this.a = i;
        this.b = new pwu(32);
        prc prcVar = new prc(0L, i);
        this.c = prcVar;
        this.d = prcVar;
        this.e = prcVar;
    }

    public static prc b(prc prcVar, pmv pmvVar, pre preVar, pwu pwuVar) {
        if (pmvVar.g()) {
            long j = preVar.b;
            int i = 1;
            pwuVar.C(1);
            prc h = h(prcVar, j, pwuVar.a, 1);
            long j2 = j + 1;
            byte b = pwuVar.a[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            pmq pmqVar = pmvVar.c;
            byte[] bArr = pmqVar.a;
            if (bArr == null) {
                pmqVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            prcVar = h(h, j2, pmqVar.a, i3);
            long j3 = j2 + i3;
            if (i2 != 0) {
                pwuVar.C(2);
                prcVar = h(prcVar, j3, pwuVar.a, 2);
                j3 += 2;
                i = pwuVar.m();
            }
            int[] iArr = pmqVar.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = pmqVar.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (i2 != 0) {
                int i4 = i * 6;
                pwuVar.C(i4);
                prcVar = h(prcVar, j3, pwuVar.a, i4);
                j3 += i4;
                pwuVar.G(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr[i5] = pwuVar.m();
                    iArr2[i5] = pwuVar.l();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = preVar.a - ((int) (j3 - preVar.b));
            }
            baa baaVar = preVar.c;
            int i6 = pxi.a;
            byte[] bArr2 = baaVar.b;
            byte[] bArr3 = pmqVar.a;
            int i7 = baaVar.a;
            int i8 = baaVar.c;
            int i9 = baaVar.d;
            pmqVar.f = i;
            pmqVar.d = iArr;
            pmqVar.e = iArr2;
            pmqVar.b = bArr2;
            pmqVar.c = i7;
            pmqVar.g = i8;
            pmqVar.h = i9;
            pmqVar.i.numSubSamples = i;
            pmqVar.i.numBytesOfClearData = iArr;
            pmqVar.i.numBytesOfEncryptedData = iArr2;
            pmqVar.i.key = bArr2;
            pmqVar.i.iv = bArr3;
            pmqVar.i.mode = i7;
            if (pxi.a >= 24) {
                pmp pmpVar = pmqVar.j;
                ptx.a(pmpVar);
                pmpVar.b.set(i8, i9);
                pmpVar.a.setPattern(pmpVar.b);
            }
            long j4 = preVar.b;
            int i10 = (int) (j3 - j4);
            preVar.b = j4 + i10;
            preVar.a -= i10;
        }
        if (pmvVar.hasSupplementalData()) {
            pwuVar.C(4);
            prc h2 = h(prcVar, preVar.b, pwuVar.a, 4);
            int l = pwuVar.l();
            preVar.b += 4;
            preVar.a -= 4;
            pmvVar.e(l);
            prc g = g(h2, preVar.b, pmvVar.d, l);
            preVar.b += l;
            int i11 = preVar.a - l;
            preVar.a = i11;
            ByteBuffer byteBuffer = pmvVar.g;
            if (byteBuffer == null || byteBuffer.capacity() < i11) {
                pmvVar.g = ByteBuffer.allocate(i11);
            } else {
                pmvVar.g.clear();
            }
            return g(g, preVar.b, pmvVar.g, preVar.a);
        }
        pmvVar.e(preVar.a);
        return g(prcVar, preVar.b, pmvVar.d, preVar.a);
    }

    private static prc f(prc prcVar, long j) {
        while (j >= prcVar.b) {
            prcVar = prcVar.d;
        }
        return prcVar;
    }

    private static prc g(prc prcVar, long j, ByteBuffer byteBuffer, int i) {
        prc f = f(prcVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (f.b - j));
            byteBuffer.put(f.e.b, f.a(j), min);
            i -= min;
            j += min;
            if (j == f.b) {
                f = f.d;
            }
        }
        return f;
    }

    private static prc h(prc prcVar, long j, byte[] bArr, int i) {
        prc f = f(prcVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (f.b - j));
            System.arraycopy(f.e.b, f.a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == f.b) {
                f = f.d;
            }
        }
        return f;
    }

    public final int a(int i) {
        prc prcVar = this.e;
        if (!prcVar.c) {
            ozi e = this.g.e();
            prc prcVar2 = new prc(this.e.b, this.a);
            prcVar.e = e;
            prcVar.d = prcVar2;
            prcVar.c = true;
        }
        return Math.min(i, (int) (this.e.b - this.f));
    }

    public final void c(prc prcVar) {
        if (!prcVar.c) {
            return;
        }
        prc prcVar2 = this.e;
        int i = (prcVar2.c ? 1 : 0) + (((int) (prcVar2.a - prcVar.a)) / this.a);
        ozi[] oziVarArr = new ozi[i];
        for (int i2 = 0; i2 < i; i2++) {
            oziVarArr[i2] = prcVar.e;
            prcVar = prcVar.b();
        }
        this.g.g(oziVarArr);
    }

    public final void d(long j) {
        prc prcVar;
        if (j != -1) {
            while (true) {
                prcVar = this.c;
                if (j < prcVar.b) {
                    break;
                }
                this.g.f(prcVar.e);
                this.c = this.c.b();
            }
            if (this.d.a >= prcVar.a) {
                return;
            }
            this.d = prcVar;
        }
    }

    public final void e(int i) {
        long j = this.f + i;
        this.f = j;
        prc prcVar = this.e;
        if (j == prcVar.b) {
            this.e = prcVar.d;
        }
    }
}

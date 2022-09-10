package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmey  reason: default package */
/* loaded from: classes5.dex */
final class cmey implements cmfk {
    public final int a;
    final /* synthetic */ cmfb b;

    public cmey(cmfb cmfbVar, int i) {
        this.b = cmfbVar;
        this.a = i;
    }

    @Override // defpackage.cmfk
    public final boolean a() {
        cmfb cmfbVar = this.b;
        return !cmfbVar.r() && cmfbVar.l[this.a].l(cmfbVar.w);
    }

    @Override // defpackage.cmfk
    public final void b() {
        cmfb cmfbVar = this.b;
        cmfj cmfjVar = cmfbVar.l[this.a];
        if (cmfjVar.h == null) {
            cmfbVar.e();
            return;
        }
        cltp a = cmfjVar.h.a();
        cmmn.f(a);
        throw a;
    }

    @Override // defpackage.cmfk
    public final int c(clng clngVar, cltg cltgVar, boolean z) {
        cmfb cmfbVar;
        int i;
        cmfh cmfhVar;
        int i2;
        cmfb cmfbVar2 = this.b;
        int i3 = this.a;
        if (cmfbVar2.r()) {
            return -3;
        }
        cmfbVar2.o(i3);
        cmfj cmfjVar = cmfbVar2.l[i3];
        int q = cmfjVar.q(clngVar, cltgVar, z, cmfbVar2.w, cmfjVar.b);
        if (q == -4) {
            if (cltgVar.isEndOfStream() || cltgVar.b()) {
                cmfbVar = cmfbVar2;
            } else {
                cmfg cmfgVar = cmfjVar.a;
                cmfh cmfhVar2 = cmfjVar.b;
                if (cltgVar.c()) {
                    long j = cmfhVar2.b;
                    cmfgVar.a.a(1);
                    cmfgVar.c(j, cmfgVar.a.a, 1);
                    long j2 = j + 1;
                    byte b = cmfgVar.a.a[0];
                    int i4 = b & 128;
                    int i5 = b & Byte.MAX_VALUE;
                    cltc cltcVar = cltgVar.a;
                    byte[] bArr = cltcVar.a;
                    if (bArr == null) {
                        cltcVar.a = new byte[16];
                    } else {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    cmfgVar.c(j2, cltcVar.a, i5);
                    long j3 = j2 + i5;
                    if (i4 != 0) {
                        cmfgVar.a.a(2);
                        cmfgVar.c(j3, cmfgVar.a.a, 2);
                        j3 += 2;
                        i2 = cmfgVar.a.m();
                    } else {
                        i2 = 1;
                    }
                    int[] iArr = cltcVar.b;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = cltcVar.c;
                    if (iArr2 == null || iArr2.length < i2) {
                        iArr2 = new int[i2];
                    }
                    if (i4 != 0) {
                        int i6 = i2 * 6;
                        cmfgVar.a.a(i6);
                        cmfgVar.c(j3, cmfgVar.a.a, i6);
                        j3 += i6;
                        cmfgVar.a.f(0);
                        for (int i7 = 0; i7 < i2; i7++) {
                            iArr[i7] = cmfgVar.a.m();
                            iArr2[i7] = cmfgVar.a.v();
                        }
                        cmfhVar = cmfhVar2;
                    } else {
                        iArr[0] = 0;
                        cmfhVar = cmfhVar2;
                        iArr2[0] = cmfhVar.a - ((int) (j3 - cmfhVar.b));
                    }
                    clvj clvjVar = cmfhVar.c;
                    int i8 = cmny.a;
                    byte[] bArr2 = clvjVar.b;
                    byte[] bArr3 = cltcVar.a;
                    int i9 = clvjVar.a;
                    int i10 = clvjVar.c;
                    int i11 = clvjVar.d;
                    cltcVar.b = iArr;
                    cltcVar.c = iArr2;
                    cmfbVar = cmfbVar2;
                    cltcVar.d.numSubSamples = i2;
                    cltcVar.d.numBytesOfClearData = iArr;
                    cltcVar.d.numBytesOfEncryptedData = iArr2;
                    cltcVar.d.key = bArr2;
                    cltcVar.d.iv = bArr3;
                    cltcVar.d.mode = i9;
                    if (cmny.a >= 24) {
                        cltb cltbVar = cltcVar.e;
                        cmmn.f(cltbVar);
                        cltbVar.b.set(i10, i11);
                        cltbVar.a.setPattern(cltbVar.b);
                    }
                    long j4 = cmfhVar.b;
                    int i12 = (int) (j3 - j4);
                    cmfhVar.b = j4 + i12;
                    cmfhVar.a -= i12;
                } else {
                    cmfhVar = cmfhVar2;
                    cmfbVar = cmfbVar2;
                }
                if (cltgVar.hasSupplementalData()) {
                    cmfgVar.a.a(4);
                    cmfgVar.c(cmfhVar.b, cmfgVar.a.a, 4);
                    int v = cmfgVar.a.v();
                    cmfhVar.b += 4;
                    cmfhVar.a -= 4;
                    cltgVar.a(v);
                    cmfgVar.b(cmfhVar.b, cltgVar.b, v);
                    cmfhVar.b += v;
                    int i13 = cmfhVar.a - v;
                    cmfhVar.a = i13;
                    ByteBuffer byteBuffer = cltgVar.e;
                    if (byteBuffer == null || byteBuffer.capacity() < i13) {
                        cltgVar.e = ByteBuffer.allocate(i13);
                    } else {
                        cltgVar.e.clear();
                    }
                    cmfgVar.b(cmfhVar.b, cltgVar.e, cmfhVar.a);
                } else {
                    cltgVar.a(cmfhVar.a);
                    cmfgVar.b(cmfhVar.b, cltgVar.b, cmfhVar.a);
                }
            }
            i = -3;
            q = -4;
        } else {
            cmfbVar = cmfbVar2;
            i = -3;
        }
        if (q != i) {
            return q;
        }
        cmfbVar.q(i3);
        return i;
    }

    @Override // defpackage.cmfk
    public final int d(long j) {
        cmfb cmfbVar = this.b;
        int i = this.a;
        if (cmfbVar.r()) {
            return 0;
        }
        cmfbVar.o(i);
        cmfj cmfjVar = cmfbVar.l[i];
        int n = cmfjVar.n(j, cmfbVar.w);
        cmfjVar.o(n);
        if (n != 0) {
            return n;
        }
        cmfbVar.q(i);
        return 0;
    }
}

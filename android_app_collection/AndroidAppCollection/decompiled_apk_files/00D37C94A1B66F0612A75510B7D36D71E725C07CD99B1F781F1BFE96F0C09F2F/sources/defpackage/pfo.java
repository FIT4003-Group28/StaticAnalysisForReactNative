package defpackage;

import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: pfo  reason: default package */
/* loaded from: classes4.dex */
final class pfo {
    public final bab a;
    public pft d;
    public pfm e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final pfv b = new pfv();
    public final pwu c = new pwu();
    private final pwu j = new pwu(1);
    private final pwu k = new pwu();

    public pfo(bab babVar) {
        this.a = babVar;
    }

    public final int a(int i, int i2) {
        pwu pwuVar;
        pfu b = b();
        if (b == null) {
            return 0;
        }
        int i3 = b.d;
        if (i3 != 0) {
            pwuVar = this.b.p;
        } else {
            byte[] bArr = b.e;
            pwu pwuVar2 = this.k;
            int length = bArr.length;
            pwuVar2.E(bArr, length);
            pwuVar = this.k;
            i3 = length;
        }
        boolean c = this.b.c(this.f);
        boolean z = c || i2 != 0;
        pwu pwuVar3 = this.j;
        pwuVar3.a[0] = (byte) ((true != z ? 0 : 128) | i3);
        pwuVar3.G(0);
        this.a.c(this.j, 1);
        this.a.c(pwuVar, i3);
        if (!z) {
            return i3 + 1;
        }
        if (!c) {
            this.c.C(8);
            pwu pwuVar4 = this.c;
            byte[] bArr2 = pwuVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
            bArr2[5] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
            bArr2[6] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
            bArr2[7] = (byte) (i & PrivateKeyType.INVALID);
            this.a.c(pwuVar4, 8);
            return i3 + 9;
        }
        pwu pwuVar5 = this.b.p;
        int m = pwuVar5.m();
        pwuVar5.H(-2);
        int i4 = (m * 6) + 2;
        if (i2 != 0) {
            this.c.C(i4);
            this.c.B(pwuVar5.a, 0, i4);
            pwuVar5.H(i4);
            pwuVar5 = this.c;
            byte[] bArr3 = pwuVar5.a;
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & PrivateKeyType.INVALID);
            bArr3[3] = (byte) (i5 & PrivateKeyType.INVALID);
        }
        this.a.c(pwuVar5, i4);
        return i3 + 1 + i4;
    }

    public final pfu b() {
        pfv pfvVar = this.b;
        int i = pfvVar.a.a;
        pfu pfuVar = pfvVar.o;
        if (pfuVar == null) {
            pfuVar = this.d.a(i);
        }
        if (pfuVar == null || !pfuVar.a) {
            return null;
        }
        return pfuVar;
    }

    public final void c(pft pftVar, pfm pfmVar) {
        ptx.a(pftVar);
        this.d = pftVar;
        ptx.a(pfmVar);
        this.e = pfmVar;
        this.a.rx(pftVar.f);
        d();
    }

    public final void d() {
        pfv pfvVar = this.b;
        pfvVar.d = 0;
        pfvVar.r = 0L;
        pfvVar.m = false;
        pfvVar.q = false;
        pfvVar.o = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
    }

    public final boolean e() {
        this.f++;
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i == iArr[i2]) {
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }
        return true;
    }
}

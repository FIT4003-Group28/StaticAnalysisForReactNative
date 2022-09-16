package defpackage;

import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: bbv  reason: default package */
/* loaded from: classes2.dex */
final class bbv {
    public final bab a;
    public bcf d;
    public bbs e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public final bce b = new bce();
    public final pwu c = new pwu();
    private final pwu k = new pwu(1);
    private final pwu l = new pwu();

    public bbv(bab babVar, bcf bcfVar, bbs bbsVar) {
        this.a = babVar;
        this.d = bcfVar;
        this.e = bbsVar;
        d(bcfVar, bbsVar);
    }

    public final int a(int i, int i2) {
        pwu pwuVar;
        bcd c = c();
        if (c == null) {
            return 0;
        }
        int i3 = c.d;
        if (i3 != 0) {
            pwuVar = this.b.o;
        } else {
            byte[] bArr = (byte[]) pxi.y(c.e);
            pwu pwuVar2 = this.l;
            int length = bArr.length;
            pwuVar2.E(bArr, length);
            pwuVar = this.l;
            i3 = length;
        }
        boolean c2 = this.b.c(this.f);
        boolean z = c2 || i2 != 0;
        pwu pwuVar3 = this.k;
        pwuVar3.a[0] = (byte) ((true != z ? 0 : 128) | i3);
        pwuVar3.G(0);
        this.a.d(this.k, 1, 1);
        this.a.d(pwuVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!c2) {
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
            this.a.d(pwuVar4, 8, 1);
            return i3 + 9;
        }
        pwu pwuVar5 = this.b.o;
        int m = pwuVar5.m();
        pwuVar5.H(-2);
        int i4 = (m * 6) + 2;
        if (i2 != 0) {
            this.c.C(i4);
            byte[] bArr3 = this.c.a;
            pwuVar5.B(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & PrivateKeyType.INVALID);
            bArr3[3] = (byte) (i5 & PrivateKeyType.INVALID);
            pwuVar5 = this.c;
        }
        this.a.d(pwuVar5, i4, 1);
        return i3 + 1 + i4;
    }

    public final long b() {
        if (!this.j) {
            return this.d.c[this.f];
        }
        return this.b.f[this.h];
    }

    public final bcd c() {
        if (!this.j) {
            return null;
        }
        bce bceVar = this.b;
        bbs bbsVar = bceVar.a;
        int i = pxi.a;
        int i2 = bbsVar.a;
        bcd bcdVar = bceVar.n;
        if (bcdVar == null) {
            bcdVar = this.d.a.a(i2);
        }
        if (bcdVar != null && bcdVar.a) {
            return bcdVar;
        }
        return null;
    }

    public final void d(bcf bcfVar, bbs bbsVar) {
        this.d = bcfVar;
        this.e = bbsVar;
        this.a.rx(bcfVar.a.f);
        e();
    }

    public final void e() {
        bce bceVar = this.b;
        bceVar.d = 0;
        bceVar.q = 0L;
        bceVar.r = false;
        bceVar.l = false;
        bceVar.p = false;
        bceVar.n = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.j = false;
    }

    public final boolean f() {
        this.f++;
        if (!this.j) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }
}

package defpackage;

import java.io.EOFException;
/* compiled from: PG */
/* renamed from: clyf  reason: default package */
/* loaded from: classes5.dex */
final class clyf {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final cmnk g = new cmnk(255);

    private static boolean e(cluk clukVar, byte[] bArr, int i, boolean z) {
        try {
            return clukVar.e(bArr, 0, i, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            return false;
        }
    }

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(cluk clukVar) {
        return c(clukVar, -1L);
    }

    public final boolean c(cluk clukVar, long j) {
        int l;
        cmmn.a(clukVar.c == clukVar.j());
        while (true) {
            if ((j == -1 || clukVar.c + 4 < j) && e(clukVar, this.g.a, 4, true)) {
                this.g.a(4);
                if (this.g.p() != 1332176723) {
                    clukVar.d(1);
                } else {
                    clukVar.i();
                    return true;
                }
            }
        }
        do {
            if (j != -1 && clukVar.c >= j) {
                break;
            }
            l = clukVar.l(1);
            if (l == 0) {
                l = clukVar.m(clukVar.a, 0, Math.min(1, 4096), 0, true);
            }
            clukVar.n(l);
        } while (l != -1);
        return false;
    }

    public final boolean d(cluk clukVar, boolean z) {
        a();
        this.g.a(27);
        if (!e(clukVar, this.g.a, 27, z) || this.g.p() != 1332176723) {
            return false;
        }
        if (this.g.l() != 0) {
            if (!z) {
                throw new clob("unsupported bit stream revision");
            }
            return false;
        }
        this.a = this.g.l();
        cmnk cmnkVar = this.g;
        byte[] bArr = cmnkVar.a;
        int i = cmnkVar.b;
        int i2 = i + 1;
        cmnkVar.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        cmnkVar.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        cmnkVar.b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        cmnkVar.b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        cmnkVar.b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        cmnkVar.b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        cmnkVar.b = i8;
        byte b7 = bArr[i7];
        cmnkVar.b = i8 + 1;
        this.b = ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((b4 & 255) << 24) | ((b5 & 255) << 32) | ((b6 & 255) << 40) | ((b7 & 255) << 48) | ((bArr[i8] & 255) << 56);
        cmnkVar.q();
        this.g.q();
        this.g.q();
        int l = this.g.l();
        this.c = l;
        this.d = l + 27;
        this.g.a(l);
        clukVar.f(this.g.a, 0, this.c);
        for (int i9 = 0; i9 < this.c; i9++) {
            this.f[i9] = this.g.l();
            this.e += this.f[i9];
        }
        return true;
    }
}

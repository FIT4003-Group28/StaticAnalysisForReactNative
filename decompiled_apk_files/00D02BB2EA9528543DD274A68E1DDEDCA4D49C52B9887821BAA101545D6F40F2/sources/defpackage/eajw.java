package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eajw  reason: default package */
/* loaded from: classes6.dex */
public final class eajw extends eajc {
    final transient byte[][] f;
    final transient int[] g;

    public eajw(eaiz eaizVar, int i) {
        super(null);
        eakb.a(eaizVar.b, 0L, i);
        eaju eajuVar = eaizVar.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = eajuVar.c;
            int i6 = eajuVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                eajuVar = eajuVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f = new byte[i4];
        this.g = new int[i4 + i4];
        eaju eajuVar2 = eaizVar.a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f;
            bArr[i7] = eajuVar2.a;
            int i8 = eajuVar2.c;
            int i9 = eajuVar2.b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            eajuVar2.d = true;
            i7++;
            eajuVar2 = eajuVar2.f;
        }
    }

    private final int q(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    private final eajc r() {
        return new eajc(i());
    }

    private Object writeReplace() {
        return r();
    }

    @Override // defpackage.eajc
    public final String c() {
        return r().c();
    }

    @Override // defpackage.eajc
    public final String e() {
        return r().e();
    }

    @Override // defpackage.eajc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eajc)) {
            return false;
        }
        eajc eajcVar = (eajc) obj;
        return eajcVar.h() == h() && n(eajcVar, h());
    }

    @Override // defpackage.eajc
    public final eajc f() {
        return r().f();
    }

    @Override // defpackage.eajc
    public final byte g(int i) {
        eakb.a(this.g[this.f.length - 1], i, 1L);
        int q = q(i);
        int i2 = q == 0 ? 0 : this.g[q - 1];
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[q][(i - i2) + iArr[bArr.length + q]];
    }

    @Override // defpackage.eajc
    public final int h() {
        return this.g[this.f.length - 1];
    }

    @Override // defpackage.eajc
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.d = i4;
        return i4;
    }

    @Override // defpackage.eajc
    public final byte[] i() {
        int[] iArr = this.g;
        int length = this.f.length;
        byte[] bArr = new byte[iArr[length - 1]];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, bArr, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr;
    }

    @Override // defpackage.eajc
    public final void j(eaiz eaizVar) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            eaju eajuVar = new eaju(this.f[i], i3, (i3 + i4) - i2);
            eaju eajuVar2 = eaizVar.a;
            if (eajuVar2 == null) {
                eajuVar.g = eajuVar;
                eajuVar.f = eajuVar;
                eaizVar.a = eajuVar;
            } else {
                eajuVar2.g.d(eajuVar);
            }
            i++;
            i2 = i4;
        }
        eaizVar.b += i2;
    }

    @Override // defpackage.eajc
    public final boolean k(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > h() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int q = q(i);
        while (i3 > 0) {
            int i4 = q == 0 ? 0 : this.g[q - 1];
            int min = Math.min(i3, ((this.g[q] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!eakb.d(bArr2[q], (i - i4) + iArr[bArr2.length + q], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            q++;
        }
        return true;
    }

    @Override // defpackage.eajc
    public final boolean n(eajc eajcVar, int i) {
        if (h() - i < 0) {
            return false;
        }
        int q = q(0);
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int i4 = q == 0 ? 0 : this.g[q - 1];
            int min = Math.min(i, ((this.g[q] - i4) + i4) - i2);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!eajcVar.k(i3, bArr[q], (i2 - i4) + iArr[bArr.length + q], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i -= min;
            q++;
        }
        return true;
    }

    @Override // defpackage.eajc
    public final eajc o() {
        return r().o();
    }

    @Override // defpackage.eajc
    public final String toString() {
        return r().toString();
    }
}

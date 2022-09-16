package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: babk  reason: default package */
/* loaded from: classes2.dex */
final class babk extends babb {
    final transient byte[][] f;
    final transient int[] g;

    public babk(baay baayVar, int i) {
        super(null);
        babm.a(baayVar.b, 0L, i);
        babi babiVar = baayVar.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = babiVar.c;
            int i6 = babiVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                babiVar = babiVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f = new byte[i4];
        this.g = new int[i4 + i4];
        babi babiVar2 = baayVar.a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f;
            bArr[i7] = babiVar2.a;
            int i8 = babiVar2.c;
            int i9 = babiVar2.b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            babiVar2.d = true;
            i7++;
            babiVar2 = babiVar2.f;
        }
    }

    private final int j(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    private final babb k() {
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
        return new babb(bArr);
    }

    private Object writeReplace() {
        return k();
    }

    @Override // defpackage.babb
    public final byte a(int i) {
        babm.a(this.g[this.f.length - 1], i, 1L);
        int j = j(i);
        int i2 = j == 0 ? 0 : this.g[j - 1];
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[j][(i - i2) + iArr[bArr.length + j]];
    }

    @Override // defpackage.babb
    public final int b() {
        return this.g[this.f.length - 1];
    }

    @Override // defpackage.babb
    public final String c() {
        return k().c();
    }

    @Override // defpackage.babb
    public final String d() {
        return k().d();
    }

    @Override // defpackage.babb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof babb)) {
            return false;
        }
        babb babbVar = (babb) obj;
        return babbVar.b() == b() && h(babbVar, b());
    }

    @Override // defpackage.babb
    public final boolean g(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int j = j(i);
        while (i3 > 0) {
            int i4 = j == 0 ? 0 : this.g[j - 1];
            int min = Math.min(i3, ((this.g[j] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!babm.b(bArr2[j], (i - i4) + iArr[bArr2.length + j], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            j++;
        }
        return true;
    }

    @Override // defpackage.babb
    public final boolean h(babb babbVar, int i) {
        if (b() - i < 0) {
            return false;
        }
        int j = j(0);
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int i4 = j == 0 ? 0 : this.g[j - 1];
            int min = Math.min(i, ((this.g[j] - i4) + i4) - i2);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!babbVar.g(i3, bArr[j], (i2 - i4) + iArr[bArr.length + j], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i -= min;
            j++;
        }
        return true;
    }

    @Override // defpackage.babb
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

    @Override // defpackage.babb
    public final babb i() {
        return k().i();
    }

    @Override // defpackage.babb
    public final String toString() {
        return k().toString();
    }
}

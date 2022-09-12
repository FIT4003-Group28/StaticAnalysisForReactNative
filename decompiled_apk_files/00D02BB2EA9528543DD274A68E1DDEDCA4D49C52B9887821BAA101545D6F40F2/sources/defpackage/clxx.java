package defpackage;
/* compiled from: PG */
/* renamed from: clxx  reason: default package */
/* loaded from: classes5.dex */
final class clxx {
    public final clxu a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public clxx(clxu clxuVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        cmmn.a(length == length2);
        int length3 = jArr.length;
        cmmn.a(length3 == length2);
        int length4 = iArr2.length;
        cmmn.a(length4 != length2 ? false : z);
        this.a = clxuVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int af = cmny.af(this.f, j, false); af >= 0; af--) {
            if ((this.g[af] & 1) != 0) {
                return af;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int ac = cmny.ac(this.f, j, true); ac < this.f.length; ac++) {
            if ((this.g[ac] & 1) != 0) {
                return ac;
            }
        }
        return -1;
    }
}

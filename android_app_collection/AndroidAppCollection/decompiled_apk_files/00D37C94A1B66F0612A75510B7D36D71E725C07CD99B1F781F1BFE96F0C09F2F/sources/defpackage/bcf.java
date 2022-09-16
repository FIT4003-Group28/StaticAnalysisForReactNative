package defpackage;
/* compiled from: PG */
/* renamed from: bcf  reason: default package */
/* loaded from: classes2.dex */
final class bcf {
    public final bcc a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public bcf(bcc bccVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        ptx.c(length == length2);
        int length3 = jArr.length;
        ptx.c(length3 == length2);
        int length4 = iArr2.length;
        ptx.c(length4 != length2 ? false : z);
        this.a = bccVar;
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
        for (int ah = pxi.ah(this.f, j, false); ah >= 0; ah--) {
            if ((this.g[ah] & 1) != 0) {
                return ah;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int ae = pxi.ae(this.f, j, true); ae < this.f.length; ae++) {
            if ((this.g[ae] & 1) != 0) {
                return ae;
            }
        }
        return -1;
    }
}

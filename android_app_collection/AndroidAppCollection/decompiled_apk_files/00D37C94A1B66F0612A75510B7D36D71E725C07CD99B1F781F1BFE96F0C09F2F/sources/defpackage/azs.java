package defpackage;
/* compiled from: PG */
/* renamed from: azs  reason: default package */
/* loaded from: classes2.dex */
public final class azs implements azy {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public azs(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        ptx.c(length == length2);
        boolean z = length2 > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.c = j;
    }

    @Override // defpackage.azy
    public final long a() {
        return this.c;
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        if (!this.d) {
            azz azzVar = azz.a;
            return new azw(azzVar, azzVar);
        }
        int ah = pxi.ah(this.b, j, true);
        azz azzVar2 = new azz(this.b[ah], this.a[ah]);
        if (azzVar2.b != j) {
            long[] jArr = this.b;
            if (ah != jArr.length - 1) {
                int i = ah + 1;
                return new azw(azzVar2, new azz(jArr[i], this.a[i]));
            }
        }
        return new azw(azzVar2, azzVar2);
    }

    @Override // defpackage.azy
    public final boolean c() {
        return this.d;
    }
}

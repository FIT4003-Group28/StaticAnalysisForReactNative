package defpackage;
/* compiled from: PG */
/* renamed from: clvc  reason: default package */
/* loaded from: classes5.dex */
public final class clvc implements clvg {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public clvc(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        cmmn.a(length == length2);
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

    @Override // defpackage.clvg
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        if (!this.d) {
            clvh clvhVar = clvh.a;
            return new clve(clvhVar, clvhVar);
        }
        int af = cmny.af(this.b, j, true);
        clvh clvhVar2 = new clvh(this.b[af], this.a[af]);
        if (clvhVar2.b != j) {
            long[] jArr = this.b;
            if (af != jArr.length - 1) {
                int i = af + 1;
                return new clve(clvhVar2, new clvh(jArr[i], this.a[i]));
            }
        }
        return new clve(clvhVar2, clvhVar2);
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.c;
    }
}

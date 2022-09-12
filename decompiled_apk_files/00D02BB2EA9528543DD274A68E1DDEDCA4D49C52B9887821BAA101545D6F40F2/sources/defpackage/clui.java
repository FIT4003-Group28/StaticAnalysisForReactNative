package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clui  reason: default package */
/* loaded from: classes5.dex */
public final class clui implements clvg {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public clui(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
            return;
        }
        int i = length - 1;
        this.f = jArr2[i] + jArr3[i];
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        int af = cmny.af(this.e, j, true);
        clvh clvhVar = new clvh(this.e[af], this.c[af]);
        if (clvhVar.b >= j || af == this.a - 1) {
            return new clve(clvhVar, clvhVar);
        }
        int i = af + 1;
        return new clve(clvhVar, new clvh(this.e[i], this.c[i]));
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.f;
    }

    public final String toString() {
        int i = this.a;
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.e);
        String arrays4 = Arrays.toString(this.d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }
}

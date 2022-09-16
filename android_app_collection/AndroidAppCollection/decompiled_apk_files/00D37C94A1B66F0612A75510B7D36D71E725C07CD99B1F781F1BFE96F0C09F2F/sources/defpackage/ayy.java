package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ayy  reason: default package */
/* loaded from: classes2.dex */
public final class ayy implements azy {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public ayy(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
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

    @Override // defpackage.azy
    public final long a() {
        return this.f;
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        int d = d(j);
        azz azzVar = new azz(this.e[d], this.c[d]);
        if (azzVar.b >= j || d == this.a - 1) {
            return new azw(azzVar, azzVar);
        }
        int i = d + 1;
        return new azw(azzVar, new azz(this.e[i], this.c[i]));
    }

    @Override // defpackage.azy
    public final boolean c() {
        return true;
    }

    public final int d(long j) {
        return pxi.ah(this.e, j, true);
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

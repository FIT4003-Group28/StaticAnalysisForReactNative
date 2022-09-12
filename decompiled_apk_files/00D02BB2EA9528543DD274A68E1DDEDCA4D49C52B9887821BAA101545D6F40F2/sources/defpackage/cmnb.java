package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmnb  reason: default package */
/* loaded from: classes5.dex */
public final class cmnb {
    public int a;
    public long[] b = new long[32];

    public final void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public final long b(int i) {
        if (i < 0 || i >= this.a) {
            int i2 = this.a;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(", size is ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.b[i];
    }
}

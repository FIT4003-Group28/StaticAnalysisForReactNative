package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: clwq  reason: default package */
/* loaded from: classes5.dex */
final class clwq implements clwu {
    private final long[] a;
    private final long[] b;
    private final long c;

    public clwq(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? cllt.b(jArr2[jArr2.length - 1]) : j;
    }

    private static Pair<Long, Long> d(long j, long[] jArr, long[] jArr2) {
        double d;
        int af = cmny.af(jArr, j, true);
        long j2 = jArr[af];
        long j3 = jArr2[af];
        int i = af + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = dcyn.a;
        } else {
            double d2 = j;
            double d3 = j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = j4 - j2;
            Double.isNaN(d4);
            d = (d2 - d3) / d4;
        }
        Long valueOf = Long.valueOf(j);
        double d5 = j5 - j3;
        Double.isNaN(d5);
        return Pair.create(valueOf, Long.valueOf(((long) (d * d5)) + j3));
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        Pair<Long, Long> d = d(cllt.a(cmny.C(j, 0L, this.c)), this.b, this.a);
        long longValue = ((Long) d.first).longValue();
        clvh clvhVar = new clvh(cllt.b(longValue), ((Long) d.second).longValue());
        return new clve(clvhVar, clvhVar);
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.c;
    }

    @Override // defpackage.clwu
    public final long e(long j) {
        return cllt.b(((Long) d(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.clwu
    public final long f() {
        return -1L;
    }
}

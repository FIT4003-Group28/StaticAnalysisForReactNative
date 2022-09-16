package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: bbe  reason: default package */
/* loaded from: classes2.dex */
final class bbe implements bbg {
    private final long[] a;
    private final long[] b;
    private final long c;

    public bbe(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? phk.c(jArr2[jArr2.length - 1]) : j;
    }

    private static Pair d(long j, long[] jArr, long[] jArr2) {
        double d;
        int ah = pxi.ah(jArr, j, true);
        long j2 = jArr[ah];
        long j3 = jArr2[ah];
        int i = ah + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
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

    @Override // defpackage.azy
    public final long a() {
        return this.c;
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        Pair d = d(phk.d(pxi.j(j, 0L, this.c)), this.b, this.a);
        long longValue = ((Long) d.first).longValue();
        azz azzVar = new azz(phk.c(longValue), ((Long) d.second).longValue());
        return new azw(azzVar, azzVar);
    }

    @Override // defpackage.azy
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bbg
    public final long e() {
        return -1L;
    }

    @Override // defpackage.bbg
    public final long f(long j) {
        return phk.c(((Long) d(j, this.a, this.b).second).longValue());
    }
}

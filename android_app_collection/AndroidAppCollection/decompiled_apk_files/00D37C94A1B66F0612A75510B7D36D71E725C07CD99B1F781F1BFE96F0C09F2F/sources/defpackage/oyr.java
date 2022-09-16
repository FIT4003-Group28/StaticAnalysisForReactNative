package defpackage;
/* compiled from: PG */
/* renamed from: oyr  reason: default package */
/* loaded from: classes4.dex */
final class oyr implements oyo {
    private final long a;
    private final long b;
    private final long c;
    private final long[] d;
    private final long e;
    private final int g;

    public oyr(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
        this.e = j4;
        this.g = i;
    }

    private final long e(int i) {
        return (this.b * i) / 100;
    }

    @Override // defpackage.oyo
    public final long a() {
        return this.b;
    }

    @Override // defpackage.oye
    public final boolean c() {
        return this.d != null;
    }

    @Override // defpackage.oyo
    public final long d(long j) {
        long j2 = 0;
        if (c()) {
            long j3 = this.a;
            if (j >= j3) {
                double d = j - j3;
                Double.isNaN(d);
                double d2 = this.e;
                Double.isNaN(d2);
                double d3 = (d * 256.0d) / d2;
                int s = pcx.s(this.d, (long) d3, false) + 1;
                long e = e(s);
                long j4 = s == 0 ? 0L : this.d[s - 1];
                long j5 = s == 99 ? 256L : this.d[s];
                long e2 = e(s + 1);
                if (j5 != j4) {
                    double d4 = e2 - e;
                    double d5 = j4;
                    Double.isNaN(d5);
                    Double.isNaN(d4);
                    double d6 = d4 * (d3 - d5);
                    double d7 = j5 - j4;
                    Double.isNaN(d7);
                    j2 = (long) (d6 / d7);
                }
                return e + j2;
            }
        }
        return 0L;
    }

    @Override // defpackage.oye
    public final long b(long j) {
        long j2;
        if (!c()) {
            return this.a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.b);
        float f2 = 256.0f;
        float f3 = 0.0f;
        if (f <= 0.0f) {
            f2 = 0.0f;
        } else if (f < 100.0f) {
            int i = (int) f;
            if (i != 0) {
                f3 = (float) this.d[i - 1];
            }
            if (i < 99) {
                f2 = (float) this.d[i];
            }
            f2 = ((f2 - f3) * (f - i)) + f3;
        }
        long j3 = this.e;
        double d = f2;
        Double.isNaN(d);
        double d2 = j3;
        Double.isNaN(d2);
        long round = Math.round(d * 0.00390625d * d2) + this.a;
        long j4 = this.c;
        return Math.min(round, j4 != -1 ? j4 - 1 : ((j2 - this.g) + this.e) - 1);
    }
}

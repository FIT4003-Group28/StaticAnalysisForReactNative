package defpackage;
/* compiled from: PG */
/* renamed from: clww  reason: default package */
/* loaded from: classes5.dex */
final class clww implements clwu {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    public clww(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    private final long d(int i) {
        return (this.c * i) / 100;
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return this.f != null;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        long[] jArr;
        if (!a()) {
            clvh clvhVar = new clvh(0L, this.a + this.b);
            return new clve(clvhVar, clvhVar);
        }
        long C = cmny.C(j, 0L, this.c);
        double d = C;
        Double.isNaN(d);
        double d2 = this.c;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = dcyn.a;
        if (d3 > dcyn.a) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                double d5 = ((long[]) cmmn.e(this.f))[i];
                double d6 = i == 99 ? 256.0d : jArr[i + 1];
                double d7 = i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            }
        }
        double d8 = this.d;
        Double.isNaN(d8);
        clvh clvhVar2 = new clvh(C, this.a + cmny.C(Math.round((d4 / 256.0d) * d8), this.b, this.d - 1));
        return new clve(clvhVar2, clvhVar2);
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.c;
    }

    @Override // defpackage.clwu
    public final long e(long j) {
        double d;
        long j2 = j - this.a;
        if (!a() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) cmmn.e(this.f);
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = this.d;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int af = cmny.af(jArr, (long) d4, true);
        long d5 = d(af);
        long j3 = jArr[af];
        int i = af + 1;
        long d6 = d(i);
        long j4 = af == 99 ? 256L : jArr[i];
        if (j3 == j4) {
            d = dcyn.a;
        } else {
            double d7 = j3;
            Double.isNaN(d7);
            double d8 = j4 - j3;
            Double.isNaN(d8);
            d = (d4 - d7) / d8;
        }
        double d9 = d6 - d5;
        Double.isNaN(d9);
        return d5 + Math.round(d * d9);
    }

    @Override // defpackage.clwu
    public final long f() {
        return this.e;
    }
}

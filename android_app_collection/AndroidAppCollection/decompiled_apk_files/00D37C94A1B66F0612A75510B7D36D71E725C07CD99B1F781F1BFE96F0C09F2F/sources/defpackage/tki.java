package defpackage;
/* compiled from: PG */
/* renamed from: tki  reason: default package */
/* loaded from: classes4.dex */
public class tki {
    protected double a = -1.0d;
    protected double b = -1.0d;
    protected double c = -1.0d;
    protected double d = -1.0d;
    protected final axoq e = new axoq();
    protected final axoq f = new axoq(new double[]{tkg.ONE_HUNDRED_PERCENT.l, tkg.NINETY_PERCENT.l, tkg.EIGHTY_PERCENT.l, tkg.SEVENTY_PERCENT.l, tkg.SIXTY_PERCENT.l, tkg.FIFTY_PERCENT.l, tkg.FORTY_PERCENT.l, tkg.THIRTY_PERCENT.l, tkg.TWENTY_PERCENT.l, tkg.TEN_PERCENT.l, tkg.ZERO.l});

    protected int a() {
        return 1000;
    }

    public final void b(long j, double d, double d2) {
        if (j > 0) {
            this.e.d(d, j);
            this.f.d(d2, j);
        }
        this.b = Math.max(d, this.b);
        double d3 = this.a;
        if (d3 != -1.0d) {
            d = Math.min(d, d3);
        }
        this.a = d;
        this.d = Math.max(d2, this.d);
        double d4 = this.c;
        if (d4 != -1.0d) {
            d2 = Math.min(d2, d4);
        }
        this.c = d2;
    }

    public final boolean c() {
        return this.e.c(3, tkh.HALF.f) >= ((long) a());
    }

    public final Long[] d() {
        return e(true);
    }

    public final Long[] e(boolean z) {
        return this.e.g(3, z);
    }
}

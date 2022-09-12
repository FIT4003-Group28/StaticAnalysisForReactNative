package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deii  reason: default package */
/* loaded from: classes6.dex */
public abstract class deii extends deia {
    double a;
    double b;
    double c;
    private long d;

    public deii(dehz dehzVar) {
        super(dehzVar);
        this.d = 0L;
    }

    @Override // defpackage.deia
    public final double b() {
        double micros = TimeUnit.SECONDS.toMicros(1L);
        double d = this.c;
        Double.isNaN(micros);
        return micros / d;
    }

    @Override // defpackage.deia
    public final long d() {
        return this.d;
    }

    @Override // defpackage.deia
    public final long e(long j) {
        i(j);
        long j2 = this.d;
        double min = Math.min(1.0d, this.a);
        long h = h() + ((long) ((1.0d - min) * this.c));
        long j3 = this.d;
        long j4 = j3 + h;
        boolean z = true;
        boolean z2 = (h ^ j3) < 0;
        if ((j3 ^ j4) < 0) {
            z = false;
        }
        if (!(z2 | z)) {
            j4 = ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
        }
        this.d = j4;
        this.a -= min;
        return j2;
    }

    public abstract double f();

    public abstract void g(double d);

    public abstract long h();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(long j) {
        long j2 = this.d;
        if (j > j2) {
            double f = f();
            double d = this.b;
            double d2 = this.a;
            double d3 = j - j2;
            Double.isNaN(d3);
            this.a = Math.min(d, d2 + (d3 / f));
            this.d = j;
        }
    }
}

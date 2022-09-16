package defpackage;
/* compiled from: PG */
/* renamed from: aflq  reason: default package */
/* loaded from: classes.dex */
public final class aflq implements snc, zdt {
    private final snc a;
    private Long b;
    private final double c;
    private final boolean d;

    public aflq(snc sncVar, double d, boolean z) {
        afms.a(sncVar);
        afms.b(d > 0.0d);
        this.a = sncVar;
        this.c = 1.0d - Math.exp(Math.log(0.5d) / d);
        this.d = z;
    }

    @Override // defpackage.snc
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.snc
    public final synchronized long c() {
        long j;
        if (this.b != null) {
            j = this.a.d() + this.b.longValue();
        } else if (!this.d) {
            return this.a.c();
        } else {
            j = -1;
        }
        return j;
    }

    @Override // defpackage.snc
    public final long d() {
        return this.a.d();
    }

    @Override // defpackage.snc
    public final long e() {
        return this.a.e();
    }

    @Override // defpackage.snc
    public final long f() {
        return System.nanoTime();
    }

    @Override // defpackage.snc
    public final long g() {
        return this.a.g();
    }

    @Override // defpackage.zdt
    /* renamed from: h */
    public final synchronized void a(Long l) {
        if (l == null) {
            return;
        }
        long longValue = l.longValue() - this.a.d();
        Long l2 = this.b;
        if (l2 == null) {
            this.b = Long.valueOf(longValue);
            return;
        }
        double d = 1.0d - this.c;
        double longValue2 = l2.longValue();
        Double.isNaN(longValue2);
        double d2 = d * longValue2;
        double d3 = this.c;
        double d4 = longValue;
        Double.isNaN(d4);
        this.b = Long.valueOf(Math.round(d2 + (d3 * d4)));
    }
}

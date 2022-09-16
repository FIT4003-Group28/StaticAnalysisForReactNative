package defpackage;
/* compiled from: PG */
/* renamed from: alfo  reason: default package */
/* loaded from: classes.dex */
final class alfo extends axij {
    final /* synthetic */ alfp a;
    private final String d;
    private long e = -1;
    private long f;
    private long g;

    public alfo(alfp alfpVar, String str) {
        this.a = alfpVar;
        this.d = str;
    }

    private final void m(awyp awypVar) {
        double d;
        awxx c = awypVar.c();
        double c2 = this.a.b.c() - this.g;
        Double.isNaN(c2);
        double d2 = c2 / 1000.0d;
        if (c != null) {
            double e = c.e();
            Double.isNaN(e);
            d = e / 1048576.0d;
        } else {
            d = 0.0d;
        }
        StringBuilder sb = new StringBuilder(101);
        sb.append("Transferred ");
        sb.append(d);
        sb.append("MB in ");
        sb.append(d2);
        sb.append("s (");
        sb.append((d * 8.0d) / d2);
        sb.append(" MBit/s)");
        zep.g(sb.toString());
    }

    @Override // defpackage.axij
    public final void a(awyp awypVar) {
        long c = this.a.b.c();
        double d = Double.NaN;
        long j = 0;
        if (this.e != -1) {
            awxx c2 = awypVar.c();
            long e = c2 != null ? c2.e() : 0L;
            long j2 = e - this.e;
            if (j2 != 0) {
                long a = c2 != null ? c2.a() : 0L;
                if (a != -1) {
                    double d2 = a - e;
                    double d3 = j2;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = d2 / d3;
                    double d5 = c - this.f;
                    Double.isNaN(d5);
                    d = (d4 * d5) / 1000.0d;
                }
            }
        }
        if (this.e == -1) {
            awxx c3 = awypVar.c();
            if (c3 != null) {
                j = c3.e();
            }
            this.e = j;
            this.f = c;
        }
        this.a.s(this.d, awypVar, d);
    }

    @Override // defpackage.axij
    public final void b(awyp awypVar) {
        m(awypVar);
    }

    @Override // defpackage.axij
    public final void c(awyp awypVar) {
        m(awypVar);
    }

    @Override // defpackage.axij
    public final void d() {
        this.g = this.a.b.c();
    }
}

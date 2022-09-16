package defpackage;
/* compiled from: PG */
/* renamed from: vql  reason: default package */
/* loaded from: classes4.dex */
final class vql implements vqk {
    public final long a;
    public final long b;
    public final double c;

    public vql(long j, long j2) {
        aqxo.p(j < j2);
        this.a = j;
        this.b = j2;
        this.c = j2 - j;
    }

    @Override // defpackage.vqk
    public final float a(long j) {
        double d = this.c;
        if (d == 0.0d) {
            return 0.0f;
        }
        double d2 = j - this.a;
        Double.isNaN(d2);
        return (float) (d2 / d);
    }

    @Override // defpackage.vqk
    public final long b(float f) {
        double d = this.c;
        double d2 = f;
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    @Override // defpackage.vqk
    public final long c(float f) {
        double d = this.a;
        double d2 = this.c;
        double d3 = f;
        Double.isNaN(d3);
        Double.isNaN(d);
        return Math.round(d + (d2 * d3));
    }
}

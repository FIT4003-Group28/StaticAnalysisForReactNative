package defpackage;
/* compiled from: PG */
/* renamed from: ahql  reason: default package */
/* loaded from: classes2.dex */
public final class ahql extends ahqe {
    private final double b;
    private final double c;
    private final double d;
    private final double e;

    @Deprecated
    public ahql(long j, double d, double d2, double d3) {
        super(j);
        this.b = d;
        this.c = d2;
        double d4 = (d3 * 0.125d) + 1.9d;
        this.d = d4;
        this.e = Math.toDegrees(d4 / d);
    }

    @Override // defpackage.ahqe
    public final void c(ahqb ahqbVar) {
        ahqbVar.g(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.ahqe
    public final void d(ddrh ddrhVar) {
        int round = (int) Math.round(this.b * 10.0d);
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar = (ddri) ddrhVar.b;
        ddri ddriVar2 = ddri.r;
        ddriVar.a |= 2;
        ddriVar.c = round;
        int round2 = (int) Math.round(this.c);
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar3 = (ddri) ddrhVar.b;
        ddriVar3.a |= 4;
        ddriVar3.d = round2;
    }

    @Override // defpackage.ahqe
    public final String toString() {
        dbsb b = dbsc.b(this);
        b.a(super.toString());
        b.d("speed", this.b);
        b.d("bearing", this.c);
        b.d("speedStandardDeviation", this.d);
        b.d("bearingStandardDeviationDegrees", this.e);
        return b.toString();
    }

    public ahql(long j, double d, double d2, double d3, double d4) {
        super(j);
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }
}

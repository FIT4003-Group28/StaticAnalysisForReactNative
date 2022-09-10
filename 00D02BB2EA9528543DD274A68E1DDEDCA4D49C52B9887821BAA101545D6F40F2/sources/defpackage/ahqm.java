package defpackage;
/* compiled from: PG */
/* renamed from: ahqm  reason: default package */
/* loaded from: classes2.dex */
public final class ahqm extends ahqe {
    private final double b;
    private final double c;

    public ahqm(long j, double d, double d2) {
        super(j);
        this.b = d;
        this.c = d2;
    }

    @Override // defpackage.ahqe
    public final void c(ahqb ahqbVar) {
        ahqbVar.k(this.a, this.b, this.c);
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
        ddriVar.a |= 128;
        ddriVar.i = round;
        int round2 = (int) Math.round(this.c * 10.0d);
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar3 = (ddri) ddrhVar.b;
        ddriVar3.a |= 256;
        ddriVar3.j = round2;
    }

    @Override // defpackage.ahqe
    public final String toString() {
        dbsb b = dbsc.b(this);
        b.a(super.toString());
        b.d("observedSpeed", this.b);
        b.d("observationStandardDeviation", this.c);
        return b.toString();
    }
}

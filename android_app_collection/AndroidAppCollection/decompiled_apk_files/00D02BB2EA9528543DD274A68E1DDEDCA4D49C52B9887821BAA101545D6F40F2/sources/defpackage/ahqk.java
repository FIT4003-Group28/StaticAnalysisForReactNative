package defpackage;
/* compiled from: PG */
/* renamed from: ahqk  reason: default package */
/* loaded from: classes2.dex */
public final class ahqk extends ahqe {
    private final double b;
    private final double c;

    public ahqk(long j, double d, double d2) {
        super(j);
        this.b = d;
        this.c = d2;
    }

    @Override // defpackage.ahqe
    public final void c(ahqb ahqbVar) {
        ahqbVar.j(this.a, this.b, this.c);
    }

    @Override // defpackage.ahqe
    public final void d(ddrh ddrhVar) {
        int round = (int) Math.round(this.b);
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar = (ddri) ddrhVar.b;
        ddri ddriVar2 = ddri.r;
        ddriVar.a |= 32;
        ddriVar.g = round;
        int round2 = (int) Math.round(this.c);
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar3 = (ddri) ddrhVar.b;
        ddriVar3.a |= 64;
        ddriVar3.h = round2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof ahqk)) {
            return false;
        }
        ahqk ahqkVar = (ahqk) obj;
        return ahqkVar.a == this.a && ahqkVar.b == this.b && ahqkVar.c == this.c;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ahqe
    public final String toString() {
        dbsb b = dbsc.b(this);
        b.a(super.toString());
        b.d("observedRateOfTurn", this.b);
        b.d("observationStandardDeviation", this.c);
        return b.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: ahqi  reason: default package */
/* loaded from: classes2.dex */
public final class ahqi extends ahqe {
    private final double b;
    private final double c;

    public ahqi(long j, double d, double d2) {
        super(j);
        this.b = d;
        this.c = d2;
    }

    @Override // defpackage.ahqe
    public final void c(ahqb ahqbVar) {
        ahqbVar.i(this.a, this.b, this.c);
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
        ddriVar.a |= 8;
        ddriVar.e = round;
        int round2 = (int) Math.round(this.c);
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar3 = (ddri) ddrhVar.b;
        ddriVar3.a |= 16;
        ddriVar3.f = round2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof ahqi)) {
            return false;
        }
        ahqi ahqiVar = (ahqi) obj;
        return ahqiVar.a == this.a && ahqiVar.b == this.b && ahqiVar.c == this.c;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ahqe
    public final String toString() {
        dbsb b = dbsc.b(this);
        b.a(super.toString());
        b.d("observedHeading", this.b);
        b.d("standardDeviation", this.c);
        return b.toString();
    }
}

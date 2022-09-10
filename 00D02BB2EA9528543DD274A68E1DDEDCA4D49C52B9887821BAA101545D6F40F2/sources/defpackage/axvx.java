package defpackage;
/* compiled from: PG */
/* renamed from: axvx  reason: default package */
/* loaded from: classes3.dex */
final class axvx extends axxe {
    private final drki b;
    private final dcdc<drjs> c;

    public axvx(drki drkiVar, dcdc<drjs> dcdcVar) {
        if (drkiVar != null) {
            this.b = drkiVar;
            if (dcdcVar != null) {
                this.c = dcdcVar;
                return;
            }
            throw new NullPointerException("Null reservations");
        }
        throw new NullPointerException("Null trip");
    }

    @Override // defpackage.axxe
    public final drki a() {
        return this.b;
    }

    @Override // defpackage.axxe
    public final dcdc<drjs> b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axxe) {
            axxe axxeVar = (axxe) obj;
            if (this.b.equals(axxeVar.a()) && dchl.m(this.c, axxeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        drki drkiVar = this.b;
        int i = drkiVar.bC;
        if (i == 0) {
            i = dsst.a.b(drkiVar).c(drkiVar);
            drkiVar.bC = i;
        }
        return this.c.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("TripAndReservations{trip=");
        sb.append(valueOf);
        sb.append(", reservations=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: xhz  reason: default package */
/* loaded from: classes7.dex */
final class xhz extends xia {
    private final dbsg<xif> a;
    private final dcdc<wpv> b;

    public xhz(dbsg<xif> dbsgVar, dcdc<wpv> dcdcVar) {
        this.a = dbsgVar;
        if (dcdcVar != null) {
            this.b = dcdcVar;
            return;
        }
        throw new NullPointerException("Null departures");
    }

    @Override // defpackage.xia
    public final dbsg<xif> a() {
        return this.a;
    }

    @Override // defpackage.xia
    public final dcdc<wpv> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xia) {
            xia xiaVar = (xia) obj;
            if (this.a.equals(xiaVar.a()) && dchl.m(this.b, xiaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
        sb.append("SingleDayDepartures{dayHeader=");
        sb.append(valueOf);
        sb.append(", departures=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

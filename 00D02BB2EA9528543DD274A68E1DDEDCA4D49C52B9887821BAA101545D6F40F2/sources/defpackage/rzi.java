package defpackage;
/* compiled from: PG */
/* renamed from: rzi  reason: default package */
/* loaded from: classes7.dex */
final class rzi extends rzk {
    private final dspd a;
    private final dcdc<rzl> b;
    private final int c;

    public rzi(int i, @dzsi dspd dspdVar, dcdc<rzl> dcdcVar) {
        this.c = i;
        this.a = dspdVar;
        if (dcdcVar != null) {
            this.b = dcdcVar;
            return;
        }
        throw new NullPointerException("Null stations");
    }

    @Override // defpackage.rzk
    @dzsi
    public final dspd a() {
        return this.a;
    }

    @Override // defpackage.rzk
    public final dcdc<rzl> b() {
        return this.b;
    }

    @Override // defpackage.rzk
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        dspd dspdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rzk) {
            rzk rzkVar = (rzk) obj;
            if (this.c == rzkVar.c() && ((dspdVar = this.a) != null ? dspdVar.equals(rzkVar.a()) : rzkVar.a() == null) && dchl.m(this.b, rzkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.c ^ 1000003) * 1000003;
        dspd dspdVar = this.a;
        return ((i ^ (dspdVar == null ? 0 : dspdVar.hashCode())) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? "TRANSIT" : "WALKING" : "DRIVING";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 34 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Leg{type=");
        sb.append(str);
        sb.append(", routeToken=");
        sb.append(valueOf);
        sb.append(", stations=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

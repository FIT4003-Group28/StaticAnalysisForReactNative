package defpackage;
/* compiled from: PG */
/* renamed from: xks  reason: default package */
/* loaded from: classes7.dex */
final class xks extends xly {
    private final String a;
    private final donz b;
    private final doza c;
    private final boolean d;

    public xks(String str, @dzsi donz donzVar, @dzsi doza dozaVar, boolean z) {
        this.a = str;
        this.b = donzVar;
        this.c = dozaVar;
        this.d = z;
    }

    @Override // defpackage.xly
    public final String a() {
        return this.a;
    }

    @Override // defpackage.xly
    @dzsi
    public final donz b() {
        return this.b;
    }

    @Override // defpackage.xly
    @dzsi
    public final doza c() {
        return this.c;
    }

    @Override // defpackage.xly
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        donz donzVar;
        doza dozaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xly) {
            xly xlyVar = (xly) obj;
            if (this.a.equals(xlyVar.a()) && ((donzVar = this.b) != null ? donzVar.equals(xlyVar.b()) : xlyVar.b() == null) && ((dozaVar = this.c) != null ? dozaVar.equals(xlyVar.c()) : xlyVar.c() == null) && this.d == xlyVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        donz donzVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (donzVar == null ? 0 : donzVar.hashCode())) * 1000003;
        doza dozaVar = this.c;
        if (dozaVar != null) {
            i = dozaVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 75 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("VehicleIconConfig{iconId=");
        sb.append(str);
        sb.append(", realTimeStatus=");
        sb.append(valueOf);
        sb.append(", noticeSeverity=");
        sb.append(valueOf2);
        sb.append(", isStale=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

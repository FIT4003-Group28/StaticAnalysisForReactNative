package defpackage;
/* compiled from: PG */
/* renamed from: sss  reason: default package */
/* loaded from: classes7.dex */
final class sss extends ssw {
    private final ssq a;
    private final dbsg<tlv> b;
    private final dehn<tgh> c;

    public sss(ssq ssqVar, dbsg<tlv> dbsgVar, dehn<tgh> dehnVar) {
        if (ssqVar != null) {
            this.a = ssqVar;
            this.b = dbsgVar;
            if (dehnVar != null) {
                this.c = dehnVar;
                return;
            }
            throw new NullPointerException("Null fetchInitializationParams");
        }
        throw new NullPointerException("Null initialActiveScreen");
    }

    @Override // defpackage.ssw
    public final ssq a() {
        return this.a;
    }

    @Override // defpackage.ssw
    public final dbsg<tlv> b() {
        return this.b;
    }

    @Override // defpackage.ssw
    public final dehn<tgh> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ssw) {
            ssw sswVar = (ssw) obj;
            if (this.a.equals(sswVar.a()) && this.b.equals(sswVar.b()) && this.c.equals(sswVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 87 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("StartDirectionsResult{initialActiveScreen=");
        sb.append(valueOf);
        sb.append(", detachedGroup=");
        sb.append(valueOf2);
        sb.append(", fetchInitializationParams=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

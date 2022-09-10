package defpackage;
/* compiled from: PG */
/* renamed from: bmnc  reason: default package */
/* loaded from: classes3.dex */
public final class bmnc extends bmnp {
    private final dbsg<bmnq> a;
    private final dbsg<bmno> b;

    public bmnc(dbsg<bmnq> dbsgVar, dbsg<bmno> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bmnp
    public final dbsg<bmnq> a() {
        return this.a;
    }

    @Override // defpackage.bmnp
    public final dbsg<bmno> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmnp) {
            bmnp bmnpVar = (bmnp) obj;
            if (this.a.equals(bmnpVar.a()) && this.b.equals(bmnpVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("BindingStatus{detectionStatus=");
        sb.append(valueOf);
        sb.append(", bindingError=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

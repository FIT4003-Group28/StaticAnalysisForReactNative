package defpackage;
/* compiled from: PG */
/* renamed from: bzrx  reason: default package */
/* loaded from: classes4.dex */
final class bzrx extends bztb {
    private final akqi a;
    private final dcdc<String> b;

    public bzrx(akqi akqiVar, dcdc<String> dcdcVar) {
        if (akqiVar != null) {
            this.a = akqiVar;
            if (dcdcVar != null) {
                this.b = dcdcVar;
                return;
            }
            throw new NullPointerException("Null photoUriStrings");
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.bztb
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.bztb
    public final dcdc<String> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bztb) {
            bztb bztbVar = (bztb) obj;
            if (this.a.equals(bztbVar.a()) && dchl.m(this.b, bztbVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
        sb.append("PhotoTakenNotificationState{featureId=");
        sb.append(valueOf);
        sb.append(", photoUriStrings=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

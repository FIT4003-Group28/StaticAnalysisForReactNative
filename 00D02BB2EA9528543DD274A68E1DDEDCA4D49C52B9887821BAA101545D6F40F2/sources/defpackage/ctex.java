package defpackage;
/* compiled from: PG */
/* renamed from: ctex  reason: default package */
/* loaded from: classes5.dex */
final class ctex extends ctfv {
    private final int a;
    private final dbsg<ctyy> b;
    private final dbsg<ctzp> c;

    public ctex(int i, dbsg<ctyy> dbsgVar, dbsg<ctzp> dbsgVar2) {
        this.a = i;
        this.b = dbsgVar;
        this.c = dbsgVar2;
    }

    @Override // defpackage.ctfv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ctfv
    public final dbsg<ctyy> b() {
        return this.b;
    }

    @Override // defpackage.ctfv
    public final dbsg<ctzp> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctfv) {
            ctfv ctfvVar = (ctfv) obj;
            if (this.a == ctfvVar.a() && this.b.equals(ctfvVar.b()) && this.c.equals(ctfvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74 + String.valueOf(valueOf2).length());
        sb.append("RegistrationResult{status=");
        sb.append(i);
        sb.append(", unsavedAccountContext=");
        sb.append(valueOf);
        sb.append(", authToken=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

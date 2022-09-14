package defpackage;
/* compiled from: PG */
/* renamed from: aikx  reason: default package */
/* loaded from: classes2.dex */
final class aikx extends ailc {
    private final dbsg<String> a;
    private final dbsg<String> b;
    private final int c;

    public aikx(int i, dbsg<String> dbsgVar, dbsg<String> dbsgVar2) {
        this.c = i;
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.ailc
    public final dbsg<String> a() {
        return this.a;
    }

    @Override // defpackage.ailc
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.ailc
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ailc) {
            ailc ailcVar = (ailc) obj;
            if (this.c == ailcVar.c() && this.a.equals(ailcVar.a()) && this.b.equals(ailcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "NOT_ELIGIBLE_TO_BECOME_PRIMARY_LSV_INVALID_ACCOUNT_TYPE" : "NOT_ELIGIBLE_TO_BECOME_PRIMARY_LSV_DOMAIN_DISABLED" : "NOT_ELIGIBLE_TO_BECOME_PRIMARY_LSV_COUNTRY_DISALLOWED" : "NOT_ELIGIBLE_TO_BECOME_PRIMARY_LSV_DISABLED" : "UNABLE_TO_DETERMINE_ELIGIBILITY";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 65 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("IneligibleToBecomePrimaryReporter{reason=");
        sb.append(str);
        sb.append(", domain=");
        sb.append(valueOf);
        sb.append(", countryCode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

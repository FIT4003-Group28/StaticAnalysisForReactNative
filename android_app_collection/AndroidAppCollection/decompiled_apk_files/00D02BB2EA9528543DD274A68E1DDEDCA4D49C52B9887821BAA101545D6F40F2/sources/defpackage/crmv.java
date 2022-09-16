package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crmv  reason: default package */
/* loaded from: classes5.dex */
public final class crmv extends crmw {
    private final bvrt<ddom> a;
    private final dcdc<akra> b;
    private final Long c;
    private final Boolean d;
    private final String e;

    public crmv(bvrt<ddom> bvrtVar, dcdc<akra> dcdcVar, Long l, Boolean bool, String str) {
        this.a = bvrtVar;
        if (dcdcVar != null) {
            this.b = dcdcVar;
            this.c = l;
            if (bool != null) {
                this.d = bool;
                this.e = str;
                return;
            }
            throw new NullPointerException("Null isPersonalLoggingMode");
        }
        throw new NullPointerException("Null routeTakenPoints");
    }

    @Override // defpackage.crmw
    public final bvrt<ddom> a() {
        return this.a;
    }

    @Override // defpackage.crmw
    public final dcdc<akra> b() {
        return this.b;
    }

    @Override // defpackage.crmw
    public final Long c() {
        return this.c;
    }

    @Override // defpackage.crmw
    public final Boolean d() {
        return this.d;
    }

    @Override // defpackage.crmw
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Long l;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crmw) {
            crmw crmwVar = (crmw) obj;
            if (this.a.equals(crmwVar.a()) && dchl.m(this.b, crmwVar.b()) && ((l = this.c) != null ? l.equals(crmwVar.c()) : crmwVar.c() == null) && this.d.equals(crmwVar.d()) && ((str = this.e) != null ? str.equals(crmwVar.e()) : crmwVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Long l = this.c;
        int i = 0;
        int hashCode2 = (((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String str = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 143 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(str).length());
        sb.append("NavigationDashboardStorageItem{serializableCompletedNavigationSession=");
        sb.append(valueOf);
        sb.append(", routeTakenPoints=");
        sb.append(valueOf2);
        sb.append(", sessionId=");
        sb.append(valueOf3);
        sb.append(", isPersonalLoggingMode=");
        sb.append(valueOf4);
        sb.append(", initialRouteEi=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

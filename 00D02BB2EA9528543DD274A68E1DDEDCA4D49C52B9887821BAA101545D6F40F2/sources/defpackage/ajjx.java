package defpackage;
/* compiled from: PG */
/* renamed from: ajjx  reason: default package */
/* loaded from: classes2.dex */
final class ajjx extends ajnc {
    private final dcep<btlu> a;
    private final boolean b;
    private final dcep<aild> c;

    public ajjx(dcep<btlu> dcepVar, boolean z, dcep<aild> dcepVar2) {
        this.a = dcepVar;
        this.b = z;
        this.c = dcepVar2;
    }

    @Override // defpackage.ajnc
    public final dcep<btlu> a() {
        return this.a;
    }

    @Override // defpackage.ajnc
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.ajnc
    public final dcep<aild> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajnc) {
            ajnc ajncVar = (ajnc) obj;
            if (this.a.equals(ajncVar.a()) && this.b == ajncVar.b() && this.c.equals(ajncVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 96 + String.valueOf(valueOf2).length());
        sb.append("ReportingEligibilityStatus{accounts=");
        sb.append(valueOf);
        sb.append(", eligibleToBecomePrimary=");
        sb.append(z);
        sb.append(", ineligibleToReportReasons=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

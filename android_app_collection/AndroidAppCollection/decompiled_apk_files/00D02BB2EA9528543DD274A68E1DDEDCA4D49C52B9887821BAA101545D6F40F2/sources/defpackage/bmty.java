package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmty  reason: default package */
/* loaded from: classes3.dex */
public final class bmty extends bmug {
    private final dcdc<bmtj> a;
    private final boolean b;
    private final String c;
    private final eapg d;

    public bmty(dcdc<bmtj> dcdcVar, boolean z, String str, eapg eapgVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = z;
            if (str != null) {
                this.c = str;
                if (eapgVar != null) {
                    this.d = eapgVar;
                    return;
                }
                throw new NullPointerException("Null today");
            }
            throw new NullPointerException("Null latestVisitLink");
        }
        throw new NullPointerException("Null labeledDays");
    }

    @Override // defpackage.bmug
    public final dcdc<bmtj> a() {
        return this.a;
    }

    @Override // defpackage.bmug
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bmug
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bmug
    public final eapg d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmug) {
            bmug bmugVar = (bmug) obj;
            if (dchl.m(this.a, bmugVar.a()) && this.b == bmugVar.b() && this.c.equals(bmugVar.c()) && this.d.equals(bmugVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + str.length() + String.valueOf(valueOf2).length());
        sb.append("PlaceHistoryForRendering{labeledDays=");
        sb.append(valueOf);
        sb.append(", isCheckedIn=");
        sb.append(z);
        sb.append(", latestVisitLink=");
        sb.append(str);
        sb.append(", today=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

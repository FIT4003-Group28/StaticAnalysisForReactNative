package defpackage;
/* compiled from: PG */
/* renamed from: bmrx  reason: default package */
/* loaded from: classes3.dex */
final class bmrx extends bmsd {
    public final dcdc<bmsg> a;

    public bmrx(dcdc<bmsg> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null ownedLocationSurveys");
    }

    @Override // defpackage.bmsd
    public final dcdc<bmsg> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmsd)) {
            return false;
        }
        return dchl.m(this.a, ((bmsd) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
        sb.append("ChronologicalOwnedLocationSurveyList{ownedLocationSurveys=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

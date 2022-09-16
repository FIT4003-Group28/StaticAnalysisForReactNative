package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmtx  reason: default package */
/* loaded from: classes3.dex */
public final class bmtx extends bmuf {
    public final dcdc<bmud> a;
    public final eapg b;

    public bmtx(dcdc<bmud> dcdcVar, eapg eapgVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            if (eapgVar != null) {
                this.b = eapgVar;
                return;
            }
            throw new NullPointerException("Null today");
        }
        throw new NullPointerException("Null datedVisitInstants");
    }

    @Override // defpackage.bmuf
    public final dcdc<bmud> a() {
        return this.a;
    }

    @Override // defpackage.bmuf
    public final eapg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmuf) {
            bmuf bmufVar = (bmuf) obj;
            if (dchl.m(this.a, bmufVar.a()) && this.b.equals(bmufVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58 + String.valueOf(valueOf2).length());
        sb.append("DatedVisitInstantListAndToday{datedVisitInstants=");
        sb.append(valueOf);
        sb.append(", today=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

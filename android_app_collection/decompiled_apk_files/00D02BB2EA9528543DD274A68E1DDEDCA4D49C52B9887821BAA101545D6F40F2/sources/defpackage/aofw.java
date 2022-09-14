package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aofw  reason: default package */
/* loaded from: classes2.dex */
public final class aofw extends aogp {
    private final eapg a;
    private final dbsg<eapi> b;

    public aofw(eapg eapgVar, dbsg<eapi> dbsgVar) {
        if (eapgVar != null) {
            this.a = eapgVar;
            if (dbsgVar != null) {
                this.b = dbsgVar;
                return;
            }
            throw new NullPointerException("Null time");
        }
        throw new NullPointerException("Null date");
    }

    @Override // defpackage.aogp
    public final eapg a() {
        return this.a;
    }

    @Override // defpackage.aogp
    public final dbsg<eapi> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogp) {
            aogp aogpVar = (aogp) obj;
            if (this.a.equals(aogpVar.a()) && this.b.equals(aogpVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
        sb.append("PartialLocalDateTime{date=");
        sb.append(valueOf);
        sb.append(", time=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

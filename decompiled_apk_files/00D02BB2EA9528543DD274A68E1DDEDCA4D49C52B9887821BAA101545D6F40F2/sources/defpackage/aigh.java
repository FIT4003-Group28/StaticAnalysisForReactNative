package defpackage;
/* compiled from: PG */
/* renamed from: aigh  reason: default package */
/* loaded from: classes2.dex */
final class aigh extends aihr {
    private final ahwg a;
    private final dbsg<aihr> b;

    public aigh(ahwg ahwgVar, dbsg<aihr> dbsgVar) {
        if (ahwgVar != null) {
            this.a = ahwgVar;
            this.b = dbsgVar;
            return;
        }
        throw new NullPointerException("Null outgoingShareInfo");
    }

    @Override // defpackage.aihr
    public final ahwg a() {
        return this.a;
    }

    @Override // defpackage.aihr
    public final dbsg<aihr> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aihr) {
            aihr aihrVar = (aihr) obj;
            if (this.a.equals(aihrVar.a()) && this.b.equals(aihrVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(valueOf2).length());
        sb.append("OutgoingShareInfoSnapshot{outgoingShareInfo=");
        sb.append(valueOf);
        sb.append(", previousOutgoingShareInfoSnapshot=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

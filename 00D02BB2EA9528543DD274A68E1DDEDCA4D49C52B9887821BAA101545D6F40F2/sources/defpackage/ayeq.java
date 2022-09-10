package defpackage;
/* compiled from: PG */
/* renamed from: ayeq  reason: default package */
/* loaded from: classes3.dex */
final class ayeq extends ayfm {
    private final boolean a;
    private final akqi b;

    public ayeq(boolean z, @dzsi akqi akqiVar) {
        this.a = z;
        this.b = akqiVar;
    }

    @Override // defpackage.ayfm
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.ayfm
    @dzsi
    public final akqi b() {
        return this.b;
    }

    @Override // defpackage.ght
    public final boolean equals(Object obj) {
        akqi akqiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayfm) {
            ayfm ayfmVar = (ayfm) obj;
            if (this.a == ayfmVar.a() && ((akqiVar = this.b) != null ? akqiVar.equals(ayfmVar.b()) : ayfmVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        akqi akqiVar = this.b;
        return i ^ (akqiVar == null ? 0 : akqiVar.hashCode());
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("CardId{isPlaceCard=");
        sb.append(z);
        sb.append(", featureId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

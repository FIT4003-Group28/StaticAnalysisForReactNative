package defpackage;
/* compiled from: PG */
/* renamed from: avqq  reason: default package */
/* loaded from: classes3.dex */
final class avqq extends avqy {
    public final dehn<dvfo> a;
    public final avrf b;

    public avqq(dehn<dvfo> dehnVar, avrf avrfVar) {
        if (dehnVar != null) {
            this.a = dehnVar;
            this.b = avrfVar;
            return;
        }
        throw new NullPointerException("Null future");
    }

    @Override // defpackage.avqy
    public final dehn<dvfo> a() {
        return this.a;
    }

    @Override // defpackage.avqy
    public final avrf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avqy) {
            avqy avqyVar = (avqy) obj;
            if (this.a.equals(avqyVar.a()) && this.b.equals(avqyVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("ActiveFetch{future=");
        sb.append(valueOf);
        sb.append(", responseHandler=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

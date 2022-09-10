package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzur  reason: default package */
/* loaded from: classes4.dex */
public final class bzur extends bzvt {
    public final dbsg<Integer> a;
    public final dbsg<String> b;

    public bzur(dbsg<Integer> dbsgVar, dbsg<String> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bzvt
    public final dbsg<Integer> a() {
        return this.a;
    }

    @Override // defpackage.bzvt
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.bzvt
    public final bzvs c() {
        return new bzuq(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzvt) {
            bzvt bzvtVar = (bzvt) obj;
            if (this.a.equals(bzvtVar.a()) && this.b.equals(bzvtVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
        sb.append("ReviewAtAPlaceNotificationReviewState{numRatingStars=");
        sb.append(valueOf);
        sb.append(", fullText=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

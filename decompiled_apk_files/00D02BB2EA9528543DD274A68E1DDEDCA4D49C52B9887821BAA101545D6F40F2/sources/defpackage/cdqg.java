package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdqg  reason: default package */
/* loaded from: classes4.dex */
public final class cdqg extends cdrf {
    private final bvrt<dnpq> a;
    private final dbsg<bvrt<dnfg>> b;

    public cdqg(bvrt<dnpq> bvrtVar, dbsg<bvrt<dnfg>> dbsgVar) {
        this.a = bvrtVar;
        this.b = dbsgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdrf) {
            cdrf cdrfVar = (cdrf) obj;
            if (this.a.equals(cdrfVar.g()) && this.b.equals(cdrfVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cdrf
    public final bvrt<dnpq> g() {
        return this.a;
    }

    @Override // defpackage.cdrf
    public final dbsg<bvrt<dnfg>> h() {
        return this.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
        sb.append("TactileReviewAuthor{authorLinkSerializable=");
        sb.append(valueOf);
        sb.append(", authorInfoSerializable=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

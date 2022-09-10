package defpackage;
/* compiled from: PG */
/* renamed from: cdqb  reason: default package */
/* loaded from: classes4.dex */
public final class cdqb extends cdqt {
    public final cdqr a;
    public final cdqs b;
    private final bvrt<dmbq> c;

    public cdqb(bvrt<dmbq> bvrtVar, cdqr cdqrVar, cdqs cdqsVar) {
        this.c = bvrtVar;
        this.a = cdqrVar;
        this.b = cdqsVar;
    }

    @Override // defpackage.cdqt
    public final bvrt<dmbq> a() {
        return this.c;
    }

    @Override // defpackage.cdqt
    public final cdqr b() {
        return this.a;
    }

    @Override // defpackage.cdqt
    public final cdqs c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdqt) {
            cdqt cdqtVar = (cdqt) obj;
            if (this.c.equals(cdqtVar.a()) && this.a.equals(cdqtVar.b()) && this.b.equals(cdqtVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 74 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PlacemarkPostInfo{postInfoSerializable=");
        sb.append(valueOf);
        sb.append(", otherUserPostInfo=");
        sb.append(valueOf2);
        sb.append(", ownPostInfo=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

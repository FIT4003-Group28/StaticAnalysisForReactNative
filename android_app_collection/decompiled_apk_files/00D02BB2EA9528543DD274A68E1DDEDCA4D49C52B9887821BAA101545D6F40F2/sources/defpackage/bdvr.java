package defpackage;
/* compiled from: PG */
/* renamed from: bdvr  reason: default package */
/* loaded from: classes3.dex */
final class bdvr extends bdvs {
    private final String a;
    private final dqjh b;

    public bdvr(String str, dqjh dqjhVar) {
        if (str != null) {
            this.a = str;
            if (dqjhVar != null) {
                this.b = dqjhVar;
                return;
            }
            throw new NullPointerException("Null voteType");
        }
        throw new NullPointerException("Null photoId");
    }

    @Override // defpackage.bdvs
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bdvs
    public final dqjh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdvs) {
            bdvs bdvsVar = (bdvs) obj;
            if (this.a.equals(bdvsVar.a()) && this.b.equals(bdvsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 36 + String.valueOf(valueOf).length());
        sb.append("VotePhotoResult{photoId=");
        sb.append(str);
        sb.append(", voteType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

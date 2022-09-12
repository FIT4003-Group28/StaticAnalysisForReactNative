package defpackage;
/* compiled from: PG */
/* renamed from: abwt  reason: default package */
/* loaded from: classes2.dex */
final class abwt extends abwx {
    private final akra a;
    private final String b;

    public abwt(akra akraVar, String str) {
        if (akraVar != null) {
            this.a = akraVar;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null photoId");
        }
        throw new NullPointerException("Null centroid");
    }

    @Override // defpackage.abwx
    public final akra a() {
        return this.a;
    }

    @Override // defpackage.abwx
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abwx) {
            abwx abwxVar = (abwx) obj;
            if (this.a.equals(abwxVar.a()) && this.b.equals(abwxVar.b())) {
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
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + str.length());
        sb.append("ClusterKey{centroid=");
        sb.append(valueOf);
        sb.append(", photoId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

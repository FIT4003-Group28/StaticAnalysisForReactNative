package defpackage;
/* compiled from: PG */
/* renamed from: bcao  reason: default package */
/* loaded from: classes3.dex */
final class bcao extends bcbc {
    private final String a;
    private final bcbl b;

    public bcao(String str, bcbl bcblVar) {
        if (str != null) {
            this.a = str;
            this.b = bcblVar;
            return;
        }
        throw new NullPointerException("Null photoId");
    }

    @Override // defpackage.bcbc
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bcbc
    public final bcbl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcbc) {
            bcbc bcbcVar = (bcbc) obj;
            if (this.a.equals(bcbcVar.a()) && this.b.equals(bcbcVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 41 + String.valueOf(valueOf).length());
        sb.append("EditPhotoResult{photoId=");
        sb.append(str);
        sb.append(", taggedCaption=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

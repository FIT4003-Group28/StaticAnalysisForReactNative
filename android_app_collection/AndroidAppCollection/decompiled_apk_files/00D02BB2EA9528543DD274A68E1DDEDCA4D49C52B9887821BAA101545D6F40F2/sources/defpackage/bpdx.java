package defpackage;
/* compiled from: PG */
/* renamed from: bpdx  reason: default package */
/* loaded from: classes3.dex */
final class bpdx extends bpdv {
    private final String a;
    private final int b;

    public bpdx(String str, int i) {
        if (str != null) {
            this.a = str;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null unconfirmedAddress");
    }

    @Override // defpackage.bpdv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bpdv
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpdv) {
            bpdv bpdvVar = (bpdv) obj;
            if (this.a.equals(bpdvVar.a()) && this.b == bpdvVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = i != 1 ? i != 2 ? "DISMISS" : "EDIT_ROAD_NAME" : "REDIRECT_ADDRESS";
        StringBuilder sb = new StringBuilder(str.length() + 40 + str2.length());
        sb.append("Result{unconfirmedAddress=");
        sb.append(str);
        sb.append(", resultType=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

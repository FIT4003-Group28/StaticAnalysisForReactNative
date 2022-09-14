package defpackage;
/* compiled from: PG */
/* renamed from: bnxz  reason: default package */
/* loaded from: classes3.dex */
final class bnxz extends bnxq {
    private final String a;
    private final String b;

    public bnxz(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.bnxq
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bnxq
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnxq) {
            bnxq bnxqVar = (bnxq) obj;
            if (this.a.equals(bnxqVar.a()) && this.b.equals(bnxqVar.b())) {
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
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 55 + str2.length());
        sb.append("AutocompleteAddressRegenerationInfo{featureId=");
        sb.append(str);
        sb.append(", query=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

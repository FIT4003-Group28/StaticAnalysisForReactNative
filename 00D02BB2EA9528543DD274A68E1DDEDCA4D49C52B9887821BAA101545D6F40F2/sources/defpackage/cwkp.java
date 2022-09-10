package defpackage;
/* compiled from: PG */
/* renamed from: cwkp  reason: default package */
/* loaded from: classes5.dex */
final class cwkp extends cwko {
    private final String a;
    private final int b;

    public cwkp(int i, String str) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.cwko
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cwko
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwko) {
            cwko cwkoVar = (cwko) obj;
            if (this.b == cwkoVar.d() && ((str = this.a) != null ? str.equals(cwkoVar.a()) : cwkoVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        String str = this.a;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "INCOGNITO" : "PSEUDONYMOUS" : "ANONYMOUS" : "GAIA";
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 28 + String.valueOf(str2).length());
        sb.append("AuthChannel{type=");
        sb.append(str);
        sb.append(", account=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

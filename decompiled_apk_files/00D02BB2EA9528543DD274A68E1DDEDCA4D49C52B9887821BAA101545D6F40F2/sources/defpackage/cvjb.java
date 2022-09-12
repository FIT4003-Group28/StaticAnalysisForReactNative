package defpackage;
/* compiled from: PG */
/* renamed from: cvjb  reason: default package */
/* loaded from: classes5.dex */
public final class cvjb extends cvjg {
    private final String a;
    private final String b;

    public cvjb(String str, @dzsi String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cvjg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cvjg
    @dzsi
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvjg) {
            cvjg cvjgVar = (cvjg) obj;
            if (this.a.equals(cvjgVar.a()) && ((str = this.b) != null ? str.equals(cvjgVar.b()) : cvjgVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("PreferenceKey{key=");
        sb.append(str);
        sb.append(", dynamicKey=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

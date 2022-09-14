package defpackage;
/* compiled from: PG */
/* renamed from: axvr  reason: default package */
/* loaded from: classes3.dex */
public final class axvr extends axwf {
    public final String a;
    public final String b;

    public axvr(String str, String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.axwf
    public final String a() {
        return this.a;
    }

    @Override // defpackage.axwf
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof axwf) {
            axwf axwfVar = (axwf) obj;
            if (this.a.equals(axwfVar.a()) && ((str = this.b) != null ? str.equals(axwfVar.b()) : axwfVar.b() == null)) {
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
        StringBuilder sb = new StringBuilder(str.length() + 25 + String.valueOf(str2).length());
        sb.append("ListIdentifier{id=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cpmw  reason: default package */
/* loaded from: classes5.dex */
public final class cpmw extends cpnc {
    private final String a;
    private final String b;
    private final String c;

    public cpmw(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.cpnc
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cpnc
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cpnc
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpnc) {
            cpnc cpncVar = (cpnc) obj;
            if (this.a.equals(cpncVar.a()) && this.b.equals(cpncVar.b()) && this.c.equals(cpncVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 67 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("Suggestion{suggestionMain=");
        sb.append(str);
        sb.append(", suggestionDetail=");
        sb.append(str2);
        sb.append(", suggestionSelected=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}

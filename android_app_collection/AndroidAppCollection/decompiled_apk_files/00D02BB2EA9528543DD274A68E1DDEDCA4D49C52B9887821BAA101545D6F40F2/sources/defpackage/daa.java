package defpackage;
/* compiled from: PG */
/* renamed from: daa  reason: default package */
/* loaded from: classes5.dex */
public final class daa extends czd {
    public final String a;
    private final String b;

    public daa(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.czd
    public final String a() {
        return this.a;
    }

    @Override // defpackage.czd
    public final int b() {
        return 0;
    }

    @Override // defpackage.czd
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czd) {
            czd czdVar = (czd) obj;
            if (this.a.equals(czdVar.a()) && czdVar.b() == 0 && this.b.equals(czdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * (-721379959)) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 45 + str2.length());
        sb.append("ArAsset{id=");
        sb.append(str);
        sb.append(", rawResourceId=");
        sb.append(0);
        sb.append(", url=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

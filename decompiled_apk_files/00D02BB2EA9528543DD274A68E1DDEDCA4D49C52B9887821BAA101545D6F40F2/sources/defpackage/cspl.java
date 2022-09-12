package defpackage;
/* compiled from: PG */
/* renamed from: cspl  reason: default package */
/* loaded from: classes5.dex */
public final class cspl extends cspk {
    public final String a;
    public final String b;

    public cspl(String str, String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    @Override // defpackage.cspk
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cspk
    public final String b() {
        return null;
    }

    @Override // defpackage.cspk
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cspk) {
            cspk cspkVar = (cspk) obj;
            if (this.a.equals(cspkVar.a()) && cspkVar.b() == null && ((str = this.b) != null ? str.equals(cspkVar.c()) : cspkVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * (-721379959);
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 53 + "null".length() + String.valueOf(str2).length());
        sb.append("ApplicationId{packageName=");
        sb.append(str);
        sb.append(", moduleName=");
        sb.append((String) null);
        sb.append(", instanceId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

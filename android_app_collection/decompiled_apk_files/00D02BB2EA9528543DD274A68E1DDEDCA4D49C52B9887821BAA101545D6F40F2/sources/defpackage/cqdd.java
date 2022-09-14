package defpackage;
/* compiled from: PG */
/* renamed from: cqdd  reason: default package */
/* loaded from: classes5.dex */
final class cqdd extends cqdn {
    private final String a;
    private final String b;
    private final int c;

    public cqdd(String str, int i, String str2) {
        if (str != null) {
            this.a = str;
            this.c = i;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null languageCode");
        }
        throw new NullPointerException("Null accountName");
    }

    @Override // defpackage.cqdn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cqdn
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cqdn
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqdn) {
            cqdn cqdnVar = (cqdn) obj;
            if (this.a.equals(cqdnVar.a()) && this.c == cqdnVar.c() && this.b.equals(cqdnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(Integer.toString(this.c - 1));
        String str2 = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 52 + String.valueOf(valueOf).length() + str2.length());
        sb.append("CacheKey{accountName=");
        sb.append(str);
        sb.append(", settingSetId=");
        sb.append(valueOf);
        sb.append(", languageCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

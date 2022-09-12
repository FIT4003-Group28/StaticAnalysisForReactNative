package defpackage;
/* compiled from: PG */
/* renamed from: cqbu  reason: default package */
/* loaded from: classes5.dex */
final class cqbu extends cqcx {
    private final String a;
    private final dskf b;
    private final String c;

    public cqbu(String str, dskf dskfVar, String str2) {
        if (str != null) {
            this.a = str;
            if (dskfVar != null) {
                this.b = dskfVar;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null languageCode");
            }
            throw new NullPointerException("Null setting");
        }
        throw new NullPointerException("Null accountName");
    }

    @Override // defpackage.cqcx
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cqcx
    public final dskf b() {
        return this.b;
    }

    @Override // defpackage.cqcx
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqcx) {
            cqcx cqcxVar = (cqcx) obj;
            if (this.a.equals(cqcxVar.a()) && this.b.equals(cqcxVar.b()) && this.c.equals(cqcxVar.c())) {
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
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(valueOf).length() + str2.length());
        sb.append("CacheKey{accountName=");
        sb.append(str);
        sb.append(", setting=");
        sb.append(valueOf);
        sb.append(", languageCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

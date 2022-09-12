package defpackage;
/* compiled from: PG */
/* renamed from: apul  reason: default package */
/* loaded from: classes2.dex */
public final class apul extends apuv {
    private final String a;
    private final String b;
    private final String c;

    public apul(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null publishedDate");
            }
            throw new NullPointerException("Null replyText");
        }
        throw new NullPointerException("Null reviewId");
    }

    @Override // defpackage.apuv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.apuv
    public final String b() {
        return this.b;
    }

    @Override // defpackage.apuv
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apuv) {
            apuv apuvVar = (apuv) obj;
            if (this.a.equals(apuvVar.a()) && this.b.equals(apuvVar.b()) && this.c.equals(apuvVar.c())) {
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
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 65 + str2.length() + str3.length());
        sb.append("ReviewResponseUpdatedEvent{reviewId=");
        sb.append(str);
        sb.append(", replyText=");
        sb.append(str2);
        sb.append(", publishedDate=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}

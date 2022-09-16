package defpackage;
/* compiled from: PG */
/* renamed from: yqv  reason: default package */
/* loaded from: classes4.dex */
public final class yqv {
    public final String a;
    public final yqp b;
    public final yqt c;
    public final int d;
    public final int e;

    public yqv(int i, String str, yqp yqpVar, yqt yqtVar) {
        if (i != 0) {
            this.e = i;
            if (str != null) {
                this.a = str;
                if (yqpVar != null) {
                    this.b = yqpVar;
                    this.c = yqtVar;
                    this.d = 2;
                    return;
                }
                throw new NullPointerException("Null headers");
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null method");
    }

    public static yqu a() {
        return new yqu();
    }

    public static yqu b(String str) {
        yqu a = a();
        a.c = 1;
        a.a = str;
        return a;
    }

    public static yqu c(String str) {
        yqu a = a();
        a.c = 2;
        a.a = str;
        a.b = yqs.a;
        return a;
    }

    public final boolean equals(Object obj) {
        yqt yqtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof yqv) {
            yqv yqvVar = (yqv) obj;
            if (this.e == yqvVar.e && this.a.equals(yqvVar.a) && this.b.equals(yqvVar.b) && ((yqtVar = this.c) != null ? yqtVar.equals(yqvVar.c) : yqvVar.c == null) && this.d == yqvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.e ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        yqt yqtVar = this.c;
        return (((hashCode ^ (yqtVar == null ? 0 : yqtVar.hashCode())) * 1000003) ^ this.d) * (-721379959);
    }

    public final String toString() {
        int i = this.e;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "HEAD" : "DELETE" : "PUT" : "POST" : "GET";
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 103 + str2.length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + "null".length() + "null".length());
        sb.append("HttpRequest{method=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", headers=");
        sb.append(valueOf);
        sb.append(", body=");
        sb.append(valueOf2);
        sb.append(", priority=");
        sb.append(i2);
        sb.append(", readTimeoutMs=");
        sb.append("null");
        sb.append(", connectionTimeoutMs=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }

    public yqv() {
    }
}

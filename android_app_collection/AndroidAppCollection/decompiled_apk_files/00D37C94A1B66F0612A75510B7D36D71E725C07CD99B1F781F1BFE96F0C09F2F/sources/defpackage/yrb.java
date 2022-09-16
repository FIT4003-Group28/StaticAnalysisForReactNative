package defpackage;
/* compiled from: PG */
/* renamed from: yrb  reason: default package */
/* loaded from: classes4.dex */
public final class yrb {
    public final int a;
    public final String b;
    public final yqp c;
    public final yqz d;
    private final String e;

    public yrb() {
    }

    public yrb(String str, int i, String str2, yqp yqpVar, yqz yqzVar) {
        this.e = str;
        this.a = i;
        this.b = str2;
        this.c = yqpVar;
        this.d = yqzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yrb) {
            yrb yrbVar = (yrb) obj;
            if (this.e.equals(yrbVar.e) && this.a == yrbVar.a && this.b.equals(yrbVar.b) && this.c.equals(yrbVar.c)) {
                yqz yqzVar = this.d;
                yqz yqzVar2 = yrbVar.d;
                if (yqzVar != null ? yqzVar.equals(yqzVar2) : yqzVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        yqz yqzVar = this.d;
        return hashCode ^ (yqzVar == null ? 0 : yqzVar.hashCode());
    }

    public final String toString() {
        String str = this.e;
        int i = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("HttpResponse{protocol=");
        sb.append(str);
        sb.append(", statusCode=");
        sb.append(i);
        sb.append(", reasonPhrase=");
        sb.append(str2);
        sb.append(", headers=");
        sb.append(valueOf);
        sb.append(", body=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

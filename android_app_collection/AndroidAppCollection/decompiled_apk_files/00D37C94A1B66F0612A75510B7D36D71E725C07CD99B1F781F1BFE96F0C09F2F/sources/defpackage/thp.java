package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: thp  reason: default package */
/* loaded from: classes4.dex */
public final class thp {
    public final amvn a;
    public final String b;
    public final Integer c;
    public final Status d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Boolean h;
    public final int i;
    public final akvy j;

    public thp() {
    }

    public thp(amvn amvnVar, akvy akvyVar, String str, Integer num, Status status, String str2, String str3, Integer num2, Boolean bool, int i, byte[] bArr) {
        this.a = amvnVar;
        this.j = akvyVar;
        this.b = str;
        this.c = num;
        this.d = status;
        this.e = str2;
        this.f = str3;
        this.g = num2;
        this.h = bool;
        this.i = i;
    }

    public static tho a() {
        tho thoVar = new tho();
        thoVar.b(1);
        return thoVar;
    }

    public final boolean equals(Object obj) {
        akvy akvyVar;
        String str;
        Integer num;
        Status status;
        String str2;
        String str3;
        Integer num2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof thp) {
            thp thpVar = (thp) obj;
            if (this.a.equals(thpVar.a) && ((akvyVar = this.j) != null ? akvyVar.equals(thpVar.j) : thpVar.j == null) && ((str = this.b) != null ? str.equals(thpVar.b) : thpVar.b == null) && ((num = this.c) != null ? num.equals(thpVar.c) : thpVar.c == null) && ((status = this.d) != null ? status.equals(thpVar.d) : thpVar.d == null) && ((str2 = this.e) != null ? str2.equals(thpVar.e) : thpVar.e == null) && ((str3 = this.f) != null ? str3.equals(thpVar.f) : thpVar.f == null) && ((num2 = this.g) != null ? num2.equals(thpVar.g) : thpVar.g == null) && ((bool = this.h) != null ? bool.equals(thpVar.h) : thpVar.h == null) && this.i == thpVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        akvy akvyVar = this.j;
        int i = 0;
        int hashCode2 = (hashCode ^ (akvyVar == null ? 0 : akvyVar.hashCode())) * 1000003;
        String str = this.b;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.c;
        int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Status status = this.d;
        int hashCode5 = (hashCode4 ^ (status == null ? 0 : status.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode6 = (hashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int hashCode7 = (hashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Integer num2 = this.g;
        int hashCode8 = (hashCode7 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Boolean bool = this.h;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode8 ^ i) * 1000003) ^ this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.j);
        String str = this.b;
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String str2 = this.e;
        String str3 = this.f;
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        int i = this.i;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(str2).length();
        int length7 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 204 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("SpanInfo{templateUris=");
        sb.append(valueOf);
        sb.append(", threadInfo=");
        sb.append(valueOf2);
        sb.append(", nodeId=");
        sb.append(str);
        sb.append(", commandExtensionId=");
        sb.append(valueOf3);
        sb.append(", commandExecutionStatus=");
        sb.append(valueOf4);
        sb.append(", jsModuleIdentifier=");
        sb.append(str2);
        sb.append(", jsFunctionName=");
        sb.append(str3);
        sb.append(", jsBindingExtensionId=");
        sb.append(valueOf5);
        sb.append(", jsIsSynchronous=");
        sb.append(valueOf6);
        sb.append(", materializationCount=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

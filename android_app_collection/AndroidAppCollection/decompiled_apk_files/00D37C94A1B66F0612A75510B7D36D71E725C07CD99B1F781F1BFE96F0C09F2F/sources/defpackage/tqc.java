package defpackage;
/* compiled from: PG */
/* renamed from: tqc  reason: default package */
/* loaded from: classes4.dex */
public final class tqc {
    public final String a;
    public final ampq b;
    public final ampq c;
    private final ampq d;
    private final ampq e;
    private final ampq f;
    private final int g;
    private final int h;

    public tqc() {
    }

    public tqc(String str, ampq ampqVar, ampq ampqVar2, ampq ampqVar3, ampq ampqVar4, ampq ampqVar5, int i, int i2) {
        this.a = str;
        this.d = ampqVar;
        this.e = ampqVar2;
        this.f = ampqVar3;
        this.b = ampqVar4;
        this.c = ampqVar5;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqc) {
            tqc tqcVar = (tqc) obj;
            if (this.a.equals(tqcVar.a) && this.d.equals(tqcVar.d) && this.e.equals(tqcVar.e) && this.f.equals(tqcVar.f) && this.b.equals(tqcVar.b) && this.c.equals(tqcVar.c) && this.g == tqcVar.g) {
                int i = this.h;
                int i2 = tqcVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g) * 1000003;
        int i = this.h;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.c);
        int i = this.g;
        int i2 = this.h;
        String str2 = i2 != 1 ? i2 != 2 ? "null" : "ALL" : "NONE";
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 195 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + str2.length());
        sb.append("DownloadFileGroupRequest{groupName=");
        sb.append(str);
        sb.append(", accountOptional=");
        sb.append(valueOf);
        sb.append(", contentTitleOptional=");
        sb.append(valueOf2);
        sb.append(", contentTextOptional=");
        sb.append(valueOf3);
        sb.append(", downloadConditionsOptional=");
        sb.append(valueOf4);
        sb.append(", listenerOptional=");
        sb.append(valueOf5);
        sb.append(", groupSizeBytes=");
        sb.append(i);
        sb.append(", showNotifications=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: uvj  reason: default package */
/* loaded from: classes4.dex */
public final class uvj {
    public final String a;
    public final boolean b;
    public final baax c;
    public final azzk d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final utu h;

    public uvj() {
    }

    public uvj(String str, boolean z, baax baaxVar, azzk azzkVar, String str2, Long l, boolean z2, utu utuVar) {
        this.a = str;
        this.b = z;
        this.c = baaxVar;
        this.d = azzkVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = utuVar;
    }

    public static uvi a() {
        uvi uviVar = new uvi();
        uviVar.b(false);
        uviVar.c(false);
        return uviVar;
    }

    public final boolean equals(Object obj) {
        azzk azzkVar;
        String str;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uvj) {
            uvj uvjVar = (uvj) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(uvjVar.a) : uvjVar.a == null) {
                if (this.b == uvjVar.b && this.c.equals(uvjVar.c) && ((azzkVar = this.d) != null ? azzkVar.equals(uvjVar.d) : uvjVar.d == null) && ((str = this.e) != null ? str.equals(uvjVar.e) : uvjVar.e == null) && ((l = this.f) != null ? l.equals(uvjVar.f) : uvjVar.f == null) && this.g == uvjVar.g) {
                    utu utuVar = this.h;
                    utu utuVar2 = uvjVar.h;
                    if (utuVar != null ? utuVar.equals(utuVar2) : utuVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int i2 = 1237;
        int hashCode = ((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003;
        azzk azzkVar = this.d;
        int hashCode2 = (hashCode ^ (azzkVar == null ? 0 : azzkVar.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f;
        int hashCode4 = (hashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        if (true == this.g) {
            i2 = 1231;
        }
        int i3 = (hashCode4 ^ i2) * 1000003;
        utu utuVar = this.h;
        if (utuVar != null) {
            i = utuVar.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        boolean z2 = this.g;
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 161 + length2 + length3 + length4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Metric{customEventName=");
        sb.append(str);
        sb.append(", isEventNameConstant=");
        sb.append(z);
        sb.append(", metric=");
        sb.append(valueOf);
        sb.append(", metricExtension=");
        sb.append(valueOf2);
        sb.append(", accountableComponentName=");
        sb.append(str2);
        sb.append(", sampleRatePermille=");
        sb.append(valueOf3);
        sb.append(", isUnsampled=");
        sb.append(z2);
        sb.append(", debugLogsTime=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

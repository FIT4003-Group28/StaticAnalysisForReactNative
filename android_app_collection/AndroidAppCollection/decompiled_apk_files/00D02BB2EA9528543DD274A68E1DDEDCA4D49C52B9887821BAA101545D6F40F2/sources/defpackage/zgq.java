package defpackage;
/* compiled from: PG */
/* renamed from: zgq  reason: default package */
/* loaded from: classes7.dex */
final class zgq extends zqw {
    private final String a;
    private final String b;
    private final cqtd c;

    public zgq(String str, String str2, cqtd cqtdVar) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = cqtdVar;
                return;
            }
            throw new NullPointerException("Null temperatureText");
        }
        throw new NullPointerException("Null weatherCondition");
    }

    @Override // defpackage.zfr
    public String a() {
        return this.a;
    }

    @Override // defpackage.zfr
    public String b() {
        return this.b;
    }

    @Override // defpackage.zfr
    public cqtd c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zqw) {
            zqw zqwVar = (zqw) obj;
            if (this.a.equals(zqwVar.a()) && this.b.equals(zqwVar.b()) && this.c.equals(zqwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 71 + str2.length() + String.valueOf(valueOf).length());
        sb.append("WeatherViewModelImpl{weatherCondition=");
        sb.append(str);
        sb.append(", temperatureText=");
        sb.append(str2);
        sb.append(", weatherIcon=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

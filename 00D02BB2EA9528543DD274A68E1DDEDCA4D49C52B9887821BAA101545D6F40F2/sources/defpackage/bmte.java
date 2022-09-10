package defpackage;
/* compiled from: PG */
/* renamed from: bmte  reason: default package */
/* loaded from: classes3.dex */
final class bmte extends bmtj {
    private final eapg a;
    private final String b;
    private final String c;
    private final String d;
    private final dcdc<String> e;
    private final String f;
    private final boolean g;

    public bmte(eapg eapgVar, String str, String str2, String str3, dcdc<String> dcdcVar, String str4, boolean z) {
        this.a = eapgVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = dcdcVar;
        this.f = str4;
        this.g = z;
    }

    @Override // defpackage.bmtj
    public final eapg a() {
        return this.a;
    }

    @Override // defpackage.bmtj
    public final String b() {
        return this.b;
    }

    @Override // defpackage.bmtj
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bmtj
    public final String d() {
        return this.d;
    }

    @Override // defpackage.bmtj
    public final dcdc<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmtj) {
            bmtj bmtjVar = (bmtj) obj;
            if (this.a.equals(bmtjVar.a()) && this.b.equals(bmtjVar.b()) && this.c.equals(bmtjVar.c()) && this.d.equals(bmtjVar.d()) && dchl.m(this.e, bmtjVar.e()) && this.f.equals(bmtjVar.f()) && this.g == bmtjVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bmtj
    public final String f() {
        return this.f;
    }

    @Override // defpackage.bmtj
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String str4 = this.f;
        boolean z = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 96 + length2 + length3 + length4 + String.valueOf(valueOf2).length() + String.valueOf(str4).length());
        sb.append("LabeledDay{day=");
        sb.append(valueOf);
        sb.append(", monthDay=");
        sb.append(str);
        sb.append(", year=");
        sb.append(str2);
        sb.append(", dayOfWeek=");
        sb.append(str3);
        sb.append(", extraLabels=");
        sb.append(valueOf2);
        sb.append(", contentDescription=");
        sb.append(str4);
        sb.append(", isToday=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: antb  reason: default package */
/* loaded from: classes2.dex */
final class antb extends anyk {
    private final String a;
    private final String b;
    private final cqss c;
    private final jic d;
    private final String e;

    public antb(String str, String str2, cqss cqssVar, jic jicVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = cqssVar;
        this.d = jicVar;
        this.e = str3;
    }

    @Override // defpackage.anyi
    public String a() {
        return this.a;
    }

    @Override // defpackage.anyi
    public String b() {
        return this.b;
    }

    @Override // defpackage.anyi
    public cqss c() {
        return this.c;
    }

    @Override // defpackage.anyi
    public jic d() {
        return this.d;
    }

    @Override // defpackage.anyi
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anyk) {
            anyk anykVar = (anyk) obj;
            if (this.a.equals(anykVar.a()) && this.b.equals(anykVar.b()) && this.c.equals(anykVar.c()) && this.d.equals(anykVar.d()) && this.e.equals(anykVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str3 = this.e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + length3 + String.valueOf(valueOf2).length() + String.valueOf(str3).length());
        sb.append("DaySummaryItemViewModelImpl{primaryText=");
        sb.append(str);
        sb.append(", secondaryText=");
        sb.append(str2);
        sb.append(", textColor=");
        sb.append(valueOf);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append(", iconDescription=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}

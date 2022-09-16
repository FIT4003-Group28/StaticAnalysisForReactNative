package defpackage;
/* compiled from: PG */
/* renamed from: zgm  reason: default package */
/* loaded from: classes7.dex */
final class zgm extends zpm {
    private final dqvj a;
    private final String b;
    private final cqtd c;
    private final String d;
    private final ddho e;
    private final Boolean f;
    private final Boolean g;
    private final Boolean h;

    public zgm(dqvj dqvjVar, @dzsi String str, cqtd cqtdVar, String str2, @dzsi ddho ddhoVar, Boolean bool, Boolean bool2, Boolean bool3) {
        if (dqvjVar != null) {
            this.a = dqvjVar;
            this.b = str;
            this.c = cqtdVar;
            if (str2 != null) {
                this.d = str2;
                this.e = ddhoVar;
                this.f = bool;
                this.g = bool2;
                this.h = bool3;
                return;
            }
            throw new NullPointerException("Null getContentDescription");
        }
        throw new NullPointerException("Null getTravelMode");
    }

    @Override // defpackage.zpm, defpackage.zex
    public cqtd a() {
        return this.c;
    }

    @Override // defpackage.zpm, defpackage.zex
    @dzsi
    public String b() {
        return this.b;
    }

    @Override // defpackage.zpm, defpackage.zex
    public String c() {
        return this.d;
    }

    @Override // defpackage.zpm, defpackage.zex
    public Boolean d() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        ddho ddhoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zpm) {
            zpm zpmVar = (zpm) obj;
            if (this.a.equals(zpmVar.h()) && ((str = this.b) != null ? str.equals(zpmVar.b()) : zpmVar.b() == null) && this.c.equals(zpmVar.a()) && this.d.equals(zpmVar.c()) && ((ddhoVar = this.e) != null ? ddhoVar.equals(zpmVar.i()) : zpmVar.i() == null) && this.f.equals(zpmVar.f()) && this.g.equals(zpmVar.g()) && this.h.equals(zpmVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zpm, defpackage.zex
    public Boolean f() {
        return this.f;
    }

    @Override // defpackage.zpm, defpackage.zex
    public Boolean g() {
        return this.g;
    }

    @Override // defpackage.zpm
    public dqvj h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        ddho ddhoVar = this.e;
        if (ddhoVar != null) {
            i = ddhoVar.hashCode();
        }
        return ((((((hashCode2 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.zpm
    @dzsi
    public ddho i() {
        return this.e;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String str2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = str2.length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 163 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("TravelModeButtonViewModelImpl{getTravelMode=");
        sb.append(valueOf);
        sb.append(", getText=");
        sb.append(str);
        sb.append(", getTravelModeIcon=");
        sb.append(valueOf2);
        sb.append(", getContentDescription=");
        sb.append(str2);
        sb.append(", getGeoVisualElementType=");
        sb.append(valueOf3);
        sb.append(", hasIndent=");
        sb.append(valueOf4);
        sb.append(", isTwoLines=");
        sb.append(valueOf5);
        sb.append(", isSelected=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

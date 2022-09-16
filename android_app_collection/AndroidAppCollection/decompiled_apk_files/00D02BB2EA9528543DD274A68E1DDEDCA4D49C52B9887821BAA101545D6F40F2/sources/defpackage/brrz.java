package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brrz  reason: default package */
/* loaded from: classes4.dex */
public final class brrz extends brrx {
    public final dghs a;
    public final ddho b;
    public final boolean c;
    public final boolean d;
    public final dbsg<String> e;
    public final brrv f;
    public final brrw g;
    public final dbsg<ddhc> h;

    public brrz(dghs dghsVar, ddho ddhoVar, boolean z, boolean z2, dbsg<String> dbsgVar, brrv brrvVar, brrw brrwVar, dbsg<ddhc> dbsgVar2) {
        this.a = dghsVar;
        this.b = ddhoVar;
        this.c = z;
        this.d = z2;
        this.e = dbsgVar;
        this.f = brrvVar;
        this.g = brrwVar;
        this.h = dbsgVar2;
    }

    @Override // defpackage.brrx
    public final dghs a() {
        return this.a;
    }

    @Override // defpackage.brrx
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.brrx
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.brrx
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.brrx
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brrx) {
            brrx brrxVar = (brrx) obj;
            if (this.a.equals(brrxVar.a()) && this.b.equals(brrxVar.b()) && this.c == brrxVar.c() && this.d == brrxVar.d() && this.e.equals(brrxVar.e()) && this.f.equals(brrxVar.f()) && this.g.equals(brrxVar.g()) && this.h.equals(brrxVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.brrx
    public final brrv f() {
        return this.f;
    }

    @Override // defpackage.brrx
    public final brrw g() {
        return this.g;
    }

    @Override // defpackage.brrx
    public final dbsg<ddhc> h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return ((((((((hashCode ^ i) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.brrx
    public final brrs i() {
        return new brry(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        boolean z2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 149 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ActionButtonConfig{buttonType=");
        sb.append(valueOf);
        sb.append(", veType=");
        sb.append(valueOf2);
        sb.append(", logCounterfactually=");
        sb.append(z);
        sb.append(", isProminentButton=");
        sb.append(z2);
        sb.append(", overriddenButtonText=");
        sb.append(valueOf3);
        sb.append(", extras=");
        sb.append(valueOf4);
        sb.append(", surface=");
        sb.append(valueOf5);
        sb.append(", verticalData=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

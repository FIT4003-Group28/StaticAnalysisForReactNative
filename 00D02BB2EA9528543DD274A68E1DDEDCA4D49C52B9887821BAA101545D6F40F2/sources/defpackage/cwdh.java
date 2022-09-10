package defpackage;
/* compiled from: PG */
/* renamed from: cwdh  reason: default package */
/* loaded from: classes.dex */
final class cwdh extends cwdl {
    private final cwdr a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final dcdc<cwdc> f;

    public cwdh(cwdr cwdrVar, boolean z, boolean z2, boolean z3, boolean z4, dcdc<cwdc> dcdcVar) {
        this.a = cwdrVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = dcdcVar;
    }

    @Override // defpackage.cwdl
    public final cwdr a() {
        return this.a;
    }

    @Override // defpackage.cwdl
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.cwdl
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.cwdl
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.cwdl
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwdl) {
            cwdl cwdlVar = (cwdl) obj;
            if (this.a.equals(cwdlVar.a()) && this.b == cwdlVar.b() && this.c == cwdlVar.c() && this.d == cwdlVar.d() && this.e == cwdlVar.e() && dchl.m(this.f, cwdlVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cwdl
    public final dcdc<cwdc> f() {
        return this.f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        String valueOf2 = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 188 + String.valueOf(valueOf2).length());
        sb.append("Configuration{restrictedConfiguration=");
        sb.append(valueOf);
        sb.append(", showUseWithoutAnAccount=");
        sb.append(z);
        sb.append(", allowRings=");
        sb.append(z2);
        sb.append(", showMyGoogleChipInEmbeddedMenuHeader=");
        sb.append(z3);
        sb.append(", showSwitchProfileAction=");
        sb.append(z4);
        sb.append(", appSpecificActionSpecs=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

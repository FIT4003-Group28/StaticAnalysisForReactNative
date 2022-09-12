package defpackage;
/* compiled from: PG */
/* renamed from: cwdv  reason: default package */
/* loaded from: classes.dex */
final class cwdv<AccountT> extends cwdt<AccountT> {
    private final dbsg<cwef> a;
    private final dbsg<cweg<AccountT>> b;
    private final cweh<AccountT> c;
    private final dbsg<cwej> d;
    private final dbsg<cweb<AccountT>> e;
    private final dcdc<cwdc> f;
    private final cwee g;
    private final dbsg<cvwm<AccountT>> h;
    private final dbsg<cwei<AccountT>> i;
    private final dbsg<cwec> j;
    private final boolean k;

    public cwdv(dbsg<cwef> dbsgVar, dbsg<cweg<AccountT>> dbsgVar2, cweh<AccountT> cwehVar, dbsg<cwej> dbsgVar3, dbsg<cweb<AccountT>> dbsgVar4, dcdc<cwdc> dcdcVar, cwee cweeVar, dbsg<cvwm<AccountT>> dbsgVar5, dbsg<cwei<AccountT>> dbsgVar6, dbsg<cwec> dbsgVar7, boolean z) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = cwehVar;
        this.d = dbsgVar3;
        this.e = dbsgVar4;
        this.f = dcdcVar;
        this.g = cweeVar;
        this.h = dbsgVar5;
        this.i = dbsgVar6;
        this.j = dbsgVar7;
        this.k = z;
    }

    @Override // defpackage.cwdt
    public final dbsg<cwef> a() {
        return this.a;
    }

    @Override // defpackage.cwdt
    public final dbsg<cweg<AccountT>> b() {
        return this.b;
    }

    @Override // defpackage.cwdt
    public final cweh<AccountT> c() {
        return this.c;
    }

    @Override // defpackage.cwdt
    public final dbsg<cwej> d() {
        return this.d;
    }

    @Override // defpackage.cwdt
    public final dbsg<cweb<AccountT>> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwdt) {
            cwdt cwdtVar = (cwdt) obj;
            if (this.a.equals(cwdtVar.a()) && this.b.equals(cwdtVar.b()) && this.c.equals(cwdtVar.c()) && this.d.equals(cwdtVar.d()) && this.e.equals(cwdtVar.e()) && dchl.m(this.f, cwdtVar.f()) && this.g.equals(cwdtVar.g()) && this.h.equals(cwdtVar.h()) && this.i.equals(cwdtVar.i()) && this.j.equals(cwdtVar.j()) && this.k == cwdtVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cwdt
    public final dcdc<cwdc> f() {
        return this.f;
    }

    @Override // defpackage.cwdt
    public final cwee g() {
        return this.g;
    }

    @Override // defpackage.cwdt
    public final dbsg<cvwm<AccountT>> h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.k ? 1237 : 1231);
    }

    @Override // defpackage.cwdt
    public final dbsg<cwei<AccountT>> i() {
        return this.i;
    }

    @Override // defpackage.cwdt
    public final dbsg<cwec> j() {
        return this.j;
    }

    @Override // defpackage.cwdt
    public final boolean k() {
        return this.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        boolean z = this.k;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 311 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("AccountMenuFeatures{incognitoFeature=");
        sb.append(valueOf);
        sb.append(", obakeFeature=");
        sb.append(valueOf2);
        sb.append(", policyFooterCustomizer=");
        sb.append(valueOf3);
        sb.append(", useWithoutAnAccountActionFeature=");
        sb.append(valueOf4);
        sb.append(", collapsibleAccountManagementFeature=");
        sb.append(valueOf5);
        sb.append(", commonActions=");
        sb.append(valueOf6);
        sb.append(", educationManager=");
        sb.append(valueOf7);
        sb.append(", accountParticleCounter=");
        sb.append(valueOf8);
        sb.append(", showSnackbarOnQuickAccountSwitchingFeature=");
        sb.append(valueOf9);
        sb.append(", disableAccountSwitchingFeature=");
        sb.append(valueOf10);
        sb.append(", isExperimental=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

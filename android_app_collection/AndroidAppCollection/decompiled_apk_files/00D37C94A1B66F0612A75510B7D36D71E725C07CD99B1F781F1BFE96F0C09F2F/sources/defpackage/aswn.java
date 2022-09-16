package defpackage;
/* compiled from: PG */
/* renamed from: aswn  reason: default package */
/* loaded from: classes2.dex */
public final class aswn implements aajq {
    public static final aajr a = new aswm();
    public final aswk b;
    private final aajl c;

    public aswn(aswk aswkVar, aajl aajlVar) {
        this.b = aswkVar;
        this.c = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getLightThemeLogoModel().a());
        amvlVar.j(getDarkThemeLogoModel().a());
        amvlVar.j(getLightThemeAnimatedLogoModel().a());
        amvlVar.j(getDarkThemeAnimatedLogoModel().a());
        amvlVar.j(getOnTapCommandModel().a());
        amvlVar.j(getTooltipTextModel().a());
        amvlVar.j(getAccessibilityDataModel().a());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new aswl(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aswn) && this.b.equals(((aswn) obj).b);
    }

    public aovs getAccessibilityData() {
        aovs aovsVar = this.b.j;
        return aovsVar == null ? aovs.a : aovsVar;
    }

    public aovq getAccessibilityDataModel() {
        aovs aovsVar = this.b.j;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        return aovq.b(aovsVar).a(this.c);
    }

    public avhn getDarkThemeAnimatedLogo() {
        avhn avhnVar = this.b.g;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public avhr getDarkThemeAnimatedLogoModel() {
        avhn avhnVar = this.b.g;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.c);
    }

    public aswj getDarkThemeLogo() {
        aswj aswjVar = this.b.e;
        return aswjVar == null ? aswj.a : aswjVar;
    }

    public aswq getDarkThemeLogoModel() {
        aswj aswjVar = this.b.e;
        if (aswjVar == null) {
            aswjVar = aswj.a;
        }
        return aswq.b(aswjVar).a(this.c);
    }

    public avhn getLightThemeAnimatedLogo() {
        avhn avhnVar = this.b.f;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public avhr getLightThemeAnimatedLogoModel() {
        avhn avhnVar = this.b.f;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.c);
    }

    public aswj getLightThemeLogo() {
        aswj aswjVar = this.b.d;
        return aswjVar == null ? aswj.a : aswjVar;
    }

    public aswq getLightThemeLogoModel() {
        aswj aswjVar = this.b.d;
        if (aswjVar == null) {
            aswjVar = aswj.a;
        }
        return aswq.b(aswjVar).a(this.c);
    }

    public apzg getOnTapCommand() {
        apzg apzgVar = this.b.h;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    public apzf getOnTapCommandModel() {
        apzg apzgVar = this.b.h;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        return apzf.b(apzgVar).a(this.c);
    }

    public String getPromoId() {
        return this.b.k;
    }

    public arag getTooltipText() {
        arag aragVar = this.b.i;
        return aragVar == null ? arag.a : aragVar;
    }

    public arad getTooltipTextModel() {
        arag aragVar = this.b.i;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return arad.b(aragVar).a(this.c);
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("LogoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

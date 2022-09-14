package defpackage;
/* compiled from: PG */
/* renamed from: ajcb  reason: default package */
/* loaded from: classes2.dex */
public final class ajcb {
    private final ajsa a;
    private final dxio<afha> b;
    private final gga c;

    public ajcb(ajsa ajsaVar, dxio<afha> dxioVar, gga ggaVar) {
        this.a = ajsaVar;
        this.b = dxioVar;
        this.c = ggaVar;
    }

    public static boolean b(aion aionVar) {
        return aionVar.e().a() && aionVar.e().b() == aiol.REPORTING_SETTINGS;
    }

    public final void a(dbsg<btlu> dbsgVar, aion aionVar) {
        if (b(aionVar)) {
            aiol aiolVar = aiol.NETWORK_AVAILABILITY;
            if (aionVar.e().b().ordinal() != 1 || !dbsgVar.a()) {
                return;
            }
            this.a.a(dbsgVar.b());
        } else if (!aionVar.f().a()) {
        } else {
            this.b.a().k(this.c, aionVar.f().b(), 1);
        }
    }
}

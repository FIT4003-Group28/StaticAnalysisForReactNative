package defpackage;
/* compiled from: PG */
/* renamed from: crgv  reason: default package */
/* loaded from: classes5.dex */
public final class crgv {
    @dzsi
    private final ckoy a;
    @dzsi
    private final ckoy b;

    public crgv(dbsg<ckox> dbsgVar) {
        dbsu dbsuVar = (dbsu) dbsgVar;
        this.a = ((ckox) dbsuVar.a).b(ckpa.NAVIGATION_SERVICE_CREATE_TO_DESTROY, dszg.NAVIGATION, ckow.SELF_MANAGED, true, true, true, true);
        this.b = ((ckox) dbsuVar.a).b(ckpa.NAVIGATION_SESSION_START_TO_FINISH, dszg.NAVIGATION, ckow.SELF_MANAGED, true, true, true, true);
    }

    public final synchronized void a() {
        ckoy ckoyVar = this.a;
        if (ckoyVar != null) {
            ckoyVar.b(0);
        }
    }

    public final synchronized void b() {
        ckoy ckoyVar = this.a;
        if (ckoyVar != null) {
            ckoyVar.c(0);
        }
    }

    public final synchronized void c(arym arymVar) {
        ckoy ckoyVar = this.b;
        if (ckoyVar != null) {
            ckoyVar.b(true != arymVar.equals(arym.GUIDED_NAV) ? 3 : 2);
        }
    }

    public final synchronized void d(boolean z) {
        ckoy ckoyVar = this.b;
        if (ckoyVar != null) {
            ckoyVar.c(true != z ? 3 : 2);
        }
    }
}

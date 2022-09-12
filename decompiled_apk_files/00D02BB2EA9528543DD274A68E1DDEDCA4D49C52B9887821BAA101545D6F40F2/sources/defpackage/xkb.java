package defpackage;
/* renamed from: xkb  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class xkb {
    public static eaol a(eaol eaolVar) {
        return eaolVar.u().t();
    }

    @dzsi
    public static eaow b(cqat cqatVar, @dzsi eapr eaprVar) {
        return c(cqatVar, eaprVar, null);
    }

    @dzsi
    public static eaow c(cqat cqatVar, @dzsi eapr eaprVar, @dzsi eapr eaprVar2) {
        if (eaprVar == null) {
            eaprVar = eaprVar2;
        }
        if (eaprVar == null) {
            return null;
        }
        eaow c = eapj.b(a(new eaol(cqatVar.b())), a(new eaol(eaprVar))).c();
        if (!eaow.c(Math.abs(c.f())).q(eaow.b(1L))) {
            return null;
        }
        return c;
    }
}

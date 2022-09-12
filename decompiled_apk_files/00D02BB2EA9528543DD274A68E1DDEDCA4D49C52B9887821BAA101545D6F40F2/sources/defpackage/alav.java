package defpackage;
/* compiled from: PG */
/* renamed from: alav  reason: default package */
/* loaded from: classes2.dex */
public final class alav extends alau {
    public final amwb a;

    public alav(akra akraVar, amwb amwbVar, @dzsi cjqm cjqmVar) {
        super(amwbVar.b(), akraVar, cjqmVar);
        this.a = amwbVar;
    }

    @dzsi
    public static alav a(dozz dozzVar, akrk akrkVar, dbsg<cjqm> dbsgVar) {
        douj doujVar = dozzVar.v;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        if (doujVar.d.size() == 0) {
            return null;
        }
        akra akraVar = new akra();
        akrkVar.t(0.5f, akraVar);
        return new alav(akraVar, amwb.F(dozzVar), dbsgVar.f());
    }
}

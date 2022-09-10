package defpackage;
/* compiled from: PG */
/* renamed from: bqdn  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqdn {
    public static bqdn e(cflx cflxVar) {
        dccx F = dcdc.F();
        if (cflxVar.b().l() > 0) {
            F.g(bqdm.d(cflxVar.b().m(0), cflxVar.e()));
            F.g(bqdm.d(cflxVar.b().p(), cflxVar.f()));
        }
        return new bqdi(cflxVar.b(), dbsg.i(Long.valueOf(cflxVar.a())), dbpy.a, F.f());
    }

    public static bqdn f(bqhr bqhrVar, akrk akrkVar) {
        dccx F = dcdc.F();
        if (akrkVar.l() > 0) {
            F.g(bqdm.c(akrkVar.m(0)));
            F.g(bqdm.c(akrkVar.p()));
        }
        return new bqdi(akrkVar, dbpy.a, dbsg.i(bqhrVar), F.f());
    }

    public abstract akrk a();

    public abstract dbsg<Long> b();

    public abstract dbsg<bqhr> c();

    public abstract dcdc<bqdm> d();
}

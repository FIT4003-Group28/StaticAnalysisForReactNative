package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: anee  reason: default package */
/* loaded from: classes2.dex */
public abstract class anee implements Serializable {
    public static anee A(String str, String str2, @dzsi String str3, @dzsi akqq akqqVar, ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3) {
        aneb z = z();
        z.r(str);
        z.q(str2);
        andx andxVar = (andx) z;
        andxVar.b = str3;
        andxVar.c = akqqVar;
        z.g(ddhoVar);
        z.c(ddhoVar2);
        z.e(ddhoVar3);
        z.o(false);
        z.f(false);
        z.m();
        andxVar.h = dbpy.a;
        andxVar.i = dbpy.a;
        return z.a();
    }

    public static aneb z() {
        andx andxVar = new andx();
        andxVar.r("");
        andxVar.j(2);
        andxVar.q("");
        andxVar.a = 2;
        andxVar.k(2131232027);
        andxVar.g = dbpy.a;
        andxVar.b(false);
        andxVar.g(dtxy.a);
        andxVar.c(dtxy.a);
        andxVar.e(dtxy.a);
        andxVar.o(false);
        andxVar.l(false);
        andxVar.f(false);
        andxVar.p(false);
        andxVar.i(dcdc.e());
        andxVar.n(false);
        andxVar.m();
        andxVar.h = dbpy.a;
        andxVar.i = dbpy.a;
        return andxVar;
    }

    public abstract String a();

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public abstract int e();

    @dzsi
    public abstract String f();

    @dzsi
    public abstract akqq g();

    public abstract boolean h();

    public abstract boolean i();

    @dzsi
    public abstract String j();

    public abstract boolean k();

    public abstract boolean l();

    @dzsi
    public abstract String m();

    public abstract boolean n();

    public abstract boolean o();

    @dzsi
    public abstract String p();

    public abstract dbsg<anef> q();

    public abstract ddho r();

    public abstract ddho s();

    public abstract ddho t();

    public abstract dcdc<anec> u();

    public abstract boolean v();

    public abstract dbsg<aned> w();

    public abstract dbsg<cjmu> x();

    public abstract aneb y();
}

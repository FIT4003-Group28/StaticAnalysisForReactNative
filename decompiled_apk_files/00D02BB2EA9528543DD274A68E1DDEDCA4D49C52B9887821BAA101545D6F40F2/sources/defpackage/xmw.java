package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: xmw  reason: default package */
/* loaded from: classes7.dex */
public abstract class xmw {
    public static xmw f(dphe dpheVar, dwae dwaeVar) {
        Integer U = vyb.U(dpheVar);
        xmv g = g();
        dvzn dvznVar = dwaeVar.b;
        if (dvznVar == null) {
            dvznVar = dvzn.e;
        }
        xms xmsVar = (xms) g;
        xmsVar.a = akrk.h(dvznVar);
        xmsVar.b = h(dwaeVar.c);
        if (U != null) {
            g.b(U.intValue());
        }
        return g.a();
    }

    public static xmv g() {
        xms xmsVar = new xms();
        xmsVar.b(-12417548);
        return xmsVar;
    }

    public static dcdc<drij> h(List<dpgw> list) {
        return dcdc.r(dchl.k(list, xmu.a));
    }

    public abstract int a();

    @dzsi
    public abstract akrk b();

    @dzsi
    public abstract dcdc<drij> c();

    @dzsi
    public abstract akrk d();

    @dzsi
    public abstract dcdc<drij> e();
}

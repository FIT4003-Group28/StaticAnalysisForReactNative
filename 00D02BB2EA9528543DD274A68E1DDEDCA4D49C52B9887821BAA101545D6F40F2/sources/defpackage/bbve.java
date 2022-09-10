package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bbve  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbve implements Serializable {
    public static bbuz m() {
        bbsu bbsuVar = new bbsu();
        bbsuVar.b(bbuy.SHOW_FULLY_EXPANDED_PLACESHEET);
        bbsuVar.g("");
        bbsuVar.i(dcdc.e());
        bbsuVar.j(dcdc.e());
        bbsuVar.c(true);
        bbsuVar.d(true);
        bbva c = bbvb.c();
        c.b(true);
        bbsuVar.f(c.a());
        return bbsuVar;
    }

    @dzsi
    public abstract bbvd a();

    public abstract bbvb b();

    public abstract bbuy c();

    public abstract dwyd d();

    public abstract String e();

    @dzsi
    public abstract ilo f();

    public abstract dcdc<bbtm> g();

    public abstract dcdc<bbtm> h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract dbsg<Integer> k();

    public abstract bbuz l();
}

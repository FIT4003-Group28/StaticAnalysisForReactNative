package defpackage;
/* compiled from: PG */
/* renamed from: btzv  reason: default package */
/* loaded from: classes4.dex */
public abstract class btzv {
    public static btzv y(btzu btzuVar) {
        return new btza(btzuVar.b, btzuVar.c, btzuVar.d, btzuVar.e, Long.valueOf(btzuVar.f.get()), Long.valueOf(btzuVar.g.get()), Long.valueOf(btzuVar.h.get()), Long.valueOf(btzuVar.i.get()), btzuVar.j, btzuVar.l);
    }

    @dzsi
    public abstract Long a();

    @dzsi
    public abstract Long b();

    @dzsi
    public abstract Long c();

    @dzsi
    public abstract Long d();

    @dzsi
    public abstract Long e();

    @dzsi
    public abstract Long f();

    @dzsi
    public abstract Long g();

    @dzsi
    public abstract Long h();

    @dzsi
    public abstract Long i();

    @dzsi
    public abstract Long j();

    @dzsi
    public abstract Long k();

    @dzsi
    public abstract Long l();

    @dzsi
    public abstract Long m();

    @dzsi
    public abstract Long n();

    @dzsi
    public abstract Long o();

    @dzsi
    public abstract Long p();

    @dzsi
    public abstract Long q();

    @dzsi
    public abstract Long r();

    @dzsi
    public abstract Long s();

    @dzsi
    public abstract Long t();

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("REQUIREMENT_START", a());
        b.b("REQUIREMENT_SATISFIED", b());
        b.b("NETWORK_STACK_READY_REQUIREMENT_START", c());
        b.b("NETWORK_STACK_READY_REQUIREMENT_SATISFIED", d());
        b.b("CONNECTIVITY_REQUIREMENT_START", e());
        b.b("CONNECTIVITY_REQUIREMENT_SATISFIED", f());
        b.b("ZWIEBACK_COOKIE_REQUIREMENT_START", g());
        b.b("ZWIEBACK_COOKIE_REQUIREMENT_SATISFIED", h());
        b.b("ZWIEBACK_COOKIE_PRESENT_REQUIREMENT_START", i());
        b.b("ZWIEBACK_COOKIE_PRESENT_REQUIREMENT_SATISFIED", j());
        b.b("AUTH_REQUIREMENT_START", k());
        b.b("AUTH_REQUIREMENT_SATISFIED", l());
        b.b("API_TOKEN_REQUIREMENT_START", m());
        b.b("API_TOKEN_REQUIREMENT_SATISFIED", n());
        b.b("NON_DEFAULT_CLIENTPARAMETERS_REQUIREMENT_START", o());
        b.b("NON_DEFAULT_CLIENTPARAMETERS_REQUIREMENT_SATISFIED", p());
        b.b("LOCATION_REQUIREMENT_START", q());
        b.b("LOCATION_REQUIREMENT_SATISFIED", r());
        b.b("FIRST_BYTE_WRITTEN_TO_WIRE", s());
        b.b("LAST_BYTE_WRITTEN_TO_WIRE", t());
        b.b("FIRST_BYTE_READ_FROM_WIRE", u());
        b.b("LAST_BYTE_READ_FROM_WIRE", v());
        return b.toString();
    }

    @dzsi
    public abstract Long u();

    @dzsi
    public abstract Long v();

    @dzsi
    public abstract Long w();

    public abstract int x();
}

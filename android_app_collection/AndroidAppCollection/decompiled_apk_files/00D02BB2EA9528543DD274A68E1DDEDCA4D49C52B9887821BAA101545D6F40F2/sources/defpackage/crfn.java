package defpackage;
/* compiled from: PG */
/* renamed from: crfn  reason: default package */
/* loaded from: classes5.dex */
public final class crfn {
    public arym a;
    public long b;
    @dzsi
    public amte c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    @dzsi
    public asbz j;
    @dzsi
    public dspd k;
    public boolean l;

    private crfn() {
        this.i = "";
        this.a = arym.GUIDED_NAV;
    }

    public static crfn a(amte amteVar) {
        crfn crfnVar = new crfn();
        crfnVar.a = arym.GUIDED_NAV;
        dbsk.t(amteVar, "directionsItem");
        crfnVar.c = amteVar;
        return crfnVar;
    }

    public static crfn b(asbz asbzVar) {
        crfn crfnVar = new crfn();
        crfnVar.a = arym.FREE_NAV;
        dbsk.t(asbzVar, "freeNavItem");
        crfnVar.j = asbzVar;
        return crfnVar;
    }

    public final crfo c() {
        return new crfo(this);
    }

    public crfn(crfo crfoVar) {
        this.i = "";
        this.a = crfoVar.a;
        this.b = crfoVar.b;
        this.c = crfoVar.c;
        this.d = crfoVar.d;
        this.e = crfoVar.e;
        this.f = crfoVar.f;
        this.g = crfoVar.g;
        this.h = crfoVar.h;
        this.i = crfoVar.i;
        this.j = crfoVar.j;
        this.k = crfoVar.k;
        this.l = crfoVar.l;
    }
}

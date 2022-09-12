package defpackage;
/* compiled from: PG */
/* renamed from: crqf  reason: default package */
/* loaded from: classes5.dex */
public class crqf extends crpx {
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final crqo m;

    public crqf(crqe crqeVar) {
        super(crqeVar);
        this.f = crqeVar.f;
        this.g = crqeVar.g;
        this.h = crqeVar.h;
        this.i = crqeVar.i;
        this.j = crqeVar.j;
        this.k = crqeVar.k;
        this.l = crqeVar.l;
        crqo crqoVar = crqeVar.m;
        dbsk.s(crqoVar);
        this.m = crqoVar;
    }

    public final boolean b() {
        return (!g().k || g().b == null) && this.g;
    }

    public final boolean c() {
        return !g().k && this.h && !this.g && g().b == null;
    }

    public final boolean d() {
        return g().e > 4900;
    }

    public final boolean e() {
        return this.m.a().ai() > 2;
    }

    public final amuh f() {
        return this.m.a;
    }

    public final cray g() {
        return this.m.b();
    }

    public final cray[] h() {
        return this.m.b;
    }

    @Override // defpackage.crpx
    public final String toString() {
        dbsb a = a();
        a.h("offlineRoutingFailed", this.f);
        a.h("rerouting", this.g);
        a.h("reroutesDisabled", this.h);
        a.h("newRouteRequested", this.i);
        a.h("nextDestinationReached", this.j);
        a.h("hideDestinationPins", this.k);
        a.h("waypointsChanged", this.l);
        a.b("navigationInternalState", this.m);
        a.b("currentNavGuidanceState", g());
        return a.toString();
    }
}

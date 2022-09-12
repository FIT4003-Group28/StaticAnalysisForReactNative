package defpackage;
/* compiled from: PG */
/* renamed from: crqo  reason: default package */
/* loaded from: classes5.dex */
public final class crqo {
    public final amuh a;
    public final cray[] b;
    public final int c;
    @dzsi
    public final dpio d;
    public final long e;

    public crqo(crqn crqnVar) {
        amuh amuhVar = crqnVar.a;
        dbsk.t(amuhVar, "routes");
        this.a = amuhVar;
        cray[] crayVarArr = (cray[]) dbsk.t(crqnVar.b, "navGuidanceStates");
        this.b = crayVarArr;
        int i = crqnVar.c;
        this.c = i;
        this.d = crqnVar.e;
        this.e = crqnVar.d;
        boolean z = true;
        dbsk.b(amuhVar.m() == crayVarArr.length, "routes size == route states size");
        dbsk.b(amuhVar.j(), "routes.hasSelected()");
        dbsk.b(amuhVar.k() == crayVarArr[amuhVar.b()].a, "selected route == guided route");
        dbsk.b(i >= crayVarArr.length ? false : z, "betterRouteIndex in bounds");
    }

    public final amub a() {
        return b().a;
    }

    public final cray b() {
        return this.b[this.a.b()];
    }

    @dzsi
    public final cray c() {
        int i = this.c;
        if (i < 0) {
            return null;
        }
        return this.b[i];
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("betterRouteIndex", this.c);
        b.b("betterRoutePromptDetails", this.d);
        b.g("nextGuidanceTime", this.e);
        return b.toString();
    }
}

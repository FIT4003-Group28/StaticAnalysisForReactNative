package defpackage;

import defpackage.azwm;
/* compiled from: PG */
/* renamed from: azwh  reason: default package */
/* loaded from: classes.dex */
public abstract class azwh<T extends azwm<T>> {
    public long c;
    public String d;
    protected final dolk e;
    public dojz f;
    @dzsi
    public String g;
    @dzsi
    public String h;
    @dzsi
    protected String i;

    public azwh(T t) {
        this.c = t.k;
        azwl azwlVar = t.j;
        dbsk.s(azwlVar);
        this.d = azwlVar.a;
        azwl azwlVar2 = t.j;
        dbsk.s(azwlVar2);
        this.g = azwlVar2.b;
        this.h = t.l;
        dolk r = t.r();
        dbsk.s(r);
        this.e = r;
        dojz s = t.s();
        dbsk.s(s);
        this.f = s;
        this.i = null;
    }

    public azwh(dolk dolkVar, dojz dojzVar) {
        this.c = 0L;
        this.d = "Auto-generate a ClientId, please!";
        this.g = "ServerIds do not apply to this corpus.";
        this.e = dolkVar;
        this.f = dojzVar;
    }

    public abstract T b();
}

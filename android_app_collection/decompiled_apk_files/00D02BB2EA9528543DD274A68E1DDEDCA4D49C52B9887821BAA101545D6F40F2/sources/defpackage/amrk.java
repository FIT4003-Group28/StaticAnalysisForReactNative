package defpackage;
/* compiled from: PG */
/* renamed from: amrk  reason: default package */
/* loaded from: classes2.dex */
public final class amrk {
    public amsb a;
    public final akra b;
    public boolean c;
    public dmlo d;
    public akzh e;
    public amrh f;
    public dcdc<dmlo> g;
    public alne h;

    public amrk(amsb amsbVar, akra akraVar, dmlo dmloVar, akzh akzhVar, amrh amrhVar, alne alneVar, dcdc dcdcVar) {
        akra akraVar2 = new akra();
        this.b = akraVar2;
        this.c = false;
        this.a = amsbVar;
        if (akraVar != null) {
            akraVar2.aa(akraVar);
            this.c = true;
        }
        this.d = dmloVar;
        this.e = akzhVar;
        this.f = amrhVar;
        this.h = alneVar;
        this.g = dcdcVar;
    }

    @dzsi
    public final akra a() {
        if (this.c) {
            return this.b;
        }
        return null;
    }
}

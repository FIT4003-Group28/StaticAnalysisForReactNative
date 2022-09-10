package defpackage;
/* compiled from: PG */
/* renamed from: aktb  reason: default package */
/* loaded from: classes.dex */
public final class aktb {
    public final akra a;
    public dmlo b;

    public aktb() {
        this.a = new akra();
        this.b = dmlo.BOTTOM_LEFT;
    }

    public final void a(aktb aktbVar) {
        this.a.aa(aktbVar.a);
        this.b = aktbVar.b;
    }

    public final void b(akra akraVar) {
        this.a.aa(akraVar);
    }

    public aktb(akra akraVar, dmlo dmloVar) {
        akra akraVar2 = new akra();
        this.a = akraVar2;
        this.b = dmlo.BOTTOM_LEFT;
        akraVar2.aa(akraVar);
        this.b = dmloVar;
    }
}

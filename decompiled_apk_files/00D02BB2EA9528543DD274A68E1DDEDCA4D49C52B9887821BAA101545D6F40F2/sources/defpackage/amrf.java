package defpackage;
/* compiled from: PG */
/* renamed from: amrf  reason: default package */
/* loaded from: classes2.dex */
final class amrf {
    public final amrl a;
    public final amsb b;
    public final int c;
    public final akra d;
    public boolean e;
    public dmlo f;
    public final dcdc<dmlo> g;
    public boolean h;
    @dzsi
    public final amra i;

    public amrf(amrl amrlVar, amsb amsbVar, int i, @dzsi akra akraVar, dmlo dmloVar, dcdc<dmlo> dcdcVar, @dzsi amra amraVar) {
        akra akraVar2 = new akra();
        this.d = akraVar2;
        this.e = false;
        this.a = amrlVar;
        this.b = amsbVar;
        this.c = i;
        this.i = amraVar;
        if (akraVar != null) {
            akraVar2.aa(akraVar);
            this.e = true;
        }
        this.f = dmloVar;
        this.g = dcdcVar;
        this.h = false;
    }
}

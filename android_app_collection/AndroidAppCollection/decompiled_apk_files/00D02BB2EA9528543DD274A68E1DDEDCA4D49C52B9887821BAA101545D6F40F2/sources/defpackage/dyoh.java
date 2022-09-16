package defpackage;
/* compiled from: PG */
/* renamed from: dyoh  reason: default package */
/* loaded from: classes6.dex */
public final class dyoh extends dysw {
    private boolean b;
    private final dyjb c;
    private final dylt d;

    public dyoh(dyjb dyjbVar) {
        this(dyjbVar, dylt.PROCESSED);
    }

    @Override // defpackage.dysw, defpackage.dyls
    public final void a(dylu dyluVar) {
        dbsk.m(!this.b, "already started");
        this.b = true;
        dyluVar.e(this.c, this.d, new dyhw());
    }

    @Override // defpackage.dysw, defpackage.dyls
    public final void l(dypf dypfVar) {
        dypfVar.b("error", this.c);
        dypfVar.b("progress", this.d);
    }

    public dyoh(dyjb dyjbVar, dylt dyltVar) {
        dbsk.b(!dyjbVar.i(), "error must not be OK");
        this.c = dyjbVar;
        this.d = dyltVar;
    }
}

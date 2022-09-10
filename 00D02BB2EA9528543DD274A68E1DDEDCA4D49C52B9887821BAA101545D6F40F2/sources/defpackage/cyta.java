package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyta  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyta {
    private final cyvd<czcl, czfo> a;

    public cyta(cytb cytbVar, cytq cytqVar, cywa cywaVar, cyem<cyto> cyemVar) {
        dbsk.s(cytqVar);
        dbsk.s(cywaVar);
        this.a = new cyty(cytbVar, cytqVar, cywaVar, dyaq.b() ? cytqVar.b(cyemVar) : true, cyemVar);
    }

    public void a(czfo czfoVar) {
        this.a.c(czfoVar);
    }

    public abstract void b(cyzo cyzoVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(czcl czclVar) {
        this.a.b(czclVar);
    }
}

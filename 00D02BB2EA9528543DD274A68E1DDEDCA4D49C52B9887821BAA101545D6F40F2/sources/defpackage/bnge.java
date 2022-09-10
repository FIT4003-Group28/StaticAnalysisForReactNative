package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnge  reason: default package */
/* loaded from: classes3.dex */
public final class bnge<V> implements crzp<btlu> {
    final /* synthetic */ bngi a;
    final /* synthetic */ cdjd b;

    public bnge(bngi bngiVar, cdjd cdjdVar) {
        this.a = bngiVar;
        this.b = cdjdVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        dzvx.c(crzmVar, "stateProvider");
        String b = bneh.b(bneh.a(this.b));
        if (b == null) {
            b = "";
        }
        btlu l = crzmVar.l();
        this.a.a = bnfv.b(new bngd(this, dzvx.d(b, l != null ? l.j() : null)));
    }
}

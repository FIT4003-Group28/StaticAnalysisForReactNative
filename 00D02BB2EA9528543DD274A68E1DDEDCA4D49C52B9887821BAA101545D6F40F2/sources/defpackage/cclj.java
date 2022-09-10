package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cclj  reason: default package */
/* loaded from: classes4.dex */
public final class cclj implements ccsf {
    @dzsi
    public ccwy a;
    final /* synthetic */ cclk b;

    public cclj(cclk cclkVar) {
        this.b = cclkVar;
    }

    @Override // defpackage.ccsf
    public final boolean a() {
        return this.b.aD;
    }

    @Override // defpackage.ccsf
    public final void b() {
        ccwy ccwyVar = this.a;
        if (ccwyVar != null) {
            this.b.i(ccwyVar);
            this.a = null;
            return;
        }
        bvoo.h("Contribution flow finishing without contribution.", new Object[0]);
    }
}

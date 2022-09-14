package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyrd  reason: default package */
/* loaded from: classes6.dex */
public final class dyrd extends dygx {
    dykv a;
    final /* synthetic */ dyrz b;

    public dyrd(dyrz dyrzVar) {
        this.b = dyrzVar;
    }

    @Override // defpackage.dygx
    public final void a(dyfk dyfkVar, dyhd dyhdVar) {
        dbsk.t(dyfkVar, "newState");
        this.b.u("updateBalancingState()");
        this.b.m.execute(new dyrc(this, dyhdVar, dyfkVar));
    }

    @Override // defpackage.dygx
    public final dyev b() {
        return this.b.G;
    }
}

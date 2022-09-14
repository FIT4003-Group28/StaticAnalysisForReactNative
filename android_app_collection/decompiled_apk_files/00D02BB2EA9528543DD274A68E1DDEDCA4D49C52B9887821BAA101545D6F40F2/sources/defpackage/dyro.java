package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyro  reason: default package */
/* loaded from: classes6.dex */
public final class dyro<ReqT, RespT> extends dymv<ReqT, RespT> {
    final dyfo c;
    final dyib<ReqT, RespT> d;
    final dyet e;
    final /* synthetic */ dyrp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyro(dyrp dyrpVar, dyfo dyfoVar, dyib<ReqT, RespT> dyibVar, dyet dyetVar) {
        super(dyrpVar.b.s(dyetVar), dyrpVar.b.j, dyetVar.b);
        this.f = dyrpVar;
        this.c = dyfoVar;
        this.d = dyibVar;
        this.e = dyetVar;
    }

    @Override // defpackage.dymv
    protected final void g() {
        this.f.b.m.execute(new dyrn(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.f.b.s(this.e).execute(new dyrm(this));
    }
}

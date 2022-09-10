package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyez  reason: default package */
/* loaded from: classes6.dex */
public final class dyez extends dyeu {
    private final dyeu a;
    private final dyey b;

    public dyez(dyeu dyeuVar, dyey dyeyVar) {
        this.a = dyeuVar;
        dbsk.t(dyeyVar, "interceptor");
        this.b = dyeyVar;
    }

    @Override // defpackage.dyeu
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar) {
        return this.b.a(dyibVar, dyetVar, this.a);
    }

    @Override // defpackage.dyeu
    public final String b() {
        return this.a.b();
    }
}

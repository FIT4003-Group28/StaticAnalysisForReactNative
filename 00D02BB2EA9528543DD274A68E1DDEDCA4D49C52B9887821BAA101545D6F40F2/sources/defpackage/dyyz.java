package defpackage;
/* compiled from: PG */
/* renamed from: dyyz  reason: default package */
/* loaded from: classes6.dex */
final class dyyz<RespT> extends dees<RespT> {
    public final dyex<?, RespT> a;

    public dyyz(dyex<?, RespT> dyexVar) {
        this.a = dyexVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dees
    public final String OP() {
        dbsb b = dbsc.b(this);
        b.b("clientCall", this.a);
        return b.toString();
    }

    @Override // defpackage.dees
    protected final void e() {
        this.a.d("GrpcFuture was cancelled", null);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cqgz  reason: default package */
/* loaded from: classes5.dex */
final class cqgz extends cqhb {
    final /* synthetic */ cqlc a;
    final /* synthetic */ cqnf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqgz(cqhb cqhbVar, cqlc cqlcVar, cqnf cqnfVar) {
        super(cqhbVar);
        this.a = cqlcVar;
        this.b = cqnfVar;
    }

    @Override // defpackage.cqhb
    public final <V extends cqkp> cqnf<V> a(cqnf<V> cqnfVar) {
        return cqjv.l(this.a, this.b, cqnfVar);
    }
}

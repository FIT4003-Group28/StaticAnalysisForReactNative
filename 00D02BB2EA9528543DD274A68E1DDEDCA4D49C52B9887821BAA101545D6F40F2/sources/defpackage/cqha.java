package defpackage;
/* compiled from: PG */
/* renamed from: cqha  reason: default package */
/* loaded from: classes5.dex */
final class cqha extends cqhb {
    final /* synthetic */ cqjb a;
    final /* synthetic */ cqnf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqha(cqhb cqhbVar, cqjb cqjbVar, cqnf cqnfVar) {
        super(cqhbVar);
        this.a = cqjbVar;
        this.b = cqnfVar;
    }

    @Override // defpackage.cqhb
    public final <V extends cqkp> cqnf<V> a(cqnf<V> cqnfVar) {
        return cqjv.o(this.a, this.b, cqnfVar);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cqgy  reason: default package */
/* loaded from: classes5.dex */
final class cqgy extends cqhb {
    final /* synthetic */ Boolean a;
    final /* synthetic */ cqnf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqgy(cqhb cqhbVar, Boolean bool, cqnf cqnfVar) {
        super(cqhbVar);
        this.a = bool;
        this.b = cqnfVar;
    }

    @Override // defpackage.cqhb
    public final <V extends cqkp> cqnf<V> a(cqnf<V> cqnfVar) {
        return cqjv.k(this.a, this.b, cqnfVar);
    }
}

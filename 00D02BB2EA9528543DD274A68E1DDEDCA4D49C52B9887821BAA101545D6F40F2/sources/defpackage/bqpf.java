package defpackage;
/* renamed from: bqpf  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bqpf implements cqlc {
    static final cqlc a = new bqpf();

    private bqpf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bqtb bqtbVar = (bqtb) cqkpVar;
        cqtv cqtvVar = bqre.a;
        boolean z = false;
        if (bqtbVar.T().booleanValue() && !bqtbVar.M().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

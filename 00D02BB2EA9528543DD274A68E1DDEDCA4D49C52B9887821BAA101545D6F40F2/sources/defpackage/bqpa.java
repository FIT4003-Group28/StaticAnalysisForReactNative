package defpackage;
/* renamed from: bqpa  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bqpa implements cqlc {
    static final cqlc a = new bqpa();

    private bqpa() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = bqpb.a;
        boolean z = true;
        if (((bqsz) cqkpVar).n().intValue() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

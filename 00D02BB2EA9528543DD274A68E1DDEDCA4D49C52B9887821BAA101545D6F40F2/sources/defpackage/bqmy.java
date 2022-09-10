package defpackage;
/* renamed from: bqmy  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bqmy implements cqlc {
    static final cqlc a = new bqmy();

    private bqmy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bqss bqssVar = (bqss) cqkpVar;
        int i = bqmz.a;
        boolean z = false;
        if (bqssVar.d().booleanValue() && !bqssVar.c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

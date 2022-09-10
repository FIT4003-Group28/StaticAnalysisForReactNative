package defpackage;
/* renamed from: bocv  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bocv implements cqlc {
    static final cqlc a = new bocv();

    private bocv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        boqj boqjVar = (boqj) cqkpVar;
        int i = bodo.c;
        boolean z = true;
        if (!boqjVar.s().booleanValue() && !boqjVar.t().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

package defpackage;
/* renamed from: bocu  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bocu implements cqlc {
    static final cqlc a = new bocu();

    private bocu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        boqj boqjVar = (boqj) cqkpVar;
        int i = bodo.c;
        boolean z = true;
        if (!boqjVar.m().booleanValue() && !boqjVar.l().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

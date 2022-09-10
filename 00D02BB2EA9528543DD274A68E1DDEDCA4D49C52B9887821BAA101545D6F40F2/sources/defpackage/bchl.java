package defpackage;
/* renamed from: bchl  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bchl implements cqlc {
    static final cqlc a = new bchl();

    private bchl() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bcmf bcmfVar = (bcmf) cqkpVar;
        int i = bcib.a;
        boolean z = false;
        if (bcmfVar.i().booleanValue() && !cqjv.v(bcmfVar.j()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

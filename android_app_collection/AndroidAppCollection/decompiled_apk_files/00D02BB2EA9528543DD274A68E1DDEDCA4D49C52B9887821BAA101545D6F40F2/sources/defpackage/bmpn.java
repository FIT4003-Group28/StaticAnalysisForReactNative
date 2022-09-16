package defpackage;
/* renamed from: bmpn  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmpn implements cqlc {
    static final cqlc a = new bmpn();

    private bmpn() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        if (bmtvVar.D().booleanValue() || bmtvVar.z().booleanValue() || bmtvVar.C().booleanValue() || bmtvVar.E().booleanValue() || bmtvVar.F().booleanValue()) {
            return null;
        }
        return bmtvVar.V().b().booleanValue() ? dtxy.hp : dtxy.mO;
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

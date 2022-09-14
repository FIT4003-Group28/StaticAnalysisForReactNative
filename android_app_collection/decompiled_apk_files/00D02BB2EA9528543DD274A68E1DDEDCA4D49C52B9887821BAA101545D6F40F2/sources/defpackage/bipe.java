package defpackage;
/* renamed from: bipe  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bipe implements cqlc {
    static final cqlc a = new bipe();

    private bipe() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwl biwlVar = (biwl) cqkpVar;
        int i = bipn.a;
        boolean z = false;
        if (cqjv.v(biwlVar.c()).booleanValue() && !biwlVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

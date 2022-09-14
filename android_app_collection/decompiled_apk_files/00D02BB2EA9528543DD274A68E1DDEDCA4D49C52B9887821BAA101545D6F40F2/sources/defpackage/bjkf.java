package defpackage;
/* renamed from: bjkf  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bjkf implements cqlc {
    static final cqlc a = new bjkf();

    private bjkf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bjkk bjkkVar = (bjkk) cqkpVar;
        int i = bjkj.a;
        boolean z = true;
        if (!bjkkVar.g().booleanValue() && !cqjv.v(bjkkVar.e()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

package defpackage;
/* renamed from: ukf  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ukf implements cqlc {
    static final cqlc a = new ukf();

    private ukf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i;
        umd umdVar = (umd) cqkpVar;
        if (umdVar.b().booleanValue()) {
            i = 80;
        } else {
            i = umdVar.a().booleanValue() ? 48 : 16;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

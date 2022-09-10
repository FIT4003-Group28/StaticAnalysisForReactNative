package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ymv  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class ymv implements dbsl {
    static final dbsl a = new ymv();

    private ymv() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        douu douuVar = (douu) obj;
        dcdc<drsm> dcdcVar = ynf.a;
        if (douuVar != null) {
            dqtz dqtzVar = dqtz.IC_FARE;
            dqtz b = dqtz.b(douuVar.a);
            if (b == null) {
                b = dqtz.UNKNOWN_FARE;
            }
            return dqtzVar.equals(b);
        }
        return false;
    }
}

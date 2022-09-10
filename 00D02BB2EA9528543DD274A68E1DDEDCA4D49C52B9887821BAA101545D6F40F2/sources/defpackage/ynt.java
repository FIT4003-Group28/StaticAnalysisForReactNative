package defpackage;
/* renamed from: ynt  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ynt implements dbsl {
    static final dbsl a = new ynt();

    private ynt() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        douu douuVar = (douu) obj;
        int i = ynz.a;
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

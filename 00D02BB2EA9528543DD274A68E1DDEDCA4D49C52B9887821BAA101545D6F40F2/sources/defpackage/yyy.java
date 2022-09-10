package defpackage;
/* renamed from: yyy  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class yyy implements dbsl {
    static final dbsl a = new yyy();

    private yyy() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dpgn dpgnVar = (dpgn) obj;
        if (dpgnVar != null) {
            dqtz b = dqtz.b(dpgnVar.b);
            if (b == null) {
                b = dqtz.UNKNOWN_FARE;
            }
            return b == dqtz.IC_FARE;
        }
        return false;
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yne  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class yne implements dbsl {
    static final dbsl a = new yne();

    private yne() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dcdc<drsm> dcdcVar = ynf.a;
        drsm b = drsm.b(((douw) obj).a);
        if (b == null) {
            b = drsm.UNSPECIFIED_NON_TRANSIT_MODE;
        }
        return dcdcVar.contains(b);
    }
}

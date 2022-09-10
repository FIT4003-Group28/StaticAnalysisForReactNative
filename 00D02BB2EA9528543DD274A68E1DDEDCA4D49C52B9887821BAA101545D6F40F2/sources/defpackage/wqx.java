package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wqx  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class wqx implements dbsl {
    static final dbsl a = new wqx();

    private wqx() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dozz dozzVar = (dozz) obj;
        if (dozzVar != null) {
            doza b = doza.b(dozzVar.e);
            if (b == null) {
                b = doza.INFORMATION;
            }
            return alca.y(b, doza.INFORMATION);
        }
        return false;
    }
}

package defpackage;
/* renamed from: bmbk  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bmbk implements dbsl {
    static final dbsl a = new bmbk();

    private bmbk() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dglo dgloVar = (dglo) obj;
        if (dgloVar != null) {
            dglu dgluVar = dgloVar.d;
            if (dgluVar == null) {
                dgluVar = dglu.e;
            }
            return dgluVar.b == 3;
        }
        return false;
    }
}

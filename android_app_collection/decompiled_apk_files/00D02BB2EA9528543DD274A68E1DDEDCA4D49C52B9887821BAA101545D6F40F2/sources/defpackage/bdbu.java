package defpackage;
/* renamed from: bdbu  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdbu implements dbsl {
    static final dbsl a = new bdbu();

    private bdbu() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dwfa dwfaVar = (dwfa) obj;
        if ((dwfaVar.a & 1) != 0) {
            drah drahVar = dwfaVar.b;
            if (drahVar == null) {
                drahVar = drah.c;
            }
            return !dbsj.d(drahVar.b);
        }
        return false;
    }
}

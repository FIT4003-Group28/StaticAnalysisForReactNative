package defpackage;
/* renamed from: vso  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class vso implements dbsl {
    static final dbsl a = new vso();

    private vso() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dozs dozsVar;
        dozz dozzVar = (dozz) obj;
        if (dozzVar != null) {
            if (dozzVar.b == 22) {
                dozsVar = (dozs) dozzVar.c;
            } else {
                dozsVar = dozs.q;
            }
            dozr dozrVar = dozsVar.l;
            if (dozrVar == null) {
                dozrVar = dozr.e;
            }
            return dozrVar.b == 1;
        }
        return false;
    }
}

package defpackage;
/* renamed from: bddm  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bddm implements dbsl {
    static final dbsl a = new bddm();

    private bddm() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dwfa dwfaVar = (dwfa) obj;
        if ((dwfaVar.a & 1) != 0) {
            drah drahVar = dwfaVar.b;
            if (drahVar == null) {
                drahVar = drah.c;
            }
            return !drahVar.b.isEmpty();
        }
        return false;
    }
}

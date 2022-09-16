package defpackage;
/* renamed from: cyml  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyml implements dbsl {
    static final dbsl a = new cyml();

    private cyml() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        cykj cykjVar = (cykj) obj;
        int b = cykk.b(cykjVar.a);
        if (b != 0 && b == 3) {
            return true;
        }
        int b2 = cykk.b(cykjVar.a);
        return b2 != 0 && b2 == 5;
    }
}

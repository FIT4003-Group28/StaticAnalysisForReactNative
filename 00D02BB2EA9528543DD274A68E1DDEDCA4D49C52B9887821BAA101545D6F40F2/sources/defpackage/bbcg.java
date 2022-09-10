package defpackage;
/* renamed from: bbcg  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbcg implements dbsl {
    static final dbsl a = new bbcg();

    private bbcg() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        bayj bayjVar = (bayj) obj;
        return bayjVar.s() == baab.CUSTOM && !bayjVar.n().booleanValue() && !bayjVar.o().booleanValue();
    }
}

package defpackage;
/* renamed from: sqm  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class sqm implements dbsl {
    static final dbsl a = new sqm();

    private sqm() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dcep<dqek> dcepVar = sqn.a;
        dnue dnueVar = ((dnui) obj).f;
        if (dnueVar == null) {
            dnueVar = dnue.b;
        }
        dqek b = dqek.b(dnueVar.a);
        if (b == null) {
            b = dqek.UNKNOWN_PREDICTION_JUSTIFICATION_TYPE;
        }
        return b == dqek.LOCATION_HISTORY;
    }
}

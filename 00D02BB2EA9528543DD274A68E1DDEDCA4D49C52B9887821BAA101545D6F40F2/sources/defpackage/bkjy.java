package defpackage;
/* renamed from: bkjy  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkjy implements dbsl {
    static final dbsl a = new bkjy();

    private bkjy() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        drci drciVar = drci.USER_QUOTE_JUSTIFICATION_TYPE;
        drci b = drci.b(((dvwp) obj).f);
        if (b == null) {
            b = drci.UNKNOWN_PLACE_ANNOTATION_JUSTIFICATION_TYPE;
        }
        return drciVar.equals(b);
    }
}

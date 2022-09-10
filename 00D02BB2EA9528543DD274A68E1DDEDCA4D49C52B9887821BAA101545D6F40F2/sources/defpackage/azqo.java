package defpackage;
/* renamed from: azqo  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class azqo implements dbsl {
    static final dbsl a = new azqo();

    private azqo() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        donb b = donb.b(((dond) obj).b);
        if (b == null) {
            b = donb.UNKNOWN_PROVENANCE;
        }
        return b == donb.INFERRED;
    }
}

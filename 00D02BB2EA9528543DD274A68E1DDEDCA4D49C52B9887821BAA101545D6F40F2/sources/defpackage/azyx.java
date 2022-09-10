package defpackage;
/* renamed from: azyx  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class azyx implements dbsl {
    static final dbsl a = new azyx();

    private azyx() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        donb b = donb.b(((dond) obj).b);
        if (b == null) {
            b = donb.UNKNOWN_PROVENANCE;
        }
        return b != donb.EXPLICIT;
    }
}

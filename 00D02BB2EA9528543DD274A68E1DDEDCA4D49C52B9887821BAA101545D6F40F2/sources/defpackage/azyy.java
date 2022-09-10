package defpackage;
/* renamed from: azyy  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class azyy implements dbsl {
    static final dbsl a = new azyy();

    private azyy() {
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

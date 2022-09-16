package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: azyn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class azyn implements dbsl {
    static final dbsl a = new azyn();

    private azyn() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        int i = azzh.a;
        donb b = donb.b(((dond) obj).b);
        if (b == null) {
            b = donb.UNKNOWN_PROVENANCE;
        }
        return b != donb.UNKNOWN_PROVENANCE;
    }
}

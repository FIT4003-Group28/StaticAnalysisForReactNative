package defpackage;
/* compiled from: PG */
/* renamed from: cryi  reason: default package */
/* loaded from: classes5.dex */
public final class cryi<T> extends cryp<T> {
    public dbsg<Long> a = dbpy.a;
    private dcdc<T> b;

    @Override // defpackage.cryp
    public final void b(dcdc<T> dcdcVar) {
        if (dcdcVar != null) {
            this.b = dcdcVar;
            return;
        }
        throw new NullPointerException("Null suggestionsSourceData");
    }

    @Override // defpackage.cryp
    public final cryq<T> a() {
        String str = this.b == null ? " suggestionsSourceData" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cryj(this.b, this.a);
    }
}

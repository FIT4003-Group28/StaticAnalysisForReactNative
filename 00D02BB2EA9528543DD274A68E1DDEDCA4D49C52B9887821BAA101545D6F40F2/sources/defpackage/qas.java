package defpackage;
/* compiled from: PG */
/* renamed from: qas  reason: default package */
/* loaded from: classes7.dex */
public final class qas extends qdb {
    public dpce a;
    public String b;
    public String c;
    public eapd d;
    public String e;
    private String f;

    @Override // defpackage.qdb
    public final void b(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null lineFeatureId");
    }

    @Override // defpackage.qdb
    public final qdc a() {
        String str = this.f == null ? " lineFeatureId" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new qat(this.a, this.f, this.b, this.c, this.d, this.e);
    }
}

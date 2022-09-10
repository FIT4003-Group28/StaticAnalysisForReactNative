package defpackage;
/* compiled from: PG */
/* renamed from: bbsw  reason: default package */
/* loaded from: classes3.dex */
public final class bbsw extends bbva {
    public dbsg<String> a = dbpy.a;
    private Boolean b;

    @Override // defpackage.bbva
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.bbva
    public final bbvb a() {
        String str = this.b == null ? " shouldShowPostingPubliclyDisclaimer" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new bbsx(this.a, this.b.booleanValue());
    }
}

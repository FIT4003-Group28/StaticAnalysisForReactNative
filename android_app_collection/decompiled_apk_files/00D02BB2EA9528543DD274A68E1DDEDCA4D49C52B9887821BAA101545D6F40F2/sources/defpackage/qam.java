package defpackage;
/* compiled from: PG */
/* renamed from: qam  reason: default package */
/* loaded from: classes7.dex */
final class qam extends qcp {
    private Boolean a;

    @Override // defpackage.qcp
    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.qcp
    public final qcq a() {
        String str = this.a == null ? " skipAnimation" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new qan(this.a.booleanValue());
    }
}

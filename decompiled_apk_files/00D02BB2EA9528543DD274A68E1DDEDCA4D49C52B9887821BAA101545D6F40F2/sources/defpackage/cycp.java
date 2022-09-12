package defpackage;
/* compiled from: PG */
/* renamed from: cycp  reason: default package */
/* loaded from: classes5.dex */
final class cycp extends cydv {
    private Boolean a;

    @Override // defpackage.cydv
    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.cydv
    public final cydw a() {
        String str = this.a == null ? " onlyRefreshIfNeeded" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cycq(this.a.booleanValue());
    }
}

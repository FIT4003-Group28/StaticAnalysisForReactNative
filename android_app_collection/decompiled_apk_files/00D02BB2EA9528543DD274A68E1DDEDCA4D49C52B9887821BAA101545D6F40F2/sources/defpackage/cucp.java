package defpackage;
/* compiled from: PG */
/* renamed from: cucp  reason: default package */
/* loaded from: classes5.dex */
final class cucp extends cuex {
    private Boolean a;

    @Override // defpackage.cuex
    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.cuex
    public final cuey a() {
        String str = this.a == null ? " blocked" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cucq(this.a.booleanValue());
    }
}

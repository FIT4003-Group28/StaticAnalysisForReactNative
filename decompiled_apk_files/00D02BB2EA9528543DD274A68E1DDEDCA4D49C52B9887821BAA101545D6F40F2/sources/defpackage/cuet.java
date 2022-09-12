package defpackage;
/* compiled from: PG */
/* renamed from: cuet  reason: default package */
/* loaded from: classes5.dex */
final class cuet extends cuig {
    private Boolean a;

    @Override // defpackage.cuig
    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.cuig
    public final cuih a() {
        String str = this.a == null ? " readReceiptOptIn" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cueu(this.a.booleanValue());
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bvgu  reason: default package */
/* loaded from: classes4.dex */
final class bvgu extends bvhn {
    private cqtc a;
    private Boolean b;

    @Override // defpackage.bvhn
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.bvhn
    public final void c(cqtc cqtcVar) {
        if (cqtcVar != null) {
            this.a = cqtcVar;
            return;
        }
        throw new NullPointerException("Null layoutHeightDimension");
    }

    @Override // defpackage.bvhn
    public final bvho a() {
        String str = this.a == null ? " layoutHeightDimension" : "";
        if (this.b == null) {
            str = str.concat(" fillParentHeight");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bvgv(this.a, this.b.booleanValue());
    }
}

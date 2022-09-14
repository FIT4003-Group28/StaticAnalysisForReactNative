package defpackage;
/* compiled from: PG */
/* renamed from: awvr  reason: default package */
/* loaded from: classes.dex */
final class awvr extends awwo {
    private Boolean a;
    private Boolean b;

    @Override // defpackage.awwo
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.awwo
    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.awwo
    public final awwp a() {
        String str = this.a == null ? " forceDestructiveUpdate" : "";
        if (this.b == null) {
            str = str.concat(" contextChange");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new awvs(this.a.booleanValue(), this.b.booleanValue());
    }
}

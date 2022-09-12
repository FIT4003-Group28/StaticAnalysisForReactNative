package defpackage;
/* compiled from: PG */
/* renamed from: lyv  reason: default package */
/* loaded from: classes7.dex */
final class lyv extends lyx {
    public lzc a;
    private Boolean b;

    @Override // defpackage.lyx
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.lyx
    public final lyy a() {
        String str = this.a == null ? " entryPoint" : "";
        if (this.b == null) {
            str = str.concat(" shouldSuppressBatteryAlertsOnNavigationStart");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new lyw(this.a, this.b.booleanValue());
    }
}

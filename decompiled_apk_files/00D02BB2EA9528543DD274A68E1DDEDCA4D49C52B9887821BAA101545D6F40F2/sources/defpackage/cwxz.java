package defpackage;
/* compiled from: PG */
/* renamed from: cwxz  reason: default package */
/* loaded from: classes5.dex */
final class cwxz extends cwyn {
    public Integer a;
    public int b;

    @Override // defpackage.cwyn
    public final void b(int i) {
        this.b = i;
    }

    @Override // defpackage.cwyn
    public final cwyo a() {
        String str = this.b == 0 ? " enablement" : "";
        if (this.a == null) {
            str = str.concat(" rateLimitPerSecond");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwya(this.b, this.a.intValue());
    }
}

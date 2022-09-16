package defpackage;
/* compiled from: PG */
/* renamed from: cwuy  reason: default package */
/* loaded from: classes5.dex */
final class cwuy extends cwve {
    public int a;
    public cwvd b;

    @Override // defpackage.cwve
    public final void b(int i) {
        this.a = i;
    }

    @Override // defpackage.cwve
    public final cwvf a() {
        String str = this.a == 0 ? " enablement" : "";
        if (this.b == null) {
            str = str.concat(" metricExtensionProvider");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwuz(this.a, this.b);
    }
}

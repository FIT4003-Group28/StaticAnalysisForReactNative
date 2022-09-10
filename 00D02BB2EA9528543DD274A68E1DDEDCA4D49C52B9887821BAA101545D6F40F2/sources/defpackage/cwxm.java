package defpackage;
/* compiled from: PG */
/* renamed from: cwxm  reason: default package */
/* loaded from: classes5.dex */
final class cwxm extends cwxo {
    public Float a;
    public int b;

    @Override // defpackage.cwxo
    public final void b(int i) {
        this.b = i;
    }

    @Override // defpackage.cwxo
    public final cwxp a() {
        String str = this.b == 0 ? " enablement" : "";
        if (this.a == null) {
            str = str.concat(" startupSamplePercentage");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwxn(this.b, this.a.floatValue());
    }
}

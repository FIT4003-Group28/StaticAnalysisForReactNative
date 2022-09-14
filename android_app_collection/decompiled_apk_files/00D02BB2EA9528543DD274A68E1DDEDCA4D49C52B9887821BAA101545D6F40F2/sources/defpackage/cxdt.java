package defpackage;
/* compiled from: PG */
/* renamed from: cxdt  reason: default package */
/* loaded from: classes5.dex */
final class cxdt extends cxee {
    public Float a;
    public int b;

    @Override // defpackage.cxee
    public final void b(int i) {
        this.b = i;
    }

    @Override // defpackage.cxee
    public final cxef a() {
        String str = this.b == 0 ? " enablement" : "";
        if (this.a == null) {
            str = str.concat(" samplingProbability");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cxdu(this.b, this.a.floatValue());
    }
}

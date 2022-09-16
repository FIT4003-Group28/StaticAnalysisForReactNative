package defpackage;
/* compiled from: PG */
/* renamed from: cuer  reason: default package */
/* loaded from: classes5.dex */
final class cuer extends cuid {
    private String a;
    private Integer b;

    @Override // defpackage.cuid
    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null pattern");
    }

    @Override // defpackage.cuid
    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cuid
    public final cuie a() {
        String str = this.a == null ? " pattern" : "";
        if (this.b == null) {
            str = str.concat(" substitute");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cues(this.a, this.b.intValue());
    }
}

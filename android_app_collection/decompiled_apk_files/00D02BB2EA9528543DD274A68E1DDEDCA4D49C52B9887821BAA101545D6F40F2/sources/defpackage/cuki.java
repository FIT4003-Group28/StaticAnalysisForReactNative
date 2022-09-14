package defpackage;
/* compiled from: PG */
/* renamed from: cuki  reason: default package */
/* loaded from: classes5.dex */
final class cuki extends cukm {
    private String a;
    private Integer b;

    @Override // defpackage.cukm
    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null resourceId");
    }

    @Override // defpackage.cukm
    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cukm
    public final cukn a() {
        String str = this.a == null ? " resourceId" : "";
        if (this.b == null) {
            str = str.concat(" resourceRegion");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cukj(this.a, this.b.intValue());
    }
}

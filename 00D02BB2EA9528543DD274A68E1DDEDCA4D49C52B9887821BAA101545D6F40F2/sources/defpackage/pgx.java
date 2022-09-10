package defpackage;
/* compiled from: PG */
/* renamed from: pgx  reason: default package */
/* loaded from: classes7.dex */
public final class pgx<V> extends pgz<V> {
    public pim<V> a;
    public phu<V> b;
    public Class<V> c;
    private Boolean d;

    @Override // defpackage.pgz
    public final void b() {
        this.d = true;
    }

    @Override // defpackage.pgz
    public final pha<V> a() {
        String str = this.c == null ? " valueType" : "";
        if (this.d == null) {
            str = str.concat(" waaConsentRequired");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new pgy(this.a, this.b, this.c, this.d.booleanValue());
    }
}

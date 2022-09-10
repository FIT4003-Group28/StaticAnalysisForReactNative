package defpackage;
/* compiled from: PG */
/* renamed from: ctpt  reason: default package */
/* loaded from: classes5.dex */
public final class ctpt extends ctqv {
    public ctqx a;
    private String b;

    @Override // defpackage.ctqv
    public final void b(ctqx ctqxVar) {
        this.a = ctqxVar;
    }

    @Override // defpackage.ctqv
    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null pushId");
    }

    @Override // defpackage.ctqv
    public final ctqy a() {
        String str = this.b == null ? " pushId" : "";
        if (this.a == null) {
            str = str.concat(" oneOfType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctpu(this.b, this.a);
    }
}

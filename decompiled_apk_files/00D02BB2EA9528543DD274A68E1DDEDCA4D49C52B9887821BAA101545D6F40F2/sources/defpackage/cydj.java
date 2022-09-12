package defpackage;
/* compiled from: PG */
/* renamed from: cydj  reason: default package */
/* loaded from: classes5.dex */
final class cydj extends cyge {
    private String a;
    private cygf b;

    @Override // defpackage.cyge
    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.cyge
    public final void c(cygf cygfVar) {
        if (cygfVar != null) {
            this.b = cygfVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.cyge
    public final cygg a() {
        String str = this.a == null ? " id" : "";
        if (this.b == null) {
            str = str.concat(" type");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cydk(this.a, this.b);
    }
}

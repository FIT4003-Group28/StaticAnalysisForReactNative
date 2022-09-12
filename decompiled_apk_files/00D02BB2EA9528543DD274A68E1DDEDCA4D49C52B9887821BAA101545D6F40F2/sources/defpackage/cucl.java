package defpackage;
/* compiled from: PG */
/* renamed from: cucl  reason: default package */
/* loaded from: classes5.dex */
final class cucl extends ctzj {
    private String a;
    private String b;

    @Override // defpackage.ctzj
    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null messageCallbackPayload");
    }

    @Override // defpackage.ctzj
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.ctzj
    public final ctzk a() {
        String str = this.a == null ? " text" : "";
        if (this.b == null) {
            str = str.concat(" messageCallbackPayload");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cucm(this.a, this.b);
    }
}

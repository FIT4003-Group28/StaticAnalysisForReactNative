package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bztg  reason: default package */
/* loaded from: classes4.dex */
public final class bztg extends bztj {
    private String a;
    private Double b;

    @Override // defpackage.bztj
    public final void b(double d) {
        this.b = Double.valueOf(d);
    }

    @Override // defpackage.bztj
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null mid");
    }

    @Override // defpackage.bztj
    public final bztk a() {
        String str = this.a == null ? " mid" : "";
        if (this.b == null) {
            str = str.concat(" confidence");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bzth(this.a, this.b.doubleValue());
    }
}

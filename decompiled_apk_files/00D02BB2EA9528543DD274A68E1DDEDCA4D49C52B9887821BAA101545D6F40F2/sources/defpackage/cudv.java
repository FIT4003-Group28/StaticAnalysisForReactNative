package defpackage;
/* compiled from: PG */
/* renamed from: cudv  reason: default package */
/* loaded from: classes5.dex */
public final class cudv extends cugk {
    public String a;
    private byte[] b;

    @Override // defpackage.cugk
    public final void b(byte[] bArr) {
        if (bArr != null) {
            this.b = bArr;
            return;
        }
        throw new NullPointerException("Null content");
    }

    @Override // defpackage.cugk
    public final cugl a() {
        String str = this.a == null ? " type" : "";
        if (this.b == null) {
            str = str.concat(" content");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cudw(this.a, this.b);
    }
}

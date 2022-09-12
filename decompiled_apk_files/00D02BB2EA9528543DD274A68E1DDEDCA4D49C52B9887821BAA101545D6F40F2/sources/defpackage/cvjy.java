package defpackage;
/* compiled from: PG */
/* renamed from: cvjy  reason: default package */
/* loaded from: classes5.dex */
public final class cvjy {
    public Long a;
    public Integer b;
    private byte[] c;

    public final void b(byte[] bArr) {
        if (bArr != null) {
            this.c = bArr;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final cvkh a() {
        String str = this.a == null ? " id" : "";
        if (this.b == null) {
            str = str.concat(" jobType");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" payload");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvjz(this.a, this.b, this.c);
    }
}

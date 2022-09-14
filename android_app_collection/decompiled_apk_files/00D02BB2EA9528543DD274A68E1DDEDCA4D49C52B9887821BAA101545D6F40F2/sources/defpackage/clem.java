package defpackage;
/* compiled from: PG */
/* renamed from: clem  reason: default package */
/* loaded from: classes5.dex */
public final class clem extends clev {
    public byte[] a;
    private String b;
    private clcv c;

    @Override // defpackage.clev
    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    @Override // defpackage.clev
    public final void c(clcv clcvVar) {
        if (clcvVar != null) {
            this.c = clcvVar;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    @Override // defpackage.clev
    public final clew a() {
        String str = this.b == null ? " backendName" : "";
        if (this.c == null) {
            str = str.concat(" priority");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new clen(this.b, this.a, this.c);
    }
}

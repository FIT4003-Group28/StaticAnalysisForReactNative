package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuor  reason: default package */
/* loaded from: classes5.dex */
public final class cuor extends cupo {
    private byte[] a;
    private cugd b;
    private String c;
    private ctzl d;

    @Override // defpackage.cupo
    public final void b(ctzl ctzlVar) {
        if (ctzlVar != null) {
            this.d = ctzlVar;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // defpackage.cupo
    public final void c(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null displayText");
    }

    @Override // defpackage.cupo
    public final void d(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
            return;
        }
        throw new NullPointerException("Null icon");
    }

    @Override // defpackage.cupo
    public final void e(cugd cugdVar) {
        if (cugdVar != null) {
            this.b = cugdVar;
            return;
        }
        throw new NullPointerException("Null lighterIcon");
    }

    @Override // defpackage.cupo
    public final cupp a() {
        String str = this.a == null ? " icon" : "";
        if (this.b == null) {
            str = str.concat(" lighterIcon");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" displayText");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" action");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuos(this.a, this.b, this.c, this.d);
    }
}

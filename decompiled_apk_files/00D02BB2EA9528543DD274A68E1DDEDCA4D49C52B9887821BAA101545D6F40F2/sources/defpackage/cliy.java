package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cliy  reason: default package */
/* loaded from: classes5.dex */
public final class cliy extends clkt {
    public String a;
    private Integer b;
    private Integer c;
    private Boolean d;

    @Override // defpackage.clkt
    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.clkt
    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.clkt
    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.clkt
    public final clku a() {
        String str = this.b == null ? " internalErrorCode" : "";
        if (this.a == null) {
            str = str.concat(" errorMessage");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" httpStatusCode");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" retryableAsIs");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cliz(this.b.intValue(), this.a, this.c.intValue(), this.d.booleanValue());
    }
}

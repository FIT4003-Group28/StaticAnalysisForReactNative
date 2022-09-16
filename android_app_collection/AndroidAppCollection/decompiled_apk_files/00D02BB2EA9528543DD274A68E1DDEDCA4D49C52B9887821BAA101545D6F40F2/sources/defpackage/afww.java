package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afww  reason: default package */
/* loaded from: classes2.dex */
public final class afww extends afxe {
    private Boolean a;
    private Boolean b;

    @Override // defpackage.afxe
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.afxe
    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.afxe
    public final afxf a() {
        String str = this.a == null ? " supportsTranslate" : "";
        if (this.b == null) {
            str = str.concat(" supportsDining");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new afwx(this.a.booleanValue(), this.b.booleanValue());
    }
}

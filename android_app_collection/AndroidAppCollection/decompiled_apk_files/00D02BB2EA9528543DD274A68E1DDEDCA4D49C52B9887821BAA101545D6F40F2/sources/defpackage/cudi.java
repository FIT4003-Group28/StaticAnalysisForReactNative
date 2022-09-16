package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cudi  reason: default package */
/* loaded from: classes5.dex */
public final class cudi extends cufy {
    private cugq a;
    private String b;

    @Override // defpackage.cufy
    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    @Override // defpackage.cufy
    public final void c(cugq cugqVar) {
        if (cugqVar != null) {
            this.a = cugqVar;
            return;
        }
        throw new NullPointerException("Null webViewHeader");
    }

    @Override // defpackage.cufy
    public final cufz a() {
        String str = this.a == null ? " webViewHeader" : "";
        if (this.b == null) {
            str = str.concat(" url");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cudj(this.a, this.b);
    }
}

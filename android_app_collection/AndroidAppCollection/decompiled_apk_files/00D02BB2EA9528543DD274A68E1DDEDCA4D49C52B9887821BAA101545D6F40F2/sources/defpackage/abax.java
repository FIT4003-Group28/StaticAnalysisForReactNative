package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abax  reason: default package */
/* loaded from: classes2.dex */
public final class abax extends abbj {
    private String a;
    private Boolean b;
    private Runnable c;

    @Override // defpackage.abbj
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.abbj
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null mid");
    }

    @Override // defpackage.abbj
    public final void d(Runnable runnable) {
        if (runnable != null) {
            this.c = runnable;
            return;
        }
        throw new NullPointerException("Null pickHandler");
    }

    @Override // defpackage.abbj
    public final abbk a() {
        String str = this.a == null ? " mid" : "";
        if (this.b == null) {
            str = str.concat(" fromMapClick");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" pickHandler");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new abay(this.a, this.b.booleanValue(), this.c);
    }
}

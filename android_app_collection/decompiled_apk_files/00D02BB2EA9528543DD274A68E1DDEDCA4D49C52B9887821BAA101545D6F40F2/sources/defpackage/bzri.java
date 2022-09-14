package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzri  reason: default package */
/* loaded from: classes4.dex */
public final class bzri extends bzrm {
    private Integer a;
    private String b;

    @Override // defpackage.bzrm
    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.bzrm
    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.bzrm
    public final bzrn a() {
        String str = this.a == null ? " color" : "";
        if (this.b == null) {
            str = str.concat(" text");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bzrj(this.a.intValue(), this.b);
    }
}

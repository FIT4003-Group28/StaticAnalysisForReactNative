package defpackage;
/* compiled from: PG */
/* renamed from: aqdk  reason: default package */
/* loaded from: classes2.dex */
public final class aqdk extends aqeb {
    public CharSequence a;
    public CharSequence b;
    public cqtd c;
    public Runnable d;
    public cjtd e;
    public CharSequence f;
    public Runnable g;
    public cjtd h;
    public cjtd i;
    private CharSequence j;

    @Override // defpackage.aqeb
    public final void b(CharSequence charSequence) {
        if (charSequence != null) {
            this.j = charSequence;
            return;
        }
        throw new NullPointerException("Null primaryButtonText");
    }

    @Override // defpackage.aqeb
    public final aqec a() {
        String str = this.j == null ? " primaryButtonText" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new aqdl(this.a, this.b, this.j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}

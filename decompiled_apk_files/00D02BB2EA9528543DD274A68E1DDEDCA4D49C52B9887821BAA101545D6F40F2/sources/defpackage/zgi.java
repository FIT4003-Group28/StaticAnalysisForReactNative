package defpackage;
/* compiled from: PG */
/* renamed from: zgi  reason: default package */
/* loaded from: classes7.dex */
final class zgi extends zhc {
    public cqtd a;
    public cqsn b;
    public cqsn c;
    public cjtd d;
    private cjtd e;
    private Runnable f;
    private Runnable g;

    @Override // defpackage.zhc
    public final void b(cjtd cjtdVar) {
        this.e = cjtdVar;
    }

    @Override // defpackage.zhc
    public final void c(Runnable runnable) {
        if (runnable != null) {
            this.f = runnable;
            return;
        }
        throw new NullPointerException("Null clickCallback");
    }

    @Override // defpackage.zhc
    public final void d(Runnable runnable) {
        if (runnable != null) {
            this.g = runnable;
            return;
        }
        throw new NullPointerException("Null dismissCallback");
    }

    @Override // defpackage.zhc
    public final zhd a() {
        String str = this.e == null ? " barUe3Params" : "";
        if (this.f == null) {
            str = str.concat(" clickCallback");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" dismissCallback");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new zgj(this.a, this.b, this.c, this.e, this.d, this.f, this.g);
    }
}

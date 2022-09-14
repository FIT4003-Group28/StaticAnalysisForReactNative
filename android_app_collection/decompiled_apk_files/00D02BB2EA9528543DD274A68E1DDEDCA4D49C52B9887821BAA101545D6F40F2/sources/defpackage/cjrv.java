package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjrv  reason: default package */
/* loaded from: classes.dex */
public final class cjrv extends cjtb {
    public bvrt<dddg> a;
    public bvrt<ddzg> b;
    public bvrt<ddgy> c;
    public bvrt<ddet> d;
    private ddhj e;
    private Integer f;

    @Override // defpackage.cjtb
    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.cjtb
    public final void c(ddhj ddhjVar) {
        if (ddhjVar != null) {
            this.e = ddhjVar;
            return;
        }
        throw new NullPointerException("Null visibility");
    }

    @Override // defpackage.cjtb
    public final cjtc a() {
        String str = this.e == null ? " visibility" : "";
        if (this.f == null) {
            str = str.concat(" elementIndex");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cjrw(this.e, this.f.intValue(), this.a, this.b, this.c, this.d);
    }
}

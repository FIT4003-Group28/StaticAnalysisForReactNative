package defpackage;
/* compiled from: PG */
/* renamed from: ctpz  reason: default package */
/* loaded from: classes5.dex */
public final class ctpz extends ctrd {
    public ctrf a;
    private cuib b;
    private Boolean c;

    public ctpz() {
    }

    public ctpz(ctrg ctrgVar) {
        ctqa ctqaVar = (ctqa) ctrgVar;
        this.b = ctqaVar.a;
        this.c = Boolean.valueOf(ctqaVar.b);
        this.a = ctqaVar.c;
    }

    @Override // defpackage.ctrd
    public final void b(ctrf ctrfVar) {
        this.a = ctrfVar;
    }

    @Override // defpackage.ctrd
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.ctrd
    public final void d(cuib cuibVar) {
        this.b = cuibVar;
    }

    @Override // defpackage.ctrd
    public final ctrg a() {
        String str = this.c == null ? " skipNotification" : "";
        if (this.a == null) {
            str = str.concat(" oneOfType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctqa(this.b, this.c.booleanValue(), this.a);
    }
}

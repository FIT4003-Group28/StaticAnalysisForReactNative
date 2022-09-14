package defpackage;
/* compiled from: PG */
/* renamed from: ctmh  reason: default package */
/* loaded from: classes5.dex */
public final class ctmh extends ctmm {
    public String a;
    private ctmr b;

    @Override // defpackage.ctmm
    public final void b(ctmr ctmrVar) {
        if (ctmrVar != null) {
            this.b = ctmrVar;
            return;
        }
        throw new NullPointerException("Null lighterRetryPolicy");
    }

    @Override // defpackage.ctmm
    public final ctmn a() {
        String str = this.a == null ? " tag" : "";
        if (this.b == null) {
            str = str.concat(" lighterRetryPolicy");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctmi(this.a, this.b);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cjrn  reason: default package */
/* loaded from: classes4.dex */
public final class cjrn extends cjry {
    public ddzg a;
    public dddg b;
    private ddcu c;
    private Boolean d;

    @Override // defpackage.cjry
    public final void b(ddcu ddcuVar) {
        if (ddcuVar != null) {
            this.c = ddcuVar;
            return;
        }
        throw new NullPointerException("Null dataElementType");
    }

    @Override // defpackage.cjry
    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.cjry
    public final cjrz a() {
        String str = this.c == null ? " dataElementType" : "";
        if (this.d == null) {
            str = str.concat(" repressedForCounterfactual");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cjro(this.c, this.a, this.b, this.d.booleanValue());
    }
}

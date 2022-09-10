package defpackage;
/* compiled from: PG */
/* renamed from: ctxs  reason: default package */
/* loaded from: classes5.dex */
public final class ctxs extends ctya {
    public dbsg<Integer> a = dbpy.a;
    public dbsg<Integer> b = dbpy.a;
    public dbsg<Integer> c = dbpy.a;
    private String d;
    private Integer e;

    @Override // defpackage.ctya
    public final void b(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null chipsId");
    }

    @Override // defpackage.ctya
    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.ctya
    public final ctyb a() {
        String str = this.d == null ? " chipsId" : "";
        if (this.e == null) {
            str = str.concat(" renderStyle");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctxt(this.d, this.a, this.b, this.e.intValue(), this.c);
    }
}

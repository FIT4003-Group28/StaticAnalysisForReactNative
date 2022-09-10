package defpackage;
/* compiled from: PG */
/* renamed from: ctew  reason: default package */
/* loaded from: classes5.dex */
final class ctew extends ctfu {
    private Integer a;
    private dbsg<ctyy> b = dbpy.a;
    private dbsg<ctzp> c = dbpy.a;

    @Override // defpackage.ctfu
    public final void b(ctzp ctzpVar) {
        this.c = dbsg.i(ctzpVar);
    }

    @Override // defpackage.ctfu
    public final void c(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.ctfu
    public final void d(ctyy ctyyVar) {
        this.b = dbsg.i(ctyyVar);
    }

    @Override // defpackage.ctfu
    public final ctfv a() {
        String str = this.a == null ? " status" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new ctex(this.a.intValue(), this.b, this.c);
    }
}

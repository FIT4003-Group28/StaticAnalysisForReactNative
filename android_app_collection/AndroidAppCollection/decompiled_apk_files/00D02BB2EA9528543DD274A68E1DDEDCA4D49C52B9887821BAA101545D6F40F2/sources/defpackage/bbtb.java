package defpackage;
/* compiled from: PG */
/* renamed from: bbtb  reason: default package */
/* loaded from: classes3.dex */
final class bbtb extends bbvg {
    public ilo a;
    private dbsg<dgpu> b;
    private dbsg<crtr> c;

    public bbtb() {
        this.b = dbpy.a;
        this.c = dbpy.a;
    }

    public bbtb(bbvh bbvhVar) {
        this.b = dbpy.a;
        this.c = dbpy.a;
        bbtc bbtcVar = (bbtc) bbvhVar;
        this.a = bbtcVar.a;
        this.b = bbtcVar.b;
        this.c = bbtcVar.c;
    }

    @Override // defpackage.bbvg
    public final void b(crtr crtrVar) {
        this.c = dbsg.i(crtrVar);
    }

    @Override // defpackage.bbvg
    public final void c(dgpu dgpuVar) {
        this.b = dbsg.i(dgpuVar);
    }

    @Override // defpackage.bbvg
    public final bbvh a() {
        String str = this.a == null ? " placemark" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new bbtc(this.a, this.b, this.c);
    }
}

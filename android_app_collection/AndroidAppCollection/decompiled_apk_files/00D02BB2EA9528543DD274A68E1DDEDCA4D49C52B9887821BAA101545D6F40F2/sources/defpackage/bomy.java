package defpackage;
/* compiled from: PG */
/* renamed from: bomy  reason: default package */
/* loaded from: classes3.dex */
public final class bomy {
    @dzsi
    public alad a;
    public final dxio<akzh> b;
    public final bomx c;
    @dzsi
    public dwjr d;
    private final dxio<akpm> e;
    @dzsi
    private btzc f;

    public bomy(dxio<akzh> dxioVar, dxio<akpm> dxioVar2, bomx bomxVar) {
        this.b = dxioVar;
        this.e = dxioVar2;
        this.c = bomxVar;
    }

    public final void a(dosc doscVar, gga ggaVar, gen genVar, bnyo bnyoVar, ges gesVar) {
        b();
        this.a = this.b.a().p();
        dwjq bZ = dwjr.c.bZ();
        dhjx aa = this.e.a().aa();
        if (aa != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjr dwjrVar = (dwjr) bZ.b;
            aa.getClass();
            dwjrVar.b = aa;
            dwjrVar.a |= 1;
        }
        dwjr bK = bZ.bK();
        this.d = bK;
        this.f = bnyoVar.b(bK, new bomw(this, gesVar, doscVar, ggaVar, genVar, bnyoVar));
    }

    public final void b() {
        btzc btzcVar;
        if (this.d == null || (btzcVar = this.f) == null) {
            return;
        }
        btzcVar.a();
        this.d = null;
    }
}

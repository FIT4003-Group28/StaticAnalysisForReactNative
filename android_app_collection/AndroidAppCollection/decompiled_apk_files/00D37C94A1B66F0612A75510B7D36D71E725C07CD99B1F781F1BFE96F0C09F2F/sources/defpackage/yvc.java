package defpackage;
/* compiled from: PG */
/* renamed from: yvc  reason: default package */
/* loaded from: classes4.dex */
public final class yvc implements yve {
    public final azpb a;
    public final aynx b;
    private final amfb c;
    private final aoqu d;

    public yvc(amfb amfbVar, aoqu aoquVar) {
        this.d = aoquVar;
        this.c = amfbVar;
        azpb ax = azpa.ar().ax();
        this.a = ax;
        aynx g = zna.s(amfbVar.c()).E(yps.e).g();
        ayrd.b(aoquVar, "item is null");
        ayyc ayycVar = new ayyc(g, ayrb.b(aoquVar));
        azqc.j();
        this.b = ayycVar.j(ax).n();
    }

    @Override // defpackage.yve
    public final ankt a() {
        return anii.i(this.c.c(), urc.g, anjk.a);
    }

    @Override // defpackage.yve
    public final ankt b(ampg ampgVar) {
        return anii.h(anii.i(anii.i(anko.q(this.c.c()), new yvb(ampgVar), anjk.a), new anir() { // from class: yva
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                Void r2 = (Void) obj;
                return yvc.this.a();
            }
        }, anjk.a), new ampg() { // from class: yuz
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                yvc.this.a.c((aoqu) obj);
                return null;
            }
        }, anjk.a);
    }

    @Override // defpackage.yve
    public final aoqu c() {
        try {
            return ((vmu) ylx.d(this.c.c(), ydy.e)).a();
        } catch (Exception e) {
            zep.d("Failed to read from the store. Falling back to store fallbacks", e);
            return this.d;
        }
    }

    @Override // defpackage.yve
    public final aynx d() {
        return this.b;
    }
}

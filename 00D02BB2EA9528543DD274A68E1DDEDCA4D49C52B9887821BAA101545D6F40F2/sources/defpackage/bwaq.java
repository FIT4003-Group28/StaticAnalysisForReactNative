package defpackage;
/* compiled from: PG */
/* renamed from: bwaq  reason: default package */
/* loaded from: classes4.dex */
public final class bwaq extends bvwn<dmgw> {
    public final bvws b;
    private final dzsj<axwy> c;
    private final btrm d;
    private final bwap e;

    public bwaq(dzsj<axwy> dzsjVar, btrm btrmVar, bvws bvwsVar) {
        super(dmgw.c);
        bwap bwapVar = new bwap(this);
        this.e = bwapVar;
        this.c = dzsjVar;
        this.d = btrmVar;
        this.b = bvwsVar;
        dceq a = dcet.a();
        a.b(azrb.class, new bwar(0, azrb.class, bwapVar, bvrj.UI_THREAD));
        a.b(azrg.class, new bwar(1, azrg.class, bwapVar, bvrj.UI_THREAD));
        btrmVar.g(bwapVar, a.a());
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmgw dmgwVar) {
        axwy a = this.c.a();
        drdg drdgVar = dmgwVar.a;
        if (drdgVar == null) {
            drdgVar = drdg.q;
        }
        a.j(bwrs.a(bwam.a(drdgVar)));
    }

    @Override // defpackage.bvwh
    public final void b() {
        this.d.a(this.e);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: whg  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class whg implements anir {
    public final /* synthetic */ whh a;
    private final /* synthetic */ int b;

    public /* synthetic */ whg(whh whhVar) {
        this.a = whhVar;
    }

    public /* synthetic */ whg(whh whhVar, int i) {
        this.b = i;
        this.a = whhVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.b == 0) {
            whh whhVar = this.a;
            Void r9 = (Void) obj;
            afvm c = whhVar.d.c();
            return whhVar.a.a(wey.b(c), wey.c(c));
        }
        whh whhVar2 = this.a;
        final amgj amgjVar = whhVar2.c;
        final amby ambyVar = (amby) whhVar2.b.b.get();
        final amgn amgnVar = amgn.DONT_CARE;
        amgnVar.getClass();
        final long c2 = amgjVar.a.c();
        ankt a = ambyVar.b.g.a();
        amct amctVar = ambyVar.a.a;
        ankt h = anii.h(amctVar.b.a(), amcf.c, amctVar.a);
        return anii.h(anjd.b(anlz.m(a, h).a(ammo.g(new ambx(a, h)), anjk.a)).c(ammo.d(new aniz() { // from class: amgi
            @Override // defpackage.aniz
            public final anjd a(anjb anjbVar, Object obj2) {
                amgj amgjVar2 = amgj.this;
                amgn amgnVar2 = amgnVar;
                long j = c2;
                amby ambyVar2 = ambyVar;
                amgh amghVar = (amgh) obj2;
                if (amghVar.b() && amghVar.c()) {
                    aqxo.z(amghVar.b(), "Cannot get timestamp for a CacheResult that does not have content");
                    aqxo.z(amghVar.c(), "Cannot get timestamp for an invalid CacheResult");
                    if (amghVar.b.a > j - amgnVar2.k) {
                        return anjd.b(anlz.q(null));
                    }
                }
                ankt d = ambyVar2.b.d();
                amgjVar2.b.a(d);
                return anjd.b(anii.h(d, akzj.e(), anjk.a));
            }
        }), anjk.a).h(), akzj.e(), anjk.a);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: qgq  reason: default package */
/* loaded from: classes7.dex */
public final class qgq implements akvo<aktd> {
    private final vnq a;
    private final qhu b;
    private final btrm c;
    private final qgv d;

    public qgq(vnq vnqVar, btrm btrmVar, qhu qhuVar, qgv qgvVar) {
        this.a = vnqVar;
        this.b = qhuVar;
        this.c = btrmVar;
        this.d = qgvVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void b(aktd aktdVar) {
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(aktd aktdVar) {
        vnq vnqVar = this.a;
        String f = this.b.g().f();
        vnk vnkVar = vnqVar.c;
        if (vnkVar == null) {
            bvoo.h("Attempted to store bikesharing token before state was set", new Object[0]);
        } else {
            vnu l = vnkVar.l();
            vwl n = l.d().n();
            n.n(f);
            n.h(null);
            n.d(null);
            n.c(null);
            vnkVar.m(l.j(vnqVar.b, n.a()));
        }
        this.d.a(this.b);
        this.c.b(new srd());
    }
}

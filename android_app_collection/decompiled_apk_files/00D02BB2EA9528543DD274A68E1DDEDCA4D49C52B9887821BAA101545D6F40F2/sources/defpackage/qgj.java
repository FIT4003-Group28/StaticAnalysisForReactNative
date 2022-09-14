package defpackage;
/* compiled from: PG */
/* renamed from: qgj  reason: default package */
/* loaded from: classes7.dex */
public final class qgj implements akvo<aktd> {
    private final vnq a;
    private final vwm b;
    private final qhq c;
    private final qhq d;
    private final btrm e;
    private final qgn f;

    public qgj(vnq vnqVar, btrm btrmVar, vwm vwmVar, qhq qhqVar, qhq qhqVar2, qgn qgnVar) {
        this.a = vnqVar;
        this.e = btrmVar;
        this.b = vwmVar;
        this.c = qhqVar;
        this.d = qhqVar2;
        this.f = qgnVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void b(aktd aktdVar) {
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(aktd aktdVar) {
        this.f.a(this.c, this.d);
        vnq vnqVar = this.a;
        String f = this.c.e().f();
        String f2 = this.d.e().f();
        vwm vwmVar = this.b;
        vnk vnkVar = vnqVar.c;
        if (vnkVar == null) {
            bvoo.h("Attempted to store bikesharing station tokens before state was set", new Object[0]);
        } else {
            vnu l = vnkVar.l();
            vnkVar.m(l.j(vnqVar.b, l.d().y(f, f2, vwmVar)));
        }
        this.e.b(new src());
    }
}

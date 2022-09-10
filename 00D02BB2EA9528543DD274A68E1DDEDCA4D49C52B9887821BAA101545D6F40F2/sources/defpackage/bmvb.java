package defpackage;
/* compiled from: PG */
/* renamed from: bmvb  reason: default package */
/* loaded from: classes3.dex */
final class bmvb implements ango {
    public final String a;
    public final btrm b;
    public final eapd c;
    public final bmug d;
    final /* synthetic */ bmvg e;
    public final int f;

    public bmvb(bmvg bmvgVar, int i, String str, btrm btrmVar, eapd eapdVar, bmug bmugVar) {
        this.e = bmvgVar;
        this.f = i;
        this.a = str;
        this.b = btrmVar;
        this.c = eapdVar;
        this.d = bmugVar;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        this.e.i.execute(new Runnable(this) { // from class: bmuz
            private final bmvb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmvb bmvbVar = this.a;
                if (bmvbVar.f == 1) {
                    bmvbVar.e.b.a(bmvbVar.c);
                    if (!bmvbVar.e.c.getUgcParameters().E()) {
                        bmvbVar.b.b(new blpi());
                    }
                    bmvg bmvgVar = bmvbVar.e;
                    bmvgVar.f = bmvbVar.d;
                    ily g = bmvgVar.e.e.g();
                    g.l(bmvbVar.c, bmvbVar.d.d());
                    bmvgVar.a(g.d(), bmvbVar.e.h);
                } else {
                    bmvg bmvgVar2 = bmvbVar.e;
                    ily g2 = bmvgVar2.e.e.g();
                    g2.t();
                    bmvgVar2.a(g2.d(), bmvbVar.e.h);
                }
                bmvbVar.e.g = dbpy.a;
                bmvg bmvgVar3 = bmvbVar.e;
                bmvgVar3.e.f = false;
                bmvgVar3.h.a();
            }
        });
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        this.e.i.execute(new Runnable(this) { // from class: bmva
            private final bmvb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmvb bmvbVar = this.a;
                ckos.a(bmvbVar.e.d.findViewById(16908290), bmvbVar.a, -1).c();
                bmvbVar.e.g = dbpy.a;
                bmvbVar.e.h.a();
            }
        });
    }
}

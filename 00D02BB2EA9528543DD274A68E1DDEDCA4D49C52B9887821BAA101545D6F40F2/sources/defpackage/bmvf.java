package defpackage;
/* compiled from: PG */
/* renamed from: bmvf  reason: default package */
/* loaded from: classes3.dex */
final class bmvf implements ango {
    public final String a;
    final /* synthetic */ bmvg b;

    public bmvf(bmvg bmvgVar, String str) {
        this.b = bmvgVar;
        this.a = str;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        this.b.i.execute(new Runnable(this) { // from class: bmvd
            private final bmvf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmvf bmvfVar = this.a;
                bmuv bmuvVar = bmvfVar.b.e;
                bmuvVar.f = false;
                ily g = bmuvVar.e.g();
                g.t();
                bmuvVar.e = g.d();
                bmvfVar.b.h.a();
            }
        });
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        this.b.i.execute(new Runnable(this) { // from class: bmve
            private final bmvf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmvf bmvfVar = this.a;
                ckos.a(bmvfVar.b.d.findViewById(16908290), bmvfVar.a, -1).c();
                bmvg bmvgVar = bmvfVar.b;
                bmvgVar.e.f = false;
                bmvgVar.h.a();
            }
        });
    }
}

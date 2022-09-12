package defpackage;

import android.view.InflateException;
/* compiled from: PG */
/* renamed from: bmuu  reason: default package */
/* loaded from: classes3.dex */
final class bmuu implements ango {
    public final String a;
    public final bmtt b;
    public final Runnable c;
    final /* synthetic */ bmuv d;
    private final String e;

    public bmuu(bmuv bmuvVar, String str, String str2, Runnable runnable, bmtt bmttVar) {
        this.d = bmuvVar;
        this.a = str;
        this.e = str2;
        this.c = runnable;
        this.b = bmttVar;
    }

    public final void a() {
        try {
            ckos.a(this.d.b.findViewById(16908290), this.e, 0).c();
        } catch (InflateException unused) {
        }
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        this.d.d.execute(new Runnable(this) { // from class: bmus
            private final bmuu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmuu bmuuVar = this.a;
                bmuuVar.a();
                int i = bmuv.i;
                bmuuVar.c.run();
                bmuuVar.d.f = false;
                bmuv bmuvVar = bmuuVar.d;
                ily g = bmuvVar.e.g();
                ilw ilwVar = g.b;
                if (ilwVar.x == null) {
                    ilwVar.x = new ilc(2, null, null);
                }
                bmuvVar.e = g.d();
                bmuuVar.b.a();
            }
        });
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        this.d.d.execute(new Runnable(this) { // from class: bmut
            private final bmuu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmuu bmuuVar = this.a;
                ckos.a(bmuuVar.d.b.findViewById(16908290), bmuuVar.a, -1).c();
                bmuuVar.d.f = false;
                bmuuVar.b.a();
            }
        });
    }
}

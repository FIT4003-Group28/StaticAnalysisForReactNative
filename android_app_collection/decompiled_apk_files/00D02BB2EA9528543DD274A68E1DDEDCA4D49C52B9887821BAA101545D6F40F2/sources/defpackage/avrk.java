package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avrk  reason: default package */
/* loaded from: classes3.dex */
public final class avrk extends itb {
    public final cqkj a;
    public final eff b;
    public final avrv c;
    private final Executor f;
    private final btrm g;
    private final bvjj h;
    private final crzm<avzg> i;
    @dzsi
    public avrs d = null;
    @dzsi
    public View e = null;
    private final crzp<avzg> j = new crzp(this) { // from class: avri
        private final avrk a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            avrs avrsVar = this.a.d;
            if (avrsVar != null) {
                cqkx.p(avrsVar);
            }
        }
    };

    public avrk(cqkj cqkjVar, Executor executor, eff effVar, btrm btrmVar, bvjj bvjjVar, avrv avrvVar, crzm<avzg> crzmVar) {
        this.a = cqkjVar;
        this.f = executor;
        this.b = effVar;
        this.g = btrmVar;
        this.h = bvjjVar;
        this.c = avrvVar;
        this.i = crzmVar;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        btrm btrmVar = this.g;
        dceq a = dcet.a();
        a.b(btyj.class, new avrl(btyj.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.i.d(this.j, this.f);
        if (this.h.m(bvjk.et, false)) {
            e();
        }
    }

    @Override // defpackage.itb
    public final void Nu() {
        super.Nu();
        this.g.a(this);
        this.i.c(this.j);
        if (this.b.b(efe.WIFI_ONLY_BANNER)) {
            f();
        }
    }

    public final void e() {
        this.f.execute(new Runnable(this) { // from class: avrj
            private final avrk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avrk avrkVar = this.a;
                if (!avrkVar.w()) {
                    return;
                }
                avrv avrvVar = avrkVar.c;
                Activity activity = (Activity) ((dxjd) avrvVar.a).a;
                avrv.a(activity, 1);
                cjmt a = avrvVar.b.a();
                avrv.a(a, 2);
                acyp a2 = avrvVar.c.a();
                avrv.a(a2, 3);
                avsm a3 = avrvVar.d.a();
                avrv.a(a3, 4);
                btyh a4 = avrvVar.e.a();
                avrv.a(a4, 5);
                avrkVar.d = new avru(activity, a, a2, a3, a4);
                cqkf d = avrkVar.a.d(new avrr(), avrkVar.b.a(), false);
                avrs avrsVar = avrkVar.d;
                if (avrsVar != null) {
                    d.e(avrsVar);
                }
                avrkVar.e = d.c();
                avrkVar.b.e(efe.WIFI_ONLY_BANNER, avrkVar.e);
            }
        });
    }

    public final void f() {
        if (this.e == null || !this.b.b(efe.WIFI_ONLY_BANNER)) {
            return;
        }
        this.b.d(efe.WIFI_ONLY_BANNER);
    }
}

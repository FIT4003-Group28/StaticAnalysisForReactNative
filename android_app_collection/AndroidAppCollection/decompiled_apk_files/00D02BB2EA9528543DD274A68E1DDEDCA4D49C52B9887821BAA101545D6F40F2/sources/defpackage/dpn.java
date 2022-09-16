package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.ar.lighthouse.ArLighthouseSceneController;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dpn  reason: default package */
/* loaded from: classes6.dex */
public final class dpn extends ges {
    public static final String a = gfu.b(dpn.class, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
    public czj ad;
    public dqs ae;
    public dxio<dqu> af;
    private czv ag;
    private czu ah;
    private czz ai;
    private drq aj;
    private ArLighthouseSceneController ak;
    public dbsg<dap> b;
    public dbsg<czo> c;
    public bwqv d;
    public dxio<dhm> e;
    public cjxo f;
    public efg g;

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lighthouse_layout, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.ar_view_container);
        dbsk.s(viewGroup2);
        dbsk.a(this.b.a());
        czy czyVar = this.b.b().b;
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        czx a2 = czyVar.a(ggaVar, czh.LIGHTHOUSE);
        a2.c(!this.aj.d());
        a2.b(this.aj.d());
        a2.d(this.ad);
        czz a3 = a2.a();
        this.ai = a3;
        viewGroup2.addView(a3.a());
        this.ai.n(new View.OnClickListener(this) { // from class: dpm
            private final dpn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e();
            }
        });
        dqs dqsVar = this.ae;
        czo b = this.c.b();
        czz czzVar = this.ai;
        dbsg<cjqp> bd = bd();
        dhm a4 = this.e.a();
        drq drqVar = this.aj;
        Activity activity = (Activity) ((dxjd) dqsVar.a).a;
        dqs.a(activity, 1);
        dbsg<dap> a5 = dqsVar.b.a();
        dqs.a(a5, 2);
        btvo a6 = dqsVar.c.a();
        dqs.a(a6, 3);
        dbsg<czw> a7 = dqsVar.d.a();
        dqs.a(a7, 4);
        dpx a8 = dqsVar.e.a();
        dqs.a(a8, 5);
        dcs a9 = dqsVar.f.a();
        dqs.a(a9, 6);
        dxio a10 = ((dxjh) dqsVar.g).a();
        dqs.a(a10, 7);
        dxio a11 = ((dxjh) dqsVar.h).a();
        dqs.a(a11, 8);
        dxio a12 = ((dxjh) dqsVar.i).a();
        dqs.a(a12, 9);
        dqs.a(((dxjh) dqsVar.j).a(), 10);
        dqs.a(((dxjh) dqsVar.k).a(), 11);
        dxio a13 = ((dxjh) dqsVar.l).a();
        dqs.a(a13, 12);
        dxio a14 = ((dxjh) dqsVar.m).a();
        dqs.a(a14, 13);
        dry a15 = dqsVar.n.a();
        dqs.a(a15, 14);
        dsg a16 = dqsVar.o.a();
        dqs.a(a16, 15);
        dqs.a(dqsVar.p.a(), 16);
        drm a17 = dqsVar.q.a();
        dqs.a(a17, 17);
        drb a18 = dqsVar.r.a();
        dqs.a(a18, 18);
        dyc a19 = dqsVar.s.a();
        dqs.a(a19, 19);
        dqs.a(this, 20);
        dqs.a(b, 21);
        dqs.a(czzVar, 22);
        dqs.a(bd, 23);
        dqs.a(a4, 24);
        dqs.a(drqVar, 25);
        this.ak = new ArLighthouseSceneController(activity, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, this, b, czzVar, bd, a4, drqVar);
        final dqu a20 = this.af.a();
        final dan a21 = this.ai.m().a();
        this.Z.a(new e() { // from class: com.google.android.apps.gmm.ar.lighthouse.ArLighthouseTiltController$1
            @dzsi
            private dzak c;

            @Override // defpackage.f
            public final void a(m mVar) {
            }

            @Override // defpackage.f
            public final void b(m mVar) {
                dqu.this.a.a();
                dzgj<dam> dzgjVar = dqu.this.a.a;
                final dan danVar = a21;
                danVar.getClass();
                this.c = dzgjVar.SW(new dzaz(danVar) { // from class: dqt
                    private final dan a;

                    {
                        this.a = danVar;
                    }

                    @Override // defpackage.dzaz
                    public final void SR(Object obj) {
                        this.a.c((dam) obj);
                    }
                });
            }

            @Override // defpackage.f
            public final void c(m mVar) {
            }

            @Override // defpackage.f
            public final void d(m mVar) {
            }

            @Override // defpackage.f
            public final void e(m mVar) {
                dqu.this.a.b();
                dzak dzakVar = this.c;
                if (dzakVar != null) {
                    dzbd.e((AtomicReference) dzakVar);
                    this.c = null;
                }
            }

            @Override // defpackage.f
            public final void f(m mVar) {
            }
        });
        return inflate;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.ai.d();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        this.ai.e();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.ai.g();
        this.ag.e(this.ah);
        this.ag.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        g();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.c.b().c(czh.LIGHTHOUSE);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        dbsk.s(bundle);
        dbsk.l(bundle.containsKey("target_arg"));
        try {
            drq f = drq.f(bundle, "target_arg", this.d);
            dbsk.s(f);
            this.aj = f;
        } catch (IOException e) {
            bvoo.f(new RuntimeException("Can't create ArLighthouseFragment without a target", e));
        }
        dbsk.l(this.b.a());
        dbsk.l(this.c.a());
        dap b = this.b.b();
        this.ag = b.a.a(czh.LIGHTHOUSE, czs.NONE);
        czu czuVar = new czu(this) { // from class: dpl
            private final dpn a;

            {
                this.a = this;
            }

            @Override // defpackage.czu
            public final void a(Throwable th) {
                dpn dpnVar = this.a;
                bvoo.j(th);
                dpnVar.g();
            }
        };
        this.ah = czuVar;
        this.ag.d(czuVar);
        b.d((gga) J(), this.c.b(), czh.LIGHTHOUSE);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.bR;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.f.a(1);
        efg efgVar = this.g;
        ArLighthouseSceneController arLighthouseSceneController = this.ak;
        View view = this.P;
        dbsk.s(view);
        efgVar.a(arLighthouseSceneController.a.b(this, view));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.d.c(bundle, "target_arg", this.aj);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.f.b();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aurp  reason: default package */
/* loaded from: classes2.dex */
public class aurp implements aura, jbt {
    public final Activity a;
    public final ges b;
    public final aurg c;
    public final auhq d;
    public final auon e;
    public final dxio<afha> f;
    public final ckhe g;
    public boolean h;
    public boolean i;
    private final ijr m;
    private final dxio<afef> n;
    private final dxio<akfa> o;
    private final Executor p;
    private final akfc q;
    public List<cqix<?>> j = new ArrayList();
    public int l = 1;
    @dzsi
    public List<auqf> k = null;

    public aurp(final Activity activity, ges gesVar, dxio<afef> dxioVar, dxio<akfa> dxioVar2, dxio<afha> dxioVar3, dxio<bzmm> dxioVar4, auoo auooVar, auhq auhqVar, cqhn cqhnVar, aurg aurgVar, auon auonVar, Executor executor, akfc akfcVar, ckcw ckcwVar) {
        this.a = activity;
        this.b = gesVar;
        this.n = dxioVar;
        this.o = dxioVar2;
        this.f = dxioVar3;
        this.d = auhqVar;
        this.c = aurgVar;
        this.e = auonVar;
        this.p = executor;
        this.q = akfcVar;
        this.m = ijt.k(cjtd.a(dtxs.C), activity.getString(R.string.INBOX_SYSTEM_BAN_PROMO_TITLE), activity.getString(R.string.INBOX_SYSTEM_BAN_PROMO_SUBTITLE), cjtd.a(dtxs.E), new Runnable(this, activity) { // from class: aurh
            private final aurp a;
            private final Activity b;

            {
                this.a = this;
                this.b = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aurp aurpVar = this.a;
                Activity activity2 = this.b;
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", activity2.getPackageName());
                    aurpVar.f.a().f(activity2, intent, 1);
                }
            }
        }, cjtd.a(dtxs.D), new Runnable(this) { // from class: auri
            private final aurp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aurp aurpVar = this.a;
                aurpVar.h = false;
                cqkx.p(aurpVar);
            }
        });
        this.g = (ckhe) ckcwVar.a(ckfm.o);
        this.h = dxioVar4.a().a(auooVar);
    }

    private final boolean p() {
        return btlu.p(this.o.a().j());
    }

    private final boolean q() {
        return btlu.n(this.o.a().j());
    }

    private final int r() {
        if (p()) {
            return 4;
        }
        if (q()) {
            return 3;
        }
        return (this.l != 2 || !this.j.isEmpty()) ? 1 : 2;
    }

    @Override // defpackage.aura
    public List<cqix<?>> a() {
        return this.j;
    }

    @Override // defpackage.aura
    public Boolean b() {
        return Boolean.valueOf(r() == 2);
    }

    @Override // defpackage.aura
    public Boolean c() {
        return Boolean.valueOf(r() == 3);
    }

    @Override // defpackage.aura
    public Boolean d() {
        return Boolean.valueOf(r() == 4);
    }

    @Override // defpackage.aura
    public Boolean e() {
        r();
        return false;
    }

    @Override // defpackage.aura
    public cqkl f() {
        if (q()) {
            this.n.a().e(false);
        }
        return cqkl.a;
    }

    @Override // defpackage.aura
    public cqkl g() {
        if (p()) {
            this.q.k(new auro(this), null);
        }
        return cqkl.a;
    }

    @Override // defpackage.aura
    public Boolean h() {
        boolean z = false;
        if (!this.d.a() && this.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aura
    public cqkl i() {
        o();
        return cqkl.a;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new aupy(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return cjtd.a(dtxr.be);
    }

    @Override // defpackage.aura
    public ijr l() {
        return this.m;
    }

    @Override // defpackage.aura
    public awz m() {
        return new awz(this) { // from class: aurl
            private final aurp a;

            {
                this.a = this;
            }

            @Override // defpackage.awz
            public final void a() {
                aurp aurpVar = this.a;
                if (!aurpVar.i) {
                    aurpVar.i = true;
                    cqkx.p(aurpVar);
                    aurpVar.o();
                }
            }
        };
    }

    @Override // defpackage.aura
    public Boolean n() {
        return Boolean.valueOf(this.i);
    }

    public void o() {
        this.g.a();
        this.p.execute(new Runnable(this) { // from class: aurj
            private final aurp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aurp aurpVar = this.a;
                final List<auqf> a = aurpVar.e.a();
                aurpVar.l = 2;
                if (aurpVar.b.aD && !a.equals(aurpVar.k)) {
                    aurpVar.a.runOnUiThread(new Runnable(aurpVar, a) { // from class: aurm
                        private final aurp a;
                        private final List b;

                        {
                            this.a = aurpVar;
                            this.b = a;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            aurp aurpVar2 = this.a;
                            List list = this.b;
                            aurpVar2.k = dcdc.r(list);
                            dcdc<cqkp> z = dcbg.b(list).s(new dbrn(aurpVar2) { // from class: aurk
                                private final aurp a;

                                {
                                    this.a = aurpVar2;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj) {
                                    aurp aurpVar3 = this.a;
                                    auqf auqfVar = (auqf) obj;
                                    aurg aurgVar = aurpVar3.c;
                                    aurg.a(auqfVar, 1);
                                    aurg.a(aurpVar3, 2);
                                    cqat a2 = aurgVar.a.a();
                                    aurg.a(a2, 3);
                                    gga a3 = aurgVar.b.a();
                                    aurg.a(a3, 4);
                                    auhi a4 = aurgVar.c.a();
                                    aurg.a(a4, 5);
                                    Executor a5 = aurgVar.d.a();
                                    aurg.a(a5, 6);
                                    auon a6 = aurgVar.e.a();
                                    aurg.a(a6, 7);
                                    dxio a7 = ((dxjh) aurgVar.f).a();
                                    aurg.a(a7, 8);
                                    dxio a8 = ((dxjh) aurgVar.g).a();
                                    aurg.a(a8, 9);
                                    return new aurf(auqfVar, aurpVar3, a2, a3, a4, a5, a6, a7, a8);
                                }
                            }).z();
                            cqiv cqivVar = new cqiv();
                            aupj aupjVar = new aupj();
                            cqiw o = ict.o(ibn.q(), new cqmp[0]);
                            boolean z2 = false;
                            for (cqkp cqkpVar : z) {
                                if (z2) {
                                    cqivVar.a(o, new guz());
                                }
                                cqivVar.a(aupjVar, cqkpVar);
                                z2 = true;
                            }
                            aurpVar2.j = cqivVar.a;
                            aurpVar2.i = false;
                            cqkx.p(aurpVar2);
                        }
                    });
                    aurpVar.e.e(a);
                    auhq auhqVar = aurpVar.d;
                    ((ckco) auhqVar.a.a(ckfm.n)).a(a.size());
                    aurpVar.g.c();
                } else if (aurpVar.i) {
                    aurpVar.i = false;
                    aurpVar.a.runOnUiThread(new Runnable(aurpVar) { // from class: aurn
                        private final aurp a;

                        {
                            this.a = aurpVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cqkx.p(this.a);
                        }
                    });
                }
                aurpVar.e.g();
            }
        });
    }
}

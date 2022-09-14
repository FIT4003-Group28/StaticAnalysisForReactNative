package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zie  reason: default package */
/* loaded from: classes7.dex */
public class zie {
    public final bvjj a;
    public final Runnable b;
    public final dxio<vml> c;
    public final arri d;
    @dzsi
    zbq e = null;
    private final Activity f;
    private final vwv g;
    private final cjqq h;
    private final dxio<bzmm> i;
    private final zik j;
    private final zln k;
    private final zgh l;
    private final zkk m;
    private final zhe n;
    private final arrf o;
    private final qbq p;

    public zie(vwv vwvVar, bvjj bvjjVar, dxio<vml> dxioVar, cjqq cjqqVar, dxio<bzmm> dxioVar2, zik zikVar, zln zlnVar, zgh zghVar, zkk zkkVar, zhe zheVar, arrf arrfVar, arri arriVar, Activity activity, Runnable runnable, qbq qbqVar) {
        this.g = vwvVar;
        this.a = bvjjVar;
        this.c = dxioVar;
        this.n = zheVar;
        this.b = runnable;
        this.h = cjqqVar;
        this.i = dxioVar2;
        this.j = zikVar;
        this.k = zlnVar;
        this.l = zghVar;
        this.m = zkkVar;
        this.o = arrfVar;
        this.d = arriVar;
        this.f = activity;
        this.p = qbqVar;
    }

    public final void a(vnk vnkVar) {
        int d;
        dbsg dbsgVar;
        dbsg dbsgVar2;
        dbsg dbsgVar3;
        vni vniVar = vni.NONE;
        boolean z = true;
        zbq zbqVar = null;
        switch (vnkVar.aO().ordinal()) {
            case 1:
                zik zikVar = this.j;
                dqvj g = vnkVar.g();
                dqvj a = vnkVar.l().a();
                amvh c = vnkVar.c();
                dcdc<amvh> e = vnkVar.e();
                dwao h = vnkVar.h();
                Runnable runnable = this.b;
                zid zidVar = new zid(this) { // from class: zhy
                    private final zie a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.zid
                    public final void a(zbq zbqVar2) {
                        this.a.e = zbqVar2;
                    }
                };
                zikVar.e = g;
                zikVar.f = a;
                zikVar.g = c;
                zikVar.h = e;
                zikVar.i = h;
                zikVar.j = runnable;
                zikVar.k = zidVar;
                this.i.a().a(this.j);
                return;
            case 2:
                dqvj a2 = vnkVar.l().a();
                amte p = vnkVar.l().d().p();
                if (a2 != dqvj.TAXI && p != null && (d = this.c.a().d(p)) != 1) {
                    int i = d == 2 ? R.string.DIRECTIONS_OFFLINE_PROMO_AREA : R.string.DIRECTIONS_OFFLINE_PROMO_ROUTE;
                    ddho ddhoVar = d == 2 ? dtxn.bE : dtxn.bQ;
                    ddho ddhoVar2 = d == 2 ? dtxn.bF : dtxn.bR;
                    if (this.g.d) {
                        cjqp g2 = this.h.g();
                        cjta cjtaVar = new cjta();
                        cjtaVar.d = ddhoVar;
                        cjtaVar.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                        g2.d(cjtaVar.a());
                    } else {
                        zhc i2 = zhd.i();
                        zgi zgiVar = (zgi) i2;
                        zgiVar.a = cqrt.g(2131232676, cqta.g());
                        zgiVar.c = cqrt.l(i);
                        i2.b(cjtd.a(ddhoVar));
                        i2.c(new zia(this, p));
                        zgiVar.d = cjtd.a(ddhoVar2);
                        i2.d(new zhz(this, p));
                        zbqVar = i2.a();
                    }
                }
                this.e = zbqVar;
                return;
            case 3:
                zln zlnVar = this.k;
                Runnable runnable2 = this.b;
                qbq qbqVar = this.p;
                zlnVar.b = dbsg.i(vnkVar);
                boolean d2 = zlnVar.d();
                if (zlnVar.c.a()) {
                    zlnVar.c.b().f(vnkVar, d2);
                    dbsgVar = zlnVar.c;
                } else if (!d2) {
                    dbsgVar = dbpy.a;
                } else {
                    zlnVar.d = runnable2;
                    zlnVar.e = dbsg.i(qbqVar);
                    zlnVar.a.a().a(zlnVar);
                    dbsgVar = zlnVar.c;
                }
                this.e = (zbq) dbsgVar.f();
                return;
            case 4:
                zgh zghVar = this.l;
                this.f.getResources().getString(pxo.ASSISTANT_DRIVING_MODE_OOBE_BUTTON_TEXT);
                zghVar.a = dbsg.i(vnkVar);
                if (zghVar.b.a()) {
                    dbsgVar2 = zghVar.b;
                } else {
                    zghVar.d();
                    dbsgVar2 = dbpy.a;
                }
                this.e = (zbq) dbsgVar2.f();
                return;
            case 5:
                if (this.o.q(vnkVar.l().a())) {
                    zhc i3 = zhd.i();
                    zgi zgiVar2 = (zgi) i3;
                    zgiVar2.a = cqrt.g(2131232798, cqta.g());
                    zgiVar2.b = cqrt.l(R.string.NAVIGATION_MEDIA_PROMO_TITLE);
                    zgiVar2.c = cqrt.l(R.string.NAVIGATION_MEDIA_PROMO_BODY);
                    i3.b(cjtd.a(dtxn.ce));
                    i3.c(new zic(this));
                    zgiVar2.d = cjtd.a(dtxn.cf);
                    i3.d(new zib(this));
                    zbqVar = i3.a();
                }
                this.e = zbqVar;
                if (zbqVar == null) {
                    return;
                }
                this.a.ao(bvjk.jg);
                return;
            case 6:
            default:
                this.e = null;
                return;
            case 7:
                zkk zkkVar = this.m;
                Runnable runnable3 = this.b;
                qbq qbqVar2 = this.p;
                zkkVar.b = dbsg.i(vnkVar);
                if (!zkkVar.d() || !bzmk.VISIBLE.equals(zkkVar.e())) {
                    z = false;
                }
                if (zkkVar.c.a()) {
                    zkkVar.c.b().g(vnkVar, z);
                    dbsgVar3 = zkkVar.c;
                } else if (!z) {
                    dbsgVar3 = dbpy.a;
                } else {
                    zkkVar.d = runnable3;
                    zkkVar.e = qbqVar2;
                    zkkVar.a.a().a(zkkVar);
                    dbsgVar3 = zkkVar.c;
                }
                this.e = (zbq) dbsgVar3.f();
                return;
            case 8:
                zhe zheVar = this.n;
                zhx zhxVar = new zhx(this);
                if (zheVar.a.getDirectionsPageParameters().E) {
                    dcdc<GmmNotice> a3 = zhe.a(vnkVar);
                    if (!a3.isEmpty()) {
                        zhi zhiVar = zheVar.b;
                        gga a4 = zhiVar.a.a();
                        zhi.a(a4, 1);
                        btvo a5 = zhiVar.b.a();
                        zhi.a(a5, 2);
                        vtn a6 = zhiVar.c.a();
                        zhi.a(a6, 3);
                        qbt a7 = zhiVar.d.a();
                        zhi.a(a7, 4);
                        afha a8 = zhiVar.e.a();
                        zhi.a(a8, 5);
                        zhi.a(a3, 6);
                        zbqVar = new zhh(a4, a5, a6, a7, a8, a3);
                    }
                }
                if (zbqVar == null) {
                    return;
                }
                zhxVar.a.e = zbqVar;
                return;
        }
    }
}

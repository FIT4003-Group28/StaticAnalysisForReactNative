package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: byko  reason: default package */
/* loaded from: classes4.dex */
public class byko implements byim, byjx {
    private boolean A;
    private byjw B = byjw.WAITING_TO_REQUEST;
    private final byik C;
    private final byii D;
    private final byij E;
    private final byid F;
    private final View.OnClickListener G;
    private final View.OnClickListener H;
    public final Activity a;
    public final gft b;
    public final bsvm c;
    public final byjj d;
    public final byjh e;
    public final bykn f;
    public List<dozz> g;
    private final dxio<akzh> h;
    private final dxio<akfa> i;
    private final bynx j;
    private final gun k;
    private final byjm l;
    private final akpm m;
    private final gll n;
    private final byjb o;
    private final byex p;
    private final boolean q;
    private final boolean r;
    private final jib s;
    @dzsi
    private byie t;
    @dzsi
    private byjl u;
    @dzsi
    private byiw v;
    private List<byji> w;
    @dzsi
    private byif x;
    private int y;
    @dzsi
    private akqs z;

    public byko(Activity activity, dxio<akfa> dxioVar, bynx bynxVar, bsvm bsvmVar, ascb ascbVar, gun gunVar, byjj byjjVar, byjm byjmVar, akpm akpmVar, dxio<akzh> dxioVar2, gll gllVar, byjv byjvVar, byjr byjrVar, byjb byjbVar, byex byexVar, dxio<afwt> dxioVar3, dxio<ros> dxioVar4, byjs byjsVar, byix byixVar, acyp acypVar, gft gftVar, byjh byjhVar, bykn byknVar, boolean z, boolean z2) {
        bykl byklVar = new bykl(this);
        this.G = byklVar;
        bykm bykmVar = new bykm(this);
        this.H = bykmVar;
        this.a = activity;
        this.h = dxioVar2;
        this.i = dxioVar;
        this.b = gftVar;
        this.j = bynxVar;
        this.c = bsvmVar;
        this.k = gunVar;
        this.d = byjjVar;
        this.l = byjmVar;
        this.e = byjhVar;
        this.f = byknVar;
        this.o = byjbVar;
        this.p = byexVar;
        this.q = z;
        this.r = z2;
        this.g = dcdc.e();
        this.w = dcdc.e();
        if (z) {
            this.v = new byiy(activity, dxioVar4, dxioVar3, dxioVar, acypVar);
        } else if (z2) {
            this.v = new byis(activity, dxioVar4, dxioVar3, acypVar);
        }
        this.x = null;
        this.y = 0;
        jhz a = jhz.a();
        a.a = activity.getString(R.string.TRAFFIC_NEARBY);
        a.f(byklVar);
        if (bsvmVar.q()) {
            jhm jhmVar = new jhm();
            jhmVar.a = activity.getString(R.string.SETTINGS);
            jhmVar.b = activity.getString(R.string.SETTINGS);
            jhmVar.h = 2;
            jhmVar.d(bykmVar);
            jhmVar.f = cjtd.a(dtyc.bk);
            jhmVar.c = cqrt.f(2131231743);
            jhmVar.d = ibm.c();
            a.c(jhmVar.c());
        }
        this.s = a.b();
        this.m = akpmVar;
        this.n = gllVar;
        this.A = false;
        this.E = byjsVar;
        this.F = byixVar;
        bykh bykhVar = new bykh(this);
        Activity activity2 = (Activity) ((dxjd) byjvVar.a).a;
        byjv.a(activity2, 1);
        bvjj a2 = byjvVar.b.a();
        byjv.a(a2, 2);
        dxio a3 = ((dxjh) byjvVar.c).a();
        byjv.a(a3, 3);
        cqat a4 = byjvVar.d.a();
        byjv.a(a4, 4);
        this.C = new byju(activity2, a2, a3, a4, bykhVar);
        byki bykiVar = new byki(this);
        Activity activity3 = (Activity) ((dxjd) byjrVar.a).a;
        byjr.a(activity3, 1);
        cqhn a5 = byjrVar.b.a();
        byjr.a(a5, 2);
        dxio a6 = ((dxjh) byjrVar.c).a();
        byjr.a(a6, 3);
        dxio a7 = ((dxjh) byjrVar.d).a();
        byjr.a(a7, 4);
        dxio a8 = ((dxjh) byjrVar.e).a();
        byjr.a(a8, 5);
        bvjj a9 = byjrVar.f.a();
        byjr.a(a9, 6);
        cqat a10 = byjrVar.g.a();
        byjr.a(a10, 7);
        this.D = new byjq(activity3, a5, a6, a7, a8, a9, a10, bykiVar);
    }

    public static boolean A(dozz dozzVar, Set<String> set) {
        dozs dozsVar;
        if (dozzVar.b == 22) {
            dozsVar = (dozs) dozzVar.c;
        } else {
            dozsVar = dozs.q;
        }
        return !Collections.disjoint(dozsVar.k, set);
    }

    private final void B() {
        this.g = dcdc.e();
        this.w = dcdc.e();
        this.y = 0;
        this.x = null;
        this.z = null;
    }

    private final void C() {
        if (!((ges) this.b).aD) {
            return;
        }
        if (this.A && !this.g.isEmpty()) {
            this.j.a(this.g, this.w.size() - this.y, new bykk(this));
        }
        y();
    }

    private final void D() {
        this.j.b();
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.s;
    }

    @Override // defpackage.byim
    public Boolean b() {
        return Boolean.valueOf(this.B.a());
    }

    @Override // defpackage.byim
    public Boolean c() {
        return Boolean.valueOf(this.B == byjw.ERROR_OFFLINE);
    }

    @Override // defpackage.byim
    public Boolean d() {
        return Boolean.valueOf(this.B == byjw.ERROR_GENERIC);
    }

    @Override // defpackage.byim
    public Boolean e() {
        return Boolean.valueOf(this.B == byjw.ERROR_LOCATION_DISABLED);
    }

    @Override // defpackage.byim
    public cqkl f() {
        this.f.a();
        return cqkl.a;
    }

    @Override // defpackage.byim
    public cqkl g() {
        this.k.a(dtyc.aX, dtyc.aY, dtyc.aV, dtyc.aW, new bykj(this)).a();
        return cqkl.a;
    }

    @Override // defpackage.byim
    public List<byif> i() {
        return dcdc.r(this.w);
    }

    @Override // defpackage.byim
    @dzsi
    public byif j() {
        return this.x;
    }

    @Override // defpackage.byim
    public byik k() {
        return this.C;
    }

    @Override // defpackage.byim
    public byii l() {
        return this.D;
    }

    @Override // defpackage.byim
    public byij m() {
        return this.E;
    }

    @Override // defpackage.byim
    public Boolean n() {
        return Boolean.valueOf(this.i.a().d());
    }

    @Override // defpackage.byim
    public byid o() {
        return this.F;
    }

    @Override // defpackage.byim
    @dzsi
    public byie p() {
        return this.t;
    }

    @Override // defpackage.byim
    public Boolean q() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.byim
    public Boolean r() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.byjx
    public void s(byjw byjwVar, byjw byjwVar2, @dzsi dlji dljiVar, dhll dhllVar, @dzsi final amte amteVar) {
        byjl byjlVar;
        List<dozz> list;
        dozs dozsVar;
        this.B = byjwVar;
        byir byirVar = null;
        if (byjwVar == byjw.SUCCESS) {
            if ((dhllVar.a & 2) != 0) {
                byjm byjmVar = this.l;
                dozz dozzVar = dhllVar.c;
                if (dozzVar == null) {
                    dozzVar = dozz.y;
                }
                vtn a = byjmVar.a.a();
                byjm.a(a, 1);
                byjm.a(dozzVar, 2);
                byjlVar = new byjl(a, dozzVar);
            } else {
                byjlVar = null;
            }
            this.u = byjlVar;
            if (this.p.a.getTrafficHubParameters().b) {
                if (amteVar != null) {
                    dvzu dvzuVar = amteVar.a.a().b;
                    if (dvzuVar == null) {
                        dvzuVar = dvzu.F;
                    }
                    if (dvzuVar.e.size() != 0) {
                        final HashSet hashSet = new HashSet();
                        dvzu dvzuVar2 = amteVar.a.a().b;
                        if (dvzuVar2 == null) {
                            dvzuVar2 = dvzu.F;
                        }
                        dpeq dpeqVar = dvzuVar2.e.get(0).f;
                        if (dpeqVar == null) {
                            dpeqVar = dpeq.m;
                        }
                        for (dozz dozzVar2 : dpeqVar.e) {
                            if (dozzVar2.b == 22) {
                                dozsVar = (dozs) dozzVar2.c;
                            } else {
                                dozsVar = dozs.q;
                            }
                            hashSet.addAll(dozsVar.k);
                        }
                        list = new ArrayList<>(dhllVar.d);
                        Collections.sort(list, new Comparator(hashSet) { // from class: bykg
                            private final Set a;

                            {
                                this.a = hashSet;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                Set set = this.a;
                                boolean A = byko.A((dozz) obj, set);
                                boolean A2 = byko.A((dozz) obj2, set);
                                if (A) {
                                    if (!A2) {
                                        return -1;
                                    }
                                    A2 = true;
                                }
                                return (A || !A2) ? 0 : 1;
                            }
                        });
                    }
                }
                list = dhllVar.d;
            } else {
                list = dhllVar.d;
            }
            this.g = list;
            dsrj<dozz> dsrjVar = dhllVar.f;
            List<dozz> list2 = this.g;
            ArrayList arrayList = new ArrayList(dsrjVar.subList(0, Math.min(dsrjVar.size(), 2)));
            this.y = arrayList.size();
            arrayList.addAll(list2);
            if (arrayList.size() <= 4) {
                this.w = byji.f(arrayList, arrayList.size(), this.d, this.e);
                this.x = null;
            } else {
                this.w = byji.f(arrayList, 3, this.d, this.e);
                this.x = this.d.a(new byny(arrayList, 3), this.e);
            }
            if (dljiVar != null) {
                final byjb byjbVar = this.o;
                dqek b = dqek.b(dljiVar.c);
                if (b == null) {
                    b = dqek.UNKNOWN_PREDICTION_JUSTIFICATION_TYPE;
                }
                String str = "";
                String string = b == dqek.LOCATION_HISTORY ? byjbVar.a.getString(R.string.ATTRIBUTION_LOCATION_HISTORY) : str;
                if (amteVar == null || amteVar.a.n() <= 0) {
                    dpjx dpjxVar = dljiVar.b;
                    if (dpjxVar == null) {
                        dpjxVar = dpjx.n;
                    }
                    final amvh O = amvh.O(dpjxVar);
                    String a2 = byjbVar.a(O);
                    if (!dbsj.d(a2)) {
                        byirVar = new byir(Boolean.valueOf(byjwVar2.a()), a2, byjb.b(O.b), "", "", "", string, null, new Runnable(byjbVar, O) { // from class: byiz
                            private final byjb a;
                            private final amvh b;

                            {
                                this.a = byjbVar;
                                this.b = O;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byjb byjbVar2 = this.a;
                                amvh amvhVar = this.b;
                                qcw x = qcx.x();
                                x.u(amvhVar);
                                x.s(dqvj.DRIVE);
                                byjbVar2.c.a().m(x.a());
                            }
                        });
                    }
                } else {
                    amve m = amteVar.a.m(0);
                    amvh f = amteVar.f();
                    String a3 = byjbVar.a(f);
                    if (!dbsj.d(a3)) {
                        Boolean valueOf = Boolean.valueOf(byjwVar2.a());
                        cqtd b2 = byjb.b(f.b);
                        doxd doxdVar = m.b().k;
                        if (doxdVar == null) {
                            doxdVar = doxd.l;
                        }
                        Resources resources = byjbVar.a.getResources();
                        dgas dgasVar = doxdVar.b;
                        if (dgasVar == null) {
                            dgasVar = dgas.e;
                        }
                        Spanned e = bvtb.e(resources, dgasVar.b, bvsz.ABBREVIATED);
                        dpej b3 = dpej.b(doxdVar.c);
                        if (b3 == null) {
                            b3 = dpej.DELAY_NODATA;
                        }
                        int Y = vyb.Y(b3, false);
                        bvsv a4 = new bvsx(byjbVar.a.getResources()).a(e);
                        a4.m(Y);
                        a4.i();
                        Spannable c = a4.c();
                        dpec b4 = m.b();
                        if (!b4.c.isEmpty()) {
                            str = byjbVar.a.getString(R.string.VIA_ROADS, b4.c);
                        }
                        dozz q = m.q();
                        alcb a5 = alcc.a();
                        a5.a = byjbVar.a;
                        a5.b = byjbVar.b;
                        a5.d = cqrp.d(14.0d).e(byjbVar.a);
                        CharSequence b5 = a5.a().b(q.m);
                        cjta b6 = cjtd.b();
                        b6.b = dbsj.f(m.k());
                        b6.g(dbsj.f(m.m()));
                        b6.d = dtyc.aU;
                        byirVar = new byir(valueOf, a3, b2, c, str, b5, string, b6.a(), new Runnable(byjbVar, amteVar) { // from class: byja
                            private final byjb a;
                            private final amte b;

                            {
                                this.a = byjbVar;
                                this.b = amteVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byjb byjbVar2 = this.a;
                                qcs v = qct.v(this.b);
                                v.b(0);
                                v.d(qbs.DEFAULT);
                                v.f();
                                byjbVar2.c.a().m(v.a(byjbVar2.c.a().e()));
                            }
                        });
                    }
                }
                this.t = byirVar;
            }
            if ((dhllVar.a & 4) != 0) {
                dpuq dpuqVar = dhllVar.e;
                if (dpuqVar == null) {
                    dpuqVar = dpuq.d;
                }
                this.z = new akqs(dpuqVar);
            }
            C();
        } else {
            this.u = null;
            B();
            this.t = null;
            D();
        }
        cqkx.p(this);
    }

    @Override // defpackage.byim
    @dzsi
    /* renamed from: t */
    public byjl h() {
        return this.u;
    }

    public void u(int i) {
    }

    public void v(int i) {
    }

    public void w() {
        this.A = true;
        C();
    }

    public void x() {
        this.A = false;
        B();
        D();
    }

    public void y() {
        if (!this.A || this.z == null) {
            return;
        }
        Rect e = this.n.e();
        akqs akqsVar = this.z;
        dbsk.s(akqsVar);
        dbsg<akyc> d = akyt.d(akqsVar, e, this.h.a().A());
        if (!d.a()) {
            return;
        }
        this.m.p(d.b());
    }

    @dzsi
    public byiw z() {
        return this.v;
    }
}

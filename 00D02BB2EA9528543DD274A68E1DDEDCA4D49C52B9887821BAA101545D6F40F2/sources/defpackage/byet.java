package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: byet  reason: default package */
/* loaded from: classes4.dex */
public final class byet extends gew implements qur {
    public byex ad;
    public efg ae;
    public cjqy af;
    public cqkj ag;
    public bykp ah;
    public qus ai;
    public cjxo aj;
    public acyp ak;
    public byjy al;
    public byko am;
    public cqkf<jbk> an;
    public cqkf<byim> ao;
    public jdi ap;
    @dzsi
    public qut aq;
    public aagc at;
    @dzsi
    private qup au;
    @dzsi
    private quy av;
    public byjz c;
    public ivt d;
    public auhi e;
    public bvjj f;
    public dxio<akfa> g;
    public boolean ar = false;
    public boolean as = false;
    private final byjh aw = new byeq(this);
    private final bykn ax = new byer(this);
    private final egq ay = new byes(this);

    private final void aS(aefv aefvVar, boolean z) {
        float f = 0.4f;
        if (!this.al.f && this.am.l().a() != byih.VISIBLE_TOP) {
            f = 0.3f;
        }
        if (z) {
            aefvVar.e(aT(f));
        } else {
            aefvVar.h(aT(f));
        }
    }

    private final int aT(float f) {
        ff J = J();
        dbsk.s(J);
        return (int) (J.getResources().getDisplayMetrics().heightPixels * f);
    }

    public static byet i(byex byexVar, boolean z, @dzsi dljj dljjVar, boolean z2, boolean z3, @dzsi qup qupVar, @dzsi quy quyVar, boolean z4) {
        byet byetVar = new byet();
        boolean z5 = false;
        if (byexVar.a() && dljjVar != null) {
            z5 = true;
        }
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putBoolean("show_notification_settings_promo", true);
        }
        if (z2) {
            bundle.putBoolean("created_from_commute_zero_state", true);
        }
        if (z3) {
            bundle.putBoolean("created_from_commute_out_of_area", true);
        }
        if (qupVar != null) {
            bundle.putBundle("commuteHubDirective", qupVar.h());
        }
        if (quyVar != null) {
            bundle.putSerializable("commuteHubState", quyVar);
        }
        if (z5) {
            dbsk.s(dljjVar);
            bvrs.k(bundle, "traffic_hub_params", dljjVar);
        }
        if (z4) {
            bundle.putBoolean("has_fragment_search_tag", true);
        }
        byetVar.B(bundle);
        return byetVar;
    }

    @Override // defpackage.gew
    protected final void Qm() {
        if (!this.aD) {
            return;
        }
        this.am.y();
    }

    @Override // defpackage.qur
    @dzsi
    public final quy aJ() {
        return this.av;
    }

    @Override // defpackage.ges, defpackage.ggg
    public final /* bridge */ /* synthetic */ List aO() {
        return this.o.getBoolean("has_fragment_search_tag", false) ? dcdc.f(gfs.HOMETAB) : dcdc.e();
    }

    @Override // defpackage.qur
    public final void aR() {
        aS((aefv) this.ao.c(), true);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<byim> c = this.ag.c(new byic(), null);
        this.ao = c;
        final aefv aefvVar = (aefv) c.c();
        aS(aefvVar, false);
        qut qutVar = this.aq;
        if (qutVar != null) {
            qutVar.a(viewGroup, this.am.z(), new mw(this, aefvVar) { // from class: byen
                private final byet a;
                private final aefv b;

                {
                    this.a = this;
                    this.b = aefvVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    byet byetVar = this.a;
                    aefv aefvVar2 = this.b;
                    Integer num = (Integer) obj;
                    byetVar.am.u(num.intValue());
                    aefvVar2.setMinExposurePixels(num.intValue() + jmj.a(byetVar.J(), 173));
                }
            }, new mw(this) { // from class: byeo
                private final byet a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.am.v(((Integer) obj).intValue());
                }
            });
        }
        aefvVar.setShowGrippy(true);
        aefvVar.setShouldUseRoundedCornersShadow(true);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        dbsk.s(bundle2);
        this.ar = bundle2.getBoolean("created_from_commute_zero_state");
        this.as = bundle2.getBoolean("created_from_commute_out_of_area");
        Bundle bundle3 = bundle2.getBundle("commuteHubDirective");
        if (bundle3 != null) {
            this.au = qup.i(bundle3);
        }
        this.av = (quy) bundle2.getSerializable("commuteHubState");
        dljj dljjVar = this.ad.a() ? (dljj) bvrs.f(bundle2, "traffic_hub_params", (dssr) dljj.b.cu(7)) : null;
        byjz byjzVar = this.c;
        dxio a = ((dxjh) byjzVar.a).a();
        byjz.a(a, 1);
        axru a2 = byjzVar.b.a();
        byjz.a(a2, 2);
        btrm a3 = byjzVar.c.a();
        byjz.a(a3, 3);
        btvo a4 = byjzVar.d.a();
        byjz.a(a4, 4);
        byiq a5 = byjzVar.e.a();
        byjz.a(a5, 5);
        byjf a6 = byjzVar.f.a();
        byjz.a(a6, 6);
        byjy byjyVar = new byjy(a, a2, a3, a4, a5, a6, dljjVar);
        this.al = byjyVar;
        if (bundle != null) {
            byje byjeVar = byjyVar.c;
            byjeVar.m = (amte) bundle.getSerializable("directions_storage_item");
            if (byjeVar.m != null) {
                byjeVar.n = byjw.SUCCESS;
            }
            byip byipVar = byjyVar.b;
            long j = bundle.getLong("last_success_time", 0L);
            dhll dhllVar = (dhll) bvrs.e(bundle, dhll.class, (dssr) dhll.g.cu(7));
            byipVar.a = j;
            if (dhllVar == null || !byipVar.b()) {
                byipVar.c = dhll.g;
                byipVar.a = -1L;
            } else {
                byipVar.c = dhllVar;
                byipVar.d = byjw.SUCCESS;
            }
        }
        bykp bykpVar = this.ah;
        byjh byjhVar = this.aw;
        bykn byknVar = this.ax;
        boolean z = this.ar;
        boolean z2 = this.as;
        Activity activity = (Activity) ((dxjd) bykpVar.a).a;
        bykp.a(activity, 1);
        dxio a7 = ((dxjh) bykpVar.b).a();
        bykp.a(a7, 2);
        bynx a8 = bykpVar.c.a();
        bykp.a(a8, 3);
        bsvm a9 = bykpVar.d.a();
        bykp.a(a9, 4);
        ascb a10 = bykpVar.e.a();
        bykp.a(a10, 5);
        gun a11 = bykpVar.f.a();
        bykp.a(a11, 6);
        byjj a12 = bykpVar.g.a();
        bykp.a(a12, 7);
        byjm a13 = bykpVar.h.a();
        bykp.a(a13, 8);
        akpm a14 = bykpVar.i.a();
        bykp.a(a14, 9);
        dxio a15 = ((dxjh) bykpVar.j).a();
        bykp.a(a15, 10);
        gll a16 = bykpVar.k.a();
        bykp.a(a16, 11);
        byjv a17 = bykpVar.l.a();
        bykp.a(a17, 12);
        byjr a18 = bykpVar.m.a();
        bykp.a(a18, 13);
        byjb a19 = bykpVar.n.a();
        bykp.a(a19, 14);
        byex a20 = bykpVar.o.a();
        bykp.a(a20, 15);
        dxio a21 = ((dxjh) bykpVar.p).a();
        bykp.a(a21, 16);
        dxio a22 = ((dxjh) bykpVar.q).a();
        bykp.a(a22, 17);
        byjs a23 = bykpVar.r.a();
        bykp.a(a23, 18);
        byix a24 = bykpVar.s.a();
        bykp.a(a24, 19);
        acyp a25 = bykpVar.t.a();
        bykp.a(a25, 20);
        bykp.a(this, 21);
        bykp.a(byjhVar, 22);
        bykp.a(byknVar, 23);
        this.am = new byko(activity, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, this, byjhVar, byknVar, z, z2);
        if (this.ar || this.as) {
            this.aq = this.ai.a(this, null);
        } else {
            this.an = this.ag.c(new hxj(), null);
            boolean z3 = bundle2.getBoolean("show_notification_settings_promo", false);
            cqkf<jbk> cqkfVar = this.an;
            if (cqkfVar != null && z3) {
                cqkfVar.c().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: byem
                    private final byet a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        View findViewById;
                        byet byetVar = this.a;
                        if (byetVar.aD && (findViewById = byetVar.an.c().findViewById(R.id.action_buttons)) != null) {
                            int[] iArr = new int[2];
                            findViewById.getLocationOnScreen(iArr);
                            int width = iArr[0] + (findViewById.getWidth() / 2);
                            int height = iArr[1] + findViewById.getHeight();
                            jdi jdiVar = byetVar.ap;
                            if (jdiVar == null) {
                                final bysg bysgVar = new bysg(byetVar.af);
                                byetVar.ap = new jdi(byetVar.J(), jdo.TOP, new PopupWindow.OnDismissListener(bysgVar) { // from class: byep
                                    private final bysg a;

                                    {
                                        this.a = bysgVar;
                                    }

                                    @Override // android.widget.PopupWindow.OnDismissListener
                                    public final void onDismiss() {
                                        bysg bysgVar2 = this.a;
                                        if (!bysgVar2.b) {
                                            bysgVar2.a.i(cjtd.a(dtyi.r));
                                        }
                                    }
                                });
                                cqkf c = byetVar.ag.c(new byqp(), null);
                                byetVar.ap.c(c.c());
                                c.e(new bysh(byetVar.Rn(), byetVar.e, byetVar.ap, bysgVar));
                                byetVar.ap.d(findViewById, width, height);
                                return;
                            }
                            jdiVar.e(width, height);
                        }
                    }
                });
            }
        }
        if (!this.g.a().d()) {
            this.f.Z(bvjk.db, this.f.w(bvjk.db, 0L) + 1);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyc.aZ;
    }

    @Override // defpackage.qur
    public final qux q() {
        return null;
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.ak.d()) {
            this.aj.a(1);
        }
        qut qutVar = this.aq;
        if (qutVar != null) {
            qutVar.b();
        }
        byjy byjyVar = this.al;
        byjyVar.d = this.am;
        byje byjeVar = byjyVar.c;
        byjeVar.o = byjyVar;
        btrm btrmVar = byjeVar.j;
        dceq a = dcet.a();
        a.b(srf.class, new byjg(srf.class, byjeVar, bvrj.UI_THREAD));
        btrmVar.g(byjeVar, a.a());
        byjyVar.b.e = byjyVar;
        byjyVar.b();
        btrm btrmVar2 = byjyVar.e;
        dceq a2 = dcet.a();
        a2.b(amqo.class, new byka(amqo.class, byjyVar, bvrj.UI_THREAD));
        btrmVar2.g(byjyVar, a2.a());
        cqkf<jbk> cqkfVar = this.an;
        if (cqkfVar != null) {
            cqkfVar.e(this.am);
        }
        this.ao.e(this.am);
        float f = true != this.al.f ? 0.3f : 0.4f;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.H((aefv) this.ao.c());
        egjVar.N(aT(f));
        ff J = J();
        egjVar.D(J == null ? 0 : ise.b.NR(J));
        egjVar.w(null);
        egjVar.Q(this.d.a(this));
        egjVar.ac();
        egjVar.A(byew.a());
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.k(this.ak.d());
        egjVar.J(this.ay);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        qut qutVar2 = this.aq;
        if (qutVar2 != null) {
            qutVar2.e(egjVar);
        } else {
            cqkf<jbk> cqkfVar2 = this.an;
            if (cqkfVar2 != null) {
                egjVar.F(cqkfVar2.c());
            }
        }
        this.ae.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        amte amteVar;
        super.t(bundle);
        byjy byjyVar = this.al;
        byip byipVar = byjyVar.b;
        if (byipVar.d == byjw.SUCCESS && !dhll.g.equals(byipVar.c)) {
            bvrs.l(bundle, byipVar.c);
            bundle.putLong("last_success_time", byipVar.a);
        }
        byje byjeVar = byjyVar.c;
        if (byjeVar.n != byjw.SUCCESS || (amteVar = byjeVar.m) == null) {
            return;
        }
        bundle.putSerializable("directions_storage_item", amteVar);
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void u() {
        byjy byjyVar = this.al;
        byjyVar.e.a(byjyVar);
        byjyVar.d = null;
        byje byjeVar = byjyVar.c;
        byjeVar.j.a(byjeVar);
        byjeVar.o = null;
        byjyVar.b.e = null;
        qut qutVar = this.aq;
        if (qutVar != null) {
            qutVar.c();
        }
        cqkf<jbk> cqkfVar = this.an;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<byim> cqkfVar2 = this.ao;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        this.am.x();
        if (this.ak.d()) {
            this.aj.b();
        }
        super.u();
    }

    @Override // defpackage.qur
    @dzsi
    public final qup w() {
        return this.au;
    }
}

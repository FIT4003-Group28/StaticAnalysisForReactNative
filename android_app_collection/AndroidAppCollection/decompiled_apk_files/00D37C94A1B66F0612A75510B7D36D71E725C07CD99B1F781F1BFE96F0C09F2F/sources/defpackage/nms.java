package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.util.InterceptTouchListenerLinearLayout;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: nms  reason: default package */
/* loaded from: classes3.dex */
public final class nms implements nml {
    private yye A;
    public final nnb a;
    public final nnn b;
    public final nng c;
    public final nsj d;
    public final boolean e;
    public final aadd f;
    public final aafo g;
    public RelativeLayout h;
    public RelativeLayout i;
    public nmj j;
    private final Activity k;
    private final acud l;
    private final acud m;
    private final nqk n;
    private final int o;
    private final nmh p;
    private final nne q;
    private final nmw r;
    private final ampq s;
    private final ampq t;
    private FrameLayout u;
    private InterceptTouchListenerLinearLayout v;
    private boolean w;
    private boolean x;
    private nmc y;
    private final aacz z;

    public nms(Activity activity, nsj nsjVar, acud acudVar, acud acudVar2, nqk nqkVar, nmh nmhVar, nmw nmwVar, aadd aaddVar, nnb nnbVar, nnn nnnVar, nng nngVar, aafo aafoVar, aacz aaczVar, ampq ampqVar, ampq ampqVar2, nne nneVar) {
        this.k = activity;
        this.d = nsjVar;
        this.l = acudVar;
        this.m = acudVar2;
        this.n = nqkVar;
        this.a = nnbVar;
        this.b = nnnVar;
        this.c = nngVar;
        this.o = activity.getResources().getDimensionPixelSize(R.dimen.engagement_panel_header_drop_shadow_elevation);
        this.f = aaddVar;
        this.p = nmhVar;
        this.q = nneVar;
        this.r = nmwVar;
        this.g = aafoVar;
        this.z = aaczVar;
        this.e = eog.aC(aaczVar);
        this.s = ampqVar;
        this.t = ampqVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.nmc K(defpackage.apzg r23, defpackage.nlz r24, boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nms.K(apzg, nlz, boolean, boolean, boolean):nmc");
    }

    private static apzg L(apzg apzgVar) {
        if (apzgVar.qn(atno.b)) {
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            aopg aopgVar = atno.b;
            aopa mo52toBuilder = ((atnp) apzgVar.qm(atno.b)).mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            atnp atnpVar = (atnp) mo52toBuilder.instance;
            atnpVar.b &= -2;
            atnpVar.c = atnp.a.c;
            aopcVar.e(aopgVar, (atnp) mo52toBuilder.mo39build());
            return (apzg) aopcVar.mo39build();
        }
        return apzgVar;
    }

    private final void M(nmc nmcVar, boolean z) {
        nmc nmcVar2 = this.y;
        if (true != z) {
            nmcVar = null;
        }
        if (nmcVar2 == nmcVar) {
            return;
        }
        this.y = nmcVar;
        nqk nqkVar = this.n;
        nqkVar.d = nmcVar;
        for (nqj nqjVar : nqkVar.a) {
            nqjVar.g(nmcVar);
        }
        nqkVar.b.c(ampq.i(nmcVar));
    }

    private final void N(List list) {
        aqvq aqvqVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqvm aqvmVar = (aqvm) it.next();
            if (aqvmVar.b == 138681066) {
                aqvqVar = (aqvq) aqvmVar.c;
            } else {
                aqvqVar = aqvq.b;
            }
            q(aqvqVar);
        }
    }

    private final void O(nmx nmxVar) {
        boolean z;
        nlx b = nmxVar.b.b();
        if (this.e) {
            z = this.c.f();
        } else {
            z = this.b.b() > 1;
        }
        b.e(z);
        nmxVar.a(2);
        acti F = F();
        if (F != null) {
            F.n(new acte(actj.ENGAGEMENT_PANEL_CLOSE_BUTTON));
        }
        M(nmxVar.b, true);
        zag.h(this.k);
    }

    @Override // defpackage.nml
    public final boolean A(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) {
        String i = i();
        if (!showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.i || amps.e(i) || G(i).f() != nmk.ACTIVELY_ENGAGING) {
            return false;
        }
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 256) == 0) {
            return true;
        }
        aafo aafoVar = this.g;
        apzg apzgVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.j;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
        return true;
    }

    @Override // defpackage.nml
    public final void B(apzg apzgVar) {
        d(apzgVar, null);
    }

    @Override // defpackage.nml
    public final void C(apzg apzgVar) {
        nni.c(this, apzgVar, null, false);
    }

    @Override // defpackage.nml
    public final yye D() {
        if (this.A == null) {
            nmr nmrVar = new nmr(this);
            nmrVar.l(nmrVar.a.d.a.b(null));
            this.A = nmrVar;
        }
        return this.A;
    }

    @Override // defpackage.nml
    public final /* synthetic */ void E(aqvq aqvqVar) {
        nni.d(this, aqvqVar, null, true);
    }

    public final acti F() {
        nmx c;
        if (this.e) {
            c = (nmx) this.c.b().f();
        } else {
            c = this.b.c();
        }
        if (c != null) {
            return c.b.j();
        }
        return null;
    }

    final ampq G(String str) {
        return ampq.i(this.a.a(str)).b(meo.i);
    }

    public final void H(boolean z) {
        nmc nmcVar = null;
        if (this.e) {
            if (z || !this.c.h(1)) {
                nng nngVar = this.c;
                int size = nngVar.a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((nnf) nngVar.a.pop()).d();
                }
                nngVar.c.c(amon.a);
            }
            ampq b = this.c.b();
            if (b.h()) {
                nmcVar = ((nmx) b.c()).b;
            }
            M(nmcVar, b.h());
            zag.h(this.k);
            return;
        }
        asxj asxjVar = this.z.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.aN) {
            ampq i = ampq.i(this.b.b.descendingIterator());
            if (i.h() && this.b.b() != 0) {
                while (((Iterator) i.c()).hasNext()) {
                    nmx nmxVar = (nmx) ((Iterator) i.c()).next();
                    if (nmxVar != null) {
                        nmxVar.a(4);
                    }
                    M(nmxVar == null ? null : nmxVar.b, false);
                }
                zag.h(this.k);
                return;
            }
            M(null, false);
            return;
        }
        nmx c = this.b.c();
        if (c != null) {
            c.a(4);
        }
        if (c != null) {
            nmcVar = c.b;
        }
        M(nmcVar, false);
        zag.h(this.k);
    }

    public final void I(boolean z) {
        ampq c = this.c.c();
        if (this.i == null || !c.h()) {
            H(z);
            return;
        }
        nmc nmcVar = ((nmx) c.c()).b;
        this.c.h(2);
        DefaultWatchPanelViewController defaultWatchPanelViewController = (DefaultWatchPanelViewController) this.j;
        defaultWatchPanelViewController.m.e(8);
        defaultWatchPanelViewController.m.g(8, defaultWatchPanelViewController.e.h().i);
        defaultWatchPanelViewController.l = nmcVar;
        M(nmcVar, true);
        zag.h(this.k);
    }

    public final void J(boolean z) {
        InterceptTouchListenerLinearLayout interceptTouchListenerLinearLayout = this.v;
        if (interceptTouchListenerLinearLayout == null) {
            return;
        }
        interceptTouchListenerLinearLayout.setElevation(z ? this.o : 0.0f);
    }

    @Override // defpackage.nml
    public final View a() {
        return this.u;
    }

    @Override // defpackage.nml
    public final nmc b(String str) {
        nmx a = this.a.a(str);
        if (a == null) {
            return null;
        }
        return a.b;
    }

    @Override // defpackage.nml
    public final nmc c() {
        if (this.e) {
            return (nmc) this.c.b().b(meo.k).f();
        }
        nmx c = this.b.c();
        if (c == null) {
            return null;
        }
        return c.b;
    }

    @Override // defpackage.nml
    public final nmc d(apzg apzgVar, nlz nlzVar) {
        return K(this.m.f(L(apzgVar)), nlzVar, false, false, false);
    }

    @Override // defpackage.nml
    public final /* synthetic */ nmc e(apzg apzgVar, nlz nlzVar, boolean z) {
        return nni.c(this, apzgVar, nlzVar, z);
    }

    @Override // defpackage.nml
    public final nmc f(apzg apzgVar, nlz nlzVar, boolean z, boolean z2) {
        return K(this.l.f(L(apzgVar)), nlzVar, true, z, z2);
    }

    @Override // defpackage.nml
    public final nqk g() {
        return this.n;
    }

    @Override // defpackage.nml
    public final nsj h() {
        return this.d;
    }

    @Override // defpackage.nml
    public final String i() {
        if (this.e) {
            return (String) this.c.b().b(meo.j).f();
        }
        nmx c = this.b.c();
        if (c == null) {
            return null;
        }
        return c.a;
    }

    @Override // defpackage.nml
    public final void j(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        relativeLayout.getClass();
        if (this.h != relativeLayout) {
            this.x = false;
        }
        this.h = relativeLayout;
        this.i = relativeLayout2;
        if (this.s.h()) {
            final nqn nqnVar = (nqn) this.s.c();
            if (eog.aE(nqnVar.d)) {
                aynx.e(nqnVar.c.a, nqnVar.b.b, new aypx() { // from class: nql
                    @Override // defpackage.aypx
                    public final Object a(Object obj, Object obj2) {
                        return nqn.this.a((nqq) obj, (ampq) obj2);
                    }
                }).G(nqnVar.a).Z(new ayqb() { // from class: nqm
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        nml nmlVar = nml.this;
                        ampq ampqVar = (ampq) obj;
                        if (!ampqVar.h()) {
                            return;
                        }
                        String str = (String) ampqVar.c();
                        while (nmlVar.i() != null && !Objects.equals(nmlVar.i(), str)) {
                            nmlVar.m();
                        }
                        nmlVar.n(new eqa(str, 2));
                    }
                });
            }
        }
        this.w = true;
    }

    @Override // defpackage.nml
    public final void k() {
        nmx c;
        if (this.e) {
            c = (nmx) this.c.b().f();
        } else {
            c = this.b.c();
        }
        if (c != null) {
            c.b.m();
        }
    }

    @Override // defpackage.nml
    public final void l(WatchNextResponseModel watchNextResponseModel) {
        asgt asgtVar = watchNextResponseModel.a;
        if (asgtVar.q.size() > 0) {
            N(asgtVar.q);
        }
        if (asgtVar.r.size() > 0) {
            N(asgtVar.r);
        }
        if (this.t.h()) {
            ((npz) this.t.c()).a();
        }
    }

    @Override // defpackage.nml
    public final void m() {
        n(mem.j);
    }

    @Override // defpackage.nml
    public final void n(ampt amptVar) {
        o(amptVar, true);
    }

    @Override // defpackage.nml
    public final void o(ampt amptVar, boolean z) {
        nmx c;
        if (this.e) {
            if (this.c.a() == 0) {
                return;
            }
        } else if (this.b.b() == 0) {
            return;
        }
        if (!amptVar.a(i())) {
            return;
        }
        if (!this.e ? this.b.h(z) : this.c.i()) {
            if (this.e) {
                c = (nmx) this.c.b().f();
            } else {
                c = this.b.c();
            }
            if (c == null) {
                return;
            }
            O(c);
            J(c.b.b().k());
            return;
        }
        H(true);
    }

    @Override // defpackage.nml
    public final void p() {
        I(false);
    }

    @Override // defpackage.nml
    public final void q(aqvq aqvqVar) {
        boolean z = false;
        if ((aqvqVar.c & 262144) != 0 && aqvqVar.u) {
            z = true;
        }
        nni.d(this, aqvqVar, null, z);
    }

    @Override // defpackage.nml
    public final void r(aqvq aqvqVar, asjj asjjVar) {
        boolean z = false;
        if ((aqvqVar.c & 262144) != 0 && aqvqVar.u) {
            z = true;
        }
        nni.d(this, aqvqVar, asjjVar, z);
    }

    @Override // defpackage.nml
    public final void s(aqvq aqvqVar, asjj asjjVar, boolean z, apzg apzgVar, boolean z2) {
        boolean z3;
        nmc a;
        auqh auqhVar;
        String d = ntr.d(aqvqVar);
        if (amps.e(d)) {
            return;
        }
        if (!z && this.a.b(d)) {
            return;
        }
        nmx a2 = this.a.b(d) ? this.a.a(d) : null;
        if (a2 != null && a2.b.u(aqvqVar, apzgVar)) {
            if (apzgVar == null) {
                return;
            }
            a2.e = apzgVar;
            return;
        }
        nmw nmwVar = this.r;
        if (fyv.e(aqvqVar) != null) {
            a = (nmc) nmwVar.a.get();
        } else {
            aqvo aqvoVar = aqvqVar.g;
            if (aqvoVar == null) {
                aqvoVar = aqvo.a;
            }
            boolean z4 = false;
            if (aqvoVar.b == 49399797) {
                aqvo aqvoVar2 = aqvqVar.g;
                if (aqvoVar2 == null) {
                    aqvoVar2 = aqvo.a;
                }
                if (aqvoVar2.b == 49399797) {
                    auqhVar = (auqh) aqvoVar2.c;
                } else {
                    auqhVar = auqh.a;
                }
                if (auqhVar.d.size() > 0 && (((auqk) auqhVar.d.get(0)).e & 64) != 0) {
                    a = (nmc) nmwVar.g.get();
                }
            }
            aqvo aqvoVar3 = aqvqVar.g;
            if (aqvoVar3 == null) {
                aqvoVar3 = aqvo.a;
            }
            if (aqvoVar3.b == 154115041) {
                a = (nmc) nmwVar.h.get();
            } else {
                aqvo aqvoVar4 = aqvqVar.g;
                if (aqvoVar4 == null) {
                    aqvoVar4 = aqvo.a;
                }
                if (aqvoVar4.b != 371777145) {
                    Boolean bool = Boolean.TRUE;
                    aqxe aqxeVar = nmwVar.k.a.b().C;
                    if (aqxeVar == null) {
                        aqxeVar = aqxe.a;
                    }
                    int i = 1;
                    if (aqxeVar.a(45358147L)) {
                        aoqp aoqpVar = aqxeVar.b;
                        if (!aoqpVar.containsKey(45358147L)) {
                            throw new IllegalArgumentException();
                        }
                        aqxf aqxfVar = (aqxf) aoqpVar.get(45358147L);
                        if (aqxfVar.b == 1) {
                            z4 = ((Boolean) aqxfVar.c).booleanValue();
                        }
                        z3 = Boolean.valueOf(z4);
                    } else {
                        z3 = false;
                    }
                    if (bool.equals(z3)) {
                        int A = amnt.A(aqvqVar.m);
                        if (A != 0) {
                            i = A;
                        }
                        if (i - 1 == 2) {
                            a = nmwVar.c.a(nmwVar.e);
                        } else {
                            a = nmwVar.c.a(z2 ? nmwVar.f : nmwVar.d);
                        }
                    } else {
                        int A2 = amnt.A(aqvqVar.m);
                        if (A2 != 0) {
                            i = A2;
                        }
                        if (i - 1 == 2) {
                            a = nmwVar.b.a(nmwVar.e);
                        } else {
                            a = nmwVar.b.a(z2 ? nmwVar.f : nmwVar.d);
                        }
                    }
                } else {
                    a = (nmc) nmwVar.i.get();
                }
            }
        }
        if (nmwVar.j.h()) {
            a.oY((ajrt) nmwVar.j.c());
        }
        a.p(aqvqVar, asjjVar);
        nnb nnbVar = this.a;
        a.oY(new nmz(d, 2));
        nna nnaVar = (nna) nnbVar.d.put(d, new nna(nnbVar, d, a));
        if (nnaVar == null) {
            return;
        }
        nnaVar.b();
    }

    @Override // defpackage.nml
    public final void t() {
        nnb nnbVar = this.a;
        HashSet hashSet = new HashSet();
        for (nna nnaVar : nnbVar.d.values()) {
            if (!nnbVar.c.c(nnaVar.a)) {
                hashSet.add(nnaVar.a);
                nnaVar.b();
            }
        }
        nnbVar.d.keySet().removeAll(hashSet);
        nmx c = this.b.c();
        boolean z = false;
        boolean z2 = !this.e && (this.b.b() > 1 || c == null || this.a.a(c.a) == null || c.c == 5);
        ampq b = this.c.b();
        if (this.e && (this.c.a() > 1 || !b.h() || this.a.a(((nmx) b.c()).a) == null || ((nmx) b.c()).c == 5)) {
            z = true;
        }
        if (z2 || z) {
            this.b.d();
            nng nngVar = this.c;
            Iterator it = nngVar.a.iterator();
            while (it.hasNext()) {
                nnf nnfVar = (nnf) it.next();
                Iterator it2 = nnfVar.b.iterator();
                while (it2.hasNext()) {
                    ((nmx) it2.next()).a(5);
                }
                nnfVar.b.clear();
                nnfVar.a.clear();
            }
            nngVar.a.clear();
            nngVar.c.c(amon.a);
            nmh nmhVar = this.p;
            if (nmhVar.l != null) {
                nmhVar.m.j(nmhVar);
                ((LinearLayout) nmhVar.l.b).animate().cancel();
                ((FrameLayout) nmhVar.m.b).animate().cancel();
                ((LinearLayout) nmhVar.n.b).animate().cancel();
                nmhVar.e(null);
                nmhVar.f(null);
            }
            RelativeLayout relativeLayout = this.h;
            if (relativeLayout != null) {
                relativeLayout.animate().cancel();
            }
            H(true);
        }
    }

    @Override // defpackage.nml
    public final void u(nmj nmjVar) {
        this.j = nmjVar;
    }

    @Override // defpackage.nml
    public final void v(String str, boolean z) {
        nmx a = this.a.a(str);
        if (a == null) {
            return;
        }
        nmk nmkVar = z ? nmk.ACTIVELY_ENGAGING : nmk.NOT_ENGAGING;
        if (nmkVar == a.d) {
            return;
        }
        a.d = nmkVar;
        acti j = a.b.j();
        asvv b = acun.b(a.b.l());
        if (j == null || b == null) {
            return;
        }
        boolean z2 = true;
        if ((b.c & 1) == 0) {
            return;
        }
        acte acteVar = new acte(b.d);
        nmk nmkVar2 = a.d;
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asjd.a.createBuilder();
        String str2 = a.a;
        createBuilder2.copyOnWrite();
        asjd asjdVar = (asjd) createBuilder2.instance;
        str2.getClass();
        asjdVar.b |= 1;
        asjdVar.c = str2;
        if (nmkVar2 != nmk.ACTIVELY_ENGAGING) {
            z2 = false;
        }
        createBuilder2.copyOnWrite();
        asjd asjdVar2 = (asjd) createBuilder2.instance;
        asjdVar2.b |= 2;
        asjdVar2.d = z2;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asjd asjdVar3 = (asjd) createBuilder2.mo39build();
        asjdVar3.getClass();
        asjjVar.A = asjdVar3;
        asjjVar.c |= 131072;
        j.w(acteVar, (asjj) createBuilder.mo39build());
    }

    @Override // defpackage.nml
    public final boolean w(String str) {
        if (this.e) {
            nnf nnfVar = (nnf) this.c.a.peek();
            return nnfVar != null && nnfVar.h(str);
        }
        return this.b.g(str);
    }

    @Override // defpackage.nml
    public final boolean x(String str) {
        return this.a.b(str);
    }

    @Override // defpackage.nml
    public final boolean y() {
        return this.y != null;
    }

    @Override // defpackage.nml
    public final boolean z(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) {
        String str = hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 1 ? (String) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d : "";
        String i = i();
        if (!hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.e || amps.e(i) || !akzj.f(i, str) || G(i).f() != nmk.ACTIVELY_ENGAGING) {
            return false;
        }
        if ((hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.b & 8) != 0) {
            aafo aafoVar = this.g;
            apzg apzgVar = hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        }
        return true;
    }
}

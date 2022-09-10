package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: chac  reason: default package */
/* loaded from: classes4.dex */
public class chac implements cgwd, chbg, cgze, cgyo {
    private final cgrp A;
    private final cgrn B;
    private final cgrl C;
    private final cgtw D;
    private final jkh E;
    private final ges H;
    private final isd J;
    @dzsi
    public dspd a;
    public final cjqy c;
    @dzsi
    public final transient cgzz e;
    @dzsi
    public transient isc f;
    private final int g;
    private final chbm h;
    private final chat i;
    @dzsi
    private dwsr j;
    private final cgzf q;
    private final cges r;
    private final cgyp s;
    private final Activity u;
    private final cgep v;
    private final akpm w;
    private final btvo x;
    private final ahjq y;
    private final cgrr z;
    private List<cgsk> k = dcdc.e();
    private List<cgwi> l = dcdc.e();
    private List<cgwi> m = dcdc.e();
    private final chaa n = new chaa(this);
    public final Set<cgwi> b = dcnm.c();
    private final ArrayDeque<cgwi> o = new ArrayDeque<>();
    private final ArrayDeque<cgwi> p = new ArrayDeque<>();
    public int d = -1;
    private boolean F = false;
    private boolean G = false;
    private final jco t = new chab(this);
    private jjn I = jjn.HIDDEN;

    public chac(Activity activity, chbm chbmVar, cgyq cgyqVar, cgzg cgzgVar, chat chatVar, cgep cgepVar, cges cgesVar, btvo btvoVar, akpm akpmVar, isd isdVar, ahjq ahjqVar, cjqy cjqyVar, @dzsi cgzz cgzzVar, cgrr cgrrVar, cgrp cgrpVar, cgrn cgrnVar, cgrl cgrlVar, cgtw cgtwVar, ges gesVar) {
        this.h = chbmVar;
        this.i = chatVar;
        this.v = cgepVar;
        this.r = cgesVar;
        this.w = akpmVar;
        this.J = isdVar;
        this.x = btvoVar;
        this.y = ahjqVar;
        this.c = cjqyVar;
        this.e = cgzzVar;
        this.z = cgrrVar;
        this.A = cgrpVar;
        this.B = cgrnVar;
        this.C = cgrlVar;
        this.D = cgtwVar;
        this.H = gesVar;
        this.u = activity;
        this.g = btvoVar.getUgcTasksParameters().b;
        Activity activity2 = (Activity) ((dxjd) cgyqVar.a).a;
        cgyq.a(activity2, 1);
        btvo a = cgyqVar.b.a();
        cgyq.a(a, 2);
        gga a2 = cgyqVar.c.a();
        cgyq.a(a2, 3);
        axwy a3 = cgyqVar.d.a();
        cgyq.a(a3, 4);
        cjqy a4 = cgyqVar.e.a();
        cgyq.a(a4, 5);
        dxio a5 = ((dxjh) cgyqVar.f).a();
        cgyq.a(a5, 6);
        cgyq.a(this, 7);
        cgyp cgypVar = new cgyp(activity2, a, a2, a3, a4, a5, this);
        this.s = cgypVar;
        this.E = new jkl(cgypVar);
        Activity activity3 = (Activity) ((dxjd) cgzgVar.a).a;
        cgzg.a(activity3, 1);
        cgtn a6 = cgzgVar.b.a();
        cgzg.a(a6, 2);
        bsvm a7 = cgzgVar.c.a();
        cgzg.a(a7, 3);
        cgzg.a(this, 4);
        this.q = new cgzf(activity3, a6, a7, this);
    }

    private final void aa(View view, List<jho> list) {
        isc iscVar = this.f;
        if (iscVar != null) {
            iscVar.dismiss();
        }
        isc a = this.J.a(view);
        a.a(list);
        a.setOnDismissListener(new cgzs(this));
        a.show();
        this.f = a;
    }

    private final void ac(boolean z, @dzsi dwpc dwpcVar, @dzsi akqs akqsVar) {
        akqs akqsVar2;
        cgzz cgzzVar;
        if (z) {
            HashSet hashSet = new HashSet();
            for (cgwa cgwaVar : this.q.b()) {
                if (cgwaVar.b().booleanValue()) {
                    hashSet.add(cgwaVar.f());
                }
            }
            this.m = new ArrayList();
            for (cgwi cgwiVar : this.l) {
                if (cgwiVar.j(hashSet)) {
                    this.m.add(cgwiVar);
                }
            }
        }
        cgwi H = H();
        this.d = -1;
        if (akqsVar == null) {
            akqsVar2 = null;
        } else {
            akqq c = akqsVar.c();
            akqq akqqVar = akqsVar.b;
            double d = akqqVar.a;
            akqq akqqVar2 = akqsVar.a;
            double d2 = d - akqqVar2.a;
            double d3 = akqqVar.b - akqqVar2.b;
            akqsVar2 = new akqs(c, d2 + d2, d3 + d3);
        }
        HashSet hashSet2 = new HashSet();
        for (cgwa cgwaVar2 : this.q.a()) {
            if (cgwaVar2.b().booleanValue()) {
                hashSet2.add(cgwaVar2.f());
            }
        }
        dccx F = dcdc.F();
        boolean z2 = false;
        int i = 0;
        for (cgwi cgwiVar2 : this.m) {
            if (z2 && i > this.g) {
                break;
            } else if (i <= this.g || cgwiVar2.y()) {
                z2 |= cgwiVar2.y();
                akqq aj = cgwiVar2.z().aj();
                if (aj == null || akqsVar2 == null || akqsVar2.b(aj)) {
                    cgwiVar2.i(hashSet2);
                    if (!cgwiVar2.f().isEmpty()) {
                        if (cgwiVar2 == H) {
                            this.d = i;
                        }
                        i++;
                        F.g(cgwiVar2);
                    }
                }
            }
        }
        this.n.a(F.f());
        if (dwpcVar != null) {
            U(dwpcVar);
        } else if (this.d == -1 && (cgzzVar = this.e) != null) {
            ((cgdv) cgzzVar).bw(-1);
        }
        cqkx.p(this);
    }

    @dzsi
    public dwsr A() {
        return this.j;
    }

    @dzsi
    public dspd B() {
        return this.a;
    }

    @dzsi
    public dwrc C() {
        return cguq.f(this.j, this.a);
    }

    public List<cgsk> D() {
        return this.k;
    }

    public cgwb E() {
        return this.q;
    }

    public List<cgwa> F() {
        return this.q.a();
    }

    public List<akqq> G() {
        return dcbg.b(this.n.a).s(cgzp.a).s(new cgzw()).o(cgzq.a).s(cgzr.a).z();
    }

    @dzsi
    public cgwi H() {
        int i = this.d;
        if (i == -1 || i >= this.n.a.size()) {
            return null;
        }
        return this.n.a.get(this.d);
    }

    @Override // defpackage.chbg
    public void I(cgwg cgwgVar, final cgwi cgwiVar) {
        cgzz cgzzVar = this.e;
        if (cgzzVar != null && cgwgVar.t() != cgwf.EDITABLE) {
            final cgdv cgdvVar = (cgdv) cgzzVar;
            if (cgdvVar.ad.i == cgem.DOOR_TO_DOOR_NOTIFICATION && !cgdvVar.ad.k) {
                cgdvVar.aQ.c(ddos.UGC_HOME_STREET).a(null);
            }
            cgdvVar.ad.k = true;
            chac chacVar = cgdvVar.e;
            dbsk.s(chacVar);
            if (cgwiVar != chacVar.H() || cgdvVar.ah || cgwiVar.h(cgwf.EDITABLE).intValue() != 0) {
                cgdvVar.bz();
            } else {
                dwrc C = cgdvVar.e.C();
                if (C != null) {
                    dwqz dwqzVar = C.c;
                    if (dwqzVar == null) {
                        dwqzVar = dwqz.g;
                    }
                    if ((dwqzVar.a & 16) != 0 && !cgdvVar.aX.m(bvjk.gR, false) && cgdvVar.ad.i == cgem.DOOR_TO_DOOR_NOTIFICATION) {
                        gdf gdfVar = new gdf(((fd) cgzzVar).J(), 16973942);
                        gdfVar.setCanceledOnTouchOutside(false);
                        gdfVar.setOnDismissListener(new DialogInterface.OnDismissListener(cgdvVar, cgwiVar) { // from class: cgda
                            private final cgdv a;
                            private final cgwi b;

                            {
                                this.a = cgdvVar;
                                this.b = cgwiVar;
                            }

                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                cgdv cgdvVar2 = this.a;
                                cgwi cgwiVar2 = this.b;
                                cgdvVar2.ah = false;
                                cgwiVar2.F(false);
                            }
                        });
                        cqkf c = cgdvVar.aq.c(new cglz(), null);
                        cgdi cgdiVar = new cgdi(cgdvVar, gdfVar);
                        dwrc C2 = cgdvVar.e.C();
                        if (C2 != null) {
                            dwqz dwqzVar2 = C2.c;
                            if (dwqzVar2 == null) {
                                dwqzVar2 = dwqz.g;
                            }
                            if ((dwqzVar2.a & 16) != 0) {
                                dwqz dwqzVar3 = C2.c;
                                if (dwqzVar3 == null) {
                                    dwqzVar3 = dwqz.g;
                                }
                                dwqy dwqyVar = dwqzVar3.f;
                                if (dwqyVar == null) {
                                    dwqyVar = dwqy.d;
                                }
                                c.e(new chbq(cgdiVar, dwqyVar));
                                gdfVar.setContentView(c.c());
                                cgdvVar.aX.S(bvjk.gR, true);
                                cgdvVar.ah = true;
                                if (cgdvVar.bk.c(R.string.PLACE_QA_ANSWER_THANK_YOU_TITLE) || cgdvVar.bk.c(R.string.UGC_TASKS_REPORT_FEEDBACK_TITLE)) {
                                    cgdvVar.bk.e(4);
                                }
                                cgwiVar.F(true);
                                gdfVar.show();
                            }
                        }
                    }
                }
                cgdvVar.aU();
            }
            ilo z = cgwiVar.z();
            btlu j = cgdvVar.ap.j();
            if (j != null) {
                String str = j.d;
                dwyh bZ = dwyj.d.bZ();
                dspd dspdVar = cgwgVar.F().d;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwyj dwyjVar = (dwyj) bZ.b;
                dspdVar.getClass();
                dwyjVar.a |= 1;
                dwyjVar.b = dspdVar;
                dwyj dwyjVar2 = (dwyj) bZ.b;
                dwyjVar2.c = 2;
                dwyjVar2.a |= 2;
                dwyj bK = bZ.bK();
                String o = z.ai().o();
                if (z.aj() != null) {
                    dpum h = z.aj().h();
                    dwyf bZ2 = dwyg.e.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dwyg dwygVar = (dwyg) bZ2.b;
                    o.getClass();
                    int i = dwygVar.a | 1;
                    dwygVar.a = i;
                    dwygVar.b = o;
                    h.getClass();
                    dwygVar.c = h;
                    dwygVar.a = i | 2;
                    bZ2.a(bK);
                    cgdvVar.aj.put(o, bZ2.bK());
                    cgdvVar.av.b(new cgdm(cgdvVar, str, o, h, bK), bvrj.BACKGROUND_THREADPOOL);
                }
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.chbg
    public void J(@dzsi cgwg cgwgVar, cgwi cgwiVar) {
        R(cgwiVar);
        cgzz cgzzVar = this.e;
        if (cgzzVar != null) {
            if (cgwgVar != null && cgwgVar.P().booleanValue()) {
                cgdv cgdvVar = (cgdv) cgzzVar;
                cgdvVar.aV(cgwgVar, cgwiVar);
                cgdvVar.at.B(jjn.FULLY_EXPANDED);
            }
            ((cgdv) cgzzVar).af = cgwgVar;
        }
    }

    @Override // defpackage.chbg
    public void K(cgwg cgwgVar, cgwi cgwiVar) {
        int indexOf = this.n.a.indexOf(cgwiVar);
        if (indexOf >= 0) {
            S(indexOf);
        }
        cgzz cgzzVar = this.e;
        if (cgzzVar != null) {
            cgdv cgdvVar = (cgdv) cgzzVar;
            cgdvVar.bz();
            cgdvVar.av.a(new cgdj(cgdvVar, cgwgVar, cgwiVar), bvrj.UI_THREAD, 500L);
        }
        cqkx.p(cgwiVar);
    }

    @Override // defpackage.chbg
    public void L(String str) {
        cgzz cgzzVar = this.e;
        if (cgzzVar != null) {
            cgdv cgdvVar = (cgdv) cgzzVar;
            if (cgdvVar.at.l().L() != jjn.COLLAPSED) {
                return;
            }
            cgdvVar.bE();
            cgdvVar.at.B(jjn.EXPANDED);
        }
    }

    @Override // defpackage.chbg
    public void M(String str) {
        int i;
        cgwi H = H();
        if (H == null) {
            return;
        }
        int intValue = O().intValue();
        cgwi cgwiVar = null;
        if (intValue >= 0 && intValue < this.n.a.size()) {
            cgwiVar = this.n.a.get(intValue);
        }
        ilo z = H.z();
        if (z != null) {
            String o = z.ai().o();
            Iterator<cgeo> it = this.v.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cgeo next = it.next();
                dwso ca = dwsr.g.ca(next.a);
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                ((dwsr) ca.b).e = dwsr.ck();
                for (dwqg dwqgVar : next.a.e) {
                    dwqf dwqfVar = dwqgVar.c;
                    if (dwqfVar == null) {
                        dwqfVar = dwqf.g;
                    }
                    dvyw dvywVar = dwqfVar.c;
                    if (dvywVar == null) {
                        dvywVar = dvyw.bv;
                    }
                    if (!o.equals(dvywVar.g)) {
                        ca.c(dwqgVar);
                    }
                }
                next.a = ca.bK();
            }
            ArrayList arrayList = new ArrayList();
            for (cgwi cgwiVar2 : this.l) {
                if (!o.equals(cgwiVar2.z().ai().o())) {
                    arrayList.add(cgwiVar2);
                }
            }
            this.l = arrayList;
            dccx F = dcdc.F();
            dcdc<cgwi> dcdcVar = this.n.a;
            int size = dcdcVar.size();
            for (i = 0; i < size; i++) {
                cgwi cgwiVar3 = dcdcVar.get(i);
                if (!o.equals(cgwiVar3.z().ai().o())) {
                    F.g(cgwiVar3);
                }
            }
            this.n.a(F.f());
            ArrayList arrayList2 = new ArrayList();
            for (cgsk cgskVar : this.k) {
                dwpc dwpcVar = cgskVar.a().b;
                if (dwpcVar == null) {
                    dwpcVar = dwpc.e;
                }
                if (!o.equals(dwpcVar.b)) {
                    arrayList2.add(cgskVar);
                }
            }
            this.k = arrayList2;
        }
        if (cgwiVar != null && this.n.a.contains(cgwiVar)) {
            this.d = this.n.a.indexOf(cgwiVar);
        } else {
            this.d = -1;
        }
        cgzz cgzzVar = this.e;
        if (cgzzVar != null) {
            cgdv cgdvVar = (cgdv) cgzzVar;
            chac chacVar = cgdvVar.e;
            dbsk.s(chacVar);
            cgdvVar.bw(chacVar.e().intValue());
            chac chacVar2 = cgdvVar.e;
            dbsk.s(chacVar2);
            if (chacVar2.b().isEmpty()) {
                cgdvVar.bB();
            }
        }
        cqkx.p(this);
    }

    public void N() {
        new AlertDialog.Builder(this.u).setMessage(R.string.UGC_TASKS_DISCARD_DIALOG_TEXT).setNegativeButton(R.string.UGC_TASKS_DISCARD_DIALOG_KEEP_EDITING_BUTTON, new cgzy()).setPositiveButton(R.string.UGC_TASKS_DISCARD_DIALOG_DISCARD_BUTTON, new cgzx(this)).show();
    }

    public Integer O() {
        int indexOf;
        Integer valueOf;
        if (this.p.isEmpty()) {
            int i = this.x.getUgcTasksParameters().i;
            this.y.a();
            int i2 = this.d;
            dcdc<cgwi> dcdcVar = this.n.a;
            if (dcdcVar.isEmpty()) {
                valueOf = -1;
            } else {
                if (i2 >= 0 && i2 < dcdcVar.size()) {
                    String o = dcdcVar.get(i2).z().ai().o();
                    do {
                        i2++;
                        if (i2 < dcdcVar.size()) {
                        }
                    } while (o.equals(dcdcVar.get(i2).z().ai().o()));
                    valueOf = Integer.valueOf(i2);
                }
                i2 = 0;
                valueOf = Integer.valueOf(i2);
            }
            indexOf = valueOf.intValue();
        } else {
            indexOf = this.n.a.indexOf(this.p.peek());
        }
        return Integer.valueOf(indexOf);
    }

    public Integer P() {
        return Integer.valueOf(this.o.isEmpty() ? -1 : this.n.a.indexOf(this.o.peek()));
    }

    public int Q() {
        return O().intValue();
    }

    public void R(cgwi cgwiVar) {
        if (!cgwiVar.t().booleanValue()) {
            int size = cgwiVar.o().size();
            int intValue = cgwiVar.h(cgwf.EDITABLE).intValue();
            cgyp cgypVar = this.s;
            cgypVar.a = size;
            cgypVar.b = intValue;
            cqkx.p(cgypVar);
        }
        cqkx.p(this);
        cqkx.p(this.q);
    }

    public void S(int i) {
        if (this.d == i || i >= this.n.a.size()) {
            return;
        }
        cgwi H = H();
        if (this.G) {
            if (!this.p.isEmpty()) {
                this.p.pop();
            }
            if (H != null) {
                this.o.push(H);
            }
        } else if (this.F) {
            this.o.pop();
            if (H != null) {
                this.p.push(H);
            }
        } else {
            this.o.clear();
            this.p.clear();
        }
        if (H != null) {
            H.E();
        }
        this.d = i;
        cgwi H2 = H();
        if (H2 != null) {
            H2.x().k(this.I);
            R(H2);
            this.b.add(H2);
        }
        cqkx.p(this);
    }

    @dzsi
    public dwpc T() {
        cgwi H = H();
        if (H == null || H.e().isEmpty()) {
            return null;
        }
        return H.e().get(0).F();
    }

    public void U(@dzsi dwpc dwpcVar) {
        if (dwpcVar != null) {
            for (int i = 0; i < this.n.a.size(); i++) {
                for (cgwg cgwgVar : this.n.a.get(i).e()) {
                    if (dwpcVar.equals(cgwgVar.F())) {
                        S(i);
                        return;
                    }
                }
            }
        }
        S(-1);
    }

    public void V() {
        ac(false, null, alao.a(this.w));
    }

    public void W(String str) {
        cgwi H = H();
        if (H != null && str.equals(H.z().ai().o())) {
            this.d = -1;
        }
        List<cgwi> list = this.l;
        int i = 0;
        while (i < list.size()) {
            cgwi cgwiVar = list.get(i);
            if (cgwiVar.z().ai().o().equals(str)) {
                cgwiVar.m();
                list.remove(i);
                i--;
            }
            i++;
        }
        ac(false, null, alao.a(this.w));
        cgzz cgzzVar = this.e;
        if (cgzzVar != null) {
            cgzzVar.bn();
        }
    }

    public boolean X() {
        return this.j != null;
    }

    public int Y(@dzsi dwpc dwpcVar) {
        if (dwpcVar == null) {
            return -1;
        }
        String str = dwpcVar.b;
        for (int i = 0; i < this.n.a.size(); i++) {
            cgwi cgwiVar = this.n.a.get(i);
            if (str.equals(cgwiVar.z().h().g)) {
                for (cgwg cgwgVar : cgwiVar.e()) {
                    if (dwpcVar.equals(cgwgVar.F())) {
                        return i;
                    }
                }
                continue;
            }
        }
        return -1;
    }

    public boolean Z(String str) {
        for (cgwi cgwiVar : this.l) {
            if (cgwiVar.x().p().equals(str)) {
                return cgwiVar.C();
            }
        }
        return false;
    }

    @Override // defpackage.cgwd
    public Boolean a() {
        return Boolean.valueOf(this.I != jjn.HIDDEN);
    }

    @Override // defpackage.cgwj
    public void ab(doab doabVar) {
        cgwi H = H();
        if (H != null) {
            H.ab(doabVar);
        }
    }

    @Override // defpackage.cgwd
    public List<cgwi> b() {
        return this.n.a;
    }

    @Override // defpackage.cgwd
    public cgvx c() {
        return this.s;
    }

    @Override // defpackage.cgwd
    public jco d() {
        return this.t;
    }

    @Override // defpackage.cgwd
    public Integer e() {
        return Integer.valueOf(this.d);
    }

    @Override // defpackage.cgwd, defpackage.cgze
    public Boolean f() {
        cgwi H = H();
        if (H == null) {
            return false;
        }
        for (cgwg cgwgVar : H.o()) {
            if (!cgwgVar.O().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cgwd
    public Boolean g() {
        int i = this.x.getUgcTasksParameters().i;
        return false;
    }

    @Override // defpackage.cgyo
    public void h() {
        this.G = true;
        cgzz cgzzVar = this.e;
        if (cgzzVar != null) {
            cgdv cgdvVar = (cgdv) cgzzVar;
            chac chacVar = cgdvVar.e;
            dbsk.s(chacVar);
            cgdvVar.aX(chacVar.O());
        }
        this.G = false;
    }

    @Override // defpackage.cgyo
    @dzsi
    public bwrs<ilo> i() {
        cgwi H = H();
        if (H != null) {
            return H.A();
        }
        return null;
    }

    @Override // defpackage.cgyo
    public dwqe j() {
        if (H() == null) {
            return dwqe.d;
        }
        return this.n.a.get(this.d).v();
    }

    @Override // defpackage.cgyo
    public void k() {
        N();
    }

    @Override // defpackage.cgyo
    public void l() {
        cgwi H = H();
        if (H != null) {
            H.p();
        }
    }

    @Override // defpackage.cgyo
    public boolean m() {
        return this.n.a.size() > 1;
    }

    @Override // defpackage.cgyo
    public void n() {
        this.F = true;
        cgzz cgzzVar = this.e;
        if (cgzzVar != null) {
            cgdv cgdvVar = (cgdv) cgzzVar;
            chac chacVar = cgdvVar.e;
            dbsk.s(chacVar);
            cgdvVar.aX(chacVar.P());
        }
        this.F = false;
    }

    @Override // defpackage.cgyo
    public boolean o() {
        return g().booleanValue() && !this.o.isEmpty();
    }

    @Override // defpackage.cgze
    public void p(Boolean bool) {
        ac(bool.booleanValue(), T(), alao.a(this.w));
        cqkx.p(this);
        cgzz cgzzVar = this.e;
        if (cgzzVar != null) {
            cgzzVar.bn();
        }
    }

    @Override // defpackage.cgze
    public void q() {
        cgzz cgzzVar = this.e;
        if (cgzzVar == null || !((fd) cgzzVar).U()) {
            return;
        }
        cgdv cgdvVar = (cgdv) cgzzVar;
        if (cgdvVar.bv()) {
            return;
        }
        cgdvVar.am.g().f();
    }

    @Override // defpackage.cgze
    public void r(View view) {
        dwsr dwsrVar = this.j;
        if (dwsrVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (dwrc dwrcVar : dwsrVar.b) {
            dspd dspdVar = dwrcVar.b;
            jhm jhmVar = new jhm();
            dwqz dwqzVar = dwrcVar.c;
            if (dwqzVar == null) {
                dwqzVar = dwqz.g;
            }
            jhmVar.a = dwqzVar.b;
            cjta b = cjtd.b();
            b.d = dtyd.an;
            b.g(dwrcVar.d);
            b.b = dwsrVar.d;
            jhmVar.f = b.a();
            jhmVar.d(new cgzt(this, dspdVar));
            arrayList.add(jhmVar.c());
        }
        aa(view, arrayList);
    }

    @Override // defpackage.cgze
    public void s() {
        Toast.makeText(this.u, (int) R.string.UGC_TASK_CARD_PENDING_CONTRIBUTIONS_NOTICE, 0).show();
    }

    @Override // defpackage.cgze
    public void t(View view, List<dspd> list) {
        cgzz cgzzVar;
        dspd B = B();
        if (B == null) {
            return;
        }
        if (!list.isEmpty() || (cgzzVar = this.e) == null) {
            jhm jhmVar = new jhm();
            jhmVar.a = this.u.getString(R.string.UGC_TASKS_SHARE_OPTION_SHARE_FILTERS_AND_VIEWPORT);
            jhmVar.f = cjtd.a(dtyd.aC);
            jhmVar.d(new cgzu(this, B, list));
            jho c = jhmVar.c();
            jhm jhmVar2 = new jhm();
            jhmVar2.a = this.u.getString(R.string.UGC_TASKS_SHARE_OPTION_SHARE_FILTERS);
            jhmVar2.f = cjtd.a(dtyd.aD);
            jhmVar2.d(new cgzv(this, B, list));
            aa(view, dcdc.g(c, jhmVar2.c()));
            return;
        }
        cgzzVar.bo(B, list, true);
    }

    public void u(@dzsi dwsr dwsrVar, @dzsi dspd dspdVar, cgzd cgzdVar) {
        dwrc f;
        int i;
        akqs m;
        LinkedHashMap linkedHashMap;
        dwpc dwpcVar;
        chas chayVar;
        Map<akqi, cgwi> map;
        chac chacVar = this;
        dwsr dwsrVar2 = dwsrVar;
        dspd dspdVar2 = dspdVar;
        if (dwsrVar2 == null) {
            if (dspdVar2 == null) {
                return;
            }
            chacVar.a = dspdVar2;
            return;
        }
        if (dspdVar2 == null) {
            dspdVar2 = cguq.a(dwsrVar);
        }
        dspd dspdVar3 = dspdVar2;
        if (dspdVar3 == null || (f = cguq.f(dwsrVar2, dspdVar3)) == null) {
            return;
        }
        dspd dspdVar4 = chacVar.a;
        if (dspdVar4 == null) {
            chacVar.q.j(cgzdVar);
        } else {
            cges cgesVar = chacVar.r;
            List<cgwi> list = chacVar.l;
            HashMap hashMap = new HashMap();
            for (cgwi cgwiVar : list) {
                if (cgwiVar.h(cgwf.POSTED).intValue() > 0) {
                    hashMap.put(cgwiVar.z().ai(), cgwiVar);
                }
            }
            cgesVar.a.put(dspdVar4, hashMap);
            if (!dspdVar4.equals(dspdVar3)) {
                chacVar.q.j(new cgzd());
            } else {
                dwsrVar2 = chacVar.q.m(dwsrVar2, dspdVar3);
                f = cguq.f(dwsrVar2, dspdVar3);
                if (f == null) {
                    return;
                }
            }
        }
        dwsr dwsrVar3 = dwsrVar2;
        dwrc dwrcVar = f;
        boolean z = !X();
        chacVar.j = dwsrVar3;
        chacVar.a = dspdVar3;
        dwpc T = T();
        chacVar.k = cguq.e(dwsrVar3.e);
        final Set<dspd> d = cguq.d(dwrcVar.e);
        dcdc z2 = dcbg.b(dcbg.b(chacVar.k).o(cgzo.a).z()).o(new dbsl(d) { // from class: cguo
            private final Set a;

            {
                this.a = d;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Set set = this.a;
                for (dwpn dwpnVar : ((cgsk) obj).a().d) {
                    if (set.contains(dwpnVar.b)) {
                        return true;
                    }
                }
                return false;
            }
        }).z();
        chacVar.k = z2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<E> it = z2.iterator();
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            cgsk cgskVar = (cgsk) it.next();
            dwpc dwpcVar2 = cgskVar.a().b;
            if (dwpcVar2 == null) {
                dwpcVar2 = dwpc.e;
            }
            String str = dwpcVar2.b;
            Map map2 = (Map) linkedHashMap2.get(str);
            if (map2 == null) {
                map2 = new LinkedHashMap();
                linkedHashMap2.put(str, map2);
            }
            dspd dspdVar5 = dspd.b;
            Iterator<dwpn> it2 = cgskVar.a().d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                dwpn next = it2.next();
                if (d.contains(next.b) && (next.a & 2) != 0) {
                    dspdVar5 = next.c;
                    break;
                }
            }
            List list2 = (List) map2.get(dspdVar5);
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(cgskVar);
                map2.put(dspdVar5, arrayList);
            } else {
                list2.add(cgskVar);
            }
        }
        chacVar.l = new ArrayList();
        Iterator it3 = linkedHashMap2.keySet().iterator();
        while (true) {
            int i2 = 0;
            if (it3.hasNext()) {
                for (List list3 : ((Map) linkedHashMap2.get((String) it3.next())).values()) {
                    chat chatVar = chacVar.i;
                    int i3 = ((cgsk) list3.get(i2)).b().b;
                    int i4 = i3 != 0 ? i3 != i ? i3 != 3 ? i3 != 4 ? 0 : 3 : 2 : 1 : 4;
                    int i5 = i4 - 1;
                    cgwi cgwiVar2 = null;
                    if (i4 != 0) {
                        if (i5 == 1) {
                            linkedHashMap = linkedHashMap2;
                            dwpcVar = T;
                            chayVar = new chay(chatVar.a, chatVar.b, chatVar.i, chatVar.c, chatVar.d, chatVar.e, chatVar.f, chatVar.g, list3);
                        } else if (i5 == i) {
                            linkedHashMap = linkedHashMap2;
                            dwpcVar = T;
                            chayVar = new chao(chatVar.a, chatVar.b, chatVar.c, chatVar.d, chatVar.e, chatVar.f, chatVar.g, list3);
                        } else {
                            linkedHashMap = linkedHashMap2;
                            dwpcVar = T;
                            chayVar = new chav(chatVar.a, chatVar.b, chatVar.c, chatVar.d, chatVar.e, chatVar.f, chatVar.h, chatVar.g, chatVar.j, list3);
                        }
                        chas chasVar = chayVar;
                        chbm chbmVar = chacVar.h;
                        cgrr cgrrVar = chacVar.z;
                        cgrp cgrpVar = chacVar.A;
                        cgrn cgrnVar = chacVar.B;
                        cgrl cgrlVar = chacVar.C;
                        cgtw cgtwVar = chacVar.D;
                        ges gesVar = chacVar.H;
                        dwsq dwsqVar = dwsrVar3.f;
                        if (dwsqVar == null) {
                            dwsqVar = dwsq.d;
                        }
                        dsrj<dwrg> dsrjVar = dwsqVar.c;
                        dwql dwqlVar = dwrcVar.h;
                        if (dwqlVar == null) {
                            dwqlVar = dwql.b;
                        }
                        dspd dspdVar6 = dspdVar3;
                        dwql dwqlVar2 = dwqlVar;
                        cgsi a = chbmVar.a.a();
                        dwrc dwrcVar2 = dwrcVar;
                        chbm.a(a, 1);
                        cham a2 = chbmVar.b.a();
                        chbm.a(a2, 2);
                        cgwr a3 = chbmVar.c.a();
                        chbm.a(a3, 3);
                        gga a4 = chbmVar.d.a();
                        chbm.a(a4, 4);
                        cztz a5 = chbmVar.e.a();
                        chbm.a(a5, 5);
                        bvjj a6 = chbmVar.f.a();
                        dwsr dwsrVar4 = dwsrVar3;
                        chbm.a(a6, 6);
                        cjqy a7 = chbmVar.g.a();
                        chbm.a(a7, 7);
                        cjqq a8 = chbmVar.h.a();
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        chbm.a(a8, 8);
                        btvo a9 = chbmVar.i.a();
                        dwpc dwpcVar3 = dwpcVar;
                        chbm.a(a9, 9);
                        chbm.a(list3, 10);
                        chbm.a(chacVar, 11);
                        chbm.a(cgrrVar, 12);
                        chbm.a(cgrpVar, 13);
                        chbm.a(cgrnVar, 14);
                        chbm.a(cgrlVar, 15);
                        chbm.a(cgtwVar, 16);
                        chbm.a(gesVar, 17);
                        chbm.a(dsrjVar, 18);
                        chbm.a(dwqlVar2, 19);
                        chbm.a(chasVar, 20);
                        chbl chblVar = new chbl(a, a2, a3, a4, a5, a6, a7, a8, a9, list3, this, cgrrVar, cgrpVar, cgrnVar, cgrlVar, cgtwVar, gesVar, dsrjVar, dwqlVar2, chasVar);
                        chasVar.y(chblVar);
                        if (dbsj.d(chblVar.x().a()) || dbsj.d(chblVar.x().h()) || chblVar.T()) {
                            akqi ai = chblVar.z().ai();
                            cges cgesVar2 = this.r;
                            if (!cgesVar2.a.containsKey(dspdVar6)) {
                                map = new HashMap<>();
                            } else {
                                map = cgesVar2.a.get(dspdVar6);
                            }
                            if (map.containsKey(ai)) {
                                cgwiVar2 = map.get(ai);
                            }
                            cgwi cgwiVar3 = cgwiVar2;
                            if (cgwiVar3 != null) {
                                this.l.add(cgwiVar3);
                            } else {
                                this.l.add(chblVar);
                            }
                            chacVar = this;
                            dspdVar3 = dspdVar6;
                            dwrcVar = dwrcVar2;
                            linkedHashMap2 = linkedHashMap3;
                            dwsrVar3 = dwsrVar4;
                        } else {
                            chacVar = this;
                            dwrcVar = dwrcVar2;
                            linkedHashMap2 = linkedHashMap3;
                            dwsrVar3 = dwsrVar4;
                            dspdVar3 = dspdVar6;
                        }
                        T = dwpcVar3;
                        i = 2;
                        i2 = 0;
                    } else {
                        throw null;
                    }
                }
            } else {
                dwpc dwpcVar4 = T;
                dwsr dwsrVar5 = dwsrVar3;
                dspd dspdVar7 = dspdVar3;
                chac chacVar2 = chacVar;
                chacVar2.q.l(dwrcVar, dwsrVar5.b.size() > 1, z, cgzdVar, dcbg.b(chacVar2.k).t(cgzk.a).s(cgzl.a).B(), dcbg.b(chacVar2.k).t(cgzm.a).s(cgzn.a).B());
                chacVar2.n.a(dcdc.r(chacVar2.l));
                chacVar2.m = chacVar2.l;
                dhjx c = cguq.c(dwsrVar5, dspdVar7);
                if (c == null) {
                    m = alao.a(chacVar2.w);
                } else {
                    m = akyx.m(c);
                }
                chacVar2.ac(true, dwpcVar4, m);
                return;
            }
        }
    }

    public jkh v() {
        return this.E;
    }

    public void w(jjn jjnVar) {
        this.I = jjnVar;
        cgwi H = H();
        if (H != null) {
            H.x().k(jjnVar);
        }
        cqkx.p(this);
    }

    @Override // defpackage.chbg
    public void x(dwpc dwpcVar, String str) {
        cgzz cgzzVar;
        dspd B = B();
        if (B == null || (cgzzVar = this.e) == null) {
            return;
        }
        cgdv cgdvVar = (cgdv) cgzzVar;
        if (cgdvVar.ai.c()) {
            return;
        }
        cgdvVar.ae = new cgsm(B, dwpcVar, str, cgdvVar.bj.d.n());
        cgdvVar.bp();
    }

    public void y(Set<String> set) {
        for (cgwi cgwiVar : this.l) {
            if (set.contains(cgwiVar.B())) {
                cgwiVar.x().m(false);
            }
        }
    }

    public cgzd z() {
        return this.q.k();
    }
}

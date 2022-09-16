package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chyq  reason: default package */
/* loaded from: classes4.dex */
public class chyq implements View.OnAttachStateChangeListener, crzp, chyf, cqrh {
    public static final /* synthetic */ int h = 0;
    private static final dcqe i = dcqe.c("chyq");
    private final cqqw B;
    private final crzm<chuh> D;
    private final chrw E;
    private final Runnable F;
    private final View.OnAttachStateChangeListener G;
    public final crzm<chum> a;
    public chtq b;
    public dcdc<cqix<? extends cqkp>> c;
    private final Resources j;
    private final Executor k;
    private final cisi l;
    private final cibe m;
    private final btvo n;
    private final PublicDisclosureLayout$PublicDisclosureViewModelImpl o;
    private final chsf p;
    private final chrx q;
    private final crzm<chua> r;
    private boolean t;
    private final cizl u;
    private dcdc<cqix<? extends cqkp>> v;
    @dzsi
    private cjaa w;
    private final cjae x;
    private final HashMap<chtq, Parcelable> s = new HashMap<>();
    public boolean d = false;
    private boolean y = false;
    private final Set<Integer> z = new HashSet();
    public int g = 1;
    private final Runnable A = new chyl(this);
    public Integer e = null;
    @dzsi
    public dcdc<cqix<? extends cqkp>> f = null;
    @dzsi
    private RecyclerView C = null;
    private boolean H = false;

    public chyq(Application application, Resources resources, Executor executor, cqhn cqhnVar, cqhu cqhuVar, cizn ciznVar, cisi cisiVar, cibe cibeVar, cjnx cjnxVar, btvo btvoVar, PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl, cjae cjaeVar, chsf chsfVar, bvpe bvpeVar, chrx chrxVar, chrw chrwVar, crzm<chtq> crzmVar, crzm<chty> crzmVar2, crzm<chvi> crzmVar3, crzm<chtp> crzmVar4, crzm<chtu> crzmVar5, crzm<chuh> crzmVar6, crzm<chum> crzmVar7, crzm<chua> crzmVar8, crzm<drnp> crzmVar9, btlu btluVar, Runnable runnable) {
        this.j = resources;
        this.k = executor;
        this.l = cisiVar;
        this.m = cibeVar;
        this.q = chrxVar;
        chtq l = crzmVar.l();
        dbsk.s(l);
        this.b = l;
        this.a = crzmVar7;
        this.r = crzmVar8;
        this.x = cjaeVar;
        this.p = chsfVar;
        gga a = ciznVar.a.a();
        cizn.a(a, 1);
        cqhn a2 = ciznVar.b.a();
        cizn.a(a2, 2);
        Executor a3 = ciznVar.c.a();
        cizn.a(a3, 3);
        cizc a4 = ciznVar.d.a();
        cizn.a(a4, 4);
        ciyn a5 = ciznVar.e.a();
        cizn.a(a5, 5);
        btvo a6 = ciznVar.f.a();
        cizn.a(a6, 6);
        cizn.a(chrxVar, 7);
        cizn.a(crzmVar, 8);
        cizn.a(crzmVar2, 9);
        cizn.a(crzmVar3, 10);
        cizn.a(btluVar, 11);
        this.u = new cizm(a, a2, a3, a4, a5, a6, chrxVar, crzmVar, crzmVar2, crzmVar3, btluVar);
        this.w = null;
        this.n = btvoVar;
        this.o = publicDisclosureLayout$PublicDisclosureViewModelImpl;
        publicDisclosureLayout$PublicDisclosureViewModelImpl.o(cayd.TOOLTIP);
        this.v = dcdc.e();
        this.c = dcdc.e();
        this.D = crzmVar6;
        this.F = runnable;
        this.E = chrwVar;
        this.B = new chyp(this, chsfVar, cqhuVar, application);
        this.t = false;
        this.G = bvpeVar.b;
        crzmVar4.d(this, executor);
    }

    private final void q(final dbsz<RecyclerView> dbszVar) {
        for (View view : cqkx.n(this)) {
            cqkx.h(view, chye.a, RecyclerView.class, new dbrn(dbszVar) { // from class: chyk
                private final dbsz a;

                {
                    this.a = dbszVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    int i2 = chyq.h;
                    this.a.NU((RecyclerView) obj);
                    return null;
                }
            });
        }
    }

    @Override // defpackage.crzp
    public void On(crzm<chtp> crzmVar) {
        boolean z;
        chuh chuhVar;
        int i2;
        int i3;
        boolean d;
        boolean z2;
        cjtd a;
        String string;
        char c;
        cqix<? extends cqkp> fT;
        View a2;
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        chrw chrwVar;
        bvrj.UI_THREAD.c();
        chtp l = crzmVar.l();
        dbsk.s(l);
        boolean z3 = !this.b.equals(l.a());
        if (z3) {
            q(new dbsz(this) { // from class: chyg
                private final chyq a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    this.a.o((RecyclerView) obj);
                }
            });
            this.t = false;
        }
        if (!l.g()) {
            this.t = true;
        }
        this.b = l.a();
        chuh l2 = this.D.l();
        boolean a3 = this.p.a();
        boolean z4 = a3 && l2 != null && !l2.d;
        cisi cisiVar = this.l;
        dcdc<chva> n = this.b.n(this.n, this.p.c(), a3, z4);
        chrx chrxVar = this.q;
        boolean z5 = this.t;
        boolean z6 = !this.H;
        PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl = this.o;
        crzm<chuh> crzmVar2 = this.D;
        chrw chrwVar2 = this.E;
        Runnable runnable = this.F;
        crzm<chua> crzmVar3 = this.r;
        boolean l3 = this.b.l();
        View.OnAttachStateChangeListener onAttachStateChangeListener2 = this.G;
        dccx F = dcdc.F();
        Iterator<chva> it = n.iterator();
        while (true) {
            z = z3;
            if (!it.hasNext()) {
                break;
            }
            chva next = it.next();
            Iterator<chva> it2 = it;
            int a4 = chux.a(next.d);
            if (a4 == 0) {
                a4 = 1;
            }
            int i4 = a4 - 1;
            chuh chuhVar2 = l2;
            if (i4 == 0) {
                chtp chtpVar = l;
                View.OnAttachStateChangeListener onAttachStateChangeListener3 = onAttachStateChangeListener2;
                boolean z7 = l3;
                crzm<chua> crzmVar4 = crzmVar3;
                Runnable runnable2 = runnable;
                PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl2 = publicDisclosureLayout$PublicDisclosureViewModelImpl;
                cisp cispVar = new cisp();
                cist cistVar = cisiVar.a;
                Activity activity = (Activity) ((dxjd) cistVar.a).a;
                cist.a(activity, 1);
                cklf a5 = cistVar.b.a();
                cist.a(a5, 2);
                dxio a6 = ((dxjh) cistVar.c).a();
                cist.a(a6, 3);
                caxn a7 = cistVar.d.a();
                cist.a(a7, 4);
                cist.a(next, 5);
                cist.a(publicDisclosureLayout$PublicDisclosureViewModelImpl2, 6);
                F.g(cqgr.fT(cispVar, new ciss(activity, a5, a6, a7, next, publicDisclosureLayout$PublicDisclosureViewModelImpl2, !z7)));
                onAttachStateChangeListener2 = onAttachStateChangeListener3;
                z3 = z;
                it = it2;
                l2 = chuhVar2;
                l3 = z7;
                crzmVar3 = crzmVar4;
                runnable = runnable2;
                l = chtpVar;
                chrwVar2 = chrwVar2;
            } else if (i4 == 1) {
                View.OnAttachStateChangeListener onAttachStateChangeListener4 = onAttachStateChangeListener2;
                boolean z8 = l3;
                crzm<chua> crzmVar5 = crzmVar3;
                Runnable runnable3 = runnable;
                chrw chrwVar3 = chrwVar2;
                citx citxVar = new citx();
                ciuc ciucVar = cisiVar.b;
                Executor a8 = ciucVar.a.a();
                ciuc.a(a8, 1);
                citl a9 = ciucVar.b.a();
                ciuc.a(a9, 2);
                caxn a10 = ciucVar.c.a();
                ciuc.a(a10, 3);
                cish a11 = ciucVar.d.a();
                ciuc.a(a11, 4);
                chsf a12 = ciucVar.e.a();
                boolean z9 = z5;
                ciuc.a(a12, 5);
                btvo a13 = ciucVar.f.a();
                ciuc.a(a13, 6);
                bvpe a14 = ciucVar.g.a();
                ciuc.a(a14, 7);
                ciuc.a(next, 8);
                ciuc.a(chrxVar, 9);
                ciuc.a(publicDisclosureLayout$PublicDisclosureViewModelImpl, 10);
                ciuc.a(crzmVar2, 11);
                crzm<chuh> crzmVar6 = crzmVar2;
                ciuc.a(chrwVar3, 12);
                ciuc.a(onAttachStateChangeListener4, 13);
                PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl3 = publicDisclosureLayout$PublicDisclosureViewModelImpl;
                F.g(cqgr.fT(citxVar, new ciub(a8, a9, a10, a11, a12, a13, a14, next, chrxVar, publicDisclosureLayout$PublicDisclosureViewModelImpl3, crzmVar6, chrwVar3, onAttachStateChangeListener4)));
                onAttachStateChangeListener2 = onAttachStateChangeListener4;
                publicDisclosureLayout$PublicDisclosureViewModelImpl = publicDisclosureLayout$PublicDisclosureViewModelImpl3;
                z3 = z;
                it = it2;
                l2 = chuhVar2;
                l3 = z8;
                crzmVar3 = crzmVar5;
                runnable = runnable3;
                l = l;
                chrwVar2 = chrwVar3;
                crzmVar2 = crzmVar6;
                z5 = z9;
            } else if (i4 != 2) {
                if (i4 == 3) {
                    onAttachStateChangeListener = onAttachStateChangeListener2;
                    chrwVar = chrwVar2;
                    if (l.d() && !l.e() && l.g()) {
                        if (z5) {
                            cirs cirsVar = new cirs();
                            Activity activity2 = (Activity) ((dxjd) cisiVar.g.a).a;
                            cirv.a(activity2);
                            F.g(cqgr.fT(cirsVar, new ciru(activity2, l3)));
                        } else {
                            ciuq ciuqVar = new ciuq();
                            axwy a15 = cisiVar.e.a.a();
                            ciux.a(a15, 1);
                            ciux.a(next, 2);
                            ciux.a(chrxVar, 3);
                            F.g(cqgr.fT(ciuqVar, new ciuw(a15, next, chrxVar)));
                        }
                    }
                } else if (i4 != 4) {
                    if (i4 == 6) {
                        if (crzmVar3.k()) {
                            chua l4 = crzmVar3.l();
                            dbsk.s(l4);
                            if ((l4.a & 1) != 0) {
                                cirm cirmVar = new cirm();
                                cirp cirpVar = cisiVar.f;
                                Executor a16 = cirpVar.a.a();
                                onAttachStateChangeListener = onAttachStateChangeListener2;
                                cirp.a(a16, 1);
                                dxio a17 = ((dxjh) cirpVar.b).a();
                                chrwVar = chrwVar2;
                                cirp.a(a17, 2);
                                dxio a18 = ((dxjh) cirpVar.c).a();
                                cirp.a(a18, 3);
                                cirp.a(crzmVar3, 4);
                                F.g(cqgr.fT(cirmVar, new ciro(a16, a17, a18, crzmVar3)));
                            }
                        }
                    }
                    z3 = z;
                    it = it2;
                    l2 = chuhVar2;
                } else {
                    onAttachStateChangeListener = onAttachStateChangeListener2;
                    chrwVar = chrwVar2;
                    if (!z6) {
                        cita citaVar = new cita();
                        citd.a(cisiVar.d.a.a(), 1);
                        citd.a(runnable, 2);
                        F.g(cqgr.fT(citaVar, new citc(runnable)));
                    }
                }
                chrwVar2 = chrwVar;
                z3 = z;
                it = it2;
                l2 = chuhVar2;
                onAttachStateChangeListener2 = onAttachStateChangeListener;
            } else {
                View.OnAttachStateChangeListener onAttachStateChangeListener5 = onAttachStateChangeListener2;
                chrw chrwVar4 = chrwVar2;
                cisu cisuVar = new cisu();
                cisy cisyVar = cisiVar.c;
                chtq a19 = l.a();
                Activity activity3 = (Activity) ((dxjd) cisyVar.a).a;
                boolean z10 = l3;
                cisy.a(activity3, 1);
                cklf a20 = cisyVar.b.a();
                crzm<chua> crzmVar7 = crzmVar3;
                cisy.a(a20, 2);
                dxio a21 = ((dxjh) cisyVar.c).a();
                cisy.a(a21, 3);
                caxn a22 = cisyVar.d.a();
                cisy.a(a22, 4);
                cisy.a(next, 5);
                cisy.a(a19, 6);
                F.g(cqgr.fT(cisuVar, new cisx(activity3, a20, a21, a22, next, a19)));
                chrwVar2 = chrwVar4;
                l3 = z10;
                z3 = z;
                it = it2;
                l2 = chuhVar2;
                onAttachStateChangeListener2 = onAttachStateChangeListener5;
                crzmVar3 = crzmVar7;
                runnable = runnable;
            }
        }
        chtp chtpVar2 = l;
        chuh chuhVar3 = l2;
        this.v = F.f();
        dcbg i5 = dcbg.i();
        chum l5 = this.a.l();
        if (l5 != null && this.p.d(this.b)) {
            this.w = this.x.a(this.q, l5);
            if (l5.m) {
                this.y = true;
                RecyclerView recyclerView = this.C;
                if (recyclerView == null) {
                    this.g = 1;
                } else {
                    int i6 = this.g;
                    if (i6 == 3) {
                        View a23 = cqhu.a(recyclerView, cizz.c);
                        if (a23 != null) {
                            a23.sendAccessibilityEvent(8);
                        }
                    } else if (i6 == 2 && (a2 = cqhu.a(recyclerView, cizz.b)) != null) {
                        a2.sendAccessibilityEvent(8);
                    }
                    this.g = 1;
                }
            }
            dcdc<chxl> c2 = chtpVar2.c();
            int size = c2.size();
            dcbg dcbgVar = i5;
            for (int i7 = 0; i7 < size; i7++) {
                dcbgVar = dcbgVar.n(this.m.a(this.q, this.b, c2.get(i7)));
            }
            this.e = Integer.valueOf(this.v.size() + dcbgVar.k());
            cibe cibeVar = this.m;
            chrx chrxVar2 = this.q;
            cjad cjadVar = cibeVar.e;
            if (cjadVar == null) {
                cibeVar.e = cibeVar.a.a().a(chrxVar2, l5);
            } else {
                cjadVar.l(l5);
            }
            i5 = dcbgVar.n(cqgr.fT(new cizz(), cibeVar.e));
            if (chtb.e(l5) && l5.m) {
                if (l5.b == 0) {
                    string = this.j.getString(R.string.WEEKLY_TODOLIST_DONE_WITH_CURRENT_WEEK);
                } else {
                    string = this.j.getString(R.string.WEEKLY_TODOLIST_DONE_WITH_PAST_WEEK);
                }
                String str = string;
                cjta b = cjtd.b();
                b.d = dtxl.hX;
                if ((l5.a & 4096) != 0) {
                    b.g(l5.n);
                }
                cibe cibeVar2 = this.m;
                chrx chrxVar3 = this.q;
                int i8 = l5.b;
                int i9 = l5.l;
                boolean z11 = l5.c > 0;
                boolean z12 = !this.z.contains(Integer.valueOf(i8));
                boolean z13 = l5.o;
                Runnable runnable4 = this.A;
                cjtd a24 = b.a();
                if (z13) {
                    if (i8 > 0) {
                        cirg cirgVar = new cirg();
                        cibeVar2.c.a();
                        fT = cqgr.fT(cirgVar, cirk.a(chrxVar3, i8, true, runnable4));
                    } else {
                        fT = null;
                    }
                    c = 0;
                } else {
                    cirg cirgVar2 = new cirg();
                    cibeVar2.c.a();
                    c = 0;
                    fT = cqgr.fT(cirgVar2, cirk.a(chrxVar3, i8, false, runnable4));
                }
                if (cibeVar2.d == null) {
                    cqmp[] cqmpVarArr = new cqmp[1];
                    cqmpVarArr[c] = cqgr.z(iva.b(ibl.h(), ibl.w()));
                    cibeVar2.d = new cheo(cqmpVarArr);
                }
                cqix fT2 = cqgr.fT(cibeVar2.d, cibeVar2.b.a().a(fT, i9, str, z11, z12, a24));
                this.z.add(Integer.valueOf(l5.b));
                i5 = i5.n(fT2);
            }
        }
        if (chuhVar3 != null) {
            chuhVar = chuhVar3;
            if (chuhVar.d) {
                String str2 = chuhVar.c;
                for (chug chugVar : chuhVar.b) {
                    if (chugVar.b.equals(str2)) {
                        i2 = chugVar.d;
                        break;
                    }
                }
            }
        } else {
            chuhVar = chuhVar3;
        }
        i2 = 0;
        if (this.p.b(this.b) && i2 > 0) {
            String string2 = this.j.getString(R.string.GCID_FILTER_THANKS_TEXT);
            cibe cibeVar3 = this.m;
            dbsk.s(chuhVar);
            cjta b2 = cjtd.b();
            b2.d = dtxl.gy;
            String str3 = chuhVar.c;
            Iterator<chug> it3 = chuhVar.b.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    a = b2.a();
                    break;
                }
                chug next2 = it3.next();
                if (next2.b.equals(str3)) {
                    b2.g(next2.j);
                    a = b2.a();
                    break;
                }
            }
            i5 = i5.n(cqgr.fT(new cheo(new cqmp[0]), cibeVar3.b.a().a(null, i2, string2, true, true, a)));
        }
        dcdc<chxl> b3 = chtpVar2.b();
        int size2 = b3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            i5 = i5.n(this.m.a(this.q, this.b, b3.get(i10)));
        }
        if (!this.p.b(this.b) || chuhVar == null) {
            if (l5 == null || !this.p.d(this.b)) {
                i3 = 1;
                d = chtpVar2.d();
            } else {
                d = l5.m;
                i3 = 1;
            }
            z2 = !d;
        } else if (chtpVar2.d() || !chtpVar2.b().isEmpty() || chuhVar.d) {
            i3 = 1;
            z2 = false;
        } else {
            i3 = 1;
            z2 = true;
        }
        if (chtpVar2.e()) {
            cqix[] cqixVarArr = new cqix[i3];
            cqixVarArr[0] = cqgr.fT(new cibf(), this);
            i5 = i5.n(cqixVarArr);
        } else if (z2) {
            cqix[] cqixVarArr2 = new cqix[i3];
            cqixVarArr2[0] = cqgr.fT(new cibh(), cqkp.T);
            i5 = i5.n(cqixVarArr2);
        }
        if (cqkx.m(this) != null) {
            this.c = i5.z();
            this.f = null;
        } else {
            this.f = i5.z();
        }
        if (z) {
            q(new dbsz(this) { // from class: chyh
                private final chyq a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    this.a.p((RecyclerView) obj);
                }
            });
        }
        if (this.f == null) {
            cqkx.p(this);
        }
    }

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        if (cqiwVar == null || cqkpVar == null || this.p.b(this.b) || this.p.d(this.b)) {
            return;
        }
        m();
    }

    @Override // defpackage.chyf
    public cizl b() {
        return this.u;
    }

    @Override // defpackage.chyf
    public List<cqix<? extends cqkp>> c() {
        return this.v;
    }

    @Override // defpackage.chyf
    public List<cqix<? extends cqkp>> d() {
        return this.c;
    }

    @Override // defpackage.chyf
    public cqrh e() {
        return this;
    }

    public boolean equals(@dzsi Object obj) {
        return obj instanceof chyq;
    }

    @Override // defpackage.chyf
    public View.OnAttachStateChangeListener g() {
        return this;
    }

    @Override // defpackage.chyf
    public cqqw h() {
        return this.B;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{chyq.class});
    }

    @Override // defpackage.chyf
    @dzsi
    public cjaa i() {
        return this.w;
    }

    @Override // defpackage.chyf
    public Boolean j() {
        boolean z = false;
        if (this.p.d(this.b) && this.d && this.y && this.w != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.chyf
    public boolean k(View view) {
        RecyclerView recyclerView = this.C;
        if (recyclerView == null) {
            return false;
        }
        return view.equals(cqhu.a(recyclerView, cizz.a));
    }

    public void l(cqeo cqeoVar) {
        this.H = cqeo.CAN_ASK_FOR_CONSENT.equals(cqeoVar);
        this.q.af();
    }

    public final void m() {
        bvrj.UI_THREAD.c();
        RecyclerView recyclerView = this.C;
        if (recyclerView != null) {
            abs absVar = recyclerView.l;
            if (!(absVar instanceof aag)) {
                return;
            }
            aag aagVar = (aag) absVar;
            int ae = aagVar == null ? -1 : aagVar.ae();
            if (ae < 0 || ae < this.c.size() - 8) {
                return;
            }
            this.q.f(this.b, new Runnable(this) { // from class: chyj
                private final chyq a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m();
                }
            });
        }
    }

    public void n(m mVar) {
        k Nh = mVar.Nh();
        PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl = this.o;
        dbsk.s(publicDisclosureLayout$PublicDisclosureViewModelImpl);
        Nh.a(publicDisclosureLayout$PublicDisclosureViewModelImpl);
    }

    public final void o(RecyclerView recyclerView) {
        abs absVar = recyclerView.l;
        dbsk.s(absVar);
        Parcelable B = absVar.B();
        if (B != null) {
            this.s.put(this.b, B);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (!(view instanceof RecyclerView)) {
            bvoo.h("Unexpected call to onViewAttachedToWindow for non-RecyclerView", new Object[0]);
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        this.C = recyclerView;
        p(recyclerView);
        if (this.f == null) {
            return;
        }
        this.k.execute(new Runnable(this) { // from class: chyi
            private final chyq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                chyq chyqVar = this.a;
                dcdc<cqix<? extends cqkp>> dcdcVar = chyqVar.f;
                if (dcdcVar != null) {
                    chyqVar.c = dcdcVar;
                    chyqVar.f = null;
                    cqkx.p(chyqVar);
                }
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView == null) {
            bvoo.h("Unexpected call to onViewDetachedFromWindow for non-RecyclerView", new Object[0]);
            return;
        }
        this.C = null;
        o(recyclerView);
    }

    public final void p(RecyclerView recyclerView) {
        Parcelable parcelable = this.s.get(this.b);
        if (parcelable != null) {
            abs absVar = recyclerView.l;
            dbsk.s(absVar);
            absVar.C(parcelable);
        } else {
            recyclerView.l(0);
        }
        recyclerView.v();
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.map.ui.CompassButtonView;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: jtg  reason: default package */
/* loaded from: classes7.dex */
public final class jtg implements btph {
    private static final dcqe m = dcqe.c("jtg");
    public final jtc a;
    public final ckcw b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public jtz g;
    public kqp h;
    public mfs i;
    public mvv j;
    private final jto o;
    private final Handler n = new Handler(Looper.getMainLooper());
    public int k = 1;
    public int l = 1;

    public jtg(jtc jtcVar, ckcw ckcwVar, jto jtoVar) {
        bvrj.UI_THREAD.c();
        dbsk.s(jtcVar);
        this.a = jtcVar;
        dbsk.s(ckcwVar);
        this.b = ckcwVar;
        dbsk.s(jtoVar);
        this.o = jtoVar;
        this.c = false;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void b(int i) {
        this.n.postDelayed(new Runnable(this) { // from class: jte
            private final jtg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jtg jtgVar = this.a;
                bvrj.UI_THREAD.c();
                if (jtgVar.c) {
                    return;
                }
                bvrj.UI_THREAD.c();
                ((ckhe) jtgVar.b.a(ckee.az)).c();
                ckcq a = ((ckcr) jtgVar.b.a(ckee.l)).a();
                jtgVar.d();
                a.b();
                jtgVar.c = true;
                if (jtgVar.d) {
                    jtgVar.e();
                }
                if (!jtgVar.e) {
                    return;
                }
                bvrj.UI_THREAD.c();
                if (jtgVar.l == 1) {
                    jtgVar.e = true;
                    return;
                }
                jtgVar.e = false;
                bvrj.UI_THREAD.c();
            }
        }, i);
    }

    public final void d() {
        mfs mfsVar;
        kqp kqpVar;
        jtz jtzVar;
        jtg jtgVar = this;
        bvrj.UI_THREAD.c();
        while (true) {
            int i = jtgVar.k;
            int i2 = jtgVar.l;
            if (i != i2) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                boolean z = false;
                if (i3 == 0) {
                    final jtc jtcVar = jtgVar.a;
                    jtz jtzVar2 = jtgVar.g;
                    dbsk.s(jtzVar2);
                    mvv mvvVar = jtgVar.j;
                    dbsk.s(mvvVar);
                    kqp kqpVar2 = jtgVar.h;
                    dbsk.s(kqpVar2);
                    mfs mfsVar2 = jtgVar.i;
                    dbsk.s(mfsVar2);
                    bvrj.UI_THREAD.c();
                    dbsk.l(!jtcVar.aa);
                    dbsk.l(!jtcVar.ab);
                    Context context = jtcVar.L.d;
                    kzc kzcVar = jtcVar.S;
                    kzcVar.g = kzcVar.i ? kzcVar.a.c(new lan(), null) : kzcVar.a.c(new laq(), null);
                    View c = kzcVar.g.c();
                    CompassButtonView compassButtonView = (CompassButtonView) c.findViewById(lbn.q);
                    compassButtonView.setIsCompassNeedleOnly(true);
                    compassButtonView.setDisplayMode(amzf.AUTO);
                    compassButtonView.setVisibilityMode(amzh.ALWAYS_ON);
                    if (!kzcVar.i) {
                        View findViewById = c.findViewById(laq.a);
                        int e = lbn.w.e(compassButtonView.getContext());
                        findViewById.setTouchDelegate(new TouchDelegate(new Rect(0, 0, e, e), compassButtonView));
                    }
                    compassButtonView.b(kzcVar.b.a().k(), kzcVar.b.a().j);
                    kzcVar.g.e(kzcVar.h);
                    kzcVar.k = new kzb(compassButtonView);
                    kzcVar.m = new asvw(kzcVar.c, kzcVar.d, kzcVar.k, false, kzcVar.e, kzcVar.f, kzcVar.n);
                    kzcVar.m.b();
                    kzcVar.n.b(kzcVar.o);
                    kzcVar.j = true;
                    jtcVar.T.b.i();
                    cqkj cqkjVar = jtcVar.L;
                    kdg kdgVar = jtcVar.ak;
                    kyv kyvVar = new kyv();
                    btrm btrmVar = jtcVar.i;
                    bvjj bvjjVar = jtcVar.m;
                    jtcVar.V = new laf(cqkjVar, kdgVar, kyvVar, new auax(btrmVar, bvjjVar, jtcVar.f, new auan(btrmVar), new auay(btrmVar), new aubb(bvjjVar), dtxm.el, true), new nqu(jtcVar.m, jtcVar.r), jtcVar.M, jtcVar.N.j(), jtcVar.ai, jtcVar.ak.o());
                    laf lafVar = jtcVar.V;
                    lafVar.e.e(lafVar.f);
                    kdg kdgVar2 = lafVar.a;
                    kdf kdfVar = lafVar.k;
                    bvrj.UI_THREAD.c();
                    kdgVar2.e.add(kdfVar);
                    lafVar.a(true);
                    lafVar.b(true);
                    Runnable runnable = lafVar.d;
                    if (runnable != null) {
                        lafVar.c.o(runnable);
                    }
                    laf lafVar2 = jtcVar.V;
                    FrameLayout frameLayout = jtzVar2.l;
                    lafVar2.j = frameLayout;
                    frameLayout.addView(lafVar2.g);
                    if (jtcVar.ak.o()) {
                        jtcVar.U = null;
                        mfsVar = mfsVar2;
                        kqpVar = kqpVar2;
                    } else {
                        mfsVar = mfsVar2;
                        kqpVar = kqpVar2;
                        jtcVar.U = new kzt(jtcVar.L, jtcVar.N.i(), jtcVar.S, jtcVar.T, jtcVar.aj, jtcVar.c, jtcVar.i, jtcVar.K, jtcVar.ak, jtcVar.H, jtcVar.O, jtcVar.N.j(), jtcVar.ai, new kyv());
                        final kzt kztVar = jtcVar.U;
                        kztVar.j();
                        if (kzt.d(kztVar.h) || kztVar.h.g()) {
                            kztVar.r = (ViewGroup) kztVar.b.findViewById(lbn.h);
                            lak lakVar = kztVar.g;
                            ViewGroup viewGroup = kztVar.r;
                            if (lakVar.c == null) {
                                lakVar.c = lakVar.a.c(new lcm(), viewGroup);
                                nud nudVar = (nud) lakVar.c.c();
                                nudVar.setClickable(false);
                                lakVar.c.e(lakVar.b);
                                nue nueVar = lakVar.d;
                                dbsk.l(nueVar.a == null);
                                dbsk.s(nudVar);
                                nueVar.a = nudVar;
                                nudVar.setAnimationDuration(nueVar.d);
                                nudVar.setZoomHandler(nueVar.b);
                                nudVar.setOnActiveStateChangedListener(nueVar.c);
                                nudVar.setMustBeFocusedToBeActive(nueVar.f);
                                nudVar.setActive(nueVar.e);
                                nudVar.j(nueVar.g);
                                if (nueVar.h) {
                                    nudVar.h();
                                }
                                nue nueVar2 = lakVar.d;
                                nueVar2.d = 200L;
                                nud nudVar2 = nueVar2.a;
                                if (nudVar2 != null) {
                                    nudVar2.setAnimationDuration(200L);
                                }
                                nue nueVar3 = lakVar.d;
                                ntr ntrVar = lakVar.e;
                                nueVar3.b = ntrVar;
                                nud nudVar3 = nueVar3.a;
                                if (nudVar3 != null) {
                                    nudVar3.setZoomHandler(ntrVar);
                                }
                            }
                            lak lakVar2 = kztVar.g;
                            ntq ntqVar = kztVar.u;
                            nue nueVar4 = lakVar2.d;
                            nueVar4.c = ntqVar;
                            nud nudVar4 = nueVar4.a;
                            if (nudVar4 != null) {
                                nudVar4.setOnActiveStateChangedListener(ntqVar);
                            }
                            kztVar.b.findViewById(lbn.b).post(new Runnable(kztVar) { // from class: kze
                                private final kzt a;

                                {
                                    this.a = kztVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    kzt kztVar2 = this.a;
                                    ArrayList<View> arrayList = new ArrayList();
                                    View findViewById2 = kztVar2.l.findViewById(lbn.i);
                                    arrayList.add(kztVar2.m);
                                    arrayList.add(kztVar2.n);
                                    arrayList.add(findViewById2);
                                    kyv kyvVar2 = kztVar2.c;
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    kyvVar2.e = animatorSet;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (View view : arrayList) {
                                        arrayList2.add(ObjectAnimator.ofFloat(view, "alpha", 0.0f));
                                    }
                                    animatorSet.playTogether(arrayList2);
                                    animatorSet.setDuration(133L);
                                    animatorSet.addListener(new kyr(arrayList));
                                    animatorSet.setInterpolator(kyvVar2.c);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    kyvVar2.d = animatorSet2;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (View view2 : arrayList) {
                                        arrayList3.add(ObjectAnimator.ofFloat(view2, "alpha", 1.0f));
                                    }
                                    animatorSet2.playTogether(arrayList3);
                                    animatorSet2.setDuration(133L);
                                    animatorSet2.setStartDelay(66L);
                                    animatorSet2.addListener(new kys(arrayList));
                                    animatorSet2.setInterpolator(kyvVar2.c);
                                }
                            });
                        } else {
                            kztVar.n.animate().setDuration(200L);
                            kzt.f(kztVar.b.findViewById(lbn.l), kztVar.b.findViewById(lbn.k));
                            kzt.f(kztVar.b.findViewById(lbn.n), kztVar.b.findViewById(lbn.m));
                        }
                        kztVar.a.setOnTouchListener(new kzk(kztVar));
                        kztVar.l.animate().setDuration(200L);
                        kztVar.k.e(kztVar.s);
                        kztVar.i();
                        kzc kzcVar2 = kztVar.d;
                        lda ldaVar = kztVar.w;
                        dbsk.a((kzcVar2.l == null) ^ (ldaVar == null));
                        kzcVar2.l = ldaVar;
                        kztVar.d.b(kztVar.v);
                        kztVar.e.a(kztVar.x);
                        kztVar.e.b(kztVar.v);
                        kztVar.f.a(kztVar.v);
                        kcy kcyVar = kztVar.j;
                        kzh kzhVar = kztVar.z;
                        kcyVar.a.add(kzhVar);
                        if (kcyVar.b) {
                            kzhVar.a(true);
                        }
                        kztVar.i.a(kztVar.y);
                        kdg kdgVar3 = kztVar.i;
                        kdf kdfVar2 = kztVar.y;
                        bvrj.UI_THREAD.c();
                        kdgVar3.d.add(kdfVar2);
                        ViewGroup viewGroup2 = kztVar.m;
                        cqkf<lcu> cqkfVar = kztVar.d.g;
                        dbsk.s(cqkfVar);
                        viewGroup2.addView(cqkfVar.c());
                        ViewGroup viewGroup3 = kztVar.o;
                        lad ladVar = kztVar.f;
                        if (ladVar.b == null) {
                            ladVar.b = ladVar.a.c(new lcc(), null);
                            ladVar.b.e(ladVar.c);
                        }
                        viewGroup3.addView(ladVar.b.c());
                        ViewGroup viewGroup4 = kztVar.n;
                        lab labVar = kztVar.e;
                        if (labVar.c == null) {
                            labVar.c = labVar.a.c(new lbx(), null);
                            View c2 = labVar.c.c();
                            if (!labVar.b.a().booleanValue()) {
                                View findViewById2 = c2.findViewById(lbn.o);
                                int e2 = lbn.w.e(findViewById2.getContext());
                                c2.setTouchDelegate(new TouchDelegate(new Rect(0, 0, e2, e2), findViewById2));
                            }
                            labVar.c.e(labVar.b);
                        }
                        viewGroup4.addView(labVar.c.c());
                        kzt kztVar2 = jtcVar.U;
                        FrameLayout frameLayout2 = jtzVar2.l;
                        kztVar2.p = frameLayout2;
                        frameLayout2.addView(kztVar2.k.c());
                    }
                    jtcVar.ak.i(new Object());
                    jtcVar.N.b(jtzVar2.f, !jtcVar.ak.o());
                    jtzVar2.t = true;
                    final kzz kzzVar = jtcVar.X;
                    kzzVar.e = bvqj.d(kzzVar.c.h().k, new bvqg(kzzVar) { // from class: kzu
                        private final kzz a;

                        {
                            this.a = kzzVar;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj) {
                            kzz kzzVar2 = this.a;
                            akoq akoqVar = (akoq) obj;
                            aliw J = kzzVar2.c.h().J();
                            dbsk.s(J);
                            kzzVar2.f = J;
                            kzzVar2.a();
                        }
                    }, dege.a);
                    btrm btrmVar2 = kzzVar.a;
                    kzy kzyVar = kzzVar.j;
                    dceq a = dcet.a();
                    a.b(btvr.class, new laa(btvr.class, kzyVar, bvrj.UI_THREAD));
                    btrmVar2.g(kzyVar, a.a());
                    kzzVar.d.a(kzzVar.l);
                    npb npbVar = new npb(jtcVar.L.d, jtzVar2.o);
                    mfs mfsVar3 = mfsVar;
                    kqp kqpVar3 = kqpVar;
                    mvy mvyVar = new mvy(jtcVar.j, jtcVar.b, jtcVar.L.d, jtcVar.l, jtcVar.i, jtcVar.x, jtcVar.h, jtcVar.k, jtcVar.B, jtcVar.Q, jtcVar.b(), mvvVar, jtzVar2);
                    ncp ncpVar = new ncp(mfsVar3, jtcVar.h, jtcVar.g.a(), new mfw(jtcVar.L.d, jss.a, mfsVar3, jtcVar.h, jtcVar.o));
                    jvi jviVar = jtcVar.ao;
                    dbsg dbsgVar = jtcVar.n;
                    brlh brlhVar = jtcVar.t;
                    kcy kcyVar2 = jtcVar.H;
                    kdg kdgVar4 = jtcVar.ak;
                    jvp jvpVar = jtcVar.as;
                    cqkj cqkjVar2 = jtcVar.L;
                    nov novVar = jtcVar.ae;
                    noo nooVar = jtcVar.ag;
                    kxb kxbVar = jtcVar.N;
                    afwo k = kxbVar.k();
                    akox h = jtcVar.N.h();
                    hwe a2 = ((kwy) jtcVar.N).u.a();
                    kxu j = jtcVar.N.j();
                    kzd kzdVar = jtcVar.U;
                    if (kzdVar == null) {
                        kzdVar = new lac();
                    }
                    jvh a3 = jviVar.a(dbsgVar, brlhVar, kcyVar2, kdgVar4, jvpVar, cqkjVar2, mvvVar, kqpVar3, novVar, nooVar, kxbVar, k, h, a2, j, kzdVar, jtcVar.S, jtcVar.N.l(), jtzVar2.g, jtcVar.y, jtcVar.ai, jtcVar.N.m(), jtcVar.R, ((kwy) jtcVar.N).A.a(), jtcVar.ah, jtcVar.al, jtcVar.aq, jtcVar.I, jtcVar.ad, npbVar, jtzVar2.o, jtcVar.z, mvyVar, jtcVar.A, jtcVar.B, jtcVar.D, jtcVar.C, ncpVar, jtcVar.E, jtcVar.F, jtcVar.ar, jtcVar.ap);
                    lea leaVar = a3.ae;
                    akox akoxVar = a3.A;
                    nov novVar2 = a3.x;
                    noo nooVar2 = a3.y;
                    juo juoVar = new juo(a3);
                    mbs mbsVar = a3.aS;
                    mbsVar.getClass();
                    jua juaVar = new jua(mbsVar);
                    dehn<lzf> dehnVar = a3.N;
                    crfr a4 = a3.aZ.a(a3.v.d);
                    kcy kcyVar3 = a3.t;
                    noe noeVar = a3.bg;
                    lea.a(akoxVar, 1);
                    lea.a(novVar2, 2);
                    lea.a(nooVar2, 3);
                    lea.a(juoVar, 4);
                    lea.a(juaVar, 5);
                    lea.a(dehnVar, 6);
                    lea.a(a4, 7);
                    lea.a(kcyVar3, 8);
                    lea.a(noeVar, 9);
                    cqat a5 = leaVar.a.a();
                    lea.a(a5, 10);
                    crzm<Boolean> a6 = leaVar.b.a();
                    lea.a(a6, 11);
                    ckcw a7 = leaVar.c.a();
                    lea.a(a7, 12);
                    Executor a8 = leaVar.d.a();
                    lea.a(a8, 13);
                    dxio a9 = ((dxjh) leaVar.e).a();
                    lea.a(a9, 14);
                    noh a10 = leaVar.f.a();
                    lea.a(a10, 15);
                    ldz ldzVar = new ldz(akoxVar, novVar2, nooVar2, juoVar, juaVar, dehnVar, a4, kcyVar3, noeVar, a5, a6, a7, a8, a9, a10);
                    jvl jvlVar = new jvl(jtcVar.b, jtcVar.d, jtcVar.e, jtcVar.m, jtcVar.u, mvvVar, jtcVar.aq, jtcVar.L, jtcVar.v, jtcVar.af, ldzVar);
                    jtcVar.Y = jvlVar;
                    jvlVar.h.d();
                    jvlVar.h.k(jvlVar.i);
                    jtcVar.Q.j(jvlVar);
                    if (btlu.n(jtcVar.o.j())) {
                        jtzVar = jtzVar2;
                        jtcVar.L.c(new kpo(), jtzVar.p).e(new kpq(jtcVar.a.Ol()));
                    } else {
                        jtzVar = jtzVar2;
                    }
                    if (jtcVar.f.getCarParameters().l && jtcVar.t != null) {
                        jtcVar.W = new astp(jtcVar.L.d, jtcVar.M, jtcVar.i, btsp.b(new dbty(jtcVar) { // from class: jst
                            private final jtc a;

                            {
                                this.a = jtcVar;
                            }

                            @Override // defpackage.dbty
                            public final Object a() {
                                brlh brlhVar2 = this.a.t;
                                dbsk.s(brlhVar2);
                                return brlhVar2;
                            }
                        }), jtcVar.d);
                        cqkj cqkjVar3 = jtcVar.L;
                        int i4 = cqkjVar3.d.getResources().getConfiguration().screenWidthDp;
                        cqkf c3 = cqkjVar3.c(new asnf(i4 < 970 ? cqrp.d(88.0d) : i4 < 1175 ? cqrp.d(120.0d) : cqrp.d(140.0d), 1.115f, true), jtzVar.q);
                        c3.e(jtcVar.W);
                        c3.c().setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 81));
                    }
                    btsp b = btsp.b(new jta(jtcVar, ldzVar, jvlVar));
                    ksr a11 = jtcVar.am.a(jtcVar.N.h(), jtcVar.E, 3);
                    kqg kqgVar = jtcVar.an;
                    kcw kcwVar = jtcVar.R;
                    cqkj cqkjVar4 = jtcVar.L;
                    akox h2 = jtcVar.N.h();
                    dehn<lzf> dehnVar2 = jtcVar.I;
                    Future<nlx> future = jtcVar.J;
                    brlh brlhVar2 = jtcVar.t;
                    vxo vxoVar = jtcVar.E;
                    avsq avsqVar = new avsq(dczx.a(btsp.c(null)));
                    ksw kswVar = jtcVar.P;
                    btvo a12 = kqgVar.a.a();
                    final jtz jtzVar3 = jtzVar;
                    kqg.a(a12, 1);
                    dxio a13 = ((dxjh) kqgVar.b).a();
                    kqg.a(a13, 2);
                    bunm a14 = kqgVar.c.a();
                    kqg.a(a14, 3);
                    Application a15 = kqgVar.d.a();
                    kqg.a(a15, 4);
                    cjqy a16 = kqgVar.e.a();
                    kqg.a(a16, 5);
                    bvrb a17 = kqgVar.f.a();
                    kqg.a(a17, 6);
                    dxio a18 = ((dxjh) kqgVar.g).a();
                    kqg.a(a18, 7);
                    kqg.a(mvvVar, 8);
                    kqg.a(kcwVar, 9);
                    kqg.a(cqkjVar4, 10);
                    kqg.a(h2, 11);
                    kqg.a(jvlVar, 12);
                    kqg.a(b, 13);
                    kqg.a(a11, 14);
                    kqg.a(dehnVar2, 15);
                    kqg.a(future, 16);
                    dxio a19 = ((dxjh) kqgVar.h).a();
                    kqg.a(a19, 17);
                    bvjj a20 = kqgVar.i.a();
                    kqg.a(a20, 19);
                    anhk a21 = kqgVar.j.a();
                    kqg.a(a21, 20);
                    dxio a22 = ((dxjh) kqgVar.k).a();
                    kqg.a(a22, 21);
                    dxio a23 = ((dxjh) kqgVar.l).a();
                    kqg.a(a23, 22);
                    kqg.a(vxoVar, 23);
                    dxio a24 = ((dxjh) kqgVar.m).a();
                    kqg.a(a24, 24);
                    cqat a25 = kqgVar.n.a();
                    kqg.a(a25, 25);
                    kqg.a(avsqVar, 26);
                    akfa a26 = kqgVar.o.a();
                    kqg.a(a26, 27);
                    cjqq a27 = kqgVar.p.a();
                    kqg.a(a27, 28);
                    kqg.a(kswVar, 29);
                    kqg.a(((dxjh) kqgVar.q).a(), 30);
                    ckmd a28 = kqgVar.r.a();
                    kqg.a(a28, 31);
                    kqj a29 = kqgVar.s.a();
                    kqg.a(a29, 32);
                    jtcVar.Z = new kqf(a12, a13, a14, a15, a16, a17, a18, mvvVar, kcwVar, cqkjVar4, h2, jvlVar, b, a11, dehnVar2, future, a19, brlhVar2, a20, a21, a22, a23, vxoVar, a24, a25, avsqVar, a26, a27, kswVar, a28, a29);
                    if (!jtcVar.m.m(bvjk.ki, false)) {
                        Context context2 = jtcVar.L.d;
                        dbpy<Object> dbpyVar = dbpy.a;
                        jtzVar3.getClass();
                        bvor.a(dbpyVar, new mw(jtzVar3) { // from class: jsu
                            private final jtz a;

                            {
                                this.a = jtzVar3;
                            }

                            @Override // defpackage.mw
                            public final void a(Object obj) {
                                this.a.addView((jen) obj);
                            }
                        });
                    }
                    brlh brlhVar3 = jtcVar.t;
                    if (brlhVar3 != null) {
                        brlhVar3.h(jtcVar.N.h());
                    }
                    jtcVar.aa = true;
                    jtgVar = this;
                    jtgVar.l = 2;
                } else if (i3 == 1) {
                    int i5 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i5 == 0) {
                        jtc jtcVar2 = jtgVar.a;
                        bvrj.UI_THREAD.c();
                        dbsk.l(!jtcVar2.ab);
                        dbsk.l(jtcVar2.aa);
                        jtcVar2.aa = false;
                        brlh brlhVar4 = jtcVar2.t;
                        if (brlhVar4 != null) {
                            brlhVar4.h(null);
                        }
                        kqf kqfVar = jtcVar2.Z;
                        dbsk.s(kqfVar);
                        kqfVar.y = true;
                        jtcVar2.Z = null;
                        jvl jvlVar2 = jtcVar2.Y;
                        dbsk.s(jvlVar2);
                        jvlVar2.h.m();
                        jvlVar2.h.e();
                        jtcVar2.Y = null;
                        kzz kzzVar2 = jtcVar2.X;
                        kzzVar2.a.a(kzzVar2.j);
                        cryz<akoq> cryzVar = kzzVar2.e;
                        if (cryzVar != null) {
                            cryzVar.c();
                            kzzVar2.e = null;
                        }
                        kzzVar2.d.b(kzzVar2.l);
                        jtcVar2.N.f();
                        laf lafVar3 = jtcVar2.V;
                        dbsk.s(lafVar3);
                        Runnable runnable2 = lafVar3.d;
                        if (runnable2 != null) {
                            lafVar3.c.p(runnable2);
                        }
                        kdg kdgVar5 = lafVar3.a;
                        kdf kdfVar3 = lafVar3.k;
                        bvrj.UI_THREAD.c();
                        kdgVar5.e.remove(kdfVar3);
                        lafVar3.e.f();
                        ViewGroup viewGroup5 = lafVar3.j;
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(lafVar3.g);
                        }
                        jtcVar2.V = null;
                        kzt kztVar3 = jtcVar2.U;
                        if (kztVar3 != null) {
                            View c4 = kztVar3.k.c();
                            ViewGroup viewGroup6 = kztVar3.p;
                            if (viewGroup6 != null) {
                                viewGroup6.removeView(c4);
                            }
                            c4.setOnGenericMotionListener(null);
                            kdg kdgVar6 = kztVar3.i;
                            kdf kdfVar4 = kztVar3.y;
                            bvrj.UI_THREAD.c();
                            kdgVar6.d.remove(kdfVar4);
                            kztVar3.i.b(kztVar3.y);
                            kztVar3.j.a.remove(kztVar3.z);
                            kztVar3.e.b(null);
                            kztVar3.e.b(null);
                            kztVar3.f.a(null);
                            kztVar3.d.b(null);
                            kztVar3.e.a(null);
                            kztVar3.k.e(null);
                            kztVar3.l.animate().cancel();
                            ViewGroup viewGroup7 = kztVar3.n;
                            if (viewGroup7 != null) {
                                viewGroup7.animate().cancel();
                            }
                            nue nueVar5 = kztVar3.g.d;
                            nueVar5.h = true;
                            nud nudVar5 = nueVar5.a;
                            if (nudVar5 != null) {
                                nudVar5.h();
                            }
                            jtcVar2.U = null;
                        }
                        jtcVar2.T.b.j();
                        kzc kzcVar3 = jtcVar2.S;
                        dbsk.l(kzcVar3.j);
                        kzcVar3.j = false;
                        kzcVar3.n.f(kzcVar3.o);
                        asvw asvwVar = kzcVar3.m;
                        dbsk.s(asvwVar);
                        asvwVar.c();
                        kzcVar3.m = null;
                        jtgVar.l = 1;
                    } else if (i5 == 1) {
                        bvoo.h("Can't transition from created to created", new Object[0]);
                    } else if (i5 == 2) {
                        jtc jtcVar3 = jtgVar.a;
                        bvrj.UI_THREAD.c();
                        dbsk.l(jtcVar3.aa);
                        dbsk.l(!jtcVar3.ab);
                        kxb kxbVar2 = jtcVar3.N;
                        if (jtcVar3.a.No() != null) {
                            z = "android.intent.action.VIEW".equals(jtcVar3.a.No().getAction());
                        }
                        kxbVar2.d(z);
                        jtcVar3.N.g(jtcVar3.a.Nq());
                        jvl jvlVar3 = jtcVar3.Y;
                        dbsk.s(jvlVar3);
                        ldz ldzVar2 = jvlVar3.i;
                        dbsk.l(!ldzVar2.m);
                        lkr lkrVar = ldzVar2.l;
                        if (lkrVar != null) {
                            lkrVar.d();
                        }
                        ldzVar2.k.s.e();
                        ldzVar2.m = true;
                        if (ldzVar2.j != null) {
                            ldzVar2.q.a();
                        }
                        ldzVar2.a.H(true);
                        kzz kzzVar3 = jtcVar3.X;
                        crzm<Boolean> crzmVar = jtcVar3.ac;
                        dbsk.s(crzmVar);
                        kzzVar3.g = crzmVar;
                        kzzVar3.g.d(kzzVar3.k, kzzVar3.b);
                        kzzVar3.i = true;
                        astp astpVar = jtcVar3.W;
                        if (astpVar != null) {
                            astpVar.a();
                        }
                        kpl kplVar = jtcVar3.B;
                        kplVar.a.a();
                        kplVar.b.a();
                        jtcVar3.i.b(new bvkb());
                        jtcVar3.ab = true;
                        jtgVar.l = 3;
                        jtgVar.o.a.a();
                    }
                } else if (i3 != 2) {
                    continue;
                } else {
                    int i6 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i6 == 0 || i6 == 1) {
                        jtc jtcVar4 = jtgVar.a;
                        bvrj.UI_THREAD.c();
                        dbsk.l(jtcVar4.aa);
                        dbsk.l(jtcVar4.ab);
                        jtcVar4.ab = false;
                        kpl kplVar2 = jtcVar4.B;
                        kplVar2.b.b();
                        kplVar2.a.b();
                        astp astpVar2 = jtcVar4.W;
                        if (astpVar2 != null) {
                            astpVar2.b();
                        }
                        kzz kzzVar4 = jtcVar4.X;
                        dbsk.m(kzzVar4.i, "MapInteractionLockoutController not started.");
                        kzzVar4.i = false;
                        crzm<Boolean> crzmVar2 = kzzVar4.g;
                        dbsk.s(crzmVar2);
                        crzmVar2.c(kzzVar4.k);
                        jvl jvlVar4 = jtcVar4.Y;
                        dbsk.s(jvlVar4);
                        ldz ldzVar3 = jvlVar4.i;
                        dbsk.l(ldzVar3.m);
                        if (ldzVar3.j != null) {
                            ldzVar3.q.b();
                        }
                        ldzVar3.m = false;
                        ldzVar3.k.s.f();
                        lkr lkrVar2 = ldzVar3.l;
                        if (lkrVar2 != null) {
                            lkrVar2.s.j.f();
                            lkrVar2.y.f();
                        }
                        jtcVar4.N.e();
                        jtgVar.l = 2;
                    } else if (i6 == 2) {
                        bvoo.h("Can't transition from started to started", new Object[0]);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void e() {
        bvrj.UI_THREAD.c();
        if (this.l == 1) {
            this.d = true;
            return;
        }
        this.d = false;
        jtc jtcVar = this.a;
        bvrj.UI_THREAD.c();
        jvl jvlVar = jtcVar.Y;
        if (jvlVar == null) {
            return;
        }
        vzg vzgVar = new vzg(jvlVar.f, jvlVar.a, jvlVar.e, jvlVar.g);
        Context context = jvlVar.f;
        dehq dehqVar = jvlVar.b;
        dehq dehqVar2 = jvlVar.c;
        ldz ldzVar = jvlVar.i;
        ldzVar.getClass();
        jvk jvkVar = new jvk(ldzVar);
        new vzc(context, dehqVar, dehqVar2).c(vzd.NAVIGATION_RESTORE, new nhb(context, jvlVar.d, jvlVar.j, vzgVar, jvkVar));
    }

    public final void a() {
        if (this.k != 3 || this.c) {
            bvrj.UI_THREAD.c();
            if (!this.c) {
                return;
            }
            d();
            return;
        }
        b(500);
    }
}

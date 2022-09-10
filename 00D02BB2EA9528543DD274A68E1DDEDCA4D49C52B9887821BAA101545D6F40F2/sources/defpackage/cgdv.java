package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cgdv  reason: default package */
/* loaded from: classes4.dex */
public final class cgdv extends ges implements cgrd, egq, bqld, jkh, bxeq, cgel, cgzi, cgzz, cgxm, cgrh {
    public cgrs aA;
    public cgrq aB;
    public cgro aC;
    public cgrm aO;
    public cgdr aP;
    public aujx aQ;
    public cgtq aR;
    public cgts aS;
    public cgrg aT;
    public cgtx aU;
    public cgrj aV;
    public gfq aW;
    public bvjj aX;
    public cgen aY;
    public bwft aZ;
    public cged ad;
    public cgsm ae;
    @dzsi
    public cgwg af;
    public int ag;
    public cgri ai;
    public dxio<dbsg<gli>> ak;
    public btrm al;
    public gga am;
    public bwqv an;
    public btvo ao;
    public akfa ap;
    public cqkj aq;
    public efg ar;
    public befw as;
    public jkf at;
    public cjxo au;
    public bvrb av;
    public cgep aw;
    public cgdy ax;
    public cgez ay;
    public chad az;
    private cgtr bA;
    private cgtw bB;
    private cgrf bC;
    @dzsi
    private cgcy bE;
    @dzsi
    private alax bF;
    @dzsi
    private alax bG;
    @dzsi
    private cgvi bH;
    public gll ba;
    public hwe bb;
    public dxio<ahjq> bc;
    public dxio<cqg> bd;
    public dxio<bzmm> be;
    public cgut bf;
    public cjqy bg;
    public cjqq bh;
    public alhv bi;
    public cgex bj;
    public cztz bk;
    public buuu bl;
    @dzsi
    private akqs bp;
    @dzsi
    private cgdq bq;
    private cqkf<cgwc> br;
    private cqkf<cgwb> bs;
    private cqkf<cgwd> bt;
    private int bu;
    private cgrr bv;
    private cgrp bw;
    private cgrn bx;
    private cgrl by;
    private cgtp bz;
    @dzsi
    public bvpk c;
    @dzsi
    public bvpk d;
    public chac e;
    cgwl f;
    cgzj g;
    private static final dcqe bm = dcqe.c("cgdv");
    public static final String a = cgdv.class.getSimpleName();
    public static final Set<String> b = new HashSet();
    private final cgrc bn = new cgrc();
    private final List<cgdu> bo = new ArrayList();
    public boolean ah = false;
    public final Map<String, dwyg> aj = new LinkedHashMap();
    private final Map<Integer, Bitmap> bD = new HashMap();
    private final alht bI = new cgdf(this);

    public static cgdv aR(bwqv bwqvVar, @dzsi dspd dspdVar, @dzsi alad aladVar, cgem cgemVar) {
        return aT(bwqvVar, new cged(dspdVar, aladVar, cgemVar));
    }

    public static cgdv aT(bwqv bwqvVar, cged cgedVar) {
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "ugc_tasks_state", cgedVar);
        cgdv cgdvVar = new cgdv();
        cgdvVar.B(bundle);
        return cgdvVar;
    }

    public static boolean bL(cgem cgemVar) {
        return cgemVar == cgem.NOTIFICATION || cgemVar == cgem.DOOR_TO_DOOR_NOTIFICATION;
    }

    @dzsi
    public static final NestedScrollView bM(@dzsi cgwi cgwiVar) {
        if (cgwiVar == null) {
            return null;
        }
        Iterator<View> it = cqkx.n(cgwiVar).iterator();
        View next = it.hasNext() ? it.next() : null;
        if (next != null) {
            return (NestedScrollView) cqkx.e(next, cgqq.a, NestedScrollView.class);
        }
        return null;
    }

    private final boolean bN() {
        dwrc C;
        return !this.ad.i.g && (C = this.e.C()) != null && !this.aX.C(bvjk.gQ, b).contains(C.b.J());
    }

    private final void bO(boolean z) {
        cgwl cgwlVar = this.f;
        if (cgwlVar != null) {
            cgwlVar.H(true);
            if (z) {
                return;
            }
            this.f.H(false);
        }
    }

    private final void bP() {
        alax alaxVar = this.bG;
        if (alaxVar != null) {
            alaxVar.b();
            this.bG.c();
            this.bG = null;
        }
        cgvi cgviVar = this.bH;
        if (cgviVar != null) {
            cgviVar.e(false);
            this.bH = null;
        }
    }

    private final void bQ() {
        this.g.d(true);
        this.g.e(true);
        this.e.E().d(true);
    }

    private final void bR(int i) {
        ilo z;
        chac chacVar = this.e;
        if (chacVar == null) {
            return;
        }
        List<cgwi> b2 = chacVar.b();
        if (i < 0 || i >= b2.size()) {
            return;
        }
        cgwi cgwiVar = b2.get(i);
        if (!cgwiVar.x().e().booleanValue() || (z = cgwiVar.z()) == null || z.ai() == null || z.f) {
            return;
        }
        cgdu cgduVar = new cgdu(this, cgwiVar, z.ai().o());
        this.bo.add(cgduVar);
        cgduVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bS() {
        /*
            r16 = this;
            r0 = r16
            cgex r1 = r0.bj
            chac r2 = r0.e
            java.util.List r2 = r2.G()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto Lec
            ghl r1 = r1.c
            int r3 = r1.f
            r4 = 2
            if (r3 != r4) goto L2d
            java.util.Iterator r3 = r2.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lec
            java.lang.Object r4 = r3.next()
            akqq r4 = (defpackage.akqq) r4
            boolean r4 = r1.f(r4)
            if (r4 != 0) goto L1b
        L2d:
            boolean r3 = r2.isEmpty()
            r3 = r3 ^ 1
            defpackage.dbsk.a(r3)
            gll r3 = r1.c
            android.graphics.Rect r3 = r3.d()
            if (r3 != 0) goto L40
            goto Lec
        L40:
            dxio<akzh> r4 = r1.a
            java.lang.Object r4 = r4.a()
            akzh r4 = (defpackage.akzh) r4
            akzh r11 = r4.b()
            r4 = 8
            float[] r12 = new float[r4]
            akqr r4 = new akqr
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
        L59:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r5.next()
            akqq r6 = (defpackage.akqq) r6
            r4.d(r6)
            goto L59
        L69:
            akqs r4 = r4.b()
            akqq r4 = r4.c()
            akra r13 = defpackage.akra.f(r4)
            alad r4 = r11.p()
            float r14 = r4.k
            java.util.Iterator r2 = r2.iterator()
            r10 = 1098907648(0x41800000, float:16.0)
        L81:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La8
            java.lang.Object r4 = r2.next()
            akqq r4 = (defpackage.akqq) r4
            android.content.res.Resources r5 = r1.d
            akra r7 = defpackage.akra.f(r4)
            r4 = r3
            r6 = r13
            r8 = r14
            r9 = r11
            r15 = r10
            r10 = r12
            float r4 = defpackage.ghl.h(r4, r5, r6, r7, r8, r9, r10)
            float r4 = java.lang.Math.min(r15, r4)
            r5 = 1098907648(0x41800000, float:16.0)
            float r10 = java.lang.Math.min(r4, r5)
            goto L81
        La8:
            r15 = r10
            alaa r2 = defpackage.alad.a()
            r2.d(r13)
            r2.c = r15
            float r4 = r3.exactCenterX()
            float r3 = r3.exactCenterY()
            dxio<akzh> r5 = r1.a
            java.lang.Object r5 = r5.a()
            akzh r5 = (defpackage.akzh) r5
            int r5 = r5.y()
            float r5 = (float) r5
            dxio<akzh> r6 = r1.a
            java.lang.Object r6 = r6.a()
            akzh r6 = (defpackage.akzh) r6
            int r6 = r6.z()
            float r6 = (float) r6
            alae r3 = defpackage.alae.a(r4, r3, r5, r6)
            r2.f = r3
            alad r2 = r2.a()
            akox r3 = r1.b
            akyc r2 = defpackage.akyt.e(r2)
            int r1 = r1.e
            r2.b = r1
            r1 = 0
            r3.q(r2, r1)
        Lec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgdv.bS():void");
    }

    private final void bT() {
        alax alaxVar = this.bF;
        if (alaxVar != null) {
            alaxVar.b();
            this.bF.c();
            this.bF = null;
        }
    }

    private final void bU() {
        cgcy cgcyVar = this.bE;
        if (cgcyVar == null) {
            return;
        }
        if (this.e.b().isEmpty()) {
            cgcyVar.a();
            return;
        }
        akqs a2 = alao.a(this.bj.d);
        if (a2 == null) {
            return;
        }
        akqq c = a2.c();
        akqq akqqVar = a2.b;
        double d = akqqVar.a;
        akqq akqqVar2 = a2.a;
        akqs akqsVar = new akqs(c, (d - akqqVar2.a) / 2.0d, (akqqVar.b - akqqVar2.b) / 2.0d);
        ilo iloVar = null;
        for (cgwi cgwiVar : this.e.b()) {
            ilo z = cgwiVar.z();
            akqq aj = z.aj();
            if (aj != null && akqsVar.b(aj) && (iloVar == null || iloVar.aj() == null || aj.b < iloVar.aj().b)) {
                iloVar = z;
            }
        }
        if (iloVar == null) {
            return;
        }
        cjta c2 = cjtd.c(iloVar.a());
        c2.d = dtyd.ar;
        cjtd a3 = c2.a();
        cgdn cgdnVar = new cgdn(this, a3, iloVar);
        if (iloVar.aj() == null) {
            return;
        }
        String string = cgcyVar.a.getString(R.string.UGC_TASKS_TAP_PLACE_CALLOUT);
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        int a4 = cgcyVar.d.c.a();
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmphVar.a |= 1;
        dmphVar.c = a4;
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        int a5 = cgcyVar.d.d.a();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        int i = dmpdVar.a | 2;
        dmpdVar.a = i;
        dmpdVar.c = a5;
        string.getClass();
        dmpdVar.a = i | 1;
        dmpdVar.b = string;
        dmpeVar.b(dmpcVar);
        dmph dmphVar2 = (dmph) dmpeVar.bK();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmphVar2.getClass();
        dmpnVar.b = dmphVar2;
        dmpnVar.a |= 1;
        akqq aj2 = iloVar.aj();
        dbsk.s(aj2);
        dmlp bZ = dmlq.e.bZ();
        dmls a6 = akxh.a(akra.f(aj2));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a6.getClass();
        dmlqVar.b = a6;
        dmlqVar.a |= 1;
        dmlo dmloVar = cgcw.a.get(0);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        dmlq bK = bZ.bK();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        bK.getClass();
        dmpnVar2.d = bK;
        dmpnVar2.a |= 4;
        dsqv<dmpn, akuj> dsqvVar = akvj.b;
        akui bZ2 = akuj.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akuj akujVar = (akuj) bZ2.b;
        akujVar.a |= 4;
        akujVar.d = true;
        dmpkVar.k(dsqvVar, bZ2.bK());
        dmpn dmpnVar3 = (dmpn) dmpkVar.bK();
        synchronized (cgcyVar) {
            cgcyVar.a();
            cgcyVar.e = cgcyVar.b.aC().d(dmpnVar3, dmti.WORLD_ENCODING_LAT_LNG_E7);
            cgcyVar.e.Pt(cgdnVar);
            cgcyVar.b();
        }
        cgcyVar.c.g().d(a3);
    }

    private final void bV(boolean z) {
        alad n;
        if (!z || (n = this.ad.e) == null) {
            n = this.bj.d.n();
        }
        dwsn m = this.aY.m(n);
        this.bp = alao.a(this.bj.d);
        cgre.i(this.bn, this.bl, m);
    }

    @dzsi
    private final bxeq bW() {
        cgwi H = this.e.H();
        if (H == null) {
            return null;
        }
        bxeq l = H.l();
        if (l == null) {
            bvoo.h("No UGC task view model pending for suggestion.", new Object[0]);
        }
        return l;
    }

    private final akpp bX(akqq akqqVar, int i) {
        Map<Integer, Bitmap> map = this.bD;
        Integer valueOf = Integer.valueOf(i);
        Bitmap bitmap = map.get(valueOf);
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(Rn(), i);
            this.bD.put(valueOf, bitmap);
        }
        return akpp.p(akqqVar, true, 1, bitmap);
    }

    public static cgdv g(bwqv bwqvVar, dwsr dwsrVar, @dzsi dspd dspdVar, @dzsi alad aladVar, cgem cgemVar) {
        return aT(bwqvVar, new cged(dwsrVar, dspdVar, cguq.b(dwsrVar) == null ? jjn.HIDDEN : jjn.EXPANDED, aladVar, cgemVar));
    }

    public static cgdv q(bwqv bwqvVar, dwsn dwsnVar, alad aladVar, alad aladVar2, cgem cgemVar) {
        return aT(bwqvVar, new cged(dwsnVar, aladVar, aladVar2, cgemVar));
    }

    public static cgdv w(bwqv bwqvVar, dwsn dwsnVar, @dzsi alad aladVar, alad aladVar2, dpyv dpyvVar) {
        return aT(bwqvVar, new cged(dwsnVar, aladVar, aladVar2, dpyvVar));
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        ff J;
        this.ad.d = jjnVar2;
        jjn jjnVar3 = jjn.HIDDEN;
        if (jjnVar.b() || !jjnVar2.b()) {
            if (jjnVar.b() && !jjnVar2.b() && (J = J()) != null) {
                jmw.d(J, null);
            }
        } else {
            this.g.d(false);
            this.av.a(new Runnable(this) { // from class: cgdb
                private final cgdv a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cgdv cgdvVar = this.a;
                    if (cgdvVar.aD) {
                        cgdvVar.be.a().a(cgdvVar.ax);
                    }
                }
            }, bvrj.UI_THREAD, 1000L);
        }
        if (jjnVar2 != jjn.FULLY_EXPANDED) {
            by();
        }
        bO(!jjnVar2.b());
        this.e.w(jjnVar2);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.ges
    public final void Oo(View view) {
        if (bN()) {
            return;
        }
        super.Oo(view);
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        this.e.v().P(jkjVar, jjnVar, f);
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        cgwi H;
        cgsm cgsmVar;
        if (obj == null) {
            return;
        }
        if (obj instanceof cgsl) {
            if (((cgsl) obj).a && (cgsmVar = this.ae) != null) {
                cgsmVar.d = this.bj.d.n();
            }
            bp();
            return;
        }
        chac chacVar = this.e;
        if (chacVar == null || (H = chacVar.H()) == null) {
            return;
        }
        H.n(obj);
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.av.b(new cgdh(this), bvrj.UI_THREAD);
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        this.g.e(false);
        this.e.E().d(false);
        gga ggaVar = this.aE;
        if (ggaVar == null) {
            return;
        }
        if (ppw.a(btzyVar.p)) {
            ppw.b(ggaVar, new cgdg(this), null);
        } else {
            Toast.makeText(ggaVar, Rp(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY), 0).show();
        }
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
        bxeq bW = bW();
        if (bW != null) {
            bW.aL(str);
        }
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List<dwjj> list) {
        bxeq bW = bW();
        if (bW != null) {
            bW.aM(bxmhVar, list);
        }
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.bqld
    public final void aS(bqlf bqlfVar) {
        cgwi H = this.e.H();
        cgvr cgvrVar = H == null ? null : (cgvr) H.r(cgvr.class);
        if (cgvrVar != null) {
            cgvrVar.c(bqlfVar);
        } else {
            bvoo.h("No review task was found at the focused place.", new Object[0]);
        }
    }

    public final void aU() {
        chac chacVar = this.e;
        dbsk.s(chacVar);
        bw(chacVar.Q());
        if (this.at.l().L() == jjn.FULLY_EXPANDED) {
            this.at.B(jjn.EXPANDED);
        }
    }

    public final void aV(cgwg cgwgVar, cgwi cgwiVar) {
        View view;
        NestedScrollView bM = bM(cgwiVar);
        if (bM == null) {
            return;
        }
        Iterator<View> it = cqkx.n(cgwgVar).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Object next = it.next();
            while (true) {
                view = (View) next;
                if (view.getParent() instanceof View) {
                    if (view.getParent().equals(bM)) {
                        break loop0;
                    }
                    next = view.getParent();
                }
            }
        }
        if (view == null) {
            return;
        }
        int bottom = (view.getBottom() + cqrp.d(120.0d).e(this.am)) - bM.getHeight();
        if (bM.getScrollY() >= bottom) {
            return;
        }
        bM.t(bottom, 250, false);
    }

    public final void aX(Integer num) {
        if (num.intValue() >= 0 && num.intValue() < this.e.b().size()) {
            bw(num.intValue());
        }
        if (this.at.l().L() == jjn.FULLY_EXPANDED) {
            this.at.B(jjn.EXPANDED);
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cgwb> c = this.aq.c(new cgoq(), null);
        this.bs = c;
        c.e(this.e.E());
        cqkf<cgwc> c2 = this.aq.c(new cgpc(), null);
        this.br = c2;
        c2.e(this.g);
        cqkf<cgwd> d = this.aq.d(new cgox(), viewGroup, false);
        this.bt = d;
        return d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        cgcy cgcyVar = this.bE;
        if (cgcyVar != null) {
            synchronized (cgcyVar) {
                cgcyVar.a();
            }
            cgcw cgcwVar = cgcyVar.d;
            cgcwVar.b.j(cgcwVar.c);
            cgcwVar.b.j(cgcwVar.d);
            this.bE = null;
        }
        bT();
        bP();
        this.bn.f();
        J().getWindow().setSoftInputMode(this.bu);
        alad aladVar = this.ad.g;
        if (aladVar != null) {
            this.aY.q(aladVar);
        }
        cgut cgutVar = this.bf;
        if (cgutVar.d()) {
            cgutVar.a.bc.d();
        }
        super.am();
    }

    @Override // defpackage.cgrd
    public final void b() {
        bV(false);
    }

    public final void bA() {
        bvpk bvpkVar = this.c;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        bvpk a2 = bvpk.a(new cgdo(this));
        this.c = a2;
        this.av.a(a2, bvrj.UI_THREAD, 800L);
    }

    public final void bB() {
        if (this.g.b().booleanValue() || this.at.l().L().b() || this.e.f().booleanValue()) {
            return;
        }
        this.g.e(false);
        this.g.d(true);
        bvpk bvpkVar = this.d;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        if (this.e.D().isEmpty()) {
            return;
        }
        bvpk a2 = bvpk.a(new cgdp(this));
        this.d = a2;
        this.av.a(a2, bvrj.UI_THREAD, 5000L);
    }

    public final void bC() {
        this.at.B(jjn.HIDDEN);
        bF();
        this.e.S(-1);
        bz();
    }

    public final boolean bD() {
        dwsx dwsxVar = this.ao.getUgcTasksParameters().c;
        if (dwsxVar == null) {
            dwsxVar = dwsx.f;
        }
        return dwsxVar.c;
    }

    public final void bE() {
        if (!this.at.l().L().b()) {
            this.ad.e = this.bj.d.n();
        }
    }

    public final void bF() {
        if (!this.at.l().L().b()) {
            alad aladVar = this.ad.e;
            if (aladVar != null) {
                akox akoxVar = this.bj.d;
                akyc e = akyt.e(aladVar);
                e.b = cpnx.a;
                akoxVar.p(e);
                return;
            }
            bS();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bG(int i) {
        cgcy cgcyVar = this.bE;
        if (cgcyVar != null) {
            cgcyVar.a();
            this.bE = null;
            this.aX.S(bvjk.gS, true);
        }
        dbsg<gli> a2 = this.ak.a();
        if (((Boolean) a2.h(cgdd.a).c(false)).booleanValue()) {
            a2.b().c();
        }
        bE();
        this.at.B(jjn.EXPANDED);
        bw(i);
    }

    public final void bH(@dzsi dwsr dwsrVar, @dzsi dspd dspdVar) {
        boolean isEmpty = this.e.D().isEmpty();
        dspd B = this.e.B();
        if (dspdVar != null) {
            dbsd.a(dspdVar, B);
        }
        chac chacVar = this.e;
        chacVar.u(dwsrVar, dspdVar, chacVar.z());
        if (isEmpty) {
            bw(this.e.Y(cguq.b(dwsrVar)));
            cgwi H = this.e.H();
            if (H != null) {
                H.w();
                if (bL(this.ad.i) && this.ad.j == dpyv.UGC_TASKS_NEARBY_PLACE_REMINDER) {
                    H.D();
                }
            }
        }
        bR(this.e.e().intValue());
        if (this.e.e().intValue() == -1) {
            this.at.l().L();
            jjn jjnVar = jjn.HIDDEN;
            this.at.B(jjn.HIDDEN);
        }
        bz();
        bU();
    }

    @Override // defpackage.cgel
    public final boolean bI() {
        return this.e.f().booleanValue();
    }

    public final void bJ(akqq akqqVar, int i) {
        akox akoxVar = this.bj.d;
        akyc j = akyt.j(akqqVar, i, this.ba.d());
        j.b = 1000;
        akoxVar.p(j);
    }

    public final void bK(akqq akqqVar, float f) {
        Rect d = this.ba.d();
        Point point = new Point(d.centerX(), d.centerY());
        Rect rect = new Rect(0, -250, 0, 0);
        cgex cgexVar = this.bj;
        alao.e(cgexVar.d, cgexVar.b(), akqqVar, rect, d, point, f, 1000, null);
    }

    @Override // defpackage.cgzz
    public final void bn() {
        if (this.e.b().isEmpty()) {
            this.at.B(jjn.HIDDEN);
            bF();
        } else {
            bw(this.e.e().intValue());
        }
        bz();
        bU();
    }

    @Override // defpackage.cgzz
    public final void bo(dspd dspdVar, List<dspd> list, boolean z) {
        if (this.ai.c()) {
            return;
        }
        this.ae = new cgsm(dspdVar, list);
        if (z) {
            this.ae.d = this.bj.d.n();
        }
        bp();
    }

    public final void bp() {
        cgsm cgsmVar = this.ae;
        if (cgsmVar == null) {
            return;
        }
        cgri cgriVar = this.ai;
        if (cgriVar.c()) {
            return;
        }
        if (!cgriVar.b.i()) {
            cgriVar.f.br();
            return;
        }
        cgriVar.h = cgsmVar;
        cgriVar.g = new ProgressDialog(cgriVar.a, 0);
        cgriVar.g.setMessage(cgriVar.a.getString(R.string.LOADING));
        cgriVar.g.setCancelable(false);
        cgriVar.g.setCanceledOnTouchOutside(false);
        cgriVar.g.show();
        cgriVar.i = "";
        cgrf cgrfVar = cgriVar.e;
        boolean m = cgriVar.c.m(bvjk.hE, true);
        dhrp bZ = dhru.g.bZ();
        drrp a2 = cgsmVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhru dhruVar = (dhru) bZ.b;
        a2.getClass();
        dhruVar.b = a2;
        dhruVar.a |= 1;
        int i = m ? 5 : 3;
        dhru dhruVar2 = (dhru) bZ.b;
        dhruVar2.c = i - 1;
        dhruVar2.a |= 2;
        dhru dhruVar3 = (dhru) bZ.b;
        dhruVar3.d = 1;
        dhruVar3.a |= 4;
        cgre.i(cgrfVar.a, cgrfVar.c, bZ.bK());
    }

    @Override // defpackage.cgrh
    public final void bq(String str, String str2, drrp drrpVar) {
        bvrj.UI_THREAD.c();
        bwft bwftVar = this.aZ;
        String Rp = Rp(R.string.UGC_TASKS_SHARE_MESSAGE_TITLE);
        bwez bwezVar = (bwez) bwftVar;
        bwezVar.n(new bwfj(Rp, str2, str, drrpVar), new bwfs[0], cjtd.a(dtyd.aB), dtyd.aP);
    }

    @Override // defpackage.cgrh
    public final void br() {
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            Toast.makeText(ggaVar, Rp(R.string.UPDATE_SHARES_OPERATION_FAILED), 1).show();
        }
    }

    @Override // defpackage.cgxm
    public final void bs(boolean z, cgvi cgviVar) {
        if (z) {
            bE();
            bT();
            bP();
            bP();
            dpxb dpxbVar = cgviVar.f().c;
            if (dpxbVar == null) {
                dpxbVar = dpxb.c;
            }
            dmni dmniVar = dpxbVar.b;
            if (dmniVar == null) {
                dmniVar = dmni.f;
            }
            alax a2 = alay.a(dmniVar, this.bj.d, false);
            this.bG = a2;
            a2.a();
            this.bH = cgviVar;
            cgwi H = this.e.H();
            akqq aj = H == null ? null : H.z().aj();
            if (aj == null) {
                return;
            }
            this.bb.i(akpp.m(aj, akps.NORMAL), false);
            if ((cgviVar.f().a & 1) == 0) {
                return;
            }
            bJ(aj, cgviVar.f().b);
            return;
        }
        bz();
        bF();
    }

    public final void bt(boolean z) {
        bQ();
        bV(z);
    }

    public final void bu(dwsn dwsnVar) {
        bQ();
        alad aladVar = this.ad.e;
        if (aladVar != null) {
            this.bp = akyx.m(this.bj.d.Y(aladVar));
        }
        cgre.i(this.bn, this.bl, dwsnVar);
    }

    public final boolean bv() {
        if (this.e.f().booleanValue()) {
            if (this.at.l().L() == jjn.COLLAPSED) {
                bE();
                this.at.B(jjn.EXPANDED);
            }
            this.e.N();
            return true;
        }
        return false;
    }

    public final void bw(int i) {
        if (i < 0 || i >= this.e.b().size()) {
            this.at.B(jjn.HIDDEN);
            bz();
            return;
        }
        if (this.at.l().L() == jjn.HIDDEN) {
            bE();
            this.at.B(jjn.EXPANDED);
        }
        bR(i);
        this.e.S(i);
        bR(this.e.O().intValue());
        bz();
        bU();
        by();
    }

    public final boolean bx(boolean z) {
        GmmLocation a2;
        akqs a3;
        if (bD() && !this.at.l().L().b()) {
            if ((bL(this.ad.i) && !this.e.X()) || (a2 = this.bc.a().a()) == null || (a3 = alao.a(this.bj.d)) == null) {
                return false;
            }
            double e = akqo.e(a3.j(), a3.k());
            if (e <= dcyn.a) {
                return false;
            }
            dwsx dwsxVar = this.ao.getUgcTasksParameters().c;
            if (dwsxVar == null) {
                dwsxVar = dwsx.f;
            }
            cgwi H = this.e.H();
            if (z || H == null || H.z().aj() == null) {
                return akqo.e(a2.B(), a3.c()) / e < ((double) dwsxVar.d);
            }
            akqq aj = H.z().aj();
            return aj != null && akqo.e(a2.B(), aj) / e < ((double) dwsxVar.e);
        }
        return false;
    }

    public final void by() {
        akqq aj;
        cgwi H = this.e.H();
        if (H == null || (aj = H.z().aj()) == null) {
            return;
        }
        if (bx(false)) {
            this.bj.c().l();
        } else if (!H.x().t().booleanValue()) {
            bK(aj, this.bj.b().p().k);
        } else {
            bJ(aj, H.x().s());
        }
    }

    public final void bz() {
        akqs akqsVar;
        dmni u;
        if (!this.aD) {
            return;
        }
        bP();
        bT();
        ArrayList arrayList = new ArrayList();
        if (this.e.b().isEmpty()) {
            this.bb.d(arrayList, false);
            return;
        }
        HashSet hashSet = new HashSet();
        List<cgwi> b2 = this.e.b();
        for (cgwi cgwiVar : b2) {
            ilo z = cgwiVar.z();
            if (!dbsd.a(z.ai(), akqi.a)) {
                hashSet.add(z.ai().o());
            }
        }
        cgwi H = this.e.H();
        akqs a2 = alao.a(this.bj.d);
        if (a2 == null) {
            bvoo.h("Got null viewport.", new Object[0]);
            akqsVar = new akqs();
        } else {
            akqq c = a2.c();
            akqq akqqVar = a2.b;
            double d = akqqVar.a;
            akqq akqqVar2 = a2.a;
            double d2 = d - akqqVar2.a;
            double d3 = akqqVar.b - akqqVar2.b;
            akqsVar = new akqs(c, d2 + d2, d3 + d3);
        }
        for (dwyg dwygVar : this.aj.values()) {
            dpum dpumVar = dwygVar.c;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            akqq f = akqq.f(dpumVar);
            if (!hashSet.contains(dwygVar.b) && akqsVar.b(f) && (H == null || !H.B().equals(dwygVar.b))) {
                arrayList.add(bX(f, 2131233161));
            }
        }
        ListIterator<cgwi> listIterator = b2.listIterator(b2.size());
        while (true) {
            akpp akppVar = null;
            if (!listIterator.hasPrevious()) {
                break;
            }
            cgwi previous = listIterator.previous();
            if (H != previous) {
                akqq aj = previous.z().aj();
                if (aj != null) {
                    akppVar = bX(aj, (previous.h(cgwf.POSTED).intValue() > 0 || this.aj.get(previous.z().ai().o()) != null) ? 2131233161 : 2131233162);
                }
                if (akppVar != null) {
                    arrayList.add(akppVar);
                }
            }
        }
        if (this.ao.getUgcTasksParameters().h) {
            bT();
            if (H != null && H.x().u() != null && (u = H.x().u()) != null) {
                alax a3 = alay.a(u, this.bj.d, false);
                this.bF = a3;
                a3.a();
            }
        }
        if (H != null) {
            akqq aj2 = H.z().aj();
            if (aj2 != null) {
                arrayList.add(akpp.m(aj2, akps.NORMAL));
            }
            akqi ai = H.z().ai();
            if (ai != null && aj2 != null) {
                akty aC = this.bj.a().aC();
                aC.o(aC.p(ai.c, aj2.a, aj2.b));
            }
        } else {
            this.bj.a().aC().o(null);
        }
        this.bb.d(arrayList, false);
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        alad c;
        dwsr dwsrVar = (dwsr) obj;
        bvrj.UI_THREAD.c();
        if (!this.e.X()) {
            dhjx c2 = cguq.c(dwsrVar, cguq.a(dwsrVar));
            if (c2 == null || (c = alad.c(c2)) == null) {
                bF();
            } else {
                this.ad.e = c;
                this.aY.k(c);
                akqs m = akyx.m(c2);
                this.bp = m;
                this.aw.c(m);
                bK(c.i, c.k);
            }
        }
        akqs akqsVar = this.bp;
        if (akqsVar != null) {
            this.aw.a(dwsrVar, akqsVar);
        }
        bH(this.aw.d(), this.e.B());
        if (dwsrVar.e.isEmpty()) {
            new AlertDialog.Builder(J()).setMessage(R.string.NO_RESULTS_FOR_THIS_AREA).setPositiveButton(Rp(R.string.OK_BUTTON), (DialogInterface.OnClickListener) null).show();
        }
        this.g.d(false);
        this.e.E().d(false);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (bv()) {
            return true;
        }
        if (this.at.l().L() != jjn.COLLAPSED) {
            return false;
        }
        bC();
        return true;
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        bxeq bW = bW();
        if (bW != null) {
            bW.h(bxmhVar, bxmhVar2, dnqhVar, bxkvVar, cjqmVar);
        }
        gfq.k(this);
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        bxeq bW = bW();
        if (bW != null) {
            bW.i(str, dnqhVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        boolean z;
        dwpc dwpcVar;
        cgut cgutVar = this.bf;
        if (!cgutVar.d()) {
            cgutVar.b = this;
            cgutVar.a.bc.c(cgutVar);
        }
        cgrs cgrsVar = this.aA;
        cgrc cgrcVar = this.bn;
        btpc a2 = cgrsVar.a.a();
        cgrs.a(a2, 1);
        Activity activity = (Activity) ((dxjd) cgrsVar.b).a;
        cgrs.a(activity, 2);
        buwz a3 = cgrsVar.c.a();
        cgrs.a(a3, 3);
        cgrs.a(cgrcVar, 4);
        this.bv = new cgrr(a2, activity, a3, cgrcVar);
        cgrq cgrqVar = this.aB;
        cgrc cgrcVar2 = this.bn;
        btpc a4 = cgrqVar.a.a();
        cgrq.a(a4, 1);
        Activity activity2 = (Activity) ((dxjd) cgrqVar.b).a;
        cgrq.a(activity2, 2);
        buwz a5 = cgrqVar.c.a();
        cgrq.a(a5, 3);
        cgrq.a(cgrcVar2, 4);
        this.bw = new cgrp(a4, activity2, a5, cgrcVar2);
        cgro cgroVar = this.aC;
        cgrc cgrcVar3 = this.bn;
        btpc a6 = cgroVar.a.a();
        cgro.a(a6, 1);
        Activity activity3 = (Activity) ((dxjd) cgroVar.b).a;
        cgro.a(activity3, 2);
        buwz a7 = cgroVar.c.a();
        cgro.a(a7, 3);
        cgro.a(cgrcVar3, 4);
        this.bx = new cgrn(a6, activity3, a7, cgrcVar3);
        cgrm cgrmVar = this.aO;
        cgrc cgrcVar4 = this.bn;
        btpc a8 = cgrmVar.a.a();
        cgrm.a(a8, 1);
        Activity activity4 = (Activity) ((dxjd) cgrmVar.b).a;
        cgrm.a(activity4, 2);
        bvam a9 = cgrmVar.c.a();
        cgrm.a(a9, 3);
        cgrm.a(cgrcVar4, 4);
        this.by = new cgrl(a8, activity4, a9, cgrcVar4);
        cgtq cgtqVar = this.aR;
        cgrc cgrcVar5 = this.bn;
        buku a10 = cgtqVar.a.a();
        cgtq.a(a10, 1);
        cgtq.a(cgrcVar5, 2);
        this.bz = new cgtp(a10, cgrcVar5);
        cgts cgtsVar = this.aS;
        cgrc cgrcVar6 = this.bn;
        bume a11 = cgtsVar.a.a();
        cgts.a(a11, 1);
        cgts.a(cgrcVar6, 2);
        cgtr cgtrVar = new cgtr(a11, cgrcVar6);
        this.bA = cgtrVar;
        cgtx cgtxVar = this.aU;
        cgtp cgtpVar = this.bz;
        cgtx.a((Activity) ((dxjd) cgtxVar.a).a, 1);
        btpc a12 = cgtxVar.b.a();
        cgtx.a(a12, 2);
        cgen a13 = cgtxVar.c.a();
        cgtx.a(a13, 3);
        cgtx.a(cgtpVar, 4);
        cgtx.a(cgtrVar, 5);
        cgtw cgtwVar = new cgtw(a12, a13, cgtpVar, cgtrVar);
        this.bB = cgtwVar;
        this.bz.b = cgtwVar;
        this.bA.b = cgtwVar;
        cgrg cgrgVar = this.aT;
        cgrc cgrcVar7 = this.bn;
        buky a14 = cgrgVar.a.a();
        cgrg.a(a14, 1);
        cgrg.a(cgrcVar7, 2);
        cgrf cgrfVar = new cgrf(a14, cgrcVar7);
        this.bC = cgrfVar;
        cgrj cgrjVar = this.aV;
        Activity activity5 = (Activity) ((dxjd) cgrjVar.a).a;
        cgrj.a(activity5, 1);
        btpc a15 = cgrjVar.b.a();
        cgrj.a(a15, 2);
        bvjj a16 = cgrjVar.c.a();
        cgrj.a(a16, 3);
        awwq a17 = cgrjVar.d.a();
        cgrj.a(a17, 4);
        cgrj.a(cgrfVar, 5);
        cgrj.a(this, 6);
        cgri cgriVar = new cgri(activity5, a15, a16, a17, cgrfVar, this);
        this.ai = cgriVar;
        this.bC.b = cgriVar;
        this.bn.a(bundle);
        cgre.g(this.bn, dwsn.class, this);
        cgrc cgrcVar8 = this.bn;
        cgrr cgrrVar = this.bv;
        cgre.h(cgrcVar8, cgrrVar, cgrrVar.e());
        cgrc cgrcVar9 = this.bn;
        cgrp cgrpVar = this.bw;
        cgre.h(cgrcVar9, cgrpVar, cgrpVar.e());
        cgrc cgrcVar10 = this.bn;
        cgrn cgrnVar = this.bx;
        cgre.h(cgrcVar10, cgrnVar, cgrnVar.e());
        cgre.g(this.bn, dwjv.class, this.by);
        cgre.g(this.bn, dhsk.class, this.bz);
        cgre.g(this.bn, dhvk.class, this.bA);
        cgre.g(this.bn, dhru.class, this.bC);
        try {
            cged cgedVar = (cged) this.an.d(cged.class, bundle != null ? bundle : this.o, "ugc_tasks_state");
            if (cgedVar == null) {
                bvoo.h("Null UgcTasksSerializableState was stored", new Object[0]);
            } else {
                this.ad = cgedVar;
            }
        } catch (IOException e) {
            bvoo.h("Corrupt storage data: %s", e);
        }
        chad chadVar = this.az;
        cgrr cgrrVar2 = this.bv;
        cgrp cgrpVar2 = this.bw;
        cgrn cgrnVar2 = this.bx;
        cgrl cgrlVar = this.by;
        cgtw cgtwVar2 = this.bB;
        Activity activity6 = (Activity) ((dxjd) chadVar.a).a;
        chad.a(activity6, 1);
        chbm a18 = chadVar.b.a();
        chad.a(a18, 2);
        cgyq a19 = chadVar.c.a();
        chad.a(a19, 3);
        cgzg a20 = chadVar.d.a();
        chad.a(a20, 4);
        chat a21 = chadVar.e.a();
        chad.a(a21, 5);
        cgep a22 = chadVar.f.a();
        chad.a(a22, 6);
        cges a23 = chadVar.g.a();
        chad.a(a23, 7);
        btvo a24 = chadVar.h.a();
        chad.a(a24, 8);
        akpm a25 = chadVar.i.a();
        chad.a(a25, 9);
        isd a26 = chadVar.j.a();
        chad.a(a26, 10);
        ahjq a27 = chadVar.k.a();
        chad.a(a27, 11);
        cjqy a28 = chadVar.l.a();
        chad.a(a28, 12);
        chad.a(cgrrVar2, 14);
        chad.a(cgrpVar2, 15);
        chad.a(cgrnVar2, 16);
        chad.a(cgrlVar, 17);
        chad.a(cgtwVar2, 18);
        chad.a(this, 19);
        chac chacVar = new chac(activity6, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, this, cgrrVar2, cgrpVar2, cgrnVar2, cgrlVar, cgtwVar2, this);
        this.e = chacVar;
        dwsr a29 = this.ad.a();
        cged cgedVar2 = this.ad;
        dspd dspdVar = cgedVar2.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cgeb cgebVar = cgedVar2.f;
        if (cgebVar != null) {
            ArrayList<byte[]> arrayList3 = cgebVar.a;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(dspd.x(arrayList3.get(i)));
            }
            ArrayList<byte[]> arrayList4 = cgebVar.b;
            int size2 = arrayList4.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(dspd.x(arrayList4.get(i2)));
            }
        }
        chacVar.u(a29, dspdVar, new cgzd(arrayList, arrayList2));
        cged cgedVar3 = this.ad;
        chac chacVar2 = this.e;
        if (cgedVar3.d == jjn.HIDDEN) {
            chacVar2.a().booleanValue();
        }
        chacVar2.w(cgedVar3.d);
        cgeb cgebVar2 = cgedVar3.f;
        if (cgebVar2 != null) {
            chacVar2.S(cgebVar2.c);
            cgwi H = chacVar2.H();
            cgec cgecVar = cgebVar2.d;
            if (cgecVar != null && H != null) {
                byte[] bArr = cgecVar.a;
                if (bArr.length > 0 && (dwpcVar = (dwpc) bvrs.b(bArr, (dssr) dwpc.e.cu(7))) != null) {
                    H.k(dwpcVar);
                }
                for (dspd dspdVar2 : cgecVar.b.keySet()) {
                    cgwg s = H.s(dspdVar2);
                    if (s != null) {
                        s.E(cgecVar.b.get(dspdVar2));
                        s.z(true);
                    }
                }
            }
            z = true;
        } else {
            z = true;
            chacVar2.U(cguq.b(cgedVar3.a()));
        }
        this.g = new cgzj(this);
        this.f = new cgwl(this.am, this.bd);
        cgsm cgsmVar = this.ad.h;
        if (cgsmVar != null) {
            this.ae = cgsmVar;
        }
        super.l(bundle);
        this.bu = J().getWindow().getAttributes().softInputMode;
        J().getWindow().setSoftInputMode(32);
        if (!this.aX.m(bvjk.gS, false) && !this.ad.d.b()) {
            this.bE = new cgcy(J(), this.bj.a(), this.bh);
        }
        cgex cgexVar = this.bj;
        cged cgedVar4 = this.ad;
        alad aladVar = cgedVar4.e;
        cgem cgemVar = cgedVar4.i;
        if (aladVar != null) {
            cgexVar.f = aladVar;
            alad aladVar2 = cgexVar.f;
            akyc j = akyt.j(aladVar2.i, aladVar2.k, cgexVar.e.d());
            j.b = 1000;
            cgexVar.d.p(j);
        } else {
            cgexVar.f = cgexVar.a.a().p();
        }
        if (cgexVar.f.l > 0.0f) {
            arbu m = cgexVar.c().m();
            alaf a30 = alai.a();
            a30.f = alah.LOCATION_ONLY;
            a30.b = cgexVar.f.k;
            a30.c = 0.0f;
            a30.d = 0.0f;
            m.j(a30.a(), z);
        }
        if (this.e.e().intValue() == -1) {
            bS();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyd.as;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.bs.e(this.e.E());
        this.br.e(this.g);
        this.bt.e(this.e);
        this.bn.c();
        this.as.a();
        cgri cgriVar = this.ai;
        cgriVar.d.f(cgriVar);
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        if (!btpf.c(ggaVar).e) {
            this.au.a(1);
        }
        cgcy cgcyVar = this.bE;
        if (cgcyVar != null) {
            cgcyVar.b();
        }
        btrm btrmVar = this.al;
        dceq a2 = dcet.a();
        a2.b(alhx.class, new cgdw(0, alhx.class, this, bvrj.UI_THREAD));
        a2.b(alhl.class, new cgdw(1, alhl.class, this, bvrj.UI_THREAD));
        a2.b(ardp.class, new cgdw(ardp.class, this));
        a2.b(alie.class, new cgdw(3, alie.class, this, bvrj.UI_THREAD));
        a2.b(alho.class, new cgdw(4, alho.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        this.bi.b(this.bI);
        jjn jjnVar = this.ad.d;
        if (bN() || this.e.H() == null) {
            jjnVar = jjn.HIDDEN;
        }
        jjn jjnVar2 = jjn.HIDDEN;
        Callable<Integer> callable = new Callable(this) { // from class: cgcz
            private final cgdv a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cqrp.d(100.0d).e(this.a.am));
            }
        };
        bO(!jjnVar.b());
        efg efgVar = this.ar;
        egj egjVar = new egj(this);
        egjVar.az(this.P, callable);
        egjVar.ai(jjnVar);
        egjVar.f(false);
        egjVar.ac();
        egjVar.F(this.bs.c());
        egjVar.D(ise.b.e(J()));
        egjVar.t(this);
        egjVar.R(this.br.c());
        egjVar.Q(this.f);
        egjVar.a.S = true;
        egjVar.w(null);
        egjVar.e(this);
        egjVar.J(this);
        egf a3 = egf.a();
        a3.l(false);
        a3.r();
        a3.x = false;
        a3.j();
        a3.p();
        a3.o();
        a3.l = new afwn[]{afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false), afwn.e(afwm.SATELLITE, false), afwn.e(afwm.TERRAIN, false)};
        egjVar.A(a3);
        efgVar.a(egjVar.a());
        if (bN()) {
            this.av.b(new Runnable(this) { // from class: cgdc
                private final cgdv a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cgdv cgdvVar = this.a;
                    gga ggaVar2 = cgdvVar.aE;
                    if (ggaVar2 == null || !ggaVar2.aZ) {
                        return;
                    }
                    gdf gdfVar = new gdf(ggaVar2, 16973942);
                    gdfVar.setCanceledOnTouchOutside(false);
                    cqkf c = cgdvVar.aq.c(new cglz(), null);
                    cgde cgdeVar = new cgde(cgdvVar, gdfVar);
                    dwrc C = cgdvVar.e.C();
                    if (C == null) {
                        return;
                    }
                    c.e(new cgyy(cgdeVar, C));
                    gdfVar.setContentView(c.c());
                    Set<String> C2 = cgdvVar.aX.C(bvjk.gQ, cgdv.b);
                    dwrc C3 = cgdvVar.e.C();
                    dbsk.s(C3);
                    C2.add(C3.b.J());
                    cgdvVar.aX.af(bvjk.gQ, C2);
                    gdfVar.show();
                }
            }, bvrj.UI_THREAD);
        }
        this.e.y(this.aY.p());
        this.bk.d(this.am.getWindowManager(), true);
        bw(this.e.e().intValue());
        bz();
        bU();
        bF();
        if (this.e.D().isEmpty() || this.e.F().isEmpty()) {
            dwsn b2 = this.ad.b();
            if (b2 != null) {
                bu(b2);
            } else {
                bt(true);
            }
        }
        if (bD()) {
            cgdq cgdqVar = new cgdq(this, this.bj.c());
            this.bq = cgdqVar;
            this.bj.d.j().k(cgdqVar);
        }
        this.ax.b = this.ad.i.h;
        btlu j = this.ap.j();
        if (j == null) {
            return;
        }
        this.av.b(new cgdk(this, j.d), bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        cged cgedVar = this.ad;
        chac chacVar = this.e;
        Set<dwpc> c = cged.c(chacVar);
        int intValue = chacVar.e().intValue();
        boolean z = false;
        int i = intValue;
        for (int i2 = 0; i2 < chacVar.b().size(); i2++) {
            cgwi cgwiVar = chacVar.b().get(i2);
            if (cgwiVar.h(cgwf.POSTED).intValue() == cgwiVar.e().size()) {
                if (i2 < intValue) {
                    i--;
                } else if (i2 == intValue) {
                    i = -1;
                }
            }
        }
        dwsr A = chacVar.A();
        if (A != null) {
            int i3 = 5;
            dsqp dsqpVar = (dsqp) A.cu(5);
            dsqpVar.bC(A);
            dwso dwsoVar = (dwso) dsqpVar;
            ArrayList arrayList = new ArrayList();
            for (cgsk cgskVar : chacVar.D()) {
                dwpc dwpcVar = cgskVar.a().b;
                if (dwpcVar == null) {
                    dwpcVar = dwpc.e;
                }
                if (!c.contains(dwpcVar)) {
                    dwqg a2 = cgskVar.a();
                    dwqf dwqfVar = a2.c;
                    if (dwqfVar == null) {
                        dwqfVar = dwqf.g;
                    }
                    if ((dwqfVar.a & 8) != 0) {
                        dwqf dwqfVar2 = a2.c;
                        if (dwqfVar2 == null) {
                            dwqfVar2 = dwqf.g;
                        }
                        dwqc dwqcVar = dwqfVar2.e;
                        if (dwqcVar == null) {
                            dwqcVar = dwqc.g;
                        }
                        dwpc dwpcVar2 = a2.b;
                        if (dwpcVar2 == null) {
                            dwpcVar2 = dwpc.e;
                        }
                        boolean Z = chacVar.Z(dwpcVar2.b);
                        dsqp dsqpVar2 = (dsqp) a2.cu(i3);
                        dsqpVar2.bC(a2);
                        dwpl dwplVar = (dwpl) dsqpVar2;
                        dwqf dwqfVar3 = a2.c;
                        if (dwqfVar3 == null) {
                            dwqfVar3 = dwqf.g;
                        }
                        dsqp dsqpVar3 = (dsqp) dwqfVar3.cu(i3);
                        dsqpVar3.bC(dwqfVar3);
                        dwpq dwpqVar = (dwpq) dsqpVar3;
                        dsqp dsqpVar4 = (dsqp) dwqcVar.cu(i3);
                        dsqpVar4.bC(dwqcVar);
                        dwpr dwprVar = (dwpr) dsqpVar4;
                        dwpz dwpzVar = dwqcVar.f;
                        if (dwpzVar == null) {
                            dwpzVar = dwpz.c;
                        }
                        dsqp dsqpVar5 = (dsqp) dwpzVar.cu(i3);
                        dsqpVar5.bC(dwpzVar);
                        dwpy dwpyVar = (dwpy) dsqpVar5;
                        if (dwpyVar.c) {
                            dwpyVar.bF();
                            dwpyVar.c = z;
                        }
                        dwpz dwpzVar2 = (dwpz) dwpyVar.b;
                        dwpzVar2.a |= 1;
                        dwpzVar2.b = Z;
                        if (dwprVar.c) {
                            dwprVar.bF();
                            dwprVar.c = false;
                        }
                        dwqc dwqcVar2 = (dwqc) dwprVar.b;
                        dwpz bK = dwpyVar.bK();
                        bK.getClass();
                        dwqcVar2.f = bK;
                        dwqcVar2.a |= 16;
                        if (dwpqVar.c) {
                            dwpqVar.bF();
                            dwpqVar.c = false;
                        }
                        dwqf dwqfVar4 = (dwqf) dwpqVar.b;
                        dwqc bK2 = dwprVar.bK();
                        bK2.getClass();
                        dwqfVar4.e = bK2;
                        dwqfVar4.a |= 8;
                        if (dwplVar.c) {
                            dwplVar.bF();
                            dwplVar.c = false;
                        }
                        dwqg dwqgVar = (dwqg) dwplVar.b;
                        dwqf bK3 = dwpqVar.bK();
                        bK3.getClass();
                        dwqgVar.c = bK3;
                        dwqgVar.a |= 2;
                        a2 = dwplVar.bK();
                    }
                    arrayList.add(a2);
                    z = false;
                    i3 = 5;
                }
            }
            if (dwsoVar.c) {
                dwsoVar.bF();
                dwsoVar.c = false;
            }
            ((dwsr) dwsoVar.b).e = dwsr.ck();
            dwsoVar.a(arrayList);
            cgedVar.a = ((dwsr) dwsoVar.bK()).bS();
            cgedVar.b = null;
        }
        cgedVar.c = chacVar.B();
        cgedVar.f = new cgeb(chacVar);
        cgedVar.f.c = i;
        bE();
        cgsm cgsmVar = this.ae;
        if (cgsmVar != null) {
            this.ad.h = cgsmVar;
        }
        this.an.c(bundle, "ugc_tasks_state", this.ad);
        this.bn.d(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        NestedScrollView bM = bM(this.e.H());
        if (bM != null) {
            this.ag = bM.getScrollY();
        }
        cgri cgriVar = this.ai;
        cgriVar.d.i(cgriVar);
        this.as.b();
        this.au.b();
        this.bb.h();
        cgcy cgcyVar = this.bE;
        if (cgcyVar != null) {
            synchronized (cgcyVar) {
                aktc aktcVar = cgcyVar.e;
                if (aktcVar != null) {
                    cgcyVar.b.ak().a(aktcVar);
                }
            }
        }
        cgdq cgdqVar = this.bq;
        if (cgdqVar != null) {
            this.bj.d.j().l(cgdqVar);
            this.bq = null;
        }
        this.al.a(this);
        this.bi.c(this.bI);
        this.bo.clear();
        jmw.d(J(), null);
        this.aY.k(this.ad.e);
        Set<dwpc> c = cged.c(this.e);
        cgep cgepVar = this.aw;
        if (!c.isEmpty()) {
            for (cgeo cgeoVar : cgepVar.b) {
                dwso ca = dwsr.g.ca(cgeoVar.a);
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                ((dwsr) ca.b).e = dwsr.ck();
                for (dwqg dwqgVar : cgeoVar.a.e) {
                    dwpc dwpcVar = dwqgVar.b;
                    if (dwpcVar == null) {
                        dwpcVar = dwpc.e;
                    }
                    if (!c.contains(dwpcVar)) {
                        ca.c(dwqgVar);
                    }
                }
                cgeoVar.a = ca.bK();
            }
        }
        this.bn.e();
        this.bs.e(null);
        this.br.e(null);
        this.bt.e(null);
        super.u();
    }
}

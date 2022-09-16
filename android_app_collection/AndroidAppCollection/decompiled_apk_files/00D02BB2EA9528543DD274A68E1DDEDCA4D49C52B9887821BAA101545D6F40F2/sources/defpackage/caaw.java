package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: caaw  reason: default package */
/* loaded from: classes4.dex */
public final class caaw extends ges implements cgrd, cafo {
    public static final dcqe a = dcqe.c("caaw");
    public jmz aA;
    public ccie aB;
    public cadb aC;
    public dxio<cacl> aO;
    public dxio<ckcw> aP;
    public cpv aQ;
    @dzsi
    public dwtm aR;
    @dzsi
    public dwul aS;
    @dzsi
    public dkcp aT;
    public boolean aU;
    public buvc aX;
    public buvg aY;
    public buvk aZ;
    public caba ad;
    public cabd ae;
    jib af;
    public cqkj ag;
    public efg ah;
    public cafi ai;
    public ceet aj;
    public bzzh ak;
    public akpm al;
    public anhk am;
    public nvh an;
    public bvrb ao;
    public dxio<akfa> ap;
    public cabe aq;
    public cabb ar;
    public cabv as;
    public btvo at;
    public cgen au;
    public bwft av;
    public cabg aw;
    public btrm ax;
    public dxio<apni> ay;
    public dxio<cchz> az;
    private final crzp<btlu> bA;
    public buvu ba;
    public buva bb;
    public buub bc;
    public buzm bd;
    @dzsi
    public int be;
    private boolean bf;
    private alad bg;
    private cqkf<cafa> bh;
    private cqkf<cafc> bi;
    @dzsi
    private dkfu bj;
    private nvg bk;
    private nvg bl;
    @dzsi
    private nvg bm;
    @dzsi
    private nvg bn;
    private nvg bo;
    @dzsi
    private gj bp;
    private final cavf<dkde> bw;
    private final cavf<dwvy> bx;
    private final dcdn<dkcp, cavf<?>> by;
    private final cgrd<dwul> bz;
    cada c;
    public View d;
    public View e;
    public jcp f;
    @dzsi
    public RecyclerView g;
    final Map<dkcp, cagi<? extends dssj, ? extends dssj>> b = new EnumMap(dkcp.class);
    private final cgrc bq = new cgrc();
    private cjtd br = cjtd.b;
    private cjtd bs = cjtd.b;
    private boolean bt = false;
    final ViewTreeObserver.OnPreDrawListener aV = new caak(this);
    private final cqqw bu = new caan(this);
    final cacy aW = new caao(this);
    private final cacy bv = new caap();

    public caaw() {
        caaq caaqVar = new caaq(this);
        this.bw = caaqVar;
        caar caarVar = new caar(this);
        this.bx = caarVar;
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dkcp.PHOTO, caaqVar);
        dcdgVar.f(dkcp.REVIEW, caarVar);
        this.by = dcdgVar.b();
        this.bz = new caat(this);
        this.bA = new caaf(this);
    }

    private final duls bA() {
        bzzh bzzhVar = this.ak;
        List<dtik> a2 = bzzhVar.b.a().a();
        boolean b = btpf.b(bzzhVar.a);
        duli bZ = duls.g.bZ();
        dcdc<dtic> dcdcVar = oxb.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            bZ.a(dulk.b(dcdcVar.get(i).g));
        }
        dcdc<dtia> dcdcVar2 = oxb.a;
        int size2 = dcdcVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bZ.d(duly.b(dcdcVar2.get(i2).e));
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duls dulsVar = (duls) bZ.b;
        dulsVar.b = 2;
        dulsVar.a |= 1;
        for (dtik dtikVar : a2) {
            duln bZ2 = dulo.c.bZ();
            for (dtig dtigVar : new dsrh(dtikVar.a, dtik.b)) {
                bZ2.a(dulm.b(dtigVar.r));
            }
            for (dtle dtleVar : new dsrh(dtikVar.c, dtik.d)) {
                bZ2.b(dulw.b(dtleVar.bk));
            }
            bZ.b(bZ2);
        }
        bZ.c(dulq.COMBINE_ACTIONS_WITH_PREVIOUS_ITEM);
        bZ.c(dulq.REMOVE_PRECEDING_DIVIDER_LINE);
        bZ.c(dulq.FIFE_IMAGE_URL);
        bZ.c(dulq.TEXT_HIGHLIGHT_STYLE_BOLD_ITALIC);
        bZ.c(dulq.PHOTO_VOTE_INFO);
        if (b) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duls.c((duls) bZ.b);
        }
        return bZ.bK();
    }

    private final cabc bw() {
        dwtm dwtmVar;
        if (!this.ai.q() || (dwtmVar = this.aR) == null || !dwtmVar.i) {
            return cabc.AS_SELF;
        }
        return cabc.AS_PUBLIC;
    }

    private static Bundle bx(Bundle bundle, dkcp dkcpVar) {
        int ordinal = dkcpVar.ordinal();
        StringBuilder sb = new StringBuilder(35);
        sb.append("arg_key_content_fetcher_");
        sb.append(ordinal);
        Bundle bundle2 = bundle.getBundle(sb.toString());
        if (bundle2 == null) {
            Bundle bundle3 = new Bundle();
            int ordinal2 = dkcpVar.ordinal();
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("arg_key_content_fetcher_");
            sb2.append(ordinal2);
            bundle.putBundle(sb2.toString(), bundle3);
            return bundle3;
        }
        return bundle2;
    }

    private final View by() {
        cqjg cqjgVar;
        View view = this.d;
        if (this.aU) {
            cqjgVar = cain.b;
        } else {
            cqjgVar = caio.b;
        }
        return cqkx.d(view, cqjgVar);
    }

    private final void bz() {
        if (this.c != null || !bt()) {
            return;
        }
        cadb cadbVar = this.aC;
        caek y = this.ae.y();
        cacy cacyVar = this.be == 0 ? this.bv : this.aW;
        buru a2 = cadbVar.a.a();
        cadb.a(a2, 1);
        bvjj a3 = cadbVar.b.a();
        cadb.a(a3, 2);
        btvo a4 = cadbVar.c.a();
        cadb.a(a4, 3);
        akpm a5 = cadbVar.d.a();
        cadb.a(a5, 4);
        anhk a6 = cadbVar.e.a();
        cadb.a(a6, 5);
        bvrb a7 = cadbVar.f.a();
        cadb.a(a7, 6);
        angp a8 = cadbVar.g.a();
        cadb.a(a8, 7);
        angy a9 = cadbVar.h.a();
        cadb.a(a9, 8);
        cgen a10 = cadbVar.i.a();
        cadb.a(a10, 9);
        cgep a11 = cadbVar.j.a();
        cadb.a(a11, 10);
        dxio a12 = ((dxjh) cadbVar.k).a();
        cadb.a(a12, 11);
        dxio a13 = ((dxjh) cadbVar.l).a();
        cadb.a(a13, 12);
        cdft a14 = cadbVar.m.a();
        cadb.a(a14, 13);
        cafz a15 = cadbVar.n.a();
        cadb.a(a15, 14);
        bztp a16 = cadbVar.o.a();
        cadb.a(a16, 15);
        ckcw a17 = cadbVar.p.a();
        cadb.a(a17, 16);
        cadb.a(y, 17);
        this.c = new cada(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, y, cacyVar);
    }

    public static caaw g(dwtm dwtmVar, @dzsi String str, @dzsi dkcp dkcpVar, @dzsi String str2) {
        caaw caawVar = new caaw();
        Bundle bundle = new Bundle();
        bundle.putByteArray("arg_key_user_contributions_request", dwtmVar.bS());
        if (str != null) {
            bundle.putString("arg_key_user_account_id", str);
        }
        if (dkcpVar != null) {
            bundle.putInt("arg_tab_type_to_open", dkcpVar.i);
        }
        bundle.putString("arg_key_initial_tab_page_section", str2);
        caawVar.B(bundle);
        return caawVar;
    }

    public static caaw i(dwtm dwtmVar, @dzsi String str, @dzsi dkcp dkcpVar, @dzsi String str2) {
        caaw g = g(dwtmVar, str, dkcpVar, str2);
        Bundle bundle = g.o;
        bundle.putBoolean("arg_key_preload_instance", true);
        g.B(bundle);
        return g;
    }

    public static ddho w(boolean z) {
        return z ? dtyd.cq : dtxy.oL;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qd() {
        super.Qd();
        gj gjVar = this.bp;
        if (gjVar != null) {
            J().g().m(gjVar);
        }
        if (this.c != null) {
            this.ae.y().J();
            cada cadaVar = this.c;
            cadaVar.c.b(cadaVar);
            cadaVar.b.b(cadaVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            this.aA.a(recyclerView);
        }
        this.bh.e(null);
        this.bi.e(null);
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        gga ggaVar = this.aE;
        if (ggaVar == null || !ppw.a(btzyVar.p)) {
            aJ(null, true);
        } else {
            ppw.b(ggaVar, new caah(this), new caai(this));
        }
    }

    public final void aJ(@dzsi final dwul dwulVar, final boolean z) {
        cjtd a2;
        if (bvrj.UI_THREAD.b()) {
            dwul dwulVar2 = this.aS;
            if (dwulVar2 == null) {
                a2 = cjtd.b;
            } else {
                a2 = cjtd.a(w(dwulVar2.i));
            }
            this.br = a2;
            this.bs = cjtd.a(bw().equals(cabc.AS_SELF) ? dtyd.bl : dtyd.cw);
            jib q = q(this.af);
            this.af = q;
            this.ad.e(q);
            if (dwulVar != null) {
                this.ad.d(dwulVar);
                this.af = this.ad.t();
                return;
            } else if (z) {
                this.ad.c();
                return;
            } else {
                this.ad.b();
                return;
            }
        }
        bvoo.h("updaterHeader() runs on non-UI_THREAD: %s", bvrj.CURRENT.toString());
        this.ao.b(new Runnable(this, dwulVar, z) { // from class: bzzx
            private final caaw a;
            private final dwul b;
            private final boolean c;

            {
                this.a = this;
                this.b = dwulVar;
                this.c = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aJ(this.b, this.c);
            }
        }, bvrj.UI_THREAD);
    }

    public final void aR() {
        dkcp dkcpVar = this.aT;
        if (dkcpVar != null) {
            this.ad.v(dkcpVar);
        }
    }

    public final View aS() {
        cqjg cqjgVar;
        View view = this.d;
        if (this.aU) {
            cqjgVar = cain.c;
        } else {
            cqjgVar = caio.c;
        }
        return cqkx.d(view, cqjgVar);
    }

    public final cqtv aT() {
        if (this.aU) {
            return cain.a;
        }
        return caio.a;
    }

    public final cqtv aU() {
        return cqrp.d(true != this.aU ? 50.0d : 48.0d);
    }

    public final void aV() {
        dwtm dwtmVar = this.aR;
        if (dwtmVar != null) {
            cgre.i(this.bq, this.bb, dwtmVar);
        }
    }

    public final void aX() {
        dwtm dwtmVar = this.aR;
        if (dwtmVar != null) {
            cgre.m(this.bq, this.bb, dwtmVar, "listener_key_for_header_updates");
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqiw caioVar;
        cqkf<cafc> d = this.ag.d(new cajs(), viewGroup, false);
        this.bi = d;
        d.e(this.ae);
        cqkj cqkjVar = this.ag;
        if (this.aU) {
            caioVar = new cain();
        } else {
            caioVar = new caio();
        }
        cqkf<cafa> d2 = cqkjVar.d(caioVar, viewGroup, false);
        this.bh = d2;
        d2.e(this.ad);
        View c = this.bh.c();
        this.d = c;
        View findViewById = c.findViewById(R.id.toolbar_view);
        if (findViewById instanceof jcp) {
            this.f = (jcp) findViewById;
        }
        this.aF = by();
        View c2 = this.bi.c();
        this.e = c2;
        return c2;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.bq.f();
        this.ai.o(this);
        this.au.q(this.bg);
    }

    @Override // defpackage.cgrd
    public final void b() {
        aV();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bn(dkcp dkcpVar) {
        if (dkcpVar.equals(dkcp.UNKNOWN_TAB_TYPE)) {
            return;
        }
        this.ad.v(dkcpVar);
        if (this.aD) {
            ArrayList arrayList = new ArrayList();
            cqkx.g(this.e, cajs.b, RecyclerView.class, arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                cafe cafeVar = (cafe) cqkx.i(recyclerView);
                if (cafeVar != null && dkcpVar == cafeVar.e()) {
                    this.aT = dkcpVar;
                    this.g = recyclerView;
                    recyclerView.getViewTreeObserver().addOnPreDrawListener(this.aV);
                }
            }
        }
        this.ae.c(dkcpVar);
        if (dkcpVar == dkcp.CONTRIBUTE) {
            if (this.c == null || !this.ae.y().g().booleanValue()) {
                return;
            }
            this.c.h();
            return;
        }
        cagi<? extends dssj, ? extends dssj> cagiVar = this.b.get(dkcpVar);
        if (cagiVar == null) {
            return;
        }
        if (dkcpVar != dkcp.EVENTS || !this.bt) {
            cagiVar.h();
            return;
        }
        cagiVar.j();
        this.bt = false;
    }

    public final void bo() {
        ebn c;
        Boolean bool;
        dkfu dkfuVar;
        dwul dwulVar;
        ebm B = this.ad.B();
        if (B == null || (c = B.c()) == null) {
            return;
        }
        dkfu dkfuVar2 = this.bj;
        if (dkfuVar2 == null || (dwulVar = this.aS) == null) {
            bool = false;
        } else {
            dkfx dkfxVar = dwulVar.k;
            if (dkfxVar == null) {
                dkfxVar = dkfx.d;
            }
            dkfv dkfvVar = dkfxVar.c;
            if (dkfvVar == null) {
                dkfvVar = dkfv.f;
            }
            dkfu dkfuVar3 = dkfvVar.e;
            if (dkfuVar3 == null) {
                dkfuVar3 = dkfu.b;
            }
            bool = Boolean.valueOf(dkfuVar2.equals(dkfuVar3));
        }
        if (bool.booleanValue()) {
            return;
        }
        c.l();
        dwul dwulVar2 = this.aS;
        if (dwulVar2 != null) {
            dkfx dkfxVar2 = dwulVar2.k;
            if (dkfxVar2 == null) {
                dkfxVar2 = dkfx.d;
            }
            dkfv dkfvVar2 = dkfxVar2.c;
            if (dkfvVar2 == null) {
                dkfvVar2 = dkfv.f;
            }
            dkfuVar = dkfvVar2.e;
            if (dkfuVar == null) {
                dkfuVar = dkfu.b;
            }
        } else {
            dkfuVar = null;
        }
        this.bj = dkfuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r0 != 4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        if (r0 != 5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        r2 = "PHOTO_VIEWS";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bp() {
        /*
            r10 = this;
            dwul r0 = r10.aS
            if (r0 == 0) goto L81
            dwtm r0 = r10.aR
            if (r0 == 0) goto L81
            int r1 = r0.a
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L81
            droq r0 = r0.j
            if (r0 != 0) goto L14
            droq r0 = defpackage.droq.c
        L14:
            int r1 = r0.a
            int r1 = defpackage.drol.a(r1)
            java.lang.String r2 = "PHOTO_THUMBS_UP"
            java.lang.String r3 = "PHOTO_VIEWS"
            java.lang.String r4 = "REVIEW_VIEWS"
            java.lang.String r5 = "REVIEW_THUMBS_UP"
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 4
            if (r1 != 0) goto L29
            goto L46
        L29:
            if (r1 != r9) goto L46
            drop r0 = r0.b
            if (r0 != 0) goto L31
            drop r0 = defpackage.drop.b
        L31:
            int r0 = r0.a
            int r0 = defpackage.droo.a(r0)
            if (r0 != 0) goto L3a
            goto L43
        L3a:
            if (r0 == r8) goto L43
            if (r0 == r7) goto L60
            if (r0 == r6) goto L62
            if (r0 == r9) goto L5b
            goto L66
        L43:
            java.lang.String r2 = "UNKNOWN_MILESTONE_TYPE"
            goto L66
        L46:
            int r0 = r0.a
            int r0 = defpackage.drol.a(r0)
            if (r0 != 0) goto L4f
            goto L64
        L4f:
            if (r0 == r8) goto L64
            if (r0 == r7) goto L62
            if (r0 == r6) goto L60
            if (r0 == r9) goto L5d
            r1 = 5
            if (r0 == r1) goto L5b
            goto L66
        L5b:
            r2 = r3
            goto L66
        L5d:
            java.lang.String r2 = "IMPACT_MILESTONE"
            goto L66
        L60:
            r2 = r4
            goto L66
        L62:
            r2 = r5
            goto L66
        L64:
            java.lang.String r2 = "UNKNOWN_FOCUS"
        L66:
            java.lang.String r0 = "REVIEW"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L74
            dkcp r0 = defpackage.dkcp.REVIEW
            r10.bn(r0)
            return
        L74:
            java.lang.String r0 = "PHOTO"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L81
            dkcp r0 = defpackage.dkcp.PHOTO
            r10.bn(r0)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caaw.bp():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bq() {
        this.aS = null;
        cabd cabdVar = this.ae;
        if (cabdVar != null) {
            cabdVar.b();
        }
        aJ(null, false);
        if (this.aD) {
            aV();
        }
    }

    public final void br(RecyclerView recyclerView, boolean z) {
        aag aagVar;
        float f;
        gga ggaVar = this.aE;
        if (ggaVar == null || (aagVar = (aag) recyclerView.l) == null) {
            return;
        }
        View by = by();
        View aS = aS();
        int i = -(by.getHeight() - (ird.b().e(ggaVar) + aT().e(ggaVar)));
        int i2 = 0;
        if (aagVar.aJ() > 0) {
            View I = aagVar.I(0);
            i2 = I == null ? -2147483647 : I.getTop();
        }
        int max = Math.max(i2, i);
        if (z) {
            aS.animate().translationY(max).setDuration(150L);
        } else {
            aS.animate().cancel();
            aS.setTranslationY(max);
        }
        if (i2 == 0 || i2 > i / 2) {
            f = 1.0f;
        } else if (i2 < i) {
            f = 0.0f;
        } else {
            float f2 = i2;
            f = 2.0f - ((f2 + f2) / i);
        }
        if (z) {
            by.animate().alpha(f).setDuration(150L);
        } else {
            by.animate().cancel();
            by.setAlpha(f);
        }
        int i3 = (int) ((1.0f - f) * 255.0f);
        jhz e = this.af.e();
        e.r = i3;
        e.s = i3;
        jib b = e.b();
        this.af = b;
        this.ad.e(b);
        this.ao.b(new Runnable(this) { // from class: bzzn
            private final caaw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jcp jcpVar;
                caaw caawVar = this.a;
                if (!caawVar.aD || (jcpVar = caawVar.f) == null) {
                    return;
                }
                jcpVar.setProperties(caawVar.af);
            }
        }, bvrj.UI_THREAD);
    }

    public final void bs() {
        gga ggaVar = this.aE;
        if (ggaVar == null) {
            return;
        }
        View by = by();
        View aS = aS();
        int e = ird.b().e(ggaVar);
        int e2 = aT().e(ggaVar);
        int height = by.getHeight();
        aS.animate().cancel();
        aS.setTranslationY((e + e2) - height);
        jhz e3 = this.af.e();
        e3.r = 255;
        e3.s = 255;
        jib b = e3.b();
        this.af = b;
        this.ad.e(b);
        this.ao.b(new Runnable(this) { // from class: bzzo
            private final caaw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jcp jcpVar;
                caaw caawVar = this.a;
                if (!caawVar.aD || (jcpVar = caawVar.f) == null) {
                    return;
                }
                jcpVar.setProperties(caawVar.af);
            }
        }, bvrj.UI_THREAD);
    }

    final boolean bt() {
        dwtm dwtmVar = this.aR;
        return (dwtmVar != null && (dwtmVar.a & 1) == 0 && !dwtmVar.i) || this.ad.x().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bu() {
        cqjg cqjgVar;
        View view = this.d;
        if (this.aU) {
            cqjgVar = cain.d;
        } else {
            cqjgVar = caio.d;
        }
        View d = cqkx.d(view, cqjgVar);
        View aS = aS();
        this.ae.s(this.be == 0 ? cqsg.g(cqrp.c(aS.getHeight()), cqrp.d(5.0d)) : cqsg.d(aT(), aU()));
        d.addOnLayoutChangeListener(new caam(this, aS));
    }

    @Override // defpackage.cafo
    public final void bv(int i, @dzsi String str) {
        bvrj.UI_THREAD.c();
        if (this.aR == null) {
            this.aR = dwtm.l;
        }
        if (str != null) {
            dwtm dwtmVar = this.aR;
            dsqp dsqpVar = (dsqp) dwtmVar.cu(5);
            dsqpVar.bC(dwtmVar);
            dwtj dwtjVar = (dwtj) dsqpVar;
            if (dwtjVar.c) {
                dwtjVar.bF();
                dwtjVar.c = false;
            }
            dwtm dwtmVar2 = (dwtm) dwtjVar.b;
            dwtm dwtmVar3 = dwtm.l;
            str.getClass();
            dwtmVar2.a |= 4;
            dwtmVar2.d = str;
            this.aR = (dwtm) dwtjVar.bK();
        }
        if (i - 1 != 0) {
            if (!bt()) {
                return;
            }
            cabk D = this.ad.D();
            if (this.aD) {
                if (D == null) {
                    bvoo.h("TabsViewModel is null when trying to invalidate fragment for NEW_CONTRIBUTION", new Object[0]);
                } else if (D.e() != dkcp.CONTRIBUTE) {
                    return;
                }
            }
        } else if (this.aD) {
            return;
        }
        for (dkcp dkcpVar : this.b.keySet()) {
            cagi<? extends dssj, ? extends dssj> cagiVar = this.b.get(dkcpVar);
            bvrj.UI_THREAD.c();
            cagiVar.b.e();
            cagiVar.b.s();
        }
        bq();
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    @Override // defpackage.cgrd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void c(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caaw.c(java.lang.Object):void");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        cavd cavdVar;
        cavb cavbVar;
        super.l(bundle);
        Bundle bundle2 = bundle != null ? bundle : this.o;
        this.aR = (dwtm) bvrs.b(bundle2.getByteArray("arg_key_user_contributions_request"), (dssr) dwtm.l.cu(7));
        this.aS = (dwul) bvrs.b(bundle2.getByteArray("arg_key_user_contributions_response"), (dssr) dwul.t.cu(7));
        if (bundle == null) {
            this.aU = this.ai.p();
        } else {
            this.aU = bundle2.getBoolean("arg_key_use_contributions_header_layout2");
        }
        this.bq.a(bundle);
        cgre.g(this.bq, dwtm.class, this);
        cgre.h(this.bq, this.bz, "listener_key_for_header_updates");
        if (bundle2.containsKey("arg_tab_type_to_open")) {
            this.aT = dkcp.b(bundle2.getInt("arg_tab_type_to_open"));
        }
        String string = bundle2.getString("arg_key_initial_tab_page_section");
        if (string != null) {
            if (((string.hashCode() == 1857804119 && string.equals("PLACES_YOU_VISITED")) ? (char) 0 : (char) 65535) != 0) {
                throw new IllegalArgumentException();
            }
            this.be = 1;
        }
        this.bf = bundle2.getBoolean("arg_key_preload_instance");
        jhz e = q(null).e();
        e.r = 0;
        e.s = 0;
        this.af = e.b();
        alad aladVar = (alad) bundle2.getSerializable("arg_key_base_map_camera");
        this.bg = aladVar;
        if (aladVar == null) {
            this.bg = this.al.n();
        }
        this.ai.n(this);
        cabc bw = bw();
        cabe cabeVar = this.aq;
        caau caauVar = new caau(this);
        cqqw cqqwVar = this.bu;
        dcdn<dkcp, cavf<?>> dcdnVar = this.by;
        dzsj<cael> dzsjVar = cabeVar.a;
        cabi a2 = cabeVar.b.a();
        cabe.a(a2, 2);
        cacd a3 = cabeVar.c.a();
        cabe.a(a3, 3);
        cbqg a4 = cabeVar.d.a();
        cabe.a(a4, 4);
        cabe.a(caauVar, 5);
        cabe.a(cqqwVar, 6);
        cabe.a(dcdnVar, 7);
        cabe.a(bw, 8);
        cabd cabdVar = new cabd(dzsjVar, a2, a3, a4, caauVar, cqqwVar, dcdnVar, bw);
        this.ae = cabdVar;
        dwul dwulVar = this.aS;
        if (dwulVar != null) {
            cabdVar.a(dwulVar);
        }
        cabb cabbVar = this.ar;
        jib jibVar = this.af;
        bzzi bzziVar = new bzzi(this);
        bzyv bzyvVar = new bzyv(this) { // from class: bzzr
            private final caaw a;

            {
                this.a = this;
            }

            @Override // defpackage.bzyv
            public final void a() {
                cqjg cqjgVar;
                caaw caawVar = this.a;
                duvt bZ = duvu.h.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                duvu duvuVar = (duvu) bZ.b;
                duvuVar.b = 3;
                duvuVar.a |= 1;
                caawVar.bd.a(bZ.bK(), new caag(caawVar), bvrj.UI_THREAD);
                View view = caawVar.d;
                if (caawVar.aU) {
                    cqjgVar = cain.e;
                } else {
                    cqjgVar = caio.e;
                }
                caawVar.ae.s(cqsg.g(cqsg.g(cqrp.c(caawVar.aS().getHeight()), cqrp.c(cqkx.d(view, cqjgVar).getHeight())), cqrp.d(5.0d)));
            }
        };
        Runnable runnable = new Runnable(this) { // from class: bzzs
            private final caaw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.bq();
            }
        };
        Resources a5 = cabbVar.a.a();
        cabb.a(a5, 1);
        ff ffVar = (ff) ((dxjd) cabbVar.b).a;
        cabb.a(ffVar, 2);
        cafi a6 = cabbVar.c.a();
        cabb.a(a6, 3);
        cavs a7 = cabbVar.d.a();
        cabb.a(a7, 4);
        dzsj<akfa> dzsjVar2 = cabbVar.e;
        cabl a8 = cabbVar.f.a();
        cabb.a(a8, 6);
        bzyq a9 = cabbVar.g.a();
        cabb.a(a9, 7);
        ech a10 = cabbVar.h.a();
        cabb.a(a10, 8);
        cabb.a(jibVar, 9);
        cabb.a(bzziVar, 10);
        cabb.a(bzyvVar, 11);
        cabb.a(runnable, 12);
        this.ad = new caba(a5, ffVar, a6, a7, dzsjVar2, a8, a9, a10, jibVar, bzziVar, bzyvVar, runnable);
        dwul dwulVar2 = this.aS;
        if (dwulVar2 != null) {
            aJ(dwulVar2, false);
        }
        this.bl = this.an.a(nxl.CONTRIBUTIONS_REVIEWS_PAGE, new caav(this));
        this.bk = this.an.a(nxl.CONTRIBUTIONS_PHOTOS_PAGE, null);
        this.bm = this.an.a(nxl.CONTRIBUTIONS_EDITS_PAGE, new caaa(this));
        this.bk.j = new caab(this);
        bz();
        this.bl.j = new caac(this);
        if (this.bm != null) {
            this.bm.j = new caad(this);
        }
        caeu caeuVar = new caeu(this.aY, this.bk, this.ay.a().a(), this.at.getUgcOfferingsParameters().i());
        caew caewVar = new caew(this.aZ, this.bl, bA(), this.am);
        nvg nvgVar = this.bm;
        if (nvgVar != null) {
            this.b.put(dkcp.EDIT, new cagl(this.aX, nvgVar));
        }
        this.b.put(dkcp.PHOTO, caeuVar);
        this.b.put(dkcp.REVIEW, caewVar);
        caev caevVar = (caev) this.b.get(dkcp.PUBLIC_LIST);
        if (!bt() && caevVar == null) {
            caae caaeVar = new caae(this);
            nvg a11 = this.an.a(nxl.CONTRIBUTIONS_LISTS_PAGE, null);
            this.bo = a11;
            a11.j = caaeVar;
            this.b.put(dkcp.PUBLIC_LIST, new caev(this.ba, a11));
        }
        if (((caet) this.b.get(dkcp.EVENTS)) == null) {
            caal caalVar = new caal(this);
            nvg a12 = this.an.a(nxl.CONTRIBUTIONS_EVENTS_PAGE, null);
            this.bn = a12;
            a12.j = caalVar;
            this.b.put(dkcp.EVENTS, new caet(this.bc, a12));
        }
        if (bundle != null) {
            for (dkcp dkcpVar : this.b.keySet()) {
                this.b.get(dkcpVar).g(bx(bundle, dkcpVar));
            }
            cabh w = this.ae.w();
            caeu caeuVar2 = (caeu) this.b.get(dkcp.PHOTO);
            if (caeuVar2 != null && w != null && (cavbVar = (cavb) w.n()) != null) {
                cavbVar.g(caeuVar2.a);
            }
            cabh x = this.ae.x();
            caew caewVar2 = (caew) this.b.get(dkcp.REVIEW);
            if (caewVar2 != null && x != null && (cavdVar = (cavd) x.n()) != null) {
                cavdVar.g(caewVar2.a);
            }
        }
        if (this.aS != null) {
            aR();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyd.bT;
    }

    final jib q(@dzsi jib jibVar) {
        jhz e;
        dwul dwulVar;
        final gga ggaVar = this.aE;
        if (ggaVar == null) {
            return new jhz().b();
        }
        if (jibVar != null) {
            e = jibVar.e();
        } else {
            e = jib.f(ggaVar, "").e();
        }
        e.e();
        e.p = cjtd.a(dtyd.bS);
        e.o = this.bs;
        jhm jhmVar = new jhm();
        jhmVar.h = 2;
        jhmVar.c = cqrt.f(2131231746);
        jhmVar.a = Rp(R.string.CONTRIBUTIONS_SHARE_BUTTON_DESCRIPTION);
        jhmVar.b = Rp(R.string.CONTRIBUTIONS_SHARE_BUTTON_DESCRIPTION);
        jhmVar.f = this.br;
        jhmVar.d(new View.OnClickListener(this) { // from class: bzzt
            private final caaw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String Rq;
                caaw caawVar = this.a;
                if (!caawVar.U()) {
                    return;
                }
                dwul dwulVar2 = caawVar.aS;
                String str = "";
                if (dwulVar2 != null) {
                    if (!dwulVar2.j.isEmpty()) {
                        str = dwulVar2.j;
                    } else {
                        dori doriVar = dwulVar2.b;
                        if (doriVar == null) {
                            doriVar = dori.l;
                        }
                        String str2 = doriVar.b;
                        if (!str2.isEmpty()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37);
                            sb.append("https://www.google.com/maps/contrib/");
                            sb.append(str2);
                            sb.append("/");
                            str = sb.toString();
                        }
                    }
                }
                String str3 = str;
                if (dwulVar2 == null || str3.isEmpty()) {
                    gga ggaVar2 = caawVar.aE;
                    if (ggaVar2 == null) {
                        return;
                    }
                    Toast.makeText(ggaVar2, caawVar.Rp(R.string.CONTRIBUTIONS_SHARE_ERROR_MESSAGE), 0).show();
                    return;
                }
                dori doriVar2 = dwulVar2.b;
                if (doriVar2 == null) {
                    doriVar2 = dori.l;
                }
                bwft bwftVar = caawVar.av;
                if (dwulVar2.i) {
                    Rq = caawVar.Rp(R.string.CONTRIBUTIONS_SHARE_TITLE_CURRENT_USER);
                } else {
                    Rq = caawVar.Rq(R.string.CONTRIBUTIONS_SHARE_TITLE_OTHER_USER, doriVar2.d);
                }
                boolean z = doriVar2.g;
                dqwa dqwaVar = doriVar2.j;
                if (dqwaVar == null) {
                    dqwaVar = dqwa.g;
                }
                dqvy dqvyVar = dqwaVar.c;
                if (dqvyVar == null) {
                    dqvyVar = dqvy.h;
                }
                bwftVar.e(Rq, str3, z, dqvyVar.d, doriVar2.b, caaw.w(dwulVar2.i));
            }
        });
        e.c(jhmVar.c());
        if (this.aw.b() && (dwulVar = this.aS) != null && dwulVar.i) {
            jhm jhmVar2 = new jhm();
            jhmVar2.a = Rp(R.string.CONTRIBUTIONS_SHORTCUT_MENU_ITEM_TITLE);
            jhmVar2.b = Rp(R.string.CONTRIBUTIONS_SHORTCUT_MENU_ITEM_TITLE);
            jhmVar2.f = cjtd.a(dtyi.af);
            jhmVar2.d(new View.OnClickListener(this) { // from class: bzzu
                private final caaw a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    caaw caawVar = this.a;
                    if (!caawVar.U()) {
                        return;
                    }
                    caawVar.aw.a();
                }
            });
            e.c(jhmVar2.c());
        }
        dwul dwulVar2 = this.aS;
        boolean z = true;
        boolean z2 = dwulVar2 != null && dwulVar2.i;
        dwtm dwtmVar = this.aR;
        if (dwtmVar != null && !dwtmVar.i) {
            z = false;
        }
        if (z2 && !z && this.ai.q() && !this.aj.e()) {
            jhm jhmVar3 = new jhm();
            jhmVar3.a = Rp(R.string.CONTRIBUTIONS_VIEW_PUBLIC_PROFILE_MENU_ITEM_TITLE);
            jhmVar3.b = Rp(R.string.CONTRIBUTIONS_VIEW_PUBLIC_PROFILE_MENU_ITEM_TITLE);
            jhmVar3.f = cjtd.a(dtyd.bQ);
            jhmVar3.d(new View.OnClickListener(this) { // from class: bzzv
                private final caaw a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    caaw caawVar = this.a;
                    if (!caawVar.U()) {
                        return;
                    }
                    caawVar.ai.f();
                }
            });
            e.c(jhmVar3.c());
            jhm jhmVar4 = new jhm();
            jhmVar4.a = Rp(R.string.CONTRIBUTIONS_PROFILE_SETTING_MENU_ITEM_TITLE);
            jhmVar4.b = Rp(R.string.CONTRIBUTIONS_PROFILE_SETTING_MENU_ITEM_TITLE);
            jhmVar4.f = cjtd.a(dtyd.bP);
            jhmVar4.d(new View.OnClickListener(this, ggaVar) { // from class: bzzw
                private final caaw a;
                private final gga b;

                {
                    this.a = this;
                    this.b = ggaVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    caaw caawVar = this.a;
                    gga ggaVar2 = this.b;
                    if (!caawVar.U()) {
                        return;
                    }
                    bszv.ba(ggaVar2, btki.aU(3));
                }
            });
            e.c(jhmVar4.c());
        }
        return e.b();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.bq.c();
        if (!this.bf) {
            this.aO.a().b(new axrw(this) { // from class: bzzy
                private final caaw a;

                {
                    this.a = this;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    ((ckcm) this.a.aP.a().a(ckdz.aG)).a(i == 0);
                }
            });
        }
        btrm btrmVar = this.ax;
        dceq a2 = dcet.a();
        a2.b(bqje.class, new caax(bqje.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        this.ap.a().C().d(this.bA, dege.a);
        this.bk.f();
        this.bl.f();
        nvg nvgVar = this.bo;
        if (nvgVar != null) {
            nvgVar.f();
        }
        nvg nvgVar2 = this.bm;
        if (nvgVar2 != null) {
            nvgVar2.f();
        }
        nvg nvgVar3 = this.bn;
        if (nvgVar3 != null) {
            nvgVar3.f();
        }
        this.bt = true;
        efg efgVar = this.ah;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.G(this.d, 5);
        egjVar.w(this.P);
        egjVar.x(egr.a);
        egjVar.e(this);
        efgVar.a(egjVar.a());
        dwul dwulVar = this.aS;
        cabk D = this.ad.D();
        if (dwulVar != null) {
            if (D == null) {
                bvoo.h("TabsViewModel is null when trying to change TabsItem, response %s", dwulVar);
                aJ(null, true);
                return;
            }
            bn(D.e());
            bu();
            this.ao.a(new Runnable(this) { // from class: bzzz
                private final caaw a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.aX();
                }
            }, bvrj.UI_THREAD, 8000L);
        } else if (cgre.k(this.bq, dwtm.class).l()) {
        } else {
            aV();
            int a3 = dvlx.a(this.at.getPhotoUploadParameters().f);
            if (a3 == 0 || a3 != 5) {
                return;
            }
            dkcp dkcpVar = this.aT;
            if ((dkcpVar != null && dkcpVar != dkcp.CONTRIBUTE) || this.c == null || !bt()) {
                return;
            }
            this.c.g();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.bq.d(bundle);
        dwtm dwtmVar = this.aR;
        if (dwtmVar != null) {
            bundle.putByteArray("arg_key_user_contributions_request", dwtmVar.bS());
        }
        dwul dwulVar = this.aS;
        String str = null;
        bundle.putByteArray("arg_key_user_contributions_response", dwulVar == null ? null : dwulVar.bS());
        dkcp dkcpVar = this.aT;
        if (dkcpVar != null) {
            bundle.putInt("arg_tab_type_to_open", dkcpVar.i);
        }
        bundle.putSerializable("arg_key_base_map_camera", this.bg);
        if (1 == this.be) {
            str = "PLACES_YOU_VISITED";
        }
        bundle.putString("arg_key_initial_tab_page_section", str);
        for (dkcp dkcpVar2 : this.b.keySet()) {
            this.b.get(dkcpVar2).f(bx(bundle, dkcpVar2));
        }
        bundle.putBoolean("arg_key_use_contributions_header_layout2", this.aU);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.bk.g();
        this.bl.g();
        nvg nvgVar = this.bo;
        if (nvgVar != null) {
            nvgVar.g();
        }
        nvg nvgVar2 = this.bm;
        if (nvgVar2 != null) {
            nvgVar2.g();
        }
        nvg nvgVar3 = this.bn;
        if (nvgVar3 != null) {
            nvgVar3.g();
        }
        this.ax.a(this);
        this.ap.a().C().c(this.bA);
        this.bq.e();
    }
}

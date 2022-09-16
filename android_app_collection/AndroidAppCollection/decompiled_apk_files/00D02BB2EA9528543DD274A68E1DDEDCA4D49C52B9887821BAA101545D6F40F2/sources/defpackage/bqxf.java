package defpackage;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqxf  reason: default package */
/* loaded from: classes4.dex */
public final class bqxf extends ges implements bqvs, crzp {
    public ff a;
    private boolean aA;
    private bqlh aB;
    private boolean aC;
    private dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> aO;
    @dzsi
    private dvqr aP;
    @dzsi
    private Class<? extends bqld> aQ;
    private Runnable aR;
    public bwqv ad;
    public dxio<bbut> ae;
    public efg af;
    public bqvu ag;
    public cchz ah;
    public Handler ai;
    public bqwa aj;
    public bquw ak;
    public bqwg al;
    public bqrv am;
    public bqsa an;
    public bqsm ao;
    public bqso ap;
    public cpv aq;
    public caxn ar;
    public akqi as;
    public boolean at;
    @dzsi
    public bwrs<ilo> au;
    public dhpj av;
    @dzsi
    public cqkf<bqtb> aw;
    public bqvt ax;
    private bexz ay;
    public cqkj b;
    public Executor c;
    public cjqy d;
    public btvo e;
    public beya f;
    public beyi g;
    private dnqh az = bzwi.c(blpk.UNKNOWN);
    private final Queue<Runnable> aS = dclw.a();

    public static Bundle aV(bwqv bwqvVar, bwrs<ilo> bwrsVar, bqjh bqjhVar, dbsg<djgl> dbsgVar) {
        final Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemarkref", bwrsVar);
        if (bqjhVar.b() != 0) {
            bundle.putInt("ratingoverride", bqjhVar.b());
        }
        if (bqjhVar.c() != null) {
            bundle.putString("reviewtextoverride", bqjhVar.c());
        }
        bundle.putSerializable("showthanksonsubmit", bqjhVar.h());
        if (dbsgVar.a()) {
            bundle.putByteArray("thanksresponse", dbsgVar.b().bS());
        }
        Class<? extends bqld> n = bqjhVar.n();
        if (n != null) {
            bundle.putString("reviewFlowListenerFragment", n.getCanonicalName());
        }
        bundle.putByteArray("loggingParams", bqjhVar.j().bS());
        bundle.putBoolean("autoSubmit", bqjhVar.d());
        bundle.putBoolean("showAfterReviewToast", bqjhVar.e());
        bundle.putSerializable("reviewPhotos", dchl.c(bqjhVar.f()));
        bqjhVar.g().e(bundle);
        bundle.putBoolean("isPlaceChangeable", bqjhVar.l());
        dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> k = bqjhVar.k();
        if (k.a()) {
            bundle.putParcelable("reviewAtAPlaceConversionLoggingParams", k.b());
        }
        bundle.putSerializable("contributionSource", bqjhVar.i());
        bvor.a(bqjhVar.o(), new mw(bundle) { // from class: bqwp
            private final Bundle a;

            {
                this.a = bundle;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.putSerializable("intentSourceData", (ddhv) obj);
            }
        });
        bvor.a(bqjhVar.p(), new mw(bundle) { // from class: bqwq
            private final Bundle a;

            {
                this.a = bundle;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.putByteArray("place_visit_metadata", ((dlif) obj).bS());
            }
        });
        return bundle;
    }

    private final boolean aX() {
        return bg() && this.aD && this.aj.e();
    }

    private final void bn() {
        this.ai.removeCallbacks(this.aR);
    }

    public static bqxf q(Bundle bundle) {
        bqxf bqxfVar = new bqxf();
        bqxfVar.B(bundle);
        return bqxfVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<ccih> crzmVar) {
        if (!this.aD) {
            return;
        }
        ccih l = crzmVar.l();
        dbsk.s(l);
        String e = dbsj.e(l.a().v());
        String b = l.b();
        this.ax.af(e);
        this.ax.ae(b);
        cqkf<bqtb> cqkfVar = this.aw;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.ax);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bqtb> cqkfVar = this.aw;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.aw = null;
        }
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi final Object obj) {
        dbsk.s(this.ax);
        if (obj instanceof bbuf) {
            bqks al = this.ax.al();
            dcbg s = dcbg.b(((bbuf) obj).a()).s(bqka.a);
            final bqkr bqkrVar = al.b;
            bqkrVar.getClass();
            dcbg o = s.o(dbst.a(new dbsl(bqkrVar) { // from class: bqkb
                private final bqkr a;

                {
                    this.a = bqkrVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj2) {
                    return this.a.a((bqkl) obj2);
                }
            }));
            dcbg<bqkl> c = al.b().c();
            final bqkr bqkrVar2 = al.b;
            bqkrVar2.getClass();
            al.e(c.o(new dbsl(bqkrVar2) { // from class: bqkc
                private final bqkr a;

                {
                    this.a = bqkrVar2;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj2) {
                    return this.a.a((bqkl) obj2);
                }
            }).m(o));
        }
        dbsg h = !(obj instanceof bbua) ? dbpy.a : this.ao.d.h(new dbrn(obj) { // from class: bqsi
            private final Object a;

            {
                this.a = obj;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj2) {
                List list = (List) obj2;
                final dcdn D = dcbg.b(((bbua) this.a).a()).D(bqsk.a);
                dbsk.l(list.size() == D.size());
                return dcbg.b(list).s(new dbrn(D) { // from class: bqsl
                    private final dcdn a;

                    {
                        this.a = D;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj3) {
                        bbtm bbtmVar = (bbtm) obj3;
                        dwfl dwflVar = (dwfl) this.a.get(bbtmVar.A());
                        return dwflVar == null ? bbtmVar : bbtmVar.F(dwflVar.g);
                    }
                }).z();
            }
        });
        if (h.a()) {
            this.ax.al().d((Iterable) h.b());
        }
        if (obj instanceof aeuf) {
            this.ax.ah(((aeuf) obj).f());
        }
        if (obj instanceof cjcz) {
            this.ax.ah(bwrs.a(((cjcz) obj).a()));
        }
    }

    public final void aJ(bqlf bqlfVar) {
        aT(bqlfVar);
        bqso bqsoVar = this.ap;
        bwrs<ilo> bwrsVar = this.au;
        dbsk.s(bwrsVar);
        bqsoVar.b(bqlf.f(bwrsVar, 1));
    }

    public final bqky aR() {
        String b = cjqg.b(this.d);
        if (b != null) {
            dnqh dnqhVar = this.az;
            dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
            dsqpVar.bC(dnqhVar);
            dnqg dnqgVar = (dnqg) dsqpVar;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar2 = (dnqh) dnqgVar.b;
            dnqh dnqhVar3 = dnqh.p;
            b.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b;
            dnqh bK = dnqgVar.bK();
            this.az = bK;
            this.ap.a(bK);
        }
        bqky h = bqkz.h();
        h.d(this.az);
        h.c(this.av);
        return h;
    }

    public final void aS(CharSequence charSequence) {
        if (!this.a.isFinishing()) {
            Toast.makeText(this.a, charSequence, 1).show();
        }
    }

    public final void aT(bqlf bqlfVar) {
        if (this.aD) {
            this.aj.b();
            this.ak.a(this.aQ, bqlfVar, bqxf.class);
        }
    }

    public final void aU(Runnable runnable) {
        if (!this.aD) {
            this.aS.add(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bqtb> c = this.b.c(new bqre(this.ar.a), null);
        this.aw = c;
        c.e(this.ax);
        cqkf<bqtb> cqkfVar = this.aw;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.fd
    public final void ah(View view, @dzsi Bundle bundle) {
        this.ax.ac(x());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.aj.b();
        super.am();
    }

    @Override // defpackage.bqvb
    public final void b(bbtm bbtmVar) {
        int a = dkxy.a(this.e.getUgcParameters().M().a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 0 || i == 1) {
            bqsm bqsmVar = this.ao;
            dcdc<bbtm> a2 = this.ax.al().a();
            if (a2.isEmpty()) {
                a2 = dcdc.f(bbtmVar);
            }
            final bbut a3 = bqsmVar.b.a();
            dbsk.a(!a2.isEmpty());
            final int indexOf = a2.indexOf(bbtmVar);
            if (indexOf < 0) {
                indexOf = 0;
                while (true) {
                    if (indexOf < a2.size()) {
                        if (a2.get(indexOf).z().equals(bbtmVar.z())) {
                            break;
                        }
                        indexOf++;
                    } else {
                        bvoo.h("Could not find the thumbnail. Using the first photo.", new Object[0]);
                        indexOf = 0;
                        break;
                    }
                }
            }
            Executor executor = bqsmVar.c;
            dbsk.a(true ^ a2.isEmpty());
            final dehn<List<dwfl>> r = a3.r(a2);
            r.Pk(new Runnable(r, a3, indexOf, this) { // from class: bqsj
                private final dehn a;
                private final bbut b;
                private final int c;
                private final gfw d;

                {
                    this.a = r;
                    this.b = a3;
                    this.c = indexOf;
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dehn dehnVar = this.a;
                    bbut bbutVar = this.b;
                    int i2 = this.c;
                    gfw gfwVar = this.d;
                    try {
                        ckni ckniVar = new ckni((List) dehnVar.get(), null);
                        bbtv v = bbty.v();
                        v.c(dbsg.i(bbtw.DONT_SEND_YET));
                        bbutVar.o(ckniVar, i2, v.a(), gfwVar);
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }, executor);
            bqsmVar.d = dbsg.i(a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
        if ((r9 - r5.b) > defpackage.beyi.a) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
        if (r5.d(r2) == false) goto L21;
     */
    @Override // defpackage.bqvs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqxf.c():void");
    }

    @Override // defpackage.bqvs
    public final void d() {
        bn();
        Runnable runnable = new Runnable(this) { // from class: bqwk
            private final bqxf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bqxf bqxfVar = this.a;
                if (!bqxfVar.aj.e() || !bqxfVar.ax.an()) {
                    return;
                }
                bwrs<ilo> bwrsVar = bqxfVar.au;
                dbsk.s(bwrsVar);
                bqwy bqwyVar = new bqwy(bqxfVar, bwrsVar, bqxfVar.ax.ai(dqgr.DRAFT));
                bqwyVar.c.ax.G().g(bqtz.SAVING);
                bqwa bqwaVar = bqwyVar.c.aj;
                bqla bqlaVar = bqwyVar.a;
                bwrs<ilo> bwrsVar2 = bqwyVar.b;
                synchronized (bqwaVar) {
                    if (!bqlaVar.a().a().equals(bqwaVar.a)) {
                        bqlaVar.a();
                        return;
                    }
                    bqwaVar.d(bwrsVar2, bqlaVar, bqwyVar);
                    bqwaVar.g();
                }
            }
        };
        this.aR = runnable;
        this.ai.postDelayed(runnable, this.e.getUgcParameters().b());
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.ax.ao();
        return true;
    }

    @Override // defpackage.bqvs
    public final void g() {
        if (!aX()) {
            return;
        }
        bn();
        if (this.ax.an()) {
            bqkz a = aR().a();
            final bqkx ai = this.ax.ai(dqgr.DRAFT);
            bqku c = bqla.c();
            c.b(ai);
            c.c(a);
            bqla d = c.d();
            bwrs<ilo> bwrsVar = this.au;
            dbsk.s(bwrsVar);
            new bqxe(this, d, bwrsVar, new bqwz(this, ai) { // from class: bqwh
                private final bqxf a;
                private final bqkx b;

                {
                    this.a = this;
                    this.b = ai;
                }

                @Override // defpackage.bqwz
                public final void a(bqlf bqlfVar) {
                    bqxf bqxfVar = this.a;
                    bqkx bqkxVar = this.b;
                    bqxfVar.aS(bqxfVar.a.getString(R.string.DRAFT_REVIEW_SAVED_TOAST));
                    bqle e = bqlf.e();
                    bwrs<ilo> bwrsVar2 = bqxfVar.au;
                    dbsk.s(bwrsVar2);
                    e.c(bwrsVar2);
                    e.b(bqkxVar.i());
                    ((bqjb) e).b = 3;
                    bqxfVar.aJ(e.a());
                }
            }).a();
            return;
        }
        bqvt bqvtVar = this.ax;
        boolean z = !bqvtVar.c.m();
        boolean isEmpty = bqvtVar.c.k().isEmpty();
        if (!bqvtVar.b.a().booleanValue() || (!isEmpty && !z)) {
            bwrs<ilo> bwrsVar2 = this.au;
            dbsk.s(bwrsVar2);
            aJ(bqlf.f(bwrsVar2, 5));
            return;
        }
        w();
    }

    @Override // defpackage.bqvs
    public final void h() {
        if (!aX()) {
            return;
        }
        if (this.ax.G().a().booleanValue()) {
            this.am.a(this.as, new Runnable(this) { // from class: bqwi
                private final bqxf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.w();
                }
            });
            return;
        }
        bwrs<ilo> bwrsVar = this.au;
        dbsk.s(bwrsVar);
        aT(bqlf.f(bwrsVar, 4));
    }

    @Override // defpackage.bqvs
    public final void i(akqi akqiVar) {
        bn();
        if (this.ax.G().a().booleanValue()) {
            bqku c = bqla.c();
            c.b(bqkx.l(this.as));
            c.c(aR().a());
            bqla d = c.d();
            bqwa bqwaVar = this.aj;
            bwrs<ilo> bwrsVar = this.au;
            dbsk.s(bwrsVar);
            bqwaVar.c(d, bwrs.a(bwrsVar.c()), new bqws(this));
        } else {
            this.aj.b();
        }
        this.as = akqiVar;
        this.aj.a(akqiVar);
    }

    @Override // defpackage.bqvs
    public final void j() {
        if (aX()) {
            dlif dlifVar = (dlif) bvrs.g(this.o, "place_visit_metadata", (dssr) dlif.d.cu(7), dlif.d);
            cjdy bZ = cjdz.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cjdz cjdzVar = (cjdz) bZ.b;
            cjdzVar.a |= 1;
            cjdzVar.b = false;
            aZ(cjdi.aR(dlifVar, bZ.bK()));
        }
    }

    @Override // defpackage.bqvs
    public final void k() {
        if (!aX()) {
            return;
        }
        bbuz m = bbve.m();
        m.e(dwyd.REVIEW);
        bwrs<ilo> bwrsVar = this.au;
        dbsk.s(bwrsVar);
        ((bbsu) m).b = bwrsVar.c();
        bqks al = this.ax.al();
        dcbg<bqkl> c = al.b().c();
        final bqkr bqkrVar = al.b;
        bqkrVar.getClass();
        m.i(c.o(dbst.a(new dbsl(bqkrVar) { // from class: bqjk
            private final bqkr a;

            {
                this.a = bqkrVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.a((bqkl) obj);
            }
        })).s(bqjl.a).z());
        m.j(((bqjd) this.aB).a);
        this.ae.a().k(m.a(), this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> dbsgVar;
        bqlh c;
        dnqh dnqhVar;
        super.l(bundle);
        Bundle bundle2 = this.o;
        try {
            bwrs<ilo> e = this.ad.e(ilo.class, bundle2, "placemarkref");
            this.au = e;
            dbsk.b((e == null || e.c() == null) ? false : true, "Cannot create SubmitReviewGmmActivityFragment without a placemark");
            bwrs<ilo> bwrsVar = this.au;
            dbsk.s(bwrsVar);
            ilo c2 = bwrsVar.c();
            dbsk.s(c2);
            this.as = c2.ai();
            this.aC = c2.br();
            this.ay = this.f.a(null);
            this.aj.a(this.as);
            this.ap.b = (chbv) dbsg.j((chbv) bundle2.getSerializable("showthanksonsubmit")).c(chbv.NEVER_SHOW);
            this.ap.a = dbsg.j((djgl) bvrs.b(bundle2.getByteArray("thanksresponse"), (dssr) djgl.g.cu(7)));
            if (bundle2.containsKey("reviewFlowListenerFragment")) {
                String string = bundle2.getString("reviewFlowListenerFragment");
                try {
                    Class cls = Class.forName(string);
                    if (bqld.class.isAssignableFrom(cls)) {
                        this.aQ = cls;
                    }
                } catch (ClassNotFoundException e2) {
                    String valueOf = String.valueOf(string);
                    throw new RuntimeException(valueOf.length() != 0 ? "Cannot locate listener fragment class: ".concat(valueOf) : new String("Cannot locate listener fragment class: "), e2);
                }
            }
            if (bundle2.containsKey("loggingParams") && (dnqhVar = (dnqh) bvrs.b(bundle2.getByteArray("loggingParams"), (dssr) dnqh.p.cu(7))) != null) {
                this.az = dnqhVar;
                this.ap.a(dnqhVar);
            }
            this.aA = bundle2.getBoolean("autoSubmit", true);
            boolean z = bundle2.getBoolean("isPlaceChangeable", false);
            if (bundle2.containsKey("reviewAtAPlaceConversionLoggingParams")) {
                Parcelable parcelable = bundle2.getParcelable("reviewAtAPlaceConversionLoggingParams");
                dbsk.s(parcelable);
                dbsgVar = dbsg.i((ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams) parcelable);
            } else {
                dbsgVar = dbpy.a;
            }
            this.aO = dbsgVar;
            if (bundle != null) {
                this.aP = (dvqr) bvrs.b(bundle.getByteArray("submitreview2response"), (dssr) dvqr.g.cu(7));
            } else {
                this.aP = null;
            }
            this.av = bundle2.containsKey("contributionSource") ? (dhpj) bundle2.getSerializable("contributionSource") : dhpj.UNKNOWN_CONTRIBUTION_SOURCE;
            dbsg i = bundle2.containsKey("intentSourceData") ? dbsg.i((ddhv) bundle2.getSerializable("intentSourceData")) : dbpy.a;
            bqlg bqlgVar = (bqlg) bundle2.getSerializable("suggestedPhotosStatus");
            if (bqlgVar == null || bqlgVar == bqlg.UNDETERMINED) {
                c = bqlh.c();
            } else {
                Serializable serializable = bundle2.getSerializable("suggestedPhotosPhotos");
                c = serializable == null ? bqlh.c() : bqlh.d((List) serializable);
            }
            this.aB = c;
            bqvu bqvuVar = this.ag;
            ff ffVar = this.a;
            boolean z2 = this.aA;
            bwrs<ilo> bwrsVar2 = this.au;
            bqvu.a(this, 1);
            bqvu.a(ffVar, 2);
            bqvu.a(this, 3);
            bqvu.a(bwrsVar2, 6);
            begg a = bqvuVar.a.a();
            bqvu.a(a, 7);
            cqkj a2 = bqvuVar.b.a();
            bqvu.a(a2, 8);
            cqhn a3 = bqvuVar.c.a();
            bqvu.a(a3, 9);
            btvo a4 = bqvuVar.d.a();
            bqvu.a(a4, 10);
            ccie a5 = bqvuVar.e.a();
            bqvu.a(a5, 11);
            bqkt a6 = bqvuVar.f.a();
            bqvu.a(a6, 12);
            bqub a7 = bqvuVar.g.a();
            bqvu.a(a7, 13);
            bqus a8 = bqvuVar.h.a();
            bqvu.a(a8, 14);
            bquj a9 = bqvuVar.i.a();
            bqvu.a(a9, 15);
            cjqy a10 = bqvuVar.j.a();
            bqvu.a(a10, 16);
            bqvi a11 = bqvuVar.k.a();
            bqvu.a(a11, 17);
            bqtv a12 = bqvuVar.l.a();
            bqvu.a(a12, 18);
            cjmt a13 = bqvuVar.m.a();
            bqvu.a(a13, 19);
            dehq a14 = bqvuVar.n.a();
            bqvu.a(a14, 20);
            bqvv a15 = bqvuVar.o.a();
            bqvu.a(a15, 21);
            bqrv a16 = bqvuVar.p.a();
            bqvu.a(a16, 22);
            bqsq a17 = bqvuVar.q.a();
            bqvu.a(a17, 23);
            PublicDisclosureLayout$PublicDisclosureViewModelImpl a18 = bqvuVar.r.a();
            bqvu.a(a18, 24);
            bqvt bqvtVar = new bqvt(this, ffVar, this, z2, z, bwrsVar2, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18);
            this.ax = bqvtVar;
            if (i.a()) {
                bqvtVar.l = (ddhv) i.b();
            }
            if (bundle != null) {
                this.ax.al().d((Iterable) dbsg.j((List) bundle.getSerializable("reviewPhotos")).c(dcdc.e()));
                this.ax.aj(bundle.getString("reviewtext"));
                this.ax.ak(bundle.getInt("starrating"));
                return;
            }
            bqks al = this.ax.al();
            final bqkr b = al.b();
            dcdc z3 = dcbg.b(dcbg.b((Iterable) dbsg.j((List) bundle2.getSerializable("reviewPhotos")).c(dcdc.e())).s(bqjm.a)).o(dbst.a(new dbsl(b) { // from class: bqkn
                private final bqkr a;

                {
                    this.a = b;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.a((bqkl) obj);
                }
            })).z();
            al.e(z3.size() == 0 ? b.c() : b.c().m(z3));
            if (bundle2.containsKey("ratingoverride")) {
                this.ax.ak(bundle2.getInt("ratingoverride"));
            }
            if (bundle2.containsKey("reviewtextoverride")) {
                this.ax.aj(bundle2.getString("reviewtextoverride"));
            }
            this.at = bundle2.getBoolean("showAfterReviewToast", true);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Cannot create SubmitReviewGmmActivityFragment without a placemark", e3);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyf.Q;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        while (!this.aS.isEmpty()) {
            this.aS.remove().run();
        }
        this.al.a();
        this.ah.d().d(this, this.c);
        efg efgVar = this.af;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(true);
        egjVar.w(this.P);
        egjVar.J(new egq(this) { // from class: bqwm
            private final bqxf a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                final bqxf bqxfVar = this.a;
                bqxfVar.c.execute(new Runnable(bqxfVar) { // from class: bqwo
                    private final bqxf a;

                    {
                        this.a = bqxfVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bqxf bqxfVar2 = this.a;
                        bqsa bqsaVar = bqxfVar2.an;
                        dbsg<View> a = bqsa.a(bqxfVar2.aw);
                        if (!a.a()) {
                            return;
                        }
                        cqhu cqhuVar = bqsaVar.b;
                        dbsg j = dbsg.j((EditText) cqkx.e(a.b(), bqtb.a, EditText.class));
                        if (!j.a()) {
                            return;
                        }
                        EditText editText = (EditText) j.b();
                        editText.setSelection(editText.getText().length());
                        editText.requestFocus();
                        ((InputMethodManager) bqsaVar.a.getSystemService("input_method")).showSoftInput(editText, 1);
                    }
                });
            }
        });
        egjVar.e(new ecs(this) { // from class: bqwn
            private final bqxf a;

            {
                this.a = this;
            }

            @Override // defpackage.ecs
            public final void Qf() {
                bqxf bqxfVar = this.a;
                bqxfVar.aq.f(bqxfVar.P, bqxfVar.Rn().getString(R.string.ACCESSIBILITY_STARS_SELECTED, jex.b(bqxfVar.Rn(), bqxfVar.ax.C().a().intValue())));
            }
        });
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("reviewtext", this.ax.D().a());
        bundle.putInt("starrating", this.ax.C().a().intValue());
        bundle.putSerializable("reviewPhotos", new ArrayList(this.ax.al().a()));
        this.aB.e(bundle);
        dvqr dvqrVar = this.aP;
        bundle.putByteArray("submitreview2response", dvqrVar == null ? null : dvqrVar.bS());
        Class<? extends bqld> cls = this.aQ;
        if (cls != null) {
            bundle.putString("reviewFlowListenerFragment", cls.getCanonicalName());
        }
        if (this.aO.a()) {
            bundle.putParcelable("reviewAtAPlaceConversionLoggingParams", this.aO.b());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.ah.d().c(this);
        bqsa bqsaVar = this.an;
        dbsg<View> a = bqsa.a(this.aw);
        if (!a.a()) {
            return;
        }
        final dccx F = dcdc.F();
        cqhu cqhuVar = bqsaVar.b;
        cqjg cqjgVar = bqtb.a;
        F.getClass();
        cqkx.h(a.b(), cqjgVar, EditText.class, new dbrn(F) { // from class: bqry
            private final dccx a;

            {
                this.a = F;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dccx dccxVar = this.a;
                dccxVar.g((EditText) obj);
                return dccxVar;
            }
        });
        dbsg r = dcbg.b(F.f()).o(bqrz.a).r(bqrx.a);
        if (r.a()) {
            ((EditText) r.b()).clearFocus();
        }
        ((InputMethodManager) bqsaVar.a.getSystemService("input_method")).hideSoftInputFromWindow(bqsaVar.a.getWindow().getDecorView().getWindowToken(), 0);
    }

    public final void w() {
        bwrs<ilo> bwrsVar = this.au;
        dbsk.s(bwrsVar);
        final bqww bqwwVar = new bqww(this, bwrsVar, aR().a(), new bqwr(this));
        bqku c = bqla.c();
        c.b(bqkx.l(bqwwVar.d.as));
        bqky h = bqkz.h();
        h.d(bqwwVar.b.a());
        h.c(bqwwVar.d.av);
        c.c(h.a());
        bqla d = c.d();
        ProgressDialog b = bqwwVar.d.am.b(d);
        if (bqwwVar.d.aj.c(d, bqwwVar.a, new bqwv(bqwwVar, b))) {
            bqwwVar.d.aU(new Runnable(bqwwVar) { // from class: bqwt
                private final bqww a;

                {
                    this.a = bqwwVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d.ax.G().g(bqtz.NO_DRAFT);
                }
            });
            b.show();
        }
    }
}

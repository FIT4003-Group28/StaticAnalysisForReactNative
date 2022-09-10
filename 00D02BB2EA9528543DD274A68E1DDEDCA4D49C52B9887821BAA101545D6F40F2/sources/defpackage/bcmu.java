package defpackage;

import android.app.Activity;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.SpannableString;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bcmu  reason: default package */
/* loaded from: classes3.dex */
public class bcmu implements bclv {
    public static final dcqe a = dcqe.c("bcmu");
    static final bcmg b = new bcmq();
    private final bclq A;
    private final dxio<afha> B;
    private final String C;
    private final String D;
    @dzsi
    private final dwfl E;
    @dzsi
    private bcmt F;
    @dzsi
    private Parcelable G;
    private final bcmr H;
    private final cjtd I;
    @dzsi
    private final cjtd J;
    @dzsi
    private bclh K;
    private final boolean L;
    private final bbup P;
    public final Activity c;
    protected final bvrb d;
    public final btvo e;
    public final bcbw f;
    public final bbut g;
    public final bckv h;
    public final apnq i;
    public final bcle j;
    public final bhhf k;
    public final bbuq l;
    @dzsi
    public final ilo m;
    @dzsi
    protected bcmg n;
    public final dweu o;
    public dcdc<bcdf> q;
    public volatile bclu r;
    private final cjqy s;
    private final buti t;
    private final cknt u;
    private final bcnw v;
    private final bcnl w;
    private final bcod x;
    private final bcnn y;
    private final bcnq z;
    public List<bcme> p = new ArrayList();
    private volatile boolean M = true;
    private afyb N = afyb.a;
    private boolean O = false;

    public bcmu(bcms bcmsVar, String str, dweu dweuVar, bbuq bbuqVar, @dzsi dwfl dwflVar, cjtd cjtdVar, @dzsi cjtd cjtdVar2, @dzsi ilo iloVar, @dzsi bcmg bcmgVar, boolean z) {
        bcmp bcmpVar = new bcmp(this);
        this.P = bcmpVar;
        bckv bckvVar = bcmsVar.i;
        this.h = bckvVar;
        Activity activity = bcmsVar.a;
        this.c = activity;
        this.C = str;
        this.o = dweuVar;
        this.l = bbuqVar;
        this.t = bcmsVar.d;
        this.u = bcmsVar.e;
        cjqy cjqyVar = bcmsVar.b;
        this.s = cjqyVar;
        this.d = bcmsVar.c;
        this.e = bcmsVar.f;
        this.j = bcmsVar.q;
        this.E = dwflVar;
        this.n = bcmgVar;
        this.q = dcdc.e();
        this.H = new bcmr(this, bcmsVar.g, cjqyVar);
        this.I = cjtdVar;
        this.J = cjtdVar2;
        this.m = iloVar;
        this.L = z;
        this.i = bcmsVar.p;
        this.f = bcmsVar.j;
        this.g = bcmsVar.h;
        this.v = bcmsVar.k;
        this.w = bcmsVar.l;
        this.x = bcmsVar.m;
        this.y = bcmsVar.n;
        this.z = bcmsVar.o;
        this.A = bcmsVar.r;
        this.k = bcmsVar.s;
        this.B = bcmsVar.t;
        bbuqVar.r(bcmpVar);
        if (bckvVar.c()) {
            this.D = activity.getResources().getString(R.string.GALLERY_COLLECTIONS_GALLERY_TITLE_ACCESSIBILITY, str);
        } else {
            this.D = "";
        }
        if (bbuqVar.d() > 1) {
            K();
        }
    }

    public static final boolean L(ilo iloVar, btvo btvoVar) {
        return btvoVar != null && iloVar.aX(btvoVar.getEnableFeatureParameters());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [apnq] */
    /* JADX WARN: Type inference failed for: r9v0, types: [bcnv] */
    /* JADX WARN: Type inference failed for: r9v1, types: [bcnp] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [apns, bcoc] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [bcnk] */
    private final List<bcme> M(bbuq bbuqVar, int i) {
        dweo dweoVar;
        ?? bcnvVar;
        ArrayList arrayList = new ArrayList();
        while (i < bbuqVar.d()) {
            dwfl e = this.l.e(i);
            dbsk.s(e);
            if (bdvc.a(e)) {
                bcnl bcnlVar = this.w;
                ilo iloVar = this.m;
                dwen dwenVar = dwen.b;
                bcnu a2 = bcnlVar.a.a();
                bcnl.a(a2, 1);
                btvo a3 = bcnlVar.b.a();
                bcnl.a(a3, 2);
                bdvd a4 = bcnlVar.c.a();
                bcnl.a(a4, 3);
                bcnl.a(e, 4);
                bcnl.a(dwenVar, 7);
                bcnvVar = new bcnk(a2, a3, a4, e, i, iloVar, dwenVar);
            } else if (cknv.j(e)) {
                bcod bcodVar = this.x;
                ilo iloVar2 = this.m;
                dwen dwenVar2 = dwen.b;
                bcnu a5 = bcodVar.a.a();
                bcod.a(a5, 1);
                apqe a6 = bcodVar.b.a();
                bcod.a(a6, 2);
                bcod.a(e, 3);
                bcod.a(dwenVar2, 6);
                bcnvVar = new bcoc(a5, a6, e, i, iloVar2, dwenVar2);
                this.i.a(bcnvVar);
            } else if (cknv.d(this.E, e)) {
                bcnn bcnnVar = this.y;
                ilo iloVar3 = this.m;
                dwen dwenVar3 = dwen.b;
                bcnu a7 = bcnnVar.a.a();
                bcnn.a(a7, 1);
                cafi a8 = bcnnVar.b.a();
                bcnn.a(a8, 2);
                dxio a9 = ((dxjh) bcnnVar.c).a();
                bcnn.a(a9, 3);
                bcnn.a(e, 4);
                bcnn.a(dwenVar3, 8);
                bcnvVar = new bcnm(a7, a8, a9, e, i, iloVar3, true, dwenVar3);
            } else if (cknv.k(e).isEmpty()) {
                bcnw bcnwVar = this.v;
                ilo iloVar4 = this.m;
                dweu dweuVar = this.o;
                if (dweuVar.b == 5) {
                    dweoVar = (dweo) dweuVar.c;
                } else {
                    dweoVar = dweo.d;
                }
                dwen dwenVar4 = dweoVar.c;
                if (dwenVar4 == null) {
                    dwenVar4 = dwen.b;
                }
                dwen dwenVar5 = dwenVar4;
                bcnu a10 = bcnwVar.a.a();
                bcnw.a(a10, 1);
                bcnw.a(e, 2);
                bcnw.a(dwenVar5, 5);
                bcnvVar = new bcnv(a10, e, i, iloVar4, dwenVar5);
            } else {
                bcnq bcnqVar = this.z;
                ilo iloVar5 = this.m;
                dwen dwenVar6 = dwen.b;
                bcnu a11 = bcnqVar.a.a();
                bcnq.a(a11, 1);
                bcnq.a(e, 2);
                bcnq.a(dwenVar6, 5);
                bcnvVar = new bcnp(a11, e, i, iloVar5, dwenVar6);
            }
            arrayList.add(bcnvVar);
            i++;
        }
        return arrayList;
    }

    private static final dcdc<bcdf> N(List<bcme> list, @dzsi dcdc<bcdf> dcdcVar) {
        return bccu.a(dcdc.r(list), dcdcVar);
    }

    @Override // defpackage.bclv
    public cqkl A() {
        return cqkl.a;
    }

    @Override // defpackage.bclv
    public void B(@dzsi ilo iloVar) {
        if (iloVar != null) {
            bbuq bbuqVar = this.l;
            if (bbuqVar instanceof cknz) {
                ((cknz) bbuqVar).w(iloVar);
            }
        }
        K();
    }

    @Override // defpackage.bclv
    public void C(bclu bcluVar) {
        this.r = bcluVar;
    }

    @Override // defpackage.bclv
    public Boolean D() {
        return Boolean.valueOf(this.M);
    }

    @Override // defpackage.bclv
    public cqkl E() {
        if (this.m == null) {
            return cqkl.a;
        }
        bbut bbutVar = this.g;
        bbuz m = bbve.m();
        m.b(bbuy.SHOW_FULLY_EXPANDED_PLACESHEET);
        m.e(dwyd.GALLERY);
        ((bbsu) m).b = this.m;
        bbutVar.j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.bclv
    public dcdc<bcme> F() {
        return dcdc.r(this.p);
    }

    @Override // defpackage.bclv
    public ViewTreeObserver.OnPreDrawListener G(final RecyclerView recyclerView) {
        return new ViewTreeObserver.OnPreDrawListener(this, recyclerView) { // from class: bcmo
            private final bcmu a;
            private final RecyclerView b;

            {
                this.a = this;
                this.b = recyclerView;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                bcmu bcmuVar = this.a;
                bcmuVar.j.b(this.b);
                return true;
            }
        };
    }

    @Override // defpackage.bclv
    public bclq H() {
        return this.A;
    }

    @Override // defpackage.bclv
    public afyb I() {
        return this.N;
    }

    @Override // defpackage.bclv
    public void J(afyb afybVar) {
        this.N = afybVar;
    }

    public void K() {
        int size = this.p.size();
        int d = this.l.d();
        int i = 0;
        if (d <= size) {
            if (d >= size) {
                return;
            }
            List<bcme> M = M(this.l, 0);
            this.p = M;
            this.q = N(M, null);
            return;
        }
        int size2 = this.p.size();
        this.p.addAll(M(this.l, size2));
        this.q = N(this.p, this.q);
        while (true) {
            if (i >= this.l.d()) {
                i = -1;
                break;
            } else if (cknv.d(this.E, this.l.e(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i < size2) {
            return;
        }
        ((bclf) this.j).a = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        bcmt bcmtVar = this.F;
        if (bcmtVar == null || cqkpVar != bcmtVar || !bcmtVar.a()) {
            return;
        }
        this.O = true;
        if (!this.k.n(this.m) || !this.o.j) {
            this.k.a(this.m);
        } else if (this.p.isEmpty()) {
            bbuq bbuqVar = this.l;
            if (bbuqVar instanceof ckna) {
                ckna cknaVar = (ckna) bbuqVar;
                final cknt ckntVar = this.u;
                if (!cknaVar.g.isEmpty()) {
                    return;
                }
                dwge y = cknaVar.y(null);
                bvrt<dwge> bvrtVar = cknaVar.l;
                if (bvrtVar != null && bvrtVar.equals(bvrt.b(y))) {
                    return;
                }
                cknaVar.l = bvrt.b(y);
                final akqi akqiVar = cknaVar.e;
                final ckmy ckmyVar = new ckmy(cknaVar);
                final deig d = deig.d();
                ckntVar.e.execute(new Runnable(ckntVar, d) { // from class: cknn
                    private final cknt a;
                    private final deig b;

                    {
                        this.a = ckntVar;
                        this.b = d;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dcdc e;
                        cknt ckntVar2 = this.a;
                        deig deigVar = this.b;
                        btlu j = ckntVar2.d.j();
                        if (j == null || j.f != btlt.GOOGLE) {
                            e = dcdc.e();
                        } else {
                            dcdc<crua> a2 = ckntVar2.c.a(j.s().name);
                            final long b2 = ckntVar2.h.b();
                            e = dcbg.b(a2).o(new dbsl(b2) { // from class: cknr
                                private final long a;

                                {
                                    this.a = b2;
                                }

                                @Override // defpackage.dbsl
                                public final boolean a(Object obj) {
                                    long j2 = this.a;
                                    crua cruaVar = (crua) obj;
                                    ckns cknsVar = cknt.a;
                                    if (cruaVar != null) {
                                        crtx b3 = crtx.b(cruaVar.e);
                                        if (b3 == null) {
                                            b3 = crtx.UNKNOWN;
                                        }
                                        if (b3 != crtx.UPLOADED) {
                                            return true;
                                        }
                                        if ((cruaVar.a & 512) != 0 && j2 - cruaVar.l <= cknt.b) {
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                            }).z();
                        }
                        deigVar.j(e);
                    }
                });
                final dehn<btzx<dwge, dwgl>> c = ckntVar.g.c(y);
                final dehn h = deew.h(c, new dbrn(akqiVar) { // from class: ckno
                    private final akqi a;

                    {
                        this.a = akqiVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        akqi akqiVar2 = this.a;
                        btzx btzxVar = (btzx) obj;
                        if (btzxVar == null) {
                            return dcax.a;
                        }
                        dcdz j = dced.j();
                        for (dwfl dwflVar : ((dwgl) btzxVar.b()).b) {
                            j.h(akqiVar2, dwflVar);
                        }
                        return j.f();
                    }
                }, ckntVar.e);
                final dehn b2 = deha.m(d, h).b(new Callable(ckntVar, d, h, akqiVar, c) { // from class: cknp
                    private final cknt a;
                    private final deig b;
                    private final dehn c;
                    private final akqi d;
                    private final dehn e;

                    {
                        this.a = ckntVar;
                        this.b = d;
                        this.c = h;
                        this.d = akqiVar;
                        this.e = c;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cknt ckntVar2 = this.a;
                        deig deigVar = this.b;
                        dehn dehnVar = this.c;
                        akqi akqiVar2 = this.d;
                        dehn dehnVar2 = this.e;
                        bbqx bbqxVar = (bbqx) ckntVar2.c;
                        dcdc z = dcbg.b(dcbg.b(dced.k(dckz.d(bbqx.c(bbqxVar.b, (List) deigVar.get(), dckz.d((dcka) dehnVar.get(), bbqr.a)), new dbrn(bbqxVar) { // from class: bbqs
                            private final bbqx a;

                            {
                                this.a = bbqxVar;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj) {
                                bbqx bbqxVar2 = this.a;
                                bbqw bbqwVar = (bbqw) obj;
                                if (bbqwVar == null) {
                                    return null;
                                }
                                T t = bbqwVar.a;
                                if (t instanceof bbtm) {
                                    dwfl b3 = bbqxVar2.a.b((bbtm) t, eaou.i());
                                    dizh dizhVar = b3.p;
                                    if (dizhVar == null) {
                                        dizhVar = dizh.j;
                                    }
                                    dghk dghkVar = dizhVar.c;
                                    if (dghkVar == null) {
                                        dghkVar = dghk.g;
                                    }
                                    dggc b4 = dggc.b(dghkVar.b);
                                    if (b4 == null) {
                                        b4 = dggc.UNKNOWN;
                                    }
                                    dsqp dsqpVar = (dsqp) b3.cu(5);
                                    dsqpVar.bC(b3);
                                    dwfi dwfiVar = (dwfi) dsqpVar;
                                    dghh bZ = dghi.d.bZ();
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dghi dghiVar = (dghi) bZ.b;
                                    dghiVar.a |= 1;
                                    dghiVar.b = false;
                                    dghi dghiVar2 = (dghi) bZ.b;
                                    dghiVar2.a |= 2;
                                    dghiVar2.c = false;
                                    if (dwfiVar.c) {
                                        dwfiVar.bF();
                                        dwfiVar.c = false;
                                    }
                                    dwfl dwflVar = (dwfl) dwfiVar.b;
                                    dghi bK = bZ.bK();
                                    bK.getClass();
                                    dwflVar.v = bK;
                                    dwflVar.a |= 2097152;
                                    dwfg bZ2 = dwfh.d.bZ();
                                    String string = bbqxVar2.b.getString(true != dggc.VIDEO.equals(b4) ? R.string.PHOTO_LIGHTBOX_PENDING_TITLE : R.string.VIDEO_LIGHTBOX_PENDING_TITLE);
                                    if (bZ2.c) {
                                        bZ2.bF();
                                        bZ2.c = false;
                                    }
                                    dwfh dwfhVar = (dwfh) bZ2.b;
                                    string.getClass();
                                    dwfhVar.a |= 1;
                                    dwfhVar.b = string;
                                    if (dwfiVar.c) {
                                        dwfiVar.bF();
                                        dwfiVar.c = false;
                                    }
                                    dwfl dwflVar2 = (dwfl) dwfiVar.b;
                                    dwfh bK2 = bZ2.bK();
                                    bK2.getClass();
                                    dwflVar2.k = bK2;
                                    dwflVar2.a |= 1024;
                                    return dwfiVar.bK();
                                } else if (t instanceof dwfl) {
                                    return (dwfl) t;
                                } else {
                                    return null;
                                }
                            }
                        })).h(akqiVar2)).A(cknt.a)).z();
                        dwgl dwglVar = (dwgl) ((btzx) dehnVar2.get()).b();
                        dsqp dsqpVar = (dsqp) dwglVar.cu(5);
                        dsqpVar.bC(dwglVar);
                        dwgg dwggVar = (dwgg) dsqpVar;
                        if (dwggVar.c) {
                            dwggVar.bF();
                            dwggVar.c = false;
                        }
                        dwgl dwglVar2 = dwgl.i;
                        ((dwgl) dwggVar.b).b = dwgl.ck();
                        if (dwggVar.c) {
                            dwggVar.bF();
                            dwggVar.c = false;
                        }
                        dwgl dwglVar3 = (dwgl) dwggVar.b;
                        dsrj<dwfl> dsrjVar = dwglVar3.b;
                        if (!dsrjVar.a()) {
                            dwglVar3.b = dsqw.cl(dsrjVar);
                        }
                        dsod.bv(z, dwglVar3.b);
                        return dwggVar.bK();
                    }
                }, ckntVar.e);
                b2.Pk(new Runnable(b2, ckmyVar, c) { // from class: cknq
                    private final dehn a;
                    private final dehn b;
                    private final ckmy c;

                    {
                        this.a = b2;
                        this.c = ckmyVar;
                        this.b = c;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dehn dehnVar = this.a;
                        ckmy ckmyVar2 = this.c;
                        dehn dehnVar2 = this.b;
                        dwgl dwglVar = (dwgl) deha.s(dehnVar);
                        int size = dwglVar.b.size();
                        int size2 = ((dwgl) ((btzx) deha.s(dehnVar2)).b()).b.size();
                        ckna cknaVar2 = ckmyVar2.a;
                        cknaVar2.j = size - size2 > 0;
                        cknaVar2.w(dwglVar);
                    }
                }, ckntVar.f);
                return;
            }
        }
        this.l.h(this.t);
    }

    @Override // defpackage.bclv
    public String a() {
        return this.C;
    }

    @Override // defpackage.bclv
    public CharSequence b() {
        return this.D;
    }

    @Override // defpackage.bclv
    public Integer c() {
        return Integer.valueOf(this.h.f() ? 4 : 1);
    }

    @Override // defpackage.bclv
    public dcdc<bcdf> d() {
        return this.q;
    }

    @Override // defpackage.bclv
    public cjtd e() {
        return this.I;
    }

    @Override // defpackage.bclv
    @dzsi
    public cjtd g() {
        return this.J;
    }

    @Override // defpackage.bclv
    public cjtd h() {
        cjta b2 = cjtd.b();
        b2.d = dtxy.bK;
        ilo iloVar = this.m;
        if (iloVar != null) {
            b2.g = decs.a(iloVar.ai().c);
        }
        return b2.a();
    }

    @Override // defpackage.bclv
    public cjtd i() {
        ilo iloVar = this.m;
        cjta c = cjtd.c(iloVar != null ? iloVar.a() : null);
        c.d = dtxv.cw;
        return c.a();
    }

    @Override // defpackage.bclv
    public boolean j() {
        return this.l.g();
    }

    @Override // defpackage.bclv
    public cqkp k() {
        bcmt bcmtVar = new bcmt();
        this.F = bcmtVar;
        return bcmtVar;
    }

    @Override // defpackage.bclv
    public abw l(RecyclerView recyclerView) {
        bclh bclhVar = this.K;
        if (bclhVar != null) {
            return bclhVar;
        }
        bclh bclhVar2 = new bclh(recyclerView.getContext(), this.s);
        this.K = bclhVar2;
        return bclhVar2;
    }

    @Override // defpackage.bclv
    @dzsi
    public abw m(RecyclerView recyclerView) {
        bclh bclhVar = this.K;
        if (bclhVar == null) {
            return null;
        }
        return bclhVar;
    }

    @Override // defpackage.bclv
    public cqqw n() {
        return this.H;
    }

    @Override // defpackage.bclv
    public void o(abx abxVar) {
        this.H.a = abxVar;
    }

    @Override // defpackage.bclv
    @dzsi
    public Parcelable p() {
        Parcelable parcelable = this.G;
        this.G = null;
        return parcelable;
    }

    @Override // defpackage.bclv
    public void q(Parcelable parcelable) {
        this.G = parcelable;
    }

    @Override // defpackage.bclv
    public bbuq r() {
        return this.l;
    }

    @Override // defpackage.bclv
    public int s(int i) {
        dcdc<bcdf> dcdcVar = this.q;
        int i2 = 0;
        if (dcdcVar.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i >= dcdcVar.get(i3).a().size() + i2) {
            i2 += dcdcVar.get(i3).a().size();
            int i4 = i3 + 1;
            if (i4 >= dcdcVar.size()) {
                break;
            }
            i3 = i4;
        }
        return i3;
    }

    @Override // defpackage.bclv
    public int t(int i) {
        if (!this.h.c()) {
            bvoo.h("#getAdapterPositionOfPhoto can only be used with Collections UI.", new Object[0]);
        }
        RecyclerView g = this.h.g();
        if (g == null) {
            return i;
        }
        abg abgVar = g.k;
        if (!(abgVar instanceof cqrj)) {
            return i;
        }
        cqrj cqrjVar = (cqrj) abgVar;
        dcdc<bcme> F = F();
        if (i >= F.size()) {
            bvoo.h("Photo index %d is larger than the number of current photo viewmodels (%d).", Integer.valueOf(i), Integer.valueOf(F.size()));
            return i;
        }
        bcme bcmeVar = F.get(i);
        for (int i2 = 0; i2 < cqrjVar.c(); i2++) {
            if (bcmeVar.equals(cqrjVar.z(i2))) {
                return i2;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r2.l.d() <= 0) goto L9;
     */
    @Override // defpackage.bclv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.bcmg u() {
        /*
            r2 = this;
            bhhf r0 = r2.k
            boolean r0 = r0.o()
            if (r0 == 0) goto L1c
            dweu r0 = r2.o
            boolean r0 = r0.j
            if (r0 != 0) goto Lf
            goto L1c
        Lf:
            boolean r0 = r2.O
            if (r0 == 0) goto L27
            bbuq r0 = r2.l
            int r0 = r0.d()
            if (r0 <= 0) goto L23
            goto L27
        L1c:
            bhhf r0 = r2.k
            ilo r1 = r2.m
            r0.a(r1)
        L23:
            bcmg r0 = r2.n
            if (r0 != 0) goto L29
        L27:
            bcmg r0 = defpackage.bcmu.b
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcmu.u():bcmg");
    }

    @Override // defpackage.bclv
    public Boolean v() {
        return Boolean.valueOf(this.L);
    }

    @Override // defpackage.bclv
    public Boolean w() {
        return false;
    }

    @Override // defpackage.bclv
    public Boolean x() {
        bbuq bbuqVar = this.l;
        boolean z = false;
        if ((bbuqVar instanceof ckna) && ((ckna) bbuqVar).j) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bclv
    public CharSequence y() {
        return new SpannableString(Html.fromHtml(this.c.getString(R.string.GALLERY_PENDING_PHOTOS_BANNER_WITH_LEARN_MORE_LINK, new Object[]{"https://support.google.com/business/answer/6103862"})));
    }

    @Override // defpackage.bclv
    public cqkl z() {
        this.B.a().m("https://support.google.com/business/answer/6103862", 1);
        return cqkl.a;
    }
}

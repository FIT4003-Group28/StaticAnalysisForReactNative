package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.gmm.base.views.fivestar.FiveStarView;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cadx  reason: default package */
/* loaded from: classes4.dex */
public class cadx implements cagb {
    static final long a = TimeUnit.DAYS.toMillis(1);
    static final long b = TimeUnit.MINUTES.toMillis(1);
    public static final /* synthetic */ int x = 0;
    private final dzsj<bqji> A;
    private final dxio<angp> B;
    private final bzqa C;
    private final ania D;
    private final dwmk E;
    private final bmdv F;
    private final btvo G;
    private final aujx H;
    @dzsi
    private final aujb I;
    private final bbtk J;
    private final caeb K;
    @dzsi
    private final String L;
    @dzsi
    private String M;
    private boolean N;
    private boolean O;
    public final Activity c;
    public final bvsx d;
    public final dzsj<akfa> e;
    public final bvrb f;
    public final dzsj<bbut> g;
    public final Resources h;
    public final bunb i;
    public final bvjj j;
    public final anhk k;
    public final caek l;
    public final cafz m;
    public final List<cagc> n;
    public int o;
    @dzsi
    public String p;
    public boolean q;
    @dzsi
    public Spannable r;
    @dzsi
    public AlertDialog s;
    public bwrs<ilo> t;
    public final cpv u;
    public int v;
    public int w;
    private final dzsj<begg> y;
    private final dzsj<anhg> z;

    public cadx(Activity activity, dzsj<akfa> dzsjVar, bvrb bvrbVar, dzsj<begg> dzsjVar2, dzsj<anhg> dzsjVar3, dzsj<bbut> dzsjVar4, dzsj<bqji> dzsjVar5, dxio<angp> dxioVar, anhk anhkVar, Resources resources, bunb bunbVar, bvjj bvjjVar, bzqa bzqaVar, ania aniaVar, bmdv bmdvVar, cjqy cjqyVar, btvo btvoVar, cqhn cqhnVar, caga cagaVar, auhi auhiVar, aujx aujxVar, cafz cafzVar, bbtk bbtkVar, caeb caebVar, cpv cpvVar, @dzsi String str, dwmk dwmkVar, caek caekVar) {
        this.c = activity;
        this.e = dzsjVar;
        this.f = bvrbVar;
        this.y = dzsjVar2;
        this.z = dzsjVar3;
        this.g = dzsjVar4;
        this.A = dzsjVar5;
        this.B = dxioVar;
        this.h = resources;
        this.i = bunbVar;
        this.j = bvjjVar;
        this.k = anhkVar;
        this.C = bzqaVar;
        this.D = aniaVar;
        this.E = dwmkVar;
        this.l = caekVar;
        this.F = bmdvVar;
        this.G = btvoVar;
        this.H = aujxVar;
        this.m = cafzVar;
        this.u = cpvVar;
        this.J = bbtkVar;
        this.K = caebVar;
        this.L = str;
        this.o = dwmkVar.f;
        this.N = (dwmkVar.a & 32) != 0;
        ily ilyVar = new ily();
        dwlh dwlhVar = dwmkVar.c;
        dniu dniuVar = (dwlhVar == null ? dwlh.n : dwlhVar).b;
        ilyVar.k((dniuVar == null ? dniu.i : dniuVar).b);
        dwlh dwlhVar2 = dwmkVar.c;
        ilyVar.F((dwlhVar2 == null ? dwlh.n : dwlhVar2).c);
        docc bZ = docg.M.bZ();
        int i = this.o;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        docg docgVar = (docg) bZ.b;
        docgVar.a |= 512;
        docgVar.q = i;
        ilyVar.v(bZ.bK());
        dwlh dwlhVar3 = dwmkVar.c;
        for (dwle dwleVar : (dwlhVar3 == null ? dwlh.n : dwlhVar3).g) {
            if (!dwleVar.c.isEmpty()) {
                ilyVar.e(dwleVar.c);
            }
        }
        if (btvoVar.getEnableFeatureParameters().aB) {
            dwlh dwlhVar4 = dwmkVar.c;
            dpum dpumVar = (dwlhVar4 == null ? dwlh.n : dwlhVar4).d;
            ilyVar.q(akqq.f(dpumVar == null ? dpum.d : dpumVar));
        }
        if ((dwmkVar.a & 4096) != 0) {
            dwlh dwlhVar5 = dwmkVar.c;
            ilyVar.H((dwlhVar5 == null ? dwlh.n : dwlhVar5).j);
            doch bZ2 = docm.i.bZ();
            String str2 = dwmkVar.n;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            docm docmVar = (docm) bZ2.b;
            str2.getClass();
            docmVar.a |= 8;
            docmVar.e = str2;
            ilyVar.B(bZ2.bK());
        }
        Intent intent = activity.getIntent();
        aujb aujbVar = null;
        Integer l = intent != null ? auhiVar.l(intent) : null;
        this.I = l != null ? auhiVar.h(l.intValue()) : aujbVar;
        this.t = bwrs.a(ilyVar.d());
        this.d = new bvsx(activity.getResources());
        this.r = v(this.o, activity, resources);
        this.v = 1;
        this.w = 1;
        this.O = false;
        this.p = dwmkVar.i;
        this.n = dchl.a();
    }

    private static Boolean Y(int i) {
        return Boolean.valueOf(i > 0);
    }

    private final boolean Z() {
        return !this.N || !dbsj.d(this.p);
    }

    private final int aa() {
        if (!Y(this.o).booleanValue()) {
            return 1;
        }
        if (K()) {
            if (this.q) {
                return 3;
            }
            if (Z()) {
                return 2;
            }
            if (!dbsj.d(this.M) && this.w == 3) {
                return 5;
            }
        }
        return Z() ? 2 : 6;
    }

    @dzsi
    public static Spannable v(int i, Activity activity, Resources resources) {
        if (!Y(i).booleanValue()) {
            return null;
        }
        FiveStarView fiveStarView = new FiveStarView(activity, jfo.d);
        fiveStarView.setValue(i);
        fiveStarView.setDrawingCacheEnabled(true);
        fiveStarView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        fiveStarView.layout(0, 0, fiveStarView.getMeasuredWidth(), fiveStarView.getMeasuredHeight());
        fiveStarView.buildDrawingCache(true);
        bvsx bvsxVar = new bvsx(resources);
        bvsu c = bvsxVar.c(R.string.YOU_RATED_IT);
        c.a(bvsxVar.e(new BitmapDrawable(fiveStarView.getDrawingCache(true)), 1.0f));
        return c.c();
    }

    @Override // defpackage.cagb
    public Boolean A() {
        boolean z = false;
        if (!C().booleanValue() && !dbsj.d(this.p)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cagb
    public Boolean B() {
        boolean z = false;
        if (!C().booleanValue() && dbsj.d(this.p)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cagb
    public Boolean C() {
        return Boolean.valueOf(this.w == 2);
    }

    @Override // defpackage.cagb
    public Boolean D() {
        return Boolean.valueOf(this.v == 2);
    }

    @Override // defpackage.cagb
    public Boolean E() {
        return Boolean.valueOf(this.v == 3);
    }

    @Override // defpackage.cagb
    public Boolean F() {
        return Boolean.valueOf(aa() == 5);
    }

    @Override // defpackage.cagb
    public cqgl G() {
        return new cqgl(this) { // from class: cadl
            private final cadx a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                cadx cadxVar = this.a;
                String str = cadxVar.p;
                cadxVar.p = charSequence == null ? null : charSequence.toString();
                String str2 = cadxVar.p;
                if ((!dbsj.d(str) || dbsj.d(str2)) && (dbsj.d(str) || !dbsj.d(str2))) {
                    return;
                }
                cqkx.p(cadxVar);
            }
        };
    }

    @Override // defpackage.cagb
    public String H() {
        return dbsj.e(this.p);
    }

    @Override // defpackage.cagb
    public cqkl I(cjqm cjqmVar) {
        if (K()) {
            x(this.o, dbsj.e(this.p), cjqmVar, new cadw(this));
            this.w = 2;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.cagb
    public cqkl J() {
        w(this.o, false, cjqm.a);
        return cqkl.a;
    }

    public final boolean K() {
        return this.l.aa().booleanValue();
    }

    @Override // defpackage.cagb
    public String L() {
        return !K() ? "" : this.h.getString(bzqf.SUBMIT_REVIEW_BUTTON_DESCRIPTION, dbsj.e(f()));
    }

    @Override // defpackage.cagb
    public String M() {
        return !K() ? "" : this.h.getString(bzqf.FULLSCREEN_REVIEW_EDITOR_BUTTON_DESCRIPTION, dbsj.e(f()));
    }

    @Override // defpackage.cagb
    public String N() {
        if (dbsj.d(this.p)) {
            return this.c.getString(R.string.ADD_A_REVIEW);
        }
        return this.c.getString(R.string.EDIT_REVIEW_AND_POST);
    }

    @Override // defpackage.cagb
    public Boolean O() {
        return Boolean.valueOf(this.m.a());
    }

    @Override // defpackage.cagb
    public String P() {
        return this.c.getString(R.string.DEVICE_PHOTOS_TITLE);
    }

    @Override // defpackage.cagb
    public View.OnClickListener Q() {
        return V();
    }

    @Override // defpackage.cagb
    public List<cagc> R() {
        return !O().booleanValue() ? dcdc.e() : this.n;
    }

    @Override // defpackage.cagb
    public Integer S() {
        return 3;
    }

    @Override // defpackage.cagb
    public View.OnClickListener T() {
        return V();
    }

    @Override // defpackage.cagb
    public String U() {
        return this.c.getString(R.string.ADD_OTHER_PHOTOS_BUTTON_CONTENT_DESCRIPTION);
    }

    final View.OnClickListener V() {
        return new View.OnClickListener(this) { // from class: cadm
            private final cadx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcbg dcbgVar;
                cadx cadxVar = this.a;
                dcbg s = dcbg.b(cadxVar.n).s(cadg.a);
                int a2 = dhpw.a(cadxVar.m.b().c);
                if (a2 == 0) {
                    a2 = 3;
                }
                int i = a2 - 1;
                if (i == 1) {
                    dcbgVar = s;
                } else if (i == 2) {
                    dcbgVar = s.x(cadxVar.S().intValue());
                } else {
                    dcbgVar = dcbg.i();
                }
                ilo c = cadxVar.t.c();
                dbsk.s(c);
                bbuz m = bbve.m();
                bbsu bbsuVar = (bbsu) m;
                bbsuVar.a = bbvd.e(c.aj());
                m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
                bbsuVar.b = c;
                m.e(dwyd.TODO_LIST_THUMBNAIL);
                m.j(s.z());
                m.i(dcbgVar.z());
                cadxVar.g.a().j(m.a());
                cadxVar.n.clear();
            }
        };
    }

    public void W(bztl bztlVar) {
        if (!O().booleanValue()) {
            return;
        }
        List<cagc> list = this.n;
        caeb caebVar = this.K;
        bbtm q = this.J.a(bztlVar.a()).q();
        View.OnClickListener V = V();
        String str = this.L;
        String str2 = this.E.b;
        int size = this.n.size();
        String e = dbsj.e(f());
        dxio a2 = ((dxjh) caebVar.a).a();
        caeb.a(a2, 1);
        caeb.a(q, 2);
        caeb.a(V, 3);
        caeb.a(e, 7);
        list.add(new caea(a2, q, V, str, str2, size, e));
    }

    public dcdc<eaps> X() {
        return dcbg.j(this.E, new dwmk[0]).o(cadn.a).s(cado.a).m(this.E.m).s(cadp.a).o(cade.a).s(cadf.a).z();
    }

    public final void a() {
        this.f.b(new Runnable(this) { // from class: cadd
            private final cadx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.u();
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.cagb
    public jez b() {
        return new jez(this) { // from class: cadi
            private final cadx a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                cadx cadxVar = this.a;
                if (cadxVar.K()) {
                    int i = (int) f;
                    cadxVar.o = i;
                    cadxVar.r = cadx.v(i, cadxVar.c, cadxVar.h);
                    cadxVar.q = true;
                    cadxVar.a();
                    cadxVar.x(cadxVar.o, "", cjqmVar, new cadq(cadxVar));
                    cadxVar.v = 2;
                    cqkx.p(cadxVar);
                } else {
                    cadxVar.w(f, true, cjqmVar);
                }
                cadxVar.c();
            }
        };
    }

    public void c() {
        ddos l;
        if (this.O) {
            return;
        }
        aujb aujbVar = this.I;
        if (aujbVar != null && ((l = aujbVar.l(this.G)) == ddos.TODO_LIST || l == ddos.TODO_REVIEW)) {
            ilo c = this.t.c();
            this.H.c(l).a(c == null ? null : c.ai());
        }
        this.O = true;
    }

    @Override // defpackage.cagb
    public cqkl d() {
        if (K()) {
            this.q = true;
            a();
            cqkx.p(this);
        } else {
            w(this.o, false, cjqm.a);
        }
        return cqkl.a;
    }

    @Override // defpackage.cagb
    public cqkl e() {
        begj begjVar = new begj();
        begjVar.i = this.t;
        begjVar.c = jjn.EXPANDED;
        begjVar.F = true;
        begjVar.n = true;
        this.y.a().o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.cagb
    @dzsi
    public String f() {
        dwlh dwlhVar = this.E.c;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        if ((dwlhVar.a & 2) != 0) {
            dwlh dwlhVar2 = this.E.c;
            if (dwlhVar2 == null) {
                dwlhVar2 = dwlh.n;
            }
            return dwlhVar2.c;
        }
        return null;
    }

    @Override // defpackage.cagb
    @dzsi
    public String g() {
        String str;
        dwlh dwlhVar = this.E.c;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dwle dwleVar = dwlhVar.e;
        if (dwleVar == null) {
            dwleVar = dwle.d;
        }
        String f = dbsj.f(dwleVar.b);
        dwmk dwmkVar = this.E;
        if ((dwmkVar.a & 8192) != 0) {
            str = dwmkVar.o;
        } else {
            dosf dosfVar = dwmkVar.l;
            if (dosfVar == null) {
                dosfVar = dosf.f;
            }
            if ((dosfVar.a & 1) != 0) {
                bmdv bmdvVar = this.F;
                dosf dosfVar2 = this.E.l;
                if (dosfVar2 == null) {
                    dosfVar2 = dosf.f;
                }
                str = bmdvVar.d(dosfVar2.b, "", true);
            } else {
                str = null;
            }
        }
        if (f == null) {
            return str;
        }
        if (str == null) {
            return f;
        }
        StringBuilder sb = new StringBuilder(str.length() + 3 + f.length());
        sb.append(str);
        sb.append(" · ");
        sb.append(f);
        return sb.toString();
    }

    @Override // defpackage.cagb
    public Float h() {
        return Float.valueOf(this.o);
    }

    @Override // defpackage.cagb
    @dzsi
    public Spannable i() {
        return this.r;
    }

    @Override // defpackage.cagb
    public String j() {
        if (this.r == null) {
            return "";
        }
        Resources resources = this.h;
        return resources.getString(R.string.YOU_RATED_IT, jex.b(resources, this.o).trim());
    }

    @Override // defpackage.cagb
    @dzsi
    public String k() {
        if (!K()) {
            return null;
        }
        return this.M;
    }

    @Override // defpackage.cagb
    @dzsi
    public jic l() {
        ckqc ckqcVar;
        dwlh dwlhVar = this.E.c;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        if (dwlhVar.h.isEmpty()) {
            return null;
        }
        dwlh dwlhVar2 = this.E.c;
        if (dwlhVar2 == null) {
            dwlhVar2 = dwlh.n;
        }
        dnwr dnwrVar = dwlhVar2.h.get(0).e;
        if (dnwrVar == null) {
            dnwrVar = dnwr.c;
        }
        String str = dnwrVar.b;
        if (dsna.e(str)) {
            ckqcVar = ckqc.FIFE_CIRCLE_CROP_NOT_USER_PROFILE;
        } else {
            ckqcVar = ckqc.FULLY_QUALIFIED;
        }
        return new jic(str, ckqcVar, 0);
    }

    @Override // defpackage.cagb
    public jht m() {
        jhu h = jhv.h();
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.POST_A_PHOTO;
        jhmVar.a = this.h.getString(R.string.POST_A_PHOTO);
        jhmVar.f = cjqg.o(n(), dtyd.bu);
        h.d(jhmVar.c());
        jhm jhmVar2 = new jhm();
        jhmVar2.l = R.string.DISMISS_FROM_TODO_LIST;
        jhmVar2.a = this.h.getString(R.string.DISMISS_FROM_TODO_LIST);
        jhmVar2.f = cjqg.o(n(), dtyd.bs);
        h.d(jhmVar2.c());
        if (!this.E.m.isEmpty() || (this.E.a & 512) != 0) {
            jhm jhmVar3 = new jhm();
            jhmVar3.l = R.string.NOT_BEEN_FROM_TODO_LIST;
            jhmVar3.a = this.h.getString(R.string.NOT_BEEN_FROM_TODO_LIST);
            jhmVar3.f = cjqg.o(n(), dtyd.bt);
            h.d(jhmVar3.c());
        }
        jhi jhiVar = (jhi) h;
        jhiVar.b = new jhr(this) { // from class: cadj
            private final cadx a;

            {
                this.a = this;
            }

            @Override // defpackage.jhr
            public final void a(int i) {
                cadx cadxVar = this.a;
                if (i == R.string.POST_A_PHOTO) {
                    ilo c = cadxVar.t.c();
                    if (c == null) {
                        return;
                    }
                    bbuz m = bbve.m();
                    bbsu bbsuVar = (bbsu) m;
                    bbsuVar.a = bbvd.e(c.aj());
                    m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
                    m.e(dwyd.TODO_LIST);
                    bbsuVar.b = c;
                    cadxVar.g.a().j(m.a());
                } else if (i != R.string.DISMISS_FROM_TODO_LIST) {
                    if (i != R.string.NOT_BEEN_FROM_TODO_LIST) {
                        return;
                    }
                    if (!cadxVar.j.m(bvjk.fV, false)) {
                        TextView textView = new TextView(cadxVar.c);
                        bvsu c2 = cadxVar.d.c(R.string.NOT_BEEN_FROM_TODO_LIST_MESSAGE_LINK);
                        bvsu c3 = cadxVar.d.c(R.string.NOT_BEEN_FROM_TODO_LIST_TIMELINE);
                        c3.k(new cadt(cadxVar));
                        c2.a(c3);
                        textView.setText(c2.c());
                        int i2 = (int) (cadxVar.c.getResources().getDisplayMetrics().density * 20.0f);
                        textView.setPadding(i2, i2, i2, 0);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        if (cadxVar.u.e(cadxVar.c)) {
                            textView.setOnClickListener(new cadu(cadxVar));
                        }
                        cadxVar.s = new AlertDialog.Builder(cadxVar.c).setView(textView).setCancelable(true).setPositiveButton(R.string.NOT_BEEN_FROM_TODO_LIST_REMOVE, new cads(cadxVar)).setNegativeButton(R.string.NOT_BEEN_FROM_TODO_LIST_CANCEL, new cadr()).create();
                        cadxVar.s.show();
                        return;
                    }
                    cadxVar.p();
                } else {
                    cadxVar.l.P(cadxVar);
                    String str = cadxVar.k.a().d;
                    cadxVar.i.a().e = cadxVar.e.a().j();
                    bunc c4 = cadxVar.i.c();
                    dwcn bZ = dwco.f.bZ();
                    dnip bZ2 = dniu.i.bZ();
                    String u = cadxVar.u();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dniu dniuVar = (dniu) bZ2.b;
                    u.getClass();
                    dniuVar.a |= 1;
                    dniuVar.b = u;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwco dwcoVar = (dwco) bZ.b;
                    dniu bK = bZ2.bK();
                    bK.getClass();
                    dwcoVar.b = bK;
                    dwcoVar.a = 1 | dwcoVar.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwco dwcoVar2 = (dwco) bZ.b;
                    str.getClass();
                    dwcoVar2.a |= 4;
                    dwcoVar2.d = str;
                    dpkx bZ3 = dpky.b.bZ();
                    bZ3.a(dpla.REVIEW);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwco dwcoVar3 = (dwco) bZ.b;
                    dpky bK2 = bZ3.bK();
                    bK2.getClass();
                    dwcoVar3.c = bK2;
                    dwcoVar3.a |= 2;
                    c4.a(bZ.bK(), new cadv(cadxVar), bvrj.BACKGROUND_THREADPOOL);
                }
            }
        };
        jhiVar.c = 2131231593;
        return jhiVar.b();
    }

    @Override // defpackage.cagb
    public cjtd n() {
        cjta b2 = cjtd.b();
        b2.g(this.E.b);
        return b2.a();
    }

    public final void o() {
        AlertDialog alertDialog = this.s;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        anhg a2 = this.z.a();
        dosf dosfVar = this.E.l;
        if (dosfVar == null) {
            dosfVar = dosf.f;
        }
        a2.D(anhy.o("", dosfVar));
    }

    public void p() {
        if (!this.D.a()) {
            this.C.a(new int[]{bzqb.WEB_AND_APP_ACTIVITY.d}, null, "todo_list_item");
            return;
        }
        this.l.P(this);
        angp a2 = this.B.a();
        dnhy bZ = dnhz.e.bZ();
        dosf dosfVar = this.E.l;
        if (dosfVar == null) {
            dosfVar = dosf.f;
        }
        long j = dosfVar.b - a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnhz dnhzVar = (dnhz) bZ.b;
        dnhzVar.a |= 4;
        dnhzVar.d = j;
        dbsg<dnhz> i = dbsg.i(bZ.bK());
        dnhy bZ2 = dnhz.e.bZ();
        dosf dosfVar2 = this.E.l;
        if (dosfVar2 == null) {
            dosfVar2 = dosf.f;
        }
        long j2 = dosfVar2.b + b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnhz dnhzVar2 = (dnhz) bZ2.b;
        dnhzVar2.a |= 4;
        dnhzVar2.d = j2;
        dbsg<dnhz> i2 = dbsg.i(bZ2.bK());
        dvya bZ3 = dvyw.bv.bZ();
        String u = u();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvyw dvywVar = (dvyw) bZ3.b;
        u.getClass();
        dvywVar.a |= 4;
        dvywVar.g = u;
        a2.g(i, i2, bZ3.bK(), dbpy.a, bzwi.b(blpk.TODO_LIST), dbpy.a, dbpy.a);
        Toast.makeText(this.c, (int) R.string.NOT_BEEN_FROM_TODO_LIST_TOAST, 0).show();
    }

    @Override // defpackage.cagb
    public Boolean q() {
        return Boolean.valueOf(aa() != 6);
    }

    @Override // defpackage.cagb
    public Boolean r() {
        boolean z = true;
        if (aa() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cagb
    public Boolean s() {
        return Boolean.valueOf(aa() == 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(bwrs<ilo> bwrsVar) {
        this.t = bwrsVar;
        ilo c = bwrsVar.c();
        if (c != null) {
            this.o = c.bq().q;
            String str = c.bq().r;
            this.M = str;
            this.N = (!str.isEmpty()) | this.N;
            G().a(c.bs().r);
        }
        this.r = v(this.o, this.c, this.h);
    }

    public String u() {
        dwlh dwlhVar = this.E.c;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        return dniuVar.b;
    }

    public final void w(float f, boolean z, cjqm cjqmVar) {
        dnqh c = bzwi.c(blpk.TODO_LIST);
        if (cjqmVar.a().a()) {
            dsqp dsqpVar = (dsqp) c.cu(5);
            dsqpVar.bC(c);
            dnqg dnqgVar = (dnqg) dsqpVar;
            String b2 = cjqmVar.a().b();
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar = (dnqh) dnqgVar.b;
            dnqh dnqhVar2 = dnqh.p;
            b2.getClass();
            dnqhVar.a |= 2;
            dnqhVar.c = b2;
            c = dnqgVar.bK();
        }
        dcbg s = dcbg.b(this.n).s(cadk.a);
        bqjf r = bqjh.r();
        r.f(c);
        r.g((!this.l.ae().booleanValue()) & z);
        r.j((int) f);
        r.n(chbv.OBEY_SERVER_RESPONSE);
        r.c(dhpj.TODO_LIST);
        if (!z) {
            ((bqir) r).a = dbsj.e(this.p);
        }
        if (this.m.a()) {
            r.p(s.z());
        }
        if (this.m.b().b) {
            r.h(s.x(S().intValue()).z());
            this.n.clear();
        }
        this.A.a().b(this.t, r.o());
    }

    public final void x(int i, String str, cjqm cjqmVar, bqlb bqlbVar) {
        bqkw k = bqkx.k();
        k.c(akqi.b(u()));
        k.f(i);
        k.e(str);
        bqkx h = k.h();
        dnqh c = bzwi.c(blpk.TODO_LIST);
        if (cjqmVar.a().a()) {
            dsqp dsqpVar = (dsqp) c.cu(5);
            dsqpVar.bC(c);
            dnqg dnqgVar = (dnqg) dsqpVar;
            String b2 = cjqmVar.a().b();
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar = (dnqh) dnqgVar.b;
            dnqh dnqhVar2 = dnqh.p;
            b2.getClass();
            dnqhVar.a |= 2;
            dnqhVar.c = b2;
            c = dnqgVar.bK();
        }
        bqky h2 = bqkz.h();
        h2.d(c);
        h2.g(chbv.NEVER_SHOW);
        h2.c(dhpj.TODO_LIST);
        bqkz a2 = h2.a();
        bqku c2 = bqla.c();
        c2.b(h);
        c2.c(a2);
        this.A.a().c(c2.d(), this.t, bqlbVar);
    }

    public final void y(String str) {
        View o = cqkx.o(this);
        if (o != null) {
            this.u.f(o, str);
        }
    }

    @Override // defpackage.cagb
    public Boolean z() {
        return Boolean.valueOf(aa() == 3);
    }
}

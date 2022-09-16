package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: biyc  reason: default package */
/* loaded from: classes3.dex */
public class biyc implements biwo, bega {
    public static final /* synthetic */ int a = 0;
    private static final dcdn<String, Integer> aN;
    private static final bmds b;
    private static final dcqe c;
    private final ctw A;
    private bwrs<ilo> B;
    private boolean C;
    private boolean D;
    @dzsi
    private cqss H;
    @dzsi
    private cqtd I;
    private bfgs J;
    @dzsi
    private bmgs K;
    @dzsi
    private String P;
    @dzsi
    private String Q;
    @dzsi
    private cqtd S;
    private boolean U;
    private final dcdc<bixh> aA;
    private boolean aB;
    private final bmdk aC;
    private final bkke aD;
    private final btvo aE;
    private final bhhf aF;
    private final dbty<biwn> aG;
    @dzsi
    private CharSequence aK;
    @dzsi
    private bmbh aL;
    private final boolean aM;
    private cjta ac;
    private cjta ag;
    private boolean al;
    private boolean am;
    private final bydq an;
    private final aim<dqgh, Integer> ao;
    private final bizd aq;
    private final bflk ar;
    private final bflk as;
    private final bixn at;
    private final bixz au;
    private final bfwu av;
    private final biwz aw;
    private final bixy ax;
    @dzsi
    private biwy ay;
    @dzsi
    private bmmt az;
    private final bmdq e;
    private final bmdw f;
    private final biwv g;
    private final biwq h;
    private final biwr i;
    private final biwk j;
    private final gga k;
    private final btrm l;
    private final bmfg m;
    private final bwqv n;
    private final cqat o;
    private final dxio<aesb> p;
    private final dxio<begg> q;
    private final dxio<boxa> r;
    private final dxio<apyz> s;
    private final dxio<afha> t;
    private final boolean u;
    private final boolean v;
    private final bfgx w;
    private final bmgu x;
    private final dxio<bhjg> y;
    private final bmmu z;
    private final List<acvf> E = dchl.a();
    private CharSequence F = "";
    private CharSequence G = "";
    private String L = "";
    private String M = "";
    private String N = "";
    private String O = "";
    private String R = "";
    private cjtd V = cjtd.b;
    private cjtd W = cjtd.b;
    private cjtd X = cjtd.b;
    private cjtd Y = cjtd.b;
    private cjtd Z = cjtd.b;
    private cjtd aa = cjtd.b;
    private cjtd ab = cjtd.b;
    private cjtd ad = cjtd.b;
    private cjtd ae = cjtd.b;
    private cjtd af = cjtd.b;
    private cjtd ah = cjtd.b;
    private cjtd ai = cjtd.b;
    private cjtd aj = cjtd.b;
    private cjtd ak = cjtd.b;
    private boolean aH = false;
    private CharSequence aI = "";
    private String aJ = "";
    private final alp d = alp.a();
    private final aim<dqgh, Integer> ap = new aim<>();

    static {
        bmdr i = bmds.i();
        i.b(true);
        i.c(true);
        b = i.a();
        c = dcqe.c("biyc");
        aN = dcdn.n("/geo/type/establishment_poi/has_wheelchair_accessible_entrance", Integer.valueOf((int) R.string.ACCESSIBILITY_ATTRIBUTE_ENTRANCE), "/geo/type/establishment_poi/has_wheelchair_accessible_parking", Integer.valueOf((int) R.string.ACCESSIBILITY_ATTRIBUTE_PARKING), "/geo/type/establishment_poi/has_wheelchair_accessible_restroom", Integer.valueOf((int) R.string.ACCESSIBILITY_ATTRIBUTE_RESTROOM), "/geo/type/establishment_poi/has_wheelchair_accessible_seating", Integer.valueOf((int) R.string.ACCESSIBILITY_ATTRIBUTE_SEATING));
    }

    public biyc(gga ggaVar, bmdq bmdqVar, bmdw bmdwVar, btrm btrmVar, bmfg bmfgVar, bwqv bwqvVar, cqat cqatVar, dxio<aesb> dxioVar, dxio<begg> dxioVar2, dxio<boxa> dxioVar3, dxio<apyz> dxioVar4, dxio<afha> dxioVar5, bizd bizdVar, dxio<bgvw> dxioVar6, dzsj<bfme> dzsjVar, dzsj<bflh> dzsjVar2, bfll bfllVar, bmdk bmdkVar, bkke bkkeVar, biwv biwvVar, biwq biwqVar, biws biwsVar, bixn bixnVar, final btvo btvoVar, biyf biyfVar, bfgx bfgxVar, bmgu bmguVar, dxio<bhjg> dxioVar7, bfwu bfwuVar, biwz biwzVar, bmmu bmmuVar, bhhf bhhfVar, bhat bhatVar, bvjj bvjjVar, dxio<akfa> dxioVar8, bixy bixyVar, bixi bixiVar, ctw ctwVar, final biyb biybVar) {
        this.k = ggaVar;
        this.l = btrmVar;
        this.m = bmfgVar;
        this.n = bwqvVar;
        this.o = cqatVar;
        this.p = dxioVar;
        this.q = dxioVar2;
        this.r = dxioVar3;
        this.s = dxioVar4;
        this.t = dxioVar5;
        this.aC = bmdkVar;
        this.aD = bkkeVar;
        this.aE = btvoVar;
        this.av = bfwuVar;
        this.aw = biwzVar;
        this.z = bmmuVar;
        this.aF = bhhfVar;
        this.e = bmdqVar;
        this.f = bmdwVar;
        this.g = biwvVar;
        this.h = biwqVar;
        ff ffVar = (ff) ((dxjd) biwsVar.a).a;
        biws.a(ffVar, 1);
        btvo a2 = biwsVar.b.a();
        biws.a(a2, 2);
        cjqy a3 = biwsVar.c.a();
        biws.a(a3, 3);
        begg a4 = biwsVar.d.a();
        biws.a(a4, 4);
        this.i = new biwr(ffVar, a2, a3, a4, true);
        this.j = biyfVar.a(dcdc.f(iln.BUSINESS));
        bydl g = bydm.g(ggaVar.getBaseContext());
        g.b(ibm.S().b(ggaVar));
        byds bydsVar = new byds(ggaVar, cqatVar, g.a());
        this.an = bydsVar;
        this.aq = bizdVar;
        this.ar = bfllVar.a(ggaVar, ggaVar.getString(R.string.LOCATED_IN), cjtd.a(dtxr.u), dzsjVar.a());
        this.as = bfllVar.a(ggaVar, ggaVar.getString(R.string.DEPARTMENTS), cjtd.a(dtxr.r), dzsjVar2.a());
        this.at = bixnVar;
        this.au = new bixz(bydsVar);
        this.u = bmdqVar.c();
        this.ao = new aim<>();
        this.w = bfgxVar;
        this.J = bfgxVar.a(null);
        this.x = bmguVar;
        this.v = bmfg.a();
        this.y = dxioVar7;
        this.ax = bixyVar;
        this.A = ctwVar;
        this.ag = cjtd.b();
        this.ac = cjtd.b();
        this.aM = bvjjVar.o(bvjk.hO, dxioVar8.a().j(), false);
        dccx F = dcdc.F();
        F.g(bixiVar.a(dnwv.ORDER_FOOD));
        F.g(bixiVar.a(dnwv.RESTAURANT_RESERVATION));
        F.g(bixiVar.a(dnwv.SEARCH_INVENTORY));
        F.g(bixiVar.a(dnwv.SHOP_ONLINE));
        this.aA = F.f();
        this.aG = dbud.a(new dbty(btvoVar, biybVar) { // from class: biya
            private final btvo a;
            private final biyb b;

            {
                this.a = btvoVar;
                this.b = biybVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                btvo btvoVar2 = this.a;
                biyb biybVar2 = this.b;
                int i = biyc.a;
                if (biybVar2 == biyb.ABOUT_TAB || biybVar2 == biyb.NON_POI_PLACESHEET) {
                    return biwn.FULL_PLACE_INFO_BLOCK;
                }
                int aq = btvoVar2.getPlaceSheetParameters().aq();
                dqgh dqghVar = dqgh.UNDEFINED;
                iln ilnVar = iln.GEOCODE;
                if (aq == 0) {
                    throw null;
                }
                if (aq == 1) {
                    return biwn.FULL_PLACE_INFO_BLOCK;
                }
                if (aq == 2) {
                    return biwn.COUNTERFACTUAL;
                }
                if (aq == 3) {
                    return biwn.MAIN_ATTRIBUTES_ONLY;
                }
                if (aq == 4) {
                    return biwn.NO_SUGGEST_EDIT;
                }
                if (aq != 5) {
                    return biwn.NO_PHONE_AND_SUGGEST_EDIT;
                }
                return biwn.NO_PHONE;
            }
        });
    }

    private final void aQ(CharSequence charSequence) {
        this.t.a().k(this.k, charSequence.toString(), 1);
    }

    private static dqgh aR(dqgh dqghVar) {
        return (dqghVar == dqgh.CLOSED || dqghVar == dqgh.DOES_NOT_EXIST || dqghVar == dqgh.PRIVATE || dqghVar == dqgh.SPAM || dqghVar == dqgh.MOVED || dqghVar == dqgh.DUPLICATE) ? dqgh.CLOSED : dqghVar;
    }

    @Override // defpackage.biwo
    public Boolean B() {
        bwrs<ilo> bwrsVar = this.B;
        if (bwrsVar != null) {
            ilo c2 = bwrsVar.c();
            dbsk.s(c2);
            if (c2.al().d()) {
                ilo c3 = this.B.c();
                dbsk.s(c3);
                return Boolean.valueOf(c3.al().e(this.o).c());
            }
        }
        return false;
    }

    @Override // defpackage.biwo
    public Boolean C() {
        return Boolean.valueOf(this.F.length() == 0);
    }

    @Override // defpackage.biwo
    public Boolean D() {
        bwrs<ilo> bwrsVar = this.B;
        boolean z = false;
        if (bwrsVar != null) {
            ilo c2 = bwrsVar.c();
            dbsk.s(c2);
            if (!c2.am().isEmpty()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwo
    public cqkl E() {
        if (this.B == null || !D().booleanValue()) {
            if (A().booleanValue()) {
                this.D = !this.D;
                cqkx.p(this);
            }
        } else {
            gga ggaVar = this.k;
            bwqv bwqvVar = this.n;
            bwrs<ilo> bwrsVar = this.B;
            dbsk.s(bwrsVar);
            ackn acknVar = new ackn();
            acknVar.B(ackn.w(bwqvVar, bwrsVar));
            ggaVar.D(acknVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.biwo
    public Boolean F() {
        return Boolean.valueOf(this.D);
    }

    @Override // defpackage.biwo
    public List<acvf> G() {
        return this.E;
    }

    @Override // defpackage.biwo
    public Boolean H() {
        return Boolean.valueOf(this.C);
    }

    @Override // defpackage.biwo
    public CharSequence I() {
        bwrs<ilo> bwrsVar = this.B;
        if (bwrsVar != null && bwrsVar.c() != null) {
            ilo c2 = this.B.c();
            dbsk.s(c2);
            if (c2.bf().r) {
                return this.k.getString(R.string.OPEN_HOURS_SUGGEST_AN_EDIT_MERCHANT_LABEL);
            }
        }
        return this.k.getString(R.string.OPEN_HOURS_SUGGEST_AN_EDIT);
    }

    @Override // defpackage.biwo
    public cqkl J() {
        if (this.B == null) {
            return cqkl.a;
        }
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.PLACE_CARD;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        boxa a2 = this.r.a();
        bwrs<ilo> bwrsVar = this.B;
        dbsk.s(bwrsVar);
        a2.B(bwrsVar, bZ.bK(), bomu.BUSINESS_HOURS);
        return cqkl.a;
    }

    @Override // defpackage.biwo
    public CharSequence K() {
        return this.aI;
    }

    @Override // defpackage.biwo
    public Boolean L() {
        boolean z = false;
        if (!this.N.isEmpty() && !this.aH) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwo
    public Boolean M() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.biwo
    public CharSequence N() {
        if (this.N.isEmpty()) {
            return this.N;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(this.N);
        spannableString.setSpan(new ForegroundColorSpan(irg.J().b(this.k)), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (!this.O.isEmpty()) {
            spannableStringBuilder.append((CharSequence) "  ");
            SpannableString spannableString2 = new SpannableString(this.O);
            spannableString2.setSpan(new ForegroundColorSpan(irg.H().b(this.k)), 0, this.O.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        return spannableStringBuilder;
    }

    @Override // defpackage.biwo
    public CharSequence O() {
        return L().booleanValue() ? this.k.getString(R.string.ACCESSIBILITY_PLACE_PHONE_NUMBER, new Object[]{N()}) : "";
    }

    @Override // defpackage.biwo
    public cqkl P() {
        if (this.B == null) {
            return cqkl.a;
        }
        if (M().booleanValue()) {
            this.e.a(this.B, b);
            btrm btrmVar = this.l;
            ilo c2 = this.B.c();
            dbsk.s(c2);
            btrmVar.b(new beud(c2.ai()));
        } else {
            Q();
        }
        return cqkl.a;
    }

    @Override // defpackage.biwo
    public cqkl Q() {
        ((ClipboardManager) this.k.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(this.k.getString(R.string.COPIED_PHONE_LABEL), N()));
        gga ggaVar = this.k;
        Toast.makeText(ggaVar, ggaVar.getString(R.string.COPIED_PHONE_TOAST), 1).show();
        return cqkl.a;
    }

    @Override // defpackage.biwo
    public CharSequence R() {
        return this.L;
    }

    @Override // defpackage.biwo
    public cqss S() {
        cqss cqssVar = this.H;
        return cqssVar != null ? cqssVar : irg.J();
    }

    @Override // defpackage.biwo
    public cqtd T() {
        cqtd cqtdVar = this.I;
        return cqtdVar != null ? cqtdVar : cqrt.g(2131231775, ibm.x());
    }

    @Override // defpackage.biwo
    public Boolean U() {
        return Boolean.valueOf(!this.M.isEmpty());
    }

    @Override // defpackage.biwo
    public CharSequence V() {
        return !this.L.isEmpty() ? this.k.getString(R.string.ACCESSIBILITY_PLACE_WEBSITE, new Object[]{this.L}) : "";
    }

    @Override // defpackage.biwo
    public cqkl W() {
        ddho ddhoVar;
        bwrs<ilo> bwrsVar = this.B;
        if (bwrsVar == null) {
            return cqkl.a;
        }
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        if (iloVar.aQ() || iloVar.aR()) {
            ddhoVar = dtxy.lZ;
        } else {
            ddhoVar = dtxy.mS;
        }
        this.p.a().D(iloVar, 8, ddhoVar);
        aQ(this.M);
        return cqkl.a;
    }

    @Override // defpackage.biwo
    public bfgs X() {
        return this.J;
    }

    @Override // defpackage.biwo
    @dzsi
    public bmgs Y() {
        return this.K;
    }

    @Override // defpackage.biwo
    public Boolean Z() {
        return Boolean.valueOf(this.am);
    }

    @Override // defpackage.biwo
    @dzsi
    public biwe a() {
        return this.ax.b;
    }

    @Override // defpackage.biwo
    public CharSequence aA() {
        bwrs<ilo> bwrsVar = this.B;
        if (bwrsVar == null) {
            return "";
        }
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        dpoa cJ = c2.cJ();
        return cJ != null ? cJ.c : "";
    }

    @Override // defpackage.biwo
    public cjtd aB() {
        return this.ae;
    }

    @Override // defpackage.biwo
    public cqkl aC() {
        bwrs<ilo> bwrsVar = this.B;
        if (bwrsVar != null) {
            gga ggaVar = this.k;
            bwqv bwqvVar = this.n;
            bevn bevnVar = new bevn();
            bevnVar.B(bevn.w(bwqvVar, bwrsVar));
            ggaVar.D(bevnVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.biwo
    @dzsi
    public cjtd aD() {
        return this.ac.a();
    }

    @Override // defpackage.biwo
    public String aF() {
        return this.k.getString(R.string.EV_HOST);
    }

    @Override // defpackage.biwo
    public String aG() {
        return this.k.getString(R.string.EV_HOST_ACCESIBILITY);
    }

    @Override // defpackage.biwo
    public Boolean aH(biwj biwjVar) {
        return Boolean.valueOf(this.j.c(biwjVar));
    }

    @Override // defpackage.biwo
    public CharSequence aI() {
        return this.aJ;
    }

    @Override // defpackage.biwo
    public Boolean aJ() {
        return Boolean.valueOf(this.aJ.length() > 0);
    }

    @Override // defpackage.biwo
    @dzsi
    public CharSequence aK() {
        return this.aJ;
    }

    @Override // defpackage.biwo
    @dzsi
    public cjtd aL() {
        if (aJ().booleanValue()) {
            return this.ah;
        }
        return null;
    }

    @Override // defpackage.biwo
    @dzsi
    public CharSequence aM() {
        return this.aK;
    }

    @Override // defpackage.biwo
    @dzsi
    public bmml aN() {
        return this.az;
    }

    @Override // defpackage.biwo
    public Boolean aO() {
        boolean z = false;
        if (this.aM && this.aL != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwo
    @dzsi
    public bmbh aP() {
        return this.aL;
    }

    @Override // defpackage.biwo
    public cjtd aa() {
        return this.V;
    }

    @Override // defpackage.biwo
    public cjtd ab() {
        return this.W;
    }

    @Override // defpackage.biwo
    public cjtd ac() {
        return this.X;
    }

    @Override // defpackage.biwo
    public cjtd ad() {
        return this.Y;
    }

    @Override // defpackage.biwo
    public cjtd ae() {
        return this.Z;
    }

    @Override // defpackage.biwo
    public cjtd af() {
        return this.aa;
    }

    @Override // defpackage.biwo
    public cjtd ag() {
        return this.ab;
    }

    @Override // defpackage.biwo
    public cjtd ah() {
        return this.aj;
    }

    @Override // defpackage.biwo
    public cjtd ai() {
        return this.ad;
    }

    @Override // defpackage.biwo
    public cjtd aj() {
        return this.af;
    }

    @Override // defpackage.biwo
    public cjtd ak() {
        return this.ai;
    }

    @Override // defpackage.biwo
    public cjtd al() {
        return this.ak;
    }

    @Override // defpackage.biwo
    public biyz am() {
        return this.aq;
    }

    @Override // defpackage.biwo
    @dzsi
    public bgvw an() {
        ilo iloVar = (ilo) bwrs.b(this.B);
        return null;
    }

    @Override // defpackage.biwo
    public bflj ao() {
        return this.ar;
    }

    @Override // defpackage.biwo
    public bflj ap() {
        return this.as;
    }

    @Override // defpackage.biwo
    @dzsi
    public biwh aq() {
        return this.ay;
    }

    @Override // defpackage.biwo
    public biwm ar() {
        return this.at;
    }

    @Override // defpackage.biwo
    public biwp as() {
        return this.au;
    }

    @Override // defpackage.biwo
    @dzsi
    public bfwt at() {
        if (this.av.w().booleanValue()) {
            return this.av;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    @Override // defpackage.biwo
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.biwl au(defpackage.dqgh r19) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biyc.au(dqgh):biwl");
    }

    @Override // defpackage.biwo
    public Boolean av(dqgh dqghVar) {
        return Boolean.valueOf(this.ao.containsKey(dqghVar));
    }

    @Override // defpackage.biwo
    public Boolean aw(dqgh dqghVar) {
        return Boolean.valueOf(this.ap.containsKey(dqghVar));
    }

    @Override // defpackage.biwo
    public Boolean ax() {
        boolean z = false;
        if (this.B == null) {
            return false;
        }
        if ((this.f.c() && !this.s.a().o()) || this.s.a().p(this.B.c())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwo
    public cqkl ay() {
        bwrs<ilo> bwrsVar = this.B;
        if (bwrsVar != null && bwrsVar.c() != null) {
            ilo c2 = this.B.c();
            dbsk.s(c2);
            apyz a2 = this.s.a();
            if (a2.o()) {
                a2.m(c2, apzb.PLACEPAGE);
            } else {
                this.f.d();
            }
            if (this.aE.getBusinessMessagingParameters().g) {
                this.y.a().a(c2);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.biwo
    public CharSequence az() {
        return this.k.getString(R.string.LOCAL_CLICK_TO_CONTACT_INFO_MESSAGE);
    }

    @Override // defpackage.biwo
    @dzsi
    public biwe b() {
        return this.ax.c;
    }

    @Override // defpackage.biwo
    @dzsi
    public biwe c() {
        return this.ax.d;
    }

    @Override // defpackage.biwo
    public Boolean d() {
        if (!w().booleanValue() || this.B == null) {
            return false;
        }
        return Boolean.valueOf(!this.g.a().booleanValue());
    }

    @Override // defpackage.biwo
    public biwg e() {
        return this.g;
    }

    @Override // defpackage.biwo
    public biwd f() {
        return this.h;
    }

    @Override // defpackage.biwo
    public biwk g() {
        return this.j;
    }

    @Override // defpackage.biwo
    public cqkl h() {
        if (this.B == null) {
            return cqkl.a;
        }
        this.p.a().D((ilo) bwrs.b(this.B), 8, this.U ? dtya.dd : dtya.db);
        if (!this.U) {
            String str = this.P;
            if (str != null) {
                aQ(str);
            }
        } else if (this.q.a().i(bege.MENU)) {
            this.q.a().k(bege.MENU);
        } else {
            gga ggaVar = this.k;
            bwqv bwqvVar = this.n;
            bwrs<ilo> bwrsVar = this.B;
            bkkd bkkdVar = new bkkd();
            bkkdVar.B(bkkd.w(bwqvVar, bwrsVar));
            ggaVar.D(bkkdVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.biwo
    public Boolean i() {
        bwrs<ilo> bwrsVar = this.B;
        boolean z = false;
        if (bwrsVar == null) {
            return false;
        }
        ilo c2 = bwrsVar.c();
        if (c2 != null && c2.D()) {
            dpzi E = c2.E();
            dbsk.s(E);
            dpzh b2 = dpzh.b(E.b);
            if (b2 == null) {
                b2 = dpzh.UNKNOWN_PARKING_PRESENCE;
            }
            if (b2 == dpzh.HAS_PARKING) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwo
    public String j() {
        if (this.B != null && i().booleanValue()) {
            ilo c2 = this.B.c();
            dbsk.s(c2);
            dpzi E = c2.E();
            if (E == null) {
                return "";
            }
            for (dpzs dpzsVar : E.c) {
                int a2 = dpzp.a(dpzsVar.a);
                if (a2 == 0 || a2 == 2) {
                    dqgh dqghVar = dqgh.UNDEFINED;
                    iln ilnVar = iln.GEOCODE;
                    int a3 = dpzr.a(dpzsVar.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i = a3 - 1;
                    if (i == 1) {
                        return this.k.getString(R.string.PLACE_PARKING_FREE);
                    }
                    if (i == 2) {
                        return this.k.getString(R.string.PLACE_PARKING_PAID);
                    }
                }
            }
        }
        return "";
    }

    @Override // defpackage.biwo
    public Boolean k() {
        boolean z = false;
        if ((!dbsj.d(this.P) || this.U) && !this.aH) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwo
    @dzsi
    public String l() {
        if (this.U) {
            return null;
        }
        return this.Q;
    }

    @Override // defpackage.biwo
    public cqkl m() {
        begj begjVar = new begj();
        begjVar.i = this.B;
        begjVar.c = jjn.FULLY_EXPANDED;
        begjVar.e = bege.ABOUT;
        this.q.a().o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.biwo
    public biwn n() {
        return this.aG.a();
    }

    @Override // defpackage.biwo
    public String o() {
        return this.R;
    }

    @Override // defpackage.biwo
    @dzsi
    public cqtd p() {
        return this.S;
    }

    @Override // defpackage.biwo
    public List<? extends biwg> q() {
        return this.aA;
    }

    @Override // defpackage.biwo
    public CharSequence r() {
        return this.F;
    }

    @Override // defpackage.biwo
    public CharSequence s() {
        return C().booleanValue() ? "" : this.k.getString(R.string.ACCESSIBILITY_PLACE_OPEN_HOURS, new Object[]{this.F});
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    @Override // defpackage.bega
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(defpackage.bwrs<defpackage.ilo> r26) {
        /*
            Method dump skipped, instructions count: 1987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biyc.t(bwrs):void");
    }

    @Override // defpackage.bega
    public void u() {
        this.aq.u();
        this.at.u();
        this.au.u();
        this.av.u();
        this.h.u();
        this.i.u();
        this.j.u();
        this.g.u();
        this.ax.a();
        this.az = null;
        this.aJ = "";
        this.ar.g();
        this.as.g();
        this.aK = null;
        this.ay = null;
        this.aH = false;
        this.E.clear();
        if (!this.aA.isEmpty()) {
            dcdc<bixh> dcdcVar = this.aA;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                dcdcVar.get(i).o();
            }
        }
        this.F = "";
        this.D = false;
        this.C = false;
        this.aI = "";
        this.G = "";
        this.M = "";
        this.L = "";
        this.H = null;
        this.I = null;
        this.P = null;
        this.Q = null;
        this.U = false;
        this.R = "";
        this.S = null;
        this.N = "";
        this.O = "";
        this.f.a(null);
        this.am = false;
        this.V = cjtd.b;
        this.ac = cjtd.b();
        this.aj = cjtd.b;
        this.ag = cjtd.b();
        this.ah = cjtd.b;
        this.W = cjtd.b;
        this.af = cjtd.b;
        this.ai = cjtd.b;
        this.ad = cjtd.b;
        this.Z = cjtd.b;
        this.ae = cjtd.b;
        this.aa = cjtd.b;
        this.ab = cjtd.b;
        this.Y = cjtd.b;
        this.X = cjtd.b;
        this.ak = cjtd.b;
        this.al = false;
        this.ao.clear();
        this.ap.clear();
        this.aB = false;
        this.K = null;
        this.aL = null;
    }

    @Override // defpackage.biwo
    public CharSequence v() {
        return this.G;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.al);
    }

    @Override // defpackage.biwo
    public CharSequence x() {
        bwrs<ilo> bwrsVar = this.B;
        if (bwrsVar == null || bwrsVar.c() == null) {
            return "";
        }
        ilo c2 = this.B.c();
        dbsk.s(c2);
        if (this.aB) {
            String C = c2.C();
            SpannableString spannableString = new SpannableString(C);
            Locale b2 = this.m.b(c2);
            if (b2 != null) {
                spannableString.setSpan(new LocaleSpan(b2), 0, C.length(), 33);
            }
            return spannableString;
        }
        return c2.C();
    }

    @Override // defpackage.biwo
    public Boolean y() {
        return Boolean.valueOf(this.aB);
    }

    @Override // defpackage.biwo
    public CharSequence z() {
        bwrs<ilo> bwrsVar = this.B;
        if (bwrsVar != null) {
            ilo c2 = bwrsVar.c();
            dbsk.s(c2);
            if (c2.al().d()) {
                ilo c3 = this.B.c();
                dbsk.s(c3);
                bydp e = c3.al().e(this.o);
                String b2 = e.b();
                if (b2 != null && e.e()) {
                    if (e.c()) {
                        return this.k.getString(R.string.HOLIDAY_HOURS_LABEL, new Object[]{b2});
                    }
                    return this.k.getString(R.string.MIGHT_AFFECT_THESE_HOURS, new Object[]{b2});
                }
            }
        }
        return "";
    }

    @Override // defpackage.biwo
    public Boolean A() {
        boolean z = true;
        Boolean bool = false;
        if (this.B != null && !C().booleanValue()) {
            ilo c2 = this.B.c();
            dbsk.s(c2);
            byed b2 = c2.al().b(this.o);
            if (b2 != null) {
                bool = Boolean.valueOf(b2.a() == byeb.HOURS_UNKNOWN || b2.a() == byeb.OPEN_NOW_HOURS_UNKNOWN || b2.a() == byeb.CLOSED_NOW_HOURS_UNKNOWN);
            }
        }
        if (bool.booleanValue() || D().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwo
    public Boolean aE() {
        int a2;
        bwrs<ilo> bwrsVar = this.B;
        boolean z = false;
        if (bwrsVar == null || bwrsVar.c() == null) {
            return false;
        }
        ilo c2 = this.B.c();
        dbsk.s(c2);
        if (!beuq.b(this.aE)) {
            return false;
        }
        dnjf ad = c2.ad();
        if (ad != null && (a2 = dnje.a(ad.a)) != 0 && a2 == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

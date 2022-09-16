package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ar.core.ImageMetadata;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ilo  reason: default package */
/* loaded from: classes.dex */
public class ilo implements Serializable, ilg {
    public static final dcqe a = dcqe.c("ilo");
    public static final cdpt b = new cdpt();
    static final ddho c = dtxy.gP;
    private static final long serialVersionUID = 0;
    @dzsi
    public transient int[] A;
    @dzsi
    public transient String B;
    @dzsi
    public Long C;
    public final akqi D;
    @dzsi
    public final akqq E;
    public List<azvo> F;
    public final int G;
    public boolean H;
    @dzsi
    public final ilf I;
    public final int J;
    private bvrt<dvyw> K;
    @dzsi
    private final String L;
    @dzsi
    private final String M;
    private final ddho N;
    private final String O;
    private final String P;
    @dzsi
    private dcep<String> Q = null;
    private final boolean R;
    private final dcdc<bvrt<dvxl>> S;
    @dzsi
    private final cjtd T;
    @dzsi
    private transient String U;
    @dzsi
    private transient String V;
    @dzsi
    private transient String W;
    @dzsi
    private transient String X;
    @dzsi
    private transient Boolean Y;
    @dzsi
    private transient String Z;
    private final bvrt<dhld> aA;
    @dzsi
    private dcdc<ilo> aB;
    @dzsi
    private final bvrt<dmmq> aC;
    private final int aD;
    @dzsi
    private transient String aa;
    @dzsi
    private transient List<cdjd> ab;
    @dzsi
    private transient dcdc<ilo> ac;
    @dzsi
    private transient dvxn ad;
    @dzsi
    private transient dvxn ae;
    private transient boolean af;
    private transient int ag;
    @dzsi
    private transient dcdc<altv> ah;
    @dzsi
    private transient dnpq ai;
    @dzsi
    private transient akqi aj;
    @dzsi
    private transient akqq ak;
    @dzsi
    private transient dhjx al;
    @dzsi
    private transient byee am;
    @dzsi
    private transient dcdc<acve> an;
    @dzsi
    private transient dnjf ao;
    private transient boolean ap;
    @dzsi
    private transient dgbg aq;
    private boolean ar;
    @dzsi
    private transient String as;
    @dzsi
    private transient blvw at;
    @dzsi
    private transient cjtd au;
    @dzsi
    private transient Float av;
    @dzsi
    private transient dqdc aw;
    private final int ax;
    @dzsi
    private final bvrt<cut> ay;
    private final bvrt<dhze> az;
    @dzsi
    public final ikz d;
    public final Set<String> e;
    public final boolean f;
    @dzsi
    public final ilo g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    @dzsi
    public final dndr p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public boolean t;
    public final boolean u;
    public final boolean v;
    @dzsi
    public transient Boolean w;
    @dzsi
    public transient dvxn x;
    @dzsi
    public transient byee y;
    @dzsi
    public transient String z;

    public ilo(dvyw dvywVar, @dzsi ikz ikzVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, dcdc<dvxl> dcdcVar, boolean z6, boolean z7, boolean z8, boolean z9, @dzsi String str, @dzsi String str2, ddho ddhoVar, String str3, String str4, @dzsi cjtd cjtdVar, @dzsi dndr dndrVar, Set<String> set, @dzsi ilo iloVar, boolean z10, @dzsi Long l, List<azvo> list, boolean z11, boolean z12, int i, int i2, @dzsi dhze dhzeVar, @dzsi dhld dhldVar, @dzsi cut cutVar, @dzsi akqi akqiVar, @dzsi akqq akqqVar, boolean z13, int i3, boolean z14, boolean z15, boolean z16, @dzsi dmmq dmmqVar, @dzsi ilf ilfVar) {
        int i4;
        dgkw dgkwVar;
        this.K = bvrt.b(dvywVar);
        this.d = ikzVar;
        this.f = z;
        this.R = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.S = (dcdc) bvrt.c(dcdcVar, new dccx());
        this.l = z6;
        this.n = z7;
        this.o = z8;
        this.m = z9;
        this.L = str;
        this.M = str2;
        this.N = ddhoVar;
        this.O = str3;
        this.P = str4;
        this.T = cjtdVar;
        this.p = dndrVar;
        this.e = set;
        this.g = iloVar;
        this.h = z10;
        this.q = z11;
        this.r = z12;
        this.ax = i;
        this.G = i2;
        this.az = bvrt.b(dhzeVar != null ? dhzeVar : dhze.m);
        this.aA = bvrt.b(dhldVar != null ? dhldVar : dhld.b);
        if (aM() && ikzVar != null) {
            this.au = ikzVar.j;
        }
        this.C = l;
        this.F = list;
        this.ay = bvrt.a(cutVar);
        this.D = akqiVar == null ? ai() : akqiVar;
        this.E = akqqVar == null ? aj() : akqqVar;
        this.s = z13;
        this.J = i3;
        this.t = z14;
        this.u = z15;
        this.v = z16;
        dglq dglqVar = dvywVar.aH;
        Iterator<dgls> it = (dglqVar == null ? dglq.d : dglqVar).c.iterator();
        while (true) {
            i4 = 3;
            if (!it.hasNext()) {
                i4 = 1;
                break;
            }
            dgls next = it.next();
            if (next.b.equals("accessibility")) {
                for (dglo dgloVar : next.d) {
                    if (dgloVar.b.equals("/geo/type/establishment_poi/has_wheelchair_accessible_entrance")) {
                        dglu dgluVar = dgloVar.d;
                        dgluVar = dgluVar == null ? dglu.e : dgluVar;
                        if (dgluVar.b == 3) {
                            dgkwVar = (dgkw) dgluVar.c;
                        } else {
                            dgkwVar = dgkw.f;
                        }
                        if (true == dgkwVar.b) {
                            i4 = 2;
                        }
                    }
                }
                continue;
            }
        }
        this.aD = i4;
        this.H = false;
        this.aC = bvrt.a(dmmqVar);
        this.I = ilfVar;
    }

    private final String cY(boolean z) {
        if (!dbsj.d(this.M)) {
            return this.M;
        }
        if (aU() && aj() != null) {
            return z ? cZ(aj()) : "";
        } else if (!dbsj.d(F())) {
            return F();
        } else {
            return !dbsj.d(n()) ? n() : "";
        }
    }

    private static String cZ(akqq akqqVar) {
        return String.format(Locale.US, "%.6f,%.6f", Double.valueOf(akqqVar.a), Double.valueOf(akqqVar.b));
    }

    public static boolean cs(List<ilo> list, List<ilo> list2) {
        if (list.size() == list2.size()) {
            for (int i = 0; i < list.size(); i++) {
                ilo iloVar = list.get(i);
                ilo iloVar2 = list2.get(i);
                if (iloVar == null) {
                    if (iloVar2 != null) {
                        return false;
                    }
                } else if (!iloVar.cr(iloVar2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    static String ct(String str) {
        return (str == null || !str.startsWith("/")) ? str : str.length() != 0 ? "http://www.google.com".concat(str) : new String("http://www.google.com");
    }

    private final String da(@dzsi Locale locale) {
        StringBuilder sb = new StringBuilder();
        if (aU()) {
            akqq aj = aj();
            if (aj == null) {
                bvoo.h("There is neither FeatureID nor LatLong.", new Object[0]);
                return "";
            }
            sb.append("https://maps.google.com/?q=");
            sb.append(cZ(aj));
        } else if (aV()) {
            try {
                String encode = URLEncoder.encode(y(), "UTF-8");
                sb.append("https://maps.google.com/?q=");
                sb.append(encode);
                sb.append("&ftid=");
                sb.append(ai());
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } else {
            sb.append("https://maps.google.com/?cid=");
            sb.append(ai().n());
        }
        if (locale != null) {
            sb.append("&hl=");
            sb.append(locale.getLanguage());
            sb.append("&gl=");
            sb.append(locale.getCountry().toLowerCase(Locale.US));
        }
        sb.append("&entry=gps");
        return sb.toString();
    }

    private final dnie db() {
        if ((h().d & 16) == 0) {
            dnie dnieVar = bf().p;
            return dnieVar == null ? dnie.d : dnieVar;
        }
        dnie dnieVar2 = h().aY;
        return dnieVar2 == null ? dnie.d : dnieVar2;
    }

    private final boolean dc(dweb dwebVar) {
        dwed dwedVar = h().J;
        if (dwedVar == null) {
            dwedVar = dwed.b;
        }
        for (dwef dwefVar : dwedVar.a) {
            dweb b2 = dweb.b(dwefVar.b);
            if (b2 == null) {
                b2 = dweb.UNKNOWN_CATEGORY;
            }
            if (b2.equals(dwebVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<String> A() {
        return h().o;
    }

    public final String B() {
        if (!dbsj.d(this.O)) {
            return this.O;
        }
        if (this.Z == null) {
            this.Z = h().p;
        }
        return this.Z;
    }

    public final String C() {
        if (!dbsj.d(this.O)) {
            return "";
        }
        if (this.aa == null) {
            this.aa = h().q;
        }
        return this.aa;
    }

    public final boolean D() {
        return (h().c & 1) != 0;
    }

    @dzsi
    public final dpzi E() {
        if (D()) {
            dpzi dpziVar = h().aq;
            return dpziVar == null ? dpzi.e : dpziVar;
        }
        return null;
    }

    public final String F() {
        return h().r;
    }

    @dzsi
    public final String G() {
        return (String) dcft.r(A(), null);
    }

    public final dcdc<ilo> H() {
        if (this.ac == null) {
            dvvy dvvyVar = h().as;
            if (dvvyVar == null) {
                dvvyVar = dvvy.d;
            }
            dccx G = dcdc.G(dvvyVar.b.size());
            int i = 0;
            while (true) {
                dvvy dvvyVar2 = h().as;
                if (dvvyVar2 == null) {
                    dvvyVar2 = dvvy.d;
                }
                if (i >= dvvyVar2.b.size()) {
                    break;
                }
                ily ilyVar = new ily();
                dvvy dvvyVar3 = h().as;
                if (dvvyVar3 == null) {
                    dvvyVar3 = dvvy.d;
                }
                ilyVar.E(dvvyVar3.b.get(i));
                G.g(ilyVar.d());
                i++;
            }
            this.ac = G.f();
        }
        return this.ac;
    }

    @dzsi
    public final String I() {
        String P = P();
        return !dbsj.d(P) ? P : L();
    }

    @dzsi
    public final String J() {
        String P = P();
        return !dbsj.d(P) ? P : N();
    }

    @dzsi
    public final String K() {
        return (String) dcft.r(Q(), null);
    }

    @dzsi
    public final String L() {
        for (dgfy dgfyVar : bf().b) {
            if ((dgfyVar.a & 4) != 0) {
                return dgfyVar.d;
            }
        }
        return null;
    }

    public final dbsg<dpmv> M() {
        if ((bf().a & 1) != 0) {
            dpmv dpmvVar = bf().c;
            if (dpmvVar == null) {
                dpmvVar = dpmv.c;
            }
            return dbsg.i(dpmvVar);
        }
        return dbpy.a;
    }

    @dzsi
    public final String N() {
        String S = S();
        return S != null ? S : L();
    }

    @dzsi
    public final String O() {
        if (!R().isEmpty()) {
            return R().get(0);
        }
        return null;
    }

    @dzsi
    public final String P() {
        if (aM()) {
            return this.d.i;
        }
        return null;
    }

    public final List<String> Q() {
        ArrayList arrayList = new ArrayList();
        for (dgfy dgfyVar : bf().b) {
            arrayList.add(dgfyVar.b);
        }
        return arrayList;
    }

    public final List<String> R() {
        ArrayList arrayList = new ArrayList();
        for (dgfy dgfyVar : bf().b) {
            if ((dgfyVar.a & 2) != 0) {
                arrayList.add(dgfyVar.c);
            }
        }
        return arrayList;
    }

    @dzsi
    public final String S() {
        int a2;
        doav cx = cx();
        if (cx == null || (a2 = doau.a(cx.b)) == 0 || a2 != 2 || (cx.a & 16) == 0) {
            return null;
        }
        dnvs dnvsVar = cx.e;
        if (dnvsVar == null) {
            dnvsVar = dnvs.d;
        }
        for (dnvr dnvrVar : dnvsVar.b) {
            dqgh b2 = dqgh.b(dnvrVar.b);
            if (b2 == null) {
                b2 = dqgh.UNDEFINED;
            }
            if (b2 == dqgh.PHONE_NUMBER) {
                dnfe dnfeVar = dnvrVar.d;
                if (dnfeVar == null) {
                    dnfeVar = dnfe.p;
                }
                return dnfeVar.c;
            }
        }
        return null;
    }

    @dzsi
    public final dnwx T(dnwv dnwvVar) {
        dnxj dnxjVar = h().au;
        if (dnxjVar == null) {
            dnxjVar = dnxj.b;
        }
        for (dnwx dnwxVar : dnxjVar.a) {
            dnwv b2 = dnwv.b(dnwxVar.b);
            if (b2 == null) {
                b2 = dnwv.UNKNOWN_ACTION_TYPE;
                continue;
            }
            if (b2 == dnwvVar) {
                return dnwxVar;
            }
        }
        return null;
    }

    @dzsi
    public final dqqa U() {
        if ((h().c & 32) != 0) {
            dqqa dqqaVar = h().av;
            return dqqaVar == null ? dqqa.g : dqqaVar;
        }
        return null;
    }

    public final dbsg<dqtl> V() {
        if ((h().b & 512) != 0) {
            dqtl dqtlVar = h().W;
            if (dqtlVar == null) {
                dqtlVar = dqtl.e;
            }
            return dbsg.i(dqtlVar);
        }
        return dbpy.a;
    }

    public final dvyy W() {
        if ((h().c & 1073741824) == 0) {
            dvyy dvyyVar = bf().e;
            return dvyyVar == null ? dvyy.e : dvyyVar;
        }
        dvyy dvyyVar2 = h().aT;
        return dvyyVar2 == null ? dvyy.e : dvyyVar2;
    }

    public final int X() {
        return W().d;
    }

    public final String Y() {
        return W().c;
    }

    public final String Z() {
        String aa = aa();
        return dbsj.d(aa) ? Y() : aa;
    }

    @Override // defpackage.ilg
    public final cjtd a() {
        if (this.au == null) {
            cjta b2 = cjtd.b();
            dvxb dvxbVar = h().V;
            if (dvxbVar == null) {
                dvxbVar = dvxb.d;
            }
            if ((dvxbVar.a & 2) != 0) {
                b2.g(dvxbVar.c);
            }
            if ((dvxbVar.a & 1) != 0) {
                b2.b = dvxbVar.b;
            }
            this.au = b2.d();
        }
        return this.au;
    }

    public final boolean aA() {
        return (bf().a & 256) != 0;
    }

    public final void aB() {
        if (this.af) {
            return;
        }
        this.af = true;
        dsrj<dvxn> dsrjVar = h().F;
        this.ag = 0;
        for (dvxn dvxnVar : dsrjVar) {
            dwfl dwflVar = dvxnVar.b;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            if ((dwflVar.a & 16) != 0) {
                dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
                dwfl dwflVar2 = dvxnVar.b;
                if (dwflVar2 == null) {
                    dwflVar2 = dwfl.w;
                }
                int a2 = dwfc.a(dwflVar2.f);
                if (a2 == 0 || a2 == 1) {
                    this.ad = dvxnVar;
                } else if (a2 != 2) {
                    this.x = dvxnVar;
                } else {
                    this.ae = dvxnVar;
                }
                if (this.ag == 0 && (dvxnVar.a & 16) != 0) {
                    this.ag = dvxnVar.d;
                }
            }
        }
    }

    @dzsi
    public final dvxn aC() {
        aB();
        return this.ad;
    }

    @dzsi
    public final dvxn aD() {
        aB();
        return this.ae;
    }

    public final List<dwfl> aE() {
        return h().I;
    }

    public final List<dwfl> aF(dweb dwebVar) {
        for (dwdx dwdxVar : h().aP) {
            for (dwef dwefVar : dwdxVar.a) {
                dweb b2 = dweb.b(dwefVar.b);
                if (b2 == null) {
                    b2 = dweb.UNKNOWN_CATEGORY;
                    continue;
                }
                if (b2 == dwebVar) {
                    dwfn dwfnVar = dwdxVar.b;
                    if (dwfnVar == null) {
                        dwfnVar = dwfn.b;
                    }
                    return dwfnVar.a;
                }
            }
        }
        return dcdc.e();
    }

    public final int aG() {
        int i;
        if ((h().c & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) {
            aB();
            return this.ag;
        }
        dlxe dlxeVar = h().aG;
        if (dlxeVar == null) {
            dlxeVar = dlxe.f;
        }
        Iterator<dlxd> it = dlxeVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            dlxd next = it.next();
            int a2 = dwfc.a(next.a);
            if (a2 != 0 && a2 == 3) {
                i = next.b;
                break;
            }
        }
        return i + aH();
    }

    public final int aH() {
        dlxe dlxeVar = h().aG;
        if (dlxeVar == null) {
            dlxeVar = dlxe.f;
        }
        return dlxeVar.b;
    }

    public final int aI() {
        dlxe dlxeVar = h().aG;
        if (dlxeVar == null) {
            dlxeVar = dlxe.f;
        }
        return dlxeVar.c;
    }

    public final int aJ() {
        dlxe dlxeVar = h().aG;
        if (dlxeVar == null) {
            dlxeVar = dlxe.f;
        }
        return dlxeVar.d;
    }

    public final int aK() {
        dlxe dlxeVar = h().aG;
        if (dlxeVar == null) {
            dlxeVar = dlxe.f;
        }
        return dlxeVar.e;
    }

    @dzsi
    public final String aL() {
        if (h().ap.size() <= 0 || h().ap.get(0).b.isEmpty()) {
            return null;
        }
        return ct(h().ap.get(0).b);
    }

    public final boolean aM() {
        ikz ikzVar = this.d;
        return ikzVar != null && ikzVar.c() == 1;
    }

    public final boolean aN() {
        ikz ikzVar = this.d;
        return ikzVar != null && ikzVar.d() == 2;
    }

    public final boolean aO() {
        ikz ikzVar = this.d;
        return ikzVar != null && ikzVar.c() == 3;
    }

    public final boolean aP() {
        return h().aL;
    }

    public final boolean aQ() {
        return h().aa;
    }

    public final boolean aR() {
        return h().ab;
    }

    public final boolean aS() {
        return h().ac;
    }

    public final String aT() {
        return h().ad;
    }

    public final boolean aU() {
        return !akqi.d(ai());
    }

    public final boolean aV() {
        if (!this.R || ba() || bb()) {
            return false;
        }
        return h().an;
    }

    public final boolean aW() {
        return h().aE;
    }

    public final boolean aX(dkiy dkiyVar) {
        if (dkiyVar.p) {
            if (dkiyVar.ad) {
                return h().aN;
            }
            if (!an() && (h().a & 2097152) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean aY() {
        if (this.H) {
            return h().S;
        }
        return !an() && h().S;
    }

    public final boolean aZ() {
        return h().ai;
    }

    @dzsi
    public final String aa() {
        dbsg<dnng> bS = bS();
        if (!bS.a() || bS.b().d.isEmpty()) {
            return null;
        }
        return bS.b().d;
    }

    @dzsi
    public final String ab() {
        dgbg ac = ac();
        if (ac != null) {
            return ac.b;
        }
        return null;
    }

    @dzsi
    public final dgbg ac() {
        if (!this.ap) {
            dgbf dgbfVar = dgbf.REGULAR_UNLEADED;
            dgbg dgbgVar = null;
            if ((h().b & 268435456) != 0) {
                dgbi dgbiVar = h().al;
                if (dgbiVar == null) {
                    dgbiVar = dgbi.b;
                }
                Iterator<dgbg> it = dgbiVar.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    dgbg next = it.next();
                    dgbf b2 = dgbf.b(next.c);
                    if (b2 == null) {
                        b2 = dgbf.UNKNOWN_TYPE;
                        continue;
                    }
                    if (b2 == dgbfVar) {
                        dgbgVar = next;
                        break;
                    }
                }
            }
            this.aq = dgbgVar;
            this.ap = true;
        }
        return this.aq;
    }

    @dzsi
    public final dnjf ad() {
        if (this.ao != null || (h().d & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) {
            return this.ao;
        }
        dnjf dnjfVar = h().bi;
        if (dnjfVar == null) {
            dnjfVar = dnjf.d;
        }
        this.ao = dnjfVar;
        return dnjfVar;
    }

    public final boolean ae() {
        return !Float.isNaN(af());
    }

    public final float af() {
        dvyy W = W();
        float f = (W.a & 1) != 0 ? W.b : Float.NaN;
        if (f < 1.0f) {
            return Float.NaN;
        }
        return f;
    }

    public final dnpq ag() {
        if (this.ai == null) {
            if ((bf().a & 512) != 0) {
                dnpq dnpqVar = bf().j;
                if (dnpqVar == null) {
                    dnpqVar = dnpq.g;
                }
                this.ai = dnpqVar;
                dnpp ca = dnpq.g.ca(dnpqVar);
                String ct = ct(this.ai.c);
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dnpq dnpqVar2 = (dnpq) ca.b;
                ct.getClass();
                dnpqVar2.a |= 2;
                dnpqVar2.c = ct;
                this.ai = ca.bK();
            }
            if (this.ai == null) {
                this.ai = dnpq.g;
            }
        }
        return this.ai;
    }

    public final dnpq ah() {
        int a2;
        doav cx = cx();
        if (cx != null && (cx.a & 16) != 0 && (a2 = doau.a(cx.b)) != 0 && a2 == 2) {
            dnvs dnvsVar = cx.e;
            if (dnvsVar == null) {
                dnvsVar = dnvs.d;
            }
            for (dnvr dnvrVar : dnvsVar.b) {
                dqgh b2 = dqgh.b(dnvrVar.b);
                if (b2 == null) {
                    b2 = dqgh.UNDEFINED;
                }
                if (b2 == dqgh.WEBSITE) {
                    dnpp bZ = dnpq.g.bZ();
                    dnfe dnfeVar = dnvrVar.d;
                    if (dnfeVar == null) {
                        dnfeVar = dnfe.p;
                    }
                    String str = dnfeVar.c;
                    if (!str.startsWith("http://") && !str.startsWith("https://")) {
                        String valueOf = String.valueOf(str);
                        str = valueOf.length() != 0 ? "http://".concat(valueOf) : new String("http://");
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnpq dnpqVar = (dnpq) bZ.b;
                    str.getClass();
                    dnpqVar.a = 2 | dnpqVar.a;
                    dnpqVar.c = str;
                    return bZ.bK();
                }
            }
        }
        return ag();
    }

    public final akqi ai() {
        if (this.aj == null) {
            akqi f = akqi.f(h().g);
            this.aj = f;
            if (f == null) {
                this.aj = akqi.a;
            }
        }
        return this.aj;
    }

    @dzsi
    public final akqq aj() {
        if (this.ak == null && (h().a & 1) != 0) {
            dhjz dhjzVar = h().e;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            this.ak = akqq.j(dhjzVar);
        }
        return this.ak;
    }

    @dzsi
    public final dhjx ak() {
        if (this.al == null && (h().b & 8) != 0) {
            dhjx dhjxVar = h().Q;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
            this.al = dhjxVar;
        }
        return this.al;
    }

    public final byee al() {
        if (this.am == null) {
            this.am = new byee(bf(), aT(), an(), ao());
        }
        return this.am;
    }

    public final dcdc<acve> am() {
        if (this.an == null) {
            dccx F = dcdc.F();
            for (dqii dqiiVar : bf().n) {
                String str = dqiiVar.b;
                dgfs dgfsVar = dqiiVar.c;
                if (dgfsVar == null) {
                    dgfsVar = dgfs.f;
                }
                F.g(acve.c(str, new byee(dgfsVar, aT(), an(), ao())));
            }
            this.an = F.f();
        }
        return this.an;
    }

    public final boolean an() {
        return bf().f;
    }

    public final boolean ao() {
        dqio dqioVar = bf().g;
        if (dqioVar == null) {
            dqioVar = dqio.b;
        }
        return dqioVar.a;
    }

    public final boolean ap() {
        return h().aB;
    }

    public final String aq() {
        if (h().B.size() <= 0 || (h().B.get(0).a & 2) == 0) {
            return ar();
        }
        return h().B.get(0).c;
    }

    public final String ar() {
        return h().A.size() > 0 ? h().A.get(0) : "";
    }

    public final dcep<String> as() {
        if (this.Q == null) {
            dsrj<dvxx> dsrjVar = h().B;
            dcen O = dcep.O(dsrjVar.size());
            for (dvxx dvxxVar : dsrjVar) {
                O.b(dvxxVar.b);
            }
            this.Q = O.f();
        }
        return this.Q;
    }

    @dzsi
    public final dpvg at() {
        if ((h().a & 16777216) != 0) {
            dpyp dpypVar = h().D;
            if (dpypVar == null) {
                dpypVar = dpyp.c;
            }
            dpvg dpvgVar = dpypVar.a;
            return dpvgVar == null ? dpvg.d : dpvgVar;
        }
        return null;
    }

    public final String au() {
        if ((h().a & 16777216) != 0) {
            dpyp dpypVar = h().D;
            if (dpypVar == null) {
                dpypVar = dpyp.c;
            }
            return dpypVar.b;
        }
        return "";
    }

    public final String av() {
        return h().y;
    }

    public final String aw() {
        return da(Locale.getDefault());
    }

    public final Uri.Builder ax() {
        Uri.Builder path = new Uri.Builder().scheme("http").authority("maps.google.com").path("maps");
        if (ai().equals(akqi.a)) {
            akqq aj = aj();
            if (aj != null) {
                path.appendQueryParameter("q", cZ(aj));
            }
        } else {
            path.appendQueryParameter("ftid", ai().o());
        }
        return path;
    }

    public final String ay() {
        return da(null);
    }

    public final dnpq az() {
        dnpq dnpqVar = bf().h;
        return dnpqVar == null ? dnpq.g : dnpqVar;
    }

    @Override // defpackage.ilg
    @dzsi
    public final Intent b() {
        dnpq ag;
        if ((aQ() || aR()) && (ag = ag()) != null) {
            String str = ag.c;
            if (!TextUtils.isEmpty(str)) {
                return new Intent("android.intent.action.VIEW", Uri.parse(str));
            }
            return null;
        }
        return null;
    }

    public final dcdc<altv> bA() {
        if (this.ah == null) {
            dccx F = dcdc.F();
            for (dwzu dwzuVar : h().T) {
                altv b2 = altv.b(dwzuVar);
                if (b2 != null) {
                    F.g(b2);
                }
            }
            this.ah = F.f();
        }
        return this.ah;
    }

    public final List<doft> bB() {
        if ((h().d & 8) == 0) {
            dors dorsVar = bf().o;
            if (dorsVar == null) {
                dorsVar = dors.b;
            }
            return dorsVar.a;
        }
        dors dorsVar2 = h().aX;
        if (dorsVar2 == null) {
            dorsVar2 = dors.b;
        }
        return dorsVar2.a;
    }

    public final String bC() {
        doft doftVar = db().b;
        if (doftVar == null) {
            doftVar = doft.h;
        }
        return doftVar.e;
    }

    public final String bD() {
        doft doftVar = db().c;
        if (doftVar == null) {
            doftVar = doft.h;
        }
        return doftVar.e;
    }

    public final djup bE() {
        djup djupVar = h().bn;
        return djupVar == null ? djup.b : djupVar;
    }

    public final dwgn bF() {
        dwgn dwgnVar = h().H;
        return dwgnVar == null ? dwgn.c : dwgnVar;
    }

    public final boolean bG() {
        return dc(dweb.FOOD_AND_DRINK);
    }

    public final boolean bH() {
        return dc(dweb.ROOM);
    }

    public final boolean bI() {
        return dc(dweb.IN_STORE);
    }

    public final dwfl bJ() {
        if ((h().a & 67108864) == 0) {
            if ((bf().a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) {
                dwgn dwgnVar = h().H;
                if (dwgnVar == null) {
                    dwgnVar = dwgn.c;
                }
                if (dwgnVar.a.size() > 0) {
                    dwgn dwgnVar2 = h().H;
                    if (dwgnVar2 == null) {
                        dwgnVar2 = dwgn.c;
                    }
                    return dwgnVar2.a.get(0);
                } else if (aV()) {
                    for (dvxn dvxnVar : h().F) {
                        if ((dvxnVar.a & 1) != 0) {
                            dwfl dwflVar = dvxnVar.b;
                            return dwflVar == null ? dwfl.w : dwflVar;
                        }
                    }
                    return dwfl.w;
                } else {
                    return dwfl.w;
                }
            }
            dwfl dwflVar2 = bf().q;
            return dwflVar2 == null ? dwfl.w : dwflVar2;
        }
        dwfl dwflVar3 = h().G;
        return dwflVar3 == null ? dwfl.w : dwflVar3;
    }

    @dzsi
    public final String bK() {
        ikz ikzVar = this.d;
        if (ikzVar != null) {
            return ikzVar.g;
        }
        return null;
    }

    @dzsi
    public final alvj bL() {
        ikz ikzVar = this.d;
        if (ikzVar == null) {
            return null;
        }
        return ikzVar.a;
    }

    public final boolean bM() {
        if (this.p == dndr.HOME || this.p == dndr.WORK || aQ() || aR()) {
            return false;
        }
        return !aU() || !aM();
    }

    public final boolean bN() {
        return bX().b;
    }

    public final boolean bO() {
        return (bX().a & 16) != 0;
    }

    public final dopk bP() {
        dopk dopkVar = h().L;
        return dopkVar == null ? dopk.x : dopkVar;
    }

    public final dcdc<dvxl> bQ() {
        return (dcdc) bvrt.d(this.S, new dccx(), (dssr) dvxl.e.cu(7), dvxl.e);
    }

    public final void bR(@dzsi dnng dnngVar) {
        this.aB = null;
        this.t = false;
        if (dnngVar == null) {
            dvyw h = h();
            dsqp dsqpVar = (dsqp) h.cu(5);
            dsqpVar.bC(h);
            dvya dvyaVar = (dvya) dsqpVar;
            if (dvyaVar.c) {
                dvyaVar.bF();
                dvyaVar.c = false;
            }
            dvyw dvywVar = (dvyw) dvyaVar.b;
            dvyw dvywVar2 = dvyw.bv;
            dvywVar.X = null;
            dvywVar.b &= -1025;
            this.K = bvrt.b(dvyaVar.bK());
            return;
        }
        dvyw h2 = h();
        dsqp dsqpVar2 = (dsqp) h2.cu(5);
        dsqpVar2.bC(h2);
        dvya dvyaVar2 = (dvya) dsqpVar2;
        if (dvyaVar2.c) {
            dvyaVar2.bF();
            dvyaVar2.c = false;
        }
        dvyw dvywVar3 = (dvyw) dvyaVar2.b;
        dvyw dvywVar4 = dvyw.bv;
        dnngVar.getClass();
        dvywVar3.X = dnngVar;
        dvywVar3.b |= 1024;
        this.K = bvrt.b(dvyaVar2.bK());
    }

    public final dbsg<dnng> bS() {
        if ((h().b & 1024) != 0) {
            dnng dnngVar = h().X;
            if (dnngVar == null) {
                dnngVar = dnng.r;
            }
            return dbsg.i(dnngVar);
        }
        return dbpy.a;
    }

    public final dbsg<duui> bT() {
        if ((h().b & 134217728) != 0) {
            duui duuiVar = h().ak;
            if (duuiVar == null) {
                duuiVar = duui.e;
            }
            return dbsg.i(duuiVar);
        }
        return dbpy.a;
    }

    public final List<dqws> bU() {
        duui duuiVar = h().ak;
        if (duuiVar == null) {
            duuiVar = duui.e;
        }
        return duuiVar.d;
    }

    public final boolean bV() {
        duui duuiVar = h().ak;
        if (duuiVar == null) {
            duuiVar = duui.e;
        }
        return duuiVar.d.size() > 0;
    }

    public final dbsg<dnnx> bW() {
        dnng dnngVar = h().X;
        if (dnngVar == null) {
            dnngVar = dnng.r;
        }
        if ((dnngVar.a & 134217728) != 0) {
            dnng dnngVar2 = h().X;
            if (dnngVar2 == null) {
                dnngVar2 = dnng.r;
            }
            dnnx dnnxVar = dnngVar2.l;
            if (dnnxVar == null) {
                dnnxVar = dnnx.b;
            }
            return dbsg.i(dnnxVar);
        }
        return dbpy.a;
    }

    public final dnwf bX() {
        dnwf dnwfVar = h().Y;
        return dnwfVar == null ? dnwf.r : dnwfVar;
    }

    @dzsi
    public final cjtd bY() {
        cjtd a2;
        cjtd cjtdVar = this.T;
        if (cjtdVar == null || (cjtdVar.d == null && a().d != null)) {
            a2 = a();
        } else {
            a2 = this.T;
        }
        if (this.N != null) {
            cjta c2 = cjtd.c(a2);
            c2.d = this.N;
            return c2.a();
        }
        return a2;
    }

    public final cjtd bZ() {
        ddes bZ;
        cjtd a2 = a();
        decs a3 = decs.a(ai().c);
        akqq aj = aj();
        if (aj != null) {
            if (a2.k() != null) {
                ddet k = a2.k();
                dsqp dsqpVar = (dsqp) k.cu(5);
                dsqpVar.bC(k);
                bZ = (ddes) dsqpVar;
            } else {
                bZ = ddet.D.bZ();
            }
            dcvs b2 = dcvs.b(aj.a, aj.b);
            ddep ddepVar = ((ddet) bZ.b).c;
            if (ddepVar == null) {
                ddepVar = ddep.f;
            }
            dsqp dsqpVar2 = (dsqp) ddepVar.cu(5);
            dsqpVar2.bC(ddepVar);
            ddeo ddeoVar = (ddeo) dsqpVar2;
            int b3 = b2.f().b();
            if (ddeoVar.c) {
                ddeoVar.bF();
                ddeoVar.c = false;
            }
            ddep ddepVar2 = (ddep) ddeoVar.b;
            ddepVar2.a |= 4;
            ddepVar2.d = b3;
            int b4 = b2.h().b();
            if (ddeoVar.c) {
                ddeoVar.bF();
                ddeoVar.c = false;
            }
            ddep ddepVar3 = (ddep) ddeoVar.b;
            ddepVar3.a |= 8;
            ddepVar3.e = b4;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            ddep bK = ddeoVar.bK();
            bK.getClass();
            ddetVar.c = bK;
            ddetVar.a |= 1;
            cjta c2 = cjtd.c(a2);
            c2.g = a3;
            c2.s(bZ.bK());
            return c2.d();
        }
        cjta c3 = cjtd.c(a2);
        c3.g = a3;
        return c3.d();
    }

    public final boolean ba() {
        return h().M || (h().a & 1073741824) != 0;
    }

    public final boolean bb() {
        return h().N;
    }

    public final boolean bc() {
        return h().aA;
    }

    public final boolean bd() {
        return this.m || h().aC || bc();
    }

    public final iln be() {
        if (!this.R) {
            return iln.UNRESOLVED;
        }
        if (aM()) {
            return iln.AD;
        }
        if (aV()) {
            return iln.GEOCODE;
        }
        if (ba()) {
            return iln.STATION;
        }
        return iln.BUSINESS;
    }

    public final dvxh bf() {
        dvxh dvxhVar = h().z;
        return dvxhVar == null ? dvxh.B : dvxhVar;
    }

    public final boolean bg() {
        return this.p == dndr.HOME || this.p == dndr.WORK;
    }

    public final String bh() {
        String str;
        if (!bg() || (str = this.L) == null) {
            dndn dndnVar = h().ah;
            if (dndnVar == null) {
                dndnVar = dndn.c;
            }
            dndj dndjVar = dndnVar.b;
            if (dndjVar == null) {
                dndjVar = dndj.e;
            }
            return dndjVar.c;
        }
        return str;
    }

    public final boolean bi() {
        return bj() != null;
    }

    @dzsi
    public final dndr bj() {
        dndn dndnVar = h().ah;
        if (dndnVar == null) {
            dndnVar = dndn.c;
        }
        dndj dndjVar = dndnVar.b;
        if (dndjVar == null) {
            dndjVar = dndj.e;
        }
        dndl dndlVar = dndjVar.b;
        if (dndlVar == null) {
            dndlVar = dndl.d;
        }
        if ((dndlVar.a & 1) != 0) {
            dndn dndnVar2 = h().ah;
            if (dndnVar2 == null) {
                dndnVar2 = dndn.c;
            }
            dndj dndjVar2 = dndnVar2.b;
            if (dndjVar2 == null) {
                dndjVar2 = dndj.e;
            }
            dndl dndlVar2 = dndjVar2.b;
            if (dndlVar2 == null) {
                dndlVar2 = dndl.d;
            }
            dndr b2 = dndr.b(dndlVar2.b);
            if (b2 == null) {
                b2 = dndr.UNKNOWN_ALIAS_TYPE;
            }
            if (b2 == dndr.HOME || b2 == dndr.WORK) {
                return b2;
            }
            if (b2 == dndr.NICKNAME) {
                return b2;
            }
            return null;
        }
        return null;
    }

    @dzsi
    public final Long bk() {
        if (bg()) {
            return 0L;
        }
        dndn dndnVar = h().ah;
        if (dndnVar == null) {
            dndnVar = dndn.c;
        }
        dndj dndjVar = dndnVar.b;
        if (dndjVar == null) {
            dndjVar = dndj.e;
        }
        dndl dndlVar = dndjVar.b;
        if (dndlVar == null) {
            dndlVar = dndl.d;
        }
        if ((dndlVar.a & 2) == 0) {
            return null;
        }
        dndn dndnVar2 = h().ah;
        if (dndnVar2 == null) {
            dndnVar2 = dndn.c;
        }
        dndj dndjVar2 = dndnVar2.b;
        if (dndjVar2 == null) {
            dndjVar2 = dndj.e;
        }
        dndl dndlVar2 = dndjVar2.b;
        if (dndlVar2 == null) {
            dndlVar2 = dndl.d;
        }
        String str = dndlVar2.c;
        try {
            return Long.valueOf(decu.d(str));
        } catch (NumberFormatException unused) {
            bvoo.h("SubId %s could not be parsed.", str);
            return null;
        }
    }

    public final boolean bl() {
        return !this.F.isEmpty();
    }

    @dzsi
    public final decq bm() {
        if (bg()) {
            dndn dndnVar = h().ah;
            if (dndnVar == null) {
                dndnVar = dndn.c;
            }
            dndj dndjVar = dndnVar.b;
            if (dndjVar == null) {
                dndjVar = dndj.e;
            }
            if ((dndjVar.a & 16) == 0) {
                return decq.a;
            }
            dndn dndnVar2 = h().ah;
            if (dndnVar2 == null) {
                dndnVar2 = dndn.c;
            }
            dndj dndjVar2 = dndnVar2.b;
            if (dndjVar2 == null) {
                dndjVar2 = dndj.e;
            }
            return decq.a(dndjVar2.d);
        }
        return null;
    }

    public final cdqt bn() {
        dmbq dmbqVar = h().aV;
        if (dmbqVar == null) {
            dmbqVar = dmbq.f;
        }
        return cdqt.e(dmbqVar);
    }

    public final doco bo() {
        if ((h().c & Integer.MIN_VALUE) == 0) {
            doco docoVar = bf().d;
            return docoVar == null ? doco.k : docoVar;
        }
        doco docoVar2 = h().aU;
        return docoVar2 == null ? doco.k : docoVar2;
    }

    public final boolean bp() {
        return (bo().a & 1) != 0;
    }

    public final docg bq() {
        docg docgVar = bo().c;
        return docgVar == null ? docg.M : docgVar;
    }

    public final boolean br() {
        return (bo().a & 2) != 0;
    }

    public final docg bs() {
        docg docgVar = bo().d;
        return docgVar == null ? docg.M : docgVar;
    }

    public final void bt(@dzsi docg docgVar) {
        bx(bn().f(dbsg.j(docgVar).h(ilj.a)).d());
        doco bo = bo();
        dsqp dsqpVar = (dsqp) bo.cu(5);
        dsqpVar.bC(bo);
        docn docnVar = (docn) dsqpVar;
        if (docgVar == null) {
            if (docnVar.c) {
                docnVar.bF();
                docnVar.c = false;
            }
            doco docoVar = (doco) docnVar.b;
            doco docoVar2 = doco.k;
            docoVar.c = null;
            docoVar.a &= -2;
        } else {
            if (docnVar.c) {
                docnVar.bF();
                docnVar.c = false;
            }
            doco docoVar3 = (doco) docnVar.b;
            doco docoVar4 = doco.k;
            docgVar.getClass();
            docoVar3.c = docgVar;
            docoVar3.a |= 1;
        }
        bw(docnVar);
    }

    public final void bu(@dzsi docg docgVar) {
        bx(bn().g(dbsg.j(docgVar).h(ilk.a)).d());
        doco bo = bo();
        dsqp dsqpVar = (dsqp) bo.cu(5);
        dsqpVar.bC(bo);
        docn docnVar = (docn) dsqpVar;
        if (docgVar == null) {
            if (docnVar.c) {
                docnVar.bF();
                docnVar.c = false;
            }
            doco docoVar = (doco) docnVar.b;
            doco docoVar2 = doco.k;
            docoVar.d = null;
            docoVar.a &= -3;
        } else {
            if (docnVar.c) {
                docnVar.bF();
                docnVar.c = false;
            }
            doco docoVar3 = (doco) docnVar.b;
            doco docoVar4 = doco.k;
            docgVar.getClass();
            docoVar3.d = docgVar;
            docoVar3.a |= 2;
        }
        bw(docnVar);
    }

    public final docm bv() {
        docm docmVar = bo().i;
        return docmVar == null ? docm.i : docmVar;
    }

    public final void bw(docn docnVar) {
        dvyw h = h();
        dsqp dsqpVar = (dsqp) h.cu(5);
        dsqpVar.bC(h);
        dvya dvyaVar = (dvya) dsqpVar;
        dvxh bf = bf();
        dsqp dsqpVar2 = (dsqp) bf.cu(5);
        dsqpVar2.bC(bf);
        dvxc dvxcVar = (dvxc) dsqpVar2;
        if (dvyaVar.c) {
            dvyaVar.bF();
            dvyaVar.c = false;
        }
        dvyw dvywVar = (dvyw) dvyaVar.b;
        doco bK = docnVar.bK();
        dvyw dvywVar2 = dvyw.bv;
        bK.getClass();
        dvywVar.aU = bK;
        dvywVar.c |= Integer.MIN_VALUE;
        if (dvxcVar.c) {
            dvxcVar.bF();
            dvxcVar.c = false;
        }
        dvxh dvxhVar = (dvxh) dvxcVar.b;
        dvxh dvxhVar2 = dvxh.B;
        dvxhVar.d = null;
        dvxhVar.a &= -3;
        if (dvyaVar.c) {
            dvyaVar.bF();
            dvyaVar.c = false;
        }
        dvyw dvywVar3 = (dvyw) dvyaVar.b;
        dvxh dvxhVar3 = (dvxh) dvxcVar.bK();
        dvxhVar3.getClass();
        dvywVar3.z = dvxhVar3;
        dvywVar3.a |= 2097152;
        this.K = bvrt.b(dvyaVar.bK());
    }

    public final void bx(dmbq dmbqVar) {
        dvyw h = h();
        dsqp dsqpVar = (dsqp) h.cu(5);
        dsqpVar.bC(h);
        dvya dvyaVar = (dvya) dsqpVar;
        if (dvyaVar.c) {
            dvyaVar.bF();
            dvyaVar.c = false;
        }
        dvyw dvywVar = (dvyw) dvyaVar.b;
        dvyw dvywVar2 = dvyw.bv;
        dmbqVar.getClass();
        dvywVar.aV = dmbqVar;
        dvywVar.d |= 1;
        this.K = bvrt.b(dvyaVar.bK());
        this.A = null;
    }

    public final List<cdjd> by() {
        boolean z;
        if (this.ab == null) {
            doco bo = bo();
            this.ab = dcbg.b(bo.b).s(ill.a).z();
            if (bo().g && W().d > 0) {
                z = Boolean.TRUE.booleanValue();
            } else {
                z = bo.f;
            }
            this.w = Boolean.valueOf(z);
        }
        List<cdjd> list = this.ab;
        dbsk.s(list);
        return list;
    }

    public final List<dnoj> bz() {
        return h().K;
    }

    @Override // defpackage.ilg
    @dzsi
    public final Integer c() {
        if (b() != null) {
            return (aQ() || aR()) ? 2131231728 : null;
        }
        return null;
    }

    public final dglq cA() {
        dglq dglqVar = h().aH;
        return dglqVar == null ? dglq.d : dglqVar;
    }

    public final boolean cB() {
        return h().aM;
    }

    public final dhze cC() {
        return this.az.e((dssr) dhze.m.cu(7), dhze.m);
    }

    @dzsi
    public final cut cD() {
        return (cut) bvrt.f(this.ay, (dssr) cut.e.cu(7), null);
    }

    public final boolean cE() {
        cut cD = cD();
        return (cD == null || (cD.a & 1) == 0) ? false : true;
    }

    public final boolean cF() {
        cut cD = cD();
        if (cD != null) {
            djie djieVar = cD.b;
            if (djieVar == null) {
                djieVar = djie.k;
            }
            int a2 = djid.a(djieVar.j);
            if (a2 != 0 && a2 == 5) {
                return true;
            }
        }
        return false;
    }

    public final String cG() {
        return h().h;
    }

    public final dbsg<Float> cH() {
        if (this.av == null) {
            dqbi dqbiVar = h().bg;
            if (dqbiVar == null) {
                dqbiVar = dqbi.g;
            }
            if ((dqbiVar.a & 1) != 0) {
                dqbi dqbiVar2 = h().bg;
                if (dqbiVar2 == null) {
                    dqbiVar2 = dqbi.g;
                }
                this.av = Float.valueOf(dqbiVar2.b);
            }
        }
        return dbsg.j(this.av);
    }

    public final boolean cI() {
        return (h().d & 2048) != 0;
    }

    @dzsi
    public final dpoa cJ() {
        if (cI()) {
            dpoa dpoaVar = h().be;
            return dpoaVar == null ? dpoa.e : dpoaVar;
        }
        return null;
    }

    @dzsi
    public final dpml cK() {
        if ((h().b & 2) != 0) {
            dpml dpmlVar = h().O;
            if (dpmlVar == null) {
                dpmlVar = dpml.c;
            }
            if ((dpmlVar.a & 1) != 0) {
                return dpmlVar;
            }
        }
        return null;
    }

    public final boolean cL() {
        return (h().d & ImageMetadata.SHADING_MODE) != 0;
    }

    @dzsi
    public final dizx cM() {
        if (cL()) {
            dizx dizxVar = h().bm;
            return dizxVar == null ? dizx.d : dizxVar;
        }
        return null;
    }

    public final boolean cN() {
        return (h().d & 32) != 0;
    }

    @dzsi
    public final dpya cO() {
        if (cN()) {
            dpya dpyaVar = h().aZ;
            return dpyaVar == null ? dpya.c : dpyaVar;
        }
        return null;
    }

    public final String cP() {
        return bf().w;
    }

    public final String cQ() {
        dghy dghyVar = h().f;
        if (dghyVar == null) {
            dghyVar = dghy.e;
        }
        return dghyVar.d;
    }

    @dzsi
    public final String cR() {
        dnzt dnztVar = bf().s;
        if (dnztVar == null) {
            dnztVar = dnzt.e;
        }
        if ((dnztVar.a & 4) != 0) {
            return dnztVar.d;
        }
        return null;
    }

    public final dcdc<ilo> cS(boolean z) {
        dnnn dnnnVar;
        if (this.aB == null) {
            ArrayList arrayList = new ArrayList();
            dnng dnngVar = h().X;
            if (dnngVar == null) {
                dnngVar = dnng.r;
            }
            if (z) {
                dnnnVar = dnngVar.b;
                if (dnnnVar == null) {
                    dnnnVar = dnnn.l;
                }
            } else {
                dnnnVar = dnnn.l;
            }
            dndv dndvVar = dnngVar.o;
            if (dndvVar == null) {
                dndvVar = dndv.d;
            }
            for (dndt dndtVar : dndvVar.b) {
                ily ilyVar = new ily();
                drdg drdgVar = dndtVar.a;
                if (drdgVar == null) {
                    drdgVar = drdg.q;
                }
                ilyVar.w(drdgVar);
                dnnf bZ = dnng.r.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnng dnngVar2 = (dnng) bZ.b;
                dnnnVar.getClass();
                dnngVar2.b = dnnnVar;
                int i = dnngVar2.a | 32;
                dnngVar2.a = i;
                String str = dndtVar.c;
                str.getClass();
                dnngVar2.a = i | 8192;
                dnngVar2.d = str;
                ilyVar.m(bZ.bK());
                ilyVar.b.q = dndtVar.b;
                arrayList.add(ilyVar.d());
            }
            this.aB = dcdc.r(arrayList);
        }
        return this.aB;
    }

    public final dbsg<dggs> cT() {
        if ((h().c & 134217728) != 0) {
            dggs dggsVar = h().aQ;
            if (dggsVar == null) {
                dggsVar = dggs.b;
            }
            return dbsg.i(dggsVar);
        }
        return dbpy.a;
    }

    @dzsi
    public final dfyz cU() {
        if ((bf().a & 536870912) != 0) {
            dfyz dfyzVar = bf().A;
            return dfyzVar == null ? dfyz.f : dfyzVar;
        }
        return null;
    }

    public final dhld cV() {
        return this.aA.e((dssr) dhld.b.cu(7), dhld.b);
    }

    @dzsi
    public final dmmq cW() {
        return (dmmq) bvrt.f(this.aC, (dssr) dmmq.a.cu(7), null);
    }

    public final int cX() {
        if (ba()) {
            dopk dopkVar = h().L;
            if (dopkVar == null) {
                dopkVar = dopk.x;
            }
            if (dopkVar.j) {
                return 2;
            }
            int a2 = dpkh.a(dopkVar.i);
            return (a2 != 0 && a2 == 3) ? 2 : 3;
        }
        return this.aD;
    }

    public final cjtd ca() {
        ddes bZ;
        cjtd bZ2 = bZ();
        if (bZ2.k() != null) {
            ddet k = bZ2.k();
            dsqp dsqpVar = (dsqp) k.cu(5);
            dsqpVar.bC(k);
            bZ = (ddes) dsqpVar;
        } else {
            bZ = ddet.D.bZ();
        }
        cjta c2 = cjtd.c(bZ2);
        dkee b2 = dkee.b(h().bl);
        if (b2 == null) {
            b2 = dkee.UNKNOWN_VIEW_TYPE;
        }
        ddhb ddhbVar = ddhb.UNKNOWN;
        int ordinal = b2.ordinal();
        if (ordinal == 5) {
            ddhbVar = ddhb.DINING;
        } else if (ordinal == 6) {
            ddhbVar = ddhb.PARKING;
        } else if (ordinal == 7 || ordinal == 8) {
            ddhbVar = ddhb.HOTEL;
        }
        ddgz bZ3 = ddhc.b.bZ();
        bZ3.a(ddhbVar);
        ddhc bK = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddet ddetVar2 = ddet.D;
        bK.getClass();
        ddetVar.r = bK;
        ddetVar.a |= ImageMetadata.SHADING_MODE;
        c2.s(bZ.bK());
        return c2.d();
    }

    public final cjtd cb() {
        String bK;
        cjtd ca = ca();
        if ((aM() || aP()) && (bK = bK()) != null) {
            cjta c2 = cjtd.c(ca);
            ddji bZ = ddjj.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjj ddjjVar = (ddjj) bZ.b;
            bK.getClass();
            ddjjVar.a |= 1;
            ddjjVar.b = bK;
            c2.k(bZ.bK());
            return c2.d();
        }
        return ca;
    }

    public final dnqh cc(cjqm cjqmVar) {
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.ax.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        if (cjqmVar.a().a()) {
            String b2 = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b2.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b2;
        }
        return bZ.bK();
    }

    public final doaz cd() {
        doaz doazVar = h().Z;
        return doazVar == null ? doaz.k : doazVar;
    }

    public final doay ce() {
        doay b2 = doay.b(cd().b);
        return b2 == null ? doay.UNSUPPORTED : b2;
    }

    public final String cf() {
        dnnc dnncVar = cd().i;
        if (dnncVar == null) {
            dnncVar = dnnc.e;
        }
        return dbrz.f('\n').g(dnncVar.b);
    }

    public final String cg() {
        dodc dodcVar = cd().e;
        if (dodcVar == null) {
            dodcVar = dodc.i;
        }
        return dodcVar.b;
    }

    public final String ch() {
        dnzv dnzvVar = cd().f;
        if (dnzvVar == null) {
            dnzvVar = dnzv.b;
        }
        return dnzvVar.a;
    }

    public final String ci() {
        dntg dntgVar = cd().g;
        if (dntgVar == null) {
            dntgVar = dntg.b;
        }
        return dntgVar.a;
    }

    public final String cj() {
        dopm dopmVar = cd().h;
        if (dopmVar == null) {
            dopmVar = dopm.c;
        }
        return dopmVar.a;
    }

    public final String ck() {
        dnjb dnjbVar = cd().j;
        if (dnjbVar == null) {
            dnjbVar = dnjb.h;
        }
        return dnjbVar.a;
    }

    public final String cl() {
        dnjb dnjbVar = cd().j;
        if (dnjbVar == null) {
            dnjbVar = dnjb.h;
        }
        return dbrz.f('\n').g(dnjbVar.b);
    }

    public final String cm() {
        dnjb dnjbVar = cd().j;
        if (dnjbVar == null) {
            dnjbVar = dnjb.h;
        }
        return (String) dcft.r(dnjbVar.d, "");
    }

    public final String cn() {
        dnjb dnjbVar = cd().j;
        if (dnjbVar == null) {
            dnjbVar = dnjb.h;
        }
        return dnjbVar.e;
    }

    public final String co() {
        cp();
        return dbsj.e(this.as);
    }

    public final void cp() {
        if (this.ar) {
            return;
        }
        Iterator<dofj> it = bX().m.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dofj next = it.next();
            int a2 = dofe.a(next.c);
            if (a2 != 0 && a2 == 2) {
                dofi dofiVar = next.b;
                if (dofiVar == null) {
                    dofiVar = dofi.c;
                }
                String str = dofiVar.a;
                this.B = str;
                if (!dbsj.d(str)) {
                    dofi dofiVar2 = next.b;
                    if (dofiVar2 == null) {
                        dofiVar2 = dofi.c;
                    }
                    dofh dofhVar = dofiVar2.b;
                    if (dofhVar == null) {
                        dofhVar = dofh.b;
                    }
                    this.as = dofhVar.a;
                }
            }
        }
        if (this.B == null) {
            this.B = "";
        }
        if (this.as == null) {
            this.as = "";
        }
        this.ar = true;
    }

    public final blvw cq() {
        if (this.at == null) {
            dvyp dvypVar = h().ar;
            if (dvypVar == null) {
                dvypVar = dvyp.e;
            }
            this.at = new blvw(dvypVar);
        }
        return this.at;
    }

    public final boolean cr(@dzsi ilo iloVar) {
        if (iloVar == null) {
            return false;
        }
        alvj bL = bL();
        alvj bL2 = iloVar.bL();
        if (!(bL == null && bL2 == null) && !aO()) {
            return bL != null && bL.equals(bL2);
        } else if (!aU()) {
            return !iloVar.aU() && ai().c == iloVar.ai().c;
        } else if (!iloVar.aU()) {
            return false;
        } else {
            akqq aj = aj();
            akqq aj2 = iloVar.aj();
            if (aj == null || aj2 == null) {
                bvoo.h("One or both of placemarks with titles [%s], [%s] are missing both a feature id and a latlng.", n(), iloVar.n());
                return false;
            }
            return akqo.c(aj, aj2, 1.0E-6d);
        }
    }

    public final boolean cu() {
        dnio dnioVar = h().ax;
        if (dnioVar == null) {
            dnioVar = dnio.e;
        }
        return (dnioVar.a & 8) != 0;
    }

    public final int cv() {
        if (!cu()) {
            bvoo.h("The deviation time is undefined.", new Object[0]);
            return 0;
        }
        dnio dnioVar = h().ax;
        if (dnioVar == null) {
            dnioVar = dnio.e;
        }
        if ((dnioVar.a & 16) != 0) {
            dgas dgasVar = dnioVar.c;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            return dgasVar.b;
        }
        dgas dgasVar2 = dnioVar.b;
        if (dgasVar2 == null) {
            dgasVar2 = dgas.e;
        }
        return dgasVar2.b;
    }

    public final boolean cw() {
        dnio dnioVar = h().ax;
        if (dnioVar == null) {
            dnioVar = dnio.e;
        }
        return (dnioVar.a & 64) != 0;
    }

    @dzsi
    public final doav cx() {
        if ((h().c & 256) != 0) {
            doav doavVar = h().ay;
            return doavVar == null ? doav.f : doavVar;
        }
        return null;
    }

    @dzsi
    public final dobr cy() {
        if ((h().c & 32768) != 0) {
            dobr dobrVar = h().aF;
            return dobrVar == null ? dobr.g : dobrVar;
        }
        return null;
    }

    public final dpxf cz() {
        if ((h().c & 512) == 0) {
            return dpxf.f;
        }
        dpxf dpxfVar = h().az;
        return dpxfVar == null ? dpxf.f : dpxfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    @Override // defpackage.ilg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.amvh d() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilo.d():amvh");
    }

    @Override // defpackage.ilg
    public final boolean e() {
        return this.m;
    }

    public final ily f(ilo iloVar) {
        boolean z;
        ily g = g();
        g.M = iloVar.J;
        cjtd bY = iloVar.bY();
        if (bY != null && !bY.equals(bY())) {
            g.y = bY;
        }
        ikz ikzVar = iloVar.d;
        if (ikzVar != null) {
            g.g(ikzVar);
        }
        g.m = iloVar.m;
        g.j = iloVar.l;
        Long l = iloVar.C;
        if (l != null) {
            g.B = l;
        }
        g.n = iloVar.q;
        g.o = iloVar.r;
        if (iloVar.w()) {
            g.t = iloVar.q();
        }
        cut cD = iloVar.cD();
        if (iloVar.cE() && cD != null) {
            g.F = cD;
        }
        g.G = iloVar.D;
        akqq akqqVar = iloVar.E;
        if (akqqVar != null) {
            g.H = akqqVar;
        }
        g.h = iloVar.j;
        boolean z2 = true;
        if (iloVar.n) {
            g.k = true;
        }
        if (iloVar.o) {
            g.l = true;
        }
        dvyw h = iloVar.h();
        dvyw h2 = h();
        dsqp dsqpVar = (dsqp) h2.cu(5);
        dsqpVar.bC(h2);
        dvya dvyaVar = (dvya) dsqpVar;
        if (h.aL) {
            if (dvyaVar.c) {
                dvyaVar.bF();
                dvyaVar.c = false;
            }
            dvyw dvywVar = (dvyw) dvyaVar.b;
            dvywVar.c |= 8388608;
            dvywVar.aL = true;
            z = true;
        } else {
            z = false;
        }
        if ((h.b & 67108864) != 0) {
            if (dvyaVar.c) {
                dvyaVar.bF();
                dvyaVar.c = false;
            }
            ((dvyw) dvyaVar.b).o = dsqw.ck();
            if ((h.c & 4) != 0) {
                dvvy dvvyVar = h.as;
                if (dvvyVar == null) {
                    dvvyVar = dvvy.d;
                }
                if (dvyaVar.c) {
                    dvyaVar.bF();
                    dvyaVar.c = false;
                }
                dvyw dvywVar2 = (dvyw) dvyaVar.b;
                dvvyVar.getClass();
                dvywVar2.as = dvvyVar;
                dvywVar2.c |= 4;
            }
            if (!h.i.isEmpty()) {
                String str = h.i;
                if (dvyaVar.c) {
                    dvyaVar.bF();
                    dvyaVar.c = false;
                }
                dvyw dvywVar3 = (dvyw) dvyaVar.b;
                str.getClass();
                dvywVar3.a |= 16;
                dvywVar3.i = str;
            }
            if (h.o.size() > 0) {
                dsrj<String> dsrjVar = h.o;
                if (dvyaVar.c) {
                    dvyaVar.bF();
                    dvyaVar.c = false;
                }
                dvyw dvywVar4 = (dvyw) dvyaVar.b;
                dvywVar4.c();
                dsod.bv(dsrjVar, dvywVar4.o);
            }
        } else {
            z2 = z;
        }
        ilf ilfVar = iloVar.I;
        if (ilfVar != null) {
            g.L = ilfVar;
        }
        if (z2) {
            g.E(dvyaVar.bK());
        }
        doco bo = iloVar.bo();
        docg docgVar = bo.c;
        if (docgVar == null) {
            docgVar = docg.M;
        }
        docg docgVar2 = bo.d;
        if (docgVar2 == null) {
            docgVar2 = docg.M;
        }
        if (!docgVar.r.isEmpty()) {
            g.v(docgVar);
        }
        if (!docgVar2.r.isEmpty()) {
            g.u(docgVar2);
        }
        cdqb cdqbVar = (cdqb) iloVar.bn();
        dbsg<cdjd> b2 = cdqbVar.b.b();
        dbsg<cdjd> c2 = cdqbVar.b.c();
        cdqt bn = bn();
        if (b2.a()) {
            bn = bn.f(b2);
        }
        if (c2.a()) {
            bn = bn.g(c2);
        }
        if (c2.a() || b2.a()) {
            g.x(bn.d());
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [dccr, java.util.List] */
    public final ily g() {
        ily ilyVar = new ily();
        ilyVar.E(h());
        ilyVar.c = this.f;
        ilyVar.f = this.R;
        ilyVar.g = this.i;
        ilyVar.k = this.n;
        ilyVar.l = this.o;
        ilyVar.h = this.j;
        ilyVar.i = this.k;
        ilyVar.G(bvrt.d(this.S, new dccx(), (dssr) dvxl.e.cu(7), dvxl.e));
        ilyVar.j = this.l;
        ilyVar.m = this.m;
        ilyVar.u = this.M;
        ilyVar.v = this.N;
        ilyVar.w = this.O;
        ilyVar.z = this.p;
        ilyVar.x = this.P;
        ilyVar.A = this.e;
        ilyVar.e = this.h;
        ilyVar.C = this.F;
        ilyVar.n = this.q;
        ilyVar.o = this.r;
        ily.r = this.ax;
        ilyVar.s = this.G;
        ilyVar.D = cC();
        ilyVar.E = cV();
        ilyVar.G = this.D;
        ilyVar.I = this.s;
        ilyVar.M = this.J;
        ilyVar.p = this.t;
        ilyVar.q = this.u;
        ilyVar.J = this.v;
        ilyVar.K = cW();
        ikz ikzVar = this.d;
        if (ikzVar != null) {
            ilyVar.g(ikzVar);
        }
        String str = this.L;
        if (str != null) {
            ilyVar.t = str;
        }
        cjtd cjtdVar = this.T;
        if (cjtdVar != null) {
            ilyVar.y = cjtdVar;
        }
        ilo iloVar = this.g;
        if (iloVar != null) {
            ilyVar.d = iloVar;
        }
        Long l = this.C;
        if (l != null) {
            ilyVar.B = l;
        }
        cut cD = cD();
        if (cE() && cD != null) {
            ilyVar.F = cD;
        }
        akqq akqqVar = this.E;
        if (akqqVar != null) {
            ilyVar.H = akqqVar;
        }
        return ilyVar;
    }

    public final dvyw h() {
        return this.K.e((dssr) dvyw.bv.cu(7), dvyw.bv);
    }

    public final boolean i() {
        return this.g != null;
    }

    public final boolean j() {
        int a2;
        dvyw h = h();
        return (h == null || (a2 = dvwa.a(h.at)) == 0 || a2 != 3) ? false : true;
    }

    @dzsi
    public final dwca k() {
        for (dwca dwcaVar : h().aD) {
            int a2 = dwck.a(dwcaVar.b);
            if (a2 != 0 && a2 == 2 && dwcaVar.a.size() > 0) {
                return dwcaVar;
            }
        }
        return null;
    }

    public final boolean l() {
        return k() != null;
    }

    public final String m() {
        dwca k = k();
        dbsk.s(k);
        return k.a.get(0).d;
    }

    public final String n() {
        if (this.U == null) {
            this.U = h().i;
            akqq aj = aj();
            if (dbsj.d(this.U) && aj != null) {
                this.U = cZ(aj);
            }
        }
        String str = this.U;
        dbsk.s(str);
        return str;
    }

    public final boolean o() {
        return (aM() && !dbsj.d(this.U)) || !h().i.isEmpty();
    }

    public final dqdc p() {
        if (this.aw == null) {
            dqdc dqdcVar = h().n;
            if (dqdcVar == null) {
                dqdcVar = dqdc.c;
            }
            this.aw = dqdcVar;
        }
        return this.aw;
    }

    public final String q() {
        return !dbsj.d(this.L) ? this.L : !dbsj.d(n()) ? n() : "";
    }

    public final String r() {
        if (this.V == null) {
            this.V = h().j;
        }
        return this.V;
    }

    public final String s() {
        if (this.W == null) {
            this.W = h().k;
        }
        return this.W;
    }

    public final String t() {
        if (this.X == null) {
            this.X = h().l;
        }
        return this.X;
    }

    public final String toString() {
        String n = n();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(n.length() + 13 + String.valueOf(hexString).length());
        sb.append("Placemark [");
        sb.append(n);
        sb.append("]@");
        sb.append(hexString);
        return sb.toString();
    }

    public final Boolean u() {
        if (this.Y == null) {
            this.Y = Boolean.valueOf(h().m);
        }
        return this.Y;
    }

    public final String v() {
        return !dbsj.d(this.P) ? this.P : "";
    }

    public final boolean w() {
        return !dbsj.d(this.L);
    }

    public final boolean x() {
        return !dbsj.d(this.O);
    }

    public final String y() {
        return cY(true);
    }

    public final dcdc<String> z() {
        if (!dbsj.d(this.O)) {
            return dcdc.g(q(), this.O);
        }
        dccx dccxVar = new dccx();
        dccxVar.g(q());
        if (w() && !this.r) {
            dccxVar.g(n());
        }
        dccxVar.i(A());
        return dccxVar.f();
    }
}

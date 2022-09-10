package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bxko  reason: default package */
/* loaded from: classes4.dex */
public class bxko implements Serializable {
    private static final bxkn H = new bxkm();
    private boolean B;
    private dwjm F;
    private dwjm G;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private String N;
    private String O;
    private boolean P;
    @dzsi
    public akqq a;
    @dzsi
    public Serializable b;
    @dzsi
    public bwrs<brln> c;
    @dzsi
    public ddho d;
    public bxkn k;
    @dzsi
    private akqs p;
    @dzsi
    private bvrt<dovx> r;
    private bxla l = bxla.UNKNOWN;
    private String m = "";
    private String n = "";
    private String o = "";
    private boolean q = false;
    private boolean s = false;
    private boolean t = true;
    private boolean u = false;
    private boolean v = true;
    private int w = 1;
    private boolean x = false;
    private int y = 301989888;
    private int z = ImageMetadata.LENS_FILTER_DENSITY;
    private transient dcdc<bxmh> A = dcdc.e();
    private boolean C = false;
    private boolean D = false;
    public Boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = true;
    public boolean i = false;
    public boolean j = true;
    private final dbyv<String, String> E = dbyv.N();

    public bxko() {
        dwjm dwjmVar = dwjm.DEFAULT_SEARCH;
        this.F = dwjmVar;
        this.G = dwjmVar;
        this.k = H;
        this.I = false;
        this.J = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = "";
        this.O = "";
        this.P = true;
    }

    private final void af() {
        dovx l = l();
        if (l != null) {
            dovw ca = dovx.e.ca(l);
            int i = l.c;
            dpjq bZ = dpjx.n.bZ();
            String str = this.m;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjx dpjxVar = (dpjx) bZ.b;
            str.getClass();
            dpjxVar.a |= 1;
            dpjxVar.b = str;
            dpjx bK = bZ.bK();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dovx dovxVar = (dovx) ca.b;
            bK.getClass();
            dovxVar.b();
            dovxVar.b.set(i, bK);
            this.r = bvrt.b(ca.bK());
        }
    }

    private final synchronized dcdc<bxmh> ag() {
        dcdc<bxmh> dcdcVar = this.A;
        if (dcdcVar == null) {
            return dcdc.e();
        }
        return dcdcVar;
    }

    public final synchronized int A() {
        return this.z;
    }

    public final synchronized dcdc<bxmh> B() {
        return this.B ? ag() : dcdc.e();
    }

    public final synchronized void C(dcdc<bxmh> dcdcVar) {
        this.A = dcdcVar;
    }

    public final synchronized void D(boolean z) {
        this.B = z;
    }

    public final synchronized boolean E() {
        return this.C;
    }

    public final synchronized void F(boolean z) {
        this.C = z;
    }

    public final synchronized boolean G() {
        return this.D;
    }

    public final synchronized boolean H() {
        return this.q;
    }

    public final synchronized void I(boolean z) {
        this.q = z;
    }

    public final synchronized boolean J() {
        return this.I;
    }

    public final synchronized boolean K() {
        return this.J;
    }

    public final synchronized boolean L() {
        return this.K;
    }

    public final synchronized boolean M() {
        return this.L;
    }

    public final synchronized boolean N() {
        return this.M;
    }

    public final synchronized void O(boolean z) {
        this.M = z;
    }

    public final synchronized void P(String str, int i) {
        this.G = dwjm.STREET_NUMBER;
        this.N = str.substring(0, i);
        this.O = str.substring(i);
    }

    public final synchronized void Q() {
        this.G = this.F;
        this.N = "";
        this.O = "";
    }

    public final synchronized boolean R(String str) {
        if (this.G != dwjm.STREET_NUMBER) {
            return false;
        }
        if (str.startsWith(this.N)) {
            if (str.endsWith(this.O)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean S() {
        return this.G == dwjm.STREET_NUMBER;
    }

    public final synchronized boolean T() {
        return this.P;
    }

    public final synchronized void U() {
        this.v = false;
    }

    public final void V() {
        this.h = false;
    }

    public final synchronized void W() {
        this.z = 532481;
    }

    public final synchronized void X() {
        this.P = false;
    }

    public final synchronized void Y() {
        this.L = true;
    }

    public final synchronized void Z() {
        this.K = true;
    }

    public final synchronized void a(bxko bxkoVar) {
        if (this == bxkoVar) {
            return;
        }
        this.l = bxkoVar.l;
        this.m = bxkoVar.m;
        this.n = bxkoVar.n;
        this.o = bxkoVar.o;
        this.p = bxkoVar.p;
        this.r = bxkoVar.r;
        this.s = bxkoVar.s;
        this.t = bxkoVar.t;
        this.u = bxkoVar.u;
        this.q = bxkoVar.q;
        this.v = bxkoVar.v;
        this.w = bxkoVar.w;
        this.x = bxkoVar.x;
        this.y = bxkoVar.y;
        this.z = bxkoVar.z;
        this.A = bxkoVar.A;
        this.B = bxkoVar.B;
        this.b = bxkoVar.b;
        this.C = bxkoVar.C;
        this.D = bxkoVar.D;
        this.d = bxkoVar.d;
        this.c = bxkoVar.c;
        this.e = bxkoVar.e;
        this.f = bxkoVar.f;
        this.g = bxkoVar.g;
        this.h = bxkoVar.h;
        this.j = bxkoVar.j;
        this.a = bxkoVar.a;
        this.k = bxkoVar.k;
        this.F = bxkoVar.F;
        this.G = bxkoVar.G;
        this.i = bxkoVar.i;
        this.I = bxkoVar.I;
        this.J = bxkoVar.J;
        this.K = bxkoVar.K;
        this.L = bxkoVar.L;
        this.M = bxkoVar.M;
        this.N = bxkoVar.N;
        this.O = bxkoVar.O;
        this.P = bxkoVar.P;
        this.E.p();
        this.E.H(bxkoVar.E);
    }

    public final synchronized void aa() {
        this.I = true;
    }

    public final synchronized void ab() {
        this.J = false;
    }

    public final synchronized void ac() {
        this.u = true;
    }

    public final synchronized void ad() {
        this.x = true;
    }

    public final synchronized void ae() {
        this.D = true;
    }

    public final synchronized bxla b() {
        return this.l;
    }

    public final synchronized void c(bxla bxlaVar) {
        this.l = bxlaVar;
    }

    public final synchronized String d() {
        return this.m;
    }

    public final synchronized void e(@dzsi String str) {
        this.m = dbsj.e(str);
        af();
    }

    public final synchronized String f() {
        return this.n;
    }

    public final synchronized void g(@dzsi String str) {
        this.n = dbsj.e(str);
    }

    public final synchronized String h() {
        return this.o;
    }

    public final synchronized void i(@dzsi String str) {
        this.o = dbsj.e(str);
    }

    @dzsi
    public final synchronized akqs j() {
        return this.p;
    }

    public final synchronized void k(@dzsi akqs akqsVar) {
        this.p = akqsVar;
    }

    @dzsi
    public final synchronized dovx l() {
        return (dovx) bvrt.f(this.r, (dssr) dovx.e.cu(7), dovx.e);
    }

    public final synchronized void m(dovx dovxVar) {
        this.r = bvrt.b(dovxVar);
        af();
    }

    public final synchronized dwjm n() {
        return this.G;
    }

    public final synchronized void o(dwjm dwjmVar) {
        boolean z = true;
        dbsk.b(dwjmVar != dwjm.STREET_NUMBER, "For setting suggestMode to STREET_NUMBER, use startStreetNumberEditingMode() instead.");
        if (this.G == dwjm.STREET_NUMBER) {
            z = false;
        }
        dbsk.b(z, "Suggest is in STREET_NUMBER mode. For exiting, use endStreetNumberEditingMode() instead.");
        this.F = dwjmVar;
        this.G = dwjmVar;
    }

    public final synchronized boolean p() {
        return this.s;
    }

    public final synchronized void q(boolean z) {
        this.s = z;
    }

    public final synchronized boolean r() {
        return this.t;
    }

    public final synchronized void s(boolean z) {
        this.t = z;
    }

    public final synchronized boolean t() {
        return this.u;
    }

    public final synchronized String toString() {
        dbsb b;
        b = dbsc.b(this);
        b.b("source", this.l);
        b.b("query", this.m);
        b.b("hintText", this.n);
        b.b("chooseOnMapHintText", this.o);
        b.b("viewportBounds", this.p);
        b.b("directionsSuggestionContext", this.r);
        b.h("allowEmptyQuery", this.s);
        b.h("canSubmitQuery", this.t);
        b.h("showSuggestionsForEmptyQuery", this.u);
        b.h("allowOfflineOnboardingPromoForEmptySuggestions", this.v);
        b.f("keyboardTransition", this.w);
        b.h("isSlideFullScreenViewAnimationEnabled", this.x);
        b.f("imeOptions", this.y);
        b.f("inputType", this.z);
        b.b("suggestions", this.A);
        b.h("suggestionsVisible", this.B);
        b.b("callbackObject", this.b);
        b.h("searchboxLoggingEnabled", this.C);
        b.h("suggestionClickFingerprintLoggingEnabled", this.D);
        b.b("queryTextBoxVeType", this.d);
        b.b("searchRequest", this.c);
        b.b("queryUpdated", this.e);
        b.h("allowAddAPlaceSuggestion", this.f);
        b.h("allowChooseOnMapSuggestion", this.g);
        b.h("allowPlaceListSuggestion", this.h);
        b.h("openPlacesheet", this.j);
        b.b("suggestionLayoutSupplier", this.k);
        b.b("initialSuggestMode", this.F);
        b.b("suggestMode", this.G);
        b.h("allowRefinementSuggestions", this.i);
        b.b("restrictions", this.E);
        b.h("showSuggestionsFromSnapToPlace", this.q);
        b.b("snapToPlaceCenter", this.a);
        b.h("shouldShowGdprMessage", this.I);
        b.h("shouldShowSearchForQuerySuggestion", this.J);
        b.h("shouldShowEventSearchForQuerySuggestion", this.K);
        b.h("shouldPrioritizeEventSearchForQuerySuggestion", this.L);
        b.h("isFromPointPicker", this.M);
        b.b("streetNumberQueryPrefix", this.N);
        b.b("streetNumberQuerySuffix", this.O);
        b.h("shouldAdjustInsetsBeforeHidingKeyboard", this.P);
        return b.toString();
    }

    public final synchronized boolean u() {
        return this.v;
    }

    public final synchronized int v() {
        return this.w;
    }

    public final synchronized void w(int i) {
        this.w = i;
    }

    public final synchronized boolean x() {
        return this.x;
    }

    public final synchronized int y() {
        return this.y;
    }

    public final synchronized void z(int i) {
        this.y = i;
    }
}

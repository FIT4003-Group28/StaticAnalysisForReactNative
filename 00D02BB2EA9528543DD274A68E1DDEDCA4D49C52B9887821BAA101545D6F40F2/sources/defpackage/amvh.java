package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: amvh  reason: default package */
/* loaded from: classes2.dex */
public class amvh implements Serializable {
    private static final dcqe E = dcqe.c("amvh");
    public static final amvh a = new amvg().a();
    private static final long serialVersionUID = -4214931763525554255L;
    @dzsi
    public final Boolean A;
    @dzsi
    public akqq B;
    @dzsi
    public final bvrt<dnjf> C;
    @dzsi
    public final bvrt<dnwx> D;
    private final byte[] F;
    private final byte[] G;
    public final dpjs b;
    @dzsi
    public final String c;
    @dzsi
    public final akqi d;
    @dzsi
    public final akqq e;
    @dzsi
    public final String f;
    public final boolean g;
    public final boolean h;
    public final int i;
    @dzsi
    public final altv j;
    @dzsi
    public final String k;
    public final boolean l;
    public final dntm m;
    @dzsi
    public final bvrt<dpbl> n;
    @dzsi
    public final bvrt<dpbj> o;
    @dzsi
    public final bvrt<dpju> p;
    public final dcdc<bvrt<dpce>> q;
    @dzsi
    public final String r;
    @dzsi
    public final bvrt<dpjl> s;
    @dzsi
    public final bvrt<dosw> t;
    public final boolean u;
    @dzsi
    public final String v;
    @dzsi
    public final String w;
    @dzsi
    public final bvrt<dpke> x;
    public final boolean y;
    public final boolean z;

    public amvh(amvg amvgVar) {
        dpjs dpjsVar = amvgVar.a;
        dbsk.s(dpjsVar);
        this.b = dpjsVar;
        this.c = amvgVar.b;
        this.d = amvgVar.c;
        this.e = amvgVar.d;
        String str = amvgVar.e;
        this.f = null;
        this.g = amvgVar.f;
        boolean z = amvgVar.g;
        this.h = false;
        this.i = amvgVar.h;
        this.j = amvgVar.i;
        this.k = amvgVar.j;
        this.l = amvgVar.k;
        this.m = amvgVar.l;
        this.n = bvrt.a(amvgVar.m);
        this.o = bvrt.a(amvgVar.n);
        dcdc<bvrt<dpce>> dcdcVar = amvgVar.o;
        dbsk.s(dcdcVar);
        this.q = dcdcVar;
        dspd dspdVar = amvgVar.p;
        dbsk.s(dspdVar);
        this.F = dspdVar.G();
        dspd dspdVar2 = amvgVar.q;
        dbsk.s(dspdVar2);
        this.G = dspdVar2.G();
        this.r = amvgVar.r;
        this.s = bvrt.a(amvgVar.s);
        this.t = bvrt.a(amvgVar.t);
        this.u = amvgVar.u;
        this.v = amvgVar.v;
        this.w = amvgVar.w;
        this.x = bvrt.a(amvgVar.x);
        this.y = amvgVar.y;
        this.B = amvgVar.A;
        this.z = amvgVar.z;
        this.A = amvgVar.B;
        this.C = bvrt.a(amvgVar.C);
        this.D = bvrt.a(amvgVar.D);
        this.p = bvrt.a(amvgVar.E);
    }

    public static amvh L(dwjj dwjjVar, Context context) {
        amvg amvgVar;
        if ((dwjjVar.a & 128) != 0) {
            dpjx dpjxVar = dwjjVar.h;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            amvgVar = S(dpjxVar, context);
        } else {
            amvgVar = new amvg();
            dxbp dxbpVar = dwjjVar.b;
            if (dxbpVar == null) {
                dxbpVar = dxbp.x;
            }
            amvgVar.b = dxbpVar.b;
            dxbp dxbpVar2 = dwjjVar.b;
            if (dxbpVar2 == null) {
                dxbpVar2 = dxbp.x;
            }
            amvgVar.j = dxbpVar2.c;
            amvgVar.c(dwjjVar.d);
        }
        if (amvgVar == null) {
            amvgVar = P();
        }
        dxbp dxbpVar3 = dwjjVar.b;
        if (dxbpVar3 == null) {
            dxbpVar3 = dxbp.x;
        }
        int a2 = dxbg.a(dxbpVar3.s);
        boolean z = false;
        if (a2 != 0 && a2 == 2) {
            z = true;
        }
        amvgVar.z = z;
        return amvgVar.a();
    }

    public static amvh M(dpjx dpjxVar, Context context) {
        amvg S = S(dpjxVar, context);
        return S == null ? a : S.a();
    }

    public static amvh N(dpjx dpjxVar) {
        amvg amvgVar = new amvg(O(dpjxVar));
        amvgVar.y = true;
        return amvgVar.a();
    }

    public static amvh O(dpjx dpjxVar) {
        amvg T = T(dpjxVar);
        return T == null ? a : T.a();
    }

    public static amvg P() {
        return new amvg();
    }

    @dzsi
    private static amvg Q(Context context, @dzsi akqq akqqVar) {
        if (context == null) {
            bvoo.h("Null context comes", new Object[0]);
            return null;
        }
        return R(context.getString(R.string.DIRECTIONS_YOUR_LOCATION), akqqVar);
    }

    private static amvg R(@dzsi String str, @dzsi akqq akqqVar) {
        amvg amvgVar = new amvg();
        amvgVar.a = dpjs.ENTITY_TYPE_MY_LOCATION;
        amvgVar.j = str;
        amvgVar.d = akqqVar;
        return amvgVar;
    }

    @dzsi
    private static amvg S(dpjx dpjxVar, Context context) {
        int a2;
        dpjs b = dpjs.b(dpjxVar.f);
        if (b == null) {
            b = dpjs.ENTITY_TYPE_DEFAULT;
        }
        if (b != dpjs.ENTITY_TYPE_MY_LOCATION || (a2 = dpjw.a(dpjxVar.g)) == 0 || a2 != 5) {
            return T(dpjxVar);
        }
        int i = dpjxVar.a;
        if ((32768 & i) != 0) {
            return j(dpjxVar.e, null, dpjxVar.j);
        }
        if ((i & 4) != 0) {
            dnoh dnohVar = dpjxVar.d;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            return Q(context, akqq.e(dnohVar));
        }
        return Q(context, null);
    }

    @dzsi
    private static amvg T(dpjx dpjxVar) {
        int a2;
        dpjs b = dpjs.b(dpjxVar.f);
        if (b == null) {
            b = dpjs.ENTITY_TYPE_DEFAULT;
        }
        boolean z = true;
        boolean z2 = false;
        dbsk.b((b == dpjs.ENTITY_TYPE_MY_LOCATION && (a2 = dpjw.a(dpjxVar.g)) != 0 && a2 == 5) ? false : true, "Waypoint is for user location.");
        amvg amvgVar = new amvg();
        int i = dpjxVar.a;
        if ((i & 1) != 0) {
            amvgVar.b = dpjxVar.b;
            z = false;
        }
        if ((i & 2) != 0 && !dpjxVar.c.isEmpty()) {
            amvgVar.c = akqi.b(dpjxVar.c);
            z = false;
        }
        if ((dpjxVar.a & 4) != 0) {
            dnoh dnohVar = dpjxVar.d;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            amvgVar.d = akqq.e(dnohVar);
            z = false;
        }
        if ((dpjxVar.a & 1024) != 0) {
            dnfi dnfiVar = dpjxVar.h;
            if (dnfiVar == null) {
                dnfiVar = dnfi.d;
            }
            amvgVar.i = altv.c(dnfiVar);
            z = false;
        }
        if ((dpjxVar.a & 8192) != 0) {
            amvgVar.c(dspd.B(dpjxVar.i));
            z = false;
        }
        int i2 = dpjxVar.a;
        if ((i2 & 128) != 0) {
            amvgVar.j = dpjxVar.e;
            z = false;
        } else {
            amvgVar.k = false;
        }
        if ((i2 & 256) != 0) {
            dpjs b2 = dpjs.b(dpjxVar.f);
            if (b2 == null) {
                b2 = dpjs.ENTITY_TYPE_DEFAULT;
            }
            if (b2 != dpjs.ENTITY_TYPE_DEFAULT) {
                z = false;
            }
        }
        dpjs b3 = dpjs.b(dpjxVar.f);
        if (b3 == null) {
            b3 = dpjs.ENTITY_TYPE_DEFAULT;
        }
        amvgVar.a = b3;
        if ((dpjxVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            dpbj dpbjVar = dpjxVar.k;
            if (dpbjVar == null) {
                dpbjVar = dpbj.c;
            }
            amvgVar.n = dpbjVar;
        } else {
            z2 = z;
        }
        if ((dpjxVar.a & 131072) != 0) {
            amvgVar.B = Boolean.valueOf(dpjxVar.l);
        } else if (z2) {
            return null;
        }
        return amvgVar;
    }

    public static amvh g(Context context, @dzsi akqq akqqVar) {
        amvg Q = Q(context, akqqVar);
        return Q == null ? a : Q.a();
    }

    public static amvh h(@dzsi String str, @dzsi akqq akqqVar) {
        return R(str, akqqVar).a();
    }

    public static amvh i(Context context) {
        return g(context, null);
    }

    public static amvg j(String str, @dzsi List<dpce> list, String str2) {
        amvg amvgVar = new amvg();
        amvgVar.a = dpjs.ENTITY_TYPE_MY_LOCATION;
        amvgVar.j = str;
        amvgVar.k = true;
        amvgVar.b(list);
        amvgVar.r = str2;
        return amvgVar;
    }

    public final dcdc<dpce> A() {
        return (dcdc) bvrt.d(this.q, new dccx(), (dssr) dpce.f.cu(7), dpce.f);
    }

    public final dspd B() {
        return dspd.x(this.F);
    }

    public final dspd C() {
        return dspd.x(this.G);
    }

    public final boolean D() {
        return this.r != null;
    }

    @dzsi
    public final dpjl E() {
        return (dpjl) bvrt.f(this.s, (dssr) dpjl.i.cu(7), dpjl.i);
    }

    @dzsi
    public final dosw F() {
        return (dosw) bvrt.f(this.t, (dssr) dosw.f.cu(7), dosw.f);
    }

    @dzsi
    public final dnjf G() {
        return (dnjf) bvrt.f(this.C, (dssr) dnjf.d.cu(7), dnjf.d);
    }

    @dzsi
    public final dpju H() {
        return (dpju) bvrt.f(this.p, (dssr) dpju.a.cu(7), dpju.a);
    }

    public final dpjx I() {
        dpjq bZ = dpjx.n.bZ();
        akqq akqqVar = this.e;
        int i = 4;
        if (k()) {
            dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjx dpjxVar = (dpjx) bZ.b;
            dpjxVar.f = dpjsVar.h;
            dpjxVar.a |= 256;
            dpjx dpjxVar2 = (dpjx) bZ.b;
            dpjxVar2.g = 4;
            int i2 = dpjxVar2.a | 512;
            dpjxVar2.a = i2;
            String str = this.r;
            if (str != null) {
                str.getClass();
                dpjxVar2.a = i2 | 32768;
                dpjxVar2.j = str;
            }
        } else if (!m() && akqqVar != null) {
            dnoh g = akqqVar.g();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjx dpjxVar3 = (dpjx) bZ.b;
            g.getClass();
            dpjxVar3.d = g;
            dpjxVar3.a |= 4;
            String str2 = this.k;
            if (this.b == dpjs.ENTITY_TYPE_NICKNAME && !dbsj.d(str2)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpjx dpjxVar4 = (dpjx) bZ.b;
                dpjxVar4.g = 3;
                int i3 = dpjxVar4.a | 512;
                dpjxVar4.a = i3;
                if (str2 != null) {
                    str2.getClass();
                    dpjxVar4.a = i3 | 128;
                    dpjxVar4.e = str2;
                }
            } else {
                if (this.g) {
                    i = 3;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpjx dpjxVar5 = (dpjx) bZ.b;
                dpjxVar5.g = i - 1;
                dpjxVar5.a |= 512;
            }
            dpjs dpjsVar2 = this.b;
            dpjx dpjxVar6 = (dpjx) bZ.b;
            dpjxVar6.f = dpjsVar2.h;
            dpjxVar6.a |= 256;
        } else {
            String str3 = this.c;
            if (str3 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpjx dpjxVar7 = (dpjx) bZ.b;
                str3.getClass();
                dpjxVar7.a |= 1;
                dpjxVar7.b = str3;
            }
            if (m()) {
                String o = this.d.o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpjx dpjxVar8 = (dpjx) bZ.b;
                o.getClass();
                dpjxVar8.a |= 2;
                dpjxVar8.c = o;
            }
            if (akqqVar != null) {
                dnoh g2 = akqqVar.g();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpjx dpjxVar9 = (dpjx) bZ.b;
                g2.getClass();
                dpjxVar9.d = g2;
                dpjxVar9.a |= 4;
            }
            altv altvVar = this.j;
            if (altvVar != null) {
                dnfh bZ2 = dnfi.d.bZ();
                String o2 = altvVar.a.o();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnfi dnfiVar = (dnfi) bZ2.b;
                o2.getClass();
                int i4 = dnfiVar.a | 1;
                dnfiVar.a = i4;
                dnfiVar.b = o2;
                int i5 = altvVar.b;
                if (i5 != Integer.MIN_VALUE) {
                    dnfiVar.a = i4 | 2;
                    dnfiVar.c = i5 * 0.001f;
                }
                dnfi bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpjx dpjxVar10 = (dpjx) bZ.b;
                bK.getClass();
                dpjxVar10.h = bK;
                dpjxVar10.a |= 1024;
            }
            String str4 = this.k;
            if (this.b == dpjs.ENTITY_TYPE_NICKNAME && !dbsj.d(str4)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpjx dpjxVar11 = (dpjx) bZ.b;
                str4.getClass();
                dpjxVar11.a |= 128;
                dpjxVar11.e = str4;
            }
            dpjs dpjsVar3 = this.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjx dpjxVar12 = (dpjx) bZ.b;
            dpjxVar12.f = dpjsVar3.h;
            dpjxVar12.a |= 256;
            dspd B = B();
            if (!B.u()) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpjx dpjxVar13 = (dpjx) bZ.b;
                dpjxVar13.i = B.J();
                dpjxVar13.a |= 8192;
            }
        }
        if (y()) {
            dpbj z = z();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjx dpjxVar14 = (dpjx) bZ.b;
            z.getClass();
            dpjxVar14.k = z;
            dpjxVar14.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        Boolean bool = this.A;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjx dpjxVar15 = (dpjx) bZ.b;
            dpjxVar15.a |= 131072;
            dpjxVar15.l = booleanValue;
        }
        dpju H = H();
        if (H != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjx dpjxVar16 = (dpjx) bZ.b;
            H.getClass();
            dpjxVar16.m = H;
            dpjxVar16.a |= 262144;
        }
        return bZ.bK();
    }

    public final boolean J() {
        return !c() && amvj.h(this.b);
    }

    public final dbsi<amvh, Boolean> K(EnumMap<dpjs, azva> enumMap) {
        if (!J() || !enumMap.containsKey(this.b)) {
            return dbsi.a(this, false);
        }
        azva azvaVar = enumMap.get(this.b);
        amvg amvgVar = new amvg(this);
        amvgVar.b = azvaVar.d;
        amvgVar.c = azvaVar.c;
        amvgVar.d = azvaVar.e;
        return dbsi.a(amvgVar.a(), true);
    }

    public final boolean a() {
        return equals(a);
    }

    @dzsi
    public final dpke b() {
        return (dpke) bvrt.f(this.x, (dssr) dpke.f.cu(7), dpke.f);
    }

    public final boolean c() {
        return !dbsj.d(this.c) || m() || n() || D();
    }

    public final boolean d(amvh amvhVar) {
        return (k() && amvhVar.k()) || equals(amvhVar);
    }

    public final boolean e(amvh amvhVar, double d) {
        if (!m() || !amvhVar.m() || !this.d.p(amvhVar.d)) {
            return akqq.v(this.e, amvhVar.e, d);
        }
        return true;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof amvh) {
            amvh amvhVar = (amvh) obj;
            if (this.b == amvhVar.b && dbsd.a(this.c, amvhVar.c) && dbsd.a(this.d, amvhVar.d) && dbsd.a(this.e, amvhVar.e)) {
                String str = amvhVar.f;
                if (dbsd.a(null, null)) {
                    boolean z = amvhVar.h;
                    if (dbsd.a(false, false) && this.i == amvhVar.i && dbsd.a(this.j, amvhVar.j) && dbsd.a(this.k, amvhVar.k) && this.l == amvhVar.l && dbsd.a(this.q, amvhVar.q) && Arrays.equals(this.F, amvhVar.F) && Arrays.equals(this.G, amvhVar.G) && dbsd.a(this.r, amvhVar.r) && dbsd.a(this.s, amvhVar.s) && this.u == amvhVar.u && dbsd.a(this.v, amvhVar.v) && dbsd.a(this.w, amvhVar.w) && dbsd.a(Boolean.valueOf(this.y), Boolean.valueOf(amvhVar.y)) && dbsd.a(Boolean.valueOf(this.z), Boolean.valueOf(amvhVar.z)) && dbsd.a(this.o, amvhVar.o) && dbsd.a(this.C, amvhVar.C) && dbsd.a(this.D, amvhVar.D) && dbsd.a(this.p, amvhVar.p)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(amvh amvhVar) {
        akqq akqqVar = this.B;
        if (akqqVar == null || !dbsd.a(akqqVar, amvhVar.B)) {
            return this.b == amvhVar.b && dbsd.a(this.c, amvhVar.c) && dbsd.a(this.d, amvhVar.d) && dbsd.a(this.e, amvhVar.e) && dbsd.a(this.j, amvhVar.j) && dbsd.a(this.k, amvhVar.k) && dbsd.a(this.q, amvhVar.q) && Arrays.equals(this.F, amvhVar.F) && Arrays.equals(this.G, amvhVar.G) && dbsd.a(this.r, amvhVar.r) && this.u == amvhVar.u && dbsd.a(this.o, amvhVar.o) && this.y == amvhVar.y && this.z == amvhVar.z && dbsd.a(this.A, amvhVar.A) && dbsd.a(this.C, amvhVar.C);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, null, false, Integer.valueOf(this.i), this.j, this.k, Boolean.valueOf(this.l), this.q, Integer.valueOf(Arrays.hashCode(this.F)), Integer.valueOf(Arrays.hashCode(this.G)), this.r, this.s, Boolean.valueOf(this.u), this.v, this.w, Boolean.valueOf(this.y), Boolean.valueOf(this.z), this.o, this.C, this.D, this.p});
    }

    public final boolean k() {
        return this.b == dpjs.ENTITY_TYPE_MY_LOCATION;
    }

    public final boolean l() {
        return this.c != null;
    }

    public final boolean m() {
        return akqi.d(this.d);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final String o() {
        if (!this.l || dbsj.d(this.k)) {
            return !dbsj.d(this.c) ? this.c : "";
        }
        return this.k;
    }

    public final String p() {
        return q(true);
    }

    public final String q(boolean z) {
        if (!dbsj.d(this.k)) {
            return this.k;
        }
        if (!dbsj.d(this.c)) {
            return this.c;
        }
        akqq akqqVar = this.e;
        return (akqqVar == null || !z) ? "" : akqqVar.a();
    }

    public final String r(Resources resources, boolean z) {
        String v = v(resources);
        return v != null ? v : q(z);
    }

    public final String s(Resources resources) {
        return t(resources, true);
    }

    public final String t(Resources resources, boolean z) {
        String v = v(resources);
        if (v != null) {
            return v;
        }
        String u = u();
        return u != null ? u : q(z);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.c();
        b.b("entityType", this.b);
        b.b("query", this.c);
        b.b("featureId", this.d);
        b.b("position", this.e);
        b.b("placeId", null);
        b.h("preferSameSideOfRoad", false);
        b.f("preferredSegmentHeading", this.i);
        b.b("level", this.j);
        b.b("text", this.k);
        b.h("textIsFixed", this.l);
        b.b("renderables", alcf.s(A()));
        b.b("suggestSearchContext", B().J());
        b.b("searchRequestTemplate", C().J());
        b.b("boardedTransitVehicleToken", this.r);
        b.b("alert", this.s);
        b.h("shouldSkipOdelayDirectionsCache", this.u);
        b.b("parkingDifficulty", this.m);
        b.b("parkingPlanner", this.n);
        b.b("ei", this.v);
        b.b("ved", this.w);
        b.h("isParking", this.y);
        b.h("isTransitStation", this.z);
        b.b("evInfo", this.C);
        if (y()) {
            b.b("parkingOptions", z().toString());
        }
        dpju H = H();
        if (H != null) {
            b.b("locationFilters", H.toString());
        }
        return b.toString();
    }

    @dzsi
    public final String u() {
        dosw F = F();
        if (F != null) {
            int i = F.a;
            if ((i & 1) != 0) {
                return F.c;
            }
            if ((i & 4) == 0) {
                return null;
            }
            return F.e;
        }
        return null;
    }

    @dzsi
    public final String v(Resources resources) {
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        int ordinal = this.b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 5 || dbsj.d(this.k)) {
                    return null;
                }
                return this.k;
            }
            return resources.getString(R.string.WORK_LOCATION);
        }
        return resources.getString(R.string.HOME_LOCATION);
    }

    @dzsi
    public final String w() {
        if (this.b == dpjs.ENTITY_TYPE_MY_LOCATION) {
            akqq akqqVar = this.e;
            if (akqqVar == null) {
                return null;
            }
            String a2 = akqqVar.a();
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2);
            sb.append("(");
            sb.append(a2);
            sb.append(")");
            return sb.toString();
        }
        return p();
    }

    @dzsi
    public final dpbl x() {
        return (dpbl) bvrt.f(this.n, (dssr) dpbl.d.cu(7), dpbl.d);
    }

    public final boolean y() {
        return this.o != null;
    }

    @dzsi
    public final dpbj z() {
        return (dpbj) bvrt.f(this.o, (dssr) dpbj.c.cu(7), dpbj.c);
    }
}

package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nqu  reason: default package */
/* loaded from: classes7.dex */
public final class nqu {
    private static final dcqe c = dcqe.c("nqu");
    public final bvjj a;
    public final aufe b;

    public nqu(bvjj bvjjVar, aufe aufeVar) {
        this.a = bvjjVar;
        this.b = aufeVar;
    }

    public static cqtd A() {
        return aG(R.raw.car_only_ic_expand_less_36dp);
    }

    public static cqtd B() {
        return aG(R.raw.car_only_ic_refresh_36dp);
    }

    public static cqtd C() {
        return aG(R.raw.car_only_ic_place_36dp);
    }

    public static cqtd D() {
        return aG(R.raw.car_only_ic_search_36dp);
    }

    public static cqtd E() {
        return aE(R.raw.car_only_ic_home_36dp, nql.u);
    }

    public static cqtd F() {
        return aE(R.raw.car_only_ic_work_36dp, nql.u);
    }

    public static cqtd G() {
        return aE(R.raw.car_only_ic_time_36dp, nql.v);
    }

    public static cqtd H() {
        return aG(R.raw.car_only_ic_navigate_36dp);
    }

    public static cqtd I() {
        return aK(R.raw.car_only_ic_navigate_36dp);
    }

    public static cqtd J() {
        return aK(R.raw.car_only_ic_add_place_36dp);
    }

    public static cqtd K() {
        return aG(R.raw.car_only_ic_alternate_routes_36dp);
    }

    public static cqtd L() {
        return aG(R.raw.car_only_ic_zoom_in_36dp);
    }

    public static cqtd M() {
        return aG(R.raw.car_only_ic_zoom_out_36dp);
    }

    public static cqtd N() {
        return aH(R.raw.car_only_ic_alternate_routes_36dp, nql.bp);
    }

    public static cqtd O() {
        return aH(R.raw.car_only_ic_place_36dp, nql.bp);
    }

    public static cqtd P() {
        return aG(R.raw.car_only_ic_remove_stop_36dp);
    }

    public static cqtd Q() {
        return aH(R.raw.car_only_ic_search_36dp, nql.bp);
    }

    public static cqtd R() {
        return aH(R.raw.car_only_ic_share_location_36dp, nql.bp);
    }

    public static cqtd S() {
        return aK(R.raw.car_only_ic_share_location_36dp);
    }

    public static cqtd T() {
        return aJ(R.drawable.car_only_icon_border_3dp, nql.bp);
    }

    @dzsi
    public static cqtd U() {
        return ar(4091);
    }

    public static cqtd V() {
        return aI(R.raw.car_only_ic_favorite_place_circle_48dp, nql.q, nqo.x, nqo.y);
    }

    @dzsi
    public static cqtd W() {
        return ar(49);
    }

    public static cqtd X() {
        return iut.a(aI(R.raw.car_only_ic_labeled_place_circle_48dp, nql.r, nqo.x, nqo.y));
    }

    public static iuw Y() {
        return aF(R.raw.car_only_ic_star_rating_20dp, nql.ac);
    }

    @dzsi
    public static cqtd Z() {
        return ar(4);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> a(Boolean bool) {
        return k(bool, aY(cqrp.d(dcyn.a)), r());
    }

    public static cqtd aB(int i, cqss cqssVar) {
        return aC(i, cqssVar, nqo.v, nqo.w);
    }

    public static cqtd aC(int i, cqss cqssVar, @dzsi cqtv cqtvVar, @dzsi cqtv cqtvVar2) {
        return cqrt.j(iup.f(i, cqtvVar, cqtvVar2), cqssVar);
    }

    public static iuw aD(int i, iuv iuvVar, iuv iuvVar2) {
        return iva.e(bc(i, iuvVar.a, iuvVar2.a), bc(i, iuvVar.b, iuvVar2.b));
    }

    public static iuw aE(int i, iuv iuvVar) {
        return aI(i, iuvVar, nqo.z, nqo.A);
    }

    public static iuw aF(int i, iuv iuvVar) {
        return aI(i, iuvVar, nqo.D, nqo.E);
    }

    public static iuw aG(int i) {
        return aH(i, nql.c);
    }

    public static iuw aH(int i, iuv iuvVar) {
        return aI(i, iuvVar, nqo.v, nqo.w);
    }

    public static iuw aI(int i, iuv iuvVar, @dzsi cqtv cqtvVar, @dzsi cqtv cqtvVar2) {
        return iva.e(cqrt.j(iup.f(i, cqtvVar, cqtvVar2), iuvVar.a), cqrt.j(iup.f(i, cqtvVar, cqtvVar2), iuvVar.b));
    }

    public static iuw aJ(int i, iuv iuvVar) {
        return iva.e(cqrt.h(i, iuvVar.a), cqrt.h(i, iuvVar.b));
    }

    public static iuw aK(int i) {
        return aL(i, nql.a, nql.b, nqo.v, nqo.w);
    }

    public static iuw aL(int i, iuv iuvVar, iuv iuvVar2, @dzsi cqtv cqtvVar, @dzsi cqtv cqtvVar2) {
        return bf(iup.f(i, cqtvVar, cqtvVar2), iuvVar, iuvVar2);
    }

    public static iuw aM(int i, iuv iuvVar, iuv iuvVar2) {
        return bf(cqrt.f(i), iuvVar, iuvVar2);
    }

    public static cqtd aN(cqrp cqrpVar, @dzsi cqtd cqtdVar, boolean z, int i, int i2) {
        return cqtt.q(cqtt.r(new int[]{16843623}, iva.e(be(nqo.aj, cqrpVar, i, 385875968, cqtdVar), be(nqo.aj, cqrpVar, i2, 671088639, cqtdVar))), cqtt.r(new int[]{16842908}, iva.e(be(nqo.ak, cqrpVar, i, 385875968, cqtdVar), be(nqo.ak, cqrpVar, i2, 671088639, cqtdVar))), cqtt.t(iva.e(bd(cqtdVar, -1384273465, z), bd(cqtdVar, -1375731713, z))));
    }

    public static <T extends cqkp> cqnf<T> aO(cqlc<T, Boolean> cqlcVar) {
        return i(cqlcVar, null, true, cqrp.d(dcyn.a));
    }

    public static <T extends cqkp> cqnf<T> aP(cqjb<T, Boolean> cqjbVar, cqlc<T, Boolean> cqlcVar, cqrp cqrpVar) {
        return cqjv.l(cqlcVar, j(cqjbVar, null, false, cqrpVar), cqjv.o(cqjbVar, cqgr.x(bg(false, cqrpVar)), cqgr.x(aT(false))));
    }

    public static <T extends cqkp> cqnf<T> aQ(Boolean bool, Boolean bool2, boolean z, cqrp cqrpVar) {
        return cqjv.k(bool2, h(bool, null, z, cqrpVar), cqjv.k(bool, cqgr.x(bg(z, cqrpVar)), cqgr.x(aT(z))));
    }

    public static <T extends cqkp> cqnf<T> aR(Boolean bool) {
        return k(bool, aS(true, cqrp.d(dcyn.a)), aT(true));
    }

    public static cqtd aS(boolean z, cqrp cqrpVar) {
        return aN(cqrpVar, null, z, -1511170, -2956292);
    }

    public static cqtd aT(boolean z) {
        return bd(null, 671088639, z);
    }

    public static cqtd aU() {
        return aD(R.raw.car_only_ic_incident_warning_36dp, nql.ab, nql.aa);
    }

    private static <T extends cqkp> cqnf<T> aV(cqlc<T, Boolean> cqlcVar, cqtd cqtdVar, cqtd cqtdVar2) {
        return cqjv.l(cqlcVar, cqgr.x(cqtdVar), cqgr.x(cqtdVar2));
    }

    private static <T extends cqkp> cqnf<T> aW(cqjb<T, Boolean> cqjbVar, cqtd cqtdVar, cqtd cqtdVar2) {
        return cqjv.o(cqjbVar, cqgr.x(cqtdVar), cqgr.x(cqtdVar2));
    }

    private static cqtd aX(@dzsi cqtd cqtdVar, boolean z) {
        return iva.e(bd(cqtdVar, 385875968, z), bd(cqtdVar, 671088639, z));
    }

    private static cqtd aY(cqrp cqrpVar) {
        return aZ(cqrpVar, null, true);
    }

    private static cqtd aZ(cqrp cqrpVar, @dzsi cqtd cqtdVar, boolean z) {
        return aN(cqrpVar, cqtdVar, z, -11821313, -14454323);
    }

    public static cqtd aa() {
        return aI(R.raw.car_only_ic_starred_place_circle_48dp, nql.o, nqo.x, nqo.y);
    }

    public static cqtd ab() {
        return iut.a(aI(R.raw.car_only_ic_want_to_go_place_circle_48dp, nql.p, nqo.x, nqo.y));
    }

    @dzsi
    public static cqtd ac() {
        return ar(4092);
    }

    public static cqtd ad() {
        return iut.a(aG(R.raw.car_only_ic_custom_raw_36));
    }

    public static cqtd ae() {
        return ba(nql.s);
    }

    public static cqtd af() {
        return aG(R.raw.car_only_ic_contact_36dp);
    }

    public static cqtd ag() {
        return aG(R.raw.car_only_ic_local_ev_station_36dp);
    }

    public static cqtd ah(int i, iuv iuvVar) {
        return aI(i, iuvVar, nqo.F, nqo.G);
    }

    public static cqtd ai(int i, iuv iuvVar) {
        cqrp cqrpVar = nqo.F;
        cqrp cqrpVar2 = nqo.G;
        return iva.e(cqrt.j(iup.b(i, cqrpVar, cqrpVar2), iuvVar.a), cqrt.j(iup.b(i, cqrpVar, cqrpVar2), iuvVar.b));
    }

    public static cqtd aj() {
        return aB(R.raw.car_only_ic_sound_on_36dp, nql.l);
    }

    public static cqtd ak(dprc dprcVar) {
        dprc dprcVar2 = dprc.UNKNOWN_ENTITY_LIST_TYPE;
        int ordinal = dprcVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return aH(R.raw.car_only_ic_favorite_place_bookmark_36dp, nql.q);
            }
            if (ordinal == 3) {
                return aH(R.raw.car_only_ic_want_to_go_place_bookmark_36dp, nql.p);
            }
            if (ordinal == 4) {
                return aH(R.raw.car_only_ic_starred_place_bookmark_36dp, nql.o);
            }
            String valueOf = String.valueOf(dprcVar.name());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected personal place list type: ".concat(valueOf) : new String("Unexpected personal place list type: "));
        }
        return aH(R.raw.car_only_ic_custom_place_bookmark_36dp, nql.s);
    }

    public static cqtd al() {
        return ba(nql.w);
    }

    public static cqtd am() {
        return ba(nql.t);
    }

    public static cqtd an(cqss cqssVar) {
        return aC(R.raw.car_only_ic_circle, cqssVar, nqo.x, nqo.y);
    }

    public static jic ao(@dzsi String str) {
        return new jic(str, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, R.drawable.car_only_avatar);
    }

    public static cqtd aq(int i) {
        return aC(i, nql.B, nqo.z, nqo.A);
    }

    @dzsi
    public static cqtd ar(int i) {
        return as(i, al());
    }

    @dzsi
    public static cqtd as(int i, cqtd cqtdVar) {
        switch (i) {
            case 3:
                return al();
            case 4:
            case com.google.android.filament.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 4091:
            case 4092:
                return null;
            case 6:
            case 7:
                return am();
            case 61953:
            case 61954:
            case 61975:
            case 61978:
                return ba(nql.y);
            case 61956:
            case 61965:
            case 61979:
                return ba(nql.z);
            case 61959:
                return ba(nql.A);
            default:
                return cqtdVar;
        }
    }

    public static cqtd at() {
        return iva.e(iup.e(R.raw.car_only_destination_input_recent_sign_in_promo), iup.e(R.raw.car_only_destination_input_recent_sign_in_promo_night));
    }

    public static cqtd au() {
        return aH(R.raw.car_only_ic_incognito_circle, nql.m);
    }

    public static cqtd av() {
        return cqrt.f(R.drawable.car_only_image_placeholder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqtd aw(cqtd cqtdVar) {
        return cqtt.q(cqtt.v(new int[]{16842910}, cqtdVar, nql.ak, PorterDuff.Mode.SRC_IN), cqtt.s(cqtdVar, nql.al, PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqtd ax(cqtd cqtdVar) {
        return cqtt.q(cqtt.v(new int[]{16842919}, cqtdVar, nql.at, PorterDuff.Mode.SRC_IN), cqtt.v(new int[]{16842908}, cqtdVar, nql.at, PorterDuff.Mode.SRC_IN), cqtt.v(new int[]{16842910}, cqtdVar, nql.ar, PorterDuff.Mode.SRC_IN), cqtt.s(cqtdVar, nql.as, PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static StateListAnimator ay(Context context) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setPropertyName("translationZ");
        objectAnimator.setFloatValues(nqo.N.a(context));
        objectAnimator.setDuration(100L);
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setPropertyName("translationZ");
        objectAnimator2.setFloatValues(0.0f);
        objectAnimator2.setDuration(100L);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842919}, objectAnimator);
        stateListAnimator.addState(new int[0], objectAnimator2);
        return stateListAnimator;
    }

    public static cqtd az(int i) {
        return aA(i, true);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, Boolean> cqlcVar) {
        return d(cqlcVar, cqrp.d(dcyn.a));
    }

    private static cqtd ba(iuv iuvVar) {
        return bb(iuvVar, nqo.x, nqo.y);
    }

    private static cqtd bb(iuv iuvVar, cqtv cqtvVar, cqtv cqtvVar2) {
        return aI(R.raw.car_only_ic_circle, iuvVar, cqtvVar, cqtvVar2);
    }

    private static cqtd bc(int i, cqss cqssVar, cqss cqssVar2) {
        cqtv g = cqsg.g(nqo.x, nqo.z);
        Float valueOf = Float.valueOf(0.5f);
        cqtv f = cqsg.f(g, valueOf);
        cqtv f2 = cqsg.f(cqsg.g(nqo.y, nqo.A), valueOf);
        return cqtt.d(an(cqssVar2), cqtt.e(aC(i, cqssVar, nqo.z, nqo.A), f, f2, f, f2));
    }

    private static cqtd bd(@dzsi cqtd cqtdVar, int i, boolean z) {
        return new nqs(new Object[]{cqtdVar, Integer.valueOf(i), Boolean.valueOf(z)}, z, i, cqtdVar);
    }

    private static cqtd be(cqrp cqrpVar, cqrp cqrpVar2, int i, int i2, @dzsi cqtd cqtdVar) {
        return new nqt(new Object[]{Integer.valueOf(i), cqrpVar, cqrpVar2}, cqrpVar, i, cqrpVar2, cqtdVar, i2);
    }

    private static iuw bf(cqtd cqtdVar, iuv iuvVar, iuv iuvVar2) {
        return iva.e(cqtt.q(cqtt.v(new int[]{16842908}, cqtdVar, iuvVar2.a, PorterDuff.Mode.SRC_IN), cqtt.s(cqtdVar, iuvVar.a, PorterDuff.Mode.SRC_IN)), cqtt.q(cqtt.v(new int[]{16842908}, cqtdVar, iuvVar2.b, PorterDuff.Mode.SRC_IN), cqtt.s(cqtdVar, iuvVar.b, PorterDuff.Mode.SRC_IN)));
    }

    private static cqtd bg(boolean z, cqrp cqrpVar) {
        return aN(cqrpVar, null, z, -13242977, -11954348);
    }

    public static <T extends cqkp> cqnf<T> c(cqjb<T, Boolean> cqjbVar) {
        return e(cqjbVar, cqrp.d(dcyn.a));
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, Boolean> cqlcVar, cqrp cqrpVar) {
        return aV(cqlcVar, aY(cqrpVar), r());
    }

    public static <T extends cqkp> cqnf<T> e(cqjb<T, Boolean> cqjbVar, cqrp cqrpVar) {
        return aW(cqjbVar, aY(cqrpVar), r());
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> f(Boolean bool, @dzsi cqtd cqtdVar, boolean z) {
        return h(bool, cqtdVar, z, cqrp.d(dcyn.a));
    }

    public static <T extends cqkp> cqnf<T> g(cqjb<T, Boolean> cqjbVar, @dzsi cqtd cqtdVar, boolean z) {
        return j(cqjbVar, cqtdVar, z, cqrp.d(dcyn.a));
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> h(Boolean bool, @dzsi cqtd cqtdVar, boolean z, cqrp cqrpVar) {
        return k(bool, aZ(cqrpVar, cqtdVar, z), aX(cqtdVar, z));
    }

    public static <T extends cqkp> cqnf<T> i(cqlc<T, Boolean> cqlcVar, @dzsi cqtd cqtdVar, boolean z, cqrp cqrpVar) {
        return aV(cqlcVar, aZ(cqrpVar, cqtdVar, z), aX(cqtdVar, z));
    }

    public static <T extends cqkp> cqnf<T> j(cqjb<T, Boolean> cqjbVar, @dzsi cqtd cqtdVar, boolean z, cqrp cqrpVar) {
        return aW(cqjbVar, aZ(cqrpVar, cqtdVar, z), aX(cqtdVar, z));
    }

    public static <T extends cqkp> cqnf<T> k(Boolean bool, cqtd cqtdVar, cqtd cqtdVar2) {
        return cqjv.k(bool, cqgr.x(cqtdVar), cqgr.x(cqtdVar2));
    }

    public static cqtd l() {
        return m(cqrp.d(dcyn.a));
    }

    public static cqtd m(cqrp cqrpVar) {
        return p(nsd.g(cqrpVar, cqrpVar, cqrpVar, cqrpVar), dbpy.a, dbpy.a);
    }

    public static cqtd n(cqrp cqrpVar, cqtd cqtdVar) {
        return p(nsd.g(cqrpVar, cqrpVar, cqrpVar, cqrpVar), dbsg.i(cqtdVar), dbpy.a);
    }

    public static cqtd o(nsd nsdVar, cqtd cqtdVar) {
        return p(nsdVar, dbsg.i(cqtdVar), dbsg.i(nql.aN));
    }

    public static cqtd p(nsd nsdVar, dbsg<cqtd> dbsgVar, dbsg<cqss> dbsgVar2) {
        return npy.b(dbsgVar.c(nql.aD), q(nsdVar, dbsgVar, dbsgVar2));
    }

    public static cqtd q(nsd nsdVar, dbsg<cqtd> dbsgVar, dbsg<cqss> dbsgVar2) {
        cqrp cqrpVar = nqo.af;
        return new nqq(new Object[]{cqrpVar, dbsgVar2, nsdVar, dbsgVar}, cqrpVar, dbsgVar2, nsdVar, dbsgVar);
    }

    public static cqtd r() {
        return aX(null, true);
    }

    public static cqtd s() {
        return iut.a(aG(R.raw.car_only_ic_back_36dp));
    }

    public static cqtd t(boolean z) {
        if (z) {
            return iup.e(R.raw.logo_lockup_maps_white);
        }
        return iva.e(iup.e(R.raw.logo_lockup_maps_color), npy.b(iup.e(R.raw.logo_lockup_maps_white), iup.e(R.raw.logo_lockup_maps_light)));
    }

    public static cqtd u() {
        return aG(R.raw.car_only_ic_done_36dp);
    }

    public static cqtd v() {
        return aK(R.raw.car_only_ic_sort_by_alpha_36dp);
    }

    public static cqtd w() {
        return aG(R.raw.car_only_ic_close_36dp);
    }

    public static cqtd x() {
        return aG(R.raw.car_only_ic_mic_36dp);
    }

    public static cqtd y() {
        return iup.f(R.raw.car_only_ic_mic_branded_36dp, nqo.v, nqo.w);
    }

    public static cqtd z() {
        return aH(R.raw.car_only_ic_mic_off_36dp, nql.e);
    }

    public static cqtd aA(int i, boolean z) {
        int i2;
        Integer valueOf;
        switch (i) {
            case 1:
                i2 = R.raw.car_only_ic_list_number_1;
                valueOf = Integer.valueOf(i2);
                break;
            case 2:
                i2 = R.raw.car_only_ic_list_number_2;
                valueOf = Integer.valueOf(i2);
                break;
            case 3:
                i2 = R.raw.car_only_ic_list_number_3;
                valueOf = Integer.valueOf(i2);
                break;
            case 4:
                i2 = R.raw.car_only_ic_list_number_4;
                valueOf = Integer.valueOf(i2);
                break;
            case 5:
                i2 = R.raw.car_only_ic_list_number_5;
                valueOf = Integer.valueOf(i2);
                break;
            case 6:
                i2 = R.raw.car_only_ic_list_number_6;
                valueOf = Integer.valueOf(i2);
                break;
            case 7:
                i2 = R.raw.car_only_ic_list_number_7;
                valueOf = Integer.valueOf(i2);
                break;
            case 8:
                i2 = R.raw.car_only_ic_list_number_8;
                valueOf = Integer.valueOf(i2);
                break;
            case 9:
                i2 = R.raw.car_only_ic_list_number_9;
                valueOf = Integer.valueOf(i2);
                break;
            default:
                valueOf = null;
                break;
        }
        if (valueOf == null) {
            bvoo.h("Invalid number for iconNumericMeasle: %d, needs to be between 1 and 9 inclusive.", Integer.valueOf(i));
            return cqtt.c();
        }
        cqtd[] cqtdVarArr = new cqtd[2];
        cqtdVarArr[0] = bb(z ? nql.g : nql.h, nqo.v, nqo.w);
        cqtdVarArr[1] = aH(valueOf.intValue(), nql.i);
        return cqtt.d(cqtdVarArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @dzsi
    public static cqtd ap(int i, cqtd cqtdVar) {
        if (i != 3) {
            if (i == 4) {
                return aa();
            }
            if (i == 6) {
                return E();
            }
            if (i == 7) {
                return F();
            }
            if (i == 4091) {
                return V();
            }
            if (i == 4092) {
                return ab();
            }
            switch (i) {
                case com.google.android.filament.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    return X();
                case 61956:
                    return aG(R.raw.car_only_ic_local_gas_station_36dp);
                case 61959:
                    break;
                case 61961:
                    return aG(R.raw.car_only_ic_local_movies_alt_36dp);
                case 61975:
                    return aG(R.raw.car_only_ic_local_drink_36dp);
                case 61978:
                    return aG(R.raw.car_only_ic_local_fastfood_36dp);
                default:
                    switch (i) {
                        case 61953:
                            return aG(R.raw.car_only_ic_local_restaurant_36dp);
                        case 61954:
                            return aG(R.raw.car_only_ic_local_cafe_36dp);
                        default:
                            switch (i) {
                                case 61963:
                                    break;
                                case 61964:
                                    return aG(R.raw.car_only_ic_local_hospital_36dp);
                                case 61965:
                                    return aG(R.raw.car_only_ic_atm_36dp);
                                case 61966:
                                    return aG(R.raw.car_only_ic_local_parking_36dp);
                                default:
                                    return cqtdVar;
                            }
                    }
            }
            return aG(R.raw.car_only_ic_local_grocery_store_36dp);
        }
        return G();
    }
}

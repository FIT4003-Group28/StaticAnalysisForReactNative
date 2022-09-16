package defpackage;

import android.net.Uri;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import java.util.List;
/* compiled from: PG */
/* renamed from: afia  reason: default package */
/* loaded from: classes2.dex */
public final class afia {
    public static final afia R = new afia(afib.INVALID, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, null, afie.NONE, null, null, null, null, null, null, null, false, dwxv.e, null, null, null, dwyd.UNKNOWN_ENTRY_POINT, null, bbus.DISABLE, aeui.b, false, null, null, null, dbpy.a);
    @dzsi
    public final String A;
    @dzsi
    public final dmcf B;
    @dzsi
    public final afif C;
    public final boolean D;
    public final dwxv E;
    @dzsi
    public final String F;
    @dzsi
    public final Uri G;
    @dzsi
    public final List<Uri> H;
    public final dwyd I;
    @dzsi
    public final String J;
    public final bbus K;
    public final aeui L;
    public final boolean M;
    @dzsi
    public final ddho N;
    @dzsi
    public final String O;
    @dzsi
    public final String P;
    public final dbsg<Long> Q;
    @dzsi
    private final akqq S;
    @dzsi
    private final akqq T;
    private final dcdc<amvf> U;
    @dzsi
    private final dspd V;
    public final afib a;
    @dzsi
    public final String b;
    @dzsi
    public final String c;
    @dzsi
    public final String d;
    @dzsi
    public final String e;
    @dzsi
    public final akqq f;
    @dzsi
    public final akqq g;
    @dzsi
    public final Float h;
    @dzsi
    public final amvh i;
    public final dcdc<amvh> j;
    @dzsi
    public final dspd k;
    public final afie l;
    @dzsi
    public final afht m;
    @dzsi
    public final Boolean n;
    @dzsi
    public final Boolean o;
    @dzsi
    public final Boolean p;
    @dzsi
    public final Boolean q;
    @dzsi
    public final Boolean r;
    @dzsi
    public final afhv s;
    @dzsi
    public final akqi t;
    @dzsi
    public final akqq u;
    @dzsi
    public final dggg v;
    @dzsi
    public final UserOrientation w;
    @dzsi
    public final ddjr x;
    @dzsi
    public final Integer y;
    @dzsi
    public final dpjs z;

    public afia(afib afibVar, @dzsi String str, @dzsi String str2, @dzsi String str3, @dzsi akqq akqqVar, @dzsi Float f, @dzsi akqq akqqVar2, @dzsi amvh amvhVar, amvh[] amvhVarArr, amvf[] amvfVarArr, @dzsi dspd dspdVar, @dzsi dspd dspdVar2, @dzsi afht afhtVar, @dzsi Boolean bool, @dzsi Boolean bool2, @dzsi Boolean bool3, @dzsi Boolean bool4, @dzsi Boolean bool5, @dzsi afhv afhvVar, @dzsi String str4, @dzsi akqi akqiVar, @dzsi akqq akqqVar3, @dzsi akqq akqqVar4, @dzsi akqq akqqVar5, @dzsi dggg dgggVar, afie afieVar, @dzsi UserOrientation userOrientation, @dzsi ddjr ddjrVar, @dzsi Integer num, @dzsi dpjs dpjsVar, @dzsi String str5, @dzsi dmcf dmcfVar, @dzsi afif afifVar, boolean z, dwxv dwxvVar, @dzsi String str6, @dzsi Uri uri, @dzsi List<Uri> list, dwyd dwydVar, @dzsi String str7, bbus bbusVar, aeui aeuiVar, boolean z2, @dzsi ddho ddhoVar, @dzsi String str8, @dzsi String str9, dbsg<Long> dbsgVar) {
        dcdc<amvh> t;
        dcdc<amvf> t2;
        this.b = str;
        this.d = str2;
        this.e = str3;
        this.a = afibVar;
        this.T = akqqVar;
        this.h = f;
        this.S = akqqVar2;
        this.i = amvhVar;
        if (amvhVarArr == null) {
            t = dcdc.e();
        } else {
            t = dcdc.t(amvhVarArr);
        }
        this.j = t;
        if (amvfVarArr == null) {
            t2 = dcdc.e();
        } else {
            t2 = dcdc.t(amvfVarArr);
        }
        this.U = t2;
        this.k = dspdVar;
        this.V = dspdVar2;
        this.m = afhtVar;
        this.n = bool;
        this.o = bool2;
        this.p = bool3;
        this.q = bool4;
        this.r = bool5;
        this.s = afhvVar;
        this.c = str4;
        this.t = akqiVar;
        this.f = akqqVar3;
        this.l = afieVar;
        this.g = akqqVar4;
        this.u = akqqVar5;
        this.v = dgggVar;
        this.w = userOrientation;
        this.x = ddjrVar;
        this.y = num;
        this.z = dpjsVar;
        this.A = str5;
        this.B = dmcfVar;
        this.C = afifVar;
        this.D = z;
        this.E = dwxvVar;
        this.F = str6;
        this.G = uri;
        this.H = list;
        this.I = dwydVar;
        this.J = str7;
        this.K = bbusVar;
        this.L = aeuiVar;
        this.M = z2;
        this.N = ddhoVar;
        this.O = str8;
        this.P = str9;
        this.Q = dbsgVar;
    }

    public static afhz e() {
        return new afhz();
    }

    public final durz a() {
        afib afibVar = afib.DIRECTIONS;
        switch (this.a.ordinal()) {
            case 0:
                if (c()) {
                    return durz.EIT_NAVIGATION;
                }
                return durz.EIT_DIRECTIONS;
            case 1:
                return durz.EIT_NAVIGATION;
            case 2:
            case 3:
            case 4:
                return durz.EIT_SEARCH;
            case 5:
                return durz.EIT_MAP_VIEW;
            case 6:
                return durz.EIT_STREET_VIEW;
            case 7:
            default:
                return durz.EIT_UNKNOWN;
            case 8:
                return durz.EIT_VOICE;
        }
    }

    @dzsi
    public final dqvj b() {
        afht afhtVar = this.m;
        if (afhtVar != null) {
            return afhtVar.a;
        }
        return null;
    }

    public final boolean c() {
        afhv afhvVar = this.s;
        return afhvVar != null && afhvVar.d;
    }

    @dzsi
    public final akqq d() {
        akqq akqqVar = this.T;
        if (akqqVar != null) {
            return akqqVar;
        }
        akqq akqqVar2 = this.S;
        if (akqqVar2 == null) {
            return null;
        }
        return akqqVar2;
    }

    public final void f() {
        dbsb c = dbsc.c(getClass());
        c.b("query", this.b);
        c.b("hiddenQuery", this.d);
        c.b("hiddenNear", this.e);
        c.b("actionType", this.a);
        c.b("sll", this.T);
        c.b("zoom", this.h);
        c.b("ll", this.S);
        c.b("startWaypoint", this.i);
        c.b("destinationWaypoints", this.j);
        c.b("destinationViapoints", this.U);
        c.b("rerouteToken", this.k);
        c.b("tripUpdateToken", this.V);
        c.b("directionsFlag", this.m);
        c.b("enableTrafficOverlay", this.n);
        c.b("enableTransitOverlay", this.o);
        c.b("enableBicyclingOverlay", this.p);
        c.b("enableSatelliteMode", this.q);
        c.b("enableTerrainMode", this.r);
        c.b("targetMode", this.s);
        c.b("thirdPartyLabel", this.c);
        c.b("searchDisplayTitle", null);
        c.b("presetQueryType", null);
        c.b("placeFeatureId", this.t);
        c.b("latLngSpan", this.f);
        c.b("myLocationSpec", this.l);
        c.b("searchSpan", this.g);
        c.b("streetViewLatLng", this.u);
        c.b("streetViewImageKey", this.v);
        c.b("streetViewUserOrientation", this.w);
        c.b("entryPoint", this.x);
        c.b("index", this.y);
        c.b("entityType", this.z);
        c.b("preferredTransitPattern", this.A);
        c.b("gmmActionType", this.B);
        c.b("reportIncidentSubtype", this.C);
        c.h("playConfirmationTts", this.D);
        c.b("intentExtension", this.E);
        c.b("referer", this.F);
        c.b("photoUploadUri", this.G);
        c.b("photoPlaceDisambiguationUiOption", this.K);
        c.b("iAmHereState", this.L);
        c.h("autoShowCameraPhotoUpload", false);
        c.h("isOneBackTapIntent", this.M);
        c.b("veType", this.N);
        c.b("ved", this.O);
        c.b("ei", this.P);
        c.b("assistantSessionId", this.Q);
        c.toString();
    }
}

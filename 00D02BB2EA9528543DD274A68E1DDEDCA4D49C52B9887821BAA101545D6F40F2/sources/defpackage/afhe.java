package defpackage;
/* compiled from: PG */
/* renamed from: afhe  reason: default package */
/* loaded from: classes2.dex */
public final class afhe {
    public static final dcdn<dmcf, ddda> b;
    public final cjqy a;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dmcf.ALLOW_HIGHWAYS, ddda.dr);
        dcdgVar.f(dmcf.ALLOW_TOLLS, ddda.ds);
        dcdgVar.f(dmcf.ARE_WE_THERE_YET_EASTER_EGG, ddda.dt);
        dcdgVar.f(dmcf.AVOID_HIGHWAYS, ddda.du);
        dcdgVar.f(dmcf.AVOID_TOLLS, ddda.dv);
        dcdgVar.f(dmcf.CLEAR_SEARCH_RESULTS, ddda.dw);
        dcdgVar.f(dmcf.DISTANCE_TO_DESTINATION, ddda.dx);
        dcdgVar.f(dmcf.ETA, ddda.dA);
        dcdgVar.f(dmcf.EXIT_NAVIGATION, ddda.dB);
        dcdgVar.f(dmcf.FOLLOW_MODE, ddda.dC);
        dcdgVar.f(dmcf.GO_BACK, ddda.dE);
        dcdgVar.f(dmcf.HIDE_SATELLITE, ddda.dF);
        dcdgVar.f(dmcf.HIDE_TRAFFIC, ddda.dG);
        dcdgVar.f(dmcf.TRAFFIC_REPORT, ddda.dZ);
        dcdgVar.f(dmcf.MUTE, ddda.dH);
        dcdgVar.f(dmcf.DISTANCE_TO_NEXT_TURN, ddda.dJ);
        dcdgVar.f(dmcf.QUERY_NEXT_TURN, ddda.dJ);
        dcdgVar.f(dmcf.TIME_TO_NEXT_TURN, ddda.dJ);
        dcdgVar.f(dmcf.QUERY_CURRENT_ROAD, ddda.dK);
        dcdgVar.f(dmcf.QUERY_DESTINATION, ddda.dL);
        dcdgVar.f(dmcf.REPORT_CRASH, ddda.dM);
        dcdgVar.f(dmcf.REPORT_HAZARD, ddda.dN);
        dcdgVar.f(dmcf.REPORT_ROAD_CLOSURE, ddda.dO);
        dcdgVar.f(dmcf.REPORT_SPEED_TRAP, ddda.dP);
        dcdgVar.f(dmcf.REPORT_TRAFFIC_JAM, ddda.dQ);
        dcdgVar.f(dmcf.RESUME_NAVIGATION, ddda.dR);
        dcdgVar.f(dmcf.ROUTE_OVERVIEW, ddda.dS);
        dcdgVar.f(dmcf.SHOW_ALTERNATES, ddda.dU);
        dcdgVar.f(dmcf.SHOW_DIRECTIONS_LIST, ddda.dV);
        dcdgVar.f(dmcf.SHOW_SATELLITE, ddda.dW);
        dcdgVar.f(dmcf.SHOW_TRAFFIC, ddda.dX);
        dcdgVar.f(dmcf.TIME_TO_DESTINATION, ddda.dY);
        dcdgVar.f(dmcf.UNMUTE, ddda.ea);
        b = dcdgVar.b();
    }

    public afhe(cjqy cjqyVar) {
        this.a = cjqyVar;
    }

    public final cjrc a(String str, @dzsi String str2, @dzsi afia afiaVar) {
        durz a;
        String str3;
        ddjr ddjrVar;
        if (afiaVar == null) {
            a = durz.EIT_UNKNOWN;
        } else {
            a = afiaVar.a();
        }
        durz durzVar = a;
        ddjr ddjrVar2 = (afiaVar == null || (ddjrVar = afiaVar.x) == null) ? null : ddjrVar;
        if (dbsj.d(str2)) {
            if (ddjrVar2 != null) {
                switch (ddjrVar2.ordinal()) {
                    case 4:
                    case 5:
                        str3 = "com.google.android.googlequicksearchbox/android.intent.action.ASSIST";
                        break;
                    case 7:
                        str2 = "com.google.android.apps.gmm.appwidget";
                        break;
                    case 8:
                        str2 = "com.google.enroute";
                        break;
                    case 9:
                        str2 = "com.google.android.apps.gmm.voice.actions.parsing.Parser";
                        break;
                    case 10:
                        str2 = "com.google.android.apps.gmm.navigation.ui.freenav.shortcut";
                        break;
                    case 11:
                        str2 = "com.google.android.apps.gmm.navigation.service.detection";
                        break;
                    case 12:
                        str2 = "com.google.android.apps.gmm.navigation.ui.freenav.voice";
                        break;
                    case 13:
                        str2 = "com.android.nfc";
                        break;
                    case 16:
                        str2 = "com.google.android.apps.gmm.traffic.shortcut";
                        break;
                    case 17:
                        str2 = "com.google.android.apps.gmm.intents";
                        break;
                    case 18:
                    case 19:
                        str3 = "com.google.maps.notifications.traffic.gmm.chime.render.service.payload";
                        break;
                    case 20:
                        str2 = "com.google.geo.sidekick.frontend.cards.trafficincidents";
                        break;
                    case 21:
                    case 22:
                    case 23:
                        str3 = "com.google.android.apps.gmm.car.suggestions";
                        break;
                    case 25:
                        str2 = "com.google.android.gm";
                        break;
                }
                return this.a.s(str, ddjrVar2, durzVar, dukj.EXTERNAL_INVOCATION_COMPLETED, str3, false);
            }
            str3 = null;
            return this.a.s(str, ddjrVar2, durzVar, dukj.EXTERNAL_INVOCATION_COMPLETED, str3, false);
        }
        str3 = str2;
        return this.a.s(str, ddjrVar2, durzVar, dukj.EXTERNAL_INVOCATION_COMPLETED, str3, false);
    }
}

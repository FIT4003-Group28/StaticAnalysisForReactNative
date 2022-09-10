package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xkn  reason: default package */
/* loaded from: classes7.dex */
public final class xkn {
    private static final dcqe a = dcqe.c("xkn");

    @dzsi
    public static cqtd a(@dzsi dpyy dpyyVar, dcdn<dpyy, cqtd> dcdnVar) {
        if (dpyyVar == null) {
            return null;
        }
        cqtd orDefault = dcdnVar.getOrDefault(dpyyVar, null);
        if (orDefault != null || dpyyVar.equals(dpyy.OCCUPANCY_RATE_UNKNOWN)) {
            return orDefault;
        }
        bvoo.h("Invalid OccupancyRate: %d", Integer.valueOf(dpyyVar.j));
        return null;
    }

    @dzsi
    public static cqtd b(@dzsi dpyy dpyyVar) {
        return a(dpyyVar, vyu.e);
    }

    @dzsi
    public static cqtd c(@dzsi dpyy dpyyVar) {
        return a(dpyyVar, vyu.j);
    }

    @dzsi
    public static String d(@dzsi dpzb dpzbVar, Context context) {
        dpyy g;
        int a2;
        if (dpzbVar == null || (g = g(dpzbVar)) == null) {
            return null;
        }
        if ((dpzbVar.a & 1) == 0 || (a2 = dpza.a(dpzbVar.b)) == 0 || a2 != 2) {
            switch (g.ordinal()) {
                case 0:
                    return null;
                case 1:
                case 2:
                    return context.getString(R.string.TRANSIT_OCCUPANCY_MANY_SEATS_AVAILABLE_DESCRIPTION);
                case 3:
                    return context.getString(R.string.TRANSIT_OCCUPANCY_FEW_SEATS_AVAILABLE_DESCRIPTION);
                case 4:
                    return context.getString(R.string.TRANSIT_OCCUPANCY_STANDING_ROOM_ONLY_DESCRIPTION);
                case 5:
                case 6:
                case 7:
                    return context.getString(R.string.TRANSIT_OCCUPANCY_CRUSHED_STANDING_ROOM_ONLY_DESCRIPTION);
                default:
                    bvoo.h("Invalid OccupancyRate: %d", Integer.valueOf(g.j));
                    return null;
            }
        }
        switch (g.ordinal()) {
            case 0:
            case 8:
                return null;
            case 1:
            case 2:
                return context.getString(R.string.TRANSIT_OCCUPANCY_USUALLY_MANY_EMPTY_SEATS_DESCRIPTION);
            case 3:
                return context.getString(R.string.TRANSIT_OCCUPANCY_USUALLY_FEW_EMPTY_SEATS_DESCRIPTION);
            case 4:
                return context.getString(R.string.TRANSIT_OCCUPANCY_USUALLY_STANDING_ROOM_ONLY_DESCRIPTION);
            case 5:
            case 6:
            case 7:
                return context.getString(R.string.TRANSIT_OCCUPANCY_USUALLY_CRAMPED_STANDING_ROOM_DESCRIPTION);
            default:
                bvoo.h("Invalid OccupancyRate: %d", Integer.valueOf(g.j));
                return null;
        }
    }

    public static boolean e(@dzsi dpyy dpyyVar) {
        return b(dpyyVar) != null;
    }

    @dzsi
    public static dpzb f(dpjb dpjbVar) {
        if ((dpjbVar.a & 2) != 0) {
            dpzb dpzbVar = dpjbVar.c;
            return dpzbVar == null ? dpzb.d : dpzbVar;
        }
        return null;
    }

    @dzsi
    public static dpyy g(@dzsi dpzb dpzbVar) {
        if (dpzbVar != null && (dpzbVar.a & 2) != 0) {
            dpyy b = dpyy.b(dpzbVar.c);
            if (b == null) {
                b = dpyy.OCCUPANCY_RATE_UNKNOWN;
            }
            if (b != dpyy.OCCUPANCY_RATE_UNKNOWN) {
                dpyy b2 = dpyy.b(dpzbVar.c);
                return b2 == null ? dpyy.OCCUPANCY_RATE_UNKNOWN : b2;
            }
        }
        return null;
    }
}

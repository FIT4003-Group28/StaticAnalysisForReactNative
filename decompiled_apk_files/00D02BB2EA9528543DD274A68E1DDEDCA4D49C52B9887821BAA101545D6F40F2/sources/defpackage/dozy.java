package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dozy  reason: default package */
/* loaded from: classes6.dex */
public enum dozy implements dsrb {
    UNKNOWN(0),
    CONTINUE(1),
    TOLL(2),
    PARTIAL_TOLL(3),
    SEASONAL_CLOSURE(4),
    TEMPORARY_ROAD_CLOSURE(15),
    ROUNDABOUTS(5),
    COUNTRY_BORDER(6),
    CRISIS(29),
    COUNTRY_CROSSING(16),
    PRIVATE_ROAD(17),
    FERRY_BOAT(18),
    FERRY_TRAIN(19),
    PROVINCE_BORDER(7),
    SIDE_OF_ROAD(8),
    TOLL_ZONE_CROSSING(9),
    EVENT(25),
    INCIDENT(10),
    BETA(11),
    TRAFFIC_ONE_LINER(12),
    TRAFFIC_PROBLEM(13),
    TRAFFIC_PROMPT(14),
    TRAFFIC_TREND(24),
    TRANSIT_ALERT(20),
    TIME_BASED_RESTRICTION(21),
    TIME_BASED_HOV(22),
    TRANSIT_SYSTEM_SUMMARY(23),
    TIME_ZONE(26),
    VEHICLE_LICENSE_RESTRICTION(27),
    HIGHWAY(28),
    ON_ROUTE_PROBLEM(30),
    BUSYNESS(31);
    
    public final int G;

    dozy(int i) {
        this.G = i;
    }

    public static dozy b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CONTINUE;
            case 2:
                return TOLL;
            case 3:
                return PARTIAL_TOLL;
            case 4:
                return SEASONAL_CLOSURE;
            case 5:
                return ROUNDABOUTS;
            case 6:
                return COUNTRY_BORDER;
            case 7:
                return PROVINCE_BORDER;
            case 8:
                return SIDE_OF_ROAD;
            case 9:
                return TOLL_ZONE_CROSSING;
            case 10:
                return INCIDENT;
            case 11:
                return BETA;
            case 12:
                return TRAFFIC_ONE_LINER;
            case 13:
                return TRAFFIC_PROBLEM;
            case 14:
                return TRAFFIC_PROMPT;
            case 15:
                return TEMPORARY_ROAD_CLOSURE;
            case 16:
                return COUNTRY_CROSSING;
            case 17:
                return PRIVATE_ROAD;
            case 18:
                return FERRY_BOAT;
            case 19:
                return FERRY_TRAIN;
            case 20:
                return TRANSIT_ALERT;
            case 21:
                return TIME_BASED_RESTRICTION;
            case 22:
                return TIME_BASED_HOV;
            case 23:
                return TRANSIT_SYSTEM_SUMMARY;
            case 24:
                return TRAFFIC_TREND;
            case 25:
                return EVENT;
            case 26:
                return TIME_ZONE;
            case 27:
                return VEHICLE_LICENSE_RESTRICTION;
            case 28:
                return HIGHWAY;
            case 29:
                return CRISIS;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return ON_ROUTE_PROBLEM;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return BUSYNESS;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dozx.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.G;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.G);
    }
}

package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dgau  reason: default package */
/* loaded from: classes6.dex */
public enum dgau implements dsrb {
    MANEUVER_UNKNOWN(0),
    DEPART(1),
    NAME_CHANGE(2),
    STRAIGHT(12),
    LANE_CHANGE(29),
    TURN(3),
    COUNTED_TURN(16),
    UTURN(4),
    ON_RAMP(5),
    OFF_RAMP(6),
    FORK(7),
    MERGE(8),
    FERRY(13),
    FERRY_TRAIN(14),
    EASTER_EGG(15),
    ROUNDABOUT_ENTER(9),
    ROUNDABOUT_EXIT(10),
    ROUNDABOUT_ENTER_AND_EXIT(11),
    PEDESTRIAN_WALKWAY(17),
    PEDESTRIAN_CROSSING(18),
    PEDESTRIAN_OVERPASS_UNDERPASS(19),
    PEDESTRIAN_STATION_PATH(20),
    PEDESTRIAN_ACCESS_PATH(21),
    SIMPLE_PATH(23),
    PEDESTRIAN_STAIRWAY(24),
    PEDESTRIAN_ELEVATOR(25),
    PEDESTRIAN_ESCALATOR(26),
    PEDESTRIAN_SLOPEWAY(27),
    PEDESTRIAN_LEVEL_CHANGE(28),
    DESTINATION(30),
    ERROR(22);
    
    public final int F;

    dgau(int i) {
        this.F = i;
    }

    public static dgau b(int i) {
        switch (i) {
            case 0:
                return MANEUVER_UNKNOWN;
            case 1:
                return DEPART;
            case 2:
                return NAME_CHANGE;
            case 3:
                return TURN;
            case 4:
                return UTURN;
            case 5:
                return ON_RAMP;
            case 6:
                return OFF_RAMP;
            case 7:
                return FORK;
            case 8:
                return MERGE;
            case 9:
                return ROUNDABOUT_ENTER;
            case 10:
                return ROUNDABOUT_EXIT;
            case 11:
                return ROUNDABOUT_ENTER_AND_EXIT;
            case 12:
                return STRAIGHT;
            case 13:
                return FERRY;
            case 14:
                return FERRY_TRAIN;
            case 15:
                return EASTER_EGG;
            case 16:
                return COUNTED_TURN;
            case 17:
                return PEDESTRIAN_WALKWAY;
            case 18:
                return PEDESTRIAN_CROSSING;
            case 19:
                return PEDESTRIAN_OVERPASS_UNDERPASS;
            case 20:
                return PEDESTRIAN_STATION_PATH;
            case 21:
                return PEDESTRIAN_ACCESS_PATH;
            case 22:
                return ERROR;
            case 23:
                return SIMPLE_PATH;
            case 24:
                return PEDESTRIAN_STAIRWAY;
            case 25:
                return PEDESTRIAN_ELEVATOR;
            case 26:
                return PEDESTRIAN_ESCALATOR;
            case 27:
                return PEDESTRIAN_SLOPEWAY;
            case 28:
                return PEDESTRIAN_LEVEL_CHANGE;
            case 29:
                return LANE_CHANGE;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return DESTINATION;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dgat.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.F;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.F);
    }
}

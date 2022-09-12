package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dqjl  reason: default package */
/* loaded from: classes6.dex */
public enum dqjl implements dsrb {
    UNKNOWN_ACTIVITY_TYPE(0),
    WALKING(2),
    CYCLING(3),
    IN_VEHICLE(4),
    IN_PASSENGER_VEHICLE(29),
    IN_TAXI(36),
    MOTORCYCLING(30),
    FLYING(5),
    IN_BUS(7),
    IN_TRAIN(8),
    IN_SUBWAY(9),
    IN_TRAM(10),
    IN_FERRY(11),
    IN_CABLECAR(12),
    IN_FUNICULAR(13),
    HIKING(14),
    KAYAKING(15),
    KITESURFING(16),
    ROWING(17),
    RUNNING(6),
    SAILING(18),
    SKATING(19),
    SKIING(20),
    SKATEBOARDING(21),
    SLEDDING(22),
    SNOWBOARDING(23),
    SNOWMOBILE(24),
    SNOWSHOEING(25),
    SURFING(26),
    SWIMMING(27),
    WALKING_NORDIC(28),
    PARAGLIDING(37),
    BOATING(31),
    IN_WHEELCHAIR(32),
    HORSEBACK_RIDING(33),
    IN_GONDOLA_LIFT(34),
    CATCHING_POKEMON(35);
    
    public final int L;

    dqjl(int i) {
        this.L = i;
    }

    public static dqjl b(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return WALKING;
                case 3:
                    return CYCLING;
                case 4:
                    return IN_VEHICLE;
                case 5:
                    return FLYING;
                case 6:
                    return RUNNING;
                case 7:
                    return IN_BUS;
                case 8:
                    return IN_TRAIN;
                case 9:
                    return IN_SUBWAY;
                case 10:
                    return IN_TRAM;
                case 11:
                    return IN_FERRY;
                case 12:
                    return IN_CABLECAR;
                case 13:
                    return IN_FUNICULAR;
                case 14:
                    return HIKING;
                case 15:
                    return KAYAKING;
                case 16:
                    return KITESURFING;
                case 17:
                    return ROWING;
                case 18:
                    return SAILING;
                case 19:
                    return SKATING;
                case 20:
                    return SKIING;
                case 21:
                    return SKATEBOARDING;
                case 22:
                    return SLEDDING;
                case 23:
                    return SNOWBOARDING;
                case 24:
                    return SNOWMOBILE;
                case 25:
                    return SNOWSHOEING;
                case 26:
                    return SURFING;
                case 27:
                    return SWIMMING;
                case 28:
                    return WALKING_NORDIC;
                case 29:
                    return IN_PASSENGER_VEHICLE;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    return MOTORCYCLING;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    return BOATING;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    return IN_WHEELCHAIR;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    return HORSEBACK_RIDING;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    return IN_GONDOLA_LIFT;
                case 35:
                    return CATCHING_POKEMON;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    return IN_TAXI;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    return PARAGLIDING;
                default:
                    return null;
            }
        }
        return UNKNOWN_ACTIVITY_TYPE;
    }

    public static dsrd c() {
        return dqjk.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.L;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.L);
    }
}

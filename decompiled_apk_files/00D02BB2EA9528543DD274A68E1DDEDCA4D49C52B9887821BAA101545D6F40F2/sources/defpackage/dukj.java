package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dukj  reason: default package */
/* loaded from: classes.dex */
public enum dukj implements dsrb {
    APP_STARTED_COLD(0),
    APP_STARTED_HOT(1),
    RUNNING(10),
    APP_BACKGROUNDED(2),
    APP_STARTED_BACKGROUND_COLD(23),
    APP_STARTED_BACKGROUND_HOT(24),
    APP_ENDED_BACKGROUND_FETCH(25),
    PROJECTED_APP_STARTED_COLD(18),
    PROJECTED_APP_STARTED_HOT(19),
    PROJECTED_APP_BACKGROUNDED(20),
    VANAGON_MODE_STARTED(28),
    VANAGON_MODE_ENDED(29),
    APP_CLEARED_DATA(9),
    USER_PREFERENCES_CHANGED(21),
    APP_STARTUP_BROWSER_HANDSHAKE_STARTED(11),
    APP_STARTUP_BROWSER_HANDSHAKE_ENDED(12),
    APP_STARTUP_BROWSER_HANDSHAKE_TIMEOUT(13),
    CHARGING_STATE_CHANGED(3),
    NETWORK_TYPE_CHANGED(4),
    NAVIGATION_STARTED(5),
    NAVIGATION_ENDED(6),
    MANUAL_CACHER_STARTED(7),
    MANUAL_CACHER_COMPLETED(8),
    POWER_SAVING_MODE_WILL_START(14),
    POWER_SAVING_MODE_ENDED(15),
    EXTERNAL_INVOCATION_STARTED(16),
    EXTERNAL_INVOCATION_COMPLETED(17),
    APP_CRASHED(22),
    APP_REPORTED_MEMORY_PRESSURE(26),
    WIDGET_STARTED(27),
    TRANSIT_TRIP_TRACKING_STARTED(30),
    TRANSIT_TRIP_TRACKING_ENDED(31);
    
    public final int G;

    dukj(int i) {
        this.G = i;
    }

    public static dukj b(int i) {
        switch (i) {
            case 0:
                return APP_STARTED_COLD;
            case 1:
                return APP_STARTED_HOT;
            case 2:
                return APP_BACKGROUNDED;
            case 3:
                return CHARGING_STATE_CHANGED;
            case 4:
                return NETWORK_TYPE_CHANGED;
            case 5:
                return NAVIGATION_STARTED;
            case 6:
                return NAVIGATION_ENDED;
            case 7:
                return MANUAL_CACHER_STARTED;
            case 8:
                return MANUAL_CACHER_COMPLETED;
            case 9:
                return APP_CLEARED_DATA;
            case 10:
                return RUNNING;
            case 11:
                return APP_STARTUP_BROWSER_HANDSHAKE_STARTED;
            case 12:
                return APP_STARTUP_BROWSER_HANDSHAKE_ENDED;
            case 13:
                return APP_STARTUP_BROWSER_HANDSHAKE_TIMEOUT;
            case 14:
                return POWER_SAVING_MODE_WILL_START;
            case 15:
                return POWER_SAVING_MODE_ENDED;
            case 16:
                return EXTERNAL_INVOCATION_STARTED;
            case 17:
                return EXTERNAL_INVOCATION_COMPLETED;
            case 18:
                return PROJECTED_APP_STARTED_COLD;
            case 19:
                return PROJECTED_APP_STARTED_HOT;
            case 20:
                return PROJECTED_APP_BACKGROUNDED;
            case 21:
                return USER_PREFERENCES_CHANGED;
            case 22:
                return APP_CRASHED;
            case 23:
                return APP_STARTED_BACKGROUND_COLD;
            case 24:
                return APP_STARTED_BACKGROUND_HOT;
            case 25:
                return APP_ENDED_BACKGROUND_FETCH;
            case 26:
                return APP_REPORTED_MEMORY_PRESSURE;
            case 27:
                return WIDGET_STARTED;
            case 28:
                return VANAGON_MODE_STARTED;
            case 29:
                return VANAGON_MODE_ENDED;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return TRANSIT_TRIP_TRACKING_STARTED;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return TRANSIT_TRIP_TRACKING_ENDED;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return duki.a;
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

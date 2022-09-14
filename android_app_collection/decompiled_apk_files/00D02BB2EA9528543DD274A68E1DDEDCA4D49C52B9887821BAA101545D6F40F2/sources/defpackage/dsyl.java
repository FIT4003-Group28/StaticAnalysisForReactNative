package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dsyl  reason: default package */
/* loaded from: classes6.dex */
public enum dsyl implements dsrb {
    UNKNOWN(0),
    ACP_CONTEXT(24),
    ACTION_HISTORY(14),
    ACTION_HISTORY_EPHEMERAL(44),
    ANSWERS(4),
    ANSWERS_EVAL(30),
    APP_ACTIONS(22),
    APP_SHORTCUTS(55),
    ASSISTANT_ACTION_INTERACTION_EVENT(31),
    ASSISTANT_CONTACT_AFFINITY(35),
    ASSISTANT_GROWTH_PROFILE(34),
    ASSISTANT_HISTORY(39),
    ASSISTANT_SETTINGS(18),
    ASSISTANT_UPDATES_CENTER_POOL(49),
    DEEPLINK(17),
    DEVICE_INSTALLED_APPS(33),
    FOOTPRINTS_FALSE_ACCEPT(40),
    GELLER_CONFIG(36),
    HABITS_PROFILE(32),
    HABITS_AA_PROFILES(45),
    HANDBAG_PERSONALIZED_SLICE_INFO(25),
    HOME_AUTOMATION(15),
    HOME_AUTOMATION_DISCOVERY(50),
    HOME_GRAPH(6),
    HULK_ONDEVICE_PERSONALIZATION(46),
    GDD_WEBREF_WITH_PKG(1000),
    INTERNAL_METRICS_CACHE_STATUS(37),
    INTERNAL_METRICS_CACHE_ACCESS(38),
    JINN_ALL_DJ(11),
    JINN_STARLIGHT(10),
    JINN_VOICE_PROFILE(5),
    MAPS_SEARCH_CLICK(41),
    MAPS_VIEWPORT_UPDATE(54),
    NGA_STASH_CLOUD_ENTITY(28),
    NGA_STASH_CLOUD_RECORD(29),
    NGA_STASH_DEVICE_ENTITY(26),
    NGA_STASH_DEVICE_RECORD(27),
    NGA_STASH_TRIGGER_SPEC(42),
    PEOPLE_API(13),
    PIE_ASSISTANT_USAGE_STATS(43),
    PKG(1),
    PKG_ENTITIES(8),
    PLAYBACK(12),
    PLAYGROUND(9),
    PRIVACY_SETTINGS(21),
    TAPAS_REFLECTION_MODELS(47),
    TAPAS_REFLECTION_TRAINING_BUFFERS(48),
    VAAV2_BLUE_BAR(51),
    TAPAS_USER_PROFILE(52),
    ASSISTANT_DISTILLED_ACTION_USER_MODEL(19);
    
    public final int Y;

    dsyl(int i) {
        this.Y = i;
    }

    public static dsyl b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PKG;
            }
            if (i == 4) {
                return ANSWERS;
            }
            if (i == 5) {
                return JINN_VOICE_PROFILE;
            }
            if (i == 6) {
                return HOME_GRAPH;
            }
            if (i == 21) {
                return PRIVACY_SETTINGS;
            }
            if (i == 22) {
                return APP_ACTIONS;
            }
            if (i == 54) {
                return MAPS_VIEWPORT_UPDATE;
            }
            if (i == 55) {
                return APP_SHORTCUTS;
            }
            if (i == 1000) {
                return GDD_WEBREF_WITH_PKG;
            }
            switch (i) {
                case 8:
                    return PKG_ENTITIES;
                case 9:
                    return PLAYGROUND;
                case 10:
                    return JINN_STARLIGHT;
                case 11:
                    return JINN_ALL_DJ;
                case 12:
                    return PLAYBACK;
                case 13:
                    return PEOPLE_API;
                case 14:
                    return ACTION_HISTORY;
                case 15:
                    return HOME_AUTOMATION;
                default:
                    switch (i) {
                        case 17:
                            return DEEPLINK;
                        case 18:
                            return ASSISTANT_SETTINGS;
                        case 19:
                            return ASSISTANT_DISTILLED_ACTION_USER_MODEL;
                        default:
                            switch (i) {
                                case 24:
                                    return ACP_CONTEXT;
                                case 25:
                                    return HANDBAG_PERSONALIZED_SLICE_INFO;
                                case 26:
                                    return NGA_STASH_DEVICE_ENTITY;
                                case 27:
                                    return NGA_STASH_DEVICE_RECORD;
                                case 28:
                                    return NGA_STASH_CLOUD_ENTITY;
                                case 29:
                                    return NGA_STASH_CLOUD_RECORD;
                                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                    return ANSWERS_EVAL;
                                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                    return ASSISTANT_ACTION_INTERACTION_EVENT;
                                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                    return HABITS_PROFILE;
                                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                    return DEVICE_INSTALLED_APPS;
                                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                    return ASSISTANT_GROWTH_PROFILE;
                                case 35:
                                    return ASSISTANT_CONTACT_AFFINITY;
                                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                    return GELLER_CONFIG;
                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                    return INTERNAL_METRICS_CACHE_STATUS;
                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                    return INTERNAL_METRICS_CACHE_ACCESS;
                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                    return ASSISTANT_HISTORY;
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    return FOOTPRINTS_FALSE_ACCEPT;
                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                    return MAPS_SEARCH_CLICK;
                                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                    return NGA_STASH_TRIGGER_SPEC;
                                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                    return PIE_ASSISTANT_USAGE_STATS;
                                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                    return ACTION_HISTORY_EPHEMERAL;
                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                    return HABITS_AA_PROFILES;
                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                    return HULK_ONDEVICE_PERSONALIZATION;
                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                    return TAPAS_REFLECTION_MODELS;
                                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                    return TAPAS_REFLECTION_TRAINING_BUFFERS;
                                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                    return ASSISTANT_UPDATES_CENTER_POOL;
                                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                    return HOME_AUTOMATION_DISCOVERY;
                                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                    return VAAV2_BLUE_BAR;
                                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                    return TAPAS_USER_PROFILE;
                                default:
                                    return null;
                            }
                    }
            }
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dsyk.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.Y;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.Y);
    }
}

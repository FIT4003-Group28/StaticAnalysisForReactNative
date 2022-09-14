package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dpwt  reason: default package */
/* loaded from: classes.dex */
public enum dpwt implements dsrb {
    EVENT_CATEGORY_UNKNOWN(0),
    EVENT_CATEGORY_SPORTS(1),
    EVENT_CATEGORY_RACE(17),
    EVENT_CATEGORY_RUNNING_RACE(273),
    EVENT_CATEGORY_CAR_RACE(274),
    EVENT_CATEGORY_HORSE_RACE(275),
    EVENT_CATEGORY_CYCLING_RACE(276),
    EVENT_CATEGORY_FITNESS(18),
    EVENT_CATEGORY_SPORTS_MATCH(19),
    EVENT_CATEGORY_BASEBALL(305),
    EVENT_CATEGORY_BASKETBALL(306),
    EVENT_CATEGORY_AMERICAN_FOOTBALL(307),
    EVENT_CATEGORY_SOCCER(308),
    EVENT_CATEGORY_CRICKET(309),
    EVENT_CATEGORY_ICE_HOCKEY(310),
    EVENT_CATEGORY_GROUP_SPORTS(20),
    EVENT_CATEGORY_CELEBRATION(2),
    EVENT_CATEGORY_RELIGIOUS_CELEBRATION(33),
    EVENT_CATEGORY_PARADE(34),
    EVENT_CATEGORY_FAIR(35),
    EVENT_CATEGORY_MUSIC(3),
    EVENT_CATEGORY_CONCERT(49),
    EVENT_CATEGORY_MUSIC_FESTIVAL(50),
    EVENT_CATEGORY_MUSIC_CLASS(51),
    EVENT_CATEGORY_ART(4),
    EVENT_CATEGORY_FASHION_SHOW(65),
    EVENT_CATEGORY_FILM(66),
    EVENT_CATEGORY_THEATER(67),
    EVENT_CATEGORY_COMEDY_SHOW(68),
    EVENT_CATEGORY_FOOD_AND_DRINK(5),
    EVENT_CATEGORY_WINE(81),
    EVENT_CATEGORY_BEER(82),
    EVENT_CATEGORY_CONVENTION(6),
    EVENT_CATEGORY_CRISIS(7),
    EVENT_CATEGORY_PEDESTRIAN_STREET_CRISIS_HACK(1937),
    EVENT_CATEGORY_COMMUNITY(8);
    
    public final int K;

    dpwt(int i) {
        this.K = i;
    }

    public static dpwt b(int i) {
        if (i != 81) {
            if (i == 82) {
                return EVENT_CATEGORY_BEER;
            }
            if (i == 1937) {
                return EVENT_CATEGORY_PEDESTRIAN_STREET_CRISIS_HACK;
            }
            switch (i) {
                case 0:
                    return EVENT_CATEGORY_UNKNOWN;
                case 1:
                    return EVENT_CATEGORY_SPORTS;
                case 2:
                    return EVENT_CATEGORY_CELEBRATION;
                case 3:
                    return EVENT_CATEGORY_MUSIC;
                case 4:
                    return EVENT_CATEGORY_ART;
                case 5:
                    return EVENT_CATEGORY_FOOD_AND_DRINK;
                case 6:
                    return EVENT_CATEGORY_CONVENTION;
                case 7:
                    return EVENT_CATEGORY_CRISIS;
                case 8:
                    return EVENT_CATEGORY_COMMUNITY;
                default:
                    switch (i) {
                        case 17:
                            return EVENT_CATEGORY_RACE;
                        case 18:
                            return EVENT_CATEGORY_FITNESS;
                        case 19:
                            return EVENT_CATEGORY_SPORTS_MATCH;
                        case 20:
                            return EVENT_CATEGORY_GROUP_SPORTS;
                        default:
                            switch (i) {
                                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                    return EVENT_CATEGORY_RELIGIOUS_CELEBRATION;
                                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                    return EVENT_CATEGORY_PARADE;
                                case 35:
                                    return EVENT_CATEGORY_FAIR;
                                default:
                                    switch (i) {
                                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                            return EVENT_CATEGORY_CONCERT;
                                        case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                            return EVENT_CATEGORY_MUSIC_FESTIVAL;
                                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                            return EVENT_CATEGORY_MUSIC_CLASS;
                                        default:
                                            switch (i) {
                                                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                                    return EVENT_CATEGORY_FASHION_SHOW;
                                                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                                    return EVENT_CATEGORY_FILM;
                                                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                                    return EVENT_CATEGORY_THEATER;
                                                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                                    return EVENT_CATEGORY_COMEDY_SHOW;
                                                default:
                                                    switch (i) {
                                                        case 273:
                                                            return EVENT_CATEGORY_RUNNING_RACE;
                                                        case 274:
                                                            return EVENT_CATEGORY_CAR_RACE;
                                                        case 275:
                                                            return EVENT_CATEGORY_HORSE_RACE;
                                                        case 276:
                                                            return EVENT_CATEGORY_CYCLING_RACE;
                                                        default:
                                                            switch (i) {
                                                                case 305:
                                                                    return EVENT_CATEGORY_BASEBALL;
                                                                case 306:
                                                                    return EVENT_CATEGORY_BASKETBALL;
                                                                case 307:
                                                                    return EVENT_CATEGORY_AMERICAN_FOOTBALL;
                                                                case 308:
                                                                    return EVENT_CATEGORY_SOCCER;
                                                                case 309:
                                                                    return EVENT_CATEGORY_CRICKET;
                                                                case 310:
                                                                    return EVENT_CATEGORY_ICE_HOCKEY;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return EVENT_CATEGORY_WINE;
    }

    public static dsrd c() {
        return dpws.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.K;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.K);
    }
}

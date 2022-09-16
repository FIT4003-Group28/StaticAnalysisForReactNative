package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dmwe  reason: default package */
/* loaded from: classes.dex */
public enum dmwe implements dsrb {
    TYPE_ALL(0),
    TYPE_ADMINISTRATIVE(1),
    TYPE_COUNTRY(17),
    TYPE_INTERNATIONAL_DISPUTED_BORDER(273),
    TYPE_TREATY_OR_PROVISIONAL_INTERNATIONAL_BORDER(274),
    TYPE_ADMINISTRATIVE_AREA1(18),
    TYPE_LOCALITY(19),
    TYPE_NEIGHBORHOOD(20),
    TYPE_LAND_PARCEL(21),
    TYPE_POI(2),
    TYPE_BUSINESS(33),
    TYPE_SHOPPING(529),
    TYPE_FOOD_AND_DRINK(530),
    TYPE_GAS_STATION(531),
    TYPE_CAR_RENTAL(532),
    TYPE_LODGING(533),
    TYPE_GOVERNMENT(34),
    TYPE_SCHOOL(35),
    TYPE_MEDICAL(36),
    TYPE_ATTRACTION(37),
    TYPE_PLACE_OF_WORSHIP(38),
    TYPE_SPORTS_COMPLEX(39),
    TYPE_PARK(40),
    TYPE_ROAD(3),
    TYPE_HIGHWAY(49),
    TYPE_CONTROLLED_ACCESS_HIGHWAY(785),
    TYPE_ARTERIAL_ROAD(50),
    TYPE_LOCAL_ROAD(51),
    TYPE_TRANSIT(4),
    TYPE_TRANSIT_LINE(65),
    TYPE_TRANSIT_STATION(66),
    TYPE_RAIL_STATION(1057),
    TYPE_BUS_STOP(1058),
    TYPE_AIRPORT(1059),
    TYPE_FERRY_TERMINAL(1060),
    TYPE_LANDSCAPE(5),
    TYPE_MAN_MADE_STRUCTURE(81),
    TYPE_BUILDING(1297),
    TYPE_BUILT_UP_AREA(1298),
    TYPE_AREA_OF_INTEREST(1299),
    TYPE_NATURAL_FEATURE(82),
    TYPE_LANDCOVER(1313),
    TYPE_TERRAIN(1314),
    TYPE_WATER(6);
    
    public static final dsrc<dmwe> S = new dsrc<dmwe>() { // from class: dmwd
        @Override // defpackage.dsrc
        public final /* bridge */ /* synthetic */ dmwe a(int i) {
            return dmwe.b(i);
        }
    };
    private final int T;

    dmwe(int i) {
        this.T = i;
    }

    public static dmwe b(int i) {
        if (i != 65) {
            if (i == 66) {
                return TYPE_TRANSIT_STATION;
            }
            if (i == 81) {
                return TYPE_MAN_MADE_STRUCTURE;
            }
            if (i == 82) {
                return TYPE_NATURAL_FEATURE;
            }
            if (i == 273) {
                return TYPE_INTERNATIONAL_DISPUTED_BORDER;
            }
            if (i == 274) {
                return TYPE_TREATY_OR_PROVISIONAL_INTERNATIONAL_BORDER;
            }
            switch (i) {
                case 0:
                    return TYPE_ALL;
                case 1:
                    return TYPE_ADMINISTRATIVE;
                case 2:
                    return TYPE_POI;
                case 3:
                    return TYPE_ROAD;
                case 4:
                    return TYPE_TRANSIT;
                case 5:
                    return TYPE_LANDSCAPE;
                case 6:
                    return TYPE_WATER;
                default:
                    switch (i) {
                        case 17:
                            return TYPE_COUNTRY;
                        case 18:
                            return TYPE_ADMINISTRATIVE_AREA1;
                        case 19:
                            return TYPE_LOCALITY;
                        case 20:
                            return TYPE_NEIGHBORHOOD;
                        case 21:
                            return TYPE_LAND_PARCEL;
                        default:
                            switch (i) {
                                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                    return TYPE_BUSINESS;
                                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                    return TYPE_GOVERNMENT;
                                case 35:
                                    return TYPE_SCHOOL;
                                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                    return TYPE_MEDICAL;
                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                    return TYPE_ATTRACTION;
                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                    return TYPE_PLACE_OF_WORSHIP;
                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                    return TYPE_SPORTS_COMPLEX;
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    return TYPE_PARK;
                                case 785:
                                    return TYPE_CONTROLLED_ACCESS_HIGHWAY;
                                case 1313:
                                    return TYPE_LANDCOVER;
                                case 1314:
                                    return TYPE_TERRAIN;
                                default:
                                    switch (i) {
                                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                            return TYPE_HIGHWAY;
                                        case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                            return TYPE_ARTERIAL_ROAD;
                                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                            return TYPE_LOCAL_ROAD;
                                        default:
                                            switch (i) {
                                                case 529:
                                                    return TYPE_SHOPPING;
                                                case 530:
                                                    return TYPE_FOOD_AND_DRINK;
                                                case 531:
                                                    return TYPE_GAS_STATION;
                                                case 532:
                                                    return TYPE_CAR_RENTAL;
                                                case 533:
                                                    return TYPE_LODGING;
                                                default:
                                                    switch (i) {
                                                        case 1057:
                                                            return TYPE_RAIL_STATION;
                                                        case 1058:
                                                            return TYPE_BUS_STOP;
                                                        case 1059:
                                                            return TYPE_AIRPORT;
                                                        case 1060:
                                                            return TYPE_FERRY_TERMINAL;
                                                        default:
                                                            switch (i) {
                                                                case 1297:
                                                                    return TYPE_BUILDING;
                                                                case 1298:
                                                                    return TYPE_BUILT_UP_AREA;
                                                                case 1299:
                                                                    return TYPE_AREA_OF_INTEREST;
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
        return TYPE_TRANSIT_LINE;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.T;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.T);
    }
}

package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dqfn  reason: default package */
/* loaded from: classes.dex */
public enum dqfn implements dsrb {
    UNKNOWN(0),
    RESTAURANTS(1),
    COFFEE(2),
    BARS(3),
    ATTRACTIONS(4),
    EVENTS(5),
    HOTELS(6),
    PARKS(7),
    DEALS(50),
    BRUNCH(8),
    DELIVERY(9),
    DESSERT(10),
    TAKEOUT(11),
    RESERVATIONS(58),
    POPULAR_PLACES_NOW(49),
    APERITIVO(12),
    BAKERY(13),
    BENTO(14),
    DONBURI(15),
    IZAKAYA(16),
    PUBS(17),
    RAMEN(18),
    TAPAS(19),
    TEISHOKU(20),
    ART(21),
    GYMS(22),
    LIBRARIES(23),
    LIVE_MUSIC(24),
    MOVIES(25),
    MUSEUMS(26),
    NIGHTLIFE(27),
    ATMS(28),
    BEAUTY_SALONS(29),
    CAR_RENTALS(30),
    CAR_REPAIR(31),
    CAR_WASH(32),
    DRY_CLEANERS(33),
    ELECTRIC_VEHICLE_CHARGING(47),
    GAS_STATIONS(34),
    HOSPITALS(35),
    MAIL(36),
    PARKING(37),
    PHARMACIES(48),
    POST_OFFICES(53),
    HARDWARE_STORES(55),
    SHOPPING(51),
    BEAUTY_SUPPLIES(38),
    CAR_DEALERS(39),
    CLOTHING_STORES(40),
    CONVENIENCE_STORES(41),
    ELECTRONICS(42),
    GROCERIES(43),
    HOME_IMPROVEMENT_STORES(44),
    SHOPPING_CENTERS(45),
    SPORTING_GOODS(46),
    FLEA_MARKETS(52),
    BOOK_STORES(54),
    FOOD_BANKS(56),
    NIGHT_SHELTERS(57);
    
    public final int ah;

    dqfn(int i) {
        this.ah = i;
    }

    public static dqfn b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return RESTAURANTS;
            case 2:
                return COFFEE;
            case 3:
                return BARS;
            case 4:
                return ATTRACTIONS;
            case 5:
                return EVENTS;
            case 6:
                return HOTELS;
            case 7:
                return PARKS;
            case 8:
                return BRUNCH;
            case 9:
                return DELIVERY;
            case 10:
                return DESSERT;
            case 11:
                return TAKEOUT;
            case 12:
                return APERITIVO;
            case 13:
                return BAKERY;
            case 14:
                return BENTO;
            case 15:
                return DONBURI;
            case 16:
                return IZAKAYA;
            case 17:
                return PUBS;
            case 18:
                return RAMEN;
            case 19:
                return TAPAS;
            case 20:
                return TEISHOKU;
            case 21:
                return ART;
            case 22:
                return GYMS;
            case 23:
                return LIBRARIES;
            case 24:
                return LIVE_MUSIC;
            case 25:
                return MOVIES;
            case 26:
                return MUSEUMS;
            case 27:
                return NIGHTLIFE;
            case 28:
                return ATMS;
            case 29:
                return BEAUTY_SALONS;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return CAR_RENTALS;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return CAR_REPAIR;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return CAR_WASH;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return DRY_CLEANERS;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return GAS_STATIONS;
            case 35:
                return HOSPITALS;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return MAIL;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return PARKING;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return BEAUTY_SUPPLIES;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return CAR_DEALERS;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return CLOTHING_STORES;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return CONVENIENCE_STORES;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return ELECTRONICS;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return GROCERIES;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return HOME_IMPROVEMENT_STORES;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return SHOPPING_CENTERS;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return SPORTING_GOODS;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return ELECTRIC_VEHICLE_CHARGING;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return PHARMACIES;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return POPULAR_PLACES_NOW;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return DEALS;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return SHOPPING;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return FLEA_MARKETS;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return POST_OFFICES;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return BOOK_STORES;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return HARDWARE_STORES;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return FOOD_BANKS;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return NIGHT_SHELTERS;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return RESERVATIONS;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dqfm.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.ah;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ah);
    }
}

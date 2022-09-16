package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dgka  reason: default package */
/* loaded from: classes6.dex */
public enum dgka implements dsrb {
    UNKNOWN_CATEGORY(0),
    AIRPORT(1),
    HOTEL_OR_INN(2),
    ATM_OR_BANK(3),
    ATTRACTION(4),
    BAR_OR_WINERY(5),
    CAFE(6),
    CAR_WASH(7),
    CONVENIENCE_STORE(8),
    BEVERAGE_OR_LIQUOR_STORE(9),
    FLORIST_OR_GARDEN(10),
    GAS_STATION(11),
    GROCERIES_OR_PRODUCE(12),
    HOSPITAL_OR_MEDICAL_CENTER(13),
    LAUNDRY(14),
    MALL_OR_RETAIL(15),
    MOVIE_OR_THEATER(16),
    LIBRARY_OR_BOOKSTORE(17),
    PARKING_LOT(18),
    PHARMACY(19),
    PIZZA(20),
    POST_OFFICE(21),
    PRINT_SHOP_OR_OFFICE_SUPPLY(22),
    RESTAURANT(23),
    SHIPPING(24),
    TAXI(25),
    EDUCATION(26),
    SUBWAY(27),
    FERRY_OR_BOATING(28),
    MOUNTAIN_OR_TRAILS(29),
    OFFICE_OR_CORPORATE(30),
    TRAIN_STATION(31),
    BUS_STATION(32);
    
    private final int H;

    dgka(int i) {
        this.H = i;
    }

    public static dgka b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CATEGORY;
            case 1:
                return AIRPORT;
            case 2:
                return HOTEL_OR_INN;
            case 3:
                return ATM_OR_BANK;
            case 4:
                return ATTRACTION;
            case 5:
                return BAR_OR_WINERY;
            case 6:
                return CAFE;
            case 7:
                return CAR_WASH;
            case 8:
                return CONVENIENCE_STORE;
            case 9:
                return BEVERAGE_OR_LIQUOR_STORE;
            case 10:
                return FLORIST_OR_GARDEN;
            case 11:
                return GAS_STATION;
            case 12:
                return GROCERIES_OR_PRODUCE;
            case 13:
                return HOSPITAL_OR_MEDICAL_CENTER;
            case 14:
                return LAUNDRY;
            case 15:
                return MALL_OR_RETAIL;
            case 16:
                return MOVIE_OR_THEATER;
            case 17:
                return LIBRARY_OR_BOOKSTORE;
            case 18:
                return PARKING_LOT;
            case 19:
                return PHARMACY;
            case 20:
                return PIZZA;
            case 21:
                return POST_OFFICE;
            case 22:
                return PRINT_SHOP_OR_OFFICE_SUPPLY;
            case 23:
                return RESTAURANT;
            case 24:
                return SHIPPING;
            case 25:
                return TAXI;
            case 26:
                return EDUCATION;
            case 27:
                return SUBWAY;
            case 28:
                return FERRY_OR_BOATING;
            case 29:
                return MOUNTAIN_OR_TRAILS;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return OFFICE_OR_CORPORATE;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return TRAIN_STATION;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return BUS_STATION;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dgjz.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.H;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.H);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dnwv  reason: default package */
/* loaded from: classes.dex */
public enum dnwv implements dsrb {
    UNKNOWN_ACTION_TYPE(0),
    RESTAURANT_RESERVATION(1),
    HOTEL_RESERVATION(2),
    APPOINTMENT(3),
    ORDER_FOOD(4),
    SEARCH_INVENTORY(5),
    WAITLIST(6),
    GET_A_QUOTE(7),
    SEE_HOTEL_PRICING(8),
    CHATTY_BOOK(9),
    ORDER_FOOD_DELIVERY(10),
    ORDER_FOOD_PICKUP(11),
    RENT_CAR(12),
    COVID_TESTING_RESTRICTIONS(13),
    BUY_GIFT_CARD(14),
    DONATE(15),
    SHOP_ONLINE(16),
    CALL_BUSINESS(17);
    
    public final int s;

    dnwv(int i) {
        this.s = i;
    }

    public static dnwv b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTION_TYPE;
            case 1:
                return RESTAURANT_RESERVATION;
            case 2:
                return HOTEL_RESERVATION;
            case 3:
                return APPOINTMENT;
            case 4:
                return ORDER_FOOD;
            case 5:
                return SEARCH_INVENTORY;
            case 6:
                return WAITLIST;
            case 7:
                return GET_A_QUOTE;
            case 8:
                return SEE_HOTEL_PRICING;
            case 9:
                return CHATTY_BOOK;
            case 10:
                return ORDER_FOOD_DELIVERY;
            case 11:
                return ORDER_FOOD_PICKUP;
            case 12:
                return RENT_CAR;
            case 13:
                return COVID_TESTING_RESTRICTIONS;
            case 14:
                return BUY_GIFT_CARD;
            case 15:
                return DONATE;
            case 16:
                return SHOP_ONLINE;
            case 17:
                return CALL_BUSINESS;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dnwu.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}

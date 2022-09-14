package defpackage;
/* compiled from: PG */
/* renamed from: drjr  reason: default package */
/* loaded from: classes6.dex */
public enum drjr {
    FLIGHT_RESERVATION,
    HOTEL_RESERVATION,
    TRANSPORTATION_ROUTE_RESERVATION,
    CAR_RENTAL_RESERVATION,
    RESTAURANT_RESERVATION,
    CALENDAR_EVENT,
    SOCIAL_EVENT_RESERVATION,
    ELEMENT_NOT_SET;

    public static drjr a(int i2) {
        if (i2 != 0) {
            if (i2 == 11) {
                return SOCIAL_EVENT_RESERVATION;
            }
            switch (i2) {
                case 3:
                    return FLIGHT_RESERVATION;
                case 4:
                    return HOTEL_RESERVATION;
                case 5:
                    return TRANSPORTATION_ROUTE_RESERVATION;
                case 6:
                    return CAR_RENTAL_RESERVATION;
                case 7:
                    return RESTAURANT_RESERVATION;
                case 8:
                    return CALENDAR_EVENT;
                default:
                    return null;
            }
        }
        return ELEMENT_NOT_SET;
    }
}

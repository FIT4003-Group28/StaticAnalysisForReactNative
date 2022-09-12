package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dghs  reason: default package */
/* loaded from: classes6.dex */
public enum dghs implements dsrb {
    UNKNOWN_ACTION_TYPE(0),
    DIRECTIONS(1),
    ADD_STOP(2),
    CHECK_IN(3),
    ALREADY_HERE(4),
    EXPLORE(5),
    START_NAVIGATION(6),
    BOOK(7),
    CALL(8),
    MESSAGE(9),
    ADD_PARKING(10),
    SHARE(11),
    SAVE(12),
    ADD_PLACE(13),
    ORDER_FOOD(14),
    APPOINTMENT(15),
    RESTAURANT_RESERVATION(16),
    SEE_ON_MAP(17),
    MORE_INFO(18),
    EDIT(19),
    REVIEWS(20),
    MENU(21),
    SEARCH_RESULT_MORE_INFO(22),
    HOME_REVIEW(23),
    DIRECTORY(24),
    DEPART(25),
    WEBSITE(26),
    DOWNLOAD(27),
    PHOTOS(28),
    CLEAR_SAVED_PARKING(29),
    LABEL(30),
    TICKETS(31);
    
    public final int G;

    dghs(int i) {
        this.G = i;
    }

    public static dghs b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTION_TYPE;
            case 1:
                return DIRECTIONS;
            case 2:
                return ADD_STOP;
            case 3:
                return CHECK_IN;
            case 4:
                return ALREADY_HERE;
            case 5:
                return EXPLORE;
            case 6:
                return START_NAVIGATION;
            case 7:
                return BOOK;
            case 8:
                return CALL;
            case 9:
                return MESSAGE;
            case 10:
                return ADD_PARKING;
            case 11:
                return SHARE;
            case 12:
                return SAVE;
            case 13:
                return ADD_PLACE;
            case 14:
                return ORDER_FOOD;
            case 15:
                return APPOINTMENT;
            case 16:
                return RESTAURANT_RESERVATION;
            case 17:
                return SEE_ON_MAP;
            case 18:
                return MORE_INFO;
            case 19:
                return EDIT;
            case 20:
                return REVIEWS;
            case 21:
                return MENU;
            case 22:
                return SEARCH_RESULT_MORE_INFO;
            case 23:
                return HOME_REVIEW;
            case 24:
                return DIRECTORY;
            case 25:
                return DEPART;
            case 26:
                return WEBSITE;
            case 27:
                return DOWNLOAD;
            case 28:
                return PHOTOS;
            case 29:
                return CLEAR_SAVED_PARKING;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return LABEL;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return TICKETS;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dghr.a;
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

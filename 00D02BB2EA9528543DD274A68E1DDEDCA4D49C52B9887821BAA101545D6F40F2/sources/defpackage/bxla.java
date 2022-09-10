package defpackage;
/* compiled from: PG */
/* renamed from: bxla  reason: default package */
/* loaded from: classes4.dex */
public enum bxla {
    UNKNOWN(null, null),
    SEARCH(dtxv.I, null),
    START_LOCATION(dtxn.cC, null),
    VIA_LOCATION(dtxn.cN, null),
    END_LOCATION(dtxn.co, null),
    EVENTS_UGC(dtyd.h, dtyd.i),
    HOME(dtxj.ap, dtxj.aq),
    WORK(dtxj.as, dtxj.at),
    NICKNAME(null, null),
    PLACE_PICKER(null, null),
    PLACE_PICKER_NON_CURRENT_LOCATION(null, null),
    ADD_A_PLACE_ADDRESS_SELECTOR(null, dtya.Q),
    ADD_A_PLACE_SUGGESTION(null, null),
    CATEGORY_SELECTOR(null, dtya.S),
    PLACE_MOVED(null, null),
    CATEGORY_WITH_PRIVATE_LABELS_SELECTOR(null, dtya.S),
    YOUR_DIRECTIONS_SUGGESTION(null, null),
    YOUR_SEARCHES_CATEGORY(null, null),
    CATEGORICAL_LOCATION_PICKER(dtxl.o, dtxl.p);
    
    @dzsi
    public final ddho t;
    @dzsi
    public final ddho u;

    bxla(@dzsi ddho ddhoVar, @dzsi ddho ddhoVar2) {
        this.t = ddhoVar;
        this.u = ddhoVar2;
    }

    public final int a() {
        switch (ordinal()) {
            case 1:
            case 10:
                return 27;
            case 2:
            case 3:
            case 4:
            case 16:
                return 28;
            case 5:
                return 74;
            case 6:
            case 7:
            case 8:
                return 51;
            case 9:
                return 30;
            case 11:
            case 14:
                return 29;
            case 12:
                return 46;
            case 13:
            case 15:
            case 17:
            default:
                return 3;
            case 18:
                return 79;
        }
    }
}

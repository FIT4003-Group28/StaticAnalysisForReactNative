package defpackage;
/* compiled from: PG */
/* renamed from: aufo  reason: default package */
/* loaded from: classes.dex */
public enum aufo implements dsrb {
    UNKNOWN_NOTIFICATION_CHANNEL_GROUP_ID(0),
    TRAFFIC(1),
    COMMUTE(2),
    TRANSIT(3),
    NAVIGATION(4),
    YOUR_CONTRIBUTIONS(5),
    PEOPLE_AND_PLACES(6),
    LOCAL_DISCOVERY(7),
    OFFLINE(8),
    NEW_ON_MAPS(9),
    GROUP_PLANNING(10),
    GETTING_AROUND(11),
    LOCATION_HISTORY_AND_SHARING(12),
    YOUR_BUSINESS(13),
    MAPS_FEATURES(14);
    
    public final int p;

    aufo(int i) {
        this.p = i;
    }

    public static aufo b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_NOTIFICATION_CHANNEL_GROUP_ID;
            case 1:
                return TRAFFIC;
            case 2:
                return COMMUTE;
            case 3:
                return TRANSIT;
            case 4:
                return NAVIGATION;
            case 5:
                return YOUR_CONTRIBUTIONS;
            case 6:
                return PEOPLE_AND_PLACES;
            case 7:
                return LOCAL_DISCOVERY;
            case 8:
                return OFFLINE;
            case 9:
                return NEW_ON_MAPS;
            case 10:
                return GROUP_PLANNING;
            case 11:
                return GETTING_AROUND;
            case 12:
                return LOCATION_HISTORY_AND_SHARING;
            case 13:
                return YOUR_BUSINESS;
            case 14:
                return MAPS_FEATURES;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return aufn.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}

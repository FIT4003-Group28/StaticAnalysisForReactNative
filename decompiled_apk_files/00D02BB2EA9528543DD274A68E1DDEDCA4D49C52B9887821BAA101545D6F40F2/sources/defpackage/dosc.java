package defpackage;
/* compiled from: PG */
/* renamed from: dosc  reason: default package */
/* loaded from: classes.dex */
public enum dosc implements dsrb {
    TYPE_COPYRIGHTS(1),
    TYPE_LANGUAGE_SWITCHER(4),
    TYPE_BICYCLING_LAYER(2),
    TYPE_TRANSIT_LAYER(3),
    TYPE_TRAFFIC_LAYER(5),
    TYPE_REPORT_MAPS_ISSUE(6),
    TYPE_MAPMAKER(7),
    TYPE_TERRAIN_LAYER(8),
    TYPE_RAP_ADD_A_PLACE(9),
    TYPE_REPORT_LOCAL_ISSUE(10),
    TYPE_SAFETY_LAYER(11);
    
    public final int l;

    dosc(int i) {
        this.l = i;
    }

    public static dosc b(int i) {
        switch (i) {
            case 1:
                return TYPE_COPYRIGHTS;
            case 2:
                return TYPE_BICYCLING_LAYER;
            case 3:
                return TYPE_TRANSIT_LAYER;
            case 4:
                return TYPE_LANGUAGE_SWITCHER;
            case 5:
                return TYPE_TRAFFIC_LAYER;
            case 6:
                return TYPE_REPORT_MAPS_ISSUE;
            case 7:
                return TYPE_MAPMAKER;
            case 8:
                return TYPE_TERRAIN_LAYER;
            case 9:
                return TYPE_RAP_ADD_A_PLACE;
            case 10:
                return TYPE_REPORT_LOCAL_ISSUE;
            case 11:
                return TYPE_SAFETY_LAYER;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dosb.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: doay  reason: default package */
/* loaded from: classes6.dex */
public enum doay implements dsrb {
    TYPE_ROAD(1),
    TYPE_POLITICAL(2),
    TYPE_NATURAL(3),
    TYPE_TRANSIT_STATION(4),
    TYPE_GEOCODED_ADDRESS(5),
    TYPE_COMPOUND_BUILDING(7),
    TYPE_COMPOUND_SECTION(8),
    TYPE_ESTABLISHMENT(6),
    UNSUPPORTED(0);
    
    public final int j;

    doay(int i) {
        this.j = i;
    }

    public static doay b(int i) {
        switch (i) {
            case 0:
                return UNSUPPORTED;
            case 1:
                return TYPE_ROAD;
            case 2:
                return TYPE_POLITICAL;
            case 3:
                return TYPE_NATURAL;
            case 4:
                return TYPE_TRANSIT_STATION;
            case 5:
                return TYPE_GEOCODED_ADDRESS;
            case 6:
                return TYPE_ESTABLISHMENT;
            case 7:
                return TYPE_COMPOUND_BUILDING;
            case 8:
                return TYPE_COMPOUND_SECTION;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return doax.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}

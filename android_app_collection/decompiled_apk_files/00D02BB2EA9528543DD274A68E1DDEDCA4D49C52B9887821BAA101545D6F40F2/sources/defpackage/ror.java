package defpackage;
/* compiled from: PG */
/* renamed from: ror  reason: default package */
/* loaded from: classes7.dex */
public enum ror {
    HOME(0),
    WORK(1),
    TRAVEL_MODE(2),
    SCHEDULE(3),
    TRANSIT_ROUTE_TO_WORK(4),
    TRANSIT_ROUTE_TO_HOME(8),
    RECEIPT(7),
    MULTIMODAL_ROUTE_TO_WORK(9),
    MULTIMODAL_ROUTE_TO_HOME(10),
    TRANSIT_ROUTE_BUILDER_TO_WORK(11),
    TRANSIT_ROUTE_BUILDER_TO_HOME(12),
    INFERRED_HOME(13),
    INFERRED_WORK(14);
    
    public final int n;

    ror(int i) {
        this.n = i;
    }

    @dzsi
    public static ror a(int i) {
        ror[] values;
        for (ror rorVar : values()) {
            if (rorVar.n == i) {
                return rorVar;
            }
        }
        return null;
    }
}

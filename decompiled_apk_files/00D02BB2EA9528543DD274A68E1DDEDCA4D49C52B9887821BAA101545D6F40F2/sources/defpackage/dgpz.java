package defpackage;
/* compiled from: PG */
/* renamed from: dgpz  reason: default package */
/* loaded from: classes6.dex */
public enum dgpz implements dsrb {
    UNKNOWN_TYPE(0),
    METADATA_TYPE(1),
    VEHICLE_LOCATION_TYPE(2),
    LOCAL_FRAME_TYPE(3),
    SEGMENT_GEOMETRY_TYPE(4),
    SEGMENT_CONNECTIVITY_TYPE(5),
    SEGMENT_ATTRIBUTE_TYPE(10),
    PREDICTED_ROUTE_TREE_TYPE(13),
    LINEAR_FEATURE_SPEED_TYPE(14),
    SIGN_ELEMENT_TYPE(6),
    NAVIGATION_TYPE(7),
    LANE_LOGICAL_DETAIL_TYPE(8),
    LANE_PHYSICAL_DETAIL_TYPE(9),
    UNCERTAINTY_RELATION_TYPE(11),
    WEATHER_STATE_TYPE(12),
    UNRECOGNIZED(-1);
    
    private final int q;

    dgpz(int i) {
        this.q = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}

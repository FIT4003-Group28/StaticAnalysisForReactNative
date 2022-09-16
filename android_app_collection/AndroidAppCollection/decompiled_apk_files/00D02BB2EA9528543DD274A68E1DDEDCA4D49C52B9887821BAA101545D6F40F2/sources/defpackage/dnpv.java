package defpackage;
/* compiled from: PG */
/* renamed from: dnpv  reason: default package */
/* loaded from: classes6.dex */
public enum dnpv implements dsrb {
    UNKNOWN_TAG(0),
    ORIGINAL_FEATURE_TYPE(1),
    REDIRECTED_TO_ADDRESS(2),
    DETECTED_ADDRESS(3),
    REDIRECTED_TO_ADDRESS_FROM_FEATURE_ID(4),
    ORIGINAL_ENTRY_POINT_TYPE(5),
    ROUTE_PICKER_DIALOG_RESULT(6),
    EXPERIMENT_ARM_FEATURE_PICKER_WITH_DISAMBIGUATION(7),
    EXPERIMENT_ARM_FEATURE_ROUTE_DATA_FOR_CLIENT(8),
    RAP_WIZARD_VERSION(9),
    ORIGINAL_FEATURE_ID(10),
    ORIGINAL_POINT(11),
    RAP_WIZARD_WEBVIEW_VERSION(12),
    EXPERIMENT_ARM_FEATURE_MULTI_MISSING_ROAD(13),
    EXPERIMENT_ARM_FEATURE_MULTI_MISSING_ROAD_SNAPPING(14),
    ROAD_RAP_EXTENT_PICKER(15),
    CATEGORY_SELECTION_SOURCE(16),
    RENAME_IN_REPORT_MISSING_ROAD(17),
    EXISTENCE_EDIT_SOURCE(18),
    EXPERIMENT_ARM_FEATURE_ROAD_EXTENT_SELECTION(19),
    CURRENT_EXISTENCE_STATE(20);
    
    public final int v;

    dnpv(int i) {
        this.v = i;
    }

    public static dnpv b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TAG;
            case 1:
                return ORIGINAL_FEATURE_TYPE;
            case 2:
                return REDIRECTED_TO_ADDRESS;
            case 3:
                return DETECTED_ADDRESS;
            case 4:
                return REDIRECTED_TO_ADDRESS_FROM_FEATURE_ID;
            case 5:
                return ORIGINAL_ENTRY_POINT_TYPE;
            case 6:
                return ROUTE_PICKER_DIALOG_RESULT;
            case 7:
                return EXPERIMENT_ARM_FEATURE_PICKER_WITH_DISAMBIGUATION;
            case 8:
                return EXPERIMENT_ARM_FEATURE_ROUTE_DATA_FOR_CLIENT;
            case 9:
                return RAP_WIZARD_VERSION;
            case 10:
                return ORIGINAL_FEATURE_ID;
            case 11:
                return ORIGINAL_POINT;
            case 12:
                return RAP_WIZARD_WEBVIEW_VERSION;
            case 13:
                return EXPERIMENT_ARM_FEATURE_MULTI_MISSING_ROAD;
            case 14:
                return EXPERIMENT_ARM_FEATURE_MULTI_MISSING_ROAD_SNAPPING;
            case 15:
                return ROAD_RAP_EXTENT_PICKER;
            case 16:
                return CATEGORY_SELECTION_SOURCE;
            case 17:
                return RENAME_IN_REPORT_MISSING_ROAD;
            case 18:
                return EXISTENCE_EDIT_SOURCE;
            case 19:
                return EXPERIMENT_ARM_FEATURE_ROAD_EXTENT_SELECTION;
            case 20:
                return CURRENT_EXISTENCE_STATE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dnpu.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}

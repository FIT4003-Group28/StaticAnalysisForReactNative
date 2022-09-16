package defpackage;
/* compiled from: PG */
/* renamed from: wvv  reason: default package */
/* loaded from: classes4.dex */
public final class wvv {
    public static final amty a;
    public static final amty b;
    public static final amty c;
    public static final amty d;
    public static final amty e;

    static {
        amtw b2 = amty.b();
        b2.c(8, apce.TRIGGER_CATEGORY_SLOT_ENTRY);
        b2.c(7, apce.TRIGGER_CATEGORY_SLOT_FULFILLMENT);
        b2.c(6, apce.TRIGGER_CATEGORY_SLOT_EXPIRATION);
        b2.c(1, apce.TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL);
        b2.c(2, apce.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED);
        b2.c(3, apce.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED);
        b2.c(4, apce.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED);
        b2.c(5, apce.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED);
        b2.c(0, apce.TRIGGER_CATEGORY_PING_DISPATCH);
        a = b2.b();
        amtw b3 = amty.b();
        b3.c(0, apca.CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED);
        b3.c(1, apca.CONTROL_FLOW_MANAGER_LAYER_CORE);
        b3.c(2, apca.CONTROL_FLOW_MANAGER_LAYER_ADAPTER);
        b3.c(3, apca.CONTROL_FLOW_MANAGER_LAYER_SURFACE);
        b3.c(4, apca.CONTROL_FLOW_MANAGER_LAYER_EXTERNAL);
        b = b3.b();
        amtw b4 = amty.b();
        b4.c(0, apbz.ADS_CLIENT_EVENT_TYPE_NORMAL_EXIT_LAYOUT_REQUESTED);
        b4.c(2, apbz.ADS_CLIENT_EVENT_TYPE_SKIP_EXIT_LAYOUT_REQUESTED);
        b4.c(3, apbz.ADS_CLIENT_EVENT_TYPE_MUTE_EXIT_LAYOUT_REQUESTED);
        b4.c(4, apbz.ADS_CLIENT_EVENT_TYPE_ABANDON_EXIT_LAYOUT_REQUESTED);
        b4.c(5, apbz.ADS_CLIENT_EVENT_TYPE_USER_INPUT_SUBMITTED_EXIT_LAYOUT_REQUESTED);
        b4.c(6, apbz.ADS_CLIENT_EVENT_TYPE_USER_CANCELLED_EXIT_LAYOUT_REQUESTED);
        c = b4.b();
        amtw b5 = amty.b();
        b5.c(0, apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_NORMALLY);
        b5.c(2, apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_SKIP);
        b5.c(3, apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_MUTE);
        b5.c(4, apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_ABANDON);
        b5.c(5, apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_INPUT_SUBMITTED);
        b5.c(6, apbz.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_CANCELLED);
        d = b5.b();
        amtw b6 = amty.b();
        b6.c(1, "TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL");
        b6.c(2, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED");
        b6.c(3, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED");
        b6.c(4, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED");
        b6.c(5, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED");
        b6.c(6, "TRIGGER_CATEGORY_SLOT_EXPIRATION");
        b6.c(7, "TRIGGER_CATEGORY_SLOT_FULFILLMENT");
        b6.c(8, "TRIGGER_CATEGORY_SLOT_ENTRY");
        b6.c(0, "TRIGGER_CATEGORY_PING_DISPATCH");
        b6.b();
        amtw b7 = amty.b();
        b7.c("AD_CPN", apcc.AD_CLIENT_PLAYBACK_NONCE_KEY);
        b7.c("AD_MT", apcc.AD_CURRENT_TIME_MS);
        b7.c("BLOCKING_ERROR", apcc.BLOCKING_ERROR);
        b7.c("CPN", apcc.CLIENT_PLAYBACK_NONCE_KEY);
        b7.c("ERROR_MSG", apcc.ERROR_MESSAGE);
        b7.c("GOOGLE_VIEWABILITY", apcc.GOOGLE_VIEWABILITY);
        b7.c("INTERNAL_ID", apcc.INTERNAL_ID);
        b7.c("I_X", apcc.AD_INTERACTION_X);
        b7.c("I_Y", apcc.AD_INTERACTION_Y);
        b7.c("MIDROLL_POS", apcc.MIDROLL_POS_SEC);
        b7.c("MOAT_VIEWABILITY", apcc.THIRD_PARTY_VIEWABILITY);
        b7.c("MT", apcc.CONTENT_CURRENT_TIME_MS);
        b7.c("P_H", apcc.PLAYER_HEIGHT);
        b7.c("P_W", apcc.PLAYER_WIDTH);
        b7.c("RWT", apcc.REQUEST_WALL_TIME_MS);
        b7.c("VIEWABILITY", apcc.ACTIVE_VIEW);
        b7.c("VIS", apcc.PLAYER_VISIBILITY);
        b7.c("VSS_AD_CPN", apcc.VSS_AD_CLIENT_PLAYBACK_NONCE_KEY);
        b7.c("YT_ERROR_CODE", apcc.YT_ERROR_CODE);
        e = b7.b();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: akvk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akvk implements amqo {
    public final /* synthetic */ akvm a;
    private final /* synthetic */ int b;

    public /* synthetic */ akvk(akvm akvmVar) {
        this.a = akvmVar;
    }

    public /* synthetic */ akvk(akvm akvmVar, int i) {
        this.b = i;
        this.a = akvmVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        switch (this.b) {
            case 0:
                vpg e = this.a.a.e("/client_streamz/youtube/notifications/push_count", vpf.c("event_type"), vpf.a("is_error"));
                e.c();
                return e;
            case 1:
                vpg e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", vpf.c("filling_type"));
                e2.c();
                return e2;
            case 2:
                vpg e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", vpf.c("message_type"));
                e3.c();
                return e3;
            case 3:
                vpg e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", vpf.c("state_entry_data_type"), vpf.c("exp_tag"));
                e4.c();
                return e4;
            case 4:
                vpg e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", vpf.c("event_type"), vpf.a("is_success"));
                e5.c();
                return e5;
            case 5:
                vpg e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", vpf.c("registration_trigger"));
                e6.c();
                return e6;
            case 6:
                vpg e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", vpf.c("registration_event"));
                e7.c();
                return e7;
            case 7:
                vpg e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", vpf.c("page_type"));
                e8.c();
                return e8;
            case 8:
                vpg e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", vpf.c("page_type"));
                e9.c();
                return e9;
            case 9:
                vpd b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new vpf[0]);
                b.c();
                return b;
            case 10:
                vpg e10 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", vpf.c("state_entry_data_type"), vpf.c("exp_tag"));
                e10.c();
                return e10;
            case 11:
                vpg e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", vpf.c("state_entry_data_type"), vpf.c("exp_tag"));
                e11.c();
                return e11;
            case 12:
                vpg e12 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", vpf.c("state_entry_data_type"), vpf.c("exp_tag"));
                e12.c();
                return e12;
            case 13:
                vpd b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", vpf.c("cue_duration_state"), vpf.a("is_forced_return"));
                b2.c();
                return b2;
            case 14:
                vpg e13 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", vpf.a("is_cue_start_time_changed"), vpf.a("has_predict_start_cuepoint"), vpf.a("has_start_cuepoint"), vpf.a("has_continue_cuepoint"), vpf.a("has_stop_cuepoint"));
                e13.c();
                return e13;
            case 15:
                vpg e14 = this.a.a.e("/client_streamz/youtube/image_load", vpf.c("image_service_type"), vpf.c("cache_type"), vpf.a("is_error"));
                e14.c();
                return e14;
            case 16:
                vpg e15 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", vpf.a("is_a11y_enabled"), vpf.c("kazoo_client"));
                e15.c();
                return e15;
            case 17:
                vpg e16 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", vpf.c("encoder"), vpf.c("codec"));
                e16.c();
                return e16;
            case 18:
                vpg e17 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", vpf.c("result"));
                e17.c();
                return e17;
            case 19:
                vpg e18 = this.a.a.e("/client_streamz/youtube/music/queue/creation_event_count", vpf.c("queue_creation_status"));
                e18.c();
                return e18;
            default:
                vpg e19 = this.a.a.e("/client_streamz/youtube/music/offline/missing_offline_music_data", vpf.c("type"));
                e19.c();
                return e19;
        }
    }
}

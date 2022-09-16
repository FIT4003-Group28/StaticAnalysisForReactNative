package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gcz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gcz implements gdf {
    private final /* synthetic */ int k;
    public static final /* synthetic */ gcz j = new gcz(9);
    public static final /* synthetic */ gcz i = new gcz(8);
    public static final /* synthetic */ gcz h = new gcz(7);
    public static final /* synthetic */ gcz g = new gcz(6);
    public static final /* synthetic */ gcz f = new gcz(5);
    public static final /* synthetic */ gcz e = new gcz(4);
    public static final /* synthetic */ gcz d = new gcz(3);
    public static final /* synthetic */ gcz c = new gcz(2);
    public static final /* synthetic */ gcz b = new gcz(1);
    public static final /* synthetic */ gcz a = new gcz();

    private /* synthetic */ gcz() {
    }

    private /* synthetic */ gcz(int i2) {
        this.k = i2;
    }

    @Override // defpackage.gdf
    public final gcu a(Context context, Runnable runnable) {
        switch (this.k) {
            case 0:
                return new gcu(context, 2131232742, R.string.playback_control_next, R.string.playback_control_next, "com.google.android.libraries.youtube.player.action.controller_notification_next", runnable);
            case 1:
                return new gcu(context, 2131232613, R.string.pip_cancel_autoplay, R.string.pip_cancel_autoplay, "com.google.android.youtube.action.autonav.cancel", runnable);
            case 2:
                return new gcu(context, 2131232640, R.string.playback_control_play_pause, R.string.accessibility_pause, "com.google.android.libraries.youtube.player.action.controller_notification_pause", runnable);
            case 3:
                return new gcu(context, 2131232669, R.string.playback_control_play_pause, R.string.accessibility_play, "com.google.android.libraries.youtube.player.action.controller_notification_play", runnable);
            case 4:
                return new gcu(context, 2131232669, R.string.pip_play_next_video, R.string.pip_play_next_video, "com.google.android.youtube.action.autonav.play", runnable);
            case 5:
                return new gcu(context, 2131232748, R.string.playback_control_previous, R.string.accessibility_previous, "com.google.android.libraries.youtube.player.action.controller_notification_prev", runnable);
            case 6:
                return new gcu(context, 2131232708, R.string.pip_playback_control_replay, R.string.pip_playback_control_replay, "com.google.android.libraries.youtube.player.action.controller_notification_replay", runnable);
            case 7:
                return new gcu(context, 2131232708, R.string.pip_playback_control_retry, R.string.pip_playback_control_retry, "com.google.android.libraries.youtube.player.action.controller_notification_retry", runnable);
            case 8:
                return new gcu(context, 2131232742, R.string.skip_ad, R.string.skip_ad, "com.google.android.libraries.youtube.player.action.controller_notification_skip_ad", runnable);
            default:
                return new gcu(context, 2131232536, R.string.playback_control_background_playback, R.string.playback_control_background_playback, "com.google.android.youtube.action.background", runnable);
        }
    }
}

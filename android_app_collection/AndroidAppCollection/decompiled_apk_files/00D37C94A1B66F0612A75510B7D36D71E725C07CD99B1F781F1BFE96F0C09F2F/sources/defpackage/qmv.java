package defpackage;

import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
/* compiled from: PG */
/* renamed from: qmv  reason: default package */
/* loaded from: classes4.dex */
public final class qmv {
    private final String b = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";
    public NotificationOptions a = new NotificationOptions(NotificationOptions.a, NotificationOptions.b, 10000, null, tqj.am("smallIconDrawableResId"), tqj.am("stopLiveStreamDrawableResId"), tqj.am("pauseDrawableResId"), tqj.am("playDrawableResId"), tqj.am("skipNextDrawableResId"), tqj.am("skipPrevDrawableResId"), tqj.am("forwardDrawableResId"), tqj.am("forward10DrawableResId"), tqj.am("forward30DrawableResId"), tqj.am("rewindDrawableResId"), tqj.am("rewind10DrawableResId"), tqj.am("rewind30DrawableResId"), tqj.am("disconnectDrawableResId"), tqj.am("notificationImageSizeDimenResId"), tqj.am("castingToDeviceStringResId"), tqj.am("stopLiveStreamStringResId"), tqj.am("pauseStringResId"), tqj.am("playStringResId"), tqj.am("skipNextStringResId"), tqj.am("skipPrevStringResId"), tqj.am("forwardStringResId"), tqj.am("forward10StringResId"), tqj.am("forward30StringResId"), tqj.am("rewindStringResId"), tqj.am("rewind10StringResId"), tqj.am("rewind30StringResId"), tqj.am("disconnectStringResId"), null);

    public final CastMediaOptions a() {
        return new CastMediaOptions(this.b, null, null, this.a, false, true);
    }
}

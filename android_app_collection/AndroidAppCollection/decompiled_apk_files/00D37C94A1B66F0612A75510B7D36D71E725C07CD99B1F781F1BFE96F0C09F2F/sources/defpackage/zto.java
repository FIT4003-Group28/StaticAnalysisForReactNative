package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
/* compiled from: PG */
/* renamed from: zto  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zto implements ampt {
    private final /* synthetic */ int v;
    public static final /* synthetic */ zto u = new zto(20);
    public static final /* synthetic */ zto t = new zto(19);
    public static final /* synthetic */ zto s = new zto(18);
    public static final /* synthetic */ zto r = new zto(17);
    public static final /* synthetic */ zto q = new zto(16);
    public static final /* synthetic */ zto p = new zto(15);
    public static final /* synthetic */ zto o = new zto(14);
    public static final /* synthetic */ zto n = new zto(13);
    public static final /* synthetic */ zto m = new zto(12);
    public static final /* synthetic */ zto l = new zto(11);
    public static final /* synthetic */ zto k = new zto(10);
    public static final /* synthetic */ zto j = new zto(9);
    public static final /* synthetic */ zto i = new zto(8);
    public static final /* synthetic */ zto h = new zto(7);
    public static final /* synthetic */ zto g = new zto(6);
    public static final /* synthetic */ zto f = new zto(5);
    public static final /* synthetic */ zto e = new zto(4);
    public static final /* synthetic */ zto d = new zto(3);
    public static final /* synthetic */ zto c = new zto(2);
    public static final /* synthetic */ zto b = new zto(1);
    public static final /* synthetic */ zto a = new zto();

    private /* synthetic */ zto() {
    }

    private /* synthetic */ zto(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampt
    public final boolean a(Object obj) {
        apzg apzgVar;
        switch (this.v) {
            case 0:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str) && str.startsWith("VISITED_EFFECT_ID_")) {
                    return true;
                }
                break;
            case 1:
                return ((axat) obj).q();
            case 2:
                aqzx aqzxVar = (aqzx) obj;
                VideoStreamingData videoStreamingData = VideoStreamingData.a;
                return !aanp.d(aqzxVar.f) || !aank.d().contains(Integer.valueOf(aqzxVar.d));
            case 3:
                aqzx aqzxVar2 = (aqzx) obj;
                VideoStreamingData videoStreamingData2 = VideoStreamingData.a;
                return !aanp.d(aqzxVar2.f) || FormatStreamModel.g(aqzxVar2.i, aqzxVar2.j) <= 480;
            case 4:
                aqzx aqzxVar3 = (aqzx) obj;
                VideoStreamingData videoStreamingData3 = VideoStreamingData.a;
                return !aanp.d(aqzxVar3.f) || !FormatStreamModel.I(aqzxVar3);
            case 5:
                return yhq.a((cff) obj);
            case 6:
                String str2 = (String) obj;
                return "exo_cache_size_bytes_used".equals(str2) || str2.startsWith("av1_supported") || str2.startsWith("h264_main_profile_supported") || str2.startsWith("vp9_profile_2_hdr_10_plus_supported") || str2.startsWith("vp9_profile_2_supported") || str2.startsWith("vp9_secure_profile_2_supported") || str2.startsWith("vp9_secure_supported") || str2.startsWith("vp9_supported") || str2.startsWith("opus_supported") || str2.endsWith("last_manual_video_quality_selection_max") || str2.endsWith("last_manual_video_quality_selection_min") || str2.endsWith("last_manual_video_quality_selection_direction") || str2.endsWith("last_manual_video_quality_selection_timestamp") || str2.endsWith("last_playback_start_timestamp") || str2.equals(aeas.LIMIT_MOBILE_DATA_USAGE) || str2.equals("dcip3_supported") || "media_persisted_bandwidth_samples".equals(str2);
            case 7:
                String str3 = (String) obj;
                return true;
            case 8:
                String str4 = (String) obj;
                return str4.startsWith("com.google.android.libraries.youtube.notification.badgecount.badgecount") || str4.startsWith("com.google.android.libraries.youtube.notification.pref.notification_channel_importance") || str4.startsWith("com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled");
            case 9:
                atrf atrfVar = (atrf) obj;
                return true;
            case 10:
                atrf atrfVar2 = (atrf) obj;
                return false;
            case 11:
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
                return playerResponseModel != null && playerResponseModel.E();
            case 12:
                WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
                return (watchNextResponseModel == null || (apzgVar = watchNextResponseModel.c) == null || !apzgVar.qn(attg.a)) ? false : true;
            case 13:
                PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) obj;
                int i2 = agvl.h;
                return true;
            case 14:
                PlaybackStartDescriptor playbackStartDescriptor2 = (PlaybackStartDescriptor) obj;
                int i3 = agvl.h;
                return true;
            case 15:
                String str5 = (String) obj;
                return (!TextUtils.isEmpty(str5) && str5.startsWith("playability_adult_confirmation_time_stamp:")) || aiow.f(str5);
            case 16:
                apzg apzgVar2 = (apzg) obj;
                return apzgVar2.qn(WatchEndpointOuterClass.watchEndpoint) || apzgVar2.qn(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint);
            case 17:
                Float f2 = (Float) obj;
                amuk amukVar = ajke.a;
                return f2.floatValue() >= 0.0f && f2.floatValue() <= 1.0f;
            case 18:
                ajtb ajtbVar = (ajtb) obj;
                if (ajtbVar == null) {
                    return false;
                }
                return !ajtbVar.a.isEmpty() || !ajtbVar.b.isEmpty();
            case 19:
                View view = (View) obj;
                if (view instanceof ViewGroup) {
                    Object tag = view.getTag(R.id.visual_element_container_tag);
                    if (tag instanceof actd) {
                        return ((actd) tag).b;
                    }
                }
                return false;
            default:
                if (((aurp) obj).b == 64166933) {
                    return true;
                }
                break;
        }
        return false;
    }
}

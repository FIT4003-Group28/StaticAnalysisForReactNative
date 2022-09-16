package defpackage;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.app.settings.videoquality.VideoQualityCheckBoxPreference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: llw  reason: default package */
/* loaded from: classes3.dex */
public final class llw {
    public static final amuk a = amuk.t("mobile_video_quality_auto_key", "mobile_video_quality_high_key", "mobile_video_quality_low_key");
    public static final amuk b = amuk.t("wifi_video_quality_auto_key", "wifi_video_quality_high_key", "wifi_video_quality_low_key");
    public final yve c;
    public final snc d;
    public final aypf e = new aypf();
    public final aadd f;
    public final acti g;
    public boolean h;
    public boolean i;

    public llw(yve yveVar, snc sncVar, aadd aaddVar, acth acthVar) {
        this.c = yveVar;
        this.d = sncVar;
        this.f = aaddVar;
        this.g = acthVar.oi();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final actj c(String str) {
        char c;
        switch (str.hashCode()) {
            case -1397913968:
                if (str.equals("mobile_video_quality_auto_key")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -226929405:
                if (str.equals("mobile_video_quality_high_key")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 819494931:
                if (str.equals("mobile_video_quality_low_key")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 893580870:
                if (str.equals("wifi_video_quality_low_key")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 898750141:
                if (str.equals("wifi_video_quality_auto_key")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2069734704:
                if (str.equals("wifi_video_quality_high_key")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                return actj.VIDEO_QUALITY_PERSISTENT_SETTINGS_WIFI_HIGHER_QUALITY;
            }
            if (c == 2) {
                return actj.VIDEO_QUALITY_PERSISTENT_SETTINGS_MOBILE_NETWORK_DATA_SAVER;
            }
            if (c == 3) {
                return actj.VIDEO_QUALITY_PERSISTENT_SETTINGS_WIFI_DATA_SAVER;
            }
            if (c == 4) {
                return actj.VIDEO_QUALITY_PERSISTENT_SETTINGS_MOBILE_NETWORK_AUTO;
            }
            if (c == 5) {
                return actj.VIDEO_QUALITY_PERSISTENT_SETTINGS_WIFI_AUTO;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 96);
            sb.append("Unknown preference key (");
            sb.append(str);
            sb.append(")! returning Visual Element VIDEO_QUALITY_PERSISTENT_SETTINGS_WIFI_AUTO.");
            zep.n(sb.toString(), new Exception());
            return actj.VIDEO_QUALITY_PERSISTENT_SETTINGS_WIFI_AUTO;
        }
        return actj.VIDEO_QUALITY_PERSISTENT_SETTINGS_MOBILE_NETWORK_HIGHER_QUALITY;
    }

    public final void b(bkb bkbVar, amuk amukVar, final ampg ampgVar) {
        final ArrayList arrayList = new ArrayList();
        int i = ((amxx) amukVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) amukVar.get(i2);
            if (this.h) {
                this.g.n(new acte(c(str)));
            }
            final VideoQualityCheckBoxPreference videoQualityCheckBoxPreference = (VideoQualityCheckBoxPreference) bkbVar.d(str);
            videoQualityCheckBoxPreference.getClass();
            videoQualityCheckBoxPreference.n = new bjf() { // from class: llt
                @Override // defpackage.bjf
                public final boolean a(Preference preference, Object obj) {
                    llw llwVar = llw.this;
                    VideoQualityCheckBoxPreference videoQualityCheckBoxPreference2 = videoQualityCheckBoxPreference;
                    llwVar.i = true;
                    llwVar.g.H(3, new acte(llw.c(((VideoQualityCheckBoxPreference) preference).s)), null);
                    return !((TwoStatePreference) videoQualityCheckBoxPreference2).a;
                }
            };
            arrayList.add(videoQualityCheckBoxPreference);
        }
        this.e.d(this.c.d().I().G(aypa.a()).Z(new ayqb() { // from class: llv
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                char c;
                awan awanVar;
                ampg ampgVar2 = ampg.this;
                List<VideoQualityCheckBoxPreference> list = arrayList;
                amuk amukVar2 = llw.a;
                awan awanVar2 = (awan) ampgVar2.apply((awuj) obj);
                for (VideoQualityCheckBoxPreference videoQualityCheckBoxPreference2 : list) {
                    String str2 = videoQualityCheckBoxPreference2.s;
                    switch (str2.hashCode()) {
                        case -226929405:
                            if (str2.equals("mobile_video_quality_high_key")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 819494931:
                            if (str2.equals("mobile_video_quality_low_key")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 893580870:
                            if (str2.equals("wifi_video_quality_low_key")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2069734704:
                            if (str2.equals("wifi_video_quality_high_key")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0 || c == 1) {
                        awanVar = awan.VIDEO_QUALITY_SETTING_HIGHER_QUALITY;
                    } else if (c == 2 || c == 3) {
                        awanVar = awan.VIDEO_QUALITY_SETTING_DATA_SAVER;
                    } else {
                        awanVar = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
                    }
                    if (((TwoStatePreference) videoQualityCheckBoxPreference2).a && awanVar != awanVar2) {
                        videoQualityCheckBoxPreference2.k(false);
                    }
                }
            }
        }));
    }
}

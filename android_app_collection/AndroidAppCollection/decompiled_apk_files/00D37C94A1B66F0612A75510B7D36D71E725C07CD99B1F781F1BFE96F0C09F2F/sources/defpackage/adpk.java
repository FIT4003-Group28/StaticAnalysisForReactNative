package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adpk  reason: default package */
/* loaded from: classes.dex */
final class adpk implements Runnable {
    final /* synthetic */ adpl a;
    private final SubtitleTrack b;

    public adpk(adpl adplVar, SubtitleTrack subtitleTrack) {
        this.a = adplVar;
        this.b = subtitleTrack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        adpl adplVar = this.a;
        adplVar.ad = null;
        if (!adplVar.aH()) {
            return;
        }
        adpl adplVar2 = this.a;
        SubtitleTrack subtitleTrack = this.b;
        if (!adplVar2.L.f()) {
            return;
        }
        adip adipVar = new adip();
        if (subtitleTrack == null || subtitleTrack.p() || subtitleTrack.l()) {
            adipVar.a("videoId", adplVar2.L.b);
        } else {
            adipVar.a("format", String.valueOf(subtitleTrack.a()));
            adipVar.a("languageCode", subtitleTrack.c());
            adipVar.a("languageName", subtitleTrack.d());
            adipVar.a("sourceLanguageCode", subtitleTrack.c());
            adipVar.a("trackName", subtitleTrack.g());
            adipVar.a("vss_id", subtitleTrack.j());
            adipVar.a("videoId", adplVar2.L.b);
            float a = adplVar2.m.a();
            SubtitlesStyle b = adplVar2.m.b();
            HashMap hashMap = new HashMap();
            hashMap.put("background", SubtitlesStyle.a(b.a));
            hashMap.put("backgroundOpacity", SubtitlesStyle.b(b.a));
            hashMap.put("color", SubtitlesStyle.a(b.e));
            hashMap.put("textOpacity", SubtitlesStyle.b(b.e));
            hashMap.put("fontSizeRelative", String.format(Locale.US, "%.2f", Float.valueOf(a)));
            hashMap.put("windowColor", SubtitlesStyle.a(b.b));
            hashMap.put("windowOpacity", SubtitlesStyle.b(b.b));
            int i = b.d;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "raised";
                    } else if (i == 4) {
                        str = "depressed";
                    } else if (i != 5) {
                        str = "none";
                    }
                }
                str = "dropShadow";
            } else {
                str = "uniform";
            }
            hashMap.put("charEdgeStyle", str);
            switch (b.f) {
                case 0:
                    str2 = "monoSerif";
                    break;
                case 1:
                    str2 = "propSerif";
                    break;
                case 2:
                    str2 = "monoSans";
                    break;
                case 3:
                    str2 = "propSans";
                    break;
                case 4:
                    str2 = "casual";
                    break;
                case 5:
                    str2 = "cursive";
                    break;
                case 6:
                    str2 = "smallCaps";
                    break;
                default:
                    str2 = "";
                    break;
            }
            hashMap.put("fontFamilyOption", str2);
            adipVar.a("style", new JSONObject(hashMap).toString());
        }
        adplVar2.ay(adil.SET_SUBTITLES_TRACK, adipVar);
    }
}

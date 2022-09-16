package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: adll  reason: default package */
/* loaded from: classes.dex */
public final class adll {
    static {
        zep.a("MDX.PlayerUtil");
    }

    public static long a(PlayerResponseModel playerResponseModel, ahhx ahhxVar) {
        char c = 0;
        if (playerResponseModel != null) {
            if (!playerResponseModel.F()) {
                c = 1;
            } else {
                VideoStreamingData videoStreamingData = playerResponseModel.c;
                if (videoStreamingData != null) {
                    String uri = videoStreamingData.d().toString();
                    if (uri.contains("manifest_duration") && uri.contains("start_walltime")) {
                        long b = b(playerResponseModel, "start_walltime_us/(\\d*)", TimeUnit.MICROSECONDS);
                        long b2 = b(playerResponseModel, "manifest_duration/(\\d*)", TimeUnit.SECONDS) + b;
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                        if (b >= seconds || b2 <= seconds) {
                            c = 3;
                        }
                    }
                    c = 2;
                }
            }
        }
        if ((c == 2 || c == 3) && ahhxVar != null) {
            return ahhxVar.b();
        }
        if (c == 2) {
            return -1L;
        }
        if (c == 3) {
            return 0L;
        }
        if (ahhxVar == null) {
            if (playerResponseModel != null) {
                return playerResponseModel.c().F();
            }
            return 0L;
        } else if (ahhxVar.f() - ahhxVar.e() >= 1500) {
            return ahhxVar.e();
        } else {
            return 0L;
        }
    }

    private static long b(PlayerResponseModel playerResponseModel, String str, TimeUnit timeUnit) {
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        Uri d = videoStreamingData != null ? videoStreamingData.d() : null;
        if (d != null) {
            Matcher matcher = Pattern.compile(str).matcher(d.toString());
            if (!matcher.find()) {
                return 0L;
            }
            return timeUnit.toSeconds(Long.parseLong(matcher.group(1)));
        }
        return 0L;
    }
}

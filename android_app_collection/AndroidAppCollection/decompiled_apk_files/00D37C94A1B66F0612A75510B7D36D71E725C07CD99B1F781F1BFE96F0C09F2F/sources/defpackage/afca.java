package defpackage;

import android.os.Build;
import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: afca  reason: default package */
/* loaded from: classes.dex */
public final class afca {
    public static void a(PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData) {
        if (!videoStreamingData.C()) {
            if (videoStreamingData.y != 3) {
                throw new aene("hdr");
            }
            if (!playerConfigModel.av() || (!videoStreamingData.r() && !videoStreamingData.v())) {
                if (videoStreamingData.w) {
                    throw new aene("manifestless-otf");
                }
                return;
            }
            throw new aene("ambisonic-audio");
        }
        throw new aene("manifestless");
    }

    public static boolean b(double d) {
        return Math.random() < d;
    }

    public static int c(VideoStreamingData videoStreamingData, boolean z) {
        return (z || !videoStreamingData.v || videoStreamingData.D()) ? Integer.MAX_VALUE : 480;
    }

    public static String d(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static String e(oxe oxeVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return d(oxeVar.a.getPropertyByteArray("metrics"));
            } catch (Exception e) {
                afkj.c(afki.DRM, e, "Failed to retrieve DRM Metrics", new Object[0]);
            }
        }
        return "";
    }

    public static String f(pob pobVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return d(pobVar.b.getPropertyByteArray("metrics"));
            } catch (Exception e) {
                afkj.c(afki.DRM, e, "Failed to retrieve DRM Metrics", new Object[0]);
            }
        }
        return "";
    }
}

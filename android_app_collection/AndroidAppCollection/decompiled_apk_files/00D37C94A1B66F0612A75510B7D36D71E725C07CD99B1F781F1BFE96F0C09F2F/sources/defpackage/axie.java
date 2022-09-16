package defpackage;

import android.media.MediaCodecInfo;
import com.google.webrtc.hwcodec.H264BitstreamParser;
import com.google.webrtc.hwcodec.HevcBitstreamParser;
import com.google.webrtc.hwcodec.Vp8BitstreamParser;
import com.google.webrtc.hwcodec.Vp9BitstreamParser;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: axie  reason: default package */
/* loaded from: classes2.dex */
public final class axie {
    public static final amvn a = amvn.u(axgq.VP8, axgq.VP9, axgq.H264, axgq.H265X);
    static final int[] b = {19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
    public static final int[] c = {19, 21, 2141391872, 2141391876};
    public static final int[] d = {2130708361};

    public static axha a(axgq axgqVar) {
        axgq axgqVar2 = axgq.UNKNOWN;
        int ordinal = axgqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return new Vp9BitstreamParser();
            }
            if (ordinal == 3) {
                return new H264BitstreamParser();
            }
            if (ordinal == 4) {
                return new HevcBitstreamParser();
            }
            int i = axgqVar.g;
            StringBuilder sb = new StringBuilder(52);
            sb.append("No bitstream parser available for codec: ");
            sb.append(i);
            Logging.d("MediaCodecUtils", sb.toString());
            return null;
        }
        return new Vp8BitstreamParser();
    }

    public static Integer b(int[] iArr, int[] iArr2) {
        for (int i : iArr) {
            for (int i2 : iArr2) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }

    public static String c(axgq axgqVar) {
        axgq axgqVar2 = axgq.UNKNOWN;
        int ordinal = axgqVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return "video/x-vnd.on2.vp9";
            }
            if (ordinal == 3) {
                return "video/avc";
            }
            if (ordinal == 4) {
                return "video/hevc";
            }
            if (ordinal == 5) {
                return "video/av01";
            }
            int i = axgqVar.g;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unrecognized codec type ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return "video/x-vnd.on2.vp8";
    }

    public static Map d(axgq axgqVar, boolean z) {
        axgq axgqVar2 = axgq.UNKNOWN;
        int ordinal = axgqVar.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                HashMap hashMap = new HashMap();
                hashMap.put("level-asymmetry-allowed", "1");
                hashMap.put("packetization-mode", "1");
                hashMap.put("profile-level-id", true != z ? "42e01f" : "640c1f");
                return hashMap;
            } else if (ordinal != 4) {
                int i = axgqVar.g;
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unsupported codec: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new HashMap();
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo, axgq axgqVar) {
        String c2 = c(axgqVar);
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (str.equals(c2)) {
                return true;
            }
        }
        return false;
    }
}

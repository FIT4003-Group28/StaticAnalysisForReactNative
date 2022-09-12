package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: cmaz  reason: default package */
/* loaded from: classes5.dex */
public final class cmaz {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    private final boolean g;

    public cmaz(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        cmmn.f(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.e = z;
        this.f = z2;
        this.g = cmnf.b(str2);
    }

    public static Point f(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(cmny.A(i, widthAlignment) * widthAlignment, cmny.A(i2, heightAlignment) * heightAlignment);
    }

    public static cmaz g(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        boolean z2 = codecCapabilities != null && cmny.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback") && (cmny.a > 22 || ((!"ODROID-XU3".equals(cmny.d) && !"Nexus 10".equals(cmny.d)) || (!"OMX.Exynos.AVC.Decoder".equals(str) && !"OMX.Exynos.AVC.Decoder.secure".equals(str))));
        if (codecCapabilities != null && cmny.a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new cmaz(str, str2, str3, codecCapabilities, z2, z || (codecCapabilities != null && cmny.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private final void h(String str) {
        String str2 = this.a;
        String str3 = this.b;
        String str4 = cmny.e;
        int length = String.valueOf(str).length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 20 + length2 + str3.length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        sb.toString();
    }

    private static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point f = f(videoCapabilities, i, i2);
        int i3 = f.x;
        int i4 = f.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.d.profileLevels;
    }

    public final boolean b(Format format) {
        int i;
        String e;
        MediaCodecInfo.CodecProfileLevel[] a;
        String str = format.i;
        boolean z = false;
        if (str != null && (e = cmnf.e(str)) != null) {
            if (!this.b.equals(e)) {
                String str2 = format.i;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + e.length());
                sb.append("codec.mime ");
                sb.append(str2);
                sb.append(", ");
                sb.append(e);
                h(sb.toString());
            } else {
                Pair<Integer, Integer> e2 = cmbo.e(format);
                if (e2 != null) {
                    int intValue = ((Integer) e2.first).intValue();
                    int intValue2 = ((Integer) e2.second).intValue();
                    if (!this.g) {
                        if (intValue == 42) {
                            intValue = 42;
                        }
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                        if (codecProfileLevel.profile != intValue || codecProfileLevel.level < intValue2) {
                        }
                    }
                    String str3 = format.i;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + e.length());
                    sb2.append("codec.profileLevel, ");
                    sb2.append(str3);
                    sb2.append(", ");
                    sb2.append(e);
                    h(sb2.toString());
                }
            }
            return false;
        }
        if (this.g) {
            if (format.q <= 0 || format.r <= 0) {
                return true;
            }
            if (cmny.a >= 21) {
                return e(format.q, format.r, format.s);
            }
            if (format.q * format.r <= cmbo.d()) {
                z = true;
            }
            if (!z) {
                int i2 = format.q;
                int i3 = format.r;
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("legacyFrameSize, ");
                sb3.append(i2);
                sb3.append("x");
                sb3.append(i3);
                h(sb3.toString());
            }
            return z;
        }
        if (cmny.a >= 21) {
            int i4 = format.z;
            if (i4 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                    StringBuilder sb4 = new StringBuilder(31);
                    sb4.append("sampleRate.support, ");
                    sb4.append(i4);
                    h(sb4.toString());
                    return false;
                }
            }
            int i5 = format.y;
            if (i5 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
                if (codecCapabilities2 == null) {
                    h("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        h("channelCount.aCaps");
                    } else {
                        String str4 = this.a;
                        String str5 = this.b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((cmny.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                            if ("audio/ac3".equals(str5)) {
                                i = 6;
                            } else {
                                i = "audio/eac3".equals(str5) ? 16 : 30;
                            }
                            StringBuilder sb5 = new StringBuilder(str4.length() + 59);
                            sb5.append("AssumedMaxChannelAdjustment: ");
                            sb5.append(str4);
                            sb5.append(", [");
                            sb5.append(maxInputChannelCount);
                            sb5.append(" to ");
                            sb5.append(i);
                            sb5.append("]");
                            sb5.toString();
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i5) {
                            StringBuilder sb6 = new StringBuilder(33);
                            sb6.append("channelCount.support, ");
                            sb6.append(i5);
                            h(sb6.toString());
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean c(Format format) {
        if (this.g) {
            return this.e;
        }
        Pair<Integer, Integer> e = cmbo.e(format);
        return e != null && ((Integer) e.first).intValue() == 42;
    }

    public final int d(Format format, Format format2) {
        if (!cmny.b(format.l, format2.l)) {
            return 0;
        }
        if (this.g) {
            if (format.t == format2.t && ((this.e || (format.q == format2.q && format.r == format2.r)) && cmny.b(format.x, format2.x))) {
                if (format.d(format2)) {
                    return 3;
                }
                String str = this.a;
                if (!cmny.d.startsWith("SM-T230") || !"OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
                    return 2;
                }
            }
        } else if (format.y == format2.y && format.z == format2.z && format.A == format2.A) {
            if ("audio/mp4a-latm".equals(this.b)) {
                Pair<Integer, Integer> e = cmbo.e(format);
                Pair<Integer, Integer> e2 = cmbo.e(format2);
                if (e != null && e2 != null) {
                    int intValue = ((Integer) e.first).intValue();
                    int intValue2 = ((Integer) e2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return 3;
                    }
                }
            }
            if (format.d(format2) && !"audio/opus".equals(this.b)) {
                return 1;
            }
        }
        return 0;
    }

    public final boolean e(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        } else if (i(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) || !"mcv5a".equals(cmny.b)) && i(videoCapabilities, i2, i, d))) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.rotated, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                String sb2 = sb.toString();
                String str = this.a;
                String str2 = this.b;
                String str3 = cmny.e;
                int length = String.valueOf(sb2).length();
                int length2 = str.length();
                StringBuilder sb3 = new StringBuilder(length + 25 + length2 + str2.length() + String.valueOf(str3).length());
                sb3.append("AssumedSupport [");
                sb3.append(sb2);
                sb3.append("] [");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(str2);
                sb3.append("] [");
                sb3.append(str3);
                sb3.append("]");
                sb3.toString();
                return true;
            }
            StringBuilder sb4 = new StringBuilder(69);
            sb4.append("sizeAndRate.support, ");
            sb4.append(i);
            sb4.append("x");
            sb4.append(i2);
            sb4.append("x");
            sb4.append(d);
            h(sb4.toString());
            return false;
        }
    }

    public final String toString() {
        return this.a;
    }
}

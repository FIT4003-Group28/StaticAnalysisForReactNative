package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: PG */
/* renamed from: awk  reason: default package */
/* loaded from: classes2.dex */
final class awk implements awj {
    @Override // defpackage.awj
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.awj
    public final MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.awj
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.awj
    public final boolean d() {
        return false;
    }

    @Override // defpackage.awj
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}

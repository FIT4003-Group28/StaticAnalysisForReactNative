package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: PG */
/* renamed from: cmbl  reason: default package */
/* loaded from: classes5.dex */
final class cmbl implements cmbk {
    @Override // defpackage.cmbk
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.cmbk
    public final MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.cmbk
    public final boolean c() {
        return false;
    }

    @Override // defpackage.cmbk
    public final boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.cmbk
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}

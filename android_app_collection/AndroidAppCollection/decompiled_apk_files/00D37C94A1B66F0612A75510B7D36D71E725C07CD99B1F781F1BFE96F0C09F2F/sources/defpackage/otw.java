package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: PG */
/* renamed from: otw  reason: default package */
/* loaded from: classes4.dex */
final class otw implements otv {
    @Override // defpackage.otv
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.otv
    public final MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.otv
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // defpackage.otv
    public final boolean d() {
        return false;
    }
}

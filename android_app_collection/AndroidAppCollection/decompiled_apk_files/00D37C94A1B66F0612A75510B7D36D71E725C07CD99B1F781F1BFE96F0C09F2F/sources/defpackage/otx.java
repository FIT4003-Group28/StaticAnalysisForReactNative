package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: PG */
/* renamed from: otx  reason: default package */
/* loaded from: classes4.dex */
final class otx implements otv {
    private final int a;
    private MediaCodecInfo[] b;

    public otx(boolean z) {
        this.a = z ? 1 : 0;
    }

    private final void e() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // defpackage.otv
    public final int a() {
        e();
        return this.b.length;
    }

    @Override // defpackage.otv
    public final MediaCodecInfo b(int i) {
        e();
        return this.b[i];
    }

    @Override // defpackage.otv
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // defpackage.otv
    public final boolean d() {
        return true;
    }
}

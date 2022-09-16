package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: PG */
/* renamed from: awl  reason: default package */
/* loaded from: classes2.dex */
final class awl implements awj {
    private final int a;
    private MediaCodecInfo[] b;

    public awl(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.a = i;
    }

    private final void f() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // defpackage.awj
    public final int a() {
        f();
        return this.b.length;
    }

    @Override // defpackage.awj
    public final MediaCodecInfo b(int i) {
        f();
        return this.b[i];
    }

    @Override // defpackage.awj
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.awj
    public final boolean d() {
        return true;
    }

    @Override // defpackage.awj
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}

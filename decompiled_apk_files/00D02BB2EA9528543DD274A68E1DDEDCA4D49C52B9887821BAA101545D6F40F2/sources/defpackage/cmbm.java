package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: PG */
/* renamed from: cmbm  reason: default package */
/* loaded from: classes5.dex */
final class cmbm implements cmbk {
    private final int a;
    private MediaCodecInfo[] b;

    public cmbm(boolean z, boolean z2) {
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

    @Override // defpackage.cmbk
    public final int a() {
        f();
        return this.b.length;
    }

    @Override // defpackage.cmbk
    public final MediaCodecInfo b(int i) {
        f();
        return this.b[i];
    }

    @Override // defpackage.cmbk
    public final boolean c() {
        return true;
    }

    @Override // defpackage.cmbk
    public final boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.cmbk
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}

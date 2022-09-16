package defpackage;

import android.media.MediaCodecInfo;
/* compiled from: PG */
/* renamed from: osv  reason: default package */
/* loaded from: classes4.dex */
public final class osv {
    public final String a;
    public final MediaCodecInfo.CodecCapabilities b;
    public final boolean c;

    public osv(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        this.a = str;
        this.b = codecCapabilities;
        boolean z = false;
        if (codecCapabilities != null && pcx.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z = true;
        }
        this.c = z;
    }
}

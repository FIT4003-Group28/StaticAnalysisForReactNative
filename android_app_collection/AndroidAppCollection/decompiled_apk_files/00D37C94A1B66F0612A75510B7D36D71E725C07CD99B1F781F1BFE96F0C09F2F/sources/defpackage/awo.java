package defpackage;

import android.media.MediaCodec;
/* compiled from: PG */
/* renamed from: awo  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class awo implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ pxp a;
    private final /* synthetic */ int b;

    public /* synthetic */ awo(pxp pxpVar, int i) {
        this.b = i;
        this.a = pxpVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.b;
        if (i == 0) {
            this.a.a(j);
        } else if (i == 1) {
            this.a.a(j);
        } else {
            this.a.a(j);
        }
    }
}

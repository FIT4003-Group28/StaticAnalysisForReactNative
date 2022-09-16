package defpackage;

import com.google.android.exoplayer.youtube.libvpx.VpxOutputBuffer;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
/* compiled from: PG */
/* renamed from: ahpk  reason: default package */
/* loaded from: classes.dex */
public final class ahpk {
    public static final jk a = new jm(4);
    public VpxOutputBuffer b;
    public VideoDecoderOutputBuffer c;
    public ahpj d;

    public final int a() {
        VpxOutputBuffer vpxOutputBuffer = this.b;
        return vpxOutputBuffer != null ? vpxOutputBuffer.height : this.c.height;
    }

    public final void b() {
        VpxOutputBuffer vpxOutputBuffer = this.b;
        if (vpxOutputBuffer != null) {
            vpxOutputBuffer.release();
        } else {
            this.c.release();
        }
        a.b(this);
    }

    public final int[] c() {
        VpxOutputBuffer vpxOutputBuffer = this.b;
        return vpxOutputBuffer != null ? vpxOutputBuffer.yuvStrides : this.c.yuvStrides;
    }
}

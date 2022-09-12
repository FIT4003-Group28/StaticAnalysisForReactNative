package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cmbr  reason: default package */
/* loaded from: classes5.dex */
public final class cmbr {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public cmbr(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (cmny.a < 21) {
                    this.c = this.a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public final void b(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    public final void c() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    public final void d(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    public final void e(int i) {
        this.a.setVideoScalingMode(i);
    }

    public final void f(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.a.configure(mediaFormat, surface, mediaCrypto, 0);
    }

    public final void g(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }
}

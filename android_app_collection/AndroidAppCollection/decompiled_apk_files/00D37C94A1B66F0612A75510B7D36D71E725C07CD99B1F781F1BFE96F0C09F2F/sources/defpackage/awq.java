package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: awq  reason: default package */
/* loaded from: classes2.dex */
public final class awq implements avx {
    private final MediaCodec a;

    public awq(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        int i = pxi.a;
    }

    @Override // defpackage.avx
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.avx
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                int i = pxi.a;
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.avx
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.avx
    public final ByteBuffer e(int i) {
        int i2 = pxi.a;
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.avx
    public final ByteBuffer f(int i) {
        int i2 = pxi.a;
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.avx
    public final void g() {
        this.a.flush();
    }

    @Override // defpackage.avx
    public final void h() {
        this.a.release();
    }

    @Override // defpackage.avx
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.avx
    public final void j(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.avx
    public final void k(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.avx
    public final void l(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.avx
    public final boolean m() {
        return false;
    }

    @Override // defpackage.avx
    public final void n(pxp pxpVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new awo(pxpVar), handler);
    }

    @Override // defpackage.avx
    public final void o(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.avx
    public final void p(int i, pmq pmqVar, long j) {
        this.a.queueSecureInputBuffer(i, 0, pmqVar.i, j, 0);
    }

    @Override // defpackage.avx
    public final void q(int i) {
        this.a.releaseOutputBuffer(i, false);
    }
}

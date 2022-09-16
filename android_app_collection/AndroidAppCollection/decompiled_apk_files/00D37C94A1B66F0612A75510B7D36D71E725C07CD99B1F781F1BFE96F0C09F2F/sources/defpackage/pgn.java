package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.video.DummySurface;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: pgn  reason: default package */
/* loaded from: classes4.dex */
public final class pgn implements avx {
    public final Context a;
    public final boolean b;
    public DummySurface c;
    public int d;
    private final MediaCodec e;
    private boolean f = true;
    private boolean g;
    private boolean h;
    private Surface i;

    public pgn(MediaCodec mediaCodec, Surface surface, int i, Context context, boolean z) {
        this.e = mediaCodec;
        this.i = surface;
        this.d = i;
        this.a = context;
        this.b = z;
    }

    @Override // defpackage.avx
    public final int a() {
        return this.e.dequeueInputBuffer(0L);
    }

    @Override // defpackage.avx
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        if (this.g) {
            this.g = false;
            return -2;
        }
        do {
            dequeueOutputBuffer = this.e.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.avx
    public final MediaFormat c() {
        return this.e.getOutputFormat();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f) {
            afki afkiVar = afki.ABR;
            this.d = 1;
            return;
        }
        afkj.d(afki.CODEC_REUSE, "Codec released.");
        this.e.release();
        DummySurface dummySurface = this.c;
        if (dummySurface == null) {
            return;
        }
        dummySurface.release();
    }

    @Override // defpackage.avx
    public final ByteBuffer e(int i) {
        int i2 = pxi.a;
        return this.e.getInputBuffer(i);
    }

    @Override // defpackage.avx
    public final ByteBuffer f(int i) {
        int i2 = pxi.a;
        return this.e.getOutputBuffer(i);
    }

    @Override // defpackage.avx
    public final synchronized void g() {
        this.e.flush();
    }

    @Override // defpackage.avx
    public final synchronized void h() {
        afki afkiVar = afki.ABR;
        int i = this.d;
        if (i != 0) {
            this.f = false;
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    this.e.flush();
                    this.g = true;
                    return;
                }
                this.e.stop();
                return;
            }
            this.e.release();
            DummySurface dummySurface = this.c;
            if (dummySurface == null) {
                return;
            }
            dummySurface.release();
            return;
        }
        throw null;
    }

    @Override // defpackage.avx
    public final void i(int i, long j) {
        this.e.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.avx
    public final void j(Surface surface) {
        if (this.i.equals(surface)) {
            return;
        }
        this.e.setOutputSurface(surface);
        this.i = surface;
        DummySurface dummySurface = this.c;
        if (dummySurface == null || surface.equals(dummySurface)) {
            return;
        }
        afki afkiVar = afki.ABR;
        this.c.release();
        this.c = null;
    }

    @Override // defpackage.avx
    public final void k(Bundle bundle) {
        this.e.setParameters(bundle);
    }

    @Override // defpackage.avx
    public final void l(int i) {
        this.e.setVideoScalingMode(i);
    }

    @Override // defpackage.avx
    public final boolean m() {
        return this.h;
    }

    @Override // defpackage.avx
    public final void n(pxp pxpVar, Handler handler) {
        this.e.setOnFrameRenderedListener(new awo(pxpVar, 2), handler);
    }

    @Override // defpackage.avx
    public final void o(int i, int i2, long j, int i3) {
        this.e.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.avx
    public final void p(int i, pmq pmqVar, long j) {
        this.e.queueSecureInputBuffer(i, 0, pmqVar.i, j, 0);
    }

    @Override // defpackage.avx
    public final void q(int i) {
        this.e.releaseOutputBuffer(i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void r(boolean z) {
        this.h = z;
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void s() {
        this.f = true;
        this.e.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void t() {
        this.e.stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void u(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f = true;
        this.e.configure(mediaFormat, surface, mediaCrypto, 0);
        this.i = surface;
    }
}

package defpackage;

import android.os.Handler;
import android.view.Surface;
import androidx.media3.decoder.vp9.VpxDecoder;
import androidx.media3.decoder.vp9.VpxLibrary;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
/* compiled from: PG */
/* renamed from: atx  reason: default package */
/* loaded from: classes2.dex */
public class atx extends pxj {
    private final int b;
    private final int c;
    private final int d;
    private VpxDecoder e;

    public atx(long j, Handler handler, pyk pykVar, int i) {
        this(j, handler, pykVar, i, Runtime.getRuntime().availableProcessors(), 4, 4);
    }

    @Override // defpackage.pke
    public final int a(Format format) {
        if (!VpxLibrary.a() || !"video/x-vnd.on2.vp9".equalsIgnoreCase(format.l)) {
            return 0;
        }
        Class cls = format.E;
        return (cls == null || VpxLibrary.b(cls)) ? 20 : 2;
    }

    @Override // defpackage.pxj
    protected final /* bridge */ /* synthetic */ pmr b(Format format, ExoMediaCrypto exoMediaCrypto) {
        int i = pxi.a;
        int i2 = format.m;
        VpxDecoder vpxDecoder = new VpxDecoder(this.b, this.c, i2 == -1 ? 786432 : i2, exoMediaCrypto, this.d);
        this.e = vpxDecoder;
        return vpxDecoder;
    }

    @Override // defpackage.pxj
    protected final pmw c(String str, Format format, Format format2) {
        return new pmw(str, format, format2, 3, 0);
    }

    @Override // defpackage.pkd, defpackage.pke
    public final String d() {
        return "LibvpxVideoRenderer";
    }

    @Override // defpackage.pxj
    protected final void e(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        VpxDecoder vpxDecoder = this.e;
        if (vpxDecoder == null) {
            throw new atz("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (vpxDecoder.vpxRenderFrame(vpxDecoder.a, surface, videoDecoderOutputBuffer) != -1) {
            videoDecoderOutputBuffer.release();
            return;
        }
        throw new atz("Buffer render failed.");
    }

    @Override // defpackage.pxj
    protected final void f(int i) {
        VpxDecoder vpxDecoder = this.e;
        if (vpxDecoder != null) {
            vpxDecoder.b = i;
        }
    }

    public atx(long j, Handler handler, pyk pykVar, int i, int i2, int i3, int i4) {
        super(j, handler, pykVar, i);
        this.d = i2;
        this.b = i3;
        this.c = i4;
    }
}

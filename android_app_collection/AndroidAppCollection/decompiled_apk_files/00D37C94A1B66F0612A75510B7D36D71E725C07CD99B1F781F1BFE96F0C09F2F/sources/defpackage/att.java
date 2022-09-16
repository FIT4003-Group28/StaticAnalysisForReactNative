package defpackage;

import android.os.Handler;
import android.view.Surface;
import androidx.media3.decoder.av1.Gav1Decoder;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
/* compiled from: PG */
/* renamed from: att  reason: default package */
/* loaded from: classes2.dex */
public final class att extends pxj {
    private static final int b = ((pxi.b(1280, 64) * pxi.b(720, 64)) * 6144) / 2;
    private Gav1Decoder c;

    public att(long j, Handler handler, pyk pykVar, int i) {
        super(j, handler, pykVar, i);
    }

    @Override // defpackage.pke
    public final int a(Format format) {
        if (!"video/av01".equalsIgnoreCase(format.l) || !ats.a()) {
            return 0;
        }
        return format.E != null ? 2 : 20;
    }

    @Override // defpackage.pxj
    protected final /* bridge */ /* synthetic */ pmr b(Format format, ExoMediaCrypto exoMediaCrypto) {
        int i = pxi.a;
        int i2 = format.m;
        if (i2 == -1) {
            i2 = b;
        }
        Gav1Decoder gav1Decoder = new Gav1Decoder(i2);
        this.c = gav1Decoder;
        return gav1Decoder;
    }

    @Override // defpackage.pxj
    protected final pmw c(String str, Format format, Format format2) {
        return new pmw(str, format, format2, 3, 0);
    }

    @Override // defpackage.pkd, defpackage.pke
    public final String d() {
        return "Libgav1VideoRenderer";
    }

    @Override // defpackage.pxj
    protected final void f(int i) {
        Gav1Decoder gav1Decoder = this.c;
        if (gav1Decoder != null) {
            gav1Decoder.b = i;
        }
    }

    @Override // defpackage.pxj
    protected final void e(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        Gav1Decoder gav1Decoder = this.c;
        if (gav1Decoder == null) {
            throw new atr("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (videoDecoderOutputBuffer.mode != 1) {
            throw new atr("Invalid output mode.");
        }
        if (gav1Decoder.gav1RenderFrame(gav1Decoder.a, surface, videoDecoderOutputBuffer) != 0) {
            videoDecoderOutputBuffer.release();
        } else {
            String valueOf = String.valueOf(gav1Decoder.gav1GetErrorMessage(gav1Decoder.a));
            throw new atr(valueOf.length() != 0 ? "Buffer render error: ".concat(valueOf) : new String("Buffer render error: "));
        }
    }
}

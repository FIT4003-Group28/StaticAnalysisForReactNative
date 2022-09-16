package androidx.media3.decoder.av1;

import android.view.Surface;
import androidx.media3.decoder.av1.Gav1Decoder;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class Gav1Decoder extends pnb {
    public final long a;
    public volatile int b;

    public Gav1Decoder(int i) {
        super(new pxr[4], new VideoDecoderOutputBuffer[4]);
        if (!ats.a()) {
            throw new atr("Failed to load decoder native library.");
        }
        int gav1GetThreads = gav1GetThreads();
        long gav1Init = gav1Init(gav1GetThreads <= 0 ? Runtime.getRuntime().availableProcessors() : gav1GetThreads);
        this.a = gav1Init;
        if (gav1Init == 0 || gav1CheckError(gav1Init) == 0) {
            String valueOf = String.valueOf(gav1GetErrorMessage(gav1Init));
            throw new atr(valueOf.length() != 0 ? "Failed to initialize decoder. Error: ".concat(valueOf) : new String("Failed to initialize decoder. Error: "));
        } else {
            p(i);
        }
    }

    private native int gav1CheckError(long j);

    private native void gav1Close(long j);

    private native int gav1Decode(long j, ByteBuffer byteBuffer, int i);

    private native int gav1GetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z);

    private native int gav1GetThreads();

    private native long gav1Init(int i);

    private native void gav1ReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmt a(Throwable th) {
        return new atr(th);
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmt b(pmv pmvVar, pmz pmzVar, boolean z) {
        pxr pxrVar = (pxr) pmvVar;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) pmzVar;
        ByteBuffer byteBuffer = pxrVar.d;
        int i = pxi.a;
        atr atrVar = null;
        if (gav1Decode(this.a, byteBuffer, byteBuffer.limit()) == 0) {
            String valueOf = String.valueOf(gav1GetErrorMessage(this.a));
            atrVar = new atr(valueOf.length() != 0 ? "gav1Decode error: ".concat(valueOf) : new String("gav1Decode error: "));
        } else {
            boolean isDecodeOnly = pxrVar.isDecodeOnly();
            if (!isDecodeOnly) {
                videoDecoderOutputBuffer.init(pxrVar.f, this.b, null);
            }
            int gav1GetFrame = gav1GetFrame(this.a, videoDecoderOutputBuffer, isDecodeOnly);
            if (gav1GetFrame == 0) {
                String valueOf2 = String.valueOf(gav1GetErrorMessage(this.a));
                atrVar = new atr(valueOf2.length() != 0 ? "gav1GetFrame error: ".concat(valueOf2) : new String("gav1GetFrame error: "));
            } else {
                if (gav1GetFrame == 2) {
                    videoDecoderOutputBuffer.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                }
                if (!isDecodeOnly) {
                    videoDecoderOutputBuffer.format = pxrVar.a;
                    return null;
                }
            }
        }
        return atrVar;
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmv c() {
        return new pxr();
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmz d() {
        return new VideoDecoderOutputBuffer(new pmy() { // from class: atq
            @Override // defpackage.pmy
            public final void a(pmz pmzVar) {
                Gav1Decoder.this.g((VideoDecoderOutputBuffer) pmzVar);
            }
        });
    }

    @Override // defpackage.pmr
    public final String e() {
        return "libgav1";
    }

    @Override // defpackage.pnb, defpackage.pmr
    public final void f() {
        super.f();
        gav1Close(this.a);
    }

    public final void g(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (videoDecoderOutputBuffer.mode == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            gav1ReleaseFrame(this.a, videoDecoderOutputBuffer);
        }
        super.o(videoDecoderOutputBuffer);
    }

    public native String gav1GetErrorMessage(long j);

    public native int gav1RenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);
}

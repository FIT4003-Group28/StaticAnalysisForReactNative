package androidx.media3.decoder.vp9;

import android.view.Surface;
import androidx.media3.decoder.vp9.VpxDecoder;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class VpxDecoder extends pnb {
    public final long a;
    public volatile int b;
    private final ExoMediaCrypto c;
    private ByteBuffer d;

    public VpxDecoder(int i, int i2, int i3, ExoMediaCrypto exoMediaCrypto, int i4) {
        super(new pxr[i], new VideoDecoderOutputBuffer[i2]);
        if (VpxLibrary.a()) {
            this.c = exoMediaCrypto;
            if (exoMediaCrypto == null || VpxLibrary.vpxIsSecureDecodeSupported()) {
                long vpxInit = vpxInit(false, false, i4);
                this.a = vpxInit;
                if (vpxInit == 0) {
                    throw new atz("Failed to initialize decoder");
                }
                p(i3);
                return;
            }
            throw new atz("Vpx decoder does not support secure decode.");
        }
        throw new atz("Failed to load decoder native libraries.");
    }

    private native long vpxClose(long j);

    private native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private native int vpxGetErrorCode(long j);

    private native String vpxGetErrorMessage(long j);

    private native int vpxGetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxInit(boolean z, boolean z2, int i);

    private native int vpxReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxSecureDecode(long j, ByteBuffer byteBuffer, int i, ExoMediaCrypto exoMediaCrypto, int i2, byte[] bArr, byte[] bArr2, int i3, int[] iArr, int[] iArr2);

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmt a(Throwable th) {
        return new atz("Unexpected decode error", th);
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmt b(pmv pmvVar, pmz pmzVar, boolean z) {
        long vpxDecode;
        ByteBuffer byteBuffer;
        pxr pxrVar = (pxr) pmvVar;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) pmzVar;
        if (z && (byteBuffer = this.d) != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = pxrVar.d;
        int i = pxi.a;
        int limit = byteBuffer2.limit();
        pmq pmqVar = pxrVar.c;
        if (pxrVar.g()) {
            vpxDecode = vpxSecureDecode(this.a, byteBuffer2, limit, this.c, pmqVar.c, (byte[]) ptx.a(pmqVar.b), (byte[]) ptx.a(pmqVar.a), pmqVar.f, pmqVar.d, pmqVar.e);
        } else {
            vpxDecode = vpxDecode(this.a, byteBuffer2, limit);
        }
        if (vpxDecode != 0) {
            if (vpxDecode == -2) {
                String valueOf = String.valueOf(vpxGetErrorMessage(this.a));
                String concat = valueOf.length() != 0 ? "Drm error: ".concat(valueOf) : new String("Drm error: ");
                vpxGetErrorCode(this.a);
                return new atz(concat, new pmx(concat));
            }
            String valueOf2 = String.valueOf(vpxGetErrorMessage(this.a));
            return new atz(valueOf2.length() != 0 ? "Decode error: ".concat(valueOf2) : new String("Decode error: "));
        }
        if (pxrVar.hasSupplementalData()) {
            ByteBuffer byteBuffer3 = pxrVar.g;
            ptx.a(byteBuffer3);
            int remaining = byteBuffer3.remaining();
            if (remaining > 0) {
                ByteBuffer byteBuffer4 = this.d;
                if (byteBuffer4 == null || byteBuffer4.capacity() < remaining) {
                    this.d = ByteBuffer.allocate(remaining);
                } else {
                    this.d.clear();
                }
                this.d.put(byteBuffer3);
                this.d.flip();
            }
        }
        if (pxrVar.isDecodeOnly()) {
            return null;
        }
        videoDecoderOutputBuffer.init(pxrVar.f, this.b, this.d);
        int vpxGetFrame = vpxGetFrame(this.a, videoDecoderOutputBuffer);
        if (vpxGetFrame == 1) {
            videoDecoderOutputBuffer.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        } else if (vpxGetFrame == -1) {
            return new atz("Buffer initialization failed.");
        }
        videoDecoderOutputBuffer.format = pxrVar.a;
        return null;
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmv c() {
        return new pxr();
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmz d() {
        return new VideoDecoderOutputBuffer(new pmy() { // from class: aty
            @Override // defpackage.pmy
            public final void a(pmz pmzVar) {
                VpxDecoder.this.g((VideoDecoderOutputBuffer) pmzVar);
            }
        });
    }

    @Override // defpackage.pmr
    public final String e() {
        String valueOf = String.valueOf(VpxLibrary.a() ? VpxLibrary.vpxGetVersion() : null);
        return valueOf.length() != 0 ? "libvpx".concat(valueOf) : new String("libvpx");
    }

    @Override // defpackage.pnb, defpackage.pmr
    public final void f() {
        super.f();
        this.d = null;
        vpxClose(this.a);
    }

    public final void g(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (this.b == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            vpxReleaseFrame(this.a, videoDecoderOutputBuffer);
        }
        super.o(videoDecoderOutputBuffer);
    }

    public native int vpxRenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);
}

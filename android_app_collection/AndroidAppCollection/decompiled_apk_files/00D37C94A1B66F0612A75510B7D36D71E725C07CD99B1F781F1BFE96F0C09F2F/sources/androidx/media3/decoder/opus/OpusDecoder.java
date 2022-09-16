package androidx.media3.decoder.opus;

import androidx.media3.decoder.opus.OpusDecoder;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class OpusDecoder extends pnb {
    public final boolean a;
    public final int b;
    private final ExoMediaCrypto c;
    private final int d;
    private final int e;
    private final long f;
    private int g;

    public OpusDecoder(int i, List list, ExoMediaCrypto exoMediaCrypto, boolean z) {
        super(new pmv[16], new SimpleOutputBuffer[16]);
        int g;
        int i2;
        int i3;
        if (OpusLibrary.a()) {
            this.c = exoMediaCrypto;
            if (exoMediaCrypto == null || OpusLibrary.opusIsSecureDecodeSupported()) {
                int size = list.size();
                if (size != 1) {
                    if (size == 3) {
                        if (((byte[]) list.get(1)).length != 8 || ((byte[]) list.get(2)).length != 8) {
                            throw new atw("Invalid pre-skip or seek pre-roll");
                        }
                    } else {
                        throw new atw("Invalid initialization data size");
                    }
                }
                if (list.size() == 3) {
                    g = (int) iy.h(ByteBuffer.wrap((byte[]) list.get(1)).order(ByteOrder.nativeOrder()).getLong());
                } else {
                    g = iy.g((byte[]) list.get(0));
                }
                this.d = g;
                this.e = list.size() == 3 ? (int) iy.h(ByteBuffer.wrap((byte[]) list.get(2)).order(ByteOrder.nativeOrder()).getLong()) : 3840;
                byte[] bArr = (byte[]) list.get(0);
                int length = bArr.length;
                if (length < 19) {
                    throw new atw("Invalid header length");
                }
                int f = iy.f(bArr);
                this.b = f;
                if (f <= 8) {
                    short s = (short) ((bArr[16] & 255) | ((bArr[17] & 255) << 8));
                    byte[] bArr2 = new byte[8];
                    if (bArr[18] == 0) {
                        if (f > 2) {
                            throw new atw("Invalid header, missing stream map");
                        }
                        int i4 = f == 2 ? 1 : 0;
                        bArr2[0] = 0;
                        bArr2[1] = 1;
                        i3 = i4;
                        i2 = 1;
                    } else if (length < f + 21) {
                        throw new atw("Invalid header length");
                    } else {
                        System.arraycopy(bArr, 21, bArr2, 0, f);
                        i2 = bArr[19] & 255;
                        i3 = bArr[20] & 255;
                    }
                    long opusInit = opusInit(48000, f, i2, i3, s, bArr2);
                    this.f = opusInit;
                    if (opusInit == 0) {
                        throw new atw("Failed to initialize decoder");
                    }
                    p(i);
                    this.a = z;
                    if (!z) {
                        return;
                    }
                    opusSetFloatOutput();
                    return;
                }
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid channel count: ");
                sb.append(f);
                throw new atw(sb.toString());
            }
            throw new atw("Opus decoder does not support secure decode");
        }
        throw new atw("Failed to load decoder native libraries");
    }

    private native void opusClose(long j);

    private native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer);

    private native int opusGetErrorCode(long j);

    private native String opusGetErrorMessage(long j);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    private native int opusSecureDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer, int i2, ExoMediaCrypto exoMediaCrypto, int i3, byte[] bArr, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    private native void opusSetFloatOutput();

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmt a(Throwable th) {
        return new atw("Unexpected decode error", th);
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmt b(pmv pmvVar, pmz pmzVar, boolean z) {
        SimpleOutputBuffer simpleOutputBuffer;
        OpusDecoder opusDecoder;
        int opusDecode;
        SimpleOutputBuffer simpleOutputBuffer2 = (SimpleOutputBuffer) pmzVar;
        if (z) {
            opusReset(this.f);
            this.g = pmvVar.f == 0 ? this.d : this.e;
        }
        ByteBuffer byteBuffer = pmvVar.d;
        int i = pxi.a;
        pmq pmqVar = pmvVar.c;
        if (pmvVar.g()) {
            simpleOutputBuffer = simpleOutputBuffer2;
            opusDecode = opusSecureDecode(this.f, pmvVar.f, byteBuffer, byteBuffer.limit(), simpleOutputBuffer2, 48000, this.c, pmqVar.c, (byte[]) ptx.a(pmqVar.b), (byte[]) ptx.a(pmqVar.a), pmqVar.f, pmqVar.d, pmqVar.e);
            opusDecoder = this;
        } else {
            simpleOutputBuffer = simpleOutputBuffer2;
            opusDecoder = this;
            opusDecode = opusDecode(opusDecoder.f, pmvVar.f, byteBuffer, byteBuffer.limit(), simpleOutputBuffer);
        }
        if (opusDecode < 0) {
            if (opusDecode == -2) {
                String valueOf = String.valueOf(opusDecoder.opusGetErrorMessage(opusDecoder.f));
                String concat = valueOf.length() != 0 ? "Drm error: ".concat(valueOf) : new String("Drm error: ");
                opusDecoder.opusGetErrorCode(opusDecoder.f);
                return new atw(concat, new pmx(concat));
            }
            String valueOf2 = String.valueOf(opusDecoder.opusGetErrorMessage(opusDecode));
            return new atw(valueOf2.length() != 0 ? "Decode error: ".concat(valueOf2) : new String("Decode error: "));
        }
        SimpleOutputBuffer simpleOutputBuffer3 = simpleOutputBuffer;
        ByteBuffer byteBuffer2 = simpleOutputBuffer3.data;
        byteBuffer2.position(0);
        byteBuffer2.limit(opusDecode);
        int i2 = opusDecoder.g;
        if (i2 <= 0) {
            return null;
        }
        int i3 = opusDecoder.b;
        int i4 = i3 + i3;
        int i5 = i2 * i4;
        if (opusDecode <= i5) {
            opusDecoder.g = i2 - (opusDecode / i4);
            simpleOutputBuffer3.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            byteBuffer2.position(opusDecode);
            return null;
        }
        opusDecoder.g = 0;
        byteBuffer2.position(i5);
        return null;
    }

    @Override // defpackage.pnb
    protected final pmv c() {
        return new pmv(2);
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmz d() {
        return new SimpleOutputBuffer(new pmy() { // from class: atv
            @Override // defpackage.pmy
            public final void a(pmz pmzVar) {
                OpusDecoder.this.o((SimpleOutputBuffer) pmzVar);
            }
        });
    }

    @Override // defpackage.pmr
    public final String e() {
        String valueOf = String.valueOf(OpusLibrary.a() ? OpusLibrary.opusGetVersion() : null);
        return valueOf.length() != 0 ? "libopus".concat(valueOf) : new String("libopus");
    }

    @Override // defpackage.pnb, defpackage.pmr
    public final void f() {
        super.f();
        opusClose(this.f);
    }
}

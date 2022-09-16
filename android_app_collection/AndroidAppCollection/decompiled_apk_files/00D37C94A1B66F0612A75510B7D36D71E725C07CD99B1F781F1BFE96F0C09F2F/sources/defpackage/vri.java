package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: vri  reason: default package */
/* loaded from: classes4.dex */
public final class vri extends ots implements otg {
    public vrb a;
    private long i;

    public vri(oui ouiVar) {
        super(ouiVar, otm.a, (owy) null, false, (Handler) null, (otr) null);
        this.i = 0L;
    }

    @Override // defpackage.otg
    public final long a() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final otg m() {
        return this;
    }

    @Override // defpackage.ots
    protected final void n(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void w() {
        this.a.a();
    }

    @Override // defpackage.ots
    protected final boolean x(otm otmVar, com.google.android.exoplayer.MediaFormat mediaFormat) {
        String str = mediaFormat.b;
        return pcu.e(str) && ("audio/x-unknown".equals(str) || otmVar.a(str, false) != null);
    }

    @Override // defpackage.ots
    protected final boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) {
        this.i = bufferInfo.presentationTimeUs;
        byteBuffer.position(bufferInfo.offset).limit(bufferInfo.offset + bufferInfo.size);
        if (this.a != null) {
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            int integer2 = outputFormat.getInteger("channel-count");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            this.a.b(byteBuffer.asShortBuffer(), integer, integer2);
        }
        mediaCodec.releaseOutputBuffer(i, false);
        return true;
    }
}

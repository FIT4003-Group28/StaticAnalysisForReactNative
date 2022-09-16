package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: vrq  reason: default package */
/* loaded from: classes4.dex */
public final class vrq {
    private final MediaCodec a;
    private final int b;

    public vrq(MediaCodec mediaCodec, int i) {
        this.a = mediaCodec;
        this.b = i;
    }

    public static vrq a(MediaCodec mediaCodec) {
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(1000000L);
        if (dequeueInputBuffer >= 0) {
            return new vrq(mediaCodec, dequeueInputBuffer);
        }
        return null;
    }

    public final boolean b(ByteBuffer byteBuffer, long j, int i) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.a.getInputBuffers()[this.b];
        byteBuffer2.clear();
        byteBuffer.limit(position + Math.min(byteBuffer2.remaining(), limit - position));
        byteBuffer2.put(byteBuffer).flip();
        this.a.queueInputBuffer(this.b, 0, byteBuffer2.remaining(), j, i);
        byteBuffer.limit(limit);
        return byteBuffer.hasRemaining();
    }
}

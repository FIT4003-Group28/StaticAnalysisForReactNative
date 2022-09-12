package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: clkw  reason: default package */
/* loaded from: classes5.dex */
final class clkw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(WritableByteChannel writableByteChannel) {
        if (writableByteChannel instanceof SelectableChannel) {
            dbsk.m(((SelectableChannel) writableByteChannel).isBlocking(), "Target channels used by UrlEngine must be in blocking mode to ensure writes happen correctly; call SelectableChannel#configureBlocking(true).");
        }
        dbsk.l(writableByteChannel.isOpen());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(ByteBuffer byteBuffer, WritableByteChannel writableByteChannel) {
        long j = 0;
        while (byteBuffer.hasRemaining()) {
            j += writableByteChannel.write(byteBuffer);
        }
        return j;
    }
}

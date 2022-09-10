package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: bsy  reason: default package */
/* loaded from: classes4.dex */
final class bsy extends btd {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ btb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsy(btb btbVar, bro broVar, UrlResponseInfo urlResponseInfo) {
        super(broVar);
        this.b = btbVar;
        this.a = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer allocateDirect;
        btb btbVar = this.b;
        UrlResponseInfo urlResponseInfo = this.a;
        bsw bswVar = btbVar.f;
        bswVar.b = new RuntimeException();
        ArrayDeque<ByteBuffer> arrayDeque = bswVar.a;
        bswVar.a = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (ByteBuffer byteBuffer : arrayDeque) {
            byteBuffer.flip();
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            if (arrayDeque.size() == 0) {
                allocateDirect = ByteBuffer.allocateDirect(0);
            } else if (arrayDeque.size() == 1) {
                allocateDirect = arrayDeque.remove();
            } else {
                int i = 0;
                for (ByteBuffer byteBuffer2 : arrayDeque) {
                    i += byteBuffer2.remaining();
                }
                allocateDirect = ByteBuffer.allocateDirect(i);
                while (!arrayDeque.isEmpty()) {
                    allocateDirect.put(arrayDeque.remove());
                }
                allocateDirect.flip();
            }
            btbVar.a(urlResponseInfo, null, false, allocateDirect);
            return;
        }
        throw new IllegalStateException("This BufferQueue has already been consumed");
    }
}

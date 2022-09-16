package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: chc  reason: default package */
/* loaded from: classes2.dex */
final class chc extends chh {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ chf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chc(chf chfVar, cfv cfvVar, UrlResponseInfo urlResponseInfo) {
        super(cfvVar);
        this.b = chfVar;
        this.a = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer allocateDirect;
        chf chfVar = this.b;
        UrlResponseInfo urlResponseInfo = this.a;
        cha chaVar = chfVar.f;
        chaVar.b = new RuntimeException();
        ArrayDeque<ByteBuffer> arrayDeque = chaVar.a;
        chaVar.a = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (ByteBuffer byteBuffer : arrayDeque) {
            byteBuffer.flip();
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            if (arrayDeque.size() == 0) {
                allocateDirect = ByteBuffer.allocateDirect(0);
            } else if (arrayDeque.size() == 1) {
                allocateDirect = (ByteBuffer) arrayDeque.remove();
            } else {
                int i = 0;
                for (ByteBuffer byteBuffer2 : arrayDeque) {
                    i += byteBuffer2.remaining();
                }
                allocateDirect = ByteBuffer.allocateDirect(i);
                while (!arrayDeque.isEmpty()) {
                    allocateDirect.put((ByteBuffer) arrayDeque.remove());
                }
                allocateDirect.flip();
            }
            chfVar.a(urlResponseInfo, null, false, allocateDirect);
            return;
        }
        throw new IllegalStateException("This BufferQueue has already been consumed");
    }
}

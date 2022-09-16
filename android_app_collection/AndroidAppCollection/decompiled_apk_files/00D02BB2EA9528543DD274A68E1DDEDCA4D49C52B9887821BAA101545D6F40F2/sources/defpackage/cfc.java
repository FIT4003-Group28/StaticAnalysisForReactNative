package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cfc  reason: default package */
/* loaded from: classes.dex */
final class cfc {
    private final Queue<bso> a = cjp.h(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized bso a(ByteBuffer byteBuffer) {
        bso poll;
        poll = this.a.poll();
        if (poll == null) {
            poll = new bso();
        }
        poll.b = null;
        Arrays.fill(poll.a, (byte) 0);
        poll.c = new bsn();
        poll.d = 0;
        poll.b = byteBuffer.asReadOnlyBuffer();
        poll.b.position(0);
        poll.b.order(ByteOrder.LITTLE_ENDIAN);
        return poll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(bso bsoVar) {
        bsoVar.b = null;
        bsoVar.c = null;
        this.a.offer(bsoVar);
    }
}

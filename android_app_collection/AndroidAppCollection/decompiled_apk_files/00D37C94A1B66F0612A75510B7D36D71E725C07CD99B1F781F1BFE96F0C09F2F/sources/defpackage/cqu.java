package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cqu  reason: default package */
/* loaded from: classes3.dex */
final class cqu {
    private final Queue a = cvd.h(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized cgu a(ByteBuffer byteBuffer) {
        cgu cguVar;
        cguVar = (cgu) this.a.poll();
        if (cguVar == null) {
            cguVar = new cgu();
        }
        cguVar.b = null;
        Arrays.fill(cguVar.a, (byte) 0);
        cguVar.c = new cgt();
        cguVar.d = 0;
        cguVar.b = byteBuffer.asReadOnlyBuffer();
        cguVar.b.position(0);
        cguVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return cguVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(cgu cguVar) {
        cguVar.b = null;
        cguVar.c = null;
        this.a.offer(cguVar);
    }
}

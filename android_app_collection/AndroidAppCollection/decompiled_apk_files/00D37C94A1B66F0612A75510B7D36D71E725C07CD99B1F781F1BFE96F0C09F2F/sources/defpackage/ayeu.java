package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: ayeu  reason: default package */
/* loaded from: classes2.dex */
final class ayeu implements ayew {
    private final /* synthetic */ int a;

    public ayeu() {
    }

    public ayeu(int i) {
        this.a = i;
    }

    @Override // defpackage.ayex
    public final /* bridge */ /* synthetic */ int a(aykl ayklVar, int i, Object obj, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            Void r6 = (Void) obj;
            ayklVar.l(i);
            return 0;
        } else if (i3 == 1) {
            Void r62 = (Void) obj;
            return ayklVar.e();
        } else if (i3 == 2) {
            ayklVar.k((byte[]) obj, i2, i);
            return i2 + i;
        } else {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            ayklVar.i(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }
}

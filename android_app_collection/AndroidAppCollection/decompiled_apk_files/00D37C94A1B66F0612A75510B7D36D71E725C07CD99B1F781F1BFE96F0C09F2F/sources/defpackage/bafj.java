package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bafj  reason: default package */
/* loaded from: classes2.dex */
final class bafj implements bage {
    final /* synthetic */ boolean a;
    final /* synthetic */ bafk b;
    private final /* synthetic */ int c;

    public bafj(bafk bafkVar, boolean z) {
        this.b = bafkVar;
        this.a = z;
    }

    public bafj(bafk bafkVar, boolean z, int i) {
        this.c = i;
        this.b = bafkVar;
        this.a = z;
    }

    @Override // defpackage.bage
    public final void a() {
        bafk bafkVar;
        if (this.c != 0) {
            this.b.c.flip();
            bafk bafkVar2 = this.b;
            long j = bafkVar2.d;
            if (j == -1 || j - bafkVar2.e >= bafkVar2.c.remaining()) {
                bafk bafkVar3 = this.b;
                ByteBuffer byteBuffer = bafkVar3.c;
                int i = 0;
                while (byteBuffer.hasRemaining()) {
                    i += bafkVar3.g.write(byteBuffer);
                }
                bafkVar3.h.flush();
                bafkVar3.e += i;
                bafk bafkVar4 = this.b;
                long j2 = bafkVar4.e;
                long j3 = bafkVar4.d;
                if (j2 < j3 || (j3 == -1 && !this.a)) {
                    bafkVar4.c.clear();
                    this.b.a.set(0);
                    this.b.a(new bafg(this, null));
                    return;
                } else if (j3 == -1) {
                    bafkVar4.e();
                    return;
                } else if (j3 == j2) {
                    bafkVar4.e();
                    return;
                } else {
                    bafkVar4.f(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.b.e), Long.valueOf(this.b.d))));
                    return;
                }
            }
            this.b.f(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.b.e + bafkVar.c.remaining()), Long.valueOf(this.b.d))));
            return;
        }
        bafk bafkVar5 = this.b;
        bafkVar5.d = bafkVar5.b.getLength();
        bafk bafkVar6 = this.b;
        long j4 = bafkVar6.d;
        if (j4 == 0) {
            bafkVar6.e();
            return;
        }
        if (j4 <= 0 || j4 >= 8192) {
            bafkVar6.c = ByteBuffer.allocateDirect(8192);
        } else {
            bafkVar6.c = ByteBuffer.allocateDirect(((int) j4) + 1);
        }
        bafk bafkVar7 = this.b;
        long j5 = bafkVar7.d;
        if (j5 > 0 && j5 <= 2147483647L) {
            bafkVar7.f.setFixedLengthStreamingMode((int) j5);
        } else if (j5 <= 2147483647L) {
            bafkVar7.f.setChunkedStreamingMode(8192);
        } else {
            bafkVar7.f.setFixedLengthStreamingMode(j5);
        }
        if (this.a) {
            this.b.b();
            return;
        }
        this.b.a.set(1);
        bafk bafkVar8 = this.b;
        bafkVar8.b.rewind(bafkVar8);
    }
}

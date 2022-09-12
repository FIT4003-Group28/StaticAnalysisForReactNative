package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: dczn  reason: default package */
/* loaded from: classes5.dex */
final class dczn extends dcyu {
    private long a;
    private long b;
    private int c = 0;

    public dczn(int i) {
        long j = i;
        this.a = j;
        this.b = j;
    }

    private static long m(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long n(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long o(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.dcyu
    protected final void b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long n = n(j) ^ this.a;
        this.a = n;
        long rotateLeft = Long.rotateLeft(n, 27);
        long j3 = this.b;
        this.a = ((rotateLeft + j3) * 5) + 1390208809;
        long o = o(j2) ^ j3;
        this.b = o;
        this.b = ((Long.rotateLeft(o, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dcyu
    protected final void e(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long a;
        this.c += byteBuffer.remaining();
        long j7 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j = 0;
                a = j ^ decp.a(byteBuffer.get(0));
                break;
            case 2:
                j2 = 0;
                j = j2 ^ (decp.a(byteBuffer.get(1)) << 8);
                a = j ^ decp.a(byteBuffer.get(0));
                break;
            case 3:
                j3 = 0;
                j2 = j3 ^ (decp.a(byteBuffer.get(2)) << 16);
                j = j2 ^ (decp.a(byteBuffer.get(1)) << 8);
                a = j ^ decp.a(byteBuffer.get(0));
                break;
            case 4:
                j4 = 0;
                j3 = j4 ^ (decp.a(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (decp.a(byteBuffer.get(2)) << 16);
                j = j2 ^ (decp.a(byteBuffer.get(1)) << 8);
                a = j ^ decp.a(byteBuffer.get(0));
                break;
            case 5:
                j5 = 0;
                j4 = j5 ^ (decp.a(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (decp.a(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (decp.a(byteBuffer.get(2)) << 16);
                j = j2 ^ (decp.a(byteBuffer.get(1)) << 8);
                a = j ^ decp.a(byteBuffer.get(0));
                break;
            case 6:
                j6 = 0;
                j5 = (decp.a(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (decp.a(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (decp.a(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (decp.a(byteBuffer.get(2)) << 16);
                j = j2 ^ (decp.a(byteBuffer.get(1)) << 8);
                a = j ^ decp.a(byteBuffer.get(0));
                break;
            case 7:
                j6 = decp.a(byteBuffer.get(6)) << 48;
                j5 = (decp.a(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (decp.a(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (decp.a(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (decp.a(byteBuffer.get(2)) << 16);
                j = j2 ^ (decp.a(byteBuffer.get(1)) << 8);
                a = j ^ decp.a(byteBuffer.get(0));
                break;
            case 8:
                a = byteBuffer.getLong();
                break;
            case 9:
                j7 ^= decp.a(byteBuffer.get(8));
                a = byteBuffer.getLong();
                break;
            case 10:
                j7 ^= decp.a(byteBuffer.get(9)) << 8;
                j7 ^= decp.a(byteBuffer.get(8));
                a = byteBuffer.getLong();
                break;
            case 11:
                j7 ^= decp.a(byteBuffer.get(10)) << 16;
                j7 ^= decp.a(byteBuffer.get(9)) << 8;
                j7 ^= decp.a(byteBuffer.get(8));
                a = byteBuffer.getLong();
                break;
            case 12:
                j7 ^= decp.a(byteBuffer.get(11)) << 24;
                j7 ^= decp.a(byteBuffer.get(10)) << 16;
                j7 ^= decp.a(byteBuffer.get(9)) << 8;
                j7 ^= decp.a(byteBuffer.get(8));
                a = byteBuffer.getLong();
                break;
            case 13:
                j7 ^= decp.a(byteBuffer.get(12)) << 32;
                j7 ^= decp.a(byteBuffer.get(11)) << 24;
                j7 ^= decp.a(byteBuffer.get(10)) << 16;
                j7 ^= decp.a(byteBuffer.get(9)) << 8;
                j7 ^= decp.a(byteBuffer.get(8));
                a = byteBuffer.getLong();
                break;
            case 14:
                j7 ^= decp.a(byteBuffer.get(13)) << 40;
                j7 ^= decp.a(byteBuffer.get(12)) << 32;
                j7 ^= decp.a(byteBuffer.get(11)) << 24;
                j7 ^= decp.a(byteBuffer.get(10)) << 16;
                j7 ^= decp.a(byteBuffer.get(9)) << 8;
                j7 ^= decp.a(byteBuffer.get(8));
                a = byteBuffer.getLong();
                break;
            case 15:
                j7 = decp.a(byteBuffer.get(14)) << 48;
                j7 ^= decp.a(byteBuffer.get(13)) << 40;
                j7 ^= decp.a(byteBuffer.get(12)) << 32;
                j7 ^= decp.a(byteBuffer.get(11)) << 24;
                j7 ^= decp.a(byteBuffer.get(10)) << 16;
                j7 ^= decp.a(byteBuffer.get(9)) << 8;
                j7 ^= decp.a(byteBuffer.get(8));
                a = byteBuffer.getLong();
                break;
            default:
                throw new AssertionError("Should never get here.");
        }
        this.a = n(a) ^ this.a;
        this.b ^= o(j7);
    }

    @Override // defpackage.dcyu
    protected final dcyz l() {
        long j = this.a;
        long j2 = this.c;
        long j3 = this.b ^ j2;
        long j4 = (j ^ j2) + j3;
        this.a = j4;
        this.b = j3 + j4;
        this.a = m(j4);
        long m = m(this.b);
        long j5 = this.a + m;
        this.a = j5;
        this.b = m + j5;
        return dcyz.g(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array());
    }
}

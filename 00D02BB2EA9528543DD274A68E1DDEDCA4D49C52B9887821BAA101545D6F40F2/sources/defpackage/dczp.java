package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dczp  reason: default package */
/* loaded from: classes.dex */
final class dczp extends dcyq {
    private int a;
    private long b;
    private int c;
    private int d = 0;
    private boolean e = false;

    public dczp(int i) {
        this.a = i;
    }

    private final void b(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.b = j3;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            this.a = dczq.i(this.a, dczq.h((int) j3));
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.dczb
    public final void d(byte b) {
        b(1, b & 255);
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.remaining() >= 4) {
            h(byteBuffer.getInt());
        }
        while (byteBuffer.hasRemaining()) {
            d(byteBuffer.get());
        }
        byteBuffer.order(order);
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void g(byte[] bArr, int i) {
        int i2 = 0;
        dbsk.u(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            b(4, dczq.g(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            d(bArr[i2]);
            i2++;
        }
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void h(int i) {
        b(4, i);
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final void i(long j) {
        b(4, (int) j);
        b(4, j >>> 32);
    }

    @Override // defpackage.dcyq, defpackage.dczb
    public final dczb k(CharSequence charSequence, Charset charset) {
        if (dbrc.c.equals(charset)) {
            int length = charSequence.length();
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence.charAt(i + 1);
                char charAt3 = charSequence.charAt(i + 2);
                char charAt4 = charSequence.charAt(i + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                b(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
                i = i2;
            }
            while (i < length) {
                char charAt5 = charSequence.charAt(i);
                if (charAt5 < 128) {
                    b(1, charAt5);
                } else if (charAt5 < 2048) {
                    b(2, dczq.m(charAt5));
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    b(3, dczq.l(charAt5));
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i);
                    if (codePointAt != charAt5) {
                        i++;
                        b(4, dczq.k(codePointAt));
                    } else {
                        c(charSequence.subSequence(i, length).toString().getBytes(charset));
                        return this;
                    }
                }
                i++;
            }
            return this;
        }
        return super.k(charSequence, charset);
    }

    @Override // defpackage.dczb
    public final dcyz p() {
        dbsk.l(!this.e);
        this.e = true;
        int h = this.a ^ dczq.h((int) this.b);
        this.a = h;
        return dczq.j(h, this.d);
    }
}

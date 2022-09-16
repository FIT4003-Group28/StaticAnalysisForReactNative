package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: axkd  reason: default package */
/* loaded from: classes2.dex */
public final class axkd {
    final int a;
    int b;
    private final ByteBuffer c;

    public axkd(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.a = byteBuffer.position();
    }

    public final int a(int i) {
        int a;
        int i2 = this.c.get(this.a + (this.b / 8));
        if (i2 < 0) {
            i2 += 256;
        }
        int i3 = this.b;
        int i4 = i3 % 8;
        int i5 = 8 - i4;
        if (i <= i5) {
            a = ((i2 << i4) & PrivateKeyType.INVALID) >> (i4 + (i5 - i));
            this.b = i3 + i;
        } else {
            int i6 = i - i5;
            a = (a(i5) << i6) + a(i6);
        }
        ByteBuffer byteBuffer = this.c;
        int i7 = this.a;
        double d = this.b;
        Double.isNaN(d);
        byteBuffer.position(i7 + ((int) Math.ceil(d / 8.0d)));
        return a;
    }

    public final int b() {
        return (this.c.limit() * 8) - this.b;
    }
}

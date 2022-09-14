package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dcur  reason: default package */
/* loaded from: classes5.dex */
public final class dcur {
    public final InputStream a;

    public dcur(InputStream inputStream) {
        this.a = inputStream;
    }

    public final byte a() {
        return dcuq.a(this.a);
    }

    public final int b() {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    public final double c() {
        return Double.longBitsToDouble((a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48) | ((255 & a()) << 56));
    }

    public final int d() {
        return (int) e();
    }

    public final long e() {
        InputStream inputStream = this.a;
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = dcuq.a(inputStream);
            j |= (a & Byte.MAX_VALUE) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw new IOException("Malformed varint.");
    }
}

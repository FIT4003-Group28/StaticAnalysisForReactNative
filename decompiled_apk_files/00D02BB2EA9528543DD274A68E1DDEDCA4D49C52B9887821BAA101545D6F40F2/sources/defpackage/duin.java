package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.UnsupportedEncodingException;
/* compiled from: PG */
/* renamed from: duin  reason: default package */
/* loaded from: classes6.dex */
public final class duin implements duhv {
    private final byte[] a;
    private int b;

    public duin(String str) {
        try {
            this.a = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.duhv
    public final synchronized int a(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        dbsk.b(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE - i >= i2, "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        int length2 = this.a.length;
        if (i3 == length2) {
            return 0;
        }
        int min = Math.min(i2, length2 - i3);
        for (int i4 = 0; i4 < min; i4++) {
            byte[] bArr2 = this.a;
            int i5 = this.b;
            bArr[i + i4] = bArr2[i5];
            this.b = i5 + 1;
        }
        return min;
    }

    @Override // defpackage.duhv
    public final synchronized void b() {
    }

    @Override // defpackage.duhv
    public final synchronized long c() {
        throw null;
    }

    @Override // defpackage.duhv, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // defpackage.duhv
    public final synchronized long d() {
        return this.b;
    }

    @Override // defpackage.duhv
    public final synchronized long e() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.duhv
    public final synchronized void f() {
        throw null;
    }

    @Override // defpackage.duhv
    public final synchronized long g(long j) {
        throw null;
    }

    @Override // defpackage.duhv
    public final synchronized long h() {
        return this.a.length;
    }

    @Override // defpackage.duhv
    public final synchronized boolean i() {
        return this.b < this.a.length;
    }
}

package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: dexx  reason: default package */
/* loaded from: classes6.dex */
final class dexx extends InputStream implements dygt, dyfv {
    @dzsi
    private byte[][] a;
    @dzsi
    private byte[] b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    public dexx(byte[] bArr) {
        this.a = null;
        int length = bArr.length;
        this.b = length <= 0 ? null : bArr;
        this.e = length;
    }

    private final void b() {
        int i = this.c + 1;
        this.c = i;
        this.d = 0;
        byte[][] bArr = this.a;
        if (bArr == null || i >= bArr.length) {
            this.b = null;
        } else {
            this.b = bArr[i];
        }
    }

    @Override // defpackage.dyfv
    public final int a(OutputStream outputStream) {
        throw null;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f) {
            this.f = true;
            this.b = null;
            byte[][] bArr = this.a;
            if (bArr == null) {
                return;
            }
            for (byte[] bArr2 : bArr) {
                dexy.c(bArr2);
            }
            this.a = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.b;
        if (bArr != null) {
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            byte b = bArr[i];
            this.e--;
            if (i2 == bArr.length) {
                b();
            }
            return b;
        }
        return -1;
    }

    public dexx(byte[][] bArr, int i) {
        this.a = bArr;
        this.e = i;
        if (bArr.length > 0) {
            this.b = bArr[0];
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (true) {
            byte[] bArr2 = this.b;
            if (bArr2 == null) {
                break;
            }
            int f = decl.f(i3, bArr2.length - this.d, this.e);
            System.arraycopy(this.b, this.d, bArr, i, f);
            i += f;
            i3 -= f;
            this.e -= f;
            if (i3 != 0) {
                b();
            } else {
                int i4 = this.d + f;
                this.d = i4;
                if (i4 == this.b.length) {
                    b();
                }
            }
        }
        int i5 = i2 - i3;
        if (i5 > 0 || this.e > 0) {
            return i5;
        }
        return -1;
    }
}

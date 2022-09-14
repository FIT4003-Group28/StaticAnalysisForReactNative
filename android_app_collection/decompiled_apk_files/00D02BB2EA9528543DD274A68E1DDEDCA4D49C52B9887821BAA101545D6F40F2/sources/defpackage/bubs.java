package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: bubs  reason: default package */
/* loaded from: classes4.dex */
public final class bubs extends InputStream {
    private final InputStream a;
    private final InputStream b;
    private InputStream c;

    public bubs(InputStream inputStream, InputStream inputStream2) {
        this.a = inputStream;
        this.b = inputStream2;
        this.c = inputStream;
    }

    private final void a() {
        this.c = this.c == this.a ? this.b : null;
    }

    @Override // java.io.InputStream
    public final int read() {
        InputStream inputStream = this.c;
        if (inputStream == null) {
            return -1;
        }
        int read = inputStream.read();
        if (read >= 0) {
            return read;
        }
        a();
        return read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.c;
        if (inputStream == null) {
            return -1;
        }
        int read = inputStream.read(bArr, i, i2);
        if (read >= 0) {
            return read;
        }
        a();
        return read(bArr, i, i2);
    }
}

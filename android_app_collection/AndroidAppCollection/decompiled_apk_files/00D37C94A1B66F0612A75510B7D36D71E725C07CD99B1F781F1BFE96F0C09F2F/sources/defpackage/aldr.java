package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InterruptedIOException;
/* compiled from: PG */
/* renamed from: aldr  reason: default package */
/* loaded from: classes.dex */
public final class aldr extends aldh {
    private boolean a;
    private final File b;
    private volatile long c;

    public aldr(File file, File file2) {
        super(new FileInputStream(file));
        this.a = false;
        this.c = -1L;
        this.b = file2;
        f();
    }

    private final int e(aldq aldqVar) {
        long currentTimeMillis = System.currentTimeMillis();
        while (!this.a) {
            int a = aldqVar.a();
            if (a >= 0) {
                return a;
            }
            if (System.currentTimeMillis() - currentTimeMillis < 20000) {
                try {
                    Thread.sleep(30L);
                    f();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException(e.getMessage() != null ? e.getMessage() : "");
                }
            } else {
                return aldqVar.a();
            }
        }
        return aldqVar.a();
    }

    private final void f() {
        if (this.b.exists()) {
            this.c = this.b.length();
            this.a = true;
        }
    }

    @Override // defpackage.aldh
    public final long a() {
        return this.c;
    }

    @Override // defpackage.aldh
    public final boolean b() {
        if (!this.a) {
            f();
        }
        return this.c != -1;
    }

    public final /* synthetic */ int c(byte[] bArr, int i, int i2) {
        return super.read(bArr, i, i2);
    }

    public final /* synthetic */ int d() {
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        return e(new aldq() { // from class: aldo
            @Override // defpackage.aldq
            public final int a() {
                return aldr.this.d();
            }
        });
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(final byte[] bArr, final int i, final int i2) {
        return e(new aldq() { // from class: aldp
            @Override // defpackage.aldq
            public final int a() {
                return aldr.this.c(bArr, i, i2);
            }
        });
    }
}

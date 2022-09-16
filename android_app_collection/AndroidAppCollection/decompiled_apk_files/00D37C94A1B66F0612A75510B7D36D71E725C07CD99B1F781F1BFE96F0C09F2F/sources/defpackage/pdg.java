package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: pdg  reason: default package */
/* loaded from: classes4.dex */
public final class pdg implements axd {
    private final pde a;
    private final int b;
    private asy c;
    private long d;
    private File e;
    private OutputStream f;
    private FileOutputStream g;
    private long h;
    private long i;
    private pwy j;

    public pdg(pde pdeVar, int i) {
        ptx.f(true, "fragmentSize must be positive or C.LENGTH_UNSET.");
        this.a = pdeVar;
        this.b = i;
    }

    private final void d() {
        OutputStream outputStream = this.f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.g.getFD().sync();
                pxi.J(this.f);
                this.f = null;
                File file = this.e;
                this.e = null;
                this.a.i(file, this.h);
            } catch (Throwable th) {
                pxi.J(this.f);
                this.f = null;
                File file2 = this.e;
                this.e = null;
                file2.delete();
                throw th;
            }
        }
    }

    private final void e() {
        long j = this.c.h;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.i, this.d);
        }
        pde pdeVar = this.a;
        asy asyVar = this.c;
        this.e = pdeVar.e(asyVar.i, asyVar.f + this.i, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        this.g = fileOutputStream;
        int i = this.b;
        if (i > 0) {
            pwy pwyVar = this.j;
            if (pwyVar == null) {
                this.j = new pwy(this.g, i);
            } else {
                pwyVar.a(fileOutputStream);
            }
            this.f = this.j;
        } else {
            this.f = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // defpackage.axd
    public final void a() {
        if (this.c == null) {
            return;
        }
        try {
            d();
        } catch (IOException e) {
            throw new pdf(e);
        }
    }

    @Override // defpackage.axd
    public final void b(asy asyVar) {
        if (asyVar.h != -1 || !asyVar.g(2)) {
            this.c = asyVar;
            this.d = true != asyVar.g(4) ? Long.MAX_VALUE : 5242880L;
            this.i = 0L;
            try {
                e();
                return;
            } catch (IOException e) {
                throw new pdf(e);
            }
        }
        this.c = null;
    }

    @Override // defpackage.axd
    public final void c(byte[] bArr, int i, int i2) {
        if (this.c != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.h == this.d) {
                        d();
                        e();
                    }
                    int min = (int) Math.min(i2 - i3, this.d - this.h);
                    this.f.write(bArr, i + i3, min);
                    i3 += min;
                    long j = min;
                    this.h += j;
                    this.i += j;
                } catch (IOException e) {
                    throw new pdf(e);
                }
            }
        }
    }
}

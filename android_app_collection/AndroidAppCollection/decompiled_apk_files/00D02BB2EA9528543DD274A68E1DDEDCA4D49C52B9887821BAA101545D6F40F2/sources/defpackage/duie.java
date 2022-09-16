package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: duie  reason: default package */
/* loaded from: classes6.dex */
final class duie implements duhv {
    private final String a;
    private final duhv b;
    private duin c;
    private duin d;
    private duin e;
    private final long g;
    private boolean h;
    private int i = 1;
    private long f = 0;

    public duie(String str, @dzsi String str2, @dzsi duhx duhxVar, duhv duhvVar) {
        this.a = str;
        this.b = duhvVar;
        this.c = new duin("--" + str + "\r\nContent-Type: text/plain\r\n\r\n" + str2 + "\r\n");
        StringBuilder sb = new StringBuilder("--");
        sb.append(str);
        sb.append("\r\n");
        for (String str3 : duhxVar.b()) {
            sb.append(str3);
            sb.append(": ");
            sb.append(duhxVar.d(str3));
            sb.append("\r\n");
        }
        if (this.b.h() >= 0 && duhxVar.c("content-length").isEmpty()) {
            sb.append("Content-Length: ");
            sb.append(this.b.h());
            sb.append("\r\n");
        }
        sb.append("\r\n");
        this.d = new duin(sb.toString());
        if (duhvVar.h() == -1) {
            this.g = -1L;
            return;
        }
        this.e = j();
        this.g = this.c.h() + this.d.h() + duhvVar.h() + this.e.h();
    }

    private final duin j() {
        return new duin("\r\n--" + this.a + "--");
    }

    @Override // defpackage.duhv
    public final void b() {
    }

    @Override // defpackage.duhv
    public final long c() {
        throw null;
    }

    @Override // defpackage.duhv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.b.close();
    }

    @Override // defpackage.duhv
    public final long d() {
        return this.f;
    }

    @Override // defpackage.duhv
    public final long e() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.duhv
    public final void f() {
        throw null;
    }

    @Override // defpackage.duhv
    public final long g(long j) {
        throw null;
    }

    @Override // defpackage.duhv
    public final long h() {
        return this.g;
    }

    @Override // defpackage.duhv
    public final boolean i() {
        return this.i != 5;
    }

    @Override // defpackage.duhv
    public final int a(byte[] bArr, int i, int i2) {
        if (this.h) {
            throw new IOException("Trying to read from an already-closed stream.");
        }
        int length = bArr.length;
        dbsk.b(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE - i >= i2, "Buffer length must be greater than or equal to desired number of bytes.");
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        while (true) {
            long j2 = this.f;
            if (j2 != j) {
                return (int) (j2 - j);
            }
            int i3 = this.i;
            int i4 = i3 - 1;
            duhv duhvVar = null;
            if (i3 != 0) {
                if (i4 == 0) {
                    duhvVar = this.c;
                    i3 = 2;
                } else if (i4 == 1) {
                    duhvVar = this.d;
                    i3 = 3;
                } else if (i4 == 2) {
                    duhvVar = this.b;
                    i3 = 4;
                } else if (i4 == 3) {
                    if (this.e == null) {
                        this.e = j();
                    }
                    duhvVar = this.e;
                    i3 = 5;
                } else if (i4 == 4) {
                    return 0;
                }
                this.f += duhvVar.a(bArr, i, i2);
                if (duhvVar.e() < Long.MAX_VALUE) {
                    duhvVar.b();
                }
                if (!duhvVar.i()) {
                    this.i = i3;
                }
            } else {
                throw null;
            }
        }
    }
}

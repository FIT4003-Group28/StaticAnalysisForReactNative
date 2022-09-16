package defpackage;

import java.io.IOException;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: awyg  reason: default package */
/* loaded from: classes2.dex */
final class awyg implements awxx {
    private final String a;
    private final awxx b;
    private awyo c;
    private awyo d;
    private awyo e;
    private final long h;
    private final MessageDigest i;
    private boolean j;
    private int k = 1;
    private long f = 0;
    private long g = 0;

    public awyg(String str, String str2, awya awyaVar, awxx awxxVar, MessageDigest messageDigest) {
        this.a = str;
        this.b = awxxVar;
        this.i = messageDigest;
        this.c = new awyo("--" + str + "\r\nContent-Type: text/plain\r\n\r\n" + str2 + "\r\n");
        StringBuilder sb = new StringBuilder("--");
        sb.append(str);
        sb.append("\r\n");
        for (String str3 : awyaVar.c()) {
            sb.append(str3);
            sb.append(": ");
            sb.append(awyaVar.a(str3));
            sb.append("\r\n");
        }
        if (this.b.a() >= 0 && awyaVar.b("content-length").isEmpty()) {
            sb.append("Content-Length: ");
            sb.append(this.b.a());
            sb.append("\r\n");
        }
        sb.append("\r\n");
        this.d = new awyo(sb.toString());
        if (awxxVar.a() == -1 || messageDigest != null) {
            this.h = -1L;
            return;
        }
        this.e = j();
        this.h = this.c.a() + this.d.a() + awxxVar.a() + this.e.a();
    }

    private final awyo j() {
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n--");
        sb.append(this.a);
        MessageDigest messageDigest = this.i;
        if (messageDigest != null && (messageDigest.getAlgorithm().equalsIgnoreCase("md5") || this.i.getAlgorithm().equalsIgnoreCase("sha-1"))) {
            sb.append("\r\n\r\nX-Goog-Hash:");
            if (this.i.getAlgorithm().equalsIgnoreCase("md5")) {
                sb.append(" md5=");
            } else {
                sb.append(" sha1=");
            }
            sb.append(aneg.d.i(this.i.digest()));
            sb.append("\r\n--");
            sb.append(this.a);
            sb.append("--");
            return new awyo(sb.toString());
        }
        sb.append("--");
        return new awyo(sb.toString());
    }

    @Override // defpackage.awxx
    public final long a() {
        return this.h;
    }

    @Override // defpackage.awxx
    public final int b(byte[] bArr, int i, int i2) {
        if (this.j) {
            throw new IOException("Trying to read from an already-closed stream.");
        }
        aqxo.q(bArr.length - i >= i2, "Buffer length must be greater than or equal to desired number of bytes.");
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        while (true) {
            long j2 = this.f;
            if (j2 != j) {
                return (int) (j2 - j);
            }
            int i3 = this.k;
            int i4 = i3 - 1;
            awxx awxxVar = null;
            if (i3 != 0) {
                if (i4 == 0) {
                    awxxVar = this.c;
                    i3 = 2;
                } else if (i4 == 1) {
                    awxxVar = this.d;
                    i3 = 3;
                } else if (i4 == 2) {
                    awxxVar = this.b;
                    i3 = 4;
                } else if (i4 == 3) {
                    if (this.e == null) {
                        this.e = j();
                    }
                    awxxVar = this.e;
                    i3 = 5;
                } else if (i4 == 4) {
                    return 0;
                }
                this.f += awxxVar.b(bArr, i, i2);
                if (awxxVar.d() < Long.MAX_VALUE) {
                    awxxVar.g();
                }
                if (!awxxVar.i()) {
                    this.k = i3;
                }
            } else {
                throw null;
            }
        }
    }

    @Override // defpackage.awxx
    public final long c() {
        return this.g;
    }

    @Override // defpackage.awxx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j = true;
        this.b.close();
    }

    @Override // defpackage.awxx
    public final long d() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.awxx
    public final long e() {
        return this.f;
    }

    @Override // defpackage.awxx
    public final long f(long j) {
        throw new UnsupportedOperationException("Cannot call skip.");
    }

    @Override // defpackage.awxx
    public final void g() {
        this.g = this.f;
    }

    @Override // defpackage.awxx
    public final void h() {
        throw new UnsupportedOperationException("Cannot call rewind.");
    }

    @Override // defpackage.awxx
    public final boolean i() {
        return this.k != 5;
    }
}

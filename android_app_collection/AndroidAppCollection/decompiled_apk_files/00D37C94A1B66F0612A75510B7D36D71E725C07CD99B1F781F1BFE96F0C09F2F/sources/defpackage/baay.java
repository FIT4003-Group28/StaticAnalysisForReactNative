package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: baay  reason: default package */
/* loaded from: classes2.dex */
public final class baay implements Cloneable, ByteChannel, baba, baaz {
    public babi a;
    public long b;

    public final byte a(long j) {
        int i;
        babm.a(this.b, j, 1L);
        long j2 = this.b;
        if (j2 - j <= j) {
            long j3 = j - j2;
            babi babiVar = this.a;
            do {
                babiVar = babiVar.g;
                int i2 = babiVar.c;
                i = babiVar.b;
                j3 += i2 - i;
            } while (j3 < 0);
            return babiVar.a[i + ((int) j3)];
        }
        babi babiVar2 = this.a;
        while (true) {
            int i3 = babiVar2.c;
            int i4 = babiVar2.b;
            long j4 = i3 - i4;
            if (j >= j4) {
                j -= j4;
                babiVar2 = babiVar2.f;
            } else {
                return babiVar2.a[i4 + ((int) j)];
            }
        }
    }

    public final byte b() {
        long j = this.b;
        if (j != 0) {
            babi babiVar = this.a;
            int i = babiVar.b;
            int i2 = babiVar.c;
            int i3 = i + 1;
            byte b = babiVar.a[i];
            this.b = j - 1;
            if (i3 == i2) {
                this.a = babiVar.a();
                babj.b(babiVar);
            } else {
                babiVar.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public final int c(byte[] bArr, int i, int i2) {
        babm.a(bArr.length, i, i2);
        babi babiVar = this.a;
        if (babiVar == null) {
            return -1;
        }
        int min = Math.min(i2, babiVar.c - babiVar.b);
        System.arraycopy(babiVar.a, babiVar.b, bArr, i, min);
        int i3 = babiVar.b + min;
        babiVar.b = i3;
        this.b -= min;
        if (i3 == babiVar.c) {
            this.a = babiVar.a();
            babj.b(babiVar);
        }
        return min;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        baay baayVar = new baay();
        if (this.b != 0) {
            babi b = this.a.b();
            baayVar.a = b;
            b.g = b;
            b.f = b;
            babi babiVar = this.a;
            while (true) {
                babiVar = babiVar.f;
                if (babiVar == this.a) {
                    break;
                }
                baayVar.a.g.d(babiVar.b());
            }
            baayVar.b = this.b;
        }
        return baayVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.babl
    public final void close() {
    }

    @Override // defpackage.baba
    public final long d(babb babbVar) {
        throw null;
    }

    @Override // defpackage.babl
    public final long e(baay baayVar, long j) {
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            baayVar.m(this, j);
            return j;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baay)) {
            return false;
        }
        baay baayVar = (baay) obj;
        long j = this.b;
        if (j != baayVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        babi babiVar = this.a;
        babi babiVar2 = baayVar.a;
        int i = babiVar.b;
        int i2 = babiVar2.b;
        while (j2 < this.b) {
            long min = Math.min(babiVar.c - i, babiVar2.c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (babiVar.a[i] != babiVar2.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == babiVar.c) {
                babiVar = babiVar.f;
                i = babiVar.b;
            }
            if (i2 == babiVar2.c) {
                babiVar2 = babiVar2.f;
                i2 = babiVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.baba
    public final InputStream f() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    public final String g(long j, Charset charset) {
        babm.a(this.b, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                StringBuilder sb = new StringBuilder(51);
                sb.append("byteCount > Integer.MAX_VALUE: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j == 0) {
                return "";
            } else {
                babi babiVar = this.a;
                int i = babiVar.b;
                if (i + j > babiVar.c) {
                    return new String(p(j), charset);
                }
                String str = new String(babiVar.a, i, (int) j, charset);
                int i2 = (int) (babiVar.b + j);
                babiVar.b = i2;
                this.b -= j;
                if (i2 == babiVar.c) {
                    this.a = babiVar.a();
                    babj.b(babiVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final String h() {
        try {
            return g(this.b, babm.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final int hashCode() {
        babi babiVar = this.a;
        if (babiVar != null) {
            int i = 1;
            do {
                int i2 = babiVar.c;
                for (int i3 = babiVar.b; i3 < i2; i3++) {
                    i = (i * 31) + babiVar.a[i3];
                }
                babiVar = babiVar.f;
            } while (babiVar != this.a);
            return i;
        }
        return 0;
    }

    public final String i(long j) {
        return g(j, babm.a);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final babi j(int i) {
        babi babiVar = this.a;
        if (babiVar == null) {
            babi a = babj.a();
            this.a = a;
            a.g = a;
            a.f = a;
            return a;
        }
        babi babiVar2 = babiVar.g;
        if (babiVar2.c + i <= 8192 && babiVar2.e) {
            return babiVar2;
        }
        babi a2 = babj.a();
        babiVar2.d(a2);
        return a2;
    }

    public final void m(baay baayVar, long j) {
        babi a;
        if (baayVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        babm.a(baayVar.b, 0L, j);
        while (j > 0) {
            babi babiVar = baayVar.a;
            int i = babiVar.c - babiVar.b;
            int i2 = 0;
            if (j < i) {
                babi babiVar2 = this.a;
                babi babiVar3 = babiVar2 != null ? babiVar2.g : null;
                if (babiVar3 != null && babiVar3.e) {
                    if ((babiVar3.c + j) - (babiVar3.d ? 0 : babiVar3.b) <= 8192) {
                        babiVar.c(babiVar3, (int) j);
                        baayVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                int i3 = (int) j;
                if (i3 > 0 && i3 <= i) {
                    if (i3 >= 1024) {
                        a = babiVar.b();
                    } else {
                        a = babj.a();
                        System.arraycopy(babiVar.a, babiVar.b, a.a, 0, i3);
                    }
                    a.c = a.b + i3;
                    babiVar.b += i3;
                    babiVar.g.d(a);
                    baayVar.a = a;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            babi babiVar4 = baayVar.a;
            long j2 = babiVar4.c - babiVar4.b;
            baayVar.a = babiVar4.a();
            babi babiVar5 = this.a;
            if (babiVar5 == null) {
                this.a = babiVar4;
                babiVar4.g = babiVar4;
                babiVar4.f = babiVar4;
            } else {
                babiVar5.g.d(babiVar4);
                babi babiVar6 = babiVar4.g;
                if (babiVar6 != babiVar4) {
                    if (babiVar6.e) {
                        int i4 = babiVar4.c - babiVar4.b;
                        int i5 = 8192 - babiVar6.c;
                        if (!babiVar6.d) {
                            i2 = babiVar6.b;
                        }
                        if (i4 <= i5 + i2) {
                            babiVar4.c(babiVar6, i4);
                            babiVar4.a();
                            babj.b(babiVar4);
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            baayVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // defpackage.baba
    public final boolean n(long j) {
        throw null;
    }

    public final byte[] o() {
        try {
            return p(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] p(long j) {
        babm.a(this.b, 0L, j);
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int c = c(bArr, i2, i - i2);
            if (c == -1) {
                throw new EOFException();
            }
            i2 += c;
        }
        return bArr;
    }

    public final void q(int i) {
        babi j = j(1);
        byte[] bArr = j.a;
        int i2 = j.c;
        j.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.baaz
    public final /* bridge */ /* synthetic */ void r() {
        q(34);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        babi babiVar = this.a;
        if (babiVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), babiVar.c - babiVar.b);
        byteBuffer.put(babiVar.a, babiVar.b, min);
        int i = babiVar.b + min;
        babiVar.b = i;
        this.b -= min;
        if (i == babiVar.c) {
            this.a = babiVar.a();
            babj.b(babiVar);
        }
        return min;
    }

    public final void s(int i) {
        babi j = j(4);
        byte[] bArr = j.a;
        int i2 = j.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & PrivateKeyType.INVALID);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[i5] = (byte) (i & PrivateKeyType.INVALID);
        j.c = i5 + 1;
        this.b += 4;
    }

    public final void k() {
        try {
            l(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        babb babkVar;
        long j = this.b;
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("size > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        int i = (int) j;
        if (i == 0) {
            babkVar = babb.b;
        } else {
            babkVar = new babk(this, i);
        }
        return babkVar.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            babi j = j(1);
            int min = Math.min(i, 8192 - j.c);
            byteBuffer.get(j.a, j.c, min);
            i -= min;
            j.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    public final void t(String str, int i, int i2) {
        char charAt;
        if (str != null) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(27);
                sb.append("beginIndex < 0: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("endIndex < beginIndex: ");
                sb2.append(i2);
                sb2.append(" < ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i2 > str.length()) {
                int length = str.length();
                StringBuilder sb3 = new StringBuilder(51);
                sb3.append("endIndex > string.length: ");
                sb3.append(i2);
                sb3.append(" > ");
                sb3.append(length);
                throw new IllegalArgumentException(sb3.toString());
            } else {
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        babi j = j(1);
                        byte[] bArr = j.a;
                        int i3 = j.c - i;
                        int min = Math.min(i2, 8192 - i3);
                        int i4 = i + 1;
                        bArr[i + i3] = (byte) charAt2;
                        while (true) {
                            i = i4;
                            if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                break;
                            }
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                        int i5 = j.c;
                        int i6 = (i3 + i) - i5;
                        j.c = i5 + i6;
                        this.b += i6;
                    } else {
                        if (charAt2 < 2048) {
                            q((charAt2 >> 6) | 192);
                            q((charAt2 & '?') | 128);
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            q((charAt2 >> '\f') | 224);
                            q(((charAt2 >> 6) & 63) | 128);
                            q((charAt2 & '?') | 128);
                        } else {
                            int i7 = i + 1;
                            char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                            if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                q(63);
                                i = i7;
                            } else {
                                int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                q((i8 >> 18) | 240);
                                q(((i8 >> 12) & 63) | 128);
                                q(((i8 >> 6) & 63) | 128);
                                q((i8 & 63) | 128);
                                i += 2;
                            }
                        }
                        i++;
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public final void l(long j) {
        babi babiVar;
        while (j > 0) {
            if (this.a != null) {
                int min = (int) Math.min(j, babiVar.c - babiVar.b);
                long j2 = min;
                this.b -= j2;
                j -= j2;
                babi babiVar2 = this.a;
                int i = babiVar2.b + min;
                babiVar2.b = i;
                if (i == babiVar2.c) {
                    this.a = babiVar2.a();
                    babj.b(babiVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }
}

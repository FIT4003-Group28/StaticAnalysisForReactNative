package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: eaiz  reason: default package */
/* loaded from: classes6.dex */
public final class eaiz implements Cloneable, ByteChannel, eajb, eaja {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @dzsi
    public eaju a;
    public long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eaju B(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        eaju eajuVar = this.a;
        if (eajuVar == null) {
            eaju a = eajv.a();
            this.a = a;
            a.g = a;
            a.f = a;
            return a;
        }
        eaju eajuVar2 = eajuVar.g;
        if (eajuVar2.c + i <= 8192 && eajuVar2.e) {
            return eajuVar2;
        }
        eaju a2 = eajv.a();
        eajuVar2.d(a2);
        return a2;
    }

    public final long C(byte b, long j, long j2) {
        eaju eajuVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.b), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (eajuVar = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                eajuVar = eajuVar.g;
                j4 -= eajuVar.c - eajuVar.b;
            }
        } else {
            while (true) {
                long j6 = (eajuVar.c - eajuVar.b) + j3;
                if (j6 >= j) {
                    break;
                }
                eajuVar = eajuVar.f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = eajuVar.a;
            int min = (int) Math.min(eajuVar.c, (eajuVar.b + j5) - j4);
            for (int i = (int) ((eajuVar.b + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return (i - eajuVar.b) + j4;
                }
            }
            j4 += eajuVar.c - eajuVar.b;
            eajuVar = eajuVar.f;
            j7 = j4;
        }
        return -1L;
    }

    @Override // defpackage.eajb
    public final long D(eajc eajcVar) {
        throw null;
    }

    public final eajc F(int i) {
        if (i == 0) {
            return eajc.b;
        }
        return new eajw(this, i);
    }

    public final void G(eaiz eaizVar, long j, long j2) {
        eakb.a(this.b, 0L, j2);
        if (j2 == 0) {
            return;
        }
        eaizVar.b += j2;
        eaju eajuVar = this.a;
        long j3 = 0;
        while (true) {
            long j4 = eajuVar.c - eajuVar.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            eajuVar = eajuVar.f;
        }
        while (j2 > 0) {
            eaju a = eajuVar.a();
            int i = (int) (a.b + j3);
            a.b = i;
            a.c = Math.min(i + ((int) j2), a.c);
            eaju eajuVar2 = eaizVar.a;
            if (eajuVar2 == null) {
                a.g = a;
                a.f = a;
                eaizVar.a = a;
            } else {
                eajuVar2.g.d(a);
            }
            j2 -= a.c - a.b;
            eajuVar = eajuVar.f;
            j3 = 0;
        }
    }

    @Override // defpackage.eajb
    public final long H() {
        throw null;
    }

    @Override // defpackage.eaja
    public final /* bridge */ /* synthetic */ void J(byte[] bArr) {
        throw null;
    }

    @Override // defpackage.eaja
    /* renamed from: K */
    public final void L(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        eakb.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            eaju B = B(1);
            int min = Math.min(i3 - i, 8192 - B.c);
            System.arraycopy(bArr, i, B.a, B.c, min);
            i += min;
            B.c += min;
        }
        this.b += j;
    }

    public final void M(int i) {
        eaju B = B(1);
        byte[] bArr = B.a;
        int i2 = B.c;
        B.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.eaja
    public final /* bridge */ /* synthetic */ void N(int i) {
        throw null;
    }

    public final void O(int i) {
        eaju B = B(4);
        byte[] bArr = B.a;
        int i2 = B.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        B.c = i5 + 1;
        this.b += 4;
    }

    @Override // defpackage.eaja
    public final /* bridge */ /* synthetic */ void P(int i) {
        throw null;
    }

    @Override // defpackage.eaja
    public final /* bridge */ /* synthetic */ void Q(int i) {
        throw null;
    }

    public final void S(int i) {
        if (i < 128) {
            M(i);
        } else if (i < 2048) {
            M((i >> 6) | 192);
            M((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                M((i >> 12) | 224);
                M(((i >> 6) & 63) | 128);
                M((i & 63) | 128);
                return;
            }
            M(63);
        } else if (i > 1114111) {
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unexpected code point: ".concat(valueOf) : new String("Unexpected code point: "));
        } else {
            M((i >> 18) | 240);
            M(((i >> 12) & 63) | 128);
            M(((i >> 6) & 63) | 128);
            M((i & 63) | 128);
        }
    }

    public final void T(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        L(bArr, 0, bArr.length);
    }

    @Override // defpackage.eajy
    public final long Te(eaiz eaizVar, long j) {
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            eaizVar.a(this, j);
            return j;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void U(long j) {
        if (j == 0) {
            M(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        eaju B = B(numberOfTrailingZeros);
        byte[] bArr = B.a;
        int i = B.c;
        int i2 = i + numberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = c[(int) (15 & j)];
                j >>>= 4;
            } else {
                B.c += numberOfTrailingZeros;
                this.b += numberOfTrailingZeros;
                return;
            }
        }
    }

    public final void V(String str) {
        R(str, 0, str.length());
    }

    @Override // defpackage.eaja
    public final /* bridge */ /* synthetic */ void W(String str) {
        throw null;
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return eaka.f;
    }

    @Override // defpackage.eajb
    public final boolean c() {
        return this.b == 0;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        eaiz eaizVar = new eaiz();
        if (this.b != 0) {
            eaju a = this.a.a();
            eaizVar.a = a;
            a.g = a;
            a.f = a;
            eaju eajuVar = this.a;
            while (true) {
                eajuVar = eajuVar.f;
                if (eajuVar == this.a) {
                    break;
                }
                eaizVar.a.g.d(eajuVar.a());
            }
            eaizVar.b = this.b;
        }
        return eaizVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.eajy
    public final void close() {
    }

    @Override // defpackage.eajb
    public final void d(long j) {
        throw null;
    }

    @Override // defpackage.eajb
    public final boolean e(long j) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaiz)) {
            return false;
        }
        eaiz eaizVar = (eaiz) obj;
        long j = this.b;
        if (j != eaizVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        eaju eajuVar = this.a;
        eaju eajuVar2 = eaizVar.a;
        int i = eajuVar.b;
        int i2 = eajuVar2.b;
        while (j2 < this.b) {
            long min = Math.min(eajuVar.c - i, eajuVar2.c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (eajuVar.a[i] != eajuVar2.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == eajuVar.c) {
                eajuVar = eajuVar.f;
                i = eajuVar.b;
            }
            if (i2 == eajuVar2.c) {
                eajuVar2 = eajuVar2.f;
                i2 = eajuVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.eajb
    public final InputStream f() {
        return new eaiy(this);
    }

    @Override // defpackage.eaja, defpackage.eajx, java.io.Flushable
    public final void flush() {
    }

    public final long g() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        eaju eajuVar = this.a.g;
        int i = eajuVar.c;
        return (i >= 8192 || !eajuVar.e) ? j : j - (i - eajuVar.b);
    }

    @Override // defpackage.eajb
    public final byte h() {
        long j = this.b;
        if (j != 0) {
            eaju eajuVar = this.a;
            int i = eajuVar.b;
            int i2 = eajuVar.c;
            int i3 = i + 1;
            byte b = eajuVar.a[i];
            this.b = j - 1;
            if (i3 == i2) {
                this.a = eajuVar.b();
                eajv.b(eajuVar);
            } else {
                eajuVar.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public final int hashCode() {
        eaju eajuVar = this.a;
        if (eajuVar != null) {
            int i = 1;
            do {
                int i2 = eajuVar.c;
                for (int i3 = eajuVar.b; i3 < i2; i3++) {
                    i = (i * 31) + eajuVar.a[i3];
                }
                eajuVar = eajuVar.f;
            } while (eajuVar != this.a);
            return i;
        }
        return 0;
    }

    public final byte i(long j) {
        int i;
        eakb.a(this.b, j, 1L);
        long j2 = this.b;
        if (j2 - j <= j) {
            long j3 = j - j2;
            eaju eajuVar = this.a;
            do {
                eajuVar = eajuVar.g;
                int i2 = eajuVar.c;
                i = eajuVar.b;
                j3 += i2 - i;
            } while (j3 < 0);
            return eajuVar.a[i + ((int) j3)];
        }
        eaju eajuVar2 = this.a;
        while (true) {
            int i3 = eajuVar2.c;
            int i4 = eajuVar2.b;
            long j4 = i3 - i4;
            if (j >= j4) {
                j -= j4;
                eajuVar2 = eajuVar2.f;
            } else {
                return eajuVar2.a[i4 + ((int) j)];
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.eajb
    public final short j() {
        long j = this.b;
        if (j >= 2) {
            eaju eajuVar = this.a;
            int i = eajuVar.b;
            int i2 = eajuVar.c;
            if (i2 - i < 2) {
                return (short) (((h() & 255) << 8) | (h() & 255));
            }
            byte[] bArr = eajuVar.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.b = j - 2;
            if (i4 == i2) {
                this.a = eajuVar.b();
                eajv.b(eajuVar);
            } else {
                eajuVar.b = i4;
            }
            return (short) i5;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("size < 2: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.eajb
    public final int k() {
        long j = this.b;
        if (j >= 4) {
            eaju eajuVar = this.a;
            int i = eajuVar.b;
            int i2 = eajuVar.c;
            if (i2 - i < 4) {
                return ((h() & 255) << 24) | ((h() & 255) << 16) | ((h() & 255) << 8) | (h() & 255);
            }
            byte[] bArr = eajuVar.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            this.b = j - 4;
            if (i6 == i2) {
                this.a = eajuVar.b();
                eajv.b(eajuVar);
            } else {
                eajuVar.b = i6;
            }
            return i7;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("size < 4: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    public final short l() {
        return eakb.b(j());
    }

    @Override // defpackage.eajb
    public final int m() {
        throw null;
    }

    public final eajc n() {
        return new eajc(v());
    }

    @Override // defpackage.eajb
    public final eajc o(long j) {
        throw null;
    }

    public final String p() {
        try {
            return r(this.b, eakb.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String q(long j) {
        return r(j, eakb.a);
    }

    public final String r(long j, Charset charset) {
        eakb.a(this.b, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                StringBuilder sb = new StringBuilder(51);
                sb.append("byteCount > Integer.MAX_VALUE: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j == 0) {
                return "";
            } else {
                eaju eajuVar = this.a;
                int i = eajuVar.b;
                if (i + j > eajuVar.c) {
                    return new String(w(j), charset);
                }
                String str = new String(eajuVar.a, i, (int) j, charset);
                int i2 = (int) (eajuVar.b + j);
                eajuVar.b = i2;
                this.b -= j;
                if (i2 == eajuVar.c) {
                    this.a = eajuVar.b();
                    eajv.b(eajuVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        eaju eajuVar = this.a;
        if (eajuVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), eajuVar.c - eajuVar.b);
        byteBuffer.put(eajuVar.a, eajuVar.b, min);
        int i = eajuVar.b + min;
        eajuVar.b = i;
        this.b -= min;
        if (i == eajuVar.c) {
            this.a = eajuVar.b();
            eajv.b(eajuVar);
        }
        return min;
    }

    @Override // defpackage.eajb
    public final String s() {
        throw null;
    }

    @Override // defpackage.eajb
    public final String t(long j) {
        throw null;
    }

    public final String toString() {
        return E().toString();
    }

    public final String u(long j) {
        if (j > 0) {
            long j2 = (-1) + j;
            if (i(j2) == 13) {
                String q = q(j2);
                A(2L);
                return q;
            }
        }
        String q2 = q(j);
        A(1L);
        return q2;
    }

    public final byte[] v() {
        try {
            return w(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.eajb
    public final byte[] w(long j) {
        eakb.a(this.b, 0L, j);
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        byte[] bArr = new byte[(int) j];
        x(bArr);
        return bArr;
    }

    @Override // defpackage.eajb
    public final void x(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i < length) {
                int y = y(bArr, i, length - i);
                if (y == -1) {
                    throw new EOFException();
                }
                i += y;
            } else {
                return;
            }
        }
    }

    public final int y(byte[] bArr, int i, int i2) {
        eakb.a(bArr.length, i, i2);
        eaju eajuVar = this.a;
        if (eajuVar == null) {
            return -1;
        }
        int min = Math.min(i2, eajuVar.c - eajuVar.b);
        System.arraycopy(eajuVar.a, eajuVar.b, bArr, i, min);
        int i3 = eajuVar.b + min;
        eajuVar.b = i3;
        this.b -= min;
        if (i3 == eajuVar.c) {
            this.a = eajuVar.b();
            eajv.b(eajuVar);
        }
        return min;
    }

    public final eajc E() {
        long j = this.b;
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("size > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        return F((int) j);
    }

    public final void I(eajc eajcVar) {
        if (eajcVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        eajcVar.j(this);
    }

    @Override // defpackage.eajx
    public final void a(eaiz eaizVar, long j) {
        eaju a;
        if (eaizVar != null) {
            if (eaizVar == this) {
                throw new IllegalArgumentException("source == this");
            }
            eakb.a(eaizVar.b, 0L, j);
            while (j > 0) {
                eaju eajuVar = eaizVar.a;
                int i = eajuVar.c - eajuVar.b;
                int i2 = 0;
                if (j < i) {
                    eaju eajuVar2 = this.a;
                    eaju eajuVar3 = eajuVar2 != null ? eajuVar2.g : null;
                    if (eajuVar3 != null && eajuVar3.e) {
                        if ((eajuVar3.c + j) - (eajuVar3.d ? 0 : eajuVar3.b) <= 8192) {
                            eajuVar.c(eajuVar3, (int) j);
                            eaizVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= i) {
                        if (i3 >= 1024) {
                            a = eajuVar.a();
                        } else {
                            a = eajv.a();
                            System.arraycopy(eajuVar.a, eajuVar.b, a.a, 0, i3);
                        }
                        a.c = a.b + i3;
                        eajuVar.b += i3;
                        eajuVar.g.d(a);
                        eaizVar.a = a;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                eaju eajuVar4 = eaizVar.a;
                long j2 = eajuVar4.c - eajuVar4.b;
                eaizVar.a = eajuVar4.b();
                eaju eajuVar5 = this.a;
                if (eajuVar5 == null) {
                    this.a = eajuVar4;
                    eajuVar4.g = eajuVar4;
                    eajuVar4.f = eajuVar4;
                } else {
                    eajuVar5.g.d(eajuVar4);
                    eaju eajuVar6 = eajuVar4.g;
                    if (eajuVar6 != eajuVar4) {
                        if (eajuVar6.e) {
                            int i4 = eajuVar4.c - eajuVar4.b;
                            int i5 = 8192 - eajuVar6.c;
                            if (!eajuVar6.d) {
                                i2 = eajuVar6.b;
                            }
                            if (i4 <= i5 + i2) {
                                eajuVar4.c(eajuVar6, i4);
                                eajuVar4.b();
                                eajv.b(eajuVar4);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                eaizVar.b -= j2;
                this.b += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            eaju B = B(1);
            int min = Math.min(i, 8192 - B.c);
            byteBuffer.get(B.a, B.c, min);
            i -= min;
            B.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    public final void z() {
        try {
            A(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void R(String str, int i, int i2) {
        char charAt;
        if (str != null) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(27);
                sb.append("beginIndex < 0: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (i2 >= i) {
                if (i2 > str.length()) {
                    int length = str.length();
                    StringBuilder sb2 = new StringBuilder(51);
                    sb2.append("endIndex > string.length: ");
                    sb2.append(i2);
                    sb2.append(" > ");
                    sb2.append(length);
                    throw new IllegalArgumentException(sb2.toString());
                }
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        eaju B = B(1);
                        byte[] bArr = B.a;
                        int i3 = B.c - i;
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
                        int i5 = B.c;
                        int i6 = (i3 + i) - i5;
                        B.c = i5 + i6;
                        this.b += i6;
                    } else {
                        if (charAt2 < 2048) {
                            M((charAt2 >> 6) | 192);
                            M((charAt2 & '?') | 128);
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            M((charAt2 >> '\f') | 224);
                            M(((charAt2 >> 6) & 63) | 128);
                            M((charAt2 & '?') | 128);
                        } else {
                            int i7 = i + 1;
                            char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                            if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                M(63);
                                i = i7;
                            } else {
                                int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                                M((i8 >> 18) | 240);
                                M(((i8 >> 12) & 63) | 128);
                                M(((i8 >> 6) & 63) | 128);
                                M((i8 & 63) | 128);
                                i += 2;
                            }
                        }
                        i++;
                    }
                }
                return;
            } else {
                StringBuilder sb3 = new StringBuilder(48);
                sb3.append("endIndex < beginIndex: ");
                sb3.append(i2);
                sb3.append(" < ");
                sb3.append(i);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override // defpackage.eajb
    public final void A(long j) {
        eaju eajuVar;
        while (j > 0) {
            if (this.a != null) {
                int min = (int) Math.min(j, eajuVar.c - eajuVar.b);
                long j2 = min;
                this.b -= j2;
                j -= j2;
                eaju eajuVar2 = this.a;
                int i = eajuVar2.b + min;
                eajuVar2.b = i;
                if (i == eajuVar2.c) {
                    this.a = eajuVar2.b();
                    eajv.b(eajuVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }
}

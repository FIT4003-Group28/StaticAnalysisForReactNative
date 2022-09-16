package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: axpw  reason: default package */
/* loaded from: classes2.dex */
public class axpw {
    public static final Charset c = Charset.forName("UTF-8");
    private transient String a;
    public axpv d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public transient int h;

    public axpw(axpv axpvVar, List list) {
        Iterator it;
        this.d = axpvVar;
        this.e = true;
        long j = 0;
        while (list.iterator().hasNext()) {
            j += ((axpw) it.next()).g.length;
        }
        if (j < 0 || j > 2147483647L) {
            throw new axpt(1009, "Max frame length has been exceeded.");
        }
        int i = (int) j;
        this.h = i;
        byte[] bArr = new byte[i];
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            axpw axpwVar = (axpw) it2.next();
            byte[] bArr2 = axpwVar.g;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += axpwVar.g.length;
        }
        d(bArr);
    }

    private axpw(axpv axpvVar, boolean z) {
        this.d = axpvVar;
        this.e = z;
    }

    public static axpw a(InputStream inputStream) {
        axpv axpvVar;
        int read = inputStream.read();
        h(read);
        byte b = (byte) read;
        boolean z = (b & 128) != 0;
        int i = b & 15;
        axpv[] values = axpv.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                axpvVar = null;
                break;
            }
            axpvVar = values[i2];
            if (axpvVar.g == i) {
                break;
            }
            i2++;
        }
        int i3 = b & 112;
        if (i3 != 0) {
            String valueOf = String.valueOf(Integer.toBinaryString(i3));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("The reserved bits (");
            sb.append(valueOf);
            sb.append(") must be 0.");
            throw new axpt(1002, sb.toString());
        } else if (axpvVar != null) {
            if (!axpvVar.a() || z) {
                axpw axpwVar = new axpw(axpvVar, z);
                int read2 = inputStream.read();
                h(read2);
                byte b2 = (byte) read2;
                int i4 = b2 & 128;
                int i5 = b2 & Byte.MAX_VALUE;
                axpwVar.h = i5;
                if (i5 == 126) {
                    int read3 = inputStream.read();
                    h(read3);
                    int read4 = inputStream.read();
                    h(read4);
                    char c2 = (char) ((read3 << 8) | read4);
                    axpwVar.h = c2;
                    if (c2 < '~') {
                        throw new axpt(1002, "Invalid data frame 2byte length. (not using minimal length encoding)");
                    }
                } else if (i5 == 127) {
                    int read5 = inputStream.read();
                    h(read5);
                    int read6 = inputStream.read();
                    h(read6);
                    int read7 = inputStream.read();
                    h(read7);
                    int read8 = inputStream.read();
                    h(read8);
                    int read9 = inputStream.read();
                    h(read9);
                    int read10 = inputStream.read();
                    h(read10);
                    int read11 = inputStream.read();
                    h(read11);
                    int read12 = inputStream.read();
                    h(read12);
                    long j = (read5 << 56) | (read6 << 48) | (read7 << 40) | (read8 << 32) | (read9 << 24) | (read10 << 16) | (read11 << 8) | read12;
                    if (j < 65536) {
                        throw new axpt(1002, "Invalid data frame 4byte length. (not using minimal length encoding)");
                    }
                    if (j < 0 || j > 2147483647L) {
                        throw new axpt(1009, "Max frame length has been exceeded.");
                    }
                    axpwVar.h = (int) j;
                }
                if (axpwVar.d.a()) {
                    if (axpwVar.h <= 125) {
                        if (axpwVar.d == axpv.Close && axpwVar.h == 1) {
                            throw new axpt(1002, "Received close frame with payload len 1.");
                        }
                    } else {
                        throw new axpt(1002, "Control frame with payload length > 125 bytes.");
                    }
                }
                if (i4 != 0) {
                    axpwVar.f = new byte[4];
                    int i6 = 0;
                    while (true) {
                        byte[] bArr = axpwVar.f;
                        int length2 = bArr.length;
                        if (i6 >= 4) {
                            break;
                        }
                        int read13 = inputStream.read(bArr, i6, 4 - i6);
                        h(read13);
                        i6 += read13;
                    }
                }
                axpwVar.g = new byte[axpwVar.h];
                int i7 = 0;
                while (true) {
                    int i8 = axpwVar.h;
                    if (i7 >= i8) {
                        break;
                    }
                    int read14 = inputStream.read(axpwVar.g, i7, i8 - i7);
                    h(read14);
                    i7 += read14;
                }
                if (axpwVar.f()) {
                    int i9 = 0;
                    while (true) {
                        byte[] bArr2 = axpwVar.g;
                        if (i9 >= bArr2.length) {
                            break;
                        }
                        bArr2[i9] = (byte) (bArr2[i9] ^ axpwVar.f[i9 % 4]);
                        i9++;
                    }
                }
                if (axpwVar.d == axpv.Text) {
                    axpwVar.a = b(axpwVar.g);
                }
                return axpwVar.d == axpv.Close ? new axpu(axpwVar) : axpwVar;
            }
            throw new axpt(1002, "Fragmented control frame.");
        } else {
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Received frame with reserved/unknown opcode ");
            sb2.append(i);
            sb2.append(".");
            throw new axpt(1002, sb2.toString());
        }
    }

    public static String b(byte[] bArr) {
        return new String(bArr, c);
    }

    public static byte[] g(String str) {
        return str.getBytes(c);
    }

    private static void h(int i) {
        if (i >= 0) {
            return;
        }
        throw new EOFException();
    }

    public final String c() {
        if (this.a == null) {
            try {
                this.a = b(this.g);
            } catch (CharacterCodingException e) {
                throw new RuntimeException("Undetected CharacterCodingException", e);
            }
        }
        return this.a;
    }

    public final void d(byte[] bArr) {
        this.g = bArr;
        this.h = bArr.length;
        this.a = null;
    }

    public final void e(byte[] bArr) {
        this.f = bArr;
    }

    public final boolean f() {
        return this.f != null;
    }

    public final String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("WS[");
        sb2.append(this.d);
        sb2.append(", ");
        sb2.append(true != this.e ? "inter" : "fin");
        sb2.append(", ");
        sb2.append(true != f() ? "unmasked" : "masked");
        sb2.append(", ");
        if (this.g == null) {
            sb = "null";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            sb3.append(this.g.length);
            sb3.append("b] ");
            if (this.d == axpv.Text) {
                String c2 = c();
                if (c2.length() > 100) {
                    sb3.append(c2.substring(0, 100));
                    sb3.append("...");
                } else {
                    sb3.append(c2);
                }
            } else {
                sb3.append("0x");
                for (int i = 0; i < Math.min(this.g.length, 50); i++) {
                    sb3.append(Integer.toHexString(this.g[i] & 255));
                }
                if (this.g.length > 50) {
                    sb3.append("...");
                }
            }
            sb = sb3.toString();
        }
        sb2.append(sb);
        sb2.append(']');
        return sb2.toString();
    }

    public axpw(axpv axpvVar, String str) {
        this(axpvVar, true);
        e(null);
        this.g = g(str);
        this.h = str.length();
        this.a = str;
    }

    public axpw(axpv axpvVar, byte[] bArr) {
        this(axpvVar, true);
        e(null);
        d(bArr);
    }

    public axpw(axpw axpwVar) {
        this.d = axpwVar.d;
        this.e = axpwVar.e;
        d(axpwVar.g);
        e(axpwVar.f);
    }
}

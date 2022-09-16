package h;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* loaded from: classes.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: e  reason: collision with root package name */
    static final char[] f10144e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f  reason: collision with root package name */
    public static final f f10145f = a(new byte[0]);

    /* renamed from: b  reason: collision with root package name */
    final byte[] f10146b;

    /* renamed from: c  reason: collision with root package name */
    transient int f10147c;

    /* renamed from: d  reason: collision with root package name */
    transient String f10148d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(byte[] bArr) {
        this.f10146b = bArr;
    }

    private static int a(char c2) {
        if (c2 < '0' || c2 > '9') {
            char c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                c3 = 'A';
                if (c2 < 'A' || c2 > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c2);
                }
            }
            return (c2 - c3) + 10;
        }
        return c2 - '0';
    }

    static int a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static f a(String str) {
        if (str != null) {
            byte[] a2 = b.a(str);
            if (a2 == null) {
                return null;
            }
            return new f(a2);
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static f a(String str, Charset charset) {
        if (str != null) {
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            return new f(str.getBytes(charset));
        }
        throw new IllegalArgumentException("s == null");
    }

    public static f a(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f b(String str) {
        if (str != null) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: " + str);
            }
            byte[] bArr = new byte[str.length() / 2];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
            }
            return a(bArr);
        }
        throw new IllegalArgumentException("hex == null");
    }

    private f c(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f10146b));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static f d(String str) {
        if (str != null) {
            f fVar = new f(str.getBytes(x.f10201a));
            fVar.f10148d = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public byte a(int i) {
        return this.f10146b[i];
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(f fVar) {
        int g2 = g();
        int g3 = fVar.g();
        int min = Math.min(g2, g3);
        for (int i = 0; i < min; i++) {
            int a2 = a(i) & 255;
            int a3 = fVar.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (g2 == g3) {
            return 0;
        }
        return g2 < g3 ? -1 : 1;
    }

    public f a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f10146b;
            if (i2 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f10146b.length + ")");
            }
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            if (i == 0 && i2 == bArr.length) {
                return this;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(this.f10146b, i, bArr2, 0, i3);
            return new f(bArr2);
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String a() {
        return b.a(this.f10146b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        byte[] bArr = this.f10146b;
        cVar.mo338write(bArr, 0, bArr.length);
    }

    public boolean a(int i, f fVar, int i2, int i3) {
        return fVar.a(i2, this.f10146b, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f10146b;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && x.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public String b() {
        byte[] bArr = this.f10146b;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f10144e;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public final boolean b(f fVar) {
        return a(0, fVar, 0, fVar.g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] c() {
        return this.f10146b;
    }

    public f d() {
        return c("MD5");
    }

    public f e() {
        return c("SHA-1");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int g2 = fVar.g();
            byte[] bArr = this.f10146b;
            if (g2 == bArr.length && fVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public f f() {
        return c("SHA-256");
    }

    public int g() {
        return this.f10146b.length;
    }

    public f h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f10146b;
            if (i < bArr.length) {
                byte b2 = bArr[i];
                if (b2 >= 65 && b2 <= 90) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i] = (byte) (b2 + 32);
                    for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                        byte b3 = bArr2[i2];
                        if (b3 >= 65 && b3 <= 90) {
                            bArr2[i2] = (byte) (b3 + 32);
                        }
                    }
                    return new f(bArr2);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public int hashCode() {
        int i = this.f10147c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f10146b);
        this.f10147c = hashCode;
        return hashCode;
    }

    public byte[] i() {
        return (byte[]) this.f10146b.clone();
    }

    public String m() {
        String str = this.f10148d;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f10146b, x.f10201a);
        this.f10148d = str2;
        return str2;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f10146b.length == 0) {
            return "[size=0]";
        }
        String m = m();
        int a2 = a(m, 64);
        if (a2 == -1) {
            if (this.f10146b.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(b());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f10146b.length);
                sb2.append(" hex=");
                sb2.append(a(0, 64).b());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = m.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a2 < m.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f10146b.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }
}

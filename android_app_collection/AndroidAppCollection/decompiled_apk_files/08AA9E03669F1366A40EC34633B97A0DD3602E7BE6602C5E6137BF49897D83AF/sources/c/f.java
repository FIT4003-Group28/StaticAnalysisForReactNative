package c;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f1285a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static final f f1286b = a(new byte[0]);

    /* renamed from: c  reason: collision with root package name */
    final byte[] f1287c;

    /* renamed from: d  reason: collision with root package name */
    transient int f1288d;
    transient String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(byte[] bArr) {
        this.f1287c = bArr;
    }

    public static f a(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new f((byte[]) bArr.clone());
    }

    public static f a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(v.f1325a));
        fVar.e = str;
        return fVar;
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f1287c, v.f1325a);
        this.e = str2;
        return str2;
    }

    public String b() {
        return b.a(this.f1287c);
    }

    public f c() {
        return d("MD5");
    }

    public f d() {
        return d(McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    public f e() {
        return d(McElieceCCA2KeyGenParameterSpec.SHA256);
    }

    private f d(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f1287c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static f b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] a2 = b.a(str);
        if (a2 == null) {
            return null;
        }
        return new f(a2);
    }

    public String f() {
        byte[] bArr;
        char[] cArr = new char[this.f1287c.length * 2];
        int i = 0;
        for (byte b2 : this.f1287c) {
            int i2 = i + 1;
            cArr[i] = f1285a[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = f1285a[b2 & 15];
        }
        return new String(cArr);
    }

    public static f c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
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

    private static int a(char c2) {
        if (c2 < '0' || c2 > '9') {
            if (c2 >= 'a' && c2 <= 'f') {
                return (c2 - 'a') + 10;
            }
            if (c2 >= 'A' && c2 <= 'F') {
                return (c2 - 'A') + 10;
            }
            throw new IllegalArgumentException("Unexpected hex digit: " + c2);
        }
        return c2 - '0';
    }

    public f g() {
        for (int i = 0; i < this.f1287c.length; i++) {
            byte b2 = this.f1287c[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr = (byte[]) this.f1287c.clone();
                bArr[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr.length; i2++) {
                    byte b3 = bArr[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr[i2] = (byte) (b3 + 32);
                    }
                }
                return new f(bArr);
            }
        }
        return this;
    }

    public f a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (i2 > this.f1287c.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f1287c.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == this.f1287c.length) {
            return this;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f1287c, i, bArr, 0, i3);
        return new f(bArr);
    }

    public byte a(int i) {
        return this.f1287c[i];
    }

    public int h() {
        return this.f1287c.length;
    }

    public byte[] i() {
        return (byte[]) this.f1287c.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        cVar.c(this.f1287c, 0, this.f1287c.length);
    }

    public boolean a(int i, f fVar, int i2, int i3) {
        return fVar.a(i2, this.f1287c, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.f1287c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && v.a(this.f1287c, i, bArr, i2, i3);
    }

    public final boolean a(f fVar) {
        return a(0, fVar, 0, fVar.h());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.h() == this.f1287c.length && fVar.a(0, this.f1287c, 0, this.f1287c.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f1288d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f1287c);
        this.f1288d = hashCode;
        return hashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(f fVar) {
        int h = h();
        int h2 = fVar.h();
        int min = Math.min(h, h2);
        for (int i = 0; i < min; i++) {
            int a2 = a(i) & 255;
            int a3 = fVar.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (h == h2) {
            return 0;
        }
        return h < h2 ? -1 : 1;
    }

    public String toString() {
        if (this.f1287c.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int a3 = a(a2, 64);
        if (a3 == -1) {
            if (this.f1287c.length <= 64) {
                return "[hex=" + f() + "]";
            }
            return "[size=" + this.f1287c.length + " hex=" + a(0, 64).f() + "…]";
        }
        String replace = a2.substring(0, a3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a3 < a2.length()) {
            return "[size=" + this.f1287c.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + "]";
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
}

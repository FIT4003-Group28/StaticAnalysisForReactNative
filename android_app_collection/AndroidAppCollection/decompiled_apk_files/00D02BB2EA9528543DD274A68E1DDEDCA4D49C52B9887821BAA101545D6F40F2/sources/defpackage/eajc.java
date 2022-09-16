package defpackage;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: eajc  reason: default package */
/* loaded from: classes6.dex */
public class eajc implements Serializable, Comparable<eajc> {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final eajc b = a(new byte[0]);
    private static final long serialVersionUID = 1;
    final byte[] c;
    transient int d;
    transient String e;

    public eajc(byte[] bArr) {
        this.c = bArr;
    }

    public static eajc a(byte... bArr) {
        if (bArr != null) {
            return new eajc((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static eajc b(String str) {
        if (str != null) {
            eajc eajcVar = new eajc(str.getBytes(eakb.a));
            eajcVar.e = str;
            return eajcVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    private static int q(char c) {
        if (c < '0' || c > '9') {
            if (c >= 'a' && c <= 'f') {
                return c - 'W';
            }
            if (c >= 'A' && c <= 'F') {
                return c - '7';
            }
            StringBuilder sb = new StringBuilder(23);
            sb.append("Unexpected hex digit: ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }
        return c - '0';
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (objectInputStream != null) {
            if (readInt >= 0) {
                byte[] bArr = new byte[readInt];
                int i = 0;
                while (i < readInt) {
                    int read = objectInputStream.read(bArr, i, readInt - i);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    i += read;
                }
                eajc eajcVar = new eajc(bArr);
                try {
                    Field declaredField = eajc.class.getDeclaredField("c");
                    declaredField.setAccessible(true);
                    declaredField.set(this, eajcVar.c);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (NoSuchFieldException unused2) {
                    throw new AssertionError();
                }
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("byteCount < 0: ");
            sb.append(readInt);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("in == null");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }

    public String c() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, eakb.a);
        this.e = str2;
        return str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(eajc eajcVar) {
        eajc eajcVar2 = eajcVar;
        int h = h();
        int h2 = eajcVar2.h();
        int min = Math.min(h, h2);
        int i = 0;
        while (true) {
            if (i < min) {
                int g = g(i) & 255;
                int g2 = eajcVar2.g(i) & 255;
                if (g == g2) {
                    i++;
                } else if (g < g2) {
                    return -1;
                }
            } else if (h == h2) {
                return 0;
            } else {
                if (h < h2) {
                    return -1;
                }
            }
        }
        return 1;
    }

    public final String d() {
        byte[] bArr = this.c;
        byte[] bArr2 = eaix.a;
        int length = bArr.length;
        byte[] bArr3 = new byte[((length + 2) / 3) * 4];
        int i = length - (length % 3);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 3) {
            int i4 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i3] & 255) >> 2];
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr3[i4] = bArr2[((bArr[i3] & 3) << 4) | ((bArr[i6] & 255) >> 4)];
            int i7 = i5 + 1;
            int i8 = i3 + 2;
            bArr3[i5] = bArr2[((bArr[i6] & 15) << 2) | ((bArr[i8] & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[bArr[i8] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i] & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(bArr[i] & 3) << 4];
            bArr3[i10] = 61;
            bArr3[i10 + 1] = 61;
        } else if (length2 == 2) {
            int i11 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i] & 255) >> 2];
            int i12 = i11 + 1;
            int i13 = i + 1;
            bArr3[i11] = bArr2[((bArr[i] & 3) << 4) | ((bArr[i13] & 255) >> 4)];
            bArr3[i12] = bArr2[(bArr[i13] & 15) << 2];
            bArr3[i12 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public String e() {
        byte[] bArr = this.c;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eajc) {
            eajc eajcVar = (eajc) obj;
            int h = eajcVar.h();
            byte[] bArr = this.c;
            int length = bArr.length;
            if (h == length && eajcVar.k(0, bArr, 0, length)) {
                return true;
            }
        }
        return false;
    }

    public eajc f() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
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
                    return new eajc(bArr2);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public byte g(int i) {
        return this.c[i];
    }

    public int h() {
        return this.c.length;
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    public byte[] i() {
        return (byte[]) this.c.clone();
    }

    public void j(eaiz eaizVar) {
        byte[] bArr = this.c;
        eaizVar.L(bArr, 0, bArr.length);
    }

    public boolean k(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.c;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && eakb.d(bArr2, i, bArr, i2, i3);
        }
        return false;
    }

    public final boolean l(eajc eajcVar) {
        return n(eajcVar, eajcVar.h());
    }

    public boolean n(eajc eajcVar, int i) {
        return eajcVar.k(0, this.c, 0, i);
    }

    public eajc o() {
        byte[] bArr = this.c;
        int length = bArr.length;
        if (length >= 64) {
            if (length == 64) {
                return this;
            }
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new eajc(bArr2);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("endIndex > length(");
        sb.append(length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public final eajc p() {
        try {
            return a(MessageDigest.getInstance("SHA-256").digest(this.c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String c = c();
        int length = c.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = c.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = c.codePointAt(i);
                if (Character.isISOControl(codePointAt) && codePointAt != 10) {
                    if (codePointAt != 13) {
                        break;
                    }
                    codePointAt = 13;
                }
                if (codePointAt == 65533) {
                    break;
                }
                i2++;
                i += Character.charCount(codePointAt);
            }
        }
        i = -1;
        if (i != -1) {
            String replace = c.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < c.length()) {
                int length2 = this.c.length;
                StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 25);
                sb.append("[size=");
                sb.append(length2);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 7);
            sb2.append("[text=");
            sb2.append(replace);
            sb2.append("]");
            return sb2.toString();
        }
        int length3 = this.c.length;
        if (length3 <= 64) {
            String e = e();
            StringBuilder sb3 = new StringBuilder(String.valueOf(e).length() + 6);
            sb3.append("[hex=");
            sb3.append(e);
            sb3.append("]");
            return sb3.toString();
        }
        String e2 = o().e();
        StringBuilder sb4 = new StringBuilder(String.valueOf(e2).length() + 24);
        sb4.append("[size=");
        sb4.append(length3);
        sb4.append(" hex=");
        sb4.append(e2);
        sb4.append("…]");
        return sb4.toString();
    }

    public static void m(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(str.length() != 0 ? "Unexpected hex string: ".concat(str) : new String("Unexpected hex string: "));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((q(str.charAt(i2)) << 4) + q(str.charAt(i2 + 1)));
        }
        a(bArr);
    }
}

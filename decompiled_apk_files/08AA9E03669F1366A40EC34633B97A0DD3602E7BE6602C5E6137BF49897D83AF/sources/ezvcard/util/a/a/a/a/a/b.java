package ezvcard.util.a.a.a.a.a;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: BaseNCodec.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f5602a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    protected final byte f5603b;

    /* renamed from: c  reason: collision with root package name */
    protected final byte f5604c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f5605d;
    private final int e;
    private final int f;

    protected int a() {
        return PKIFailureInfo.certRevoked;
    }

    abstract void a(byte[] bArr, int i, int i2, a aVar);

    protected abstract boolean a(byte b2);

    abstract void b(byte[] bArr, int i, int i2, a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseNCodec.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f5606a;

        /* renamed from: b  reason: collision with root package name */
        long f5607b;

        /* renamed from: c  reason: collision with root package name */
        byte[] f5608c;

        /* renamed from: d  reason: collision with root package name */
        int f5609d;
        int e;
        boolean f;
        int g;
        int h;

        a() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.f5608c), Integer.valueOf(this.g), Boolean.valueOf(this.f), Integer.valueOf(this.f5606a), Long.valueOf(this.f5607b), Integer.valueOf(this.h), Integer.valueOf(this.f5609d), Integer.valueOf(this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    protected b(int i, int i2, int i3, int i4, byte b2) {
        this.f5603b = (byte) 61;
        this.f5602a = i;
        this.e = i2;
        this.f5605d = i3 > 0 && i4 > 0 ? (i3 / i2) * i2 : 0;
        this.f = i4;
        this.f5604c = b2;
    }

    int a(a aVar) {
        if (aVar.f5608c != null) {
            return aVar.f5609d - aVar.e;
        }
        return 0;
    }

    private byte[] b(a aVar) {
        if (aVar.f5608c == null) {
            aVar.f5608c = new byte[a()];
            aVar.f5609d = 0;
            aVar.e = 0;
        } else {
            byte[] bArr = new byte[aVar.f5608c.length * 2];
            System.arraycopy(aVar.f5608c, 0, bArr, 0, aVar.f5608c.length);
            aVar.f5608c = bArr;
        }
        return aVar.f5608c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] a(int i, a aVar) {
        if (aVar.f5608c == null || aVar.f5608c.length < aVar.f5609d + i) {
            return b(aVar);
        }
        return aVar.f5608c;
    }

    int c(byte[] bArr, int i, int i2, a aVar) {
        if (aVar.f5608c == null) {
            return aVar.f ? -1 : 0;
        }
        int min = Math.min(a(aVar), i2);
        System.arraycopy(aVar.f5608c, aVar.e, bArr, i, min);
        aVar.e += min;
        if (aVar.e >= aVar.f5609d) {
            aVar.f5608c = null;
        }
        return min;
    }

    public byte[] b(String str) {
        return b(c(str));
    }

    public byte[] b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        b(bArr, 0, bArr.length, aVar);
        b(bArr, 0, -1, aVar);
        byte[] bArr2 = new byte[aVar.f5609d];
        c(bArr2, 0, bArr2.length, aVar);
        return bArr2;
    }

    public byte[] c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a();
        a(bArr, 0, bArr.length, aVar);
        a(bArr, 0, -1, aVar);
        byte[] bArr2 = new byte[aVar.f5609d - aVar.e];
        c(bArr2, 0, bArr2.length, aVar);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b2 : bArr) {
            if (this.f5604c == b2 || a(b2)) {
                return true;
            }
        }
        return false;
    }

    public long e(byte[] bArr) {
        long length = (((bArr.length + this.f5602a) - 1) / this.f5602a) * this.e;
        return this.f5605d > 0 ? length + ((((this.f5605d + length) - 1) / this.f5605d) * this.f) : length;
    }

    protected static byte[] c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String f(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}

package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: dspd  reason: default package */
/* loaded from: classes.dex */
public abstract class dspd implements Iterable<Byte>, Serializable {
    private static final dsow a;
    public static final dspd b = new dspa(dsrk.b);
    public int c = 0;

    static {
        a = dsoi.a() ? new dspc() : new dsou();
    }

    public static dspd A(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        O(0, remaining, byteBuffer.remaining());
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        return new dspa(bArr);
    }

    public static dspd B(String str) {
        return new dspa(str.getBytes(dsrk.a));
    }

    public static dspd C(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            dspd w = i2 == 0 ? null : w(bArr, 0, i2);
            if (w != null) {
                arrayList.add(w);
                i = Math.min(i + i, 8192);
            } else {
                return E(arrayList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dspd E(Iterable<dspd> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return b;
        }
        return d(iterable.iterator(), size);
    }

    public static dspb K(int i) {
        return new dspb(i);
    }

    public static dspb L() {
        return new dspb(128);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsoy M(int i) {
        return new dsoy(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void N(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public static dspd P(String str) {
        return new dspa(str.getBytes("ISO-8859-1"));
    }

    public static dspd w(byte[] bArr, int i, int i2) {
        O(i, i + i2, bArr.length);
        return new dspa(a.a(bArr, i, i2));
    }

    public static dspd x(byte[] bArr) {
        return w(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dspd y(byte[] bArr) {
        return new dspa(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dspd z(byte[] bArr, int i, int i2) {
        return new dsov(bArr, i, i2);
    }

    public final dspd D(dspd dspdVar) {
        dstb dstbVar;
        if (Integer.MAX_VALUE - c() < dspdVar.c()) {
            int c = c();
            int c2 = dspdVar.c();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(c);
            sb.append("+");
            sb.append(c2);
            throw new IllegalArgumentException(sb.toString());
        } else if (dspdVar.c() == 0) {
            return this;
        } else {
            if (c() == 0) {
                return dspdVar;
            }
            int c3 = c() + dspdVar.c();
            if (c3 < 128) {
                return dstb.d(this, dspdVar);
            }
            if (this instanceof dstb) {
                dstb dstbVar2 = (dstb) this;
                if (dstbVar2.f.c() + dspdVar.c() < 128) {
                    dstbVar = new dstb(dstbVar2.e, dstb.d(dstbVar2.f, dspdVar));
                    return dstbVar;
                } else if (dstbVar2.e.f() > dstbVar2.f.f() && dstbVar2.g > dspdVar.f()) {
                    return new dstb(dstbVar2.e, new dstb(dstbVar2.f, dspdVar));
                }
            }
            if (c3 < dstb.h(Math.max(f(), dspdVar.f()) + 1)) {
                ArrayDeque arrayDeque = new ArrayDeque();
                dssy.a(this, arrayDeque);
                dssy.a(dspdVar, arrayDeque);
                dspd dspdVar2 = (dspd) arrayDeque.pop();
                while (!arrayDeque.isEmpty()) {
                    dspdVar2 = new dstb((dspd) arrayDeque.pop(), dspdVar2);
                }
                return dspdVar2;
            }
            dstbVar = new dstb(this, dspdVar);
            return dstbVar;
        }
    }

    @Deprecated
    public final void F(byte[] bArr, int i, int i2, int i3) {
        O(i, i + i3, c());
        O(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            e(bArr, i, i2, i3);
        }
    }

    public final byte[] G() {
        int c = c();
        if (c == 0) {
            return dsrk.b;
        }
        byte[] bArr = new byte[c];
        e(bArr, 0, 0, c);
        return bArr;
    }

    public final String H(String str) {
        try {
            return I(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public final String I(Charset charset) {
        return c() == 0 ? "" : n(charset);
    }

    public final String J() {
        return I(dsrk.a);
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int f();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean g();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int c = c();
            i = q(c, 0, c);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    public abstract dspd i(int i, int i2);

    public abstract void j(ByteBuffer byteBuffer);

    public abstract ByteBuffer k();

    public abstract void l(OutputStream outputStream);

    public abstract void m(dsor dsorVar);

    protected abstract String n(Charset charset);

    public abstract boolean o();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int p(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int q(int i, int i2, int i3);

    public abstract InputStream r();

    public abstract dspj s();

    @Override // java.lang.Iterable
    /* renamed from: t */
    public dsox iterator() {
        return new dsos(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(c());
        objArr[2] = c() <= 50 ? dstt.a(this) : String.valueOf(dstt.a(i(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final boolean u() {
        return c() == 0;
    }

    public final dspd v(int i) {
        return i(i, c());
    }

    private static dspd d(Iterator<dspd> it, int i) {
        if (i > 0) {
            if (i == 1) {
                return it.next();
            }
            int i2 = i >>> 1;
            return d(it, i2).D(d(it, i - i2));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }
}

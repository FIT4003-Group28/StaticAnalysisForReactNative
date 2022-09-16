package defpackage;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aoob  reason: default package */
/* loaded from: classes.dex */
public abstract class aoob implements Iterable, Serializable {
    public static final aoob b = new aonz(aopv.b);
    public int c = 0;

    public static aoob A(InputStream inputStream) {
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
            aoob y = i2 == 0 ? null : y(bArr, 0, i2);
            if (y != null) {
                arrayList.add(y);
                i = Math.min(i + i, 8192);
            } else {
                return v(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoob B(byte[] bArr) {
        return new aonz(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoob C(byte[] bArr, int i, int i2) {
        return new aonw(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void F(int i, int i2) {
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

    public static aooa t() {
        return new aooa(128);
    }

    public static aooa u(int i) {
        return new aooa(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static aoob v(Iterable iterable) {
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
        return c(iterable.iterator(), size);
    }

    public static aoob w(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        r(0, remaining, byteBuffer.remaining());
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        return new aonz(bArr);
    }

    public static aoob x(byte[] bArr) {
        return y(bArr, 0, bArr.length);
    }

    public static aoob y(byte[] bArr, int i, int i2) {
        r(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new aonz(bArr2);
    }

    public static aoob z(String str) {
        return new aonz(str.getBytes(aopv.a));
    }

    public final String D(Charset charset) {
        return d() == 0 ? "" : n(charset);
    }

    public final String E() {
        return D(aopv.a);
    }

    @Deprecated
    public final void G(byte[] bArr, int i, int i2, int i3) {
        r(i, i + i3, d());
        r(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            e(bArr, i, i2, i3);
        }
    }

    public final boolean H() {
        return d() == 0;
    }

    public final byte[] I() {
        int d = d();
        if (d == 0) {
            return aopv.b;
        }
        byte[] bArr = new byte[d];
        e(bArr, 0, 0, d);
        return bArr;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int d = d();
            i = i(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int i(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int j(int i, int i2, int i3);

    public abstract aoob k(int i, int i2);

    public abstract aoog l();

    public abstract InputStream m();

    protected abstract String n(Charset charset);

    public abstract ByteBuffer o();

    public abstract void p(aont aontVar);

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* renamed from: s */
    public aonx iterator() {
        return new aonu(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(d());
        objArr[2] = d() <= 50 ? apdw.e(this) : String.valueOf(apdw.e(k(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    private static aoob c(Iterator it, int i) {
        aorl aorlVar;
        if (i > 0) {
            if (i == 1) {
                return (aoob) it.next();
            }
            int i2 = i >>> 1;
            aoob c = c(it, i2);
            aoob c2 = c(it, i - i2);
            if (Integer.MAX_VALUE - c.d() < c2.d()) {
                int d = c.d();
                int d2 = c2.d();
                StringBuilder sb = new StringBuilder(53);
                sb.append("ByteString would be too long: ");
                sb.append(d);
                sb.append("+");
                sb.append(d2);
                throw new IllegalArgumentException(sb.toString());
            }
            int[] iArr = aorl.a;
            if (c2.d() == 0) {
                return c;
            }
            if (c.d() == 0) {
                return c2;
            }
            int d3 = c.d() + c2.d();
            if (d3 < 128) {
                return aorl.g(c, c2);
            }
            if (c instanceof aorl) {
                aorl aorlVar2 = (aorl) c;
                if (aorlVar2.f.d() + c2.d() < 128) {
                    aorlVar = new aorl(aorlVar2.e, aorl.g(aorlVar2.f, c2));
                    return aorlVar;
                } else if (aorlVar2.e.f() > aorlVar2.f.f() && aorlVar2.g > c2.f()) {
                    return new aorl(aorlVar2.e, new aorl(aorlVar2.f, c2));
                }
            }
            if (d3 < aorl.c(Math.max(c.f(), c2.f()) + 1)) {
                ArrayDeque arrayDeque = new ArrayDeque();
                apdw.f(c, arrayDeque);
                apdw.f(c2, arrayDeque);
                aoob aoobVar = (aoob) arrayDeque.pop();
                while (!arrayDeque.isEmpty()) {
                    aoobVar = new aorl((aoob) arrayDeque.pop(), aoobVar);
                }
                return aoobVar;
            }
            aorlVar = new aorl(c, c2);
            return aorlVar;
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i, int i2, int i3) {
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

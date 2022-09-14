package c.e.a.b.d.g;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class v3 implements Serializable, Iterable<Byte> {

    /* renamed from: c  reason: collision with root package name */
    public static final v3 f4474c = new f4(e5.f4124b);

    /* renamed from: d  reason: collision with root package name */
    private static final b4 f4475d;

    /* renamed from: b  reason: collision with root package name */
    private int f4476b = 0;

    static {
        f4475d = o3.a() ? new e4(null) : new z3(null);
        new x3();
    }

    public static v3 a(String str) {
        return new f4(str.getBytes(e5.f4123a));
    }

    public static v3 a(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new f4(f4475d.a(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte b2) {
        return b2 & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, int i2, int i3) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d4 c(int i) {
        return new d4(i, null);
    }

    public abstract byte a(int i);

    protected abstract int a(int i, int i2, int i3);

    public abstract v3 a(int i, int i2);

    protected abstract String a(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(s3 s3Var);

    public abstract boolean a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte b(int i);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public final int hashCode() {
        int i = this.f4476b;
        if (i == 0) {
            int f2 = f();
            i = a(f2, 0, f2);
            if (i == 0) {
                i = 1;
            }
            this.f4476b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new u3(this);
    }

    public final String j() {
        return f() == 0 ? "" : a(e5.f4123a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int k() {
        return this.f4476b;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(f());
        objArr[2] = f() <= 50 ? q7.a(this) : String.valueOf(q7.a(a(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}

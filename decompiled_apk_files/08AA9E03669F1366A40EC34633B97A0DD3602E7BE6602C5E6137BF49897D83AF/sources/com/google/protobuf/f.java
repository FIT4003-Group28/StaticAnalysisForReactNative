package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public abstract class f implements Serializable, Iterable<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f4423a = new g(t.f4754c);

    /* renamed from: b  reason: collision with root package name */
    private static final c f4424b;

    /* renamed from: c  reason: collision with root package name */
    private int f4425c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public interface c {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public interface d extends Iterator<Byte> {
    }

    public abstract byte a(int i);

    protected abstract int a(int i, int i2, int i3);

    public abstract f a(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(com.google.protobuf.e eVar);

    protected abstract void a(byte[] bArr, int i, int i2, int i3);

    public abstract int b();

    protected abstract String b(Charset charset);

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract com.google.protobuf.g g();

    static {
        boolean z;
        try {
            Class.forName("android.content.Context");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f4424b = z ? new h() : new a();
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    private static final class h implements c {
        private h() {
        }

        @Override // com.google.protobuf.f.c
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    private static final class a implements c {
        private a() {
        }

        @Override // com.google.protobuf.f.c
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    f() {
    }

    @Override // java.lang.Iterable
    /* renamed from: a */
    public final d iterator() {
        return new d() { // from class: com.google.protobuf.f.1

            /* renamed from: b  reason: collision with root package name */
            private int f4427b = 0;

            /* renamed from: c  reason: collision with root package name */
            private final int f4428c;

            {
                this.f4428c = f.this.b();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4427b < this.f4428c;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Byte next() {
                return Byte.valueOf(b());
            }

            public byte b() {
                try {
                    f fVar = f.this;
                    int i = this.f4427b;
                    this.f4427b = i + 1;
                    return fVar.a(i);
                } catch (IndexOutOfBoundsException e2) {
                    throw new NoSuchElementException(e2.getMessage());
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public final boolean c() {
        return b() == 0;
    }

    public static f a(byte[] bArr, int i, int i2) {
        return new g(f4424b.a(bArr, i, i2));
    }

    public static f a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f b(byte[] bArr) {
        return new g(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f b(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public static f a(String str) {
        return new g(str.getBytes(t.f4752a));
    }

    public final byte[] d() {
        int b2 = b();
        if (b2 == 0) {
            return t.f4754c;
        }
        byte[] bArr = new byte[b2];
        a(bArr, 0, 0, b2);
        return bArr;
    }

    public final String a(Charset charset) {
        return b() == 0 ? "" : b(charset);
    }

    public final String e() {
        return a(t.f4752a);
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static abstract class AbstractC0080f extends f {
        abstract boolean a(f fVar, int i, int i2);

        AbstractC0080f() {
        }

        @Override // com.google.protobuf.f, java.lang.Iterable
        public /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    public final int hashCode() {
        int i = this.f4425c;
        if (i == 0) {
            int b2 = b();
            i = a(b2, 0, b2);
            if (i == 0) {
                i = 1;
            }
            this.f4425c = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b(int i) {
        return new e(i);
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.protobuf.h f4431a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f4432b;

        private e(int i) {
            this.f4432b = new byte[i];
            this.f4431a = com.google.protobuf.h.a(this.f4432b);
        }

        public f a() {
            this.f4431a.c();
            return new g(this.f4432b);
        }

        public com.google.protobuf.h b() {
            return this.f4431a;
        }
    }

    protected final int h() {
        return this.f4425c;
    }

    static void b(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static class g extends AbstractC0080f {

        /* renamed from: b  reason: collision with root package name */
        protected final byte[] f4433b;

        protected int i() {
            return 0;
        }

        g(byte[] bArr) {
            this.f4433b = bArr;
        }

        @Override // com.google.protobuf.f
        public byte a(int i) {
            return this.f4433b[i];
        }

        @Override // com.google.protobuf.f
        public int b() {
            return this.f4433b.length;
        }

        @Override // com.google.protobuf.f
        public final f a(int i, int i2) {
            int b2 = b(i, i2, b());
            if (b2 == 0) {
                return f.f4423a;
            }
            return new b(this.f4433b, i() + i, b2);
        }

        @Override // com.google.protobuf.f
        protected void a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f4433b, i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.f
        final void a(com.google.protobuf.e eVar) {
            eVar.a(this.f4433b, i(), b());
        }

        @Override // com.google.protobuf.f
        protected final String b(Charset charset) {
            return new String(this.f4433b, i(), b(), charset);
        }

        @Override // com.google.protobuf.f
        public final boolean f() {
            int i = i();
            return ax.a(this.f4433b, i, b() + i);
        }

        @Override // com.google.protobuf.f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f) || b() != ((f) obj).b()) {
                return false;
            }
            if (b() == 0) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                int h = h();
                int h2 = gVar.h();
                if (h != 0 && h2 != 0 && h != h2) {
                    return false;
                }
                return a(gVar, 0, b());
            }
            return obj.equals(this);
        }

        @Override // com.google.protobuf.f.AbstractC0080f
        final boolean a(f fVar, int i, int i2) {
            if (i2 > fVar.b()) {
                throw new IllegalArgumentException("Length too large: " + i2 + b());
            }
            int i3 = i + i2;
            if (i3 > fVar.b()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + fVar.b());
            } else if (fVar instanceof g) {
                g gVar = (g) fVar;
                byte[] bArr = this.f4433b;
                byte[] bArr2 = gVar.f4433b;
                int i4 = i() + i2;
                int i5 = i();
                int i6 = gVar.i() + i;
                while (i5 < i4) {
                    if (bArr[i5] != bArr2[i6]) {
                        return false;
                    }
                    i5++;
                    i6++;
                }
                return true;
            } else {
                return fVar.a(i, i3).equals(a(0, i2));
            }
        }

        @Override // com.google.protobuf.f
        protected final int a(int i, int i2, int i3) {
            return t.a(i, this.f4433b, i() + i2, i3);
        }

        @Override // com.google.protobuf.f
        public final com.google.protobuf.g g() {
            return com.google.protobuf.g.a(this.f4433b, i(), b(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* loaded from: classes.dex */
    public static final class b extends g {

        /* renamed from: c  reason: collision with root package name */
        private final int f4429c;

        /* renamed from: d  reason: collision with root package name */
        private final int f4430d;

        b(byte[] bArr, int i, int i2) {
            super(bArr);
            b(i, i + i2, bArr.length);
            this.f4429c = i;
            this.f4430d = i2;
        }

        @Override // com.google.protobuf.f.g, com.google.protobuf.f
        public byte a(int i) {
            b(i, b());
            return this.f4433b[this.f4429c + i];
        }

        @Override // com.google.protobuf.f.g, com.google.protobuf.f
        public int b() {
            return this.f4430d;
        }

        @Override // com.google.protobuf.f.g
        protected int i() {
            return this.f4429c;
        }

        @Override // com.google.protobuf.f.g, com.google.protobuf.f
        protected void a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f4433b, i() + i, bArr, i2, i3);
        }
    }
}

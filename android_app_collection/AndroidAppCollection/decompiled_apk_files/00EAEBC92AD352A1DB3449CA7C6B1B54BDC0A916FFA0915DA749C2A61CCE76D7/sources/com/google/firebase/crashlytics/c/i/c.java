package com.google.firebase.crashlytics.c.i;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private static final Logger f8804h = Logger.getLogger(c.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final RandomAccessFile f8805b;

    /* renamed from: c  reason: collision with root package name */
    int f8806c;

    /* renamed from: d  reason: collision with root package name */
    private int f8807d;

    /* renamed from: e  reason: collision with root package name */
    private b f8808e;

    /* renamed from: f  reason: collision with root package name */
    private b f8809f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f8810g = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        boolean f8811a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f8812b;

        a(c cVar, StringBuilder sb) {
            this.f8812b = sb;
        }

        @Override // com.google.firebase.crashlytics.c.i.c.d
        public void a(InputStream inputStream, int i) {
            if (this.f8811a) {
                this.f8811a = false;
            } else {
                this.f8812b.append(", ");
            }
            this.f8812b.append(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        static final b f8813c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        final int f8814a;

        /* renamed from: b  reason: collision with root package name */
        final int f8815b;

        b(int i, int i2) {
            this.f8814a = i;
            this.f8815b = i2;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.f8814a + ", length = " + this.f8815b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.crashlytics.c.i.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0167c extends InputStream {

        /* renamed from: b  reason: collision with root package name */
        private int f8816b;

        /* renamed from: c  reason: collision with root package name */
        private int f8817c;

        private C0167c(b bVar) {
            this.f8816b = c.this.e(bVar.f8814a + 4);
            this.f8817c = bVar.f8815b;
        }

        /* synthetic */ C0167c(c cVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f8817c == 0) {
                return -1;
            }
            c.this.f8805b.seek(this.f8816b);
            int read = c.this.f8805b.read();
            this.f8816b = c.this.e(this.f8816b + 1);
            this.f8817c--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            c.b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f8817c;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            c.this.b(this.f8816b, bArr, i, i2);
            this.f8816b = c.this.e(this.f8816b + i2);
            this.f8817c -= i2;
            return i2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(InputStream inputStream, int i);
    }

    public c(File file) {
        if (!file.exists()) {
            a(file);
        }
        this.f8805b = b(file);
        e();
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private void a(int i, int i2, int i3, int i4) {
        a(this.f8810g, i, i2, i3, i4);
        this.f8805b.seek(0L);
        this.f8805b.write(this.f8810g);
    }

    private static void a(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile b2 = b(file2);
        try {
            b2.setLength(4096L);
            b2.seek(0L);
            byte[] bArr = new byte[16];
            a(bArr, 4096, 0, 0, 0);
            b2.write(bArr);
            b2.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }

    private static void a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            b(bArr, i, i2);
            i += 4;
        }
    }

    private static RandomAccessFile b(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private void b(int i) {
        int i2 = i + 4;
        int f2 = f();
        if (f2 >= i2) {
            return;
        }
        int i3 = this.f8806c;
        do {
            f2 += i3;
            i3 <<= 1;
        } while (f2 < i2);
        d(i3);
        b bVar = this.f8809f;
        int e2 = e(bVar.f8814a + 4 + bVar.f8815b);
        if (e2 < this.f8808e.f8814a) {
            FileChannel channel = this.f8805b.getChannel();
            channel.position(this.f8806c);
            long j = e2 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f8809f.f8814a;
        int i5 = this.f8808e.f8814a;
        if (i4 < i5) {
            int i6 = (this.f8806c + i4) - 16;
            a(i3, this.f8807d, i5, i6);
            this.f8809f = new b(i6, this.f8809f.f8815b);
        } else {
            a(i3, this.f8807d, i5, i4);
        }
        this.f8806c = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int e2 = e(i);
        int i4 = e2 + i3;
        int i5 = this.f8806c;
        if (i4 <= i5) {
            this.f8805b.seek(e2);
            randomAccessFile = this.f8805b;
        } else {
            int i6 = i5 - e2;
            this.f8805b.seek(e2);
            this.f8805b.readFully(bArr, i2, i6);
            this.f8805b.seek(16L);
            randomAccessFile = this.f8805b;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    private static void b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private b c(int i) {
        if (i == 0) {
            return b.f8813c;
        }
        this.f8805b.seek(i);
        return new b(i, this.f8805b.readInt());
    }

    private void c(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int e2 = e(i);
        int i4 = e2 + i3;
        int i5 = this.f8806c;
        if (i4 <= i5) {
            this.f8805b.seek(e2);
            randomAccessFile = this.f8805b;
        } else {
            int i6 = i5 - e2;
            this.f8805b.seek(e2);
            this.f8805b.write(bArr, i2, i6);
            this.f8805b.seek(16L);
            randomAccessFile = this.f8805b;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    private void d(int i) {
        this.f8805b.setLength(i);
        this.f8805b.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(int i) {
        int i2 = this.f8806c;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void e() {
        this.f8805b.seek(0L);
        this.f8805b.readFully(this.f8810g);
        this.f8806c = a(this.f8810g, 0);
        if (this.f8806c <= this.f8805b.length()) {
            this.f8807d = a(this.f8810g, 4);
            int a2 = a(this.f8810g, 8);
            int a3 = a(this.f8810g, 12);
            this.f8808e = c(a2);
            this.f8809f = c(a3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f8806c + ", Actual length: " + this.f8805b.length());
    }

    private int f() {
        return this.f8806c - d();
    }

    public synchronized void a() {
        a(4096, 0, 0, 0);
        this.f8807d = 0;
        this.f8808e = b.f8813c;
        this.f8809f = b.f8813c;
        if (this.f8806c > 4096) {
            d(4096);
        }
        this.f8806c = 4096;
    }

    public synchronized void a(d dVar) {
        int i = this.f8808e.f8814a;
        for (int i2 = 0; i2 < this.f8807d; i2++) {
            b c2 = c(i);
            dVar.a(new C0167c(this, c2, null), c2.f8815b);
            i = e(c2.f8814a + 4 + c2.f8815b);
        }
    }

    public void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    public synchronized void a(byte[] bArr, int i, int i2) {
        b(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        b(i2);
        boolean b2 = b();
        b bVar = new b(b2 ? 16 : e(this.f8809f.f8814a + 4 + this.f8809f.f8815b), i2);
        b(this.f8810g, 0, i2);
        c(bVar.f8814a, this.f8810g, 0, 4);
        c(bVar.f8814a + 4, bArr, i, i2);
        a(this.f8806c, this.f8807d + 1, b2 ? bVar.f8814a : this.f8808e.f8814a, bVar.f8814a);
        this.f8809f = bVar;
        this.f8807d++;
        if (b2) {
            this.f8808e = this.f8809f;
        }
    }

    public synchronized boolean b() {
        return this.f8807d == 0;
    }

    public synchronized void c() {
        if (b()) {
            throw new NoSuchElementException();
        }
        if (this.f8807d == 1) {
            a();
        } else {
            int e2 = e(this.f8808e.f8814a + 4 + this.f8808e.f8815b);
            b(e2, this.f8810g, 0, 4);
            int a2 = a(this.f8810g, 0);
            a(this.f8806c, this.f8807d - 1, e2, this.f8809f.f8814a);
            this.f8807d--;
            this.f8808e = new b(e2, a2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f8805b.close();
    }

    public int d() {
        if (this.f8807d == 0) {
            return 16;
        }
        b bVar = this.f8809f;
        int i = bVar.f8814a;
        int i2 = this.f8808e.f8814a;
        return i >= i2 ? (i - i2) + 4 + bVar.f8815b + 16 : (((i + 4) + bVar.f8815b) + this.f8806c) - i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f8806c);
        sb.append(", size=");
        sb.append(this.f8807d);
        sb.append(", first=");
        sb.append(this.f8808e);
        sb.append(", last=");
        sb.append(this.f8809f);
        sb.append(", element lengths=[");
        try {
            a(new a(this, sb));
        } catch (IOException e2) {
            f8804h.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }
}

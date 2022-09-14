package b.a.a.a.a.b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: QueueFile.java */
/* loaded from: classes.dex */
public class r implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f1096b = Logger.getLogger(r.class.getName());

    /* renamed from: a  reason: collision with root package name */
    int f1097a;

    /* renamed from: c  reason: collision with root package name */
    private final RandomAccessFile f1098c;

    /* renamed from: d  reason: collision with root package name */
    private int f1099d;
    private a e;
    private a f;
    private final byte[] g = new byte[16];

    /* compiled from: QueueFile.java */
    /* loaded from: classes.dex */
    public interface c {
        void read(InputStream inputStream, int i);
    }

    public r(File file) {
        if (!file.exists()) {
            a(file);
        }
        this.f1098c = b(file);
        e();
    }

    private static void b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            b(bArr, i, i2);
            i += 4;
        }
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private void e() {
        this.f1098c.seek(0L);
        this.f1098c.readFully(this.g);
        this.f1097a = a(this.g, 0);
        if (this.f1097a > this.f1098c.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f1097a + ", Actual length: " + this.f1098c.length());
        }
        this.f1099d = a(this.g, 4);
        int a2 = a(this.g, 8);
        int a3 = a(this.g, 12);
        this.e = a(a2);
        this.f = a(a3);
    }

    private void a(int i, int i2, int i3, int i4) {
        a(this.g, i, i2, i3, i4);
        this.f1098c.seek(0L);
        this.f1098c.write(this.g);
    }

    private a a(int i) {
        if (i == 0) {
            return a.f1103a;
        }
        this.f1098c.seek(i);
        return new a(i, this.f1098c.readInt());
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
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Rename failed!");
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }

    private static RandomAccessFile b(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(int i) {
        return i < this.f1097a ? i : (i + 16) - this.f1097a;
    }

    private void a(int i, byte[] bArr, int i2, int i3) {
        int b2 = b(i);
        if (b2 + i3 <= this.f1097a) {
            this.f1098c.seek(b2);
            this.f1098c.write(bArr, i2, i3);
            return;
        }
        int i4 = this.f1097a - b2;
        this.f1098c.seek(b2);
        this.f1098c.write(bArr, i2, i4);
        this.f1098c.seek(16L);
        this.f1098c.write(bArr, i2 + i4, i3 - i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, byte[] bArr, int i2, int i3) {
        int b2 = b(i);
        if (b2 + i3 <= this.f1097a) {
            this.f1098c.seek(b2);
            this.f1098c.readFully(bArr, i2, i3);
            return;
        }
        int i4 = this.f1097a - b2;
        this.f1098c.seek(b2);
        this.f1098c.readFully(bArr, i2, i4);
        this.f1098c.seek(16L);
        this.f1098c.readFully(bArr, i2 + i4, i3 - i4);
    }

    public void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    public synchronized void a(byte[] bArr, int i, int i2) {
        b(bArr, "buffer");
        if ((i | i2) >= 0 && i2 <= bArr.length - i) {
            c(i2);
            boolean b2 = b();
            a aVar = new a(b2 ? 16 : b(this.f.f1104b + 4 + this.f.f1105c), i2);
            b(this.g, 0, i2);
            a(aVar.f1104b, this.g, 0, 4);
            a(aVar.f1104b + 4, bArr, i, i2);
            a(this.f1097a, this.f1099d + 1, b2 ? aVar.f1104b : this.e.f1104b, aVar.f1104b);
            this.f = aVar;
            this.f1099d++;
            if (b2) {
                this.e = this.f;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        if (this.f1099d == 0) {
            return 16;
        }
        if (this.f.f1104b >= this.e.f1104b) {
            return (this.f.f1104b - this.e.f1104b) + 4 + this.f.f1105c + 16;
        }
        return (((this.f.f1104b + 4) + this.f.f1105c) + this.f1097a) - this.e.f1104b;
    }

    private int f() {
        return this.f1097a - a();
    }

    public synchronized boolean b() {
        return this.f1099d == 0;
    }

    private void c(int i) {
        int i2 = i + 4;
        int f = f();
        if (f >= i2) {
            return;
        }
        int i3 = this.f1097a;
        do {
            f += i3;
            i3 <<= 1;
        } while (f < i2);
        d(i3);
        int b2 = b(this.f.f1104b + 4 + this.f.f1105c);
        if (b2 < this.e.f1104b) {
            FileChannel channel = this.f1098c.getChannel();
            channel.position(this.f1097a);
            long j = b2 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        if (this.f.f1104b < this.e.f1104b) {
            int i4 = (this.f1097a + this.f.f1104b) - 16;
            a(i3, this.f1099d, this.e.f1104b, i4);
            this.f = new a(i4, this.f.f1105c);
        } else {
            a(i3, this.f1099d, this.e.f1104b, this.f.f1104b);
        }
        this.f1097a = i3;
    }

    private void d(int i) {
        this.f1098c.setLength(i);
        this.f1098c.getChannel().force(true);
    }

    public synchronized void a(c cVar) {
        int i = this.e.f1104b;
        for (int i2 = 0; i2 < this.f1099d; i2++) {
            a a2 = a(i);
            cVar.read(new b(a2), a2.f1105c);
            i = b(a2.f1104b + 4 + a2.f1105c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T b(T t, String str) {
        if (t == null) {
            throw new NullPointerException(str);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFile.java */
    /* loaded from: classes.dex */
    public final class b extends InputStream {

        /* renamed from: b  reason: collision with root package name */
        private int f1107b;

        /* renamed from: c  reason: collision with root package name */
        private int f1108c;

        private b(a aVar) {
            this.f1107b = r.this.b(aVar.f1104b + 4);
            this.f1108c = aVar.f1105c;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            r.b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (this.f1108c <= 0) {
                return -1;
            }
            if (i2 > this.f1108c) {
                i2 = this.f1108c;
            }
            r.this.b(this.f1107b, bArr, i, i2);
            this.f1107b = r.this.b(this.f1107b + i2);
            this.f1108c -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f1108c == 0) {
                return -1;
            }
            r.this.f1098c.seek(this.f1107b);
            int read = r.this.f1098c.read();
            this.f1107b = r.this.b(this.f1107b + 1);
            this.f1108c--;
            return read;
        }
    }

    public synchronized void c() {
        if (b()) {
            throw new NoSuchElementException();
        }
        if (this.f1099d == 1) {
            d();
        } else {
            int b2 = b(this.e.f1104b + 4 + this.e.f1105c);
            b(b2, this.g, 0, 4);
            int a2 = a(this.g, 0);
            a(this.f1097a, this.f1099d - 1, b2, this.f.f1104b);
            this.f1099d--;
            this.e = new a(b2, a2);
        }
    }

    public synchronized void d() {
        a(4096, 0, 0, 0);
        this.f1099d = 0;
        this.e = a.f1103a;
        this.f = a.f1103a;
        if (this.f1097a > 4096) {
            d(4096);
        }
        this.f1097a = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1098c.close();
    }

    public boolean a(int i, int i2) {
        return (a() + 4) + i <= i2;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f1097a);
        sb.append(", size=");
        sb.append(this.f1099d);
        sb.append(", first=");
        sb.append(this.e);
        sb.append(", last=");
        sb.append(this.f);
        sb.append(", element lengths=[");
        try {
            a(new c() { // from class: b.a.a.a.a.b.r.1

                /* renamed from: a  reason: collision with root package name */
                boolean f1100a = true;

                @Override // b.a.a.a.a.b.r.c
                public void read(InputStream inputStream, int i) {
                    if (this.f1100a) {
                        this.f1100a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            f1096b.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final a f1103a = new a(0, 0);

        /* renamed from: b  reason: collision with root package name */
        final int f1104b;

        /* renamed from: c  reason: collision with root package name */
        final int f1105c;

        a(int i, int i2) {
            this.f1104b = i;
            this.f1105c = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f1104b + ", length = " + this.f1105c + "]";
        }
    }
}

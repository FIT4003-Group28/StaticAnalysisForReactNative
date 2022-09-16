package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.zip.Adler32;
/* compiled from: PG */
/* renamed from: vuq  reason: default package */
/* loaded from: classes4.dex */
public final class vuq extends InputStream {
    final ArrayList a;
    public final long b;
    private final Adler32 c = new Adler32();
    private final vur d;
    private final ReadableByteChannel e;
    private final ByteBuffer f;
    private long g;
    private boolean h;

    public vuq(vur vurVar) {
        try {
            this.d = vurVar;
            ByteBuffer allocate = ByteBuffer.allocate(10485760);
            this.f = allocate;
            allocate.limit(0);
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.h = false;
            vup vupVar = new vup(arrayList);
            vurVar.a().k(vupVar);
            vupVar.close();
            aqxo.y(vupVar.b);
            this.b = vupVar.a;
            try {
                Pipe open = Pipe.open();
                new vuo(vurVar, open.sink()).start();
                this.e = open.source();
                this.g = 0L;
            } catch (IOException e) {
                vurVar.close();
                throw e;
            }
        } catch (Throwable th) {
            throw new vqc(th, vqb.GENERIC_MOVIE_INPUT_STREAM);
        }
    }

    private final int a(ByteBuffer byteBuffer) {
        this.e.getClass();
        if (this.h) {
            return -1;
        }
        byteBuffer.clear();
        if (byteBuffer.remaining() >= 10485760) {
            int i = (int) (this.g / 10485760);
            while (true) {
                if (byteBuffer.hasRemaining()) {
                    if (this.e.read(byteBuffer) == -1) {
                        this.h = true;
                        this.d.close();
                        break;
                    }
                } else {
                    break;
                }
            }
            byteBuffer.flip();
            if (!byteBuffer.hasRemaining()) {
                if (!this.h) {
                    throw new IOException("MovieInputStream had issue fetching more data");
                }
                if (this.g + 1 < this.b) {
                    throw new IOException("End of file found without reaching full data size");
                }
                return -1;
            }
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset();
            int position = byteBuffer.position();
            int remaining = byteBuffer.remaining();
            this.c.reset();
            this.c.update(array, arrayOffset + position, remaining);
            if (this.c.getValue() != ((Long) this.a.get(i)).longValue()) {
                byteBuffer.limit(0);
                long j = this.g;
                StringBuilder sb = new StringBuilder(99);
                sb.append("CRC mismatch from MP4Parser stream at buffer index: ");
                sb.append(i);
                sb.append(" bufferPosition:");
                sb.append(j);
                throw new vqc(sb.toString(), vqb.MOVIE_INPUT_STREAM_CRC_MISMATCH);
            }
            this.g += byteBuffer.remaining();
            return byteBuffer.remaining();
        }
        throw new IOException("Insufficient buffer size");
    }

    @Override // java.io.InputStream
    public final synchronized int available() {
        if (!this.h || this.f.hasRemaining()) {
            return (int) ((this.b - this.g) + this.f.remaining());
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.close();
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        try {
            if (!this.f.hasRemaining() && a(this.f) == -1) {
                return -1;
            }
            return this.f.get() & 255;
        } catch (Throwable th) {
            if (!(th instanceof vqc)) {
                throw new vqc(th, vqb.MOVIE_INPUT_STREAM_READ);
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        try {
            if (!this.f.hasRemaining() && a(this.f) == -1) {
                return -1;
            }
            if (this.f.remaining() < i2) {
                i2 = this.f.remaining();
            }
            this.f.get(bArr, i, i2);
            return i2;
        } catch (Throwable th) {
            if (!(th instanceof vqc)) {
                throw new vqc(th, vqb.MOVIE_INPUT_STREAM_READ);
            }
            throw th;
        }
    }
}

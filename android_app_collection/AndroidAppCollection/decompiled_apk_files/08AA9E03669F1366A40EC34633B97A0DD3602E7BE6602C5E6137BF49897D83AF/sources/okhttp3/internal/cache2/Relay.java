package okhttp3.internal.cache2;

import c.c;
import c.f;
import c.t;
import c.u;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
/* loaded from: classes.dex */
final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final f PREFIX_CLEAN = f.a("OkHttp cache v1\n");
    static final f PREFIX_DIRTY = f.a("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final f metadata;
    int sourceCount;
    t upstream;
    long upstreamPos;
    Thread upstreamReader;
    final c upstreamBuffer = new c();
    final c buffer = new c();

    private Relay(RandomAccessFile randomAccessFile, t tVar, long j, f fVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = tVar;
        this.complete = tVar == null;
        this.upstreamPos = j;
        this.metadata = fVar;
        this.bufferMaxSize = j2;
    }

    public static Relay edit(File file, t tVar, f fVar, long j) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Relay relay = new Relay(randomAccessFile, tVar, 0L, fVar, j);
        randomAccessFile.setLength(0L);
        relay.writeHeader(PREFIX_DIRTY, -1L, -1L);
        return relay;
    }

    public static Relay read(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        c cVar = new c();
        fileOperator.read(0L, cVar, FILE_HEADER_SIZE);
        if (!cVar.d(PREFIX_CLEAN.h()).equals(PREFIX_CLEAN)) {
            throw new IOException("unreadable cache file");
        }
        long k = cVar.k();
        long k2 = cVar.k();
        c cVar2 = new c();
        fileOperator.read(k + FILE_HEADER_SIZE, cVar2, k2);
        return new Relay(randomAccessFile, null, k, cVar2.p(), 0L);
    }

    private void writeHeader(f fVar, long j, long j2) {
        c cVar = new c();
        cVar.b(fVar);
        cVar.o(j);
        cVar.o(j2);
        if (cVar.a() != FILE_HEADER_SIZE) {
            throw new IllegalArgumentException();
        }
        new FileOperator(this.file.getChannel()).write(0L, cVar, FILE_HEADER_SIZE);
    }

    private void writeMetadata(long j) {
        c cVar = new c();
        cVar.b(this.metadata);
        new FileOperator(this.file.getChannel()).write(FILE_HEADER_SIZE + j, cVar, this.metadata.h());
    }

    void commit(long j) {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.h());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    boolean isClosed() {
        return this.file == null;
    }

    public f metadata() {
        return this.metadata;
    }

    public t newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    /* loaded from: classes.dex */
    class RelaySource implements t {
        private FileOperator fileOperator;
        private long sourcePos;
        private final u timeout = new u();

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        @Override // c.t
        public long read(c cVar, long j) {
            long j2;
            char c2;
            if (this.fileOperator == null) {
                throw new IllegalStateException("closed");
            }
            synchronized (Relay.this) {
                while (true) {
                    long j3 = this.sourcePos;
                    j2 = Relay.this.upstreamPos;
                    if (j3 == j2) {
                        if (!Relay.this.complete) {
                            if (Relay.this.upstreamReader != null) {
                                this.timeout.waitUntilNotified(Relay.this);
                            } else {
                                Relay.this.upstreamReader = Thread.currentThread();
                                c2 = 1;
                                break;
                            }
                        } else {
                            return -1L;
                        }
                    } else {
                        long a2 = j2 - Relay.this.buffer.a();
                        if (this.sourcePos >= a2) {
                            long min = Math.min(j, j2 - this.sourcePos);
                            Relay.this.buffer.a(cVar, this.sourcePos - a2, min);
                            this.sourcePos += min;
                            return min;
                        }
                        c2 = 2;
                    }
                }
                if (c2 == 2) {
                    long min2 = Math.min(j, j2 - this.sourcePos);
                    this.fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, cVar, min2);
                    this.sourcePos += min2;
                    return min2;
                }
                try {
                    long read = Relay.this.upstream.read(Relay.this.upstreamBuffer, Relay.this.bufferMaxSize);
                    if (read == -1) {
                        Relay.this.commit(j2);
                        synchronized (Relay.this) {
                            Relay.this.upstreamReader = null;
                            Relay.this.notifyAll();
                        }
                        return -1L;
                    }
                    long min3 = Math.min(read, j);
                    Relay.this.upstreamBuffer.a(cVar, 0L, min3);
                    this.sourcePos += min3;
                    this.fileOperator.write(j2 + Relay.FILE_HEADER_SIZE, Relay.this.upstreamBuffer.clone(), read);
                    synchronized (Relay.this) {
                        Relay.this.buffer.write(Relay.this.upstreamBuffer, read);
                        if (Relay.this.buffer.a() > Relay.this.bufferMaxSize) {
                            Relay.this.buffer.i(Relay.this.buffer.a() - Relay.this.bufferMaxSize);
                        }
                        Relay.this.upstreamPos += read;
                    }
                    synchronized (Relay.this) {
                        Relay.this.upstreamReader = null;
                        Relay.this.notifyAll();
                    }
                    return min3;
                } catch (Throwable th) {
                    synchronized (Relay.this) {
                        Relay.this.upstreamReader = null;
                        Relay.this.notifyAll();
                        throw th;
                    }
                }
            }
        }

        @Override // c.t
        public u timeout() {
            return this.timeout;
        }

        @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay relay = Relay.this;
                relay.sourceCount--;
                if (Relay.this.sourceCount == 0) {
                    RandomAccessFile randomAccessFile2 = Relay.this.file;
                    Relay.this.file = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
            if (randomAccessFile == null) {
                return;
            }
            Util.closeQuietly(randomAccessFile);
        }
    }
}

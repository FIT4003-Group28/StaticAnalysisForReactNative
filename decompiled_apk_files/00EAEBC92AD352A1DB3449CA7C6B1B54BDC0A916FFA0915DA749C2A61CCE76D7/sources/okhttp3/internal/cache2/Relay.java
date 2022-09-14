package okhttp3.internal.cache2;

import h.c;
import h.f;
import h.v;
import h.w;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
/* loaded from: classes.dex */
final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final f PREFIX_CLEAN = f.d("OkHttp cache v1\n");
    static final f PREFIX_DIRTY = f.d("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final f metadata;
    int sourceCount;
    v upstream;
    long upstreamPos;
    Thread upstreamReader;
    final c upstreamBuffer = new c();
    final c buffer = new c();

    /* loaded from: classes.dex */
    class RelaySource implements v {
        private FileOperator fileOperator;
        private long sourcePos;
        private final w timeout = new w();

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
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

        /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
            if (r5 != 2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
            r2 = java.lang.Math.min(r23, r7 - r21.sourcePos);
            r21.fileOperator.read(r21.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r22, r2);
            r21.sourcePos += r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
            r5 = r21.this$0.upstream.read(r21.this$0.upstreamBuffer, r21.this$0.bufferMaxSize);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
            if (r5 != (-1)) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
            r21.this$0.commit(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
            r21.this$0.upstreamReader = null;
            r21.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
            r2 = java.lang.Math.min(r5, r23);
            r21.this$0.upstreamBuffer.a(r22, 0, r2);
            r21.sourcePos += r2;
            r21.fileOperator.write(r7 + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r21.this$0.upstreamBuffer.m334clone(), r5);
            r7 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
            monitor-enter(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
            r21.this$0.buffer.write(r21.this$0.upstreamBuffer, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
            if (r21.this$0.buffer.e() <= r21.this$0.bufferMaxSize) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
            r21.this$0.buffer.skip(r21.this$0.buffer.e() - r21.this$0.bufferMaxSize);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
            r21.this$0.upstreamPos += r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
            monitor-exit(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
            r5 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
            monitor-enter(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
            r21.this$0.upstreamReader = null;
            r21.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
            monitor-exit(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
            monitor-enter(r21.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
            r21.this$0.upstreamReader = null;
            r21.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
            throw r0;
         */
        @Override // h.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(h.c r22, long r23) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(h.c, long):long");
        }

        @Override // h.v
        public w timeout() {
            return this.timeout;
        }
    }

    private Relay(RandomAccessFile randomAccessFile, v vVar, long j, f fVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = vVar;
        this.complete = vVar == null;
        this.upstreamPos = j;
        this.metadata = fVar;
        this.bufferMaxSize = j2;
    }

    public static Relay edit(File file, v vVar, f fVar, long j) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Relay relay = new Relay(randomAccessFile, vVar, 0L, fVar, j);
        randomAccessFile.setLength(0L);
        relay.writeHeader(PREFIX_DIRTY, -1L, -1L);
        return relay;
    }

    public static Relay read(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        c cVar = new c();
        fileOperator.read(0L, cVar, FILE_HEADER_SIZE);
        if (cVar.e(PREFIX_CLEAN.g()).equals(PREFIX_CLEAN)) {
            long readLong = cVar.readLong();
            long readLong2 = cVar.readLong();
            c cVar2 = new c();
            fileOperator.read(readLong + FILE_HEADER_SIZE, cVar2, readLong2);
            return new Relay(randomAccessFile, null, readLong, cVar2.c(), 0L);
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(f fVar, long j, long j2) {
        c cVar = new c();
        cVar.mo330a(fVar);
        cVar.k(j);
        cVar.k(j2);
        if (cVar.e() == FILE_HEADER_SIZE) {
            new FileOperator(this.file.getChannel()).write(0L, cVar, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException();
    }

    private void writeMetadata(long j) {
        c cVar = new c();
        cVar.mo330a(this.metadata);
        new FileOperator(this.file.getChannel()).write(FILE_HEADER_SIZE + j, cVar, this.metadata.g());
    }

    void commit(long j) {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.g());
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

    public v newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }
}

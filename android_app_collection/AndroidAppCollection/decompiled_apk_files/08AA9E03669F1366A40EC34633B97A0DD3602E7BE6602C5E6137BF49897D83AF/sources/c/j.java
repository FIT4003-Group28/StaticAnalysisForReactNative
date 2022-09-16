package c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: GzipSource.java */
/* loaded from: classes.dex */
public final class j implements t {

    /* renamed from: b  reason: collision with root package name */
    private final e f1291b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f1292c;

    /* renamed from: d  reason: collision with root package name */
    private final k f1293d;

    /* renamed from: a  reason: collision with root package name */
    private int f1290a = 0;
    private final CRC32 e = new CRC32();

    public j(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f1292c = new Inflater(true);
        this.f1291b = l.a(tVar);
        this.f1293d = new k(this.f1291b, this.f1292c);
    }

    @Override // c.t
    public long read(c cVar, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.f1290a == 0) {
                a();
                this.f1290a = 1;
            }
            if (this.f1290a == 1) {
                long j2 = cVar.f1283b;
                long read = this.f1293d.read(cVar, j);
                if (read != -1) {
                    a(cVar, j2, read);
                    return read;
                }
                this.f1290a = 2;
            }
            if (this.f1290a == 2) {
                b();
                this.f1290a = 3;
                if (!this.f1291b.e()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    private void a() {
        this.f1291b.a(10L);
        byte c2 = this.f1291b.b().c(3L);
        boolean z = ((c2 >> 1) & 1) == 1;
        if (z) {
            a(this.f1291b.b(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f1291b.i());
        this.f1291b.i(8L);
        if (((c2 >> 2) & 1) == 1) {
            this.f1291b.a(2L);
            if (z) {
                a(this.f1291b.b(), 0L, 2L);
            }
            long l = this.f1291b.b().l();
            this.f1291b.a(l);
            if (z) {
                a(this.f1291b.b(), 0L, l);
            }
            this.f1291b.i(l);
        }
        if (((c2 >> 3) & 1) == 1) {
            long a2 = this.f1291b.a((byte) 0);
            if (a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.f1291b.b(), 0L, a2 + 1);
            }
            this.f1291b.i(a2 + 1);
        }
        if (((c2 >> 4) & 1) == 1) {
            long a3 = this.f1291b.a((byte) 0);
            if (a3 == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.f1291b.b(), 0L, a3 + 1);
            }
            this.f1291b.i(a3 + 1);
        }
        if (z) {
            a("FHCRC", this.f1291b.l(), (short) this.e.getValue());
            this.e.reset();
        }
    }

    private void b() {
        a("CRC", this.f1291b.m(), (int) this.e.getValue());
        a("ISIZE", this.f1291b.m(), (int) this.f1292c.getBytesWritten());
    }

    @Override // c.t
    public u timeout() {
        return this.f1291b.timeout();
    }

    @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1293d.close();
    }

    private void a(c cVar, long j, long j2) {
        int i;
        p pVar = cVar.f1282a;
        while (j >= pVar.f1321c - pVar.f1320b) {
            j -= pVar.f1321c - pVar.f1320b;
            pVar = pVar.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(pVar.f1321c - i, j2);
            this.e.update(pVar.f1319a, (int) (pVar.f1320b + j), min);
            j2 -= min;
            pVar = pVar.f;
            j = 0;
        }
    }

    private void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}

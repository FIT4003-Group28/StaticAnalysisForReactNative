package h;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class j implements v {

    /* renamed from: c  reason: collision with root package name */
    private final e f10151c;

    /* renamed from: d  reason: collision with root package name */
    private final Inflater f10152d;

    /* renamed from: e  reason: collision with root package name */
    private final k f10153e;

    /* renamed from: b  reason: collision with root package name */
    private int f10150b = 0;

    /* renamed from: f  reason: collision with root package name */
    private final CRC32 f10154f = new CRC32();

    public j(v vVar) {
        if (vVar != null) {
            this.f10152d = new Inflater(true);
            this.f10151c = l.a(vVar);
            this.f10153e = new k(this.f10151c, this.f10152d);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a() {
        this.f10151c.i(10L);
        byte a2 = this.f10151c.j().a(3L);
        boolean z = ((a2 >> 1) & 1) == 1;
        if (z) {
            a(this.f10151c.j(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f10151c.readShort());
        this.f10151c.skip(8L);
        if (((a2 >> 2) & 1) == 1) {
            this.f10151c.i(2L);
            if (z) {
                a(this.f10151c.j(), 0L, 2L);
            }
            long s = this.f10151c.j().s();
            this.f10151c.i(s);
            if (z) {
                a(this.f10151c.j(), 0L, s);
            }
            this.f10151c.skip(s);
        }
        if (((a2 >> 3) & 1) == 1) {
            long a3 = this.f10151c.a((byte) 0);
            if (a3 == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.f10151c.j(), 0L, a3 + 1);
            }
            this.f10151c.skip(a3 + 1);
        }
        if (((a2 >> 4) & 1) == 1) {
            long a4 = this.f10151c.a((byte) 0);
            if (a4 == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.f10151c.j(), 0L, a4 + 1);
            }
            this.f10151c.skip(a4 + 1);
        }
        if (z) {
            a("FHCRC", this.f10151c.s(), (short) this.f10154f.getValue());
            this.f10154f.reset();
        }
    }

    private void a(c cVar, long j, long j2) {
        int i;
        r rVar = cVar.f10133b;
        while (true) {
            int i2 = rVar.f10192c;
            int i3 = rVar.f10191b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            rVar = rVar.f10195f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(rVar.f10192c - i, j2);
            this.f10154f.update(rVar.f10190a, (int) (rVar.f10191b + j), min);
            j2 -= min;
            rVar = rVar.f10195f;
            j = 0;
        }
    }

    private void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
    }

    private void b() {
        a("CRC", this.f10151c.p(), (int) this.f10154f.getValue());
        a("ISIZE", this.f10151c.p(), (int) this.f10152d.getBytesWritten());
    }

    @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10153e.close();
    }

    @Override // h.v
    public long read(c cVar, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.f10150b == 0) {
                a();
                this.f10150b = 1;
            }
            if (this.f10150b == 1) {
                long j2 = cVar.f10134c;
                long read = this.f10153e.read(cVar, j);
                if (read != -1) {
                    a(cVar, j2, read);
                    return read;
                }
                this.f10150b = 2;
            }
            if (this.f10150b == 2) {
                b();
                this.f10150b = 3;
                if (!this.f10151c.r()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override // h.v
    public w timeout() {
        return this.f10151c.timeout();
    }
}

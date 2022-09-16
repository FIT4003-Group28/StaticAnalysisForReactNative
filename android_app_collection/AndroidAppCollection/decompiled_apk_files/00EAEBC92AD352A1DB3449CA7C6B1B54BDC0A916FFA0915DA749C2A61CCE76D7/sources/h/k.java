package h;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: b  reason: collision with root package name */
    private final e f10155b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f10156c;

    /* renamed from: d  reason: collision with root package name */
    private int f10157d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10158e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar, Inflater inflater) {
        if (eVar != null) {
            if (inflater == null) {
                throw new IllegalArgumentException("inflater == null");
            }
            this.f10155b = eVar;
            this.f10156c = inflater;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void b() {
        int i = this.f10157d;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f10156c.getRemaining();
        this.f10157d -= remaining;
        this.f10155b.skip(remaining);
    }

    public final boolean a() {
        if (!this.f10156c.needsInput()) {
            return false;
        }
        b();
        if (this.f10156c.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f10155b.r()) {
            return true;
        }
        r rVar = this.f10155b.j().f10133b;
        int i = rVar.f10192c;
        int i2 = rVar.f10191b;
        this.f10157d = i - i2;
        this.f10156c.setInput(rVar.f10190a, i2, this.f10157d);
        return false;
    }

    @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10158e) {
            return;
        }
        this.f10156c.end();
        this.f10158e = true;
        this.f10155b.close();
    }

    @Override // h.v
    public long read(c cVar, long j) {
        r b2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f10158e) {
            throw new IllegalStateException("closed");
        } else {
            if (i == 0) {
                return 0L;
            }
            while (true) {
                boolean a2 = a();
                try {
                    b2 = cVar.b(1);
                    int inflate = this.f10156c.inflate(b2.f10190a, b2.f10192c, (int) Math.min(j, 8192 - b2.f10192c));
                    if (inflate <= 0) {
                        if (this.f10156c.finished() || this.f10156c.needsDictionary()) {
                            break;
                        } else if (a2) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else {
                        b2.f10192c += inflate;
                        long j2 = inflate;
                        cVar.f10134c += j2;
                        return j2;
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            b();
            if (b2.f10191b != b2.f10192c) {
                return -1L;
            }
            cVar.f10133b = b2.b();
            s.a(b2);
            return -1L;
        }
    }

    @Override // h.v
    public w timeout() {
        return this.f10155b.timeout();
    }
}

package c;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: InflaterSource.java */
/* loaded from: classes.dex */
public final class k implements t {

    /* renamed from: a  reason: collision with root package name */
    private final e f1294a;

    /* renamed from: b  reason: collision with root package name */
    private final Inflater f1295b;

    /* renamed from: c  reason: collision with root package name */
    private int f1296c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1297d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f1294a = eVar;
        this.f1295b = inflater;
    }

    @Override // c.t
    public long read(c cVar, long j) {
        boolean a2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f1297d) {
            throw new IllegalStateException("closed");
        } else {
            if (i == 0) {
                return 0L;
            }
            do {
                a2 = a();
                try {
                    p e = cVar.e(1);
                    int inflate = this.f1295b.inflate(e.f1319a, e.f1321c, 8192 - e.f1321c);
                    if (inflate > 0) {
                        e.f1321c += inflate;
                        long j2 = inflate;
                        cVar.f1283b += j2;
                        return j2;
                    }
                    if (!this.f1295b.finished() && !this.f1295b.needsDictionary()) {
                    }
                    b();
                    if (e.f1320b != e.f1321c) {
                        return -1L;
                    }
                    cVar.f1282a = e.a();
                    q.a(e);
                    return -1L;
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            } while (!a2);
            throw new EOFException("source exhausted prematurely");
        }
    }

    public boolean a() {
        if (!this.f1295b.needsInput()) {
            return false;
        }
        b();
        if (this.f1295b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f1294a.e()) {
            return true;
        }
        p pVar = this.f1294a.b().f1282a;
        this.f1296c = pVar.f1321c - pVar.f1320b;
        this.f1295b.setInput(pVar.f1319a, pVar.f1320b, this.f1296c);
        return false;
    }

    private void b() {
        if (this.f1296c == 0) {
            return;
        }
        int remaining = this.f1296c - this.f1295b.getRemaining();
        this.f1296c -= remaining;
        this.f1294a.i(remaining);
    }

    @Override // c.t
    public u timeout() {
        return this.f1294a.timeout();
    }

    @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f1297d) {
            return;
        }
        this.f1295b.end();
        this.f1297d = true;
        this.f1294a.close();
    }
}

package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dywa  reason: default package */
/* loaded from: classes6.dex */
public final class dywa implements dyxz {
    private static final Logger d = Logger.getLogger(dywr.class.getName());
    public final dyvz a;
    public final dyxz b;
    public final dywu c;

    public dywa(dyvz dyvzVar, dyxz dyxzVar, dywu dywuVar) {
        this.a = dyvzVar;
        dbsk.t(dyxzVar, "frameWriter");
        this.b = dyxzVar;
        dbsk.t(dywuVar, "frameLogger");
        this.c = dywuVar;
    }

    @Override // defpackage.dyxz
    public final void a() {
        throw null;
    }

    @Override // defpackage.dyxz
    public final void b(dyyl dyylVar) {
        throw null;
    }

    @Override // defpackage.dyxz
    public final void c() {
        try {
            this.b.c();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            d.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // defpackage.dyxz
    public final void d(int i, dyxw dyxwVar) {
        this.c.c(2, i, dyxwVar);
        try {
            this.b.d(i, dyxwVar);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.dyxz
    public final void e(boolean z, int i, eaiz eaizVar, int i2) {
        throw null;
    }

    @Override // defpackage.dyxz
    public final void f(dyyl dyylVar) {
        throw null;
    }

    @Override // defpackage.dyxz
    public final void g(boolean z, int i, int i2) {
        if (z) {
            dywu dywuVar = this.c;
            long j = (4294967295L & i2) | (i << 32);
            if (dywuVar.a()) {
                Logger logger = dywuVar.a;
                Level level = dywuVar.b;
                String a = dyws.a(2);
                StringBuilder sb = new StringBuilder(a.length() + 42);
                sb.append(a);
                sb.append(" PING: ack=true bytes=");
                sb.append(j);
                logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", sb.toString());
            }
        } else {
            this.c.e(2, (4294967295L & i2) | (i << 32));
        }
        try {
            this.b.g(z, i, i2);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.dyxz
    public final void h(int i, long j) {
        this.c.g(2, i, j);
        try {
            this.b.h(i, j);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.dyxz
    public final void i(dyxw dyxwVar, byte[] bArr) {
        this.c.f(2, 0, dyxwVar, eajc.a(bArr));
        try {
            this.b.i(dyxwVar, bArr);
            this.b.c();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.dyxz
    public final void j(boolean z, int i, List<dyya> list) {
        throw null;
    }
}

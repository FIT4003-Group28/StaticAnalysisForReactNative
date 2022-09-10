package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dywq  reason: default package */
/* loaded from: classes6.dex */
public final class dywq implements Runnable, dyxx {
    public final dywu a;
    dyxy b;
    public boolean c;
    public final /* synthetic */ dywr d;

    public dywq(dywr dywrVar, dyxy dyxyVar) {
        this(dywrVar, dyxyVar, new dywu(Level.FINE, dywr.class));
    }

    public dywq(dywr dywrVar, dyxy dyxyVar, dywu dywuVar) {
        this.d = dywrVar;
        this.c = true;
        this.b = dyxyVar;
        this.a = dywuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IOException iOException;
        Logger logger;
        Level level;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.b.a(this)) {
            try {
                dyqg dyqgVar = this.d.x;
                if (dyqgVar != null) {
                    dyqgVar.b();
                }
            } catch (Throwable th) {
                try {
                    this.d.m(0, dyxw.PROTOCOL_ERROR, dyjb.l.g("error in frame handler").f(th));
                    try {
                        this.b.close();
                    } catch (IOException e) {
                        iOException = e;
                        logger = dywr.a;
                        level = Level.INFO;
                        logger.logp(level, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) iOException);
                        this.d.g.d();
                        Thread.currentThread().setName(name);
                    }
                } catch (Throwable th2) {
                    try {
                        this.b.close();
                    } catch (IOException e2) {
                        dywr.a.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e2);
                    }
                    this.d.g.d();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        this.d.m(0, dyxw.INTERNAL_ERROR, dyjb.m.g("End of stream or IOException"));
        try {
            this.b.close();
        } catch (IOException e3) {
            iOException = e3;
            logger = dywr.a;
            level = Level.INFO;
            logger.logp(level, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) iOException);
            this.d.g.d();
            Thread.currentThread().setName(name);
        }
        this.d.g.d();
        Thread.currentThread().setName(name);
    }
}

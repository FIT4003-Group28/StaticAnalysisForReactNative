package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.NetworkException;
/* compiled from: PG */
/* renamed from: aelr  reason: default package */
/* loaded from: classes.dex */
public final class aelr extends aflh {
    public final pvt b;
    private final afls c;
    private final long d;
    private final snc e;
    private long f;
    private final aynx g;
    private final aynx h;
    private final aenv i;
    private final aflm j;
    private final Executor k;
    private final aypf l;
    private int m;

    public aelr(ati atiVar, aenv aenvVar, aflm aflmVar, snc sncVar, aynx aynxVar, aynx aynxVar2, Executor executor, afls aflsVar, long j) {
        super(atiVar);
        this.l = new aypf();
        this.m = 0;
        this.c = aflsVar;
        this.d = j;
        this.e = sncVar;
        this.g = aynxVar;
        this.h = aynxVar2;
        this.i = aenvVar;
        this.b = new pvt();
        this.j = aflmVar;
        this.k = executor;
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.asv
    public final long h(asy asyVar) {
        this.f = this.e.d();
        this.l.g(this.h.ak().n().an(TimeUnit.MILLISECONDS).G(azpj.b(this.k)).Z(new aelo(this)), this.g.ak().n().an(TimeUnit.MILLISECONDS).G(azpj.b(this.k)).u(zwb.g).Z(new aelo(this, 1)));
        while (true) {
            try {
                return super.h(asyVar);
            } catch (atn e) {
                if (!(e.getCause() instanceof NetworkException)) {
                    throw e;
                }
                this.i.b(e);
                if (((NetworkException) e.getCause()).getErrorCode() == 2) {
                    this.b.f();
                    if (this.m == 0) {
                        zgp b = zgp.b(asyVar.a);
                        b.g("retry", "1");
                        asyVar = asyVar.d(b.a());
                    }
                    int i = this.m + 1;
                    this.m = i;
                    aenv aenvVar = this.i;
                    String num = Integer.toString(i);
                    synchronized (aenvVar.b) {
                        aeub aeubVar = aenvVar.a;
                        if (aeubVar != null) {
                            aeubVar.i("oroid", num);
                        } else {
                            aenvVar.c.add(new aenu(num));
                        }
                        long a = this.c.a(this.m);
                        if (this.d != 0 && this.e.d() + a <= this.f + this.d) {
                            try {
                                this.b.c(a);
                                this.j.X();
                            } catch (InterruptedException e2) {
                                Thread.currentThread().interrupt();
                                throw new atn(new IOException(e2), asyVar);
                            }
                        } else {
                            throw new atn(asyVar, (byte[]) null);
                        }
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.asv
    public final void j() {
        this.m = 0;
        this.l.c();
        super.j();
    }
}

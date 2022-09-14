package defpackage;

import android.content.Context;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: deyq  reason: default package */
/* loaded from: classes6.dex */
final class deyq implements dylx {
    private final Context a;
    @dzsi
    private final k b = null;
    private final dysx<ScheduledExecutorService> c;
    private final dysx<? extends Executor> d;
    private final deyz e;
    private ScheduledExecutorService f;
    private Executor g;
    private boolean h;

    public deyq(Context context, @dzsi k kVar, dysx<ScheduledExecutorService> dysxVar, dysx<? extends Executor> dysxVar2, deyz deyzVar) {
        this.a = context;
        this.c = dysxVar;
        this.d = dysxVar2;
        this.e = deyzVar;
        this.f = dysxVar.a();
        this.g = dysxVar2.a();
    }

    @Override // defpackage.dylx
    public final ScheduledExecutorService b() {
        return this.f;
    }

    @Override // defpackage.dylx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.f = this.c.b(this.f);
        this.g = this.d.b(this.g);
    }

    @Override // defpackage.dylx
    public final dymc a(SocketAddress socketAddress, dylw dylwVar, dyev dyevVar) {
        if (this.h) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        if (socketAddress instanceof deya) {
            deya deyaVar = (deya) socketAddress;
            throw null;
        } else if (socketAddress instanceof dexo) {
            return new dexv(this.a, null, (dexo) socketAddress, this.f, this.g, this.e, dylwVar.b);
        } else {
            throw dyjb.g.g("Unrecognized address").j();
        }
    }
}

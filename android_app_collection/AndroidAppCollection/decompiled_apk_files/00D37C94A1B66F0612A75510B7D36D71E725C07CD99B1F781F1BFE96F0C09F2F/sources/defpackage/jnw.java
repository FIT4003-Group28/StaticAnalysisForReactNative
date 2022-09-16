package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: jnw  reason: default package */
/* loaded from: classes3.dex */
public final class jnw {
    public final fcl a;
    public final azqb b;
    public final Executor c;
    public final ExecutorService d;

    public jnw(fcl fclVar, azqb azqbVar, Executor executor, ExecutorService executorService) {
        this.a = fclVar;
        this.b = azqbVar;
        this.c = executor;
        this.d = executorService;
    }

    public final agvv a() {
        return ((agrf) this.b.get()).a().i();
    }

    public final Future b(String str, yiw yiwVar) {
        return this.d.submit(new jns(this, str, yiwVar));
    }
}

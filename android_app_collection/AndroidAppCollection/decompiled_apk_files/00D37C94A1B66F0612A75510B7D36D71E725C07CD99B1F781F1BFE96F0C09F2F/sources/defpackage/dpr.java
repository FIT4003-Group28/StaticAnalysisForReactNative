package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dpr  reason: default package */
/* loaded from: classes3.dex */
public final class dpr {
    public final dpt a;
    public dpu b;
    public final dql c;
    public final dqj d;

    public dpr() {
        dpt dptVar = new dpt();
        this.a = dptVar;
        this.b = dptVar.a();
        this.c = new dql();
        this.d = new dqj();
        dptVar.c("internal.registerCallback", new dpq(this, 1));
        dptVar.c("internal.eventLogger", new dpq(this));
    }

    public final void a(String str, Callable callable) {
        this.a.c(str, callable);
    }

    public final boolean b() {
        return !this.c.c.isEmpty();
    }

    public final boolean c() {
        dql dqlVar = this.c;
        return !dqlVar.b.equals(dqlVar.a);
    }
}

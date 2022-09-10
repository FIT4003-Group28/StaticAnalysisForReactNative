package defpackage;

import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvyk  reason: default package */
/* loaded from: classes4.dex */
public final class bvyk {
    public final akox a;
    public final Executor b;
    public final Executor c;
    public final gga d;
    public final bvws e;
    @dzsi
    public dehn<alax> f;
    @dzsi
    public alad g = null;
    public final HashSet<aloo> h = new HashSet<>();
    public boolean i = false;

    public bvyk(akox akoxVar, Executor executor, Executor executor2, gga ggaVar, bvws bvwsVar) {
        this.a = akoxVar;
        this.b = executor;
        this.c = executor2;
        this.d = ggaVar;
        this.e = bvwsVar;
    }

    public final void a() {
        bvrj.UI_THREAD.c();
        alax b = b();
        if (b != null) {
            b.c();
        }
        this.f = null;
    }

    @dzsi
    public final alax b() {
        bvrj.UI_THREAD.c();
        dehn<alax> dehnVar = this.f;
        if (dehnVar == null || !dehnVar.isDone()) {
            return null;
        }
        try {
            return this.f.get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public final void c() {
        bvrj.UI_THREAD.c();
        this.a.p(akyt.e(this.g));
        this.g = null;
    }
}

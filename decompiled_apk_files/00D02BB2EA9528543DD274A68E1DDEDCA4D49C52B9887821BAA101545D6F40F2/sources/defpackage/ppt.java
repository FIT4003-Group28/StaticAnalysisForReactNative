package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ppt  reason: default package */
/* loaded from: classes7.dex */
public final class ppt implements bvwz {
    public final gga a;
    public final Executor b;
    public final pnq c;
    public final bvjj d;
    public final arbx e;
    public final pot f;
    public final int g;
    public final Runnable h;
    private boolean i = false;

    public ppt(gga ggaVar, Executor executor, pnq pnqVar, bvjj bvjjVar, araj arajVar, pot potVar, int i, Runnable runnable) {
        this.a = ggaVar;
        this.b = executor;
        this.c = pnqVar;
        this.d = bvjjVar;
        this.e = arajVar.m().f();
        this.f = potVar;
        this.g = i;
        this.h = runnable;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new ppr(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "sccc";
    }

    public final void d() {
        if (!this.i) {
            gn g = this.a.g();
            if (g != null && !g.J()) {
                g.f();
            }
            this.i = true;
        }
    }
}

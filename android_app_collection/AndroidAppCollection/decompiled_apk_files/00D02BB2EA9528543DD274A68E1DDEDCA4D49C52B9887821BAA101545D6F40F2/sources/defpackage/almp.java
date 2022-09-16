package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: almp  reason: default package */
/* loaded from: classes.dex */
public final class almp implements bnul {
    public static final dcqe a = dcqe.c("almp");
    public static final int[] b = {0};
    public final float c;
    public final float d;
    public final ArrayList<amxg> e;
    public boolean f;
    public final Map<amxg, akvu<?>> g;
    public final akzh h;
    public final akzh i;
    @dzsi
    public Runnable j;
    public final almf k;
    public final almf l;
    public final Semaphore m;
    public final almo n;
    public final btrm o;
    public final bnsn p;
    public final float[] q;
    public final alms r;
    public final Executor s;
    public final anat t;

    public almp(akzh akzhVar, float f, btrm btrmVar, bnsn bnsnVar, alms almsVar, Executor executor, Executor executor2, anat anatVar, dbty<Boolean> dbtyVar) {
        akzh b2 = akzhVar.b();
        this.e = dchl.a();
        this.f = false;
        this.g = new HashMap();
        this.k = new almf();
        this.l = new almf();
        this.m = new Semaphore(1);
        this.q = new float[8];
        this.c = f;
        this.d = f * 15.0f;
        this.h = akzhVar;
        this.i = b2;
        this.o = btrmVar;
        this.p = bnsnVar;
        this.r = almsVar;
        Runnable runnable = new Runnable(this) { // from class: almd
            private final almp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c();
            }
        };
        this.j = runnable;
        this.s = executor2;
        this.t = anatVar;
        bnsnVar.k(runnable);
        this.n = new almo(executor, dbtyVar);
    }

    @dzsi
    public static amxp d(amxg amxgVar, aktn aktnVar, amxr amxrVar) {
        bnuk bnukVar;
        if (amxgVar.k && (bnukVar = amxgVar.n) != null && ((aktnVar != aktn.TAP || ((amxp) bnukVar).b) && (aktnVar != aktn.LONG_PRESS || ((amxp) bnukVar).c))) {
            if (amxgVar instanceof amxj) {
                akra akraVar = ((amxj) amxgVar).e;
            }
            amxp amxpVar = (amxp) bnukVar;
            if (amxpVar.d.d(amxrVar)) {
                return amxpVar;
            }
        }
        return null;
    }

    @Override // defpackage.bnul
    public final void a() {
        synchronized (this) {
            this.f = true;
        }
    }

    public final void b(akra akraVar) {
        this.n.a(new almn(aktn.TAP, akraVar, false));
    }

    public final synchronized void c() {
        akzh akzhVar = this.h;
        if (akzhVar != null) {
            this.l.a = akzhVar.p();
            this.l.b = this.h.y();
            this.l.c = this.h.z();
        }
    }
}

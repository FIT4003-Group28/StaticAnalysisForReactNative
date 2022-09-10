package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cui  reason: default package */
/* loaded from: classes5.dex */
public final class cui implements cua {
    public final bvrb a;
    public final dxio<akty> b;
    public final dxio<begg> c;
    public final cub d;
    public final cvv e;
    @dzsi
    public cup i;
    @dzsi
    public akrp j;
    public final dxio<qbt> k;
    private final cuq l;
    private final Executor m;
    public Map<aktd, djie> f = new HashMap();
    public int g = 0;
    public boolean h = false;
    private boolean n = false;

    public cui(dxio<akty> dxioVar, dxio<begg> dxioVar2, dxio<qbt> dxioVar3, final bvrb bvrbVar, cub cubVar, cuq cuqVar, cvv cvvVar, final akwu akwuVar) {
        this.b = dxioVar;
        this.c = dxioVar2;
        this.k = dxioVar3;
        this.a = bvrbVar;
        this.d = cubVar;
        this.l = cuqVar;
        this.e = cvvVar;
        akwuVar.getClass();
        new dzsj(akwuVar) { // from class: cuc
            private final akwu a;

            {
                this.a = akwuVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.d();
            }
        };
        this.m = dehx.b(new Executor(bvrbVar) { // from class: cud
            private final bvrb a;

            {
                this.a = bvrbVar;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.a.b(runnable, bvrj.BACKGROUND_THREADPOOL);
            }
        });
    }

    @Override // defpackage.cua
    public final void a(cvj cvjVar) {
        this.n = cvjVar.o;
        b();
        if (cvjVar.d.size() == 0) {
            return;
        }
        int i = this.g + 1;
        this.g = i;
        cuq cuqVar = this.l;
        btrm a = cuqVar.a.a();
        cuq.a(a, 1);
        dxio a2 = ((dxjh) cuqVar.b).a();
        cuq.a(a2, 2);
        cqat a3 = cuqVar.c.a();
        cuq.a(a3, 3);
        dxio a4 = ((dxjh) cuqVar.d).a();
        cuq.a(a4, 4);
        cjqy a5 = cuqVar.e.a();
        cuq.a(a5, 5);
        dehq a6 = cuqVar.f.a();
        cuq.a(a6, 6);
        cvv a7 = cuqVar.g.a();
        cuq.a(a7, 7);
        dxio a8 = ((dxjh) cuqVar.h).a();
        cuq.a(a8, 8);
        cuq.a(cvjVar, 9);
        cup cupVar = new cup(a, a2, a3, a4, a5, a6, a7, a8, cvjVar);
        this.i = cupVar;
        cupVar.a();
        if ((cvjVar.a & 256) != 0) {
            cuy cuyVar = cvjVar.k;
            if (cuyVar == null) {
                cuyVar = cuy.f;
            }
            akty a9 = this.b.a();
            int i2 = cuyVar.e;
            aksr aksrVar = new aksr();
            aksrVar.a(0);
            aksrVar.b(0);
            aksrVar.a = Integer.valueOf(cuyVar.b);
            aksrVar.a(cuyVar.c);
            aksrVar.b(cuyVar.d);
            String str = aksrVar.a == null ? " maxLabels" : "";
            if (aksrVar.b == null) {
                str = str.concat(" invariablePinSize");
            }
            if (aksrVar.c == null) {
                str = String.valueOf(str).concat(" invariableSoftMaxSize");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            a9.h(i2, new akss(aksrVar.a.intValue(), aksrVar.b.intValue(), aksrVar.c.intValue()));
        }
        this.n = cvjVar.o;
        cuf cufVar = new cuf(this, cvjVar, i);
        if (this.n) {
            this.m.execute(cufVar);
        } else {
            this.a.b(cufVar, bvrj.BACKGROUND_THREADPOOL);
        }
    }

    @Override // defpackage.cua
    public final void b() {
        cup cupVar = this.i;
        if (cupVar != null) {
            cupVar.b();
            this.i = null;
        }
        for (aktd aktdVar : this.f.keySet()) {
            aktdVar.j();
        }
        this.f.clear();
        cuh cuhVar = new cuh(this);
        if (this.n) {
            this.m.execute(cuhVar);
        } else {
            this.a.b(cuhVar, bvrj.BACKGROUND_THREADPOOL);
        }
    }

    @Override // defpackage.cua
    public final void c() {
        if (this.h) {
            for (aktd aktdVar : this.f.keySet()) {
                aktdVar.h();
            }
            this.h = false;
        }
        cup cupVar = this.i;
        if (cupVar != null) {
            cupVar.a();
        }
    }

    @Override // defpackage.cua
    public final void d() {
        if (!this.h) {
            for (aktd aktdVar : this.f.keySet()) {
                aktdVar.i();
            }
            this.h = true;
        }
        cup cupVar = this.i;
        if (cupVar != null) {
            cupVar.b();
        }
    }

    @Override // defpackage.cua
    public final void e(String str) {
        Iterator<Map.Entry<aktd, djie>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<aktd, djie> next = it.next();
            aktd key = next.getKey();
            dqmr dqmrVar = next.getValue().g;
            if (dqmrVar == null) {
                dqmrVar = dqmr.h;
            }
            if (dqmrVar.b.equals(str)) {
                key.j();
                it.remove();
            }
        }
    }
}

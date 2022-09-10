package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bqaf  reason: default package */
/* loaded from: classes4.dex */
public final class bqaf implements bnyn<dwjr, dwjt> {
    static final bqac a;
    static final bqac b;
    static final bqac c;
    private final bqad d;
    private final dxio<akpm> e;
    private final bnyo f;
    private final cqat g;
    private final bvrb h;
    @dzsi
    private alad j;
    @dzsi
    private bqae n;
    private long i = 0;
    @dzsi
    private alad k = null;
    private bqac l = b;
    private int m = 0;

    static {
        bqab c2 = bqac.c();
        c2.b(1.0d);
        c2.c(0.001f);
        a = c2.a();
        bqab c3 = bqac.c();
        c3.b(1000.0d);
        c3.c(0.1f);
        b = c3.a();
        bqab c4 = bqac.c();
        c4.b(100.0d);
        c4.c(0.01f);
        c = c4.a();
    }

    public bqaf(bqad bqadVar, dxio<akpm> dxioVar, bnyo bnyoVar, cqat cqatVar, bvrb bvrbVar) {
        this.d = bqadVar;
        this.e = dxioVar;
        this.f = bnyoVar;
        this.g = cqatVar;
        this.h = bvrbVar;
    }

    private final void f() {
        bqae bqaeVar = this.n;
        if (bqaeVar != null) {
            bqaeVar.b.a();
            this.n = null;
        }
    }

    @Override // defpackage.bnyn
    public final /* bridge */ /* synthetic */ void Rb(dssj dssjVar, @dzsi dssj dssjVar2) {
        dwjr dwjrVar = (dwjr) dssjVar;
        dwjt dwjtVar = (dwjt) dssjVar2;
        bqae bqaeVar = this.n;
        if (bqaeVar == null || !bqaeVar.a.equals(dwjrVar)) {
            return;
        }
        boolean z = true;
        if (dwjtVar != null) {
            this.m = 0;
            Iterator<dosd> it = dwjtVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                dosc b2 = dosc.b(it.next().b);
                if (b2 == null) {
                    b2 = dosc.TYPE_COPYRIGHTS;
                }
                if (b2 == dosc.TYPE_REPORT_MAPS_ISSUE) {
                    break;
                }
            }
            synchronized (this) {
                this.l = z ? b : c;
            }
            this.d.i(z);
        } else {
            int min = Math.min(this.m, 9);
            this.m++;
            this.h.a(new Runnable(this) { // from class: bqaa
                private final bqaf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            }, bvrj.UI_THREAD, (1 << min) * 1000);
        }
        this.n = null;
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        alad p = this.e.a().l().p();
        e();
        synchronized (this) {
            this.i = this.g.e();
            this.j = p;
            this.k = p;
        }
    }

    public final void c() {
        bvrj.UI_THREAD.c();
        f();
        synchronized (this) {
            this.i = 0L;
            this.j = null;
            this.k = null;
        }
    }

    public final void d() {
        long e = this.g.e();
        synchronized (this) {
            long j = this.i;
            if (j != 0) {
                boolean z = false;
                if (e - j > 300) {
                    alad p = this.e.a().l().p();
                    if (!a.d(this.j, p) && this.l.d(this.k, p)) {
                        this.k = p;
                        z = true;
                    }
                    this.j = p;
                    this.i = e;
                }
                if (!z) {
                    return;
                }
                this.h.b(new Runnable(this) { // from class: bpzz
                    private final bqaf a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.e();
                    }
                }, bvrj.UI_THREAD);
            }
        }
    }

    public final void e() {
        f();
        dwjq bZ = dwjr.c.bZ();
        dhjx aa = this.e.a().aa();
        if (aa != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjr dwjrVar = (dwjr) bZ.b;
            aa.getClass();
            dwjrVar.b = aa;
            dwjrVar.a |= 1;
        }
        dwjr bK = bZ.bK();
        this.n = new bqae(bK, this.f.b(bK, this));
    }
}

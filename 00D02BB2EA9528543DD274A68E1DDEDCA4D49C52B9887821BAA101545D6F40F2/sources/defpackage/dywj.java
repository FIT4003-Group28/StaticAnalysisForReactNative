package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dywj  reason: default package */
/* loaded from: classes6.dex */
public final class dywj extends dypa {
    public static final /* synthetic */ int x = 0;
    private int A;
    public final Object a;
    public List<dyya> b;
    public final eaiz c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final dywa g;
    public final dyxd h;
    public final dywr i;
    public boolean u;
    public final dyzo v;
    final /* synthetic */ dywk w;
    private final int y;
    private int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dywj(dywk dywkVar, int i, dyvi dyviVar, Object obj, dywa dywaVar, dyxd dyxdVar, dywr dywrVar, int i2) {
        super(i, dyviVar, dywkVar.s);
        this.w = dywkVar;
        this.c = new eaiz();
        this.d = false;
        this.e = false;
        this.f = false;
        this.u = true;
        this.a = obj;
        this.g = dywaVar;
        this.h = dyxdVar;
        this.i = dywrVar;
        this.z = i2;
        this.A = i2;
        this.y = i2;
        this.v = dyzl.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dyko
    public final void a() {
        super.a();
        dyvr dyvrVar = this.q;
        dyvrVar.c++;
        dyvrVar.b.a();
    }

    @Override // defpackage.dypa
    protected final void b(dyjb dyjbVar, boolean z, dyhw dyhwVar) {
        q(dyjbVar, false, dyhwVar);
    }

    @Override // defpackage.dysn
    public final void c(Throwable th) {
        q(dyjb.c(th), true, new dyhw());
    }

    @Override // defpackage.dykr
    public final void d(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    @Override // defpackage.dysn
    public final void e(int i) {
        int i2 = this.A - i;
        this.A = i2;
        int i3 = this.y;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.z += i4;
            this.A = i2 + i4;
            this.g.h(this.w.g, i4);
        }
    }

    public final void f(eaiz eaizVar, boolean z) {
        int i = this.z - ((int) eaizVar.b);
        this.z = i;
        if (i < 0) {
            this.g.d(this.w.g, dyxw.FLOW_CONTROL_ERROR);
            this.i.n(this.w.g, dyjb.l.g("Received data size exceeded our receiving window size"), dylt.PROCESSED, false, null, null);
            return;
        }
        super.o(new dywx(eaizVar), z);
    }

    @Override // defpackage.dykj, defpackage.dysn
    public final void g(boolean z) {
        if (!this.m) {
            this.i.n(this.w.g, null, dylt.PROCESSED, false, dyxw.CANCEL, null);
        } else {
            this.i.n(this.w.g, null, dylt.PROCESSED, false, null, null);
        }
        super.g(z);
    }

    public final void q(dyjb dyjbVar, boolean z, dyhw dyhwVar) {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.u) {
            dywr dywrVar = this.i;
            dywk dywkVar = this.w;
            dywrVar.v.remove(dywkVar);
            dywrVar.o(dywkVar);
            this.b = null;
            this.c.z();
            this.u = false;
            if (dyhwVar == null) {
                dyhwVar = new dyhw();
            }
            h(dyjbVar, true, dyhwVar);
            return;
        }
        this.i.n(this.w.g, dyjbVar, dylt.PROCESSED, z, dyxw.CANCEL, dyhwVar);
    }
}

package defpackage;

import defpackage.aktj;
import defpackage.dssj;
import java.util.List;
/* compiled from: PG */
/* renamed from: aljo  reason: default package */
/* loaded from: classes.dex */
public abstract class aljo<T extends aktj<T, S>, S extends dssj> implements aktj<T, S> {
    private static final dcqe c = dcqe.c("aljo");
    @dzsi
    private final akpq g;
    @dzsi
    private akvo<? super T> d = null;
    private boolean e = false;
    protected boolean a = false;
    protected boolean b = false;
    private final List<Runnable> f = dchl.a();

    public aljo(@dzsi akpq akpqVar) {
        this.g = akpqVar;
    }

    @Override // defpackage.aktj
    public synchronized void Pt(akvo<? super T> akvoVar) {
        this.d = akvoVar;
        this.e = false;
    }

    @Override // defpackage.aktj
    public synchronized void Pu() {
        this.d = null;
        this.e = true;
    }

    public final synchronized boolean m() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized boolean n() {
        boolean z;
        if (this.d == null) {
            if (!this.e) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void o(aktn aktnVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void p(aktn aktnVar, T t) {
        if (this.d != null) {
            aktn aktnVar2 = aktn.TAP;
            int ordinal = aktnVar.ordinal();
            if (ordinal == 0) {
                this.d.x(t);
            } else if (ordinal == 1) {
                this.d.b(t);
            } else {
                bvoo.h("Unknown PickType: %s", aktnVar);
            }
        }
    }

    public final void q(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                return;
            }
            r(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r(Runnable runnable) {
        boolean z;
        synchronized (this) {
            z = this.a;
            if (!z) {
                this.f.add(runnable);
            }
        }
        if (z) {
            runnable.run();
            return true;
        }
        return false;
    }

    public final void s() {
        dccx dccxVar = new dccx();
        synchronized (this) {
            this.a = true;
            if (this.b) {
                return;
            }
            dccxVar.i(this.f);
            this.f.clear();
            final dcdc f = dccxVar.f();
            Runnable runnable = new Runnable(f) { // from class: aljn
                private final dcdc a;

                {
                    this.a = f;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dcdc dcdcVar = this.a;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        ((Runnable) dcdcVar.get(i)).run();
                    }
                }
            };
            if (this.g != null) {
                t(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(Runnable runnable) {
        dbsk.s(this.g);
        if (bnuq.b()) {
            runnable.run();
            return;
        }
        this.g.e(runnable);
        this.g.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void u() {
        this.f.clear();
    }
}

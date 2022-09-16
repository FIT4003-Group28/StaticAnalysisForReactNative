package defpackage;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: albf  reason: default package */
/* loaded from: classes2.dex */
public final class albf implements alax {
    private static final dcqe e = dcqe.c("albf");
    public int a;
    public final albd c;
    private final aktf g;
    private final dmni h;
    private final SparseArray<akvx> f = new SparseArray<>();
    public final SparseArray<albc> b = new SparseArray<>();
    public boolean d = false;
    private boolean i = false;
    @dzsi
    private Runnable j = null;

    public albf(dmni dmniVar, albd albdVar) {
        int i;
        aktf d;
        this.c = albdVar;
        this.h = dmniVar;
        akvz aE = albdVar.a.aj().aE();
        for (dmqz dmqzVar : dmniVar.c) {
            int i2 = dmqzVar.b;
            if (this.f.get(i2) == null) {
                SparseArray<akvx> sparseArray = this.f;
                StringBuilder sb = new StringBuilder(20);
                sb.append("DW_EVENT_");
                sb.append(i2);
                sparseArray.put(i2, aE.h(sb.toString(), dmqzVar));
            }
        }
        if (!dmniVar.c.isEmpty()) {
            i = dmniVar.c.get(0).b;
            this.a = i;
        } else {
            dmqz dmqzVar2 = dmqz.c;
            i = dmqzVar2.b;
            this.f.put(i, aE.h("DW_EMPTY_EVENT", dmqzVar2));
            this.a = i;
        }
        akvx akvxVar = this.f.get(i);
        dmqi dmqiVar = dmniVar.d;
        dmqiVar = dmqiVar == null ? dmqi.b : dmqiVar;
        aktz aB = albdVar.a.aj().aB();
        if (albdVar.d - 1 != 0) {
            d = aB.e(dmqiVar, albdVar.b);
        } else {
            d = aB.d(dmqiVar, akvxVar, albdVar.b);
        }
        alaw alawVar = (alaw) albdVar.c;
        if (alawVar.a) {
            d.Pu();
        } else if (alawVar.b.a()) {
            d.Pt(((alaw) albdVar.c).b.b());
        }
        this.g = d;
        SparseArray<albc> sparseArray2 = this.b;
        int i3 = this.a;
        dmpp dmppVar = dmniVar.e;
        sparseArray2.put(i3, albdVar.b((dmppVar == null ? dmpp.b : dmppVar).a, akvxVar));
    }

    @Override // defpackage.alax
    public final synchronized void a() {
        if (this.i) {
            bvoo.h("Attempted to call show on a destroyed ClientVectorMapRenderer.", new Object[0]);
        } else if (this.d) {
        } else {
            this.d = true;
            albd albdVar = this.c;
            albdVar.a.aj().aB().g(this.g);
            this.b.get(this.a).a(this.c.a);
            bnsn j = this.c.a.j();
            Runnable runnable = new Runnable(this) { // from class: alba
                private final albf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    albf albfVar = this.a;
                    synchronized (albfVar) {
                        if (albfVar.d) {
                            albfVar.b.get(albfVar.a).a(albfVar.c.a);
                        }
                    }
                }
            };
            this.j = runnable;
            j.k(runnable);
        }
    }

    @Override // defpackage.alax
    public final synchronized void b() {
        if (this.i) {
            bvoo.h("Attempted to call hide on a destroyed ClientVectorMapRenderer.", new Object[0]);
        } else if (!this.d) {
        } else {
            this.d = false;
            albd albdVar = this.c;
            albdVar.a.aj().aB().i(this.g);
            this.c.a(this.b.get(this.a));
            bnsn j = this.c.a.j();
            Runnable runnable = this.j;
            if (runnable != null) {
                j.l(runnable);
            }
            this.j = null;
        }
    }

    @Override // defpackage.alax
    public final synchronized void c() {
        if (this.i) {
            bvoo.h("Attempted to call destroy on this ClientVectorMapRenderer multiple times.", new Object[0]);
            return;
        }
        if (this.d) {
            b();
        }
        albd albdVar = this.c;
        albdVar.a.aj().aB().b(this.g);
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).c(this.c.a);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.c.a.aj().aE().i(this.f.valueAt(i2));
        }
        this.i = true;
    }

    @Override // defpackage.alax
    public final synchronized boolean d() {
        return this.d;
    }

    @Override // defpackage.alax
    public final void e(int i) {
        boolean z = true;
        if (this.c.d != 1) {
            z = false;
        }
        dbsk.l(z);
        if (this.a == i) {
            return;
        }
        akvx akvxVar = this.f.get(i);
        this.g.a(akvxVar);
        this.c.a(this.b.get(this.a));
        albc albcVar = this.b.get(i);
        if (albcVar == null) {
            albd albdVar = this.c;
            dmpp dmppVar = this.h.e;
            if (dmppVar == null) {
                dmppVar = dmpp.b;
            }
            this.b.put(i, albdVar.b(dmppVar.a, akvxVar));
        } else {
            albcVar.a(this.c.a);
        }
        this.a = i;
    }

    @Override // defpackage.alax
    public final boolean f(int i) {
        return this.f.get(i) != null;
    }
}

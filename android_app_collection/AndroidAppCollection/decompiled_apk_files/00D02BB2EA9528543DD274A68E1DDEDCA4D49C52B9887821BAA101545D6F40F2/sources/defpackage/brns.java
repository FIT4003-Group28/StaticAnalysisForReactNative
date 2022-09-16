package defpackage;

import android.util.SparseArray;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: brns  reason: default package */
/* loaded from: classes4.dex */
public final class brns {
    public final akox a;
    public final dehq b;
    public final btvo c;
    public final brny d;
    public final brpk e;
    public final brlk f;
    public final int g;
    @dzsi
    public volatile brlu i;
    private final SparseArray<dehu> j = new SparseArray<>();
    public final AtomicBoolean h = new AtomicBoolean(false);

    public brns(akox akoxVar, dehq dehqVar, btvo btvoVar, brny brnyVar, brpk brpkVar, brlk brlkVar) {
        this.a = akoxVar;
        this.b = dehqVar;
        this.c = btvoVar;
        this.d = brnyVar;
        this.e = brpkVar;
        this.f = brlkVar;
        this.g = btvoVar.getExploreMapParameters().b();
        new crzp(this) { // from class: brmu
            private final brns a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(final crzm crzmVar) {
                final brns brnsVar = this.a;
                brnsVar.c(1, new Runnable(brnsVar, crzmVar) { // from class: brnn
                    private final brns a;
                    private final crzm b;

                    {
                        this.a = brnsVar;
                        this.b = crzmVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a((aktu) this.b.l());
                    }
                }, 50L, TimeUnit.MILLISECONDS);
            }
        };
        new crzp(this) { // from class: brnf
            private final brns a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(final crzm crzmVar) {
                final brns brnsVar = this.a;
                brnsVar.c(2, new Runnable(brnsVar, crzmVar) { // from class: brng
                    private final brns a;
                    private final crzm b;

                    {
                        this.a = brnsVar;
                        this.b = crzmVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        brns brnsVar2 = this.a;
                        Boolean bool = (Boolean) this.b.l();
                        dbsk.s(bool);
                        brnsVar2.b(bool.booleanValue());
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
        };
        new crzp(this) { // from class: brnk
            private final brns a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                brns brnsVar = this.a;
                brob brobVar = (brob) crzmVar.l();
                if (brobVar == null) {
                    return;
                }
                int b = brobVar.b();
                int i = b - 1;
                if (b == 0) {
                    throw null;
                }
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        brnsVar.c(3, new Runnable(brnsVar) { // from class: brmv
                            private final brns a;

                            {
                                this.a = brnsVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                brns brnsVar2 = this.a;
                                dcdc<broa> c = brnsVar2.d.c();
                                dcdc z = dcbg.b(c).o(brmx.a).s(brmy.a).z();
                                c.size();
                                z.size();
                                brpk brpkVar2 = brnsVar2.e;
                                brln d = brnsVar2.f.d();
                                dbsk.s(d);
                                brpkVar2.a(z, d, brnsVar2.f.b(), false, -1, brnsVar2.i == null);
                            }
                        }, brnsVar.g, TimeUnit.MILLISECONDS);
                        return;
                    } else if (i != 4 && i != 5) {
                        return;
                    }
                }
                brnsVar.c(4, new Runnable(brnsVar) { // from class: brmw
                    private final brns a;

                    {
                        this.a = brnsVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        brns brnsVar2 = this.a;
                        brlu brluVar = brnsVar2.i;
                        if (brluVar == null) {
                            return;
                        }
                        dcdc z = dcbg.b(dcbg.b(brnsVar2.d.c()).A(dcln.a.g(brmz.a))).s(brna.a).o(brnb.a).s(brnc.a).z();
                        brluVar.Z();
                        brluVar.K(z);
                        brluVar.ak(false);
                        brluVar.ai(false);
                        brluVar.E();
                        brnsVar2.f.b().d(brluVar);
                    }
                }, 30L, TimeUnit.MILLISECONDS);
            }
        };
        new crzp(this) { // from class: brnl
            private final brns a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                brns brnsVar = this.a;
                brlu brluVar = (brlu) crzmVar.l();
                if (brluVar == null) {
                    return;
                }
                if (brnsVar.i == null) {
                    brnsVar.i = brluVar;
                }
                for (ilo iloVar : brluVar.c()) {
                    broa b = brnsVar.d.b(iloVar.ai());
                    if (b != null) {
                        brny brnyVar2 = brnsVar.d;
                        brnz f = b.f();
                        f.b(iloVar);
                        brnyVar2.a(f.a());
                    }
                }
            }
        };
        new crzp(this) { // from class: brnm
            private final brns a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                brns brnsVar = this.a;
                amml ammlVar = (amml) crzmVar.l();
                if (ammlVar == null) {
                    return;
                }
                brnsVar.d.e(true);
                ammlVar.x.a.e(new crzp(brnsVar) { // from class: brnd
                    private final brns a;

                    {
                        this.a = brnsVar;
                    }

                    @Override // defpackage.crzp
                    public final void On(final crzm crzmVar2) {
                        final brns brnsVar2 = this.a;
                        brnsVar2.c(2, new Runnable(brnsVar2, crzmVar2) { // from class: brne
                            private final brns a;
                            private final crzm b;

                            {
                                this.a = brnsVar2;
                                this.b = crzmVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                brns brnsVar3 = this.a;
                                Boolean bool = (Boolean) this.b.l();
                                dbsk.s(bool);
                                brnsVar3.b(bool.booleanValue());
                            }
                        }, 20L, TimeUnit.MILLISECONDS);
                    }
                }, brnsVar.b);
                brnsVar.c(5, new Runnable(brnsVar) { // from class: brnj
                    private final brns a;

                    {
                        this.a = brnsVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h.compareAndSet(true, false);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
            }
        };
    }

    public final void a(@dzsi aktu aktuVar) {
        if (this.h.get()) {
            return;
        }
        Boolean l = this.a.aj().ae().l();
        dbsk.s(l);
        if (!l.booleanValue()) {
            return;
        }
        if (aktuVar == null) {
            this.d.d();
            return;
        }
        dcdc<broa> z = dcbg.e(aktuVar.b, aktuVar.c, aktuVar.d).s(brno.a).o(brnp.a).s(brnq.a).o(new dbsl(this) { // from class: brnr
            private final brns a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.c.getExploreMapParameters().d() == 3 || ((broa) obj).e();
            }
        }).z();
        z.size();
        brny brnyVar = this.d;
        brnyVar.a.writeLock().lock();
        try {
            brnyVar.d();
            for (broa broaVar : z) {
                akqi a = broaVar.a();
                brnyVar.a.writeLock().lock();
                boolean add = brnyVar.c.add(a);
                brnyVar.a.writeLock().unlock();
                if (add) {
                    brnyVar.f();
                }
                brnz f = broaVar.f();
                broa b = brnyVar.b(a);
                if (b != null) {
                    ilo d = b.d();
                    if (d != null) {
                        f.b(d);
                    }
                    Float b2 = b.b();
                    if (b2 != null) {
                        f.c(b2);
                    }
                }
                brnyVar.a(f.a());
            }
            brnyVar.e(false);
            brnyVar.a.writeLock().unlock();
            brnyVar.f();
            if (!this.a.U()) {
                return;
            }
            c(5, new Runnable(this) { // from class: brni
                private final brns a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h.compareAndSet(false, true);
                }
            }, 10L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            brnyVar.a.writeLock().unlock();
            throw th;
        }
    }

    public final void b(boolean z) {
        if (!z) {
            for (int i = 0; i < this.j.size(); i++) {
                SparseArray<dehu> sparseArray = this.j;
                dehu dehuVar = sparseArray.get(sparseArray.keyAt(i));
                if (dehuVar != null) {
                    dehuVar.cancel(false);
                }
            }
            return;
        }
        c(1, new Runnable(this) { // from class: brnh
            private final brns a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                brns brnsVar = this.a;
                brnsVar.a(brnsVar.a.T().l());
            }
        }, 50L, TimeUnit.MILLISECONDS);
    }

    public final void c(int i, Runnable runnable, long j, TimeUnit timeUnit) {
        int i2 = i - 1;
        dehu dehuVar = this.j.get(i2);
        if (dehuVar != null) {
            dehuVar.cancel(true);
        }
        this.j.put(i2, this.b.d(runnable, j, timeUnit));
    }
}

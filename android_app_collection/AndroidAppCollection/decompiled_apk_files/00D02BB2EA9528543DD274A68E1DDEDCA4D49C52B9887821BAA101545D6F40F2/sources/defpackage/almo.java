package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: almo  reason: default package */
/* loaded from: classes.dex */
public final class almo implements Runnable {
    public final Executor a;
    @dzsi
    public almp b;
    private final ArrayBlockingQueue<almn> c = new ArrayBlockingQueue<>(10);
    private volatile boolean d;
    private volatile boolean e;
    private final dbty<Boolean> f;

    public almo(Executor executor, dbty<Boolean> dbtyVar) {
        this.a = executor;
        this.f = dbtyVar;
    }

    private static amxr b(akzh akzhVar, float f, akra akraVar) {
        if (f == 0.0f) {
            return new amxs(akraVar, akzhVar);
        }
        return new amxr(akraVar, f, akzhVar);
    }

    public final void a(almn almnVar) {
        if (!this.c.offer(almnVar)) {
            dcqe dcqeVar = almp.a;
            bvoo.h("Failed to add pending request. Queue is full.", new Object[0]);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        int[] iArr;
        Runnable runnable;
        final Runnable runnable2;
        Iterator it2;
        akvu<?> akvuVar;
        akvp alrgVar;
        while (!this.d) {
            try {
                ArrayList arrayList = new ArrayList(10);
                boolean z = true;
                this.e = true;
                arrayList.add(this.c.take());
                this.c.drainTo(arrayList);
                this.e = false;
                final almp almpVar = this.b;
                dbsk.s(almpVar);
                almpVar.m.acquire();
                synchronized (almpVar) {
                    almf almfVar = almpVar.k;
                    almf almfVar2 = almpVar.l;
                    almfVar.a = almfVar2.a;
                    almfVar.b = almfVar2.b;
                    almfVar.c = almfVar2.c;
                }
                almpVar.i.o(almpVar.k.a);
                akzh akzhVar = almpVar.i;
                almf almfVar3 = almpVar.k;
                akzhVar.l(almfVar3.b, almfVar3.c);
                synchronized (almpVar) {
                    if (almpVar.f) {
                        Iterator<amxg> it3 = almpVar.e.iterator();
                        while (it3.hasNext()) {
                            it3.next().p();
                        }
                        Collections.sort(almpVar.e, alme.a);
                        almpVar.f = false;
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    almn almnVar = (almn) it4.next();
                    if (almnVar.c) {
                        this.d = z;
                        break;
                    }
                    if (this.f.a().booleanValue()) {
                        final aktn aktnVar = almnVar.a;
                        final akra akraVar = almnVar.b;
                        if (aktnVar == aktn.TAP) {
                            iArr = almpVar.r.c;
                            if (iArr.length != 0) {
                            }
                        } else {
                            iArr = almp.b;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int i = -1;
                        amxr b = b(almpVar.i, almpVar.c * iArr[iArr.length - 1], akraVar);
                        ArrayList<amxg> arrayList3 = almpVar.e;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            amxg amxgVar = arrayList3.get(i2);
                            if (almp.d(amxgVar, aktnVar, b) != null && (akvuVar = almpVar.g.get(amxgVar)) != null) {
                                int length = aktnVar == aktn.TAP ? iArr.length + i : -1;
                                if (amxgVar instanceof amyh) {
                                    amyh amyhVar = (amyh) amxgVar;
                                    boolean l = amyhVar.l();
                                    akra m = amyhVar.m();
                                    if (!(akvuVar instanceof alsm)) {
                                        it2 = it4;
                                        bvoo.f(new IllegalStateException(String.format("Found a %s for a %s that doesn't implement %s (%s).", amyh.class.getName(), akvu.class.getName(), alsm.class.getName(), akvuVar.getClass().getName())));
                                    } else {
                                        it2 = it4;
                                    }
                                    alrgVar = new alnf((aktp) akvuVar, length, amxgVar, l, m);
                                } else {
                                    it2 = it4;
                                    alrgVar = new alrg(akvuVar, length, amxgVar);
                                }
                                arrayList2.add(alrgVar);
                                i2++;
                                it4 = it2;
                                i = -1;
                            }
                            it2 = it4;
                            i2++;
                            it4 = it2;
                            i = -1;
                        }
                        it = it4;
                        for (int length2 = iArr.length - 2; length2 >= 0; length2--) {
                            amxr b2 = b(almpVar.i, almpVar.c * iArr[length2], akraVar);
                            int size2 = arrayList2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                alrg alrgVar2 = (alrg) ((akvp) arrayList2.get(i3));
                                if (alrgVar2.d == length2 + 1 && almp.d(alrgVar2.e, aktnVar, b2) != null) {
                                    alrgVar2.d = length2;
                                }
                            }
                        }
                        if (aktnVar == aktn.TAP) {
                            Collections.sort(arrayList2, almm.a);
                        }
                        final akvp a = arrayList2.isEmpty() ? null : almpVar.r.a.a(arrayList2);
                        final alms almsVar = almpVar.r;
                        if (a != null) {
                            final akvu<?> a2 = a.a();
                            if ((a2 instanceof aljo) && !((aljo) a2).m()) {
                                runnable2 = new Runnable(a2, aktnVar) { // from class: almi
                                    private final akvu a;
                                    private final aktn b;

                                    {
                                        this.a = a2;
                                        this.b = aktnVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((aljo) this.a).o(this.b);
                                    }
                                };
                            } else {
                                if (aktnVar == aktn.TAP) {
                                    runnable = new Runnable(almsVar, a, akraVar) { // from class: almj
                                        private final alms a;
                                        private final akvp b;
                                        private final akra c;

                                        {
                                            this.a = almsVar;
                                            this.b = a;
                                            this.c = akraVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            alms almsVar2 = this.a;
                                            almsVar2.b.b(this.b, this.c);
                                        }
                                    };
                                } else {
                                    runnable = new Runnable(almsVar, a, akraVar) { // from class: almk
                                        private final alms a;
                                        private final akvp b;
                                        private final akra c;

                                        {
                                            this.a = almsVar;
                                            this.b = a;
                                            this.c = akraVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            alms almsVar2 = this.a;
                                            almsVar2.b.c(this.b, this.c);
                                        }
                                    };
                                }
                                runnable2 = runnable;
                            }
                            almpVar.s.execute(new Runnable(a, a2, almpVar, aktnVar, runnable2) { // from class: alml
                                private final akvp a;
                                private final akvu b;
                                private final almp c;
                                private final aktn d;
                                private final Runnable e;

                                {
                                    this.a = a;
                                    this.b = a2;
                                    this.c = almpVar;
                                    this.d = aktnVar;
                                    this.e = runnable2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    dbsg dbsgVar;
                                    akvp akvpVar = this.a;
                                    akvu akvuVar2 = this.b;
                                    almp almpVar2 = this.c;
                                    aktn aktnVar2 = this.d;
                                    Runnable runnable3 = this.e;
                                    if (akvpVar instanceof alnf) {
                                        alsm alsmVar = (alsm) akvuVar2;
                                        anat anatVar = almpVar2.t;
                                        boolean z2 = ((alnf) akvpVar).a;
                                        try {
                                            dbsgVar = dbsg.i(anatVar.d(alsmVar.k(), alsmVar.G().f(), aktnVar2, z2));
                                        } catch (anas unused) {
                                            dbsgVar = dbpy.a;
                                        }
                                        if (dbsgVar.a()) {
                                            alsmVar.I((cjqm) dbsgVar.b());
                                        }
                                    }
                                    runnable3.run();
                                }
                            });
                        } else if (aktnVar != aktn.TAP) {
                            almpVar.s.execute(new Runnable(almsVar, akraVar) { // from class: almh
                                private final alms a;
                                private final akra b;

                                {
                                    this.a = almsVar;
                                    this.b = akraVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    alms almsVar2 = this.a;
                                    almsVar2.b.e(this.b);
                                }
                            });
                        } else {
                            almpVar.s.execute(new Runnable(almsVar, akraVar) { // from class: almg
                                private final alms a;
                                private final akra b;

                                {
                                    this.a = almsVar;
                                    this.b = akraVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    alms almsVar2 = this.a;
                                    almsVar2.b.d(this.b);
                                }
                            });
                        }
                    } else {
                        it = it4;
                        amxr b3 = b(almpVar.i, almnVar.a == aktn.TAP ? almpVar.d : 0.0f, almnVar.b);
                        aktn aktnVar2 = almnVar.a;
                        akra akraVar2 = almnVar.b;
                        ArrayList<amxg> arrayList4 = almpVar.e;
                        int size3 = arrayList4.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size3) {
                                amxp d = almp.d(arrayList4.get(i4), aktnVar2, b3);
                                i4++;
                                if (d != null) {
                                    if (aktnVar2 == aktn.TAP) {
                                        if (d.e != null && d.f != null) {
                                            d.a(akraVar2);
                                        }
                                    } else if (d.e != null && d.f != null) {
                                        d.a(akraVar2);
                                    }
                                }
                            } else if (aktnVar2 == aktn.TAP) {
                                alhv.a().f(new alhr(akraVar2));
                            } else {
                                almpVar.o.b(new alhk(akraVar2));
                            }
                        }
                    }
                    it4 = it;
                    z = true;
                }
                almpVar.m.release();
            } catch (InterruptedException unused) {
            }
        }
    }
}

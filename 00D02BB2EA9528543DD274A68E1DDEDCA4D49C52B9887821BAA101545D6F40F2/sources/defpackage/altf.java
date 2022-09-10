package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: altf  reason: default package */
/* loaded from: classes.dex */
public final class altf implements alvb {
    public volatile boolean a;
    @dzsi
    public altc b;
    private final alvb e;
    private final alyx g;
    public final Object c = new Object();
    private final akrp f = new akrp(new akra(), new akra());
    public final alte d = new alte();

    public altf(alvb alvbVar, alyx alyxVar) {
        this.e = alvbVar;
        this.g = alyxVar;
    }

    private static alyh e(alyh alyhVar, altu altuVar) {
        return alyhVar.l(altuVar.d);
    }

    @Override // defpackage.alvb
    @dzsi
    public final alyh a(alyh alyhVar, akra akraVar) {
        return this.e.a(alyhVar, akraVar);
    }

    @Override // defpackage.alvb
    public final List<alyh> b(alyh alyhVar, akra akraVar) {
        return this.e.b(alyhVar, akraVar);
    }

    @Override // defpackage.alvb
    public final float c(akra akraVar) {
        return this.e.c(akraVar);
    }

    @Override // defpackage.alvb
    public final long d(akzh akzhVar, List<alyh> list) {
        long j;
        synchronized (this.d) {
            synchronized (this.c) {
                if (this.b != null) {
                    long j2 = this.d.f;
                    if (akzhVar.p().k >= 14.0f) {
                        alte alteVar = this.d;
                        alteVar.f = this.e.d(akzhVar, alteVar.a);
                    } else {
                        alte alteVar2 = this.d;
                        alteVar2.f = -1L;
                        alteVar2.a.clear();
                    }
                    if (this.a || this.d.f != j2) {
                        this.a = false;
                        this.d.b.clear();
                        this.d.c.clear();
                        this.d.d.clear();
                        int e = this.g.b(akzhVar.g(), akry.BASE).e();
                        synchronized (this.c) {
                            altc altcVar = this.b;
                            if (altcVar != null) {
                                for (int i = 0; i < this.d.a.size(); i++) {
                                    alyh alyhVar = this.d.a.get(i);
                                    alyhVar.i(this.f);
                                    for (altt alttVar : altcVar.c) {
                                        if (alttVar.b.k(this.f)) {
                                            alts altsVar = alttVar.a;
                                            altu a = altcVar.a(altsVar);
                                            if (a != null) {
                                                alyh e2 = e(alyhVar, a);
                                                if (e2.a > e || altsVar == null || !a.equals(altsVar.c())) {
                                                    this.d.b.add(e2);
                                                } else {
                                                    this.d.c.add(e2);
                                                }
                                            }
                                            if (altsVar != null && altsVar.equals(altcVar.a)) {
                                                dcpe<altu> listIterator = altsVar.b.listIterator();
                                                while (listIterator.hasNext()) {
                                                    altu next = listIterator.next();
                                                    if (alyhVar.a > e || !next.equals(altsVar.c())) {
                                                        if (!next.equals(a)) {
                                                            this.d.d.add(e(alyhVar, next));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                this.d.e++;
                            }
                        }
                    }
                }
            }
            list.clear();
            list.addAll(this.d.b);
            j = this.d.e;
        }
        return j;
    }
}

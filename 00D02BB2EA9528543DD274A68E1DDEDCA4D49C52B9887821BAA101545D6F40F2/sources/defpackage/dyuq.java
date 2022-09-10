package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyuq  reason: default package */
/* loaded from: classes6.dex */
public final class dyuq implements dylu {
    final dyur a;
    final /* synthetic */ dyut b;

    public dyuq(dyut dyutVar, dyur dyurVar) {
        this.b = dyutVar;
        this.a = dyurVar;
    }

    @dzsi
    private static final Integer a(dyhw dyhwVar) {
        String str = (String) dyhwVar.h(dyut.f);
        if (str != null) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        return null;
    }

    @Override // defpackage.dylu
    public final void b(dyhw dyhwVar) {
        int i;
        int i2;
        this.b.s(this.a);
        if (this.b.t.f == this.a) {
            this.b.w.b(dyhwVar);
            dyus dyusVar = this.b.r;
            if (dyusVar == null) {
                return;
            }
            do {
                i = dyusVar.d.get();
                i2 = dyusVar.a;
                if (i == i2) {
                    return;
                }
            } while (!dyusVar.d.compareAndSet(i, Math.min(dyusVar.c + i, i2)));
        }
    }

    @Override // defpackage.dyvl
    public final void c(dyvk dyvkVar) {
        dyum dyumVar = this.b.t;
        dbsk.m(dyumVar.f != null, "Headers should be received prior to messages.");
        if (dyumVar.f != this.a) {
            return;
        }
        this.b.w.c(dyvkVar);
    }

    @Override // defpackage.dylu
    public final void d(dyjb dyjbVar, dyhw dyhwVar) {
        e(dyjbVar, dylt.PROCESSED, dyhwVar);
    }

    @Override // defpackage.dylu
    public final void e(dyjb dyjbVar, dylt dyltVar, dyhw dyhwVar) {
        boolean z;
        dyul dyulVar;
        dyui dyuiVar;
        synchronized (this.b.n) {
            dyut dyutVar = this.b;
            dyum dyumVar = dyutVar.t;
            dyur dyurVar = this.a;
            z = true;
            dyurVar.b = true;
            if (dyumVar.c.contains(dyurVar)) {
                ArrayList arrayList = new ArrayList(dyumVar.c);
                arrayList.remove(dyurVar);
                dyumVar = new dyum(dyumVar.b, Collections.unmodifiableCollection(arrayList), dyumVar.d, dyumVar.f, dyumVar.g, dyumVar.a, dyumVar.h, dyumVar.e);
            }
            dyutVar.t = dyumVar;
            this.b.s.a(dyjbVar.p);
        }
        dyur dyurVar2 = this.a;
        if (dyurVar2.c) {
            this.b.s(dyurVar2);
            if (this.b.t.f != this.a) {
                return;
            }
            this.b.w.d(dyjbVar, dyhwVar);
            return;
        }
        if (this.b.t.f == null) {
            if (dyltVar == dylt.REFUSED && this.b.u.compareAndSet(false, true)) {
                dyur t = this.b.t(this.a.d);
                dyut dyutVar2 = this.b;
                if (dyutVar2.m) {
                    synchronized (dyutVar2.n) {
                        dyut dyutVar3 = this.b;
                        dyum dyumVar2 = dyutVar3.t;
                        dyur dyurVar3 = this.a;
                        ArrayList arrayList2 = new ArrayList(dyumVar2.d);
                        arrayList2.remove(dyurVar3);
                        arrayList2.add(t);
                        dyutVar3.t = new dyum(dyumVar2.b, dyumVar2.c, Collections.unmodifiableCollection(arrayList2), dyumVar2.f, dyumVar2.g, dyumVar2.a, dyumVar2.h, dyumVar2.e);
                        dyut dyutVar4 = this.b;
                        if (dyutVar4.w(dyutVar4.t) || this.b.t.d.size() != 1) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.b.s(t);
                    }
                } else {
                    dyuu dyuuVar = dyutVar2.k;
                    if (dyuuVar == null || dyuuVar.a == 1) {
                        dyutVar2.s(t);
                    }
                }
                this.b.i.execute(new dyun(this, t));
                return;
            } else if (dyltVar == dylt.DROPPED) {
                dyut dyutVar5 = this.b;
                if (dyutVar5.m) {
                    dyutVar5.x();
                }
            } else {
                this.b.u.set(true);
                dyut dyutVar6 = this.b;
                if (dyutVar6.m) {
                    Integer a = a(dyhwVar);
                    boolean z2 = !this.b.l.c.contains(dyjbVar.p);
                    boolean z3 = (this.b.r == null || (z2 && (a == null || a.intValue() >= 0))) ? false : !this.b.r.b();
                    if (z2 || z3) {
                        z = false;
                    }
                    if (z) {
                        dyut dyutVar7 = this.b;
                        if (a != null) {
                            if (a.intValue() < 0) {
                                dyutVar7.x();
                            } else {
                                synchronized (dyutVar7.n) {
                                    dyui dyuiVar2 = dyutVar7.y;
                                    if (dyuiVar2 != null) {
                                        Future<?> b = dyuiVar2.b();
                                        dyui dyuiVar3 = new dyui(dyutVar7.n);
                                        dyutVar7.y = dyuiVar3;
                                        if (b != null) {
                                            b.cancel(false);
                                        }
                                        dyuiVar3.a(dyutVar7.j.schedule(new dyuk(dyutVar7, dyuiVar3), a.intValue(), TimeUnit.MILLISECONDS));
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this.b.n) {
                        dyut dyutVar8 = this.b;
                        dyum dyumVar3 = dyutVar8.t;
                        dyur dyurVar4 = this.a;
                        ArrayList arrayList3 = new ArrayList(dyumVar3.d);
                        arrayList3.remove(dyurVar4);
                        dyutVar8.t = new dyum(dyumVar3.b, dyumVar3.c, Collections.unmodifiableCollection(arrayList3), dyumVar3.f, dyumVar3.g, dyumVar3.a, dyumVar3.h, dyumVar3.e);
                        if (z) {
                            dyut dyutVar9 = this.b;
                            if (dyutVar9.w(dyutVar9.t) || !this.b.t.d.isEmpty()) {
                                return;
                            }
                        }
                    }
                } else {
                    dyuu dyuuVar2 = dyutVar6.k;
                    long j = 0;
                    if (dyuuVar2 == null) {
                        dyulVar = new dyul(false, 0L);
                    } else {
                        boolean contains = dyuuVar2.e.contains(dyjbVar.p);
                        Integer a2 = a(dyhwVar);
                        boolean z4 = (this.b.r == null || (!contains && (a2 == null || a2.intValue() >= 0))) ? false : !this.b.r.b();
                        dyut dyutVar10 = this.b;
                        if (dyutVar10.k.a > this.a.d + 1 && !z4) {
                            if (a2 == null) {
                                if (contains) {
                                    double d = dyutVar10.z;
                                    double nextDouble = dyut.A.nextDouble();
                                    Double.isNaN(d);
                                    j = (long) (d * nextDouble);
                                    dyut dyutVar11 = this.b;
                                    long j2 = dyutVar11.z;
                                    dyuu dyuuVar3 = dyutVar11.k;
                                    double d2 = j2;
                                    double d3 = dyuuVar3.d;
                                    Double.isNaN(d2);
                                    dyutVar11.z = Math.min((long) (d2 * d3), dyuuVar3.c);
                                    dyulVar = new dyul(z, j);
                                }
                            } else if (a2.intValue() >= 0) {
                                j = TimeUnit.MILLISECONDS.toNanos(a2.intValue());
                                dyut dyutVar12 = this.b;
                                dyutVar12.z = dyutVar12.k.b;
                                dyulVar = new dyul(z, j);
                            }
                        }
                        z = false;
                        dyulVar = new dyul(z, j);
                    }
                    if (dyulVar.a) {
                        synchronized (this.b.n) {
                            dyut dyutVar13 = this.b;
                            dyuiVar = new dyui(dyutVar13.n);
                            dyutVar13.x = dyuiVar;
                        }
                        dyuiVar.a(this.b.j.schedule(new dyup(this), dyulVar.b, TimeUnit.NANOSECONDS));
                        return;
                    }
                }
            }
        }
        this.b.s(this.a);
        if (this.b.t.f != this.a) {
            return;
        }
        this.b.w.d(dyjbVar, dyhwVar);
    }

    @Override // defpackage.dyvl
    public final void f() {
        this.b.w.f();
    }
}

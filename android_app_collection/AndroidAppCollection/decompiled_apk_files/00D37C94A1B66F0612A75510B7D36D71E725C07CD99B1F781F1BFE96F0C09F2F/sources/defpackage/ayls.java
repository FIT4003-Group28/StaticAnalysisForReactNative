package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayls  reason: default package */
/* loaded from: classes2.dex */
public final class ayls implements ayeq {
    final aylt a;
    final /* synthetic */ aylv b;

    public ayls(aylv aylvVar, aylt ayltVar) {
        this.b = aylvVar;
        this.a = ayltVar;
    }

    private static final Integer b(ayat ayatVar) {
        String str = (String) ayatVar.b(aylv.b);
        if (str != null) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        return null;
    }

    @Override // defpackage.ayeq
    public final void a(Status status, ayep ayepVar, ayat ayatVar) {
        boolean z;
        aylh aylhVar;
        long nanos;
        synchronized (this.b.l) {
            aylv aylvVar = this.b;
            ayll ayllVar = aylvVar.r;
            aylt ayltVar = this.a;
            z = true;
            ayltVar.b = true;
            if (ayllVar.c.contains(ayltVar)) {
                ArrayList arrayList = new ArrayList(ayllVar.c);
                arrayList.remove(ayltVar);
                ayllVar = new ayll(ayllVar.b, Collections.unmodifiableCollection(arrayList), ayllVar.d, ayllVar.f, ayllVar.g, ayllVar.a, ayllVar.h, ayllVar.e);
            }
            aylvVar.r = ayllVar;
            this.b.q.a(status.getCode());
        }
        aylt ayltVar2 = this.a;
        if (ayltVar2.c) {
            this.b.r(ayltVar2);
            if (this.b.r.f != this.a) {
                return;
            }
            this.b.g.execute(new aylp(this, status, ayepVar, ayatVar, 1));
            return;
        }
        if (this.b.r.f == null) {
            boolean z2 = false;
            if (ayepVar == ayep.REFUSED && this.b.s.compareAndSet(false, true)) {
                aylt p = this.b.p(this.a.d, true);
                aylv aylvVar2 = this.b;
                if (aylvVar2.k) {
                    synchronized (aylvVar2.l) {
                        aylv aylvVar3 = this.b;
                        ayll ayllVar2 = aylvVar3.r;
                        aylt ayltVar3 = this.a;
                        ArrayList arrayList2 = new ArrayList(ayllVar2.d);
                        arrayList2.remove(ayltVar3);
                        arrayList2.add(p);
                        aylvVar3.r = new ayll(ayllVar2.b, ayllVar2.c, Collections.unmodifiableCollection(arrayList2), ayllVar2.f, ayllVar2.g, ayllVar2.a, ayllVar2.h, ayllVar2.e);
                        aylv aylvVar4 = this.b;
                        if (aylvVar4.v(aylvVar4.r) || this.b.r.d.size() != 1) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.b.r(p);
                    }
                } else {
                    aylw aylwVar = aylvVar2.i;
                    if (aylwVar == null || aylwVar.a == 1) {
                        aylvVar2.r(p);
                    }
                }
                this.b.f.execute(new aylo(this, p));
                return;
            } else if (ayepVar == ayep.DROPPED) {
                aylv aylvVar5 = this.b;
                if (aylvVar5.k) {
                    aylvVar5.u();
                }
            } else {
                this.b.s.set(true);
                aylv aylvVar6 = this.b;
                if (aylvVar6.k) {
                    Integer b = b(ayatVar);
                    boolean z3 = !this.b.j.c.contains(status.getCode());
                    boolean z4 = (this.b.p == null || (z3 && (b == null || b.intValue() >= 0))) ? false : !this.b.p.b();
                    if (z3 || z4) {
                        z = false;
                    }
                    if (z) {
                        aylv aylvVar7 = this.b;
                        if (b != null) {
                            if (b.intValue() < 0) {
                                aylvVar7.u();
                            } else {
                                synchronized (aylvVar7.l) {
                                    aylh aylhVar2 = aylvVar7.w;
                                    if (aylhVar2 != null) {
                                        Future a = aylhVar2.a();
                                        aylh aylhVar3 = new aylh(aylvVar7.l);
                                        aylvVar7.w = aylhVar3;
                                        if (a != null) {
                                            a.cancel(false);
                                        }
                                        aylhVar3.b(aylvVar7.h.schedule(new aylj(aylvVar7, aylhVar3), b.intValue(), TimeUnit.MILLISECONDS));
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this.b.l) {
                        aylv aylvVar8 = this.b;
                        ayll ayllVar3 = aylvVar8.r;
                        aylt ayltVar4 = this.a;
                        ArrayList arrayList3 = new ArrayList(ayllVar3.d);
                        arrayList3.remove(ayltVar4);
                        aylvVar8.r = new ayll(ayllVar3.b, ayllVar3.c, Collections.unmodifiableCollection(arrayList3), ayllVar3.f, ayllVar3.g, ayllVar3.a, ayllVar3.h, ayllVar3.e);
                        if (z) {
                            aylv aylvVar9 = this.b;
                            if (aylvVar9.v(aylvVar9.r) || !this.b.r.d.isEmpty()) {
                                return;
                            }
                        }
                    }
                } else {
                    aylw aylwVar2 = aylvVar6.i;
                    long j = 0;
                    if (aylwVar2 != null) {
                        boolean contains = aylwVar2.f.contains(status.getCode());
                        Integer b2 = b(ayatVar);
                        boolean z5 = (this.b.p == null || (!contains && (b2 == null || b2.intValue() >= 0))) ? false : !this.b.p.b();
                        aylv aylvVar10 = this.b;
                        if (aylvVar10.i.a > this.a.d + 1 && !z5) {
                            if (b2 == null) {
                                if (contains) {
                                    double d = aylvVar10.x;
                                    double nextDouble = aylv.d.nextDouble();
                                    Double.isNaN(d);
                                    nanos = (long) (d * nextDouble);
                                    aylv aylvVar11 = this.b;
                                    long j2 = aylvVar11.x;
                                    aylw aylwVar3 = aylvVar11.i;
                                    double d2 = j2;
                                    double d3 = aylwVar3.d;
                                    Double.isNaN(d2);
                                    aylvVar11.x = Math.min((long) (d2 * d3), aylwVar3.c);
                                    j = nanos;
                                    z2 = true;
                                }
                            } else if (b2.intValue() >= 0) {
                                nanos = TimeUnit.MILLISECONDS.toNanos(b2.intValue());
                                aylv aylvVar12 = this.b;
                                aylvVar12.x = aylvVar12.i.b;
                                j = nanos;
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        synchronized (this.b.l) {
                            aylv aylvVar13 = this.b;
                            aylhVar = new aylh(aylvVar13.l);
                            aylvVar13.v = aylhVar;
                        }
                        aylhVar.b(this.b.h.schedule(new aylr(this, 1), j, TimeUnit.NANOSECONDS));
                        return;
                    }
                }
            }
        }
        this.b.r(this.a);
        if (this.b.r.f != this.a) {
            return;
        }
        this.b.g.execute(new aylp(this, status, ayepVar, ayatVar));
    }

    @Override // defpackage.ayeq
    public final void c(ayat ayatVar) {
        int i;
        int i2;
        this.b.r(this.a);
        if (this.b.r.f == this.a) {
            aylu ayluVar = this.b.p;
            if (ayluVar != null) {
                do {
                    i = ayluVar.d.get();
                    i2 = ayluVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!ayluVar.d.compareAndSet(i, Math.min(ayluVar.c + i, i2)));
            }
            this.b.g.execute(new aylm(this, ayatVar));
        }
    }

    @Override // defpackage.aymn
    public final void d(aymm aymmVar) {
        ayll ayllVar = this.b.r;
        aqxo.z(ayllVar.f != null, "Headers should be received prior to messages.");
        if (ayllVar.f != this.a) {
            return;
        }
        this.b.g.execute(new aylq(this, aymmVar));
    }

    @Override // defpackage.aymn
    public final void e() {
        if (!this.b.o()) {
            return;
        }
        this.b.g.execute(new aylr(this));
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: albl  reason: default package */
/* loaded from: classes2.dex */
public final class albl {
    private static final dcqe e = dcqe.c("albl");
    public final List<amtu> a;
    public final List<akpp> b;
    @dzsi
    public final akrs c;
    @dzsi
    public final akrs d;

    public albl(List<amtu> list, List<akpp> list2, boolean z, List<akqq> list3, boolean z2, int i, int i2, akps akpsVar) {
        akra akraVar;
        akra akraVar2;
        this.a = list;
        this.c = a(0.0f, list3, list, z2, i, i2);
        Iterator<amtu> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                akraVar = null;
                akraVar2 = null;
                break;
            }
            amtu next = it.next();
            if (next.i()) {
                akrk b = b(next, z2, i, i2);
                if (b != null) {
                    akraVar2 = b.m(0);
                    akraVar = b.p();
                } else {
                    akraVar = null;
                    akraVar2 = null;
                }
                if (list2.isEmpty() && !z) {
                    dcqe.b.v(dcqz.SMALL);
                    akrk a = next.a();
                    list2 = dcdc.f(akpp.m(akqq.c(a.p().i(), a.p().m()), akpsVar));
                }
            }
        }
        if (z && !list2.isEmpty()) {
            dcqe.b.v(dcqz.SMALL);
        }
        this.b = z ? dcdc.e() : list2;
        if (akraVar == null) {
            bvoo.h("No usable PolylineMapData to get start and end points from.", new Object[0]);
            this.d = null;
            return;
        }
        this.d = a((float) akra.G(akraVar2, akraVar), list3, list, z2, i, i2);
    }

    @dzsi
    private static akrs a(float f, List<akqq> list, List<amtu> list2, boolean z, int i, int i2) {
        akqs d;
        akrr akrrVar = new akrr(f);
        boolean z2 = true;
        boolean z3 = true;
        for (akqq akqqVar : list) {
            akrrVar.a(akqqVar);
            z3 = false;
        }
        for (amtu amtuVar : list2) {
            if (amtuVar.j()) {
                if (f % 90.0f == 0.0f) {
                    if (z) {
                        d = amtuVar.e();
                    } else if (i2 == -1) {
                        d = amtuVar.f(i);
                    } else {
                        d = amtuVar.d(i, i2);
                    }
                    if (d != null) {
                        akrrVar.a(d.a);
                        akrrVar.a(d.b);
                        z3 = false;
                    }
                } else {
                    akrk b = b(amtuVar, z, i, i2);
                    if (b != null) {
                        int i3 = 0;
                        while (i3 < b.l()) {
                            akrrVar.b(b.m(i3));
                            i3++;
                            z3 = false;
                        }
                    }
                }
            }
        }
        if (!z3) {
            dbsk.m(akrrVar.b != Integer.MAX_VALUE, "No points included");
            dbsk.l(akrrVar.c != Integer.MIN_VALUE);
            dbsk.l(akrrVar.d != Integer.MIN_VALUE);
            if (akrrVar.e == Integer.MAX_VALUE) {
                z2 = false;
            }
            dbsk.l(z2);
            akra akraVar = new akra((akrrVar.b + akrrVar.c) / 2, (akrrVar.e + akrrVar.d) / 2);
            akraVar.Y(-akrrVar.a);
            return new akrs(akraVar, akrrVar.c - akrrVar.b, akrrVar.d - akrrVar.e, (float) Math.toDegrees(akrrVar.a));
        }
        return null;
    }

    @dzsi
    private static akrk b(amtu amtuVar, boolean z, int i, int i2) {
        if (z) {
            return amtuVar.a();
        }
        if (i2 == -1) {
            return amtuVar.b(i);
        }
        return amtuVar.c(i, i2);
    }
}

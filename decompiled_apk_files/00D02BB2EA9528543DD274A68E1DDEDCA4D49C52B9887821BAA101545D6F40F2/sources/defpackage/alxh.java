package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: alxh  reason: default package */
/* loaded from: classes2.dex */
public final class alxh {
    public final alxe[] a;
    public int b;
    public final akrk c;

    public alxh(akrk akrkVar) {
        this.c = akrkVar;
        int l = akrkVar.l();
        int i = (l + 7) >> 3;
        this.b = 1;
        for (int i2 = 1; i2 < i; i2 += i2) {
            this.b++;
        }
        this.a = new alxe[e(this.b - 1) + i];
        akra akraVar = new akra();
        int e = e(this.b - 1) - 1;
        for (int i3 = 0; i3 < l; i3++) {
            akrkVar.n(i3, akraVar);
            if (i3 > 0) {
                this.a[e].a(akraVar.a, akraVar.b);
            }
            if ((i3 & 7) == 0) {
                e++;
                this.a[e] = new alxe(akraVar);
            }
        }
        for (int i4 = this.b - 2; i4 >= 0; i4--) {
            int e2 = e(i4 + 1);
            for (int e3 = e(i4); e3 < e2 && h(f(e3)); e3++) {
                alxe[] alxeVarArr = this.a;
                alxeVarArr[e3] = new alxe(alxeVarArr[f(e3)]);
                if (h(g(e3))) {
                    alxe[] alxeVarArr2 = this.a;
                    alxe alxeVar = alxeVarArr2[e3];
                    alxe alxeVar2 = alxeVarArr2[g(e3)];
                    alxeVar.a(alxeVar2.a, alxeVar2.b);
                    alxeVar.a(alxeVar2.c, alxeVar2.d);
                }
            }
        }
    }

    public static int e(int i) {
        return (1 << i) - 1;
    }

    public static int f(int i) {
        return i + i + 1;
    }

    public static int g(int i) {
        return i + i + 2;
    }

    private static void m(PriorityQueue<alxd> priorityQueue, akra akraVar, double d, int i, int i2) {
        alxd poll;
        if (priorityQueue.size() < i2) {
            poll = new alxd();
        } else {
            alxd peek = priorityQueue.peek();
            dbsk.s(peek);
            if (peek.b <= d) {
                return;
            }
            poll = priorityQueue.poll();
            dbsk.s(poll);
        }
        poll.a.aa(akraVar);
        poll.b = d;
        poll.c = i;
        priorityQueue.offer(poll);
    }

    public final List<akru> a(akrp akrpVar) {
        ArrayList arrayList = new ArrayList();
        alxf alxfVar = new alxf(this, akrpVar, j(0));
        int i = -2;
        int i2 = -1;
        while (alxfVar.hasNext()) {
            int intValue = alxfVar.next().intValue();
            if (intValue - i > 1) {
                if (i2 >= 0) {
                    arrayList.add(new akru(this.c, i(i2), Math.min(i(i) + 9, this.c.l())));
                }
                i2 = intValue;
            }
            i = intValue;
        }
        if (i2 >= 0) {
            arrayList.add(new akru(this.c, i(i2), Math.min(i(i) + 9, this.c.l())));
        }
        return arrayList;
    }

    @dzsi
    public final akrn b(akra akraVar, double d) {
        return c(akraVar, d, this.c.l() - 1);
    }

    @dzsi
    public final akrn c(akra akraVar, double d, int i) {
        return d(akraVar, d, 0, i);
    }

    @dzsi
    public final akrn d(akra akraVar, double d, int i, int i2) {
        alxg alxgVar = new alxg(this, akrp.h(akraVar, (int) (d + 1.0d)), i, i2);
        akra akraVar2 = new akra();
        akra akraVar3 = new akra();
        akra akraVar4 = new akra();
        alxd alxdVar = new alxd();
        int i3 = -2;
        while (true) {
            if (!alxgVar.hasNext()) {
                break;
            }
            int intValue = alxgVar.next().intValue();
            this.c.n(intValue, akraVar2);
            if (intValue - i3 > 1) {
                this.c.n(intValue, akraVar4);
                if (!alxgVar.hasNext()) {
                    double y = akraVar.y(akraVar2);
                    if (y <= d && y < alxdVar.b) {
                        alxdVar.a.aa(akraVar2);
                        alxdVar.b = y;
                        alxdVar.c = intValue;
                    }
                }
            } else {
                double L = akra.L(akraVar4, akraVar2, akraVar, akraVar3);
                if (L <= d && L < alxdVar.b) {
                    alxdVar.a.aa(akraVar3);
                    alxdVar.b = L;
                    if (true == akraVar3.equals(akraVar2)) {
                        i3 = intValue;
                    }
                    alxdVar.c = i3;
                }
                akraVar4.aa(akraVar2);
            }
            i3 = intValue;
        }
        if (alxdVar.c >= 0) {
            return alxdVar.a(this.c, i2, akraVar4, akraVar2);
        }
        return null;
    }

    public final boolean h(int i) {
        alxe[] alxeVarArr = this.a;
        return i < alxeVarArr.length && alxeVarArr[i] != null;
    }

    public final int i(int i) {
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(Integer.highestOneBit(i + 1));
        return (i - e(numberOfTrailingZeros)) << (((this.b + 3) - numberOfTrailingZeros) - 1);
    }

    public final int j(int i) {
        return e(this.b - 1) + (i >> 3);
    }

    public final List<akrn> k(akra akraVar, double d, int i, int i2, boolean z) {
        akrk akrkVar;
        PriorityQueue priorityQueue = new PriorityQueue(Math.min(11, i2), Collections.reverseOrder());
        akra akraVar2 = new akra();
        akra akraVar3 = new akra();
        akra akraVar4 = new akra();
        akra m = this.c.m(i);
        alxg alxgVar = new alxg(this, akrp.h(akraVar, (int) (d + 1.0d)), i, this.c.l() - 1);
        int i3 = -2;
        while (true) {
            if (!alxgVar.hasNext()) {
                break;
            }
            int intValue = alxgVar.next().intValue();
            this.c.n(intValue, akraVar2);
            if (intValue - i3 > 1) {
                this.c.n(intValue, akraVar4);
                if (!alxgVar.hasNext()) {
                    double y = akraVar.y(akraVar2);
                    if (y <= d) {
                        m(priorityQueue, akraVar2, y, intValue, i2);
                    }
                }
            } else {
                double L = akra.L(akraVar4, akraVar2, akraVar, akraVar3);
                if (L <= d) {
                    if (z) {
                        if (akraVar3.equals(m) || ((!akraVar3.equals(akraVar2) && !akraVar3.equals(akraVar4)) || (intValue == this.c.l() - 1 && akraVar3.equals(akraVar2)))) {
                            m(priorityQueue, akraVar3, L, true == akraVar3.equals(akraVar2) ? intValue : i3, i2);
                        }
                    } else {
                        m(priorityQueue, akraVar3, L, true == akraVar3.equals(akraVar2) ? intValue : i3, i2);
                    }
                }
                akraVar4.aa(akraVar2);
                m.aa(akraVar3);
            }
            i3 = intValue;
        }
        ArrayList f = dchl.f(priorityQueue.size());
        for (alxd alxdVar = (alxd) priorityQueue.poll(); alxdVar != null; alxdVar = (alxd) priorityQueue.poll()) {
            f.add(alxdVar.a(this.c, akrkVar.l() - 1, akraVar4, akraVar2));
        }
        Collections.reverse(f);
        return f;
    }

    public final List<akrn> l(akra akraVar, double d, int i, int i2, boolean z) {
        boolean z2 = false;
        if (i >= 0 && i < this.c.l()) {
            z2 = true;
        }
        dbsk.b(z2, "startVertexIndex is out of range.");
        return k(akraVar, d, i, i2, z);
    }
}

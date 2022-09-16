package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axjf  reason: default package */
/* loaded from: classes2.dex */
public final class axjf extends axjc {
    public List d;
    public cwp e;
    public List f;
    public List g;
    public List h;
    public axji i;
    public String j;
    public cwy k;
    private long[] l;
    private long[] m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axjf(String str, cxd cxdVar, cvq... cvqVarArr) {
        super(str);
        int i;
        int i2;
        Iterator it;
        long j;
        Iterator it2;
        int i3;
        Iterator it3;
        cxk cxkVar;
        List list;
        List list2;
        List list3;
        axjf axjfVar = this;
        cxd cxdVar2 = cxdVar;
        axjfVar.m = new long[0];
        axjfVar.i = new axji();
        axjfVar.k = null;
        long j2 = cxdVar.n().a;
        axjfVar.d = new cxs(cxdVar2, cvqVarArr);
        cwr l = cxdVar.l().n().l();
        axjfVar.j = cxdVar.l().l().a;
        axjfVar.f = new ArrayList();
        axjfVar.g = new ArrayList();
        axjfVar.h = new ArrayList();
        axjfVar.f.addAll(l.r().b);
        if (l.m() != null) {
            axjfVar.g.addAll(l.m().a);
        }
        if (l.n() != null) {
            axjfVar.h.addAll(l.n().a);
        }
        if (l.q() != null) {
            axjfVar.m = l.q().a;
        }
        String str2 = "subs";
        axjfVar.k = (cwy) axli.a(l, str2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((cvs) cxdVar2.m).c().j(cxj.class));
        axjfVar.e = l.o();
        List j3 = cxdVar2.m.j(cxi.class);
        if (j3.size() > 0) {
            Iterator it4 = j3.iterator();
            while (it4.hasNext()) {
                Iterator it5 = ((cxi) it4.next()).j(cxl.class).iterator();
                while (it5.hasNext()) {
                    cxl cxlVar = (cxl) it5.next();
                    if (cxlVar.a == j2) {
                        if (axli.b(((cvs) cxdVar2.m).c(), "/moof/traf/subs").size() > 0) {
                            axjfVar.k = new cwy();
                        }
                        LinkedList<Long> linkedList = new LinkedList();
                        int size = arrayList.size();
                        int i4 = 0;
                        long j4 = 1;
                        while (i4 < size) {
                            Iterator it6 = ((cxj) arrayList.get(i4)).j(cxn.class).iterator();
                            while (true) {
                                i2 = i4 + 1;
                                if (it6.hasNext()) {
                                    cxn cxnVar = (cxn) it6.next();
                                    int i5 = i4;
                                    if (cxnVar.l().a == j2) {
                                        cwy cwyVar = (cwy) axli.a(cxnVar, str2);
                                        if (cwyVar != null) {
                                            long j5 = j4 - 1;
                                            for (cwx cwxVar : cwyVar.a) {
                                                Iterator it7 = it6;
                                                cwx cwxVar2 = new cwx();
                                                Iterator it8 = it4;
                                                String str3 = str2;
                                                cwxVar2.b.addAll(cwxVar.b);
                                                if (j5 != 0) {
                                                    cwxVar2.a = j5 + cwxVar.a;
                                                    j5 = 0;
                                                } else {
                                                    cwxVar2.a = cwxVar.a;
                                                }
                                                axjfVar.k.a.add(cwxVar2);
                                                it6 = it7;
                                                it4 = it8;
                                                str2 = str3;
                                            }
                                        }
                                        Iterator it9 = it6;
                                        Iterator it10 = it4;
                                        String str4 = str2;
                                        Iterator it11 = cxnVar.j(cxq.class).iterator();
                                        while (it11.hasNext()) {
                                            cxq cxqVar = (cxq) it11.next();
                                            cxo l2 = ((cxn) cxqVar.j).l();
                                            Iterator it12 = cxqVar.c.iterator();
                                            boolean z = true;
                                            while (it12.hasNext()) {
                                                cxp cxpVar = (cxp) it12.next();
                                                if (!cxqVar.n()) {
                                                    it = it11;
                                                    j = j2;
                                                    it2 = it5;
                                                    i3 = size;
                                                    it3 = it12;
                                                    if ((l2.r() & 8) == 0) {
                                                        axjfVar.f.add(new cxb(1L, cxlVar.b));
                                                    } else {
                                                        axjfVar.f.add(new cxb(1L, l2.c));
                                                    }
                                                } else {
                                                    it = it11;
                                                    if (axjfVar.f.size() != 0) {
                                                        it2 = it5;
                                                        i3 = size;
                                                        it3 = it12;
                                                        if (((cxb) axjfVar.f.get(list2.size() - 1)).b != cxpVar.a) {
                                                            j = j2;
                                                        } else {
                                                            j = j2;
                                                            ((cxb) axjfVar.f.get(list3.size() - 1)).a++;
                                                        }
                                                    } else {
                                                        j = j2;
                                                        it2 = it5;
                                                        i3 = size;
                                                        it3 = it12;
                                                    }
                                                    axjfVar.f.add(new cxb(1L, cxpVar.a));
                                                }
                                                if (cxqVar.m()) {
                                                    if (axjfVar.g.size() != 0) {
                                                        List list4 = axjfVar.g;
                                                        if (((cvv) list4.get(list4.size() - 1)).b == cxpVar.d) {
                                                            ((cvv) axjfVar.g.get(list.size() - 1)).a++;
                                                        }
                                                    }
                                                    axjfVar.g.add(new cvv(1, axds.p(cxpVar.d)));
                                                }
                                                if (cxqVar.o()) {
                                                    cxkVar = cxpVar.c;
                                                } else if (!z || (cxqVar.r() & 4) != 4) {
                                                    cxkVar = (l2.r() & 32) != 0 ? l2.e : cxlVar.d;
                                                } else {
                                                    cxkVar = cxqVar.b;
                                                }
                                                if (cxkVar != null && !cxkVar.a) {
                                                    linkedList.add(Long.valueOf(j4));
                                                }
                                                j4++;
                                                size = i3;
                                                it11 = it;
                                                it12 = it3;
                                                it5 = it2;
                                                j2 = j;
                                                z = false;
                                            }
                                        }
                                        i4 = i5;
                                        it6 = it9;
                                        it4 = it10;
                                        str2 = str4;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                            }
                            i4 = i2;
                        }
                        long j6 = j2;
                        Iterator it13 = it4;
                        String str5 = str2;
                        Iterator it14 = it5;
                        long[] jArr = axjfVar.m;
                        int length = jArr.length;
                        long[] jArr2 = new long[linkedList.size() + length];
                        axjfVar.m = jArr2;
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                        for (Long l3 : linkedList) {
                            axjfVar.m[length] = l3.longValue();
                            length++;
                        }
                        cxdVar2 = cxdVar;
                        it4 = it13;
                        str2 = str5;
                        it5 = it14;
                        j2 = j6;
                    } else {
                        cxdVar2 = cxdVar;
                    }
                }
                cxdVar2 = cxdVar;
            }
            long j7 = j2;
            new ArrayList();
            new ArrayList();
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                Iterator it15 = ((cxj) arrayList.get(i6)).j(cxn.class).iterator();
                while (true) {
                    i = i6 + 1;
                    if (it15.hasNext()) {
                        cxn cxnVar2 = (cxn) it15.next();
                        if (cxnVar2.l().a == j7) {
                            List b = axli.b(cxnVar2, "sgpd");
                            List b2 = axli.b(cxnVar2, "sbgp");
                            Map map = axjfVar.c;
                            n(b, b2, map);
                            axjfVar.c = map;
                        }
                    }
                }
                i6 = i;
            }
        } else {
            List j8 = l.j(axkv.class);
            List j9 = l.j(axkx.class);
            Map map2 = axjfVar.c;
            n(j8, j9, map2);
            axjfVar.c = map2;
        }
        axjfVar.l = cxc.k(axjfVar.f);
        cwi m = cxdVar.l().m();
        cxe n = cxdVar.n();
        axji axjiVar = axjfVar.i;
        axjiVar.i = n.a;
        axjiVar.d = m.a;
        axjiVar.a = m.e;
        axjiVar.c = m.b;
        axjiVar.b = m.c;
        axjiVar.g = n.g;
        axjiVar.f = n.f;
        axjiVar.j = n.b;
        axjiVar.e = n.e;
        cwb cwbVar = (cwb) axli.a(cxdVar, "edts/elst");
        cwl cwlVar = (cwl) axli.a(cxdVar, "../mvhd");
        if (cwbVar != null) {
            for (cwa cwaVar : cwbVar.a) {
                List list5 = axjfVar.b;
                long j10 = cwaVar.c;
                long j11 = m.c;
                double d = cwaVar.d;
                double d2 = cwaVar.b;
                double d3 = cwlVar.c;
                Double.isNaN(d2);
                Double.isNaN(d3);
                list5.add(new axjd(j10, j11, d, d2 / d3));
                axjfVar = this;
                m = m;
            }
        }
    }

    private static final void n(List list, List list2, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axkv axkvVar = (axkv) it.next();
            Iterator it2 = list2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                axkx axkxVar = (axkx) it2.next();
                if (axkxVar.a.equals(((axkr) axkvVar.a.get(0)).a())) {
                    int i = 0;
                    for (axkw axkwVar : axkxVar.b) {
                        int i2 = axkwVar.b;
                        if (i2 > 0) {
                            axkr axkrVar = (axkr) axkvVar.a.get(i2 - 1);
                            long[] jArr = (long[]) map.get(axkrVar);
                            if (jArr == null) {
                                jArr = new long[0];
                            }
                            int p = axds.p(axkwVar.a);
                            int length = jArr.length;
                            long[] jArr2 = new long[p + length];
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                            for (int i3 = 0; i3 < axkwVar.a; i3++) {
                                jArr2[jArr.length + i3] = i + i3;
                            }
                            map.put(axkrVar, jArr2);
                        }
                        i = (int) (i + axkwVar.a);
                    }
                    z = true;
                }
            }
            if (!z) {
                String a = ((axkr) axkvVar.a.get(0)).a();
                StringBuilder sb = new StringBuilder(a.length() + 37);
                sb.append("Could not find SampleToGroupBox for ");
                sb.append(a);
                sb.append(".");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final cwy b() {
        return this.k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final List d() {
        return this.g;
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final List f() {
        return this.h;
    }

    @Override // defpackage.axjc, defpackage.axjh
    public final long[] h() {
        if (this.m.length == this.d.size()) {
            return null;
        }
        return this.m;
    }

    @Override // defpackage.axjh
    public final cwp i() {
        return this.e;
    }

    @Override // defpackage.axjh
    public final axji j() {
        return this.i;
    }

    @Override // defpackage.axjh
    public final String k() {
        return this.j;
    }

    @Override // defpackage.axjh
    public final List l() {
        return this.d;
    }

    @Override // defpackage.axjh
    public final synchronized long[] m() {
        return this.l;
    }
}

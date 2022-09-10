package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bpyh  reason: default package */
/* loaded from: classes4.dex */
public final class bpyh {
    public static final dcqe a = dcqe.c("bpyh");
    private static final dnpz d;
    public final dzsj<afwr> b;
    public final akpm c;

    static {
        dnpy bZ = dnpz.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnpz dnpzVar = (dnpz) bZ.b;
        dnpzVar.a |= 1;
        dnpzVar.b = 10433;
        deaf deafVar = deaf.UNKNOWN_ACTION;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnpz dnpzVar2 = (dnpz) bZ.b;
        dnpzVar2.c = deafVar.Q;
        dnpzVar2.a |= 2;
        d = bZ.bK();
    }

    public bpyh(dzsj<afwr> dzsjVar, akpm akpmVar) {
        this.b = dzsjVar;
        this.c = akpmVar;
    }

    public static void b(ArrayList<dnet> arrayList, dnsm dnsmVar) {
        dner bZ = dnet.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar = (dnet) bZ.b;
        dnetVar.a |= 1;
        dnetVar.b = 53;
        dneu bZ2 = dnfe.p.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ2.b;
        dnta bK = dnsmVar.bK();
        bK.getClass();
        dnfeVar.o = bK;
        dnfeVar.a |= 131072;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar2 = (dnet) bZ.b;
        dnfe bK2 = bZ2.bK();
        bK2.getClass();
        dnetVar2.d = bK2;
        dnetVar2.a |= 4;
        doru bZ3 = dorz.f.bZ();
        dory doryVar = dory.USER_PROVIDED;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dorz dorzVar = (dorz) bZ3.b;
        dorzVar.b = doryVar.i;
        dorzVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar3 = (dnet) bZ.b;
        dorz bK3 = bZ3.bK();
        bK3.getClass();
        dnetVar3.e = bK3;
        dnetVar3.a |= 8;
        arrayList.add(bZ.bK());
    }

    public static void c(ArrayList<dnet> arrayList) {
        dner bZ = dnet.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar = (dnet) bZ.b;
        dnetVar.a |= 1;
        dnetVar.b = 14;
        dneu bZ2 = dnfe.p.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ2.b;
        dnfeVar.a |= 2;
        dnfeVar.c = "gcid:route";
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar2 = (dnet) bZ.b;
        dnfe bK = bZ2.bK();
        bK.getClass();
        dnetVar2.d = bK;
        dnetVar2.a |= 4;
        arrayList.add(bZ.bK());
    }

    public static void d(ArrayList<dnet> arrayList, String str) {
        if (!dbsj.d(str)) {
            dner bZ = dnet.h.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar = (dnet) bZ.b;
            int i = dnetVar.a | 1;
            dnetVar.a = i;
            dnetVar.b = 13;
            str.getClass();
            dnetVar.a = i | 16;
            dnetVar.f = str;
            arrayList.add(bZ.bK());
        }
    }

    public static dnqe e(afwr afwrVar, akpm akpmVar, dnqe dnqeVar) {
        int i = afwrVar.l().d(afwm.SATELLITE) ? 3 : 2;
        dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
        dsqpVar.bC(dnqeVar);
        dnps dnpsVar = (dnps) dsqpVar;
        dnpz dnpzVar = d;
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar2 = (dnqe) dnpsVar.b;
        dnqe dnqeVar3 = dnqe.i;
        dnpzVar.getClass();
        dnqeVar2.f = dnpzVar;
        int i2 = dnqeVar2.a | 32;
        dnqeVar2.a = i2;
        dnqeVar2.d = i - 1;
        dnqeVar2.a = i2 | 4;
        dhjx Z = akpmVar.Z();
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar4 = (dnqe) dnpsVar.b;
        Z.getClass();
        dnqeVar4.e = Z;
        dnqeVar4.a |= 8;
        return dnpsVar.bK();
    }

    public static douc g(List<akqq> list) {
        douc bZ = doud.c.bZ();
        int i = 0;
        int i2 = 0;
        for (akqq akqqVar : list) {
            int i3 = (int) (akqqVar.a * 1.0E7d);
            int i4 = (int) (akqqVar.b * 1.0E7d);
            bZ.a(i3 - i);
            bZ.b(i4 - i2);
            i2 = i4;
            i = i3;
        }
        return bZ;
    }

    public final dwgz a(bqcu bqcuVar, dnqe dnqeVar, String str) {
        boolean z;
        ArrayList a2 = dchl.a();
        dnsm bZ = dnta.f.bZ();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        dnsq bZ2 = dnsr.c.bZ();
        boolean z2 = false;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnsr dnsrVar = (dnsr) bZ2.b;
        dnsrVar.a |= 1;
        long j = 2;
        dnsrVar.b = 2L;
        dnsr bK = bZ2.bK();
        dcdc<bqcw> b = bqcuVar.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            hashMap.put(b.get(i), bK);
            dnsq bZ3 = dnsr.c.bZ();
            long j2 = bK.b + j;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnsr dnsrVar2 = (dnsr) bZ3.b;
            dnsrVar2.a |= 1;
            dnsrVar2.b = j2;
            bK = bZ3.bK();
            i++;
            j = 2;
        }
        dcpd<bqcv> it = bqcuVar.a().J().iterator();
        while (it.hasNext()) {
            hashMap2.put(it.next(), bK);
            dnsq bZ4 = dnsr.c.bZ();
            long j3 = bK.b + 1;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dnsr dnsrVar3 = (dnsr) bZ4.b;
            dnsrVar3.a |= 1;
            dnsrVar3.b = j3;
            bK = bZ4.bK();
        }
        dnsn bZ5 = dnsp.c.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dnsp dnspVar = (dnsp) bZ5.b;
        dnspVar.b = 2;
        dnspVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnta dntaVar = (dnta) bZ.b;
        dnsp bK2 = bZ5.bK();
        bK2.getClass();
        dntaVar.e = bK2;
        dntaVar.a |= 1;
        for (Map.Entry entry : hashMap.entrySet()) {
            bqcw bqcwVar = (bqcw) entry.getKey();
            douc g = g(dchl.k(bqcwVar.a(), bpyg.a));
            dnsy bZ6 = dnsz.h.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = z2;
            }
            dnsz dnszVar = (dnsz) bZ6.b;
            doud bK3 = g.bK();
            bK3.getClass();
            dnszVar.c = bK3;
            dnszVar.a |= 2;
            dnsr dnsrVar4 = (dnsr) entry.getValue();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = z2;
            }
            dnsz dnszVar2 = (dnsz) bZ6.b;
            dnsrVar4.getClass();
            dnszVar2.b = dnsrVar4;
            dnszVar2.a |= 1;
            dnsu bZ7 = dnsx.d.bZ();
            bZ7.a((dnsr) entry.getValue());
            if (bqcwVar.b() != null) {
                bqgw b2 = bqcwVar.b();
                dbsk.s(b2);
                int i2 = b2.f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (bZ6.c) {
                            bZ6.bF();
                            bZ6.c = z2;
                        }
                        dnsz dnszVar3 = (dnsz) bZ6.b;
                        dnszVar3.d = i2 - 1;
                        dnszVar3.a |= 4;
                    }
                    if (!dbsj.d(b2.b.c())) {
                        dnsv bZ8 = dnsw.d.bZ();
                        String c = b2.b.c();
                        if (bZ8.c) {
                            bZ8.bF();
                            bZ8.c = z2;
                        }
                        dnsw dnswVar = (dnsw) bZ8.b;
                        c.getClass();
                        int i3 = dnswVar.a | 1;
                        dnswVar.a = i3;
                        dnswVar.b = c;
                        String str2 = b2.b.g;
                        str2.getClass();
                        dnswVar.a = i3 | 2;
                        dnswVar.c = str2;
                        if (bZ7.c) {
                            bZ7.bF();
                            bZ7.c = false;
                        }
                        dnsx dnsxVar = (dnsx) bZ7.b;
                        dnsw bK4 = bZ8.bK();
                        bK4.getClass();
                        dnsxVar.c = bK4;
                        dnsxVar.a |= 1;
                    }
                } else {
                    throw null;
                }
            } else if (bqcwVar.c() != null) {
                cflx c2 = bqcwVar.c();
                dbsk.s(c2);
                long a3 = c2.a();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dnsz dnszVar4 = (dnsz) bZ6.b;
                dnszVar4.a |= 8;
                dnszVar4.e = a3;
            }
            bqcv d2 = bqcwVar.d();
            bqcv e = bqcwVar.e();
            if (hashMap2.containsKey(d2)) {
                dnsr dnsrVar5 = (dnsr) hashMap2.get(d2);
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dnsz dnszVar5 = (dnsz) bZ6.b;
                dnsrVar5.getClass();
                dnszVar5.f = dnsrVar5;
                dnszVar5.a |= 16;
                z = false;
            } else {
                z = false;
                bvoo.h("Intersection is not mapped to an Id: %s", d2);
            }
            if (hashMap2.containsKey(e)) {
                dnsr dnsrVar6 = (dnsr) hashMap2.get(e);
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = z;
                }
                dnsz dnszVar6 = (dnsz) bZ6.b;
                dnsrVar6.getClass();
                dnszVar6.g = dnsrVar6;
                dnszVar6.a |= 32;
            } else {
                bvoo.h("Intersection is not mapped to an Id: %s", e);
            }
            bZ.a(bZ7);
            bZ.b(bZ6);
            z2 = false;
        }
        dcpd<Map.Entry<bqcv, ? extends dccr<bqcw>>> it2 = bqcuVar.a().b.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<bqcv, ? extends dccr<bqcw>> next = it2.next();
            bqcv key = next.getKey();
            dnss bZ9 = dnst.f.bZ();
            if (!hashMap2.containsKey(key)) {
                bvoo.h("Intersection found in graph although not mapped to Id: %s", key);
            } else {
                dnsr dnsrVar7 = (dnsr) hashMap2.get(key);
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dnst dnstVar = (dnst) bZ9.b;
                dnsrVar7.getClass();
                dnstVar.b = dnsrVar7;
                dnstVar.a |= 1;
                if (key.b() != null) {
                    Long b3 = key.b();
                    dbsk.s(b3);
                    long longValue = b3.longValue();
                    if (bZ9.c) {
                        bZ9.bF();
                        bZ9.c = false;
                    }
                    dnst dnstVar2 = (dnst) bZ9.b;
                    dnstVar2.a |= 2;
                    dnstVar2.c = longValue;
                }
                dnoh g2 = key.a().g();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dnst dnstVar3 = (dnst) bZ9.b;
                g2.getClass();
                dnstVar3.d = g2;
                dnstVar3.a |= 4;
                for (bqcw bqcwVar2 : next.getValue()) {
                    if (hashMap.containsKey(bqcwVar2)) {
                        dnsr dnsrVar8 = (dnsr) hashMap.get(bqcwVar2);
                        if (bZ9.c) {
                            bZ9.bF();
                            bZ9.c = false;
                        }
                        dnst dnstVar4 = (dnst) bZ9.b;
                        dnsrVar8.getClass();
                        dsrj<dnsr> dsrjVar = dnstVar4.e;
                        if (!dsrjVar.a()) {
                            dnstVar4.e = dsqw.cl(dsrjVar);
                        }
                        dnstVar4.e.add(dnsrVar8);
                    }
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnta dntaVar2 = (dnta) bZ.b;
                dnst bK5 = bZ9.bK();
                bK5.getClass();
                dsrj<dnst> dsrjVar2 = dntaVar2.d;
                if (!dsrjVar2.a()) {
                    dntaVar2.d = dsqw.cl(dsrjVar2);
                }
                dntaVar2.d.add(bK5);
            }
        }
        b(a2, bZ);
        d(a2, str);
        c(a2);
        dwgy bZ10 = dwgz.h.bZ();
        doaq bZ11 = doar.c.bZ();
        dniw bZ12 = dniz.f.bZ();
        bZ12.a(a2);
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        doar doarVar = (doar) bZ11.b;
        dniz bK6 = bZ12.bK();
        bK6.getClass();
        doarVar.b = bK6;
        doarVar.a |= 1;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dwgz dwgzVar = (dwgz) bZ10.b;
        doar bK7 = bZ11.bK();
        bK7.getClass();
        dwgzVar.b = bK7;
        dwgzVar.a |= 1;
        dnqe e2 = e(this.b.a(), this.c, dnqeVar);
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dwgz dwgzVar2 = (dwgz) bZ10.b;
        e2.getClass();
        dwgzVar2.c = e2;
        dwgzVar2.a |= 2;
        dngm f = f();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dwgz dwgzVar3 = (dwgz) bZ10.b;
        f.getClass();
        dwgzVar3.d = f;
        dwgzVar3.a |= 4;
        djgw a4 = chiw.a();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dwgz dwgzVar4 = (dwgz) bZ10.b;
        a4.getClass();
        dwgzVar4.e = a4;
        dwgzVar4.a |= 8;
        return bZ10.bK();
    }

    public final dngm f() {
        dngl bZ = dngm.d.bZ();
        dhjx Z = this.c.Z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngm dngmVar = (dngm) bZ.b;
        Z.getClass();
        dngmVar.c = Z;
        dngmVar.a |= 4;
        return bZ.bK();
    }
}

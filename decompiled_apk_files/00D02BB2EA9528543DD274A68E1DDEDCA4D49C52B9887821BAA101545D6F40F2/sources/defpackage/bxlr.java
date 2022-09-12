package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxlr  reason: default package */
/* loaded from: classes4.dex */
public final class bxlr implements btxx {
    private static final dcqe t = dcqe.c("bxlr");
    @dzsi
    private btzc A;
    @dzsi
    private btzc B;
    private final buye G;
    public final cqat a;
    public final bvrb b;
    @dzsi
    public final GmmLocation c;
    @dzsi
    public final GmmLocation d;
    public final btvo e;
    public final long f;
    public final long g;
    public final long h;
    public final bxes i;
    public long j;
    public boolean k;
    public final dwjn l;
    public final bvrj m;
    public final btxz n;
    @dzsi
    public dwjp o;
    @dzsi
    public btzy p;
    @dzsi
    public dwjp q;
    @dzsi
    public btzy r;
    public final bxee s;
    private final avnt u;
    private final btpc v;
    private final dxio<avij> w;
    private final avoo x;
    private final boolean y;
    private boolean z = false;
    private final btzi<dwjn, dwjp> C = new bxlk(this);
    private final btzi<dwjn, dwjp> D = new bxlm(this);
    private final btzi<dwjn, dwjp> E = new bxln(this);
    private final btzi<dwjn, dwjp> F = new bxlo(this);

    public bxlr(btpc btpcVar, buye buyeVar, avnt avntVar, cqat cqatVar, bvrb bvrbVar, dxio dxioVar, avoo avooVar, btvo btvoVar, btxz btxzVar, dwjn dwjnVar, boolean z, bxes bxesVar, bxee bxeeVar, GmmLocation gmmLocation, GmmLocation gmmLocation2, bvrj bvrjVar, long j, long j2, long j3) {
        this.v = btpcVar;
        this.G = buyeVar;
        this.u = avntVar;
        this.a = cqatVar;
        this.b = bvrbVar;
        this.w = dxioVar;
        this.x = avooVar;
        this.e = btvoVar;
        this.n = btxzVar;
        this.l = dwjnVar;
        this.y = z;
        this.i = bxesVar;
        this.s = bxeeVar;
        this.c = gmmLocation2;
        this.d = gmmLocation;
        this.m = bvrjVar;
        this.f = j;
        this.g = j2;
        this.h = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long f(cqat cqatVar, long j, long j2) {
        return Math.max(j2 - (cqatVar.e() - j), 0L);
    }

    public static boolean g(dwjp dwjpVar) {
        if ((dwjpVar.a & 1) != 0) {
            dwjh dwjhVar = dwjpVar.b;
            if (dwjhVar == null) {
                dwjhVar = dwjh.c;
            }
            if (dwjhVar.a.size() != 0) {
                return false;
            }
        }
        return true;
    }

    private final List<bxmg> j(dwjp dwjpVar) {
        ArrayList arrayList = new ArrayList();
        if (dwjpVar == null) {
            return arrayList;
        }
        dkrt dkrtVar = this.e.getOfflineMapsParameters().s;
        if (dkrtVar == null) {
            dkrtVar = dkrt.b;
        }
        if (dkrtVar.a) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            dwjp dwjpVar2 = this.o;
            if (dwjpVar2 != null) {
                dwjh dwjhVar = dwjpVar2.b;
                if (dwjhVar == null) {
                    dwjhVar = dwjh.c;
                }
                for (dwjj dwjjVar : dwjhVar.a) {
                    bxlp.a(l(dwjjVar), hashSet, hashSet2, arrayList2);
                }
            }
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            HashSet hashSet5 = new HashSet();
            HashSet hashSet6 = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            dwjp dwjpVar3 = this.q;
            if (dwjpVar3 != null) {
                dwjh dwjhVar2 = dwjpVar3.b;
                if (dwjhVar2 == null) {
                    dwjhVar2 = dwjh.c;
                }
                dsrj<dwjj> dsrjVar = dwjhVar2.a;
                for (int i = 0; i < dsrjVar.size(); i++) {
                    bxlq m = m(dsrjVar.get(i));
                    if (i < 2) {
                        bxlp.a(m, hashSet3, hashSet4, arrayList3);
                    } else {
                        bxlp.a(m, hashSet5, hashSet6, arrayList4);
                    }
                }
            }
            dwjh dwjhVar3 = dwjpVar.b;
            if (dwjhVar3 == null) {
                dwjhVar3 = dwjh.c;
            }
            for (dwjj dwjjVar2 : dwjhVar3.a) {
                dxbp dxbpVar = dwjjVar2.b;
                if (dxbpVar == null) {
                    dxbpVar = dxbp.x;
                }
                int a = dxbi.a(dxbpVar.f);
                if (a == 0 || a != 3) {
                    bxlq l = l(dwjjVar2);
                    if (this.q == null) {
                        if (k(null) == bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_NO_DOWNLOADED_AREAS) {
                            arrayList.add(bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_NO_DOWNLOADED_AREAS);
                        } else {
                            arrayList.add(bxmg.ONLINE_CLICKED_NO_OFFLINE_RESPONSE);
                        }
                    } else if (bxlp.b(l, hashSet3, hashSet4, arrayList3)) {
                        arrayList.add(bxmg.ONLINE_CLICKED_OFFLINE_HAS_THE_RESULT_IN_TOP_2);
                    } else if (!bxlp.b(l, hashSet5, hashSet6, arrayList4)) {
                        bxmg k = k(l.c);
                        if (k != bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_UNKNOWN || l.c != null || l.b != null) {
                            arrayList.add(k);
                        } else {
                            arrayList.add(bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_NO_LOCATION_OR_FPRINT);
                        }
                    } else {
                        arrayList.add(bxmg.ONLINE_CLICKED_OFFLINE_HAS_THE_RESULT_OUTSIDE_TOP_2);
                    }
                } else {
                    bxlq m2 = m(dwjjVar2);
                    if (this.o == null) {
                        arrayList.add(bxmg.OFFLINE_CLICKED_NO_ONLINE_RESPONSE);
                    } else if (bxlp.b(m2, hashSet, hashSet2, arrayList2)) {
                        arrayList.add(bxmg.OFFLINE_CLICKED_ONLINE_HAS_THE_RESULT);
                    } else if (m2.c == null && m2.b == null) {
                        arrayList.add(bxmg.OFFLINE_CLICKED_ONLINE_DOES_NOT_HAVE_THE_RESULT_NO_LOCATION_OR_FPRINT);
                    } else {
                        dxbp dxbpVar2 = dwjjVar2.b;
                        if (dxbpVar2 == null) {
                            dxbpVar2 = dxbp.x;
                        }
                        if (dxbpVar2.l == 17) {
                            arrayList.add(bxmg.OFFLINE_CLICKED_ONLINE_DOES_NOT_HAVE_THE_RESULT_ROUTE);
                        } else {
                            arrayList.add(bxmg.OFFLINE_CLICKED_ONLINE_DOES_NOT_HAVE_THE_RESULT);
                        }
                    }
                }
            }
            return arrayList;
        }
        dwjh dwjhVar4 = dwjpVar.b;
        if (dwjhVar4 == null) {
            dwjhVar4 = dwjh.c;
        }
        arrayList.addAll(Collections.nCopies(dwjhVar4.a.size(), bxmg.LOGGING_DISABLED));
        return arrayList;
    }

    private static bxlq l(dwjj dwjjVar) {
        dcvs dcvsVar;
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        String a = dbqa.a(dxbpVar.b);
        Long l = null;
        dcvs dcvsVar2 = null;
        if ((dwjjVar.a & 32) != 0) {
            dvzj dvzjVar = dwjjVar.g;
            if (dvzjVar == null) {
                dvzjVar = dvzj.y;
            }
            Long valueOf = Long.valueOf(akqi.b(dvzjVar.b).c);
            dvzj dvzjVar2 = dwjjVar.g;
            if (dvzjVar2 == null) {
                dvzjVar2 = dvzj.y;
            }
            if ((dvzjVar2.a & 4) != 0) {
                dvzj dvzjVar3 = dwjjVar.g;
                if (dvzjVar3 == null) {
                    dvzjVar3 = dvzj.y;
                }
                dhjz dhjzVar = dvzjVar3.d;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                dcvsVar2 = dcvs.b(dhjzVar.c, dhjzVar.b);
            }
            dcvsVar = dcvsVar2;
            l = valueOf;
        } else {
            dcvsVar = null;
        }
        return new bxlq(a, l, dcvsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.bxlq m(defpackage.dwjj r6) {
        /*
            dxbp r0 = r6.b
            if (r0 != 0) goto L6
            dxbp r0 = defpackage.dxbp.x
        L6:
            java.lang.String r0 = r0.b
            java.lang.String r0 = defpackage.dbqa.a(r0)
            int r1 = r6.a
            r1 = r1 & 2
            r2 = 0
            if (r1 == 0) goto L5c
            dwiv r6 = r6.c
            if (r6 != 0) goto L19
            dwiv r6 = defpackage.dwiv.M
        L19:
            dsrj<dvyw> r1 = r6.c
            int r1 = r1.size()
            r3 = 1
            if (r1 != r3) goto L58
            dsrj<dvyw> r6 = r6.c
            r1 = 0
            java.lang.Object r6 = r6.get(r1)
            dvyw r6 = (defpackage.dvyw) r6
            int r1 = r6.a
            r1 = r1 & 4
            if (r1 == 0) goto L3e
            java.lang.String r1 = r6.g     // Catch: java.lang.IllegalArgumentException -> L3e
            akqi r1 = defpackage.akqi.b(r1)     // Catch: java.lang.IllegalArgumentException -> L3e
            long r3 = r1.c     // Catch: java.lang.IllegalArgumentException -> L3e
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> L3e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            boolean r3 = r6.an
            if (r3 == 0) goto L59
            dhjz r2 = r6.e
            if (r2 != 0) goto L49
            dhjz r2 = defpackage.dhjz.e
        L49:
            double r2 = r2.c
            dhjz r6 = r6.e
            if (r6 != 0) goto L51
            dhjz r6 = defpackage.dhjz.e
        L51:
            double r4 = r6.b
            dcvs r2 = defpackage.dcvs.b(r2, r4)
            goto L59
        L58:
            r1 = r2
        L59:
            r3 = r2
            r2 = r1
            goto L9d
        L5c:
            dxbp r6 = r6.b
            if (r6 != 0) goto L62
            dxbp r6 = defpackage.dxbp.x
        L62:
            dsrj<dxbr> r6 = r6.k
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r6.next()
            dxbr r1 = (defpackage.dxbr) r1
            int r3 = r1.a
            r4 = r3 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L68
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L68
            dwzj r6 = r1.g
            if (r6 != 0) goto L84
            dwzj r6 = defpackage.dwzj.d
        L84:
            int r6 = r6.b
            dwzj r1 = r1.g
            if (r1 != 0) goto L8c
            dwzj r1 = defpackage.dwzj.d
        L8c:
            int r1 = r1.c
            dcvs r3 = new dcvs
            dcuy r6 = defpackage.dcuy.f(r6)
            dcuy r1 = defpackage.dcuy.f(r1)
            r3.<init>(r6, r1)
            goto L9d
        L9c:
            r3 = r2
        L9d:
            bxlq r6 = new bxlq
            r6.<init>(r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxlr.m(dwjj):bxlq");
    }

    @Override // defpackage.btxx
    public final synchronized void a() {
        boolean z = true;
        dbsk.a(this.A == null);
        if (this.B != null) {
            z = false;
        }
        dbsk.a(z);
        this.j = this.a.e();
        if (this.y) {
            this.A = this.G.a(this.l, this.E, this.m);
        } else if (!this.v.i()) {
            this.B = this.u.b(this.l, bttv.a, this.F, this.m);
        } else {
            this.A = this.G.a(this.l, this.C, this.m);
            this.B = this.u.b(this.l, bttv.a, this.D, this.m);
        }
    }

    @Override // defpackage.btxx
    public final synchronized void b() {
        this.k = true;
        btzc btzcVar = this.B;
        if (btzcVar != null) {
            btzcVar.a();
        }
        btzc btzcVar2 = this.A;
        if (btzcVar2 != null) {
            btzcVar2.a();
        }
    }

    public final synchronized void c() {
        dwjp bK;
        dbsk.l(this.q != null);
        if (!this.k) {
            this.z = true;
            dwjp dwjpVar = this.q;
            if (bxlt.b(dwjpVar)) {
                bK = dwjp.h;
            } else {
                ArrayList a = dchl.a();
                bxlt.a(dwjpVar, a);
                dwjo ca = dwjp.h.ca(dwjpVar);
                dwjh dwjhVar = dwjpVar.b;
                if (dwjhVar == null) {
                    dwjhVar = dwjh.c;
                }
                dsqp dsqpVar = (dsqp) dwjhVar.cu(5);
                dsqpVar.bC(dwjhVar);
                dwjg dwjgVar = (dwjg) dsqpVar;
                if (dwjgVar.c) {
                    dwjgVar.bF();
                    dwjgVar.c = false;
                }
                ((dwjh) dwjgVar.b).a = dwjh.ck();
                dwjgVar.a(a);
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dwjp dwjpVar2 = (dwjp) ca.b;
                dwjh bK2 = dwjgVar.bK();
                bK2.getClass();
                dwjpVar2.b = bK2;
                dwjpVar2.a |= 1;
                bK = ca.bK();
            }
            this.s.a(bK, null, true, j(bK));
            this.n.c(btxy.OFFLINE_PARTIAL, this.a.e() - this.j);
            this.b.a(new Runnable(this) { // from class: bxlj
                private final bxlr a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d();
                }
            }, this.m, f(this.a, this.j, this.h));
        }
    }

    public final synchronized void d() {
        if (!this.k || h()) {
            b();
            dwjp dwjpVar = this.o;
            btxy btxyVar = null;
            if (dwjpVar == null) {
                dwjp dwjpVar2 = this.q;
                if (dwjpVar2 == null || g(dwjpVar2)) {
                    btzy btzyVar = this.p;
                    if (btzyVar != null) {
                        bttq bttqVar = btzyVar.p;
                        this.n.a(bttqVar);
                        this.s.a(this.o, bttqVar, false, new ArrayList());
                    } else {
                        bvoo.h("Online request should have failed.", new Object[0]);
                    }
                } else {
                    bxee bxeeVar = this.s;
                    dwjp dwjpVar3 = this.q;
                    bxeeVar.a(dwjpVar3, null, false, j(dwjpVar3));
                    btxyVar = this.z ? btxy.OFFLINE_AFTER_PARTIAL : btxy.OFFLINE;
                }
            } else if (!this.z) {
                this.s.a(dwjpVar, null, false, j(dwjpVar));
                btxyVar = btxy.ONLINE;
            } else {
                dwjp dwjpVar4 = this.q;
                ArrayList a = dchl.a();
                if (!bxlt.b(dwjpVar4) && !bxlt.b(dwjpVar)) {
                    bxlt.a(dwjpVar4, a);
                    dwjh dwjhVar = dwjpVar.b;
                    if (dwjhVar == null) {
                        dwjhVar = dwjh.c;
                    }
                    dsrj<dwjj> dsrjVar = dwjhVar.a;
                    if (!a.isEmpty()) {
                        for (int i = 0; a.size() < dsrjVar.size() && i < dsrjVar.size(); i++) {
                            dwjj dwjjVar = dsrjVar.get(i);
                            dxbp dxbpVar = dwjjVar.b;
                            if (dxbpVar == null) {
                                dxbpVar = dxbp.x;
                            }
                            akqi f = akqi.f(bxlt.c(dwjjVar));
                            int i2 = 0;
                            while (true) {
                                if (i2 < a.size()) {
                                    akqi f2 = akqi.f(bxlt.c((dwjj) a.get(i2)));
                                    if (f == null || f2 == null) {
                                        dxbp dxbpVar2 = ((dwjj) a.get(i2)).b;
                                        if (dxbpVar2 == null) {
                                            dxbpVar2 = dxbp.x;
                                        }
                                        int a2 = dxbk.a(dxbpVar2.g);
                                        if (a2 == 0) {
                                            a2 = 1;
                                        }
                                        int a3 = dxbk.a(dxbpVar.g);
                                        if (a3 == 0) {
                                            a3 = 1;
                                        }
                                        if ((a2 == a3 || a2 == 9 || a3 == 9) && dxbpVar2.b.equals(dxbpVar.b) && dxbpVar2.c.equals(dxbpVar.c) && dxbpVar2.d.equals(dxbpVar.d)) {
                                            break;
                                        }
                                        i2++;
                                    } else if (f.c == f2.c) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    a.add(dsrjVar.get(i));
                                    break;
                                }
                            }
                        }
                    } else {
                        a.addAll(dsrjVar);
                    }
                    dwjo ca = dwjp.h.ca(dwjpVar);
                    dwjh dwjhVar2 = dwjpVar.b;
                    if (dwjhVar2 == null) {
                        dwjhVar2 = dwjh.c;
                    }
                    dsqp dsqpVar = (dsqp) dwjhVar2.cu(5);
                    dsqpVar.bC(dwjhVar2);
                    dwjg dwjgVar = (dwjg) dsqpVar;
                    if (dwjgVar.c) {
                        dwjgVar.bF();
                        dwjgVar.c = false;
                    }
                    ((dwjh) dwjgVar.b).a = dwjh.ck();
                    dwjgVar.a(a);
                    if (ca.c) {
                        ca.bF();
                        ca.c = false;
                    }
                    dwjp dwjpVar5 = (dwjp) ca.b;
                    dwjh bK = dwjgVar.bK();
                    bK.getClass();
                    dwjpVar5.b = bK;
                    dwjpVar5.a |= 1;
                    dwjpVar = ca.bK();
                } else if (!bxlt.b(dwjpVar4)) {
                    dwjpVar = dwjpVar4;
                } else if (bxlt.b(dwjpVar)) {
                    dwjpVar = dwjp.h;
                }
                this.s.a(dwjpVar, null, false, j(dwjpVar));
                btxyVar = btxy.MIXED;
            }
            if (btxyVar == null) {
                return;
            }
            this.n.c(btxyVar, this.a.e() - this.j);
        }
    }

    public final List<bxmg> e(@dzsi dwjp dwjpVar, bxmg bxmgVar) {
        ArrayList arrayList = new ArrayList();
        if (dwjpVar == null) {
            return arrayList;
        }
        dkrt dkrtVar = this.e.getOfflineMapsParameters().s;
        if (dkrtVar == null) {
            dkrtVar = dkrt.b;
        }
        if (dkrtVar.a) {
            dwjh dwjhVar = dwjpVar.b;
            if (dwjhVar == null) {
                dwjhVar = dwjh.c;
            }
            arrayList.addAll(Collections.nCopies(dwjhVar.a.size(), bxmgVar));
            return arrayList;
        }
        dwjh dwjhVar2 = dwjpVar.b;
        if (dwjhVar2 == null) {
            dwjhVar2 = dwjh.c;
        }
        arrayList.addAll(Collections.nCopies(dwjhVar2.a.size(), bxmg.LOGGING_DISABLED));
        return arrayList;
    }

    public final boolean h() {
        int a = dvud.a(this.e.getSuggestParameters().x);
        return a != 0 && a == 3;
    }

    private final bxmg k(@dzsi dcvs dcvsVar) {
        dxio<avij> dxioVar = this.w;
        if (dxioVar == null || this.x == null) {
            return bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_UNKNOWN;
        }
        avko l = dxioVar.a().E().l();
        if (l == null) {
            return bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_UNKNOWN;
        }
        dlug b = l.b();
        try {
            if (dcvsVar == null) {
                if (this.x.a(b, dcyn.a, dcyn.a) >= dcyn.a) {
                    return bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_UNKNOWN;
                }
                return bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_NO_DOWNLOADED_AREAS;
            }
            double a = this.x.a(b, dcvsVar.g(), dcvsVar.i());
            if (a > dcyn.a) {
                return bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_OUTSIDE_DOWNLOADED_AREAS;
            }
            if (a != dcyn.a) {
                return bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_NO_DOWNLOADED_AREAS;
            }
            return bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_IN_DOWNLOADED_AREAS;
        } catch (avlo e) {
            bvoo.j(e);
            return bxmg.ONLINE_CLICKED_OFFLINE_DOES_NOT_HAVE_THE_RESULT_UNKNOWN;
        }
    }
}

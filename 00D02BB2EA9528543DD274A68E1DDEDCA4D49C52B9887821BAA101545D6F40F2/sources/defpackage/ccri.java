package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ccri  reason: default package */
/* loaded from: classes4.dex */
public final class ccri implements cclp {
    public static final dcqe a = dcqe.c("ccri");
    public final ccrw b = new ccrw();
    @dzsi
    public bwrs<ilo> c;
    private final btvo d;
    private final bwqv e;
    private final cctp f;

    public ccri(btvo btvoVar, bwqv bwqvVar, cctp cctpVar) {
        this.d = btvoVar;
        this.e = bwqvVar;
        this.f = cctpVar;
    }

    @Override // defpackage.cclp
    public final void a(@dzsi bwrs<ilo> bwrsVar) {
        bwrs<ilo> bwrsVar2 = this.c;
        if (bwrsVar2 == bwrsVar) {
            return;
        }
        if (bwrsVar2 != null) {
            bwqv.t(bwrsVar2, this.b);
        }
        this.b.b();
        this.c = bwrsVar;
        if (bwrsVar == null) {
            return;
        }
        this.e.g(bwrsVar, this.b);
    }

    @Override // defpackage.cclp
    public final List<ccln> b(dgfb dgfbVar) {
        if (bwrs.b(this.c) == null) {
            bvoo.h("Attempted to get offerings from a placemark-less accessor.", new Object[0]);
            return dcdc.e();
        }
        d(dgfbVar);
        dcdc<ccln> a2 = this.b.a(dgfbVar);
        dbsk.s(a2);
        return a2;
    }

    @Override // defpackage.cclp
    public final boolean c(dgfb dgfbVar) {
        ilo iloVar = (ilo) bwrs.b(this.c);
        if (iloVar == null) {
            return false;
        }
        return cclo.a(iloVar, dgfbVar);
    }

    public final void d(dgfb dgfbVar) {
        dcdc e;
        ilo iloVar = (ilo) bwrs.b(this.c);
        dbsk.s(iloVar);
        if (this.b.a(dgfbVar) != null) {
            return;
        }
        cctp cctpVar = this.f;
        btvo a2 = cctpVar.a.a();
        cctp.a(a2, 1);
        cctp.a(cctpVar.b.a(), 2);
        cctp.a(iloVar, 3);
        djun djunVar = iloVar.h().aW;
        if (djunVar == null) {
            djunVar = djun.b;
        }
        Iterator<diyh> it = djunVar.a.iterator();
        while (true) {
            if (it.hasNext()) {
                diyh next = it.next();
                dgfb b = dgfb.b(next.a);
                if (b == null) {
                    b = dgfb.UNKNOWN_OFFERING_TYPE;
                }
                if (dgfbVar.equals(b)) {
                    e = dcdc.r(next.b);
                    break;
                }
            } else {
                e = dcdc.e();
                break;
            }
        }
        dcdc<djul> z = dcbg.b(e).o(ccto.a).z();
        if (z.size() < (dgfbVar.equals(dgfb.DISH) ? a2.getPlaceOfferingsParameters().g() : 0)) {
            z = dcdc.e();
        }
        ccrw ccrwVar = this.b;
        djqg djqgVar = iloVar.bf().i;
        if (djqgVar == null) {
            djqgVar = djqg.b;
        }
        boolean c = this.d.getPlaceMenuParameters().c();
        if (dgfbVar == dgfb.DISH) {
            HashMap hashMap = new HashMap();
            final HashMap hashMap2 = new HashMap();
            HashSet hashSet = new HashSet();
            if (c && djqgVar != null) {
                for (djul djulVar : z) {
                    if (!djulVar.f.isEmpty()) {
                        hashMap.put(djulVar.f, djulVar);
                    }
                }
                for (djqa djqaVar : djqgVar.a) {
                    for (djqk djqkVar : djqaVar.a) {
                        for (djqc djqcVar : djqkVar.b) {
                            if (!hashSet.contains(djqcVar.a)) {
                                hashMap2.put(djqcVar.a, djqcVar);
                                hashSet.add(djqcVar.a);
                            } else {
                                hashMap2.remove(djqcVar.a);
                                String str = djqcVar.a;
                            }
                        }
                    }
                }
            }
            if (djqgVar != null) {
                bkki bZ = bkkj.b.bZ();
                for (djqa djqaVar2 : djqgVar.a) {
                    bkkg bZ2 = bkkh.d.bZ();
                    String str2 = djqaVar2.b;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    bkkh bkkhVar = (bkkh) bZ2.b;
                    str2.getClass();
                    bkkhVar.a |= 1;
                    bkkhVar.b = str2;
                    for (djqk djqkVar2 : djqaVar2.a) {
                        bkkk bZ3 = bkkl.d.bZ();
                        String str3 = djqkVar2.a;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        bkkl bkklVar = (bkkl) bZ3.b;
                        str3.getClass();
                        bkklVar.a |= 1;
                        bkklVar.b = str3;
                        for (djqc djqcVar2 : djqkVar2.b) {
                            ccln b2 = cclt.b((djul) hashMap.get(djqcVar2.a), djqcVar2);
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            bkkl bkklVar2 = (bkkl) bZ3.b;
                            b2.getClass();
                            dsrj<ccln> dsrjVar = bkklVar2.c;
                            if (!dsrjVar.a()) {
                                bkklVar2.c = dsqw.cl(dsrjVar);
                            }
                            bkklVar2.c.add(b2);
                        }
                        bkkl bK = bZ3.bK();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        bkkh bkkhVar2 = (bkkh) bZ2.b;
                        bK.getClass();
                        dsrj<bkkl> dsrjVar2 = bkkhVar2.c;
                        if (!dsrjVar2.a()) {
                            bkkhVar2.c = dsqw.cl(dsrjVar2);
                        }
                        bkkhVar2.c.add(bK);
                    }
                    bkkh bK2 = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    bkkj bkkjVar = (bkkj) bZ.b;
                    bK2.getClass();
                    dsrj<bkkh> dsrjVar3 = bkkjVar.a;
                    if (!dsrjVar3.a()) {
                        bkkjVar.a = dsqw.cl(dsrjVar3);
                    }
                    bkkjVar.a.add(bK2);
                }
                ccrwVar.b = bZ.bK();
            }
            ccrwVar.a.put(dgfb.DISH, dcbg.b(z).s(new dbrn(hashMap2) { // from class: ccrv
                private final Map a;

                {
                    this.a = hashMap2;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    djul djulVar2 = (djul) obj;
                    return cclt.b(djulVar2, (djqc) this.a.get(djulVar2.f));
                }
            }).z());
            return;
        }
        ccrwVar.a.put(dgfbVar, dcbg.b(z).s(cclt.a).z());
    }
}

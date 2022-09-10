package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amhz  reason: default package */
/* loaded from: classes2.dex */
public final class amhz implements amkj {
    private final ArrayList<ArrayList<amkk>> a = new ArrayList<>();
    private final List<amkk> b = new ArrayList(5);
    private final amhy c = new amhy();
    private final List<amkk> d = new ArrayList(3);

    @Override // defpackage.amkj
    public final void a(amki amkiVar) {
        amhy amhyVar = this.c;
        int i = amkiVar.a;
        List<amkk> list = amkiVar.b;
        amhyVar.d = Math.max(0, i);
        amhyVar.a.clear();
        amhyVar.b.clear();
        for (amkk amkkVar : list) {
            if (amkkVar.d() != 0) {
                amhyVar.a.a(amkkVar.d(), amkkVar);
            } else {
                amhyVar.b.add(amkkVar);
            }
        }
        amhyVar.c.clear();
    }

    @Override // defpackage.amkj
    public final void b(List<amkk> list) {
        amhy amhyVar = this.c;
        dzrn<amkk> a = amhyVar.a.f().a();
        while (a.hasNext()) {
            amhyVar.a(a.next());
        }
        for (amkk amkkVar : amhyVar.b) {
            amhyVar.a(amkkVar);
        }
        list.addAll(amhyVar.c.f());
    }

    @Override // defpackage.amkj
    public final void c(List<amkk> list, List<amkk> list2) {
        amkk amkkVar;
        ArrayList<amkk> arrayList;
        int i;
        int i2;
        List<amkk> list3 = list;
        amkk b = this.c.a.b(list3.get(0).d());
        if (b != null) {
            this.b.clear();
            this.b.addAll(list3);
            this.b.add(b);
            list3 = this.b;
        }
        if (list3.size() == 1) {
            amkk amkkVar2 = list3.get(0);
            if (amkkVar2.U()) {
                this.c.a(amkkVar2);
                return;
            } else {
                list2.add(amkkVar2);
                return;
            }
        }
        int size = list2.size();
        ArrayList<ArrayList<amkk>> arrayList2 = this.a;
        while (arrayList2.size() > 1) {
            arrayList2.remove(arrayList2.size() - 1);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList<>(list3.size()));
        } else {
            arrayList2.get(0).clear();
            arrayList2.get(0).ensureCapacity(list3.size());
        }
        arrayList2.get(0).add(list3.get(0));
        for (int i3 = 1; i3 < list3.size(); i3++) {
            amkk amkkVar3 = list3.get(i3);
            if (amkkVar3 != null && amkkVar3.i().f()) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    ArrayList<amkk> arrayList3 = arrayList2.get(i4);
                    amkk amkkVar4 = arrayList3.get(0);
                    if (amkkVar4 != null && amkkVar4.i().f()) {
                        alvi a = amkkVar3.i().a();
                        dbsk.s(a);
                        akra akraVar = a.a;
                        alvi a2 = amkkVar4.i().a();
                        dbsk.s(a2);
                        akra akraVar2 = a2.a;
                        double y = akraVar.y(akraVar2);
                        double r = akraVar2.r();
                        Double.isNaN(y);
                        if (y / r < 100.0d) {
                            arrayList3.add(amkkVar3);
                            break;
                        }
                    }
                }
            }
            arrayList2.add(dchl.b(amkkVar3));
        }
        int i5 = 0;
        while (i5 < this.a.size()) {
            ArrayList<amkk> arrayList4 = this.a.get(i5);
            this.d.clear();
            amkk amkkVar5 = null;
            amkk amkkVar6 = null;
            amkk amkkVar7 = null;
            amkk amkkVar8 = null;
            amkk amkkVar9 = null;
            amkk amkkVar10 = null;
            amkk amkkVar11 = null;
            amkk amkkVar12 = null;
            amkk amkkVar13 = null;
            amkk amkkVar14 = null;
            amkk amkkVar15 = null;
            amkk amkkVar16 = null;
            amkk amkkVar17 = null;
            int i6 = 0;
            boolean z = false;
            boolean z2 = false;
            int i7 = -1;
            while (i6 < arrayList4.size()) {
                amkk amkkVar18 = arrayList4.get(i6);
                if (!amkkVar18.i().f()) {
                    i = i5;
                    arrayList = arrayList4;
                } else {
                    arrayList = arrayList4;
                    i = i5;
                    if (true == amkkVar18.u()) {
                        amkkVar8 = amkkVar18;
                    }
                    if (amkkVar18.E()) {
                        amkkVar17 = amkkVar18;
                    } else if (amkkVar18.aa()) {
                        amkkVar9 = amkkVar18;
                    } else if (amkkVar18.U()) {
                        amkkVar10 = amkkVar18;
                    } else if (amkkVar18.V()) {
                        amkkVar11 = amkkVar18;
                        z = true;
                        z2 = true;
                    } else if (amkkVar18.v()) {
                        amkkVar12 = amkkVar18;
                    } else if (amkkVar18.p()) {
                        amkkVar13 = amkkVar18;
                    } else if (akry.SPOTLIGHT_HIGHLIGHTING.name().equals(amkkVar18.A())) {
                        amkkVar7 = amkkVar18;
                    } else {
                        if (amkkVar18.n()) {
                            if (amkkVar6 == null || amkkVar6.B() < amkkVar18.B()) {
                                amkkVar6 = amkkVar18;
                            }
                            i2 = i7;
                        } else if (amkkVar18.J()) {
                            if (amkkVar5 == null || amkkVar5.a().h < amkkVar18.a().h) {
                                amkkVar5 = amkkVar18;
                            }
                            i2 = i7;
                        } else if (amkkVar18.r()) {
                            amkkVar14 = amkkVar18;
                        } else if (akxf.f(amkkVar18.a()) != null) {
                            amkkVar15 = amkkVar18;
                        } else if (amkkVar18.s()) {
                            amkkVar16 = amkkVar18;
                        } else {
                            int B = amkkVar18.B();
                            if (B == -1) {
                                list2.add(amkkVar18);
                                i2 = i7;
                            } else {
                                i2 = i7;
                                if (B > i2) {
                                    this.d.clear();
                                    this.d.add(amkkVar18);
                                    i7 = B;
                                } else if (B == i2) {
                                    this.d.add(amkkVar18);
                                }
                            }
                        }
                        i7 = i2;
                    }
                }
                i6++;
                arrayList4 = arrayList;
                i5 = i;
            }
            int i8 = i5;
            int i9 = i7;
            if (amkkVar5 != null) {
                list2.add(amkkVar5);
            } else if (amkkVar7 != null) {
                list2.add(amkkVar7);
            } else {
                amkk amkkVar19 = amkkVar14;
                if (amkkVar19 != null) {
                    list2.add(amkkVar19);
                } else {
                    if (amkkVar12 != null && amkkVar11 != null) {
                        list2.add(amkkVar11);
                        if (akry.SEARCH_RESULTS.name().equals(amkkVar12.A()) || akry.CATEGORICAL_SEARCH.name().equals(amkkVar12.A())) {
                            list2.add(amkkVar12);
                        }
                        amkkVar = amkkVar17;
                        z = false;
                    } else if (amkkVar11 != null) {
                        list2.add(amkkVar11);
                    } else if (amkkVar12 != null) {
                        list2.add(amkkVar12);
                    } else {
                        amkk amkkVar20 = amkkVar15;
                        if (amkkVar20 != null) {
                            list2.add(amkkVar20);
                        } else {
                            amkkVar = amkkVar17;
                            if (amkkVar10 == null && amkkVar != null) {
                                if (amkkVar6 != null) {
                                    list2.add(amkkVar6);
                                }
                                z = true;
                                z2 = true;
                            } else if (amkkVar10 == null && amkkVar13 != null) {
                                list2.add(amkkVar13);
                            } else if (amkkVar10 != null) {
                                if (amkkVar8 == null) {
                                    list2.add(amkkVar10);
                                } else {
                                    dmol g = akxf.g(amkkVar10.a());
                                    dmol g2 = akxf.g(amkkVar8.a());
                                    dbsk.s(g2);
                                    dsqp dsqpVar = (dsqp) g.cu(5);
                                    dsqpVar.bC(g);
                                    dmoi dmoiVar = (dmoi) dsqpVar;
                                    long j = g2.e;
                                    if (dmoiVar.c) {
                                        dmoiVar.bF();
                                        dmoiVar.c = false;
                                    }
                                    dmol dmolVar = (dmol) dmoiVar.b;
                                    int i10 = dmolVar.a | 8;
                                    dmolVar.a = i10;
                                    dmolVar.e = j;
                                    boolean z3 = g2.k;
                                    dmolVar.a = i10 | 2048;
                                    dmolVar.k = z3;
                                    dmpn a3 = amkkVar10.a();
                                    dsqp dsqpVar2 = (dsqp) a3.cu(5);
                                    dsqpVar2.bC(a3);
                                    dmpk dmpkVar = (dmpk) dsqpVar2;
                                    dmpkVar.k(dmnl.L, dmoiVar.bK());
                                    list2.add(amkkVar10.N((dmpn) dmpkVar.bK()));
                                }
                            } else if (amkkVar6 != null) {
                                list2.add(amkkVar6);
                            } else {
                                amkk amkkVar21 = amkkVar16;
                                if (amkkVar21 != null) {
                                    list2.add(amkkVar21);
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                    if (amkkVar != null && z2) {
                        list2.add(amkkVar);
                    }
                    if (z && i9 != -1) {
                        list2.addAll(this.d);
                    }
                    if (list2.size() == size && amkkVar9 != null) {
                        list2.add(amkkVar9);
                    }
                    list2.size();
                    i5 = i8 + 1;
                }
            }
            amkkVar = amkkVar17;
            if (amkkVar != null) {
                list2.add(amkkVar);
            }
            if (z) {
                list2.addAll(this.d);
            }
            if (list2.size() == size) {
                list2.add(amkkVar9);
            }
            list2.size();
            i5 = i8 + 1;
        }
        list2.size();
    }
}

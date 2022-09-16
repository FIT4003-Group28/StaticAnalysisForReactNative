package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bqxq  reason: default package */
/* loaded from: classes4.dex */
public final class bqxq implements alyg {
    public final List<bqyo> a = new ArrayList();
    public final List<bqyo> b = new ArrayList();
    private final dmzt c;
    private final bqyj d;
    private final int e;
    private final alyh f;

    public bqxq(dmzl dmzlVar, bqyj bqyjVar) {
        ArrayList arrayList;
        dmzt dmztVar = dmzlVar.a;
        dmztVar = dmztVar == null ? dmzt.e : dmztVar;
        this.c = dmztVar;
        this.d = bqyjVar;
        int i = dmztVar.b;
        this.e = i;
        int i2 = i - dmztVar.c;
        int i3 = 0;
        int i4 = 1;
        dbsk.a(i2 >= 0);
        int i5 = dmztVar.c;
        dmzv dmzvVar = dmztVar.a;
        int i6 = (dmzvVar == null ? dmzv.c : dmzvVar).a >>> i2;
        dmzv dmzvVar2 = dmztVar.a;
        this.f = new alyh(i5, i6, (dmzvVar2 == null ? dmzv.c : dmzvVar2).b >>> i2);
        ArrayList arrayList2 = new ArrayList();
        for (dmzx dmzxVar : dmzlVar.e) {
            bqxp bqxpVar = new bqxp(new bqxr(dmzxVar.a));
            dfnx dfnxVar = new dfnx();
            for (Integer num : dmzxVar.b) {
                int intValue = num.intValue();
                ArrayList arrayList3 = new ArrayList(intValue);
                for (int i7 = 0; i7 < intValue; i7++) {
                    bqxpVar.a(dfnxVar);
                    arrayList3.add(akra.d(dfnxVar.a, dfnxVar.b));
                }
                arrayList2.add(arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            while (bqxpVar.hasNext()) {
                bqxpVar.a(dfnxVar);
                arrayList4.add(akra.d(dfnxVar.a, dfnxVar.b));
            }
            arrayList2.add(arrayList4);
        }
        ArrayList arrayList5 = new ArrayList();
        for (dmzz dmzzVar : dmzlVar.b) {
            if ((dmzzVar.b & i4) == 0) {
                List list = (List) arrayList2.get(dmzzVar.c);
                dnab dnabVar = dmzlVar.c.get(dmzzVar.c);
                if (dmzzVar.d) {
                    ArrayList arrayList6 = new ArrayList(list.size());
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        arrayList6.add((akra) list.get(size));
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = list;
                }
                if (arrayList.size() == i4) {
                    akra akraVar = (akra) arrayList.get(i3);
                    arrayList.add(new akra(akraVar.a + i4, akraVar.b));
                }
                boolean z = dnabVar.a == 3;
                String str = dmzzVar.e.size() > 0 ? dmzzVar.e.get(i3).a : null;
                bqyo bqyoVar = null;
                int i8 = 0;
                while (i8 < arrayList.size() - 1) {
                    int i9 = i8 + 1;
                    bqyo bqyoVar2 = bqyoVar;
                    int i10 = i8;
                    bqyo bqyoVar3 = new bqyo(this, (akra) arrayList.get(i8), (akra) arrayList.get(i9), z, str, arrayList.hashCode());
                    this.a.add(bqyoVar3);
                    if (bqyoVar2 == null) {
                        this.b.add(bqyoVar3);
                    } else {
                        bqyoVar2.m(bqyoVar3);
                    }
                    if (i10 < arrayList.size() - 2) {
                        bqyoVar3.n();
                    }
                    bqyoVar = bqyoVar3;
                    i8 = i9;
                }
                bqyo bqyoVar4 = bqyoVar;
                if (bqyoVar4 == null) {
                    this.b.add(null);
                }
                arrayList5.add(bqyoVar4);
                i3 = 0;
                i4 = 1;
            } else {
                this.b.add(null);
                arrayList5.add(null);
            }
        }
        for (int i11 = 0; i11 < dmzlVar.b.size(); i11++) {
            dmzz dmzzVar2 = dmzlVar.b.get(i11);
            bqyo bqyoVar5 = (bqyo) arrayList5.get(i11);
            if (bqyoVar5 != null) {
                for (dmzn dmznVar : dmzzVar2.a) {
                    if ((dmznVar.b & 1) == 0) {
                        int i12 = dmznVar.a;
                        if (i12 < dmzlVar.b.size()) {
                            bqyo bqyoVar6 = this.b.get(i12);
                            dbsk.s(bqyoVar6);
                            bqyoVar5.m(bqyoVar6);
                        } else {
                            int i13 = this.c.d;
                            if (i12 >= i13) {
                                dmzp dmzpVar = dmzlVar.d.get(i12 - i13);
                                if (bqyoVar5.a == null) {
                                    bqyoVar5.a = new ArrayList<>(1);
                                }
                                bqyoVar5.a.add(dmzpVar);
                            }
                        }
                    }
                }
                bqyoVar5.n();
            }
        }
    }

    @Override // defpackage.alyg
    public final alyh a() {
        return this.f;
    }

    @Override // defpackage.alyg
    public final akry b() {
        return akry.ROAD_GRAPH;
    }

    @Override // defpackage.alyg
    public final amze c() {
        amzd bZ = amze.o.bZ();
        amyz bZ2 = amza.k.bZ();
        String str = akry.ROAD_GRAPH.J;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        amza amzaVar = (amza) bZ2.b;
        str.getClass();
        amzaVar.a |= 1;
        amzaVar.b = str;
        drst bZ3 = drsu.e.bZ();
        int i = this.f.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drsu drsuVar = (drsu) bZ3.b;
        int i2 = drsuVar.a | 2;
        drsuVar.a = i2;
        drsuVar.c = i;
        alyh alyhVar = this.f;
        int i3 = alyhVar.c;
        int i4 = i2 | 4;
        drsuVar.a = i4;
        drsuVar.d = i3;
        int i5 = alyhVar.a;
        drsuVar.a = i4 | 1;
        drsuVar.b = i5;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        amza amzaVar2 = (amza) bZ2.b;
        drsu bK = bZ3.bK();
        bK.getClass();
        amzaVar2.e = bK;
        amzaVar2.a |= 16;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amze amzeVar = (amze) bZ.b;
        amza bK2 = bZ2.bK();
        bK2.getClass();
        amzeVar.b = bK2;
        amzeVar.a |= 1;
        return bZ.bK();
    }

    @Override // defpackage.alyg
    public final void d(amze amzeVar) {
    }

    @Override // defpackage.alyg
    public final void e(akrx akrxVar) {
    }

    @Override // defpackage.alyg
    public final int f() {
        return 0;
    }

    @Override // defpackage.alyg
    public final akrx g() {
        return akrx.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final bqyo h(dmzp dmzpVar) {
        return this.d.a(dmzpVar, this.e);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alyx  reason: default package */
/* loaded from: classes2.dex */
public final class alyx {
    private final dzsj<akwu> c;
    private final alyz f;
    private final boolean g;
    public final List<amxz> a = dchl.a();
    public boolean b = false;
    private Map<akry, alyv> d = dcmn.a;
    private Map<akry, List<alyw>> e = dcmn.a;

    public alyx(dzsj<akwu> dzsjVar, boolean z) {
        this.c = dzsjVar;
        this.f = new alyz(dzsjVar);
        this.g = z;
    }

    private final synchronized void d(Map<akry, alyv> map, Map<akry, List<alyw>> map2) {
        this.d = map;
        this.e = map2;
    }

    public final void a() {
        int size;
        int[] iArr;
        dwko dwkoVar;
        dvdb dvdbVar;
        int i;
        alwm alwmVar;
        dvox dvoxVar;
        dcdn<Object, Object> c;
        synchronized (this) {
            if (this.g) {
                dmxp dmxpVar = this.c.a().e().b;
                if (dmxpVar == null) {
                    dmxpVar = dmxp.c;
                }
                dsrj<dmxj> dsrjVar = dmxpVar.b;
                int i2 = bvos.a;
                HashMap hashMap = new HashMap(dsrjVar.size(), 1.0f);
                int i3 = 0;
                for (dmxj dmxjVar : dsrjVar) {
                    if (dmxjVar.e.size() <= 0) {
                        dmxl b = dmxl.b(dmxjVar.b);
                        if (b == null) {
                            b = dmxl.UNKNOWN;
                        }
                        if (b != dmxl.GMM_LABELS_ONLY) {
                            dmxl b2 = dmxl.b(dmxjVar.b);
                            if (b2 == null) {
                                b2 = dmxl.UNKNOWN;
                            }
                            if (b2 != dmxl.GMM_ROAD_GRAPH) {
                                dmxl b3 = dmxl.b(dmxjVar.b);
                                if (b3 == null) {
                                    b3 = dmxl.UNKNOWN;
                                }
                                if (b3 != dmxl.GMM_SPOTLIGHT_PERSONALIZED_SMARTMAPS_PER_TILE) {
                                    dmxl b4 = dmxl.b(dmxjVar.b);
                                    if (b4 == null) {
                                        b4 = dmxl.UNKNOWN;
                                    }
                                    b4.name();
                                }
                            }
                        }
                    } else {
                        i3++;
                        alyv alyvVar = new alyv(dmxjVar.e);
                        dmxl b5 = dmxl.b(dmxjVar.b);
                        if (b5 == null) {
                            b5 = dmxl.UNKNOWN;
                        }
                        akry a = akry.a(b5);
                        if (a == null) {
                            dmxl b6 = dmxl.b(dmxjVar.b);
                            if (b6 == null) {
                                b6 = dmxl.UNKNOWN;
                            }
                            if (b6 != dmxl.UNKNOWN) {
                                dmxl b7 = dmxl.b(dmxjVar.b);
                                if (b7 == null) {
                                    b7 = dmxl.UNKNOWN;
                                }
                                b7.name();
                            }
                        } else if (!hashMap.containsKey(a)) {
                            hashMap.put(a, alyvVar);
                        }
                    }
                }
                if (i3 == 0) {
                    c = dcmn.a;
                } else {
                    hashMap.put(akry.API_TILE_OVERLAY, new alyv(dcdc.p(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)));
                    c = dcjz.c(hashMap);
                }
                dmxp dmxpVar2 = this.c.a().e().b;
                if (dmxpVar2 == null) {
                    dmxpVar2 = dmxp.c;
                }
                dsrj<dmxj> dsrjVar2 = dmxpVar2.b;
                HashMap hashMap2 = new HashMap(dsrjVar2.size(), 1.0f);
                for (dmxj dmxjVar2 : dsrjVar2) {
                    if (dmxjVar2.e.size() > 0) {
                        dmxl b8 = dmxl.b(dmxjVar2.b);
                        if (b8 == null) {
                            b8 = dmxl.UNKNOWN;
                        }
                        akry a2 = akry.a(b8);
                        if (a2 == null || hashMap2.containsKey(a2)) {
                            dmxl b9 = dmxl.b(dmxjVar2.b);
                            if (b9 == null) {
                                b9 = dmxl.UNKNOWN;
                            }
                            b9.name();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (dmyy dmyyVar : dmxjVar2.f) {
                                arrayList.add(new alyw(new alyv(dmyyVar.a), dmyyVar.b));
                            }
                            hashMap2.put(a2, arrayList);
                        }
                    }
                }
                d(c, dcjz.c(hashMap2));
            } else {
                alyz alyzVar = this.f;
                synchronized (alyzVar) {
                    dwko f = alyzVar.a.a().f();
                    alyy alyyVar = null;
                    if (f != null && (size = f.a.size()) != 0) {
                        int i4 = bvos.a;
                        alyyVar = new alyy(alyzVar);
                        for (int i5 = 0; i5 < size; i5++) {
                            dvox dvoxVar2 = f.a.get(i5);
                            int i6 = dvoxVar2.d;
                            int size2 = dvoxVar2.c.size();
                            int i7 = dvoxVar2.b;
                            if (size2 > 0) {
                                iArr = new int[size2];
                                for (int i8 = 0; i8 < size2; i8++) {
                                    iArr[i8] = dvoxVar2.c.f(i8);
                                }
                            } else {
                                iArr = new int[(i6 + 1) - i7];
                                for (int i9 = 0; i9 <= i6 - i7; i9++) {
                                    iArr[i9] = i9 + i7;
                                }
                            }
                            alwm alwmVar2 = new alwm(iArr, i7, dvoxVar2.a, i6);
                            int size3 = dvoxVar2.e.size();
                            int i10 = 0;
                            while (i10 < size3) {
                                dvdb dvdbVar2 = dvoxVar2.e.get(i10);
                                int i11 = dvdbVar2.a;
                                int i12 = dvdbVar2.b;
                                int i13 = dvdbVar2.c;
                                int size4 = dvdbVar2.d.size();
                                alyh alyhVar = new alyh(i11, i12, i13);
                                int i14 = 0;
                                while (i14 < size4) {
                                    dxdd b10 = dxdd.b(dvdbVar2.d.f(i14));
                                    if (b10 != null) {
                                        dwkoVar = f;
                                        dvdbVar = dvdbVar2;
                                        i = i10;
                                        alwmVar = alwmVar2;
                                        dvoxVar = dvoxVar2;
                                        alyyVar.b(alyhVar.b, alyhVar.c, alyhVar.a, b10, alwmVar);
                                    } else {
                                        dwkoVar = f;
                                        dvdbVar = dvdbVar2;
                                        i = i10;
                                        alwmVar = alwmVar2;
                                        dvoxVar = dvoxVar2;
                                    }
                                    i14++;
                                    alwmVar2 = alwmVar;
                                    dvoxVar2 = dvoxVar;
                                    f = dwkoVar;
                                    i10 = i;
                                    dvdbVar2 = dvdbVar;
                                }
                                i10++;
                                f = f;
                            }
                        }
                    }
                    if (alyyVar != null) {
                        int[] iArr2 = new int[22];
                        for (int i15 = 1; i15 <= 21; i15++) {
                            iArr2[i15] = i15;
                        }
                        iArr2[0] = 1;
                        alyyVar.b(0, 0, 0, akry.API_TILE_OVERLAY.I, new alwm(iArr2, 0, 1, 21));
                    }
                    alyzVar.c(alyyVar);
                }
            }
        }
        synchronized (this.a) {
            this.b = true;
            while (this.a.size() > 0) {
                this.a.get(0).a();
                this.a.remove(0);
            }
        }
    }

    public final synchronized alyv b(akra akraVar, akry akryVar) {
        if (!this.g) {
            return this.f.a(akraVar, akryVar);
        }
        List<alyw> list = this.e.get(akryVar);
        alyv alyvVar = null;
        if (list != null) {
            Iterator<alyw> it = list.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                alyw next = it.next();
                ArrayList<alyh> arrayList = next.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (arrayList.get(i).g().j(akraVar)) {
                        alyvVar = next.b;
                        break loop0;
                    }
                    i = i2;
                }
            }
        }
        if (alyvVar == null) {
            alyvVar = this.d.get(akryVar);
        }
        if (alyvVar != null) {
            return alyvVar;
        }
        return alyv.a;
    }

    public final synchronized boolean c() {
        if (this.g) {
            return !this.d.isEmpty();
        }
        return this.f.b();
    }
}

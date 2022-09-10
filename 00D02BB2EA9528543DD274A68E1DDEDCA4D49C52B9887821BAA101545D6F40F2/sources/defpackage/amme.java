package defpackage;

import com.google.android.apps.gmm.map.internal.vector.gl.GeometryUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amme  reason: default package */
/* loaded from: classes2.dex */
public final class amme extends ammd {
    private static long B;
    private static int H;
    private GeometryUtil A;
    private final float C;
    private int D;
    private float E;
    private float F;
    private bnuv G;
    public final akvu<?> g;
    public amxe h;
    public amxj i;
    public final Object j;
    public bnuk k;
    public boolean l;
    public final long m;
    public final List<alxp> n;
    public boolean o;
    public int p;
    public int q;
    public final float r;
    public final btrm s;
    public long t;
    public long u;
    public long v;
    public final Object w;
    public boolean x;
    public aqzx y;
    private final amgl z;

    public amme(amgl amglVar, bnsn bnsnVar, akvu<?> akvuVar, float f, btrm btrmVar) {
        super(bnsnVar);
        this.j = new Object();
        this.k = amxp.a;
        this.l = false;
        this.o = false;
        this.p = 1;
        this.q = 1;
        this.D = -2;
        this.E = 1.0f;
        this.w = new Object();
        this.x = false;
        this.z = amglVar;
        this.g = akvuVar;
        this.s = btrmVar;
        this.C = f;
        this.r = f * 4.5f;
        this.n = dchl.a();
        long j = B;
        B = 1 + j;
        this.m = j;
    }

    private final boolean n() {
        return alww.h(this.b.keySet().iterator().next().e.j().G, 1);
    }

    @Override // defpackage.ammd
    public final synchronized void a() {
        super.a();
        amgr amgrVar = this.f;
        if (amgrVar != null) {
            amgrVar.b();
            this.f = null;
        }
    }

    @Override // defpackage.ammd
    protected final boolean b(akzh akzhVar, akrp akrpVar) {
        bnuv bnuvVar;
        if (this.h == null || this.i == null) {
            return false;
        }
        float f = akzhVar.p().k;
        synchronized (this.w) {
            dbsk.l(true);
        }
        int size = this.b.size();
        synchronized (this.w) {
            if (!this.n.isEmpty()) {
                int abs = Math.abs(size - this.n.size());
                if (abs != 0) {
                    if (size < this.n.size()) {
                        int size2 = this.n.size() - 1;
                        for (int i = 0; i < abs; i++) {
                            this.n.remove(size2 - i);
                        }
                    } else {
                        this.n.addAll(Collections.nCopies(abs, (alxp) dcft.s(this.n)));
                    }
                }
            }
        }
        this.D = (int) f;
        this.E = akyx.x(akzhVar.p().k, akzhVar.z(), akzhVar.n(), akzhVar.C());
        this.F = f;
        amnd amndVar = new amnd(this.C, this.D, false);
        bnvn m = m(amndVar, akrpVar.m(), akrpVar.a);
        if (!n()) {
            dbsk.s(this.h);
            bnvl bnvlVar = new bnvl("stroke_dash", null, 2, 3);
            bnvlVar.b(new bntv(amndVar.b((int) this.F), 1, 64, 32, true));
            this.h.e(5, bnvlVar);
            bnvl bnvlVar2 = new bnvl("stroke_color", null, 2, 1);
            bnvlVar2.b(new bntv(amndVar.a(), 4, amnd.a, 64, false));
            this.h.e(4, bnvlVar2);
            synchronized (this.w) {
                this.h.f(amndVar.c, false);
                this.h.g(this.F);
            }
            amnt amntVar = new amnt(this.D, this.h, this.y);
            amntVar.b(this.F, this.D, false);
            bnuvVar = amntVar;
        } else {
            dbsk.s(this.h);
            bnuv amnmVar = new amnm(this.y);
            alxo d = this.b.keySet().iterator().next().e.d(this.F);
            if (amndVar.h(d) > 0) {
                bnva r = this.z.r(amndVar.g(d, 0).h);
                if (r != null) {
                    this.h.e(3, r);
                }
            }
            synchronized (this.w) {
                this.h.f(amndVar.c, false);
                this.h.g(this.F);
            }
            bnuvVar = amnmVar;
        }
        this.G = bnuvVar;
        this.h.r(m);
        if (m == null) {
            return false;
        }
        this.h.t(this.G);
        this.h.j(akrpVar.a);
        this.h.k(1.0f);
        return true;
    }

    @Override // defpackage.ammd
    protected final void c(akzh akzhVar) {
        float f = akzhVar.p().k;
        if (Math.abs(f - this.F) < 0.001d) {
            return;
        }
        this.F = f;
        bnuv bnuvVar = this.G;
        if (!(bnuvVar instanceof amnt)) {
            return;
        }
        ((amnt) bnuvVar).b(f, this.D, false);
    }

    @Override // defpackage.ammd
    public final boolean h(akzh akzhVar) {
        if (this.b.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (this.d) {
                this.d = false;
                return true;
            }
            float f = akzhVar.p().k - this.D;
            return f > (true != n() ? 1.0f : 0.25f) || f < 0.0f;
        }
    }

    @Override // defpackage.ammd
    public final void i() {
        amxe amxeVar = this.h;
        if (amxeVar == null || this.i == null) {
            return;
        }
        if (this.x) {
            this.e.j(amxeVar);
            this.e.j(this.i);
        }
        this.x = false;
    }

    @Override // defpackage.ammd
    protected final void k() {
        bnrw bnrwVar;
        synchronized (this.w) {
            long j = this.t;
            long j2 = this.u;
            long j3 = this.v;
            int i = H;
            H = i + 1;
            bnrwVar = new bnrw(j, j2, j3, i);
        }
        amxe amxeVar = new amxe(bnrwVar);
        this.h = amxeVar;
        amxeVar.a = this.z;
        long j4 = this.m;
        StringBuilder sb = new StringBuilder(31);
        sb.append("ClientLine-");
        sb.append(j4);
        amxeVar.s = sb.toString();
        amxe amxeVar2 = this.h;
        amxeVar2.u = 519;
        amxeVar2.s(1, 771);
        amxj amxjVar = new amxj(bnrwVar);
        this.i = amxjVar;
        long j5 = this.m;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("ClientLinePick-");
        sb2.append(j5);
        amxjVar.s = sb2.toString();
        this.i.n = amxp.a;
        this.A = GeometryUtil.getGeometryUtilFactory().a();
    }

    @dzsi
    public final synchronized bnvn m(amnd amndVar, float f, akra akraVar) {
        boolean z;
        int i;
        int i2;
        amgr amgrVar;
        int i3;
        float f2;
        float f3;
        float f4;
        ArrayList arrayList;
        akrl akrlVar;
        akra akraVar2;
        akra akraVar3;
        akrl akrlVar2;
        akra akraVar4;
        float f5;
        amgr amgrVar2;
        dbsk.s(this.A);
        boolean n = n();
        if (this.f == null) {
            this.f = this.A.getBuilderWithNormalizedDistance("client_roads", true != n ? 385 : 17, false, 0, 0);
        }
        this.f.l();
        this.f.h = 32767.0f / f;
        int i4 = 0;
        for (Map.Entry<alwo, List<akrk>> entry : this.b.entrySet()) {
            if (n) {
                alxl g = amndVar.g(entry.getKey().e.d(this.D), 0);
                float f6 = g.k + g.c;
                float f7 = 0.0f;
                for (akrk akrkVar : entry.getValue()) {
                    f7 += akrkVar.r();
                }
                i4 = GeometryUtil.getMaxGeneratedVerticesForPointSpriteLine(f7, this.E, f6);
            } else {
                int i5 = entry.getKey().h;
                for (akrk akrkVar2 : entry.getValue()) {
                    i4 += GeometryUtil.getMaxGeneratedVerticesForLine(akrkVar2.l(), i5, 0);
                }
            }
        }
        this.f.j(i4);
        synchronized (this.w) {
            z = this.o;
            i = this.p;
            i2 = this.q;
        }
        amgr amgrVar3 = this.f;
        if (amgrVar3 == null) {
            return null;
        }
        Map<alwo, List<akrk>> map = this.b;
        float f8 = this.D;
        float f9 = this.E;
        GeometryUtil geometryUtil = this.A;
        if (!z) {
            if (!map.isEmpty()) {
                ArrayList a = dchl.a();
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry<alwo, List<akrk>> entry2 : map.entrySet()) {
                    a.clear();
                    arrayList2.clear();
                    List<akrk> value = entry2.getValue();
                    alwo key = entry2.getKey();
                    alxp alxpVar = key.e;
                    if (alxpVar == null) {
                        i3 = 0;
                        bvoo.h("segment style entry is null", new Object[0]);
                    } else {
                        i3 = 0;
                    }
                    int size = value.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        akrk akrkVar3 = value.get(i6);
                        if (akrkVar3.l() >= 2 && alxpVar.e()) {
                            a.add(akrkVar3);
                            arrayList2.add(alxpVar);
                        }
                    }
                    alxo d = alxpVar.d(f8);
                    if (d != null && amndVar.h(d) != 0) {
                        int i7 = key.f;
                        int i8 = key.g;
                        int i9 = key.h;
                        float f10 = key.a;
                        alxl g2 = amndVar.g(d, i3);
                        if (n) {
                            f2 = g2.c;
                            f3 = g2.k;
                            f4 = g2.l;
                        } else {
                            f2 = 0.0f;
                            f3 = 0.0f;
                            f4 = 0.0f;
                        }
                        float f11 = g2.g;
                        int i10 = 0;
                        while (i10 < a.size()) {
                            akrk akrkVar4 = (akrk) a.get(i10);
                            float f12 = f11;
                            float f13 = f10;
                            int i11 = i9;
                            int i12 = i8;
                            geometryUtil.addExtrudedRoadsWithNormals(akrkVar4.b, null, akraVar, f12, amgrVar3, i7, i12, i11, f13, amndVar.c((alxp) arrayList2.get(i10)), n, f2, f3, f4, f9, 0, akrkVar4.c);
                            i10++;
                            f11 = f12;
                            f10 = f13;
                            i9 = i11;
                            i8 = i12;
                            i7 = i7;
                            f8 = f8;
                            arrayList2 = arrayList2;
                            a = a;
                        }
                    }
                }
            }
            amgrVar = amgrVar3;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                alxp alxpVar2 = map.keySet().iterator().next().e;
                if (alxpVar2 != null) {
                    Iterator<Map.Entry<alwo, List<akrk>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<alwo, List<akrk>> next = it.next();
                        List<akrk> value2 = next.getValue();
                        alwo key2 = next.getKey();
                        Iterator<Map.Entry<alwo, List<akrk>>> it2 = it;
                        if (key2.e == null) {
                            f5 = f9;
                            amgrVar2 = amgrVar3;
                            bvoo.h("null style entry for a segment.", new Object[0]);
                        } else {
                            f5 = f9;
                            amgrVar2 = amgrVar3;
                        }
                        alxp alxpVar3 = key2.e;
                        if (alxpVar3.d(f8) != null) {
                            int size2 = value2.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                List<akrk> list = value2;
                                akrk akrkVar5 = value2.get(i13);
                                int i14 = size2;
                                GeometryUtil geometryUtil2 = geometryUtil;
                                if (akrkVar5.l() >= 2 && alxpVar3.e()) {
                                    arrayList3.add(akrkVar5);
                                    arrayList4.add(alxpVar3);
                                    arrayList5.add(Integer.valueOf(key2.h));
                                }
                                i13++;
                                size2 = i14;
                                value2 = list;
                                geometryUtil = geometryUtil2;
                            }
                        }
                        it = it2;
                        f9 = f5;
                        amgrVar3 = amgrVar2;
                    }
                    GeometryUtil geometryUtil3 = geometryUtil;
                    float f14 = f9;
                    amgr amgrVar4 = amgrVar3;
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        dccg O = dccg.O();
                        dccg O2 = dccg.O();
                        int i15 = 0;
                        while (i15 < arrayList3.size()) {
                            akrk akrkVar6 = (akrk) arrayList3.get(i15);
                            int i16 = i;
                            int i17 = i2;
                            akra m = akrkVar6.m(0);
                            akra p = akrkVar6.p();
                            Iterator it3 = O2.f(m).iterator();
                            if (it3.hasNext()) {
                                akrlVar = (akrl) it3.next();
                                akrm.a(akrlVar, O, O2, hashSet);
                            } else {
                                akrlVar = null;
                            }
                            Iterator it4 = O.f(p).iterator();
                            if (it4.hasNext()) {
                                akraVar2 = p;
                                akrlVar2 = (akrl) it4.next();
                                akrm.a(akrlVar2, O, O2, hashSet);
                                akraVar3 = m;
                            } else {
                                akraVar2 = p;
                                akraVar3 = m;
                                akrlVar2 = null;
                            }
                            ArrayList arrayList7 = new ArrayList();
                            if (akrlVar != null) {
                                akraVar3 = akrlVar.a();
                                arrayList7.addAll(akrlVar.c());
                            }
                            akra akraVar5 = akraVar3;
                            alxp alxpVar4 = alxpVar2;
                            arrayList7.add(Integer.valueOf(i15));
                            if (akrlVar2 != null) {
                                akra b = akrlVar2.b();
                                arrayList7.addAll(akrlVar2.c());
                                akraVar4 = b;
                            } else {
                                akraVar4 = akraVar2;
                            }
                            akpz akpzVar = new akpz(akraVar5, akraVar4, arrayList7);
                            hashSet.add(akpzVar);
                            O.n(akraVar5, akpzVar);
                            O2.n(akraVar4, akpzVar);
                            i15++;
                            i = i16;
                            i2 = i17;
                            alxpVar2 = alxpVar4;
                        }
                        int i18 = i;
                        int i19 = i2;
                        alxp alxpVar5 = alxpVar2;
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it5 = hashSet.iterator();
                        while (it5.hasNext()) {
                            List<Integer> c = ((akrl) it5.next()).c();
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < c.size()) {
                                int l = ((akrk) arrayList3.get(c.get(i20).intValue())).l() - (i20 == 0 ? 0 : 1);
                                i21 += l + l;
                                i20++;
                            }
                            int[] iArr = new int[i21];
                            akra akraVar6 = new akra();
                            int i22 = 0;
                            int i23 = 0;
                            while (i22 < c.size()) {
                                akrk akrkVar7 = (akrk) arrayList3.get(c.get(i22).intValue());
                                Iterator it6 = it5;
                                ArrayList arrayList9 = arrayList5;
                                int i24 = i22 > 0 ? 1 : 0;
                                for (int l2 = akrkVar7.l(); i24 < l2; l2 = l2) {
                                    akrkVar7.n(i24, akraVar6);
                                    int i25 = i23 + 1;
                                    iArr[i23] = akraVar6.a;
                                    i23 = i25 + 1;
                                    iArr[i25] = akraVar6.b;
                                    i24++;
                                }
                                i22++;
                                it5 = it6;
                                arrayList5 = arrayList9;
                            }
                            Iterator it7 = it5;
                            ArrayList arrayList10 = arrayList5;
                            arrayList8.add(new akrk(iArr, !c.isEmpty() ? ((akrk) arrayList3.get(c.get(0).intValue())).c : 0.0f));
                            arrayList6.add(c);
                            it5 = it7;
                            arrayList5 = arrayList10;
                        }
                        ArrayList arrayList11 = arrayList5;
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        ArrayList arrayList14 = new ArrayList();
                        ArrayList arrayList15 = new ArrayList();
                        ArrayList arrayList16 = new ArrayList();
                        ArrayList arrayList17 = new ArrayList();
                        ArrayList arrayList18 = new ArrayList();
                        int size3 = arrayList6.size();
                        ArrayList arrayList19 = arrayList8;
                        int i26 = 0;
                        while (i26 < size3) {
                            int i27 = size3;
                            List list2 = (List) arrayList6.get(i26);
                            ArrayList arrayList20 = arrayList6;
                            int[] iArr2 = new int[list2.size()];
                            int i28 = i26;
                            float[] fArr = new float[list2.size()];
                            ArrayList arrayList21 = arrayList18;
                            int[] iArr3 = new int[list2.size()];
                            ArrayList arrayList22 = arrayList17;
                            float[] fArr2 = new float[list2.size()];
                            ArrayList arrayList23 = arrayList16;
                            float[] fArr3 = new float[list2.size()];
                            ArrayList arrayList24 = arrayList15;
                            float[] fArr4 = new float[list2.size()];
                            ArrayList arrayList25 = arrayList14;
                            int size4 = list2.size() - 1;
                            ArrayList arrayList26 = arrayList13;
                            ArrayList arrayList27 = arrayList12;
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            while (i29 < list2.size()) {
                                int intValue = ((Integer) list2.get(i29)).intValue();
                                List list3 = list2;
                                alxp alxpVar6 = (alxp) arrayList4.get(intValue);
                                iArr2[i30] = amndVar.c(alxpVar6);
                                alxo d2 = alxpVar6.d(f8);
                                fArr[i30] = 0.0f;
                                fArr2[i30] = 0.0f;
                                if (amndVar.h(d2) > 0) {
                                    arrayList = arrayList4;
                                    alxl g3 = amndVar.g(d2, 0);
                                    if (n) {
                                        fArr2[i30] = g3.c;
                                        fArr3[i30] = g3.k;
                                        fArr4[i30] = g3.l;
                                    }
                                    fArr[i30] = g3.g;
                                } else {
                                    arrayList = arrayList4;
                                }
                                i32 += ((akrk) arrayList3.get(intValue)).l() - (i29 == size4 ? 0 : 1);
                                iArr3[i30] = i32;
                                ArrayList arrayList28 = arrayList11;
                                i31 = ((Integer) arrayList28.get(intValue)).intValue();
                                i30++;
                                i29++;
                                arrayList11 = arrayList28;
                                list2 = list3;
                                arrayList4 = arrayList;
                            }
                            arrayList12 = arrayList27;
                            arrayList12.add(iArr2);
                            arrayList13 = arrayList26;
                            arrayList13.add(fArr);
                            arrayList14 = arrayList25;
                            arrayList14.add(iArr3);
                            arrayList24.add(fArr2);
                            arrayList23.add(fArr3);
                            arrayList17 = arrayList22;
                            arrayList17.add(fArr4);
                            arrayList21.add(Integer.valueOf(i31));
                            arrayList11 = arrayList11;
                            arrayList15 = arrayList24;
                            arrayList16 = arrayList23;
                            arrayList6 = arrayList20;
                            size3 = i27;
                            i26 = i28 + 1;
                            arrayList18 = arrayList21;
                            arrayList4 = arrayList4;
                        }
                        ArrayList arrayList29 = arrayList18;
                        ArrayList arrayList30 = arrayList16;
                        ArrayList arrayList31 = arrayList6;
                        ArrayList arrayList32 = arrayList15;
                        ampk d3 = ampn.d(amndVar, alxpVar5, f8, i18, i19);
                        int i33 = 0;
                        while (i33 < arrayList31.size()) {
                            ArrayList arrayList33 = arrayList19;
                            geometryUtil3.addExtrudedMultiSegmentRoadsWithNormals(((akrk) arrayList33.get(i33)).b, (int[]) arrayList14.get(i33), akraVar, (float[]) arrayList13.get(i33), amgrVar4, d3.a, d3.b, ((Integer) arrayList29.get(i33)).intValue(), 0.0f, (int[]) arrayList12.get(i33), n, (float[]) arrayList32.get(i33), (float[]) arrayList30.get(i33), (float[]) arrayList17.get(i33), false, f14, ((akrk) arrayList33.get(i33)).c, null, null);
                            i33++;
                            d3 = d3;
                            arrayList12 = arrayList12;
                            amgrVar4 = amgrVar4;
                            arrayList14 = arrayList14;
                            arrayList29 = arrayList29;
                            arrayList17 = arrayList17;
                            f14 = f14;
                            arrayList30 = arrayList30;
                            arrayList32 = arrayList32;
                            arrayList13 = arrayList13;
                            arrayList19 = arrayList33;
                        }
                    }
                    amgrVar = amgrVar4;
                }
            }
            amgrVar = amgrVar3;
        }
        if (amgrVar.f <= 0) {
            return null;
        }
        bnvn n2 = amgrVar.n(true != n ? 5 : 4);
        n2.a(false);
        return n2;
    }
}

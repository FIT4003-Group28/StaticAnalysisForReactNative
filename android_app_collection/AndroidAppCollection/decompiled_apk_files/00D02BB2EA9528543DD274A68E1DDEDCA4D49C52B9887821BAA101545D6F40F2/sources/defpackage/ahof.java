package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.filament.R;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahof  reason: default package */
/* loaded from: classes2.dex */
final class ahof {
    @dzsi
    public static GmmLocation a(cqat cqatVar, dlym dlymVar, amuh amuhVar, long j) {
        amvs amvsVar;
        int i;
        String str = null;
        if ((dlymVar.a & 1) != 0) {
            amvs amvsVar2 = new amvs();
            amvsVar2.g = "gmfc";
            amvsVar2.A(j);
            amvsVar2.z(j);
            amvsVar2.C(cqatVar.b());
            amvsVar2.u(true);
            amvsVar2.e().s = dlymVar.v;
            amvsVar2.e().t = dlymVar.J;
            if ((dlymVar.a & 268435456) != 0) {
                amvsVar2.e().z = new ahmr(dlymVar.N);
            }
            if ((dlymVar.a & 1024) != 0) {
                amvsVar2.e().d = dlymVar.l;
            }
            dlyz dlyzVar = dlymVar.b;
            if (dlyzVar == null) {
                dlyzVar = dlyz.g;
            }
            akra akraVar = new akra(dlyzVar.b, dlyzVar.c);
            amvsVar2.v(akraVar.k(), akraVar.o());
            if ((dlyzVar.a & 16) != 0) {
                amvsVar2.p(dlyzVar.f);
            }
            if ((dlyzVar.a & 8) != 0) {
                amvsVar2.B(dlyzVar.e);
            }
            if ((dlyzVar.a & 4) != 0) {
                amvsVar2.o(dlyzVar.d);
            }
            if ((dlymVar.a & 2) != 0) {
                amvsVar2.n((float) dlymVar.c);
            }
            int i2 = dlymVar.a;
            if ((i2 & 4) != 0) {
                amvsVar2.j = (float) dlymVar.d;
            }
            if ((i2 & 8) != 0) {
                amvsVar2.k = (float) dlymVar.e;
            }
            if ((i2 & 16) != 0) {
                amvsVar2.l = (float) dlymVar.f;
            }
            if (dlymVar.g) {
                amvsVar2.e().h = true;
            }
            if (dlymVar.h) {
                amvsVar2.x(true);
            }
            if (dlymVar.i) {
                amvsVar2.s(true);
            }
            int i3 = dlymVar.a;
            if ((i3 & 256) != 0) {
                if (!dlymVar.h) {
                    if ((i3 & 2048) != 0) {
                        dlyzVar = dlymVar.m;
                        if (dlyzVar == null) {
                            dlyzVar = dlyz.g;
                        }
                    }
                }
                int i4 = dlyzVar.a;
                if ((i4 & 8) != 0 && (i4 & 16) != 0) {
                    if ((dlymVar.a & 512) != 0) {
                        str = dlymVar.k;
                    }
                    amvx amvxVar = new amvx(str, Integer.valueOf(dlymVar.j));
                    akra akraVar2 = new akra(dlyzVar.b, dlyzVar.c);
                    float f = dlyzVar.f;
                    float f2 = dlyzVar.e;
                    amvu e = amvsVar2.e();
                    e.c = amvxVar;
                    e.e = akraVar2;
                    e.f = f;
                    e.g = f2;
                }
            }
            Iterator<amub> it = amuhVar.iterator();
            while (it.hasNext()) {
                amub next = it.next();
                dlzg dlzgVar = (dlzg) Collections.unmodifiableMap(dlymVar.A).get(Long.valueOf(next.W));
                if (dlzgVar != null) {
                    int i5 = dlzgVar.a;
                    if ((i5 & 1) != 0 && (i5 & 2) != 0) {
                        double L = next.L(dlzgVar.b, dlzgVar.c);
                        if (!Double.isNaN(L)) {
                            amvsVar2.e().k.a(next.W, L);
                        }
                    }
                }
            }
            int size = dlymVar.z.size();
            if (size > 0) {
                dzjw dzjwVar = new dzjw(size);
                for (int i6 = 0; i6 < size; i6++) {
                    dzjwVar.b(dlymVar.z.f(i6));
                }
                amvsVar2.e().y = dzjwVar;
            }
            amvsVar2.r(dlymVar.n);
            amvsVar2.e().o = dlymVar.o;
            amvsVar2.e().p = dlymVar.p;
            amvsVar2.e().q = dlymVar.q;
            if ((dlymVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                amvsVar2.e().u = dlymVar.r;
            }
            if ((dlymVar.a & 262144) != 0) {
                dlyc dlycVar = dlymVar.s;
                if (dlycVar == null) {
                    dlycVar = dlyc.n;
                }
                amvsVar = amvsVar2;
                amvsVar.e().v = new amvr(dlycVar.a, dlycVar.b, dlycVar.c, dlycVar.d, dlycVar.e, dlycVar.f, dlycVar.g, dlycVar.h, dlycVar.i, dlycVar.j, dlycVar.k, dlycVar.l, dlycVar.m);
            } else {
                amvsVar = amvsVar2;
            }
            if (amuhVar.j()) {
                amvsVar.e().j = amuhVar.k().W;
            }
            amvw amvwVar = new amvw(false);
            for (int i7 = 0; i7 < amuhVar.m(); i7++) {
                amvwVar.c.b(amuhVar.l(i7).W);
            }
            Iterator<dlyi> it2 = dlymVar.t.iterator();
            while (it2.hasNext()) {
                dlyi next2 = it2.next();
                if (next2.a == 1) {
                    dlyx dlyxVar = (dlyx) next2.b;
                    dlyz dlyzVar2 = dlyxVar.b;
                    if (dlyzVar2 == null) {
                        dlyzVar2 = dlyz.g;
                    }
                    dzlb dzlbVar = new dzlb();
                    Iterator<amub> it3 = amuhVar.iterator();
                    while (it3.hasNext()) {
                        amub next3 = it3.next();
                        dlzg dlzgVar2 = (dlzg) Collections.unmodifiableMap(dlyxVar.h).get(Long.valueOf(next3.W));
                        if (dlzgVar2 != null) {
                            int i8 = dlzgVar2.a;
                            if ((i8 & 1) != 0 && (i8 & 2) != 0) {
                                double L2 = next3.L(dlzgVar2.b, dlzgVar2.c);
                                if (!Double.isNaN(L2)) {
                                    dzlbVar.a(next3.W, L2);
                                }
                            }
                        }
                    }
                    if ((dlyxVar.a & 64) != 0) {
                        int i9 = dlyxVar.j;
                        int i10 = i9 != 0 ? i9 != 16 ? i9 != 32 ? i9 != 48 ? i9 != 64 ? i9 != 80 ? i9 != 96 ? i9 != 112 ? i9 != 128 ? i9 != 144 ? 0 : 145 : 129 : R.styleable.AppCompatTheme_toolbarStyle : 97 : 81 : 65 : 49 : 33 : 17 : 1;
                        if (i10 != 0) {
                            i = i10;
                            amvk a = amvl.a(new akra(dlyzVar2.b, dlyzVar2.c), dlyxVar.d, dlyzVar2.f, new ahmp(dlyzVar2.e, Math.sqrt(dlyxVar.c.f(1))), new ahmp(dlyxVar.e, Math.sqrt(dlyxVar.c.f(0))), dzlbVar, dlyxVar.g);
                            a.b = dlyxVar.i;
                            a.a = dlyxVar.f;
                            a.d = i;
                            a.c = dlyxVar.k;
                            amvwVar.b(a.a());
                            it2 = it2;
                        }
                    }
                    i = 1;
                    amvk a2 = amvl.a(new akra(dlyzVar2.b, dlyzVar2.c), dlyxVar.d, dlyzVar2.f, new ahmp(dlyzVar2.e, Math.sqrt(dlyxVar.c.f(1))), new ahmp(dlyxVar.e, Math.sqrt(dlyxVar.c.f(0))), dzlbVar, dlyxVar.g);
                    a2.b = dlyxVar.i;
                    a2.a = dlyxVar.f;
                    a2.d = i;
                    a2.c = dlyxVar.k;
                    amvwVar.b(a2.a());
                    it2 = it2;
                }
            }
            if (!amvwVar.b.isEmpty()) {
                amvsVar.e().i = amvwVar;
            }
            Iterator<amub> it4 = amuhVar.iterator();
            while (it4.hasNext()) {
                amub next4 = it4.next();
                Double d = (Double) Collections.unmodifiableMap(dlymVar.u).get(Long.valueOf(next4.W));
                if (d != null && !Double.isNaN(d.doubleValue())) {
                    amvsVar.y(next4.W, d.doubleValue());
                }
            }
            amvs amvsVar3 = amvsVar;
            int size2 = dlymVar.w.size();
            if (size2 > 0) {
                akra akraVar3 = new akra(dlymVar.w.f(0), dlymVar.x.f(0));
                amvp amvpVar = new amvp(akraVar3);
                for (int i11 = 1; i11 < size2; i11 += 2) {
                    int f3 = dlymVar.w.f(i11);
                    int f4 = dlymVar.x.f(i11);
                    int i12 = i11 + 1;
                    int f5 = dlymVar.w.f(i12);
                    int f6 = dlymVar.x.f(i12);
                    if (akraVar3.a != f3 || akraVar3.b != f4) {
                        akraVar3 = new akra(f5, f6);
                        amvpVar.d(new akra(f3, f4), akraVar3);
                    } else {
                        akraVar3 = new akra(f5, f6);
                        amvpVar.a.add(new amvn(amvpVar.b, akraVar3));
                        amvpVar.b = akraVar3;
                    }
                }
                amvsVar3.w(amvpVar);
            }
            if (dlymVar.E.size() > 0) {
                int size3 = dlymVar.E.size();
                ArrayList arrayList = new ArrayList(size3);
                for (int i13 = 0; i13 < size3; i13++) {
                    dlyg dlygVar = dlymVar.E.get(i13);
                    ahmy bZ = ahmz.h.bZ();
                    long j2 = dlygVar.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ahmz ahmzVar = (ahmz) bZ.b;
                    int i14 = ahmzVar.a | 1;
                    ahmzVar.a = i14;
                    ahmzVar.b = j2;
                    long j3 = dlygVar.b;
                    int i15 = i14 | 2;
                    ahmzVar.a = i15;
                    ahmzVar.c = j3;
                    float f7 = dlygVar.c;
                    int i16 = i15 | 4;
                    ahmzVar.a = i16;
                    ahmzVar.d = f7;
                    float f8 = dlygVar.d;
                    int i17 = i16 | 8;
                    ahmzVar.a = i17;
                    ahmzVar.e = f8;
                    boolean z = dlygVar.e;
                    ahmzVar.a = i17 | 16;
                    ahmzVar.f = z;
                    dsrf dsrfVar = dlygVar.f;
                    ahmz ahmzVar2 = (ahmz) bZ.b;
                    dsrf dsrfVar2 = ahmzVar2.g;
                    if (!dsrfVar2.a()) {
                        ahmzVar2.g = dsqw.cg(dsrfVar2);
                    }
                    dsod.bv(dsrfVar, ahmzVar2.g);
                    arrayList.add(bZ.bK());
                }
                ahmx bZ2 = ahna.g.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ahna ahnaVar = (ahna) bZ2.b;
                dsrj<ahmz> dsrjVar = ahnaVar.b;
                if (!dsrjVar.a()) {
                    ahnaVar.b = dsqw.cl(dsrjVar);
                }
                dsod.bv(arrayList, ahnaVar.b);
                long j4 = dlymVar.F;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ahna ahnaVar2 = (ahna) bZ2.b;
                int i18 = ahnaVar2.a | 1;
                ahnaVar2.a = i18;
                ahnaVar2.c = j4;
                long j5 = dlymVar.G;
                int i19 = i18 | 2;
                ahnaVar2.a = i19;
                ahnaVar2.d = j5;
                float f9 = dlymVar.H;
                int i20 = i19 | 4;
                ahnaVar2.a = i20;
                ahnaVar2.e = f9;
                float f10 = dlymVar.I;
                ahnaVar2.a = i20 | 8;
                ahnaVar2.f = f10;
                amvsVar3.e().x = bZ2.bK();
            }
            return amvsVar3.d();
        }
        return null;
    }

    public static dlze b(amuh amuhVar, boolean z) {
        amuo[] p;
        dlzc bZ = dlze.e.bZ();
        if (amuhVar.j()) {
            long j = amuhVar.k().W;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlze dlzeVar = (dlze) bZ.b;
            dlzeVar.a |= 1;
            dlzeVar.b = j;
        }
        Iterator<amub> it = amuhVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            amub next = it.next();
            akrk w = next.w();
            dlzh bZ2 = dlzi.e.bZ();
            int l = w.l();
            for (int i2 = 0; i2 < l; i2++) {
                int i3 = w.b[i2 + i2];
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dlzi dlziVar = (dlzi) bZ2.b;
                dsrf dsrfVar = dlziVar.a;
                if (!dsrfVar.a()) {
                    dlziVar.a = dsqw.cg(dsrfVar);
                }
                dlziVar.a.h(i3);
                int o = w.o(i2);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dlzi dlziVar2 = (dlzi) bZ2.b;
                dsrf dsrfVar2 = dlziVar2.b;
                if (!dsrfVar2.a()) {
                    dlziVar2.b = dsqw.cg(dsrfVar2);
                }
                dlziVar2.b.h(o);
            }
            i = Math.max(i, next.n);
            if (z) {
                if (next.Z()) {
                    dpeq dpeqVar = next.s;
                    if (dpeqVar != null) {
                        for (dpco dpcoVar : dpeqVar.b) {
                            bZ2.b(dpcoVar.b);
                            bZ2.a((int) dpcoVar.c);
                        }
                    }
                } else {
                    int i4 = 0;
                    int i5 = 0;
                    for (amuo amuoVar : next.p()) {
                        i4 += amuoVar.k;
                        i5 += amuoVar.m;
                        bZ2.b(i4);
                        bZ2.a(i5);
                    }
                }
            }
            long j2 = next.W;
            dlzi bK = bZ2.bK();
            bK.getClass();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlze dlzeVar2 = (dlze) bZ.b;
            dssd<Long, dlzi> dssdVar = dlzeVar2.d;
            if (!dssdVar.a) {
                dlzeVar2.d = dssdVar.a();
            }
            dlzeVar2.d.put(Long.valueOf(j2), bK);
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlze dlzeVar3 = (dlze) bZ.b;
        dlzeVar3.a |= 2;
        dlzeVar3.c = i;
        return bZ.bK();
    }

    public static void c(ckcw ckcwVar, List<dlyo> list) {
        ckgz ckgzVar = null;
        for (dlyo dlyoVar : list) {
            int a = dlyq.a(dlyoVar.a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i != 0) {
                if (i == 1) {
                    ckgzVar = ckhi.o;
                } else if (i == 2) {
                    ckgzVar = ckhi.m;
                } else if (i != 3) {
                    ckgzVar = ckhi.aN;
                } else {
                    ckgzVar = ckhi.n;
                }
            }
            if (ckgzVar != null) {
                ((ckco) ckcwVar.a(ckgzVar)).b(dlyoVar.b, dlyoVar.c);
            }
        }
    }
}

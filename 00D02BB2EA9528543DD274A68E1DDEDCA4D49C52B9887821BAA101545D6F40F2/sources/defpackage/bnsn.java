package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: bnsn  reason: default package */
/* loaded from: classes.dex */
public final class bnsn implements bntd {
    public static final Comparator<bnsa> r = new bnsh();
    public static final Comparator<bnsa> s = new bnsi();
    public static final Comparator<bnsa> t = new bnsj();
    public static final Comparator<bnsa> u = new bnsk();
    private final bnux A;
    private final bnuf B;
    private final bnux C;
    private final bnux D;
    private final bnuf E;
    private final bnux F;
    private final bnux G;
    private final bnux H;
    private final bnux I;
    private final bnux J;
    private final bnuf K;
    private final bnux L;
    private final bnun[] M;
    private final String[] N;
    private Runnable O;
    @dzsi
    private bntz Q;
    private int R;
    private bnri S;
    private final ckcw T;
    private final dzsj<duxm> X;
    public volatile bnud b;
    public final bnux e;
    public final bnuf f;
    public bnur g;
    public bnrr h;
    public final bnvb i;
    public final bnvb j;
    public bnul l;
    public final bntb m;
    public bnug n;
    public bnuz o;
    public final bvnx q;
    private final bnux z;
    public final bnsm a = new bnsm();
    private final Set<Runnable> v = new HashSet();
    private Set<Runnable> w = new HashSet();
    private Set<Runnable> x = new HashSet();
    public final CopyOnWriteArraySet<Runnable> c = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<Runnable> y = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<Runnable> d = new CopyOnWriteArraySet<>();
    public boolean k = true;
    private final AtomicBoolean P = new AtomicBoolean(true);
    private final bnrk U = new bnrk();
    private bntc V = bntc.a;
    public final bnso p = new bnso(false);
    private final AtomicBoolean W = new AtomicBoolean(false);

    public bnsn(Context context, ckcw ckcwVar, bvnx bvnxVar, dzsj<duxm> dzsjVar) {
        this.m = new bntb(context);
        this.T = ckcwVar;
        this.q = bvnxVar;
        this.X = dzsjVar;
        Comparator<bnsa> comparator = t;
        bnux bnuxVar = new bnux(comparator);
        this.z = bnuxVar;
        bnux bnuxVar2 = new bnux(comparator);
        this.A = bnuxVar2;
        bnue bnueVar = bnsd.a;
        Comparator<bnsa> comparator2 = r;
        bnuf bnufVar = new bnuf(22, bnueVar, comparator2);
        this.B = bnufVar;
        bnux bnuxVar3 = new bnux(comparator2);
        this.C = bnuxVar3;
        bnux bnuxVar4 = new bnux();
        this.D = bnuxVar4;
        bnuf bnufVar2 = new bnuf(bntk.values().length, bnse.a, null);
        this.E = bnufVar2;
        bnux bnuxVar5 = new bnux();
        this.F = bnuxVar5;
        bnux bnuxVar6 = new bnux();
        this.G = bnuxVar6;
        Comparator<bnsa> comparator3 = s;
        bnux bnuxVar7 = new bnux(comparator3);
        this.e = bnuxVar7;
        Comparator<bnsa> comparator4 = u;
        bnux bnuxVar8 = new bnux(comparator4);
        this.H = bnuxVar8;
        bnux bnuxVar9 = new bnux(comparator4);
        this.I = bnuxVar9;
        bnux bnuxVar10 = new bnux();
        this.J = bnuxVar10;
        bnuf bnufVar3 = new bnuf(22, bnsf.a, comparator2);
        this.K = bnufVar3;
        bnuf bnufVar4 = new bnuf(bntn.values().length, bnsg.a, comparator3);
        this.f = bnufVar4;
        bnux bnuxVar11 = new bnux(comparator4);
        this.L = bnuxVar11;
        this.M = new bnun[]{bnuxVar, bnuxVar2, bnufVar, bnuxVar3, bnuxVar4, bnufVar2, bnuxVar5, bnuxVar6, bnuxVar7, bnuxVar8, bnuxVar9, bnuxVar10, bnufVar3, bnufVar4, bnuxVar11};
        this.N = new String[]{"underlay", "stencil", "baseTile", "areaHighlight", "traffic", "indoor", "transit", "bicycling", "clientInjected", "polyline", "building", "label", "myMaps", "nonPorted", "benchmark"};
        int i = ((double) context.getResources().getDisplayMetrics().density) > 2.0d ? 2 : 1;
        this.i = new bnvb("label_atlas_2", 2048, 256, 4, 4);
        this.j = new bnvb("callout_atlas_2", i * 1024, i * 512, 8, 32);
    }

    @Override // defpackage.bntd
    public final bnsn a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v27, types: [akti, aktd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v48, types: [bnsa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v54, types: [bnsa, java.lang.Object] */
    @Override // defpackage.bntd
    public final void b() {
        int i;
        long j;
        int i2;
        long j2;
        bnri bnriVar;
        dcdc r2;
        Map<akti, akwf> map;
        amjh amjhVar;
        dcep K;
        int i3;
        long j3;
        int i4;
        int i5;
        ?? r10;
        Set g;
        dcpe dcpeVar;
        bnul bnulVar;
        bnul bnulVar2;
        synchronized (this) {
        }
        if (this.g == null || this.h == null) {
            return;
        }
        bnuq.a(bnuq.IDLE, bnuq.BEGIN_FRAME);
        this.P.set(false);
        long a = this.q.a();
        int n = this.g.n();
        int o = this.g.o();
        this.h.a(n, o);
        this.m.c();
        bnuq.a(bnuq.BEGIN_FRAME, bnuq.UPDATE);
        bnul bnulVar3 = this.l;
        boolean z = true;
        if (bnulVar3 != null) {
            boolean z2 = false;
            while (true) {
                try {
                    ((almp) bnulVar3).m.acquire();
                    break;
                } catch (InterruptedException unused) {
                    n = n;
                    o = o;
                    a = a;
                    z = true;
                    z2 = true;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
        while (true) {
            bnsl a2 = this.a.a();
            if (a2 == null) {
                bnul bnulVar4 = this.l;
                if (bnulVar4 != null) {
                    ((almp) bnulVar4).m.release();
                }
                Iterator<Runnable> it = this.c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                synchronized (this) {
                    Set<Runnable> set = this.x;
                    this.x = this.w;
                    this.w = set;
                    set.clear();
                }
                for (Runnable runnable : this.x) {
                    runnable.run();
                }
                this.x.clear();
                Iterator<Runnable> it2 = this.y.iterator();
                while (it2.hasNext()) {
                    it2.next().run();
                }
                if (!this.X.a().I) {
                    Iterator<Runnable> it3 = this.d.iterator();
                    while (it3.hasNext()) {
                        it3.next().run();
                    }
                }
                for (int i6 = 0; i6 < 15; i6++) {
                    String str = this.N[i6];
                    this.M[i6].a(a);
                    String str2 = this.N[i6];
                }
                bnuq.a(bnuq.UPDATE, bnuq.PRE_DRAW);
                int i7 = 3;
                int i8 = 2;
                if (this.b == null || this.Q == null || this.g == null) {
                    i = n;
                    j = a;
                    i2 = o;
                } else {
                    bnud bnudVar = this.b;
                    bntz bntzVar = this.Q;
                    int n2 = this.g.n();
                    int o2 = this.g.o();
                    amkg amkgVar = (amkg) bnudVar;
                    ((ckgv) amkgVar.m.a(ckgh.f)).a();
                    bntzVar.d = n2;
                    bntzVar.e = o2;
                    int i9 = 0;
                    while (true) {
                        bntx[] bntxVarArr = bntzVar.l;
                        if (i9 >= bntxVarArr.length) {
                            break;
                        }
                        bntx bntxVar = bntxVarArr[i9];
                        if (bntxVar != null) {
                            bntzVar.m.addAll(bntxVar.a);
                            bntzVar.l[i9].a.clear();
                        }
                        i9++;
                    }
                    bntzVar.n = null;
                    bntzVar.o = null;
                    bntzVar.h = 0;
                    bntzVar.i = 0;
                    amkgVar.g = z;
                    amkgVar.a();
                    amjk amjkVar = amkgVar.b;
                    synchronized (amjkVar.b) {
                        r2 = dcdc.r(amjkVar.b);
                        amjkVar.b.clear();
                    }
                    synchronized (amjkVar) {
                        dcpe listIterator = r2.listIterator();
                        while (listIterator.hasNext()) {
                            amji amjiVar = (amji) listIterator.next();
                            int i10 = amjiVar.e;
                            int i11 = i10 - 1;
                            if (i10 == 0) {
                                throw null;
                            }
                            if (i11 == 0) {
                                dcpeVar = listIterator;
                                amjkVar.d.a(amjiVar.a, akud.e(amjiVar.b, amjiVar.c, akuf.PLACED_FULLY, amjiVar.d));
                            } else if (i11 != z) {
                                if (i11 == i8) {
                                    Map<dmpn, akud> map2 = amjkVar.e;
                                    dmpn dmpnVar = amjiVar.b;
                                    map2.put(dmpnVar, akud.e(dmpnVar, amjiVar.c, akuf.REPRESSED, null));
                                } else if (i11 == i7) {
                                    Map<dmpn, akud> map3 = amjkVar.e;
                                    dmpn dmpnVar2 = amjiVar.b;
                                    map3.put(dmpnVar2, akud.e(dmpnVar2, amjiVar.c, akuf.TRUMPED, null));
                                } else if (i11 == 4) {
                                    amjkVar.d.b(amjiVar.a);
                                }
                                dcpeVar = listIterator;
                            } else {
                                dcpeVar = listIterator;
                                amjkVar.d.a(amjiVar.a, akud.e(amjiVar.b, amjiVar.c, akuf.PLACED_PARTIALLY, amjiVar.d));
                            }
                            amjiVar.a();
                            amjkVar.a.h(amjiVar);
                            listIterator = dcpeVar;
                            z = true;
                            i7 = 3;
                            i8 = 2;
                        }
                    }
                    long a3 = amkgVar.n.a();
                    alol alolVar = amkgVar.o;
                    alolVar.b.clear();
                    if (alolVar.a.isEmpty()) {
                        map = alolVar.b;
                    } else {
                        alolVar.c.clear();
                        synchronized (alolVar.a) {
                            alolVar.c.putAll(alolVar.a);
                        }
                        for (Map.Entry<allu, akth> entry : alolVar.c.entrySet()) {
                            alolVar.b.put(entry.getKey(), entry.getValue().a(entry.getKey()));
                        }
                        map = alolVar.b;
                    }
                    HashMap hashMap = new HashMap();
                    new amig();
                    new akse();
                    amkgVar.i.clear();
                    amkgVar.i.ensureCapacity(amkgVar.h.size());
                    amkgVar.i.addAll(amkgVar.h);
                    Collections.sort(amkgVar.i, amkg.a);
                    ArrayList<amhh> arrayList = amkgVar.i;
                    int size = arrayList.size();
                    int i12 = 0;
                    boolean z3 = false;
                    boolean z4 = true;
                    while (i12 < size) {
                        ArrayList<amhh> arrayList2 = arrayList;
                        amhh amhhVar = arrayList.get(i12);
                        int i13 = size;
                        int C = amhhVar.C(a3);
                        long j4 = a3;
                        if (C == 5) {
                            amkgVar.h.remove(amhhVar);
                            amhhVar.x(8);
                            i3 = n;
                            j3 = a;
                            i4 = o;
                            i5 = i12;
                        } else {
                            amhv amhvVar = amhhVar instanceof amhv ? (amhv) amhhVar : null;
                            if (amhvVar == null || (r10 = amhvVar.u) == 0) {
                                i3 = n;
                                j3 = a;
                                i4 = o;
                                i5 = i12;
                            } else {
                                j3 = a;
                                alok alokVar = amkgVar.p;
                                synchronized (alokVar.a) {
                                    i3 = n;
                                    g = ((dbys) alokVar.a).g(r10);
                                }
                                if (!g.isEmpty()) {
                                    synchronized (alokVar) {
                                        Iterator it4 = g.iterator();
                                        while (it4.hasNext()) {
                                            aloj alojVar = (aloj) it4.next();
                                            Iterator it5 = it4;
                                            Map<akti, amia> map4 = alokVar.c;
                                            int i14 = o;
                                            akti aktiVar = alojVar.a;
                                            int i15 = i12;
                                            akti aktiVar2 = alojVar.b;
                                            float f = alojVar.c;
                                            float f2 = alojVar.d;
                                            if (map4.put(null, new amia(null)) != null) {
                                                throw null;
                                            }
                                            dclb<akti> dclbVar = alokVar.d;
                                            akti aktiVar3 = alojVar.b;
                                            dclbVar.add(null);
                                            it4 = it5;
                                            o = i14;
                                            i12 = i15;
                                        }
                                        i4 = o;
                                        i5 = i12;
                                    }
                                } else {
                                    i4 = o;
                                    i5 = i12;
                                }
                                if (amkgVar.p.a(r10)) {
                                    hashMap.put(r10, amhvVar);
                                }
                                akwf akwfVar = map.get(r10);
                                boolean contains = amkgVar.j.contains(r10);
                                if (akwfVar != null) {
                                    amkgVar.k.add(r10);
                                    ((amhv) amhhVar).d(akwfVar, !contains);
                                } else if (contains) {
                                    amhv amhvVar2 = (amhv) amhhVar;
                                    synchronized (amhvVar2.b) {
                                        amhvVar2.w = false;
                                    }
                                }
                                if (akwfVar == null && amkgVar.p.c(r10)) {
                                    throw null;
                                }
                            }
                            boolean z5 = C == 2 || C == 3 || (C == 4 && amhhVar.D(4) > 0);
                            amjo amjoVar = amkgVar.e;
                            akzh akzhVar = amkgVar.c;
                            boolean z6 = amkgVar.l;
                            z3 = z5 | z3;
                            z4 &= amhhVar.q(amjoVar, akzhVar, bntzVar);
                        }
                        i12 = i5 + 1;
                        size = i13;
                        arrayList = arrayList2;
                        a3 = j4;
                        a = j3;
                        n = i3;
                        o = i4;
                    }
                    i = n;
                    j = a;
                    i2 = o;
                    Set<akti> set2 = amkgVar.j;
                    amkgVar.j = amkgVar.k;
                    amkgVar.k = set2;
                    amkgVar.k.clear();
                    synchronized (bnudVar) {
                        ((amkg) bnudVar).f = z4 && !z3;
                        if (!z4 || z3 || !((amkg) bnudVar).j.isEmpty()) {
                            ((amkg) bnudVar).d.q();
                        }
                    }
                    if (bntzVar.h != bntzVar.i) {
                        bntzVar.b();
                    }
                    if (!bntzVar.j.a()) {
                        dbsk.l(!bntzVar.j.a());
                        dbsk.l(!bntzVar.k.a());
                        int i16 = bntzVar.f / 4;
                        int i17 = i16 * 6;
                        short[] sArr = new short[i17];
                        for (int i18 = 0; i18 < i16; i18++) {
                            int i19 = i18 * 6;
                            int i20 = i18 * 4;
                            sArr[i19] = (short) i20;
                            short s2 = (short) (i20 + 3);
                            sArr[i19 + 1] = s2;
                            short s3 = (short) (i20 + 1);
                            sArr[i19 + 2] = s3;
                            sArr[i19 + 3] = s3;
                            sArr[i19 + 4] = s2;
                            sArr[i19 + 5] = (short) (i20 + 2);
                        }
                        bntzVar.k = bntzVar.b.t("label");
                        bntzVar.b.x(bntzVar.k);
                        bntzVar.b.K(sArr, i17, 35048);
                        int i21 = bntzVar.f * 20;
                        bntzVar.j = bntzVar.b.s("label");
                        bntzVar.b.v(bntzVar.j);
                        bntb bntbVar = bntzVar.b;
                        GLES20.glBufferData(34962, i21, null, 35048);
                        bntbVar.d.e = i21;
                    }
                    bntzVar.b.v(bntzVar.j);
                    bntb bntbVar2 = bntzVar.b;
                    float[] fArr = bntzVar.g;
                    int i22 = bntzVar.i;
                    GLES20.glBufferSubData(34962, 0, i22 * 4, bntbVar2.I(fArr, i22));
                    int i23 = 0;
                    while (true) {
                        bntx[] bntxVarArr2 = bntzVar.l;
                        if (i23 >= bntxVarArr2.length) {
                            break;
                        }
                        bntx bntxVar2 = bntxVarArr2[i23];
                        if (bntxVar2 != null) {
                            bntc bntcVar = bntzVar.j;
                            bntc bntcVar2 = bntzVar.k;
                            bnty bntyVar = bntzVar.c;
                            int i24 = bntyVar.w;
                            int i25 = bntyVar.b;
                            int i26 = bntyVar.c;
                            int i27 = bntyVar.d;
                            bntxVar2.b = bntcVar;
                            bntxVar2.c = bntcVar2;
                            bntxVar2.d = i24;
                            bntxVar2.e = i25;
                            bntxVar2.f = i26;
                            bntxVar2.g = i27;
                        }
                        i23++;
                    }
                    amjk amjkVar2 = amkgVar.b;
                    synchronized (amjkVar2) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.putAll(amjkVar2.e);
                        dzrn<akud> a4 = amjkVar2.d.values().a();
                        while (a4.hasNext()) {
                            akud next = a4.next();
                            hashMap2.put(next.a(), next);
                        }
                        amjhVar = new amjh(Collections.unmodifiableMap(hashMap2), amjkVar2.f.get());
                    }
                    for (akub akubVar : amjkVar2.c) {
                        akubVar.b(amjhVar);
                    }
                    alok alokVar2 = amkgVar.p;
                    synchronized (alokVar2) {
                        K = dcep.K(alokVar2.b);
                        alokVar2.b.clear();
                    }
                    synchronized (alokVar2.a) {
                        dcpd it6 = K.iterator();
                        while (it6.hasNext()) {
                            ((dbys) alokVar2.a).g((akti) it6.next());
                        }
                    }
                    ((ckgv) amkgVar.m.a(ckgh.f)).b();
                    ((ckgv) amkgVar.m.a(ckgh.f)).c();
                }
                this.i.h();
                this.j.h();
                bnuq.a(bnuq.PRE_DRAW, bnuq.DRAW);
                this.m.J(this.g.p, i, i2);
                bnrr bnrrVar = this.h;
                if (bnrrVar != null && this.g != null) {
                    this.z.h(bnrrVar);
                    this.A.h(this.h);
                    this.B.c(this.h);
                    this.C.h(this.h);
                    this.D.h(this.h);
                    this.E.c(this.h);
                    long j5 = j;
                    double a5 = this.p.a(j5);
                    if (a5 != dcyn.a && (bnriVar = this.S) != null) {
                        bntc bntcVar3 = this.V;
                        bnriVar.a.n(770, 771);
                        bnriVar.a.r(true, 517, 2, 2);
                        bnriVar.a.o(519);
                        bnriVar.a.h(bnriVar.b);
                        bnriVar.a.D(1, bntcVar3);
                        GLES20.glUniform2f(bnriVar.d, 1.0f, 1.0f);
                        GLES20.glUniform1f(bnriVar.e, 1.0f);
                        GLES20.glUniform2f(bnriVar.f, 1.0f, 1.0f);
                        GLES20.glUniform2f(bnriVar.g, 0.0f, 0.0f);
                        GLES20.glUniform1f(bnriVar.h, -1.0f);
                        GLES20.glUniform1i(bnriVar.i, 0);
                        GLES20.glUniform1f(bnriVar.j, (float) a5);
                        GLES20.glUniform1f(bnriVar.k, 0.0f);
                        bnriVar.a.v(bnriVar.c);
                        bnriVar.a.z(0);
                        int i28 = bnta.a().f;
                        for (int i29 = 1; i29 < i28; i29++) {
                            bnriVar.a.A(i29);
                        }
                        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
                        bntb.Q(5, 4);
                        if (!this.p.b(j5)) {
                            q();
                        }
                    }
                    this.F.h(this.h);
                    this.G.h(this.h);
                    this.e.h(this.h);
                    this.H.h(this.h);
                    if (this.k && !this.I.a.isEmpty()) {
                        ((ckgv) this.T.a(ckgh.g)).a();
                        bnux bnuxVar = this.I;
                        ArrayList<bnsa> arrayList3 = bnuxVar.a;
                        int size2 = arrayList3.size();
                        for (int i30 = 0; i30 < size2; i30++) {
                            arrayList3.get(i30).a(j5);
                        }
                        bnuxVar.a.size();
                        bnrk bnrkVar = this.U;
                        bnux bnuxVar2 = this.I;
                        bnrr bnrrVar2 = this.h;
                        bntb bntbVar3 = bnrkVar.a;
                        dbsk.s(bntbVar3);
                        bntbVar3.r(false, 0, 0, 0);
                        bntbVar3.h(bnrkVar.c);
                        bntb.T(bnrkVar.d, bnrrVar2.x());
                        GLES20.glUniform1f(bnrkVar.j, bnrrVar2.k());
                        bntbVar3.z(0);
                        bntbVar3.z(1);
                        bntbVar3.z(2);
                        int i31 = bnta.a().f;
                        for (int i32 = 3; i32 < i31; i32++) {
                            bntbVar3.A(i32);
                        }
                        bntbVar3.n(0, 1);
                        bntbVar3.o(513);
                        ArrayList<bnsa> arrayList4 = bnuxVar2.a;
                        bnrkVar.a(arrayList4, bnrrVar2);
                        bntbVar3.n(770, 771);
                        bntbVar3.o(515);
                        bnrkVar.a(arrayList4, bnrrVar2);
                        bntbVar3.w();
                        bntbVar3.y();
                        for (int i33 = 0; i33 < i31; i33++) {
                            bntbVar3.A(i33);
                        }
                        ((ckgv) this.T.a(ckgh.g)).b();
                        ((ckgv) this.T.a(ckgh.g)).c();
                    }
                    this.J.h(this.h);
                    this.K.c(this.h);
                    this.f.c(this.h);
                    bnug bnugVar = this.n;
                    if (bnugVar != null) {
                        bnrr bnrrVar3 = this.h;
                        GLES20.glDisable(2884);
                        GLES20.glEnable(3042);
                        GLES20.glEnable(2929);
                        GLES20.glDepthMask(true);
                        GLES20.glDepthFunc(513);
                        GLES20.glDisable(2960);
                        float[] fArr2 = bnrrVar3.g.get().v;
                        GLES20.glEnableVertexAttribArray(0);
                        GLES20.glEnableVertexAttribArray(1);
                        GLES20.glEnableVertexAttribArray(2);
                        int i34 = 16;
                        if (bnugVar.c != null) {
                            GLES20.glUseProgram(bnugVar.g);
                            GLES20.glUniform1i(bnugVar.o, 0);
                            GLES20.glUniform3f(bnugVar.p, -fArr2[8], fArr2[9], fArr2[10]);
                            GLES20.glUniformMatrix4fv(bnugVar.n, 1, false, bnrrVar3.x(), 0);
                            ArrayList<bnut> arrayList5 = bnugVar.c;
                            int size3 = arrayList5.size();
                            int i35 = 0;
                            int i36 = -1;
                            while (i35 < size3) {
                                bnut bnutVar = arrayList5.get(i35);
                                bnvu u2 = bnutVar.u();
                                if (u2.a()) {
                                    bnutVar.s();
                                    System.arraycopy(bnutVar.t(), 0, bnugVar.i, 0, i34);
                                    Matrix.multiplyMM(bnugVar.j, 0, bnugVar.i, 0, fArr2, 0);
                                    Matrix.invertM(bnugVar.k, 0, bnugVar.i, 0);
                                    Matrix.setIdentityM(bnugVar.k, 0);
                                    GLES20.glUniformMatrix4fv(bnugVar.l, 1, false, bnugVar.i, 0);
                                    GLES20.glUniformMatrix4fv(bnugVar.m, 1, false, bnugVar.k, 0);
                                    ArrayList<bnvt> arrayList6 = u2.c;
                                    int size4 = arrayList6.size();
                                    int i37 = i36;
                                    for (int i38 = 0; i38 < size4; i38++) {
                                        bnvt bnvtVar = arrayList6.get(i38);
                                        int i39 = bnvtVar.d * 4;
                                        int i40 = bnvtVar.f;
                                        if (i40 != i37) {
                                            GLES20.glBindBuffer(34962, i40);
                                            i37 = i40;
                                        }
                                        GLES20.glVertexAttribPointer(0, 3, 5126, false, 32, i39);
                                        GLES20.glVertexAttribPointer(1, 2, 5126, false, 32, i39 + 12);
                                        GLES20.glVertexAttribPointer(2, 3, 5126, false, 32, i39 + 20);
                                        bnvv bnvvVar = bnvtVar.h;
                                        if (bnvvVar != null) {
                                            GLES20.glBindTexture(3553, bnvvVar.d);
                                        }
                                        GLES20.glDrawArrays(4, 0, bnvtVar.c);
                                    }
                                    i36 = i37;
                                }
                                i35++;
                                i34 = 16;
                            }
                        }
                        if (bnugVar.d != null) {
                            GLES20.glUseProgram(bnugVar.h);
                            GLES20.glEnableVertexAttribArray(3);
                            int i41 = 0;
                            GLES20.glUniform1i(bnugVar.t, 0);
                            GLES20.glUniformMatrix4fv(bnugVar.s, 1, false, bnrrVar3.x(), 0);
                            long currentTimeMillis = System.currentTimeMillis();
                            ArrayList<bnus> arrayList7 = bnugVar.d;
                            int size5 = arrayList7.size();
                            int i42 = 0;
                            boolean z7 = false;
                            int i43 = -1;
                            while (i42 < size5) {
                                bnus bnusVar = arrayList7.get(i42);
                                GLES20.glUniform3fv(bnugVar.u, 2, bnusVar.k(), i41);
                                bnusVar.m(currentTimeMillis);
                                int p = bnusVar.p();
                                int min = Math.min(bnusVar.p() + 1, bnusVar.o());
                                float r3 = bnusVar.r();
                                int q = bnusVar.q();
                                bnvu u3 = bnusVar.u();
                                if (!u3.a() || q == -1) {
                                    j2 = currentTimeMillis;
                                } else {
                                    z7 = bnusVar.n() | z7;
                                    bnusVar.s();
                                    j2 = currentTimeMillis;
                                    System.arraycopy(bnusVar.t(), 0, bnugVar.i, 0, 16);
                                    Matrix.setIdentityM(bnugVar.j, 0);
                                    GLES20.glUniformMatrix4fv(bnugVar.q, 1, false, bnugVar.i, 0);
                                    GLES20.glUniformMatrix4fv(bnugVar.r, 1, false, bnugVar.j, 0);
                                    GLES20.glUniform1f(bnugVar.v, r3);
                                    ArrayList<bnvt> arrayList8 = u3.c;
                                    int size6 = arrayList8.size();
                                    int i44 = i43;
                                    int i45 = 0;
                                    while (i45 < size6) {
                                        bnvt bnvtVar2 = arrayList8.get(i45);
                                        int i46 = (bnvtVar2.g * q) + bnvtVar2.d;
                                        int i47 = bnvtVar2.e;
                                        int i48 = (i46 + (p * i47)) * 4;
                                        int i49 = (i46 + (i47 * min)) * 4;
                                        int i50 = bnvtVar2.f;
                                        ArrayList<bnvt> arrayList9 = arrayList8;
                                        if (i50 != i44) {
                                            GLES20.glBindBuffer(34962, i50);
                                            i44 = i50;
                                        }
                                        GLES20.glVertexAttribPointer(0, 4, 5126, false, 32, i48);
                                        GLES20.glVertexAttribPointer(1, 4, 5126, false, 32, i48 + 16);
                                        GLES20.glVertexAttribPointer(2, 4, 5126, false, 32, i49);
                                        GLES20.glVertexAttribPointer(3, 4, 5126, false, 32, i49 + 16);
                                        bnvv bnvvVar2 = bnvtVar2.h;
                                        if (bnvvVar2 != null) {
                                            GLES20.glBindTexture(3553, bnvvVar2.d);
                                        }
                                        GLES20.glDrawArrays(4, 0, bnvtVar2.c);
                                        i45++;
                                        arrayList8 = arrayList9;
                                    }
                                    i43 = i44;
                                }
                                i42++;
                                currentTimeMillis = j2;
                                i41 = 0;
                            }
                            if (z7) {
                                bnugVar.a.q();
                            }
                        }
                    }
                }
                bnuq.a(bnuq.DRAW, bnuq.POST_DRAW);
                bnuq.a(bnuq.POST_DRAW, bnuq.END_FRAME);
                this.m.b();
                this.R++;
                bnuq.a(bnuq.END_FRAME, bnuq.IDLE);
                if (this.m.h) {
                    q();
                }
                if (!this.X.a().I) {
                    return;
                }
                Iterator<Runnable> it7 = this.d.iterator();
                while (it7.hasNext()) {
                    it7.next().run();
                }
                return;
            } else if (a2.d != 0) {
                ?? r6 = a2.a;
                if (String.valueOf(r6.q()).length() == 0) {
                    new String("removeEntity ");
                }
                r6.E(false);
                this.M[r6.B().p].e(r6);
                if (r6.x() != null && (bnulVar = this.l) != null) {
                    almp almpVar = (almp) bnulVar;
                    almpVar.e.remove((Object) r6);
                    almpVar.g.remove(r6);
                }
                if (String.valueOf(r6.q()).length() == 0) {
                    new String("removeEntity ");
                }
            } else {
                ?? r8 = a2.a;
                if (String.valueOf(r8.q()).length() == 0) {
                    new String("addEntity ");
                }
                r8.z(this.m);
                this.M[r8.B().p].d(r8);
                if (r8.x() != null && (bnulVar2 = this.l) != null) {
                    akvu<?> akvuVar = a2.b;
                    if (!(r8 instanceof amxg)) {
                        throw new IllegalArgumentException("Current implementation only supports GmmEntity");
                    }
                    if (akvuVar != null) {
                        ((almp) bnulVar2).g.put((amxg) r8, akvuVar);
                    }
                    almp almpVar2 = (almp) bnulVar2;
                    almpVar2.e.add((amxg) r8);
                    almpVar2.a();
                }
                if (String.valueOf(r8.q()).length() == 0) {
                    new String("addEntity ");
                }
            }
        }
    }

    public final synchronized void c(Runnable runnable) {
        this.w.add(runnable);
    }

    public final synchronized void d(Runnable runnable) {
        this.v.add(runnable);
    }

    public final synchronized void e(Runnable runnable) {
        if (this.v.contains(runnable)) {
            this.w.add(runnable);
        }
    }

    public final synchronized void f(Runnable runnable) {
        this.v.remove(runnable);
        this.w.remove(runnable);
    }

    public final synchronized void g() {
        this.v.clear();
        this.w.clear();
    }

    public final void h(bnsa bnsaVar) {
        i(bnsaVar, null);
    }

    public final void i(bnsa bnsaVar, @dzsi akvu<?> akvuVar) {
        this.a.b(new bnsl(bnsaVar, akvuVar, true));
    }

    public final void j(bnsa bnsaVar) {
        this.a.b(new bnsl(bnsaVar, null, false));
    }

    public final void k(Runnable runnable) {
        this.y.add(runnable);
    }

    public final void l(Runnable runnable) {
        this.y.remove(runnable);
    }

    @Override // defpackage.bntd
    public final void m() {
        bntx[] bntxVarArr;
        if (bnuq.i.get() == bnuq.INVALID) {
            bnuq.i.set(bnuq.IDLE);
            bnuq.j = System.nanoTime();
            bnuq.k = 0;
            Arrays.fill(bnuq.l, 0L);
            Arrays.fill(bnuq.m, 0L);
        }
        if (this.m.a()) {
            bnun[] bnunVarArr = this.M;
            for (int i = 0; i < 15; i++) {
                bnunVarArr[i].f();
            }
            bnrk bnrkVar = this.U;
            bnrkVar.a = null;
            bnrkVar.c = 0;
            bnrkVar.d = 0;
            bnrkVar.e = 0;
            bnrkVar.f = 0;
            bnrkVar.g = 0;
            bnrkVar.h = 0;
            bnrkVar.i = 0;
            bnrkVar.j = 0;
        }
        bntz bntzVar = this.Q;
        if (bntzVar != null) {
            for (bntx bntxVar : bntzVar.l) {
                if (bntxVar != null) {
                    bntzVar.a.j(bntxVar);
                }
            }
            this.Q = null;
        }
        bntb bntbVar = this.m;
        if (bntbVar.a()) {
            bntbVar.b = -1;
            while (true) {
                bntc bntcVar = bntbVar.j;
                if (bntcVar == null) {
                    break;
                }
                bntbVar.m(bntcVar);
            }
            for (bnuu bnuuVar : bntbVar.m.values()) {
                bnuuVar.w = 0;
            }
            bnvn bnvnVar = bntbVar.k;
            if (bnvnVar != null) {
                bnvnVar.c(true);
                bntbVar.k = null;
            }
        }
        this.m.b = Process.myTid();
        bntb.a++;
        bnun[] bnunVarArr2 = this.M;
        for (int i2 = 0; i2 < 15; i2++) {
            bnunVarArr2[i2].g(this.m);
        }
        this.Q = new bntz(this, this.m);
        bnrk bnrkVar2 = this.U;
        bntb bntbVar2 = this.m;
        dbsk.l(bnrkVar2.a == null);
        bnrkVar2.a = bntbVar2;
        bnrn bnrnVar = bnrkVar2.b;
        bnrl bnrlVar = bnrnVar.d;
        int k = bntbVar2.k(bnrnVar.a, bnrnVar.b, new String[]{bnrlVar.a, bnrlVar.b, bnrlVar.c});
        bnrkVar2.c = k;
        bnrkVar2.d = bntbVar2.i(k, bnrkVar2.b.c.a);
        bnrkVar2.e = bntbVar2.i(bnrkVar2.c, bnrkVar2.b.c.b);
        bnrkVar2.f = bntbVar2.i(bnrkVar2.c, bnrkVar2.b.c.f);
        bnrkVar2.g = bntbVar2.i(bnrkVar2.c, bnrkVar2.b.c.c);
        bnrkVar2.h = bntbVar2.i(bnrkVar2.c, bnrkVar2.b.c.g);
        bnrkVar2.i = bntbVar2.i(bnrkVar2.c, bnrkVar2.b.c.d);
        bnrkVar2.j = bntbVar2.i(bnrkVar2.c, bnrkVar2.b.c.e);
        this.o = new bnuz(this.m);
        this.S = new bnri(this.m);
        this.i.i(this.m);
        this.j.i(this.m);
        this.n = new bnug(this);
        bntc f = this.m.f("dimmer");
        this.V = f;
        this.m.U(f, 1, 1, new int[]{-2142220208});
        synchronized (this) {
        }
    }

    @Override // defpackage.bntd
    public final void n() {
        synchronized (this) {
        }
    }

    @Override // defpackage.bntd
    public final bntb o() {
        return this.m;
    }

    @Override // defpackage.bntd
    public final void p(Runnable runnable) {
        this.O = runnable;
        this.a.c(runnable);
    }

    @Override // defpackage.bntd
    public final void q() {
        if (this.W.get()) {
            return;
        }
        this.P.set(true);
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
        synchronized (this) {
        }
    }

    public final boolean r() {
        return this.P.get();
    }

    public final void s(bnsa bnsaVar) {
        this.M[bnsaVar.B().p].b(bnsaVar);
        bnul bnulVar = this.l;
        if (bnulVar != null) {
            bnulVar.a();
        }
    }
}

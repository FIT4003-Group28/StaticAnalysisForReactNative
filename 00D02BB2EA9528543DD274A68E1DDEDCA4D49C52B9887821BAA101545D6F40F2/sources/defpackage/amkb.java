package defpackage;

import android.graphics.Rect;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amkb  reason: default package */
/* loaded from: classes2.dex */
public final class amkb implements amjn {
    private static final dcqe g;
    private static final amkj h;
    private final alsq D;
    private final amjk E;
    private final crzo<aktu> F;
    private final amha G;
    private volatile boolean J;
    private boolean L;
    private final boolean M;
    private alwn N;
    private final hwv O;
    private final alol P;
    public final amih a;
    public final amkg d;
    public final amjd e;
    private final dbsg<albj> i;
    private final amif k;
    private final amix o;
    private final amqv v;
    private final dzsj<akwt> w;
    private final amiw j = new amiw();
    private final amki l = new amki();
    private final List<amkk> m = new ArrayList();
    private final ArrayList<amkk> n = new ArrayList<>();
    private final List<amhh> p = dchl.a();
    private final float[] q = new float[8];
    private final Set<altv> r = dcnm.c();
    public dzjg<amhh> b = new dzjg<>();
    private final dzls s = new dzls();
    private dzjg<amhh> t = new dzjg<>();
    private final ArrayList<amhh> u = new ArrayList<>();
    public final amjy c = new amjy();
    private final Set<alhc> x = dcnm.c();
    private final Set<amkk> y = dcnm.c();
    private final Set<amkk> z = dcnm.c();
    private final Set<amkk> A = dcnm.c();
    private final Set<amkk> B = dcnm.c();
    private final Set<amkk> C = dcnm.c();
    private long I = -1;
    private volatile boolean H = false;
    public volatile boolean f = false;
    private final amjo K = new amjo();

    static {
        new akra(-1, -1);
        g = dcqe.c("amkb");
        h = new amjx();
    }

    public amkb(bnsn bnsnVar, amqv amqvVar, amkg amkgVar, amjd amjdVar, amix amixVar, alsq alsqVar, amih amihVar, alol alolVar, amjk amjkVar, dzsj dzsjVar, hwv hwvVar, dbsg dbsgVar, amif amifVar, crzo crzoVar, alwn alwnVar) {
        this.d = amkgVar;
        this.v = amqvVar;
        this.o = amixVar;
        this.D = alsqVar;
        this.w = dzsjVar;
        this.E = amjkVar;
        this.e = amjdVar;
        this.O = hwvVar;
        this.N = alwnVar;
        this.L = ((akwt) dzsjVar.a()).d();
        this.M = ((akwt) dzsjVar.a()).g();
        bnsnVar.b = amkgVar;
        this.a = amihVar;
        this.P = alolVar;
        this.i = dbsgVar;
        this.k = amifVar;
        this.G = new amks();
        this.F = crzoVar;
    }

    @dzsi
    private final amhh e(int i) {
        amhh i2 = this.b.i(i);
        if (i2 != null) {
            i2.w(1);
            return i2;
        }
        return this.a.f(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:311:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.amjz f(defpackage.amka r31, defpackage.amkk r32) {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amkb.f(amka, amkk):amjz");
    }

    private static boolean g(float f) {
        return Math.abs(f) > 20.0f;
    }

    private final amjz h(amka amkaVar, amhh amhhVar) {
        amjz i = i(amkaVar, amhhVar);
        if (!i.e) {
            this.a.d(amhhVar);
        }
        return i;
    }

    private final amjz i(amka amkaVar, amhh amhhVar) {
        amjz r = r(amkaVar, amhhVar, 1);
        if (!r.e) {
            return r;
        }
        amhhVar.e();
        if (!((amgw) amkaVar).e) {
            this.a.d(amhhVar);
            return amjz.UNPLACED;
        }
        amhh b = this.b.b(amhhVar.t());
        boolean z = r.f;
        if (b != null) {
            boolean c = this.E.c(b.t());
            if (z && !c) {
                this.e.b(b, this.E.a(b));
            }
            if (!z && c) {
                this.E.b(b.t());
                this.e.b(b, dbpy.a);
            }
            this.t.a(b.t(), b);
            return r;
        }
        if (!l(amhhVar)) {
            dbsg<amkh> dbsgVar = dbpy.a;
            if (z) {
                dbsgVar = this.E.a(amhhVar);
            }
            j(amhhVar);
            if (amhhVar.g()) {
                this.e.a(amhhVar, dbsgVar);
            }
            amhhVar.A(true);
        }
        amhhVar.w(2);
        this.t.a(amhhVar.t(), amhhVar);
        return r;
    }

    private final void j(amhh amhhVar) {
        long d = amhhVar.s().d();
        amhh i = this.s.f(d) ? this.b.i(this.s.i(d)) : null;
        if (i == null) {
            this.d.b(amhhVar);
            return;
        }
        boolean z = true;
        dbsk.l(i != amhhVar);
        this.d.c(i, amhhVar);
        int t = i.t();
        m(i, false);
        if (this.b.b(t) != i) {
            z = false;
        }
        dbsk.l(z);
        i.x(2);
    }

    private final boolean k(amhh amhhVar) {
        return this.L || !amhhVar.s().v();
    }

    private static boolean l(amhh amhhVar) {
        amkk s = amhhVar.s();
        if (!s.O() || !s.P() || (s.a().a & 2) == 0) {
            if (!(amhhVar instanceof amhv)) {
                return false;
            }
            return amhhVar.s().O() && !((amhv) amhhVar).E.isEmpty();
        }
        return true;
    }

    private final void m(amhh amhhVar, boolean z) {
        int t = amhhVar.t();
        if (amhhVar.z()) {
            if (amhhVar.g()) {
                this.e.c(amhhVar);
            }
            if (z) {
                this.d.d(amhhVar);
            }
            this.E.b(t);
            amhhVar.A(false);
        }
        this.a.e(t);
    }

    @dzsi
    private static amje n(dmpn dmpnVar, akqn akqnVar) {
        try {
            if ((dmpnVar.a & 4) != 0) {
                dmlq dmlqVar = dmpnVar.d;
                if (dmlqVar == null) {
                    dmlqVar = dmlq.e;
                }
                alvi a = alvi.a(dmlqVar, akqnVar);
                alwg.b(dmpnVar, a);
                return amje.c(a);
            }
            dmrf dmrfVar = dmpnVar.e;
            if (dmrfVar == null) {
                dmrfVar = dmrf.f;
            }
            return amje.d(akqnVar.j(dmrfVar.a, dmrfVar.b));
        } catch (IOException unused) {
            bvoo.h("The replacement label does not have a valid label position.", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r0.b >= r0.a.a()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o(defpackage.amka r4, defpackage.amkk r5, defpackage.amha r6) {
        /*
            r3 = this;
            dmpn r0 = r5.a()
            int r0 = defpackage.amks.d(r0)
            if (r0 == 0) goto L5a
            r1 = r6
            amks r1 = (defpackage.amks) r1
            dzjj<amkt> r2 = r1.a
            boolean r2 = r2.d(r0)
            if (r2 != 0) goto L16
            goto L5a
        L16:
            amkr r2 = r1.b(r5)
            if (r2 == 0) goto L36
            dzjj<amkt> r1 = r1.a
            java.lang.Object r0 = r1.i(r0)
            amkt r0 = (defpackage.amkt) r0
            dcep<amkr> r1 = r0.c
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5a
            int r1 = r0.b
            aktr r0 = r0.a
            int r0 = r0.a()
            if (r1 < r0) goto L5a
        L36:
            dbsg<albj> r4 = r3.i
            boolean r4 = r4.a()
            if (r4 == 0) goto L91
            dmpn r4 = r5.a()
            dzsj<akwt> r6 = r3.w
            java.lang.Object r6 = r6.a()
            akwt r6 = (defpackage.akwt) r6
            boolean r4 = defpackage.akxf.G(r4)
            if (r4 == 0) goto L91
            dmpn r4 = r5.a()
            int r5 = defpackage.albh.g
            r3.w(r4, r5)
            return
        L5a:
            amjz r4 = r3.f(r4, r5)
            boolean r4 = r4.e
            if (r4 == 0) goto L91
            dmpn r4 = r5.a()
            int r0 = defpackage.albh.e
            r3.w(r4, r0)
            r6.a(r5)
            dbsg<albj> r4 = r3.i
            boolean r4 = r4.a()
            if (r4 == 0) goto L91
            dmpn r4 = r5.a()
            dzsj<akwt> r6 = r3.w
            java.lang.Object r6 = r6.a()
            akwt r6 = (defpackage.akwt) r6
            boolean r4 = defpackage.akxf.G(r4)
            if (r4 == 0) goto L91
            dmpn r4 = r5.a()
            int r5 = defpackage.albh.f
            r3.w(r4, r5)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amkb.o(amka, amkk, amha):void");
    }

    private static int p(dmpn dmpnVar, int i, alwn alwnVar, amky amkyVar) {
        return Arrays.hashCode(new Object[]{dmpnVar, Integer.valueOf(i), alwnVar, amkyVar});
    }

    private static amli<amlg<amhh>> q(final boolean z) {
        return new amli(z) { // from class: amjw
            private final boolean a;

            {
                this.a = z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.amli
            public final amlh a(Object obj, Object obj2) {
                if (this.a) {
                    return amlh.IGNORE;
                }
                if (((amlg) obj).a.equals(((amlg) obj2).a)) {
                    return amlh.IGNORE;
                }
                return amlh.ENFORCE;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r1.f.b(r0, r5.O() ? defpackage.amlf.a : defpackage.amle.a, r11) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.amjz r(defpackage.amka r9, defpackage.amhh r10, int r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amkb.r(amka, amhh, int):amjz");
    }

    private final boolean s(amka amkaVar, @dzsi amhv amhvVar, boolean z, int i) {
        if (amhvVar == null) {
            return false;
        }
        amli<amlg<amhh>> q = q(z);
        amla u = amhvVar.u();
        boolean z2 = u != null && ((amgw) amkaVar).f.a(new amlg(amhvVar, u), q, i);
        if (amhvVar.E.isEmpty()) {
            return z2;
        }
        if (z2) {
            return true;
        }
        amhs amhsVar = amhvVar.z;
        if (amhsVar == null) {
            amhsVar = amhv.a;
        }
        amhp amhpVar = amhvVar.d;
        int i2 = amhpVar == null ? amhv.F : amhpVar.h;
        dcdc<alwj> dcdcVar = amhvVar.E;
        int size = dcdcVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            alwj alwjVar = dcdcVar.get(i3);
            amhs c = amhv.c(alwjVar.a());
            if (!amhsVar.equals(c)) {
                amhvVar.z = c;
                amhvVar.h(alwjVar.b());
                amgw amgwVar = (amgw) amkaVar;
                amhvVar.r(this.K, amgwVar.a);
                amla u2 = amhvVar.u();
                if (u2 != null && amgwVar.f.a(new amlg(amhvVar, u2), q, i)) {
                    return true;
                }
            }
        }
        amhvVar.z = amhsVar;
        amhvVar.h(i2);
        amhvVar.r(this.K, ((amgw) amkaVar).a);
        return false;
    }

    private final boolean t(amka amkaVar, amhh amhhVar, boolean z, int i) {
        amla u;
        boolean z2 = amhhVar instanceof amhv;
        amhv amhvVar = z2 ? (amhv) amhhVar : null;
        return (!z2 || (amhvVar != null ? s(amkaVar, amhvVar, z, i) : false)) && (u = amhhVar.u()) != null && ((amgw) amkaVar).f.b(new amlg(amhhVar, u), q(z), i);
    }

    private static boolean u(amld amldVar, amhh amhhVar, boolean z) {
        amla j = amhhVar.j();
        amla u = amhhVar.u();
        if (!j.g(amldVar.b)) {
            if (!z) {
                return false;
            }
            dbsk.s(u);
            if (!u.g(amldVar.b)) {
                return false;
            }
        }
        return true;
    }

    private final void v(List<amkk> list, int i) {
        if (this.i.a()) {
            albj b = this.i.b();
            ArrayList arrayList = new ArrayList();
            for (amkk amkkVar : list) {
                arrayList.add(amhd.a(amkkVar.a()));
            }
            b.a(i, arrayList);
        }
    }

    private final void w(dmpn dmpnVar, int i) {
        if (dmpnVar == null || !this.i.a()) {
            return;
        }
        albj b = this.i.b();
        albk a = amhd.a(dmpnVar);
        albi a2 = b.a.a(i);
        if (a2 != null) {
            a2.a.add(a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        b.a(i, arrayList);
    }

    @Override // defpackage.amjn
    public final boolean a(akzh akzhVar, amjl amjlVar, amky amkyVar, alwn alwnVar, boolean z, @dzsi amkj amkjVar, @dzsi aktx aktxVar) {
        int y;
        int z2;
        int i;
        int i2;
        amkz amkzVar;
        boolean z3;
        amku amkuVar;
        aktw c;
        akqn akqnVar;
        amje n;
        amhv amhvVar;
        boolean z4;
        boolean j;
        akwt akwtVar;
        Iterator it;
        HashSet hashSet;
        HashSet hashSet2;
        dbsk.s(amkyVar);
        dbsk.s(alwnVar);
        this.E.f.getAndIncrement();
        if (this.i.a()) {
            albj b = this.i.b();
            b.a = new albg();
            b.a.a.clear();
        }
        boolean z5 = amkyVar.e;
        akyy akyyVar = akzhVar.b;
        Rect c2 = akyyVar != null ? akyyVar.c() : null;
        if (z5) {
            dbsk.s(c2);
            i = c2.left;
            dbsk.s(c2);
            i2 = c2.top;
            dbsk.s(c2);
            y = c2.right;
            dbsk.s(c2);
            z2 = c2.bottom;
        } else {
            y = akzhVar.y() + 200;
            z2 = akzhVar.z() + 100;
            i = -200;
            i2 = -100;
        }
        if (c2 != null) {
            amkzVar = new amkz(c2.left, c2.top, c2.right, c2.bottom);
        } else {
            amkzVar = new amkz(0.0f, 0.0f, akzhVar.y(), akzhVar.z());
        }
        amkc amkcVar = new amkc(new amkz(i, i2, y, z2), amkzVar);
        amld amldVar = new amld(amkcVar.a, amkcVar.b);
        amkz amkzVar2 = amldVar.a;
        amgw amgwVar = new amgw(akzhVar, akzhVar.p().k, alwnVar, amkyVar, amldVar, this.d.g);
        alwn alwnVar2 = this.N;
        this.N = alwnVar;
        this.L = this.w.a().d();
        if (alwnVar2 != this.N || z) {
            dziz dzizVar = new dziz(((dzjd) this.b.u()).a);
            while (dzizVar.hasNext()) {
                amhh amhhVar = (amhh) ((dzjh) dzizVar.next()).getValue();
                d(amhhVar);
                amhhVar.x(2);
                dzizVar.remove();
            }
            this.a.a();
            this.k.a.a.clear();
        }
        this.E.d();
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (this.I < 0) {
            this.I = currentThreadTimeMillis;
        }
        this.s.clear();
        dzrn<amhh> a = this.b.values().a();
        while (a.hasNext()) {
            amhh next = a.next();
            long d = next.s().d();
            if (d != 0) {
                this.s.a(d, next.t());
            }
        }
        amha amhaVar = this.G;
        akwt a2 = this.w.a();
        amkz amkzVar3 = amldVar.b;
        dzjs dzjsVar = new dzjs(((dzjs) amjlVar.d).g);
        Iterator a3 = ((dzjs) amjlVar.d).k().a();
        while (a3.hasNext()) {
            dzjh dzjhVar = (dzjh) a3.next();
            int a4 = dzjhVar.a();
            aktr aktrVar = (aktr) dzjhVar.getValue();
            amks amksVar = (amks) amhaVar;
            amkt i3 = amksVar.a.i(a4);
            int e = a2.e();
            if (i3 != null) {
                akwtVar = a2;
                it = a3;
                hashSet = new HashSet(i3.d);
                hashSet.addAll(i3.c);
            } else {
                akwtVar = a2;
                it = a3;
                hashSet = new HashSet();
            }
            if (i3 != null) {
                hashSet2 = new HashSet(i3.e);
            } else {
                hashSet2 = new HashSet();
            }
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                amkr amkrVar = (amkr) it2.next();
                amgw amgwVar2 = amgwVar;
                if (amksVar.c(amkrVar.b, amkzVar3, akzhVar, e)) {
                    hashSet4.add(amkrVar);
                } else {
                    hashSet3.add(amkrVar);
                }
                amgwVar = amgwVar2;
                it2 = it3;
            }
            amgw amgwVar3 = amgwVar;
            HashSet hashSet5 = new HashSet();
            int b2 = aktrVar.b();
            int c3 = aktrVar.c();
            int a5 = aktrVar.a() + c3;
            if (b2 > 0 && c3 >= 0 && c3 <= b2) {
                hashSet2.addAll(hashSet3);
                ArrayList arrayList = new ArrayList(hashSet2);
                Collections.sort(arrayList, Collections.reverseOrder());
                int size = arrayList.size();
                int i4 = b2;
                int i5 = 0;
                while (i5 < size) {
                    int i6 = size;
                    amkr amkrVar2 = (amkr) arrayList.get(i5);
                    ArrayList arrayList2 = arrayList;
                    if (amksVar.c(amkrVar2.b, amkzVar3, akzhVar, e) && hashSet4.size() < a5) {
                        hashSet4.add(amkrVar2);
                    } else if (i4 > 0) {
                        hashSet5.add(amkrVar2);
                        i4--;
                    }
                    i5++;
                    arrayList = arrayList2;
                    size = i6;
                }
            }
            dzjsVar.a(a4, new amkt(aktrVar, hashSet4, hashSet5));
            a2 = akwtVar;
            a3 = it;
            amgwVar = amgwVar3;
        }
        amgw amgwVar4 = amgwVar;
        ((amks) amhaVar).a = dzjsVar;
        akqk t = akyx.t(akzhVar, amkzVar2.a, amkzVar2.c, amkzVar2.b, amkzVar2.d, this.q);
        akrp akrpVar = t != null ? t.b : null;
        aksj c4 = akrpVar != null ? aksj.c(akrpVar) : null;
        this.H = false;
        this.r.clear();
        List<amhf> list = amjlVar.e;
        if (!list.isEmpty()) {
            for (amhf amhfVar : list) {
                synchronized (amhfVar.b) {
                    amhg amhgVar = amhfVar.a;
                    if (amhgVar != null) {
                        amhgVar.f.a();
                        if (!this.t.d(amhgVar.g)) {
                            amgw amgwVar5 = amgwVar4;
                            if (amhgVar.f.ab(amgwVar5.b)) {
                                amhh e2 = e(amhgVar.g);
                                if (e2 == null || e2 == amhgVar) {
                                    if (e2 == null) {
                                        amhgVar.w(1);
                                    }
                                    if (amhfVar.c) {
                                        this.K.f.a(amhfVar.d);
                                        amhfVar.c = false;
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        aktb aktbVar = this.K.f;
                                        akra akraVar = aktbVar.a;
                                        dmlo dmloVar = aktbVar.b;
                                        amhgVar.e.acquireUninterruptibly();
                                        try {
                                            amhgVar.i(akraVar);
                                            amhgVar.c = 1.0f;
                                            if (amhgVar.b != dmloVar) {
                                                amhgVar.b = dmloVar;
                                                if (amhgVar.d() && (amkuVar = amhgVar.d) != null) {
                                                    amkuVar.b(dmloVar);
                                                }
                                                amhgVar.a = true;
                                            }
                                        } finally {
                                            amhgVar.e.release();
                                        }
                                    }
                                    h(amgwVar5, amhgVar);
                                    amhgVar.x(1);
                                } else {
                                    e2.x(1);
                                }
                            }
                            amgwVar4 = amgwVar5;
                        }
                    }
                }
            }
        }
        amgw amgwVar6 = amgwVar4;
        akra akraVar2 = new akra();
        amkj amkjVar2 = amkjVar == null ? h : amkjVar;
        this.l.a = amgwVar6.g();
        this.l.b.clear();
        this.m.clear();
        v(amjlVar.b, albh.a);
        for (amkk amkkVar : amjlVar.b) {
            if (!amkkVar.q() && c4 != null) {
                if (amkkVar.i().f()) {
                    akwf c5 = this.P.c(amkkVar.a());
                    if (c5 == null || (c5.a & 1) == 0) {
                        alvi a6 = amkkVar.i().a();
                        dbsk.s(a6);
                        j = c4.j(a6.a);
                    } else {
                        dhjz dhjzVar = c5.b;
                        if (dhjzVar == null) {
                            dhjzVar = dhjz.e;
                        }
                        double d2 = dhjzVar.c;
                        dhjz dhjzVar2 = c5.b;
                        if (dhjzVar2 == null) {
                            dhjzVar2 = dhjz.e;
                        }
                        akraVar2.u(d2, dhjzVar2.b);
                        j = c4.j(akraVar2);
                    }
                } else if (amkkVar.i().g()) {
                    akrk b3 = amkkVar.i().b();
                    dbsk.s(b3);
                    j = c4.o(b3.a());
                }
                if (!j) {
                }
            }
            if (amkkVar.U()) {
                this.l.b.add(amkkVar);
            } else {
                this.m.add(amkkVar);
            }
        }
        List<amkk> list2 = this.m;
        List<amkk> list3 = this.l.b;
        int i7 = albh.b;
        if (this.i.a()) {
            ArrayList arrayList3 = new ArrayList(list2);
            arrayList3.addAll(list3);
            v(arrayList3, i7);
        }
        amkjVar2.a(this.l);
        this.n.clear();
        this.n.ensureCapacity(this.m.size());
        amiw amiwVar = this.j;
        List<amkk> list4 = this.m;
        ArrayList<amkk> arrayList4 = this.n;
        for (int i8 = 0; i8 < list4.size(); i8++) {
            amkk amkkVar2 = list4.get(i8);
            if (!amkkVar2.h().a()) {
                arrayList4.add(amkkVar2);
            } else {
                amiwVar.a.add(amkkVar2);
            }
        }
        Collections.sort(amiwVar.a, amiv.a);
        int i9 = 0;
        while (i9 < amiwVar.a.size()) {
            String b4 = amiwVar.a.get(i9).h().b();
            int i10 = i9 + 1;
            while (i10 < amiwVar.a.size() && b4.equals(amiwVar.a.get(i10).h().b())) {
                i10++;
            }
            amiwVar.b.clear();
            while (i9 < i10) {
                amiwVar.b.add(amiwVar.a.get(i9));
                i9++;
            }
            amkjVar2.c(amiwVar.b, arrayList4);
            i9 = i10;
        }
        amiwVar.a.clear();
        amkjVar2.b(this.n);
        v(this.n, albh.c);
        List<dmrt> list5 = amjlVar.a;
        if (aktxVar != null && aktxVar.a() != null) {
            dmrt a7 = aktxVar.a();
            dccx G = dcdc.G(amjlVar.a.size() + 1);
            G.i(amjlVar.a);
            G.g(a7);
            list5 = G.f();
        }
        this.k.b(this.n, amgwVar6.g(), list5);
        int i11 = 0;
        while (i11 < this.n.size()) {
            if (this.n.get(i11).ab(amgwVar6.b)) {
                i11++;
            } else {
                int size2 = this.n.size() - 1;
                ArrayList<amkk> arrayList5 = this.n;
                arrayList5.set(i11, arrayList5.get(size2));
                this.n.remove(size2);
            }
        }
        final akwt a8 = this.w.a();
        ArrayList<amkk> arrayList6 = this.n;
        Collections.sort(arrayList6, Collections.reverseOrder(new amjg(arrayList6, new dbsl(a8) { // from class: amjq
            private final akwt a;

            {
                this.a = a8;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.a() && !((amkk) obj).y();
            }
        })));
        v(this.n, albh.d);
        ArrayList arrayList7 = new ArrayList(this.n.size());
        amkk amkkVar3 = null;
        for (int i12 = 0; i12 < this.n.size(); i12++) {
            amkk amkkVar4 = this.n.get(i12);
            if (amkkVar4.ab(amgwVar6.b)) {
                dmpn a9 = amkkVar4.a();
                Iterator<dbsl<dmpn>> it4 = amjlVar.c.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (it4.next().a(a9)) {
                            break;
                        }
                    } else {
                        if (amkkVar3 == null && aktxVar != null) {
                            dmpn a10 = amkkVar4.a();
                            amkkVar4.c();
                            if (aktxVar.d(a10)) {
                                if (amkkVar4.i().f()) {
                                    dbsk.s(amkkVar4.i().a());
                                }
                                aktw b5 = aktxVar.b(amkkVar4.a(), amkkVar4.c(), amgwVar6.b);
                                akqn akqnVar2 = b5.c;
                                amje n2 = akqnVar2 == null ? null : n(b5.a, akqnVar2);
                                if (n2 == null) {
                                    n2 = amkkVar4.i();
                                }
                                amkn ad = amkn.ad(b5.a, b5.b, n2);
                                if (n2 != null) {
                                    if (b5.d) {
                                        o(amgwVar6, ad, this.G);
                                    } else {
                                        arrayList7.add(ad);
                                    }
                                }
                                amkkVar3 = amkkVar4;
                            }
                        }
                        arrayList7.add(amkkVar4);
                    }
                }
            }
        }
        Iterator it5 = arrayList7.iterator();
        while (!this.H && it5.hasNext()) {
            amkk amkkVar5 = (amkk) it5.next();
            if (!amkkVar5.O()) {
                break;
            }
            o(amgwVar6, amkkVar5, this.G);
        }
        Iterator it6 = arrayList7.iterator();
        while (!this.H && it6.hasNext()) {
            amkk amkkVar6 = (amkk) it6.next();
            if (amkkVar6.O()) {
                amhh i13 = this.t.i(p(amkkVar6.a(), amgwVar6.g(), amgwVar6.c, amgwVar6.d));
                if ((i13 instanceof amhv) && (amhvVar = (amhv) i13) != null && l(amhvVar)) {
                    if (!k(i13) || amhvVar.u() == null) {
                        z4 = false;
                    } else {
                        z4 = t(amgwVar6, amhvVar, false, 1);
                        amhvVar.B = z4;
                    }
                    if (!amhvVar.p) {
                        dbsg<amkh> dbsgVar = dbpy.a;
                        if (u(amgwVar6.f, amhvVar, z4)) {
                            dbsgVar = this.E.a(amhvVar);
                        }
                        j(amhvVar);
                        if (amhvVar.A) {
                            this.e.a(amhvVar, dbsgVar);
                        }
                        amhvVar.p = true;
                    }
                }
            } else {
                o(amgwVar6, amkkVar6, this.G);
            }
        }
        boolean z6 = !it6.hasNext();
        if (z6) {
            this.f = true;
            if (amkkVar3 != null && aktxVar != null && (c = aktxVar.c()) != null && (akqnVar = c.c) != null && (n = n(c.a, akqnVar)) != null) {
                amkk ad2 = amkn.ad(c.a, c.b, n);
                if (f(amgwVar6, ad2).e) {
                    this.G.a(ad2);
                }
            }
        }
        this.D.e(this.r);
        if (z6) {
            dzrn<amhh> a11 = this.b.values().a();
            while (a11.hasNext()) {
                d(a11.next());
            }
        } else {
            this.p.addAll(this.b.values());
            int size3 = this.p.size();
            for (int i14 = 0; i14 < size3; i14++) {
                amhh amhhVar2 = this.p.get(i14);
                amhhVar2.w(1);
                if (amhhVar2 instanceof amhg) {
                    d(amhhVar2);
                } else if (!i(amgwVar6, amhhVar2).e) {
                    d(amhhVar2);
                }
                amhhVar2.x(1);
            }
            this.p.clear();
        }
        for (int i15 = 0; i15 < this.u.size(); i15++) {
            this.u.get(i15).x(1);
        }
        this.u.clear();
        c();
        dzjg<amhh> dzjgVar = this.b;
        this.b = this.t;
        this.t = dzjgVar;
        dzjgVar.clear();
        this.c.a(this.b.values());
        int i16 = this.b.j;
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        long j2 = this.I;
        long j3 = currentThreadTimeMillis2 - j2;
        if (j2 > 0 && j3 > TimeUnit.SECONDS.toMillis(20L)) {
            if (!z6) {
                dcqe.b.u(TimeUnit.SECONDS);
                TimeUnit.MILLISECONDS.toSeconds(j3);
            } else {
                TimeUnit.MILLISECONDS.toSeconds(j3);
            }
        }
        if (z6) {
            this.I = -1L;
        }
        if (z6 && this.x.size() > 0) {
            if (this.v.a()) {
                this.O.a.b(new alhd(dchl.c(this.x)));
            }
            this.x.clear();
        }
        if (z6) {
            crzo<aktu> crzoVar = this.F;
            dcep L = dcep.L(dcft.o(this.y, amjr.a));
            dcep L2 = dcep.L(dcft.o(this.B, amjs.a));
            dcep.L(dcft.o(this.C, amjt.a));
            dcep.L(dcft.o(this.z, amju.a));
            crzoVar.a(new aktu(L, L2, dcep.L(dcft.o(this.A, amjv.a))));
        }
        if (this.i.a()) {
            v(new ArrayList<>(this.y), albh.i);
            v(new ArrayList<>(this.B), albh.j);
            v(new ArrayList<>(this.z), albh.h);
            v(new ArrayList<>(this.C), albh.k);
        }
        this.y.clear();
        this.B.clear();
        this.C.clear();
        this.z.clear();
        this.A.clear();
        if (this.i.a()) {
            albj b6 = this.i.b();
            if (b6.a != null) {
                albg.b.f(eaol.a());
                if (z6) {
                    albg albgVar = b6.a;
                    albi a12 = albgVar.a(albh.i);
                    albi a13 = albgVar.a(albh.j);
                    a12.a.isEmpty();
                    a13.a.isEmpty();
                }
            }
            b6.a = null;
        }
        return z6;
    }

    @Override // defpackage.amjn
    public final void b() {
        this.H = true;
    }

    public final void c() {
        int i;
        while (true) {
            dzjg<amhh> dzjgVar = this.b;
            int i2 = dzjgVar.j;
            if (i2 > 0) {
                int i3 = dzjgVar.e;
                long[] jArr = dzjgVar.g;
                int i4 = (int) jArr[i3];
                dzjgVar.e = i4;
                if (i4 >= 0) {
                    jArr[i4] = jArr[i4] | (-4294967296L);
                }
                dzjgVar.j = i2 - 1;
                amhh[] amhhVarArr = dzjgVar.b;
                amhh amhhVar = amhhVarArr[i3];
                int i5 = dzjgVar.h;
                if (i3 == i5) {
                    dzjgVar.d = false;
                    amhhVarArr[i5] = null;
                } else {
                    dzjgVar.m(i3);
                }
                if (dzjgVar.j < dzjgVar.i / 4 && (i = dzjgVar.h) > 16) {
                    dzjgVar.s(i >> 1);
                }
                amhhVar.x(2);
            } else {
                return;
            }
        }
    }

    public final void d(amhh amhhVar) {
        m(amhhVar, true);
    }
}

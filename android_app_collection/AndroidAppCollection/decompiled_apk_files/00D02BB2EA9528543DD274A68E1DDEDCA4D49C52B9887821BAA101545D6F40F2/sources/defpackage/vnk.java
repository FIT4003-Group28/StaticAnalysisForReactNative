package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vnk  reason: default package */
/* loaded from: classes7.dex */
public class vnk implements Serializable {
    private static final dcqe k = dcqe.c("vnk");
    @dzsi
    private String F;
    @dzsi
    private crmw G;
    @dzsi
    private transient dnqh H;
    @dzsi
    private Integer J;
    @dzsi
    private transient String K;
    private boolean L;
    private boolean M;
    public bvrt<dwao> b;
    @dzsi
    public dowa c;
    @dzsi
    public String d;
    @dzsi
    public dspd e;
    @dzsi
    public String f;
    @dzsi
    public transient vun h;
    private dcdc<vnu> l;
    @dzsi
    private bvrt<dtaq> m;
    @dzsi
    private bvrt<duqc> n;
    private bvrt<yiv> o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean t;
    public dcdc<vpa> a = dcdc.g(vpa.c(), vpa.c());
    private EnumSet<dpjs> s = EnumSet.noneOf(dpjs.class);
    private vlu u = vlu.UNKNOWN;
    @dzsi
    public bvrt<dhjx> g = null;
    private boolean v = true;
    private qbs w = qbs.DEFAULT;
    private qbs x = qbs.DEFAULT;
    private vnj y = vnj.NO_SEARCH;
    private vnj z = vnj.NO_SEARCH;
    private int A = -1;
    private int B = -1;
    private boolean C = false;
    private int N = 1;
    private vni D = vni.NONE;
    private final Set<vni> E = EnumSet.noneOf(vni.class);
    private boolean I = false;
    public boolean i = false;
    public bvrt<douz> j = bvrt.b(douz.g);

    public vnk(dcdc<vnu> dcdcVar) {
        this.l = dcdcVar;
        dwao bx = bx(!dcdcVar.isEmpty() ? this.l.get(0).a() : dqvj.DRIVE);
        this.b = bvrt.b(bx);
        this.o = bvrt.b(yze.b(bx));
    }

    public static dwao a(dwao dwaoVar, dqvj dqvjVar) {
        dwal ca = dwao.R.ca(dwaoVar);
        dphq dphqVar = dwaoVar.e;
        if (dphqVar == null) {
            dphqVar = dphq.m;
        }
        dphm ca2 = dphq.m.ca(dphqVar);
        if (ca2.c) {
            ca2.bF();
            ca2.c = false;
        }
        dphq dphqVar2 = (dphq) ca2.b;
        dphqVar2.b = dqvjVar.k;
        dphqVar2.a |= 1;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwao dwaoVar2 = (dwao) ca.b;
        dphq bK = ca2.bK();
        bK.getClass();
        dwaoVar2.e = bK;
        dwaoVar2.a |= 1;
        return ca.bK();
    }

    private final synchronized boolean bA(int i) {
        dbsk.z(i, this.a.size());
        return this.a.get(i).a(g()).y;
    }

    @dzsi
    private final synchronized amvh bB() {
        for (int i = 0; i < this.a.size(); i++) {
            amvh amvhVar = this.a.get(i).a;
            if (!amvhVar.c() && amvj.h(amvhVar.b) && !this.s.contains(amvhVar.b)) {
                return amvhVar;
            }
        }
        return null;
    }

    private final vpa bC(vpa vpaVar) {
        amvh amvhVar = vpaVar.a;
        if (amvhVar == null || !amvhVar.k()) {
            return vpaVar;
        }
        amvg amvgVar = new amvg(amvhVar);
        dtaq f = f();
        if (f != null) {
            if ((f.a & 512) != 0) {
                dtai dtaiVar = f.i;
                if (dtaiVar == null) {
                    dtaiVar = dtai.d;
                }
                amvgVar.c = akqi.l(dtaiVar);
            }
            if ((f.a & 16) != 0) {
                dtak dtakVar = f.e;
                if (dtakVar == null) {
                    dtakVar = dtak.d;
                }
                amvgVar.d = akqq.l(dtakVar);
            }
            dtao dtaoVar = f.l;
            if (dtaoVar == null) {
                dtaoVar = dtao.e;
            }
            if ((dtaoVar.a & 512) != 0) {
                dtao dtaoVar2 = f.l;
                if (dtaoVar2 == null) {
                    dtaoVar2 = dtao.e;
                }
                amvgVar.r = dtaoVar2.d;
            }
            amvgVar.i = altv.e(f);
        }
        return new vpa(amvgVar.a(), amvh.a);
    }

    private final synchronized void bD(dqvj dqvjVar) {
        this.b = bvrt.b(a(h(), dqvjVar));
        this.C = false;
    }

    private final int bE() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (this.a.get(i).a(g()).a()) {
                return i;
            }
        }
        return -1;
    }

    private final synchronized void bF() {
        ArrayList arrayList = new ArrayList();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            vpa vpaVar = this.a.get(i);
            if (!vpaVar.a.y) {
                arrayList.add(vpaVar);
            }
        }
        bG(arrayList);
        this.a = dcdc.r(arrayList);
    }

    private static void bG(List<vpa> list) {
        while (list.size() < 2) {
            list.add(vpa.c());
        }
    }

    private static dwao bx(dqvj dqvjVar) {
        dwal bZ = dwao.R.bZ();
        dphm bZ2 = dphq.m.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dphq dphqVar = (dphq) bZ2.b;
        dphqVar.b = dqvjVar.k;
        dphqVar.a |= 1;
        dphq dphqVar2 = (dphq) bZ2.b;
        dphqVar2.c = 3;
        dphqVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwao dwaoVar = (dwao) bZ.b;
        dphq bK = bZ2.bK();
        bK.getClass();
        dwaoVar.e = bK;
        dwaoVar.a |= 1;
        return bZ.bK();
    }

    private final synchronized void by(vpa vpaVar, int i) {
        dbsk.z(i, this.a.size());
        dqvj g = g();
        amvh a = this.a.get(i).a(g);
        dbsk.b(!a.y, "Cannot replace a synthesized parking waypoint with a new waypoint");
        dccx F = dcdc.F();
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == i) {
                F.g(vpaVar);
            } else {
                F.g(this.a.get(i2));
            }
        }
        this.a = F.f();
        amvh a2 = vpaVar.a(g);
        if (a.y() && !a.z().equals(a2.z())) {
            bz(i - 1);
        }
        if (i > 0) {
            this.D = vni.NONE;
        }
    }

    private final void bz(int i) {
        if (i < 0 || !bA(i)) {
            return;
        }
        aL(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<vnu> n(vnu vnuVar, dcdc<vnu> dcdcVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            vnu vnuVar2 = dcdcVar.get(i);
            if (vnuVar2.l(vnuVar)) {
                F.g(vnuVar);
            } else {
                F.g(vnuVar2);
            }
        }
        return F.f();
    }

    public final synchronized void A(amvh amvhVar, amvh amvhVar2, int i, @dzsi ddgg ddggVar) {
        dbsk.z(i, this.a.size());
        vpa bC = bC(new vpa(amvhVar, amvhVar2));
        if (!amvhVar2.a()) {
            bC.d();
        }
        bC.b(ddggVar);
        by(bC, i);
    }

    public final synchronized void B(amvh amvhVar, int i) {
        A(amvhVar, amvh.a, i, null);
    }

    public final synchronized void C(int i) {
        this.a.get(i).d();
    }

    public final synchronized boolean D(int i) {
        return this.a.get(i).c;
    }

    public final synchronized boolean E(int i) {
        boolean z;
        vpa vpaVar = this.a.get(i);
        if (vpaVar.c && !vpaVar.b.a()) {
            if (!vpaVar.a.equals(vpaVar.b)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized void F(amte amteVar) {
        amvh[] amvhVarArr;
        ArrayList arrayList = new ArrayList();
        if (aY()) {
            for (int i = 0; i < this.a.size(); i++) {
                if (this.a.get(i).a.a()) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        aK(false);
        bF();
        if (amteVar.d() == dqvj.DRIVE && amteVar.c.length == amteVar.a.l()) {
            amvhVarArr = amuc.b(amteVar.c, amteVar.a.k().get(amteVar.c.length - 1));
        } else {
            amvhVarArr = amteVar.c;
        }
        ArrayList arrayList2 = new ArrayList();
        dqvj d = amteVar.d();
        int i2 = 0;
        for (amvh amvhVar : amvhVarArr) {
            if (amvhVar != null) {
                if (amvhVar.y) {
                    arrayList2.add(new vpa(amvhVar, amvh.a));
                } else {
                    if (!this.a.get(i2).c || !vxx.a.contains(d)) {
                        if (!this.a.get(i2).c) {
                            this.a.get(i2).a = amvhVar;
                        }
                    } else {
                        this.a.get(i2).b = amvhVar;
                    }
                    arrayList2.add(this.a.get(i2));
                    i2++;
                }
            }
        }
        bG(arrayList2);
        this.a = dcdc.r(arrayList2);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                I(Math.min(((Integer) arrayList.get(i3)).intValue(), this.a.size()));
            }
        }
    }

    public final synchronized boolean G() {
        dcdc<vpa> dcdcVar = this.a;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dcdcVar.get(i).a.J()) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    @dzsi
    public final synchronized dndp H() {
        amvh bB = bB();
        if (bB == null) {
            return null;
        }
        dpjs dpjsVar = bB.b;
        if (!amvj.h(dpjsVar)) {
            return null;
        }
        aa(dpjsVar);
        dndr f = amvj.f(dpjsVar);
        if (f == null) {
            return null;
        }
        dndo bZ = dndp.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dndp dndpVar = (dndp) bZ.b;
        dndpVar.a |= 4;
        dndpVar.d = true;
        dndi bZ2 = dndj.e.bZ();
        dndk bZ3 = dndl.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dndl dndlVar = (dndl) bZ3.b;
        dndlVar.b = f.h;
        dndlVar.a |= 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dndj dndjVar = (dndj) bZ2.b;
        dndl bK = bZ3.bK();
        bK.getClass();
        dndjVar.b = bK;
        dndjVar.a = 1 | dndjVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dndp dndpVar2 = (dndp) bZ.b;
        dndj bK2 = bZ2.bK();
        bK2.getClass();
        dsrj<dndj> dsrjVar = dndpVar2.e;
        if (!dsrjVar.a()) {
            dndpVar2.e = dsqw.cl(dsrjVar);
        }
        dndpVar2.e.add(bK2);
        return bZ.bK();
    }

    public final synchronized void I(int i) {
        dbsk.a(i >= 0);
        ArrayList arrayList = new ArrayList(this.a);
        arrayList.add(i, vpa.c());
        this.D = vni.NONE;
        this.a = dcdc.r(arrayList);
    }

    public final synchronized void J(List<amvh> list) {
        amvj.k(list.size());
        ArrayList arrayList = new ArrayList();
        for (amvh amvhVar : list) {
            arrayList.add(new vpa(amvhVar, amvh.a));
        }
        this.D = vni.NONE;
        bG(arrayList);
        this.a = dcdc.r(arrayList);
    }

    public final synchronized void K(@dzsi dtaq dtaqVar) {
        this.m = bvrt.a(dtaqVar);
        dccx F = dcdc.F();
        dcdc<vpa> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(bC(dcdcVar.get(i)));
        }
        this.a = F.f();
    }

    public final synchronized void L(Context context) {
        dccx F = dcdc.F();
        dcdc<vpa> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            vpa vpaVar = dcdcVar.get(i);
            amvh amvhVar = vpaVar.a;
            if (amvhVar.k()) {
                if (!amvhVar.l || amvhVar.D()) {
                    F.g(bC(new vpa(amvh.i(context), amvh.a)));
                } else {
                    F.g(vpaVar);
                }
            } else {
                F.g(vpaVar);
            }
        }
        this.a = F.f();
    }

    public final synchronized void M(@dzsi duqc duqcVar) {
        this.n = bvrt.a(duqcVar);
    }

    public final synchronized void N(yiv yivVar) {
        this.o = bvrt.b(yivVar);
    }

    public final synchronized void O(boolean z) {
        this.p = z;
    }

    public final synchronized boolean P() {
        return this.p;
    }

    public final synchronized void Q(@dzsi crmw crmwVar) {
        this.G = crmwVar;
    }

    public final synchronized void R(dwao dwaoVar) {
        dqvj g = g();
        this.b = bvrt.b(dwaoVar);
        if (g != g()) {
            this.C = false;
            amte p = l().d().p();
            if (p != null) {
                F(p);
            }
        }
    }

    public final synchronized void S(List<vnu> list) {
        dbsk.a(!list.isEmpty());
        this.l = dcdc.r(list);
        if (!aX(g())) {
            bD(list.get(0).a());
        }
    }

    public final synchronized void T(qbs qbsVar) {
        this.w = qbsVar;
        this.x = qbsVar;
    }

    public final synchronized void U(qbs qbsVar) {
        this.x = qbsVar;
    }

    public final synchronized void V() {
        if (this.x != qbs.DEFAULT && !l().d().a()) {
            boolean z = false;
            if ((this.x != qbs.TRANSIT_TRIP_DETAILS || g() == dqvj.TRANSIT) && (this.x != qbs.NAVIGATION || vxx.f(g()))) {
                z = true;
            }
            amsy aS = aS();
            if (z && aS != null && aS.n() > 0 && aS.t()) {
                return;
            }
            U(qbs.DEFAULT);
        }
    }

    public final synchronized void W(boolean z) {
        this.q = z;
    }

    public final synchronized boolean X() {
        return this.q;
    }

    public final synchronized void Y(boolean z) {
        this.r = z;
    }

    public final synchronized boolean Z() {
        return this.r;
    }

    public final synchronized vlu aA() {
        return this.u;
    }

    public final synchronized void aB(@dzsi amte amteVar) {
        if (amteVar == null) {
            this.u = vlu.UNKNOWN;
        } else {
            this.u = vyb.L(amteVar.a.d) ? vlu.JAPAN : vlu.NOT_JAPAN;
        }
    }

    public final synchronized boolean aC() {
        boolean z;
        if (aE() != -1 || !aF()) {
            z = false;
        } else {
            I(this.a.size());
            z = true;
        }
        return z;
    }

    public final synchronized dbsg<Integer> aD() {
        aK(false);
        if (!aF()) {
            return dbpy.a;
        }
        int size = this.a.size() - 1;
        I(size);
        return dbsg.i(Integer.valueOf(size));
    }

    public final synchronized int aE() {
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i).a(g()).a()) {
                return i;
            }
        }
        return -1;
    }

    public final synchronized boolean aF() {
        return this.a.size() < 10;
    }

    public final synchronized int aG() {
        return this.a.size();
    }

    public final synchronized int aH() {
        int aE = aE();
        if (aE != -1) {
            return aE;
        }
        if (!aF()) {
            return -1;
        }
        int max = Math.max(0, this.a.size());
        I(max);
        return max;
    }

    public final synchronized void aI() {
        bF();
        dcdc<vpa> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            vpa vpaVar = dcdcVar.get(i);
            vpaVar.a = vyr.b(vpaVar.a);
            vpaVar.b = vyr.b(vpaVar.b);
        }
    }

    public final synchronized void aJ(int i) {
        int i2 = i + 1;
        dbsk.z(i2, this.a.size());
        vpa vpaVar = this.a.get(i2);
        vpaVar.a = vyr.b(vpaVar.a);
        vpaVar.b = vyr.b(vpaVar.b);
        bz(i);
    }

    public final synchronized void aK(boolean z) {
        ArrayList arrayList = new ArrayList();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            vpa vpaVar = this.a.get(i);
            if (!vpaVar.a.a()) {
                arrayList.add(vpaVar);
            } else if (z && (i == 0 || i == size - 1)) {
                arrayList.add(vpaVar);
            }
        }
        bG(arrayList);
        this.a = dcdc.r(arrayList);
    }

    public final synchronized void aL(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            int i3 = i - 1;
            if ((i2 != i3 || !bA(i3)) && i2 != i) {
                arrayList.add(this.a.get(i2));
            }
        }
        bG(arrayList);
        this.a = dcdc.r(arrayList);
    }

    @dzsi
    public final synchronized dhjx aM() {
        return (dhjx) bvrt.f(this.g, (dssr) dhjx.f.cu(7), dhjx.f);
    }

    public final synchronized void aN(@dzsi dhjx dhjxVar) {
        this.g = bvrt.a(dhjxVar);
    }

    public final synchronized vni aO() {
        return this.D;
    }

    public final synchronized void aP(vni vniVar) {
        this.D = vniVar;
    }

    public final synchronized boolean aQ(vni vniVar) {
        return this.E.contains(vniVar);
    }

    public final synchronized void aR() {
        if (this.D != vni.NONE) {
            this.E.add(this.D);
        }
    }

    @dzsi
    public final synchronized amsy aS() {
        amte p = l().d().p();
        if (p == null) {
            return null;
        }
        return p.a;
    }

    @dzsi
    public final djiq aT() {
        amsy aS = aS();
        if (aS == null || (aS.a().a & 64) == 0) {
            return null;
        }
        djiq djiqVar = aS.a().e;
        return djiqVar == null ? djiq.d : djiqVar;
    }

    @dzsi
    public final synchronized amub aU(Context context) {
        amte p = l().d().p();
        if (p == null) {
            return null;
        }
        return p.b(l().d().e(), context);
    }

    @dzsi
    public final synchronized amve aV(Context context) {
        amub aU = aU(context);
        if (aU == null) {
            return null;
        }
        return aU.d;
    }

    public final int aW(dqvj dqvjVar) {
        return dcft.n(r(), new vnh(dqvjVar));
    }

    public final boolean aX(dqvj dqvjVar) {
        return aW(dqvjVar) != -1;
    }

    public final boolean aY() {
        return bu() != 1;
    }

    public final synchronized boolean aZ(@dzsi btlu btluVar) {
        String str;
        String h;
        str = this.F;
        h = btlu.h(btluVar);
        this.F = h;
        return !dbsd.a(str, h);
    }

    public final synchronized void aa(dpjs dpjsVar) {
        this.s.add(dpjsVar);
    }

    public final synchronized dcep<dpjs> ab() {
        return dcep.K(this.s);
    }

    public final synchronized void ac(boolean z) {
        this.t = z;
    }

    public final synchronized boolean ad() {
        return this.t;
    }

    @dzsi
    public final synchronized vun ae() {
        return this.h;
    }

    public final synchronized void af(@dzsi vun vunVar) {
        this.h = vunVar;
    }

    public final synchronized void ag() {
        this.C = true;
    }

    public final synchronized boolean ah() {
        return this.C;
    }

    public final synchronized vnj ai() {
        return this.y;
    }

    public final synchronized vnj aj() {
        return this.z;
    }

    public final synchronized void ak(int i) {
        this.A = i;
    }

    public final synchronized int al() {
        return this.A;
    }

    public final synchronized void am(vnj vnjVar) {
        this.z = this.y;
        this.y = vnjVar;
    }

    public final synchronized void an(int i) {
        this.B = i;
    }

    public final synchronized dbsg<Integer> ao() {
        int bE;
        bE = bE();
        return bE >= 0 ? dbsg.i(Integer.valueOf(bE)) : dbpy.a;
    }

    @dzsi
    public final synchronized dtja ap() {
        if (bE() != -1) {
            return bwnd.c(g());
        }
        return null;
    }

    @dzsi
    public final synchronized dtjs aq() {
        int bE = bE();
        if (bE >= 0 && bE < this.a.size()) {
            return ar(bE);
        }
        return null;
    }

    public final synchronized dtjs ar(int i) {
        if (i == 0) {
            return dtjs.SOURCE;
        } else if (i != this.a.size() - 1) {
            boolean z = false;
            boolean z2 = false;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                if (!this.a.get(i2).a.a()) {
                    if (i2 < i) {
                        z = true;
                    } else if (i2 > i) {
                        z2 = true;
                    }
                }
            }
            if (!z) {
                return dtjs.SOURCE;
            } else if (!z2) {
                return dtjs.DESTINATION;
            } else {
                return dtjs.VIA;
            }
        } else {
            return dtjs.DESTINATION;
        }
    }

    public final synchronized bxla as() {
        return at(bE());
    }

    public final synchronized bxla at(int i) {
        if (i >= 0) {
            if (i < this.a.size()) {
                if (i == 0) {
                    return bxla.START_LOCATION;
                } else if (i == this.a.size() - 1) {
                    return bxla.END_LOCATION;
                } else {
                    return bxla.VIA_LOCATION;
                }
            }
        }
        return bxla.UNKNOWN;
    }

    public final synchronized dtjt au() {
        dtjq bZ;
        bZ = dtjt.e.bZ();
        dtju bZ2 = dtjv.d.bZ();
        dqvj g = g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtjv dtjvVar = (dtjv) bZ2.b;
        dtjvVar.b = g.k;
        dtjvVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtjt dtjtVar = (dtjt) bZ.b;
        dtjv bK = bZ2.bK();
        bK.getClass();
        dtjtVar.b = bK;
        dtjtVar.a |= 1;
        dccx F = dcdc.F();
        dcdc<vpa> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(bwnd.e(dcdcVar.get(i).a(g())));
        }
        bZ.a(F.f());
        return bZ.bK();
    }

    public final synchronized dtjt av(int i) {
        dtjq bZ;
        amvh a;
        bZ = dtjt.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtjt dtjtVar = (dtjt) bZ.b;
        dtjtVar.a |= 2;
        dtjtVar.d = i;
        dtju bZ2 = dtjv.d.bZ();
        dqvj g = g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtjv dtjvVar = (dtjv) bZ2.b;
        dtjvVar.b = g.k;
        dtjvVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtjt dtjtVar2 = (dtjt) bZ.b;
        dtjv bK = bZ2.bK();
        bK.getClass();
        dtjtVar2.b = bK;
        dtjtVar2.a |= 1;
        dccx F = dcdc.F();
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (i2 == i) {
                a = amvh.a;
            } else {
                a = this.a.get(i2).a(g());
            }
            F.g(bwnd.e(a));
        }
        bZ.a(F.f());
        return bZ.bK();
    }

    public final synchronized dcdc<amvh> aw() {
        dccx F;
        F = dcdc.F();
        dcdc<vpa> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(dcdcVar.get(i).a(g()));
        }
        return F.f();
    }

    @dzsi
    public final synchronized dnqh ax() {
        return this.H;
    }

    public final synchronized void ay(@dzsi dnqh dnqhVar) {
        this.H = dnqhVar;
    }

    public final void az() {
        ay(null);
    }

    public final synchronized void b(vnk vnkVar) {
        synchronized (vnkVar) {
            this.m = vnkVar.m;
            this.b = vnkVar.b;
            this.n = vnkVar.n;
            this.o = vnkVar.o;
            this.v = vnkVar.v;
            this.w = vnkVar.w;
            this.x = vnkVar.x;
            this.c = vnkVar.c;
            this.d = vnkVar.d;
            this.e = vnkVar.e;
            this.f = vnkVar.f;
            this.C = vnkVar.C;
            this.u = vnkVar.u;
            this.g = vnkVar.g;
            this.q = vnkVar.q;
            this.p = vnkVar.p;
            this.r = vnkVar.r;
            this.t = vnkVar.t;
            this.l = vnkVar.l;
            this.N = vnkVar.N;
            this.D = vnkVar.D;
            this.y = vnkVar.y;
            this.A = vnkVar.A;
            this.B = vnkVar.B;
            this.L = vnkVar.L;
            this.H = vnkVar.H;
            this.h = vnkVar.h;
            this.s = vnkVar.s;
            this.a = vnkVar.a;
            this.I = vnkVar.I;
            this.i = vnkVar.i;
            this.J = vnkVar.J;
            this.K = vnkVar.K;
            this.G = vnkVar.G;
            this.j = vnkVar.j;
            this.M = vnkVar.M;
        }
    }

    public final synchronized boolean ba() {
        return this.I;
    }

    public final synchronized void bb(boolean z) {
        this.I = z;
    }

    @dzsi
    public final synchronized Integer bc() {
        return this.J;
    }

    public final synchronized void bd(@dzsi Integer num) {
        this.J = num;
    }

    public final synchronized boolean be() {
        return this.i;
    }

    public final synchronized void bf(boolean z) {
        this.i = z;
    }

    public final synchronized void bg(@dzsi String str) {
        this.K = str;
    }

    public final synchronized boolean bh() {
        return this.L;
    }

    public final synchronized void bi(boolean z) {
        this.L = z;
    }

    public final synchronized boolean bj() {
        return this.M;
    }

    public final synchronized void bk(boolean z) {
        this.M = z;
    }

    public final synchronized boolean bl(Context context) {
        boolean z;
        amub w = l().d().w(context);
        if (w != null) {
            if (new vxg(w.d).a()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean bm() {
        boolean z;
        if (vxq.a(g())) {
            if (!bp()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean bn() {
        boolean z;
        dwao h = h();
        if (bm() && (h.a & 1073741824) != 0) {
            dosz doszVar = h.B;
            if (doszVar == null) {
                doszVar = dosz.e;
            }
            if ((doszVar.a & 4) != 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean bo() {
        boolean z;
        dwao h = h();
        if (!bp() && (h.a & 1073741824) != 0) {
            dosz doszVar = h.B;
            if (doszVar == null) {
                doszVar = dosz.e;
            }
            if ((doszVar.a & 4) != 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean bp() {
        return this.a.size() > 2;
    }

    @dzsi
    public final synchronized dwac bq(int i) {
        boolean z;
        vpa vpaVar = this.a.get(i);
        ddgg ddggVar = (ddgg) bvrt.f(vpaVar.d, (dssr) ddgg.y.cu(7), ddgg.y);
        vpaVar.b(null);
        if (i == this.B) {
            this.B = -1;
            z = true;
        } else {
            z = false;
        }
        if (ddggVar == null) {
            return null;
        }
        dwab bZ = dwac.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwac dwacVar = (dwac) bZ.b;
        int i2 = 1 | dwacVar.a;
        dwacVar.a = i2;
        dwacVar.b = i;
        ddggVar.getClass();
        dwacVar.d = ddggVar;
        int i3 = i2 | 4;
        dwacVar.a = i3;
        dwacVar.a = i3 | 2;
        dwacVar.c = z;
        return bZ.bK();
    }

    public final synchronized douz br() {
        return this.j.e((dssr) douz.g.cu(7), douz.g);
    }

    public final synchronized void bs(douz douzVar) {
        this.j = bvrt.b(douzVar);
    }

    public final synchronized void bt(int i) {
        this.N = i;
    }

    public final synchronized int bu() {
        return this.N;
    }

    public final synchronized void bv(List<azva> list) {
        EnumMap<dpjs, azva> i = amvj.i(list);
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            dbsi<amvh, Boolean> K = this.a.get(i2).a.K(i);
            if (K.b.booleanValue()) {
                B(K.a, i2);
            }
        }
    }

    public final synchronized int bw() {
        if (!aY() && this.y != vnj.SEARCHING) {
            int i = 2;
            if (bp()) {
                return 2;
            }
            dcdc<vpa> dcdcVar = this.a;
            int size = dcdcVar.size();
            int i2 = 0;
            amvh amvhVar = null;
            while (i2 < size) {
                amvh a = dcdcVar.get(i2).a(g());
                if (!a.a() && ((a.k() || a.c()) && (amvhVar == null || !a.d(amvhVar)))) {
                    i2++;
                    amvhVar = a;
                }
                i = 1;
            }
            return i;
        }
        return 3;
    }

    public final synchronized amvh c() {
        return this.a.get(0).a(g());
    }

    public final synchronized amvh d() {
        return ((vpa) dcft.s(this.a)).a(g());
    }

    public final synchronized dcdc<amvh> e() {
        dccx F;
        dcdc<vpa> dcdcVar = this.a;
        dcdc<vpa> subList = dcdcVar.subList(1, dcdcVar.size());
        F = dcdc.F();
        int size = subList.size();
        for (int i = 0; i < size; i++) {
            F.g(subList.get(i).a(g()));
        }
        return F.f();
    }

    @dzsi
    public final synchronized dtaq f() {
        return (dtaq) bvrt.f(this.m, (dssr) dtaq.m.cu(7), dtaq.m);
    }

    public final dqvj g() {
        dphq dphqVar = h().e;
        if (dphqVar == null) {
            dphqVar = dphq.m;
        }
        dqvj c = dqvj.c(dphqVar.b);
        return c == null ? dqvj.MIXED : c;
    }

    public final synchronized dwao h() {
        dwao dwaoVar = dwao.R;
        dwao e = this.b.e((dssr) dwao.R.cu(7), dwaoVar);
        if (e.equals(dwaoVar)) {
            bvoo.h("Error parsing the options proto", new Object[0]);
            return bx(l().a());
        }
        return e;
    }

    @dzsi
    public final synchronized duqc i() {
        return (duqc) bvrt.f(this.n, (dssr) duqc.f.cu(7), duqc.f);
    }

    public final synchronized yiv j() {
        return this.o.e((dssr) yiv.e.cu(7), yiv.e);
    }

    @dzsi
    public final synchronized crmw k() {
        return this.G;
    }

    public final synchronized vnu l() {
        if (this.l.isEmpty()) {
            bvoo.h("getCurrentTab called with no tabs", new Object[0]);
            return vnu.h(dqvj.DRIVE);
        }
        dcdc<vnu> dcdcVar = this.l;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            vnu vnuVar = dcdcVar.get(i);
            i++;
            if (vnuVar.a() == g()) {
                return vnuVar;
            }
        }
        return this.l.get(0);
    }

    public final synchronized void m(vnu vnuVar) {
        this.l = n(vnuVar, this.l);
    }

    public final synchronized void o() {
        dcdc<vnu> dcdcVar = this.l;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dcdcVar.get(i).e()) {
                dccx F = dcdc.F();
                dcdc<vnu> dcdcVar2 = this.l;
                int size2 = dcdcVar2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    F.g(dcdcVar2.get(i3).i(false));
                }
                this.l = F.f();
                return;
            }
            i = i2;
        }
    }

    public final synchronized void p(dqvj dqvjVar) {
        dccx F = dcdc.F();
        dcdc<vnu> dcdcVar = this.l;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            vnu vnuVar = dcdcVar.get(i);
            if (vnuVar.a() == dqvjVar) {
                F.g(vnuVar);
            } else {
                F.g(vnu.h(vnuVar.a()));
            }
        }
        S(F.f());
    }

    public final synchronized void q() {
        this.l = dcdc.q(dcft.o(this.l, new vng()));
    }

    public final synchronized dcdc<vnu> r() {
        return this.l;
    }

    public final synchronized qbs s() {
        return this.w;
    }

    public final synchronized qbs t() {
        return this.x;
    }

    public final synchronized String toString() {
        dbsb b;
        b = dbsc.b(this);
        b.b("waypoints", this.a);
        b.b("userLocation", this.m);
        b.b("directionsOptions", this.b);
        b.b("clientDetails", this.n);
        b.b("filterPreferences", this.o);
        b.h("rotateSwapWaypointsIconClockwise", this.v);
        b.b("resultViewMode", this.x);
        b.b("lastRequestParams", this.h);
        b.b("initialLoggingParams", this.H);
        b.b("distanceUnits", this.c);
        b.b("preferredTransitPattern", this.d);
        dspd dspdVar = this.e;
        b.b("preferredTransitPatternToken", dspdVar == null ? null : dspdVar.J());
        b.b("savedTripId", this.f);
        b.b("clientCountry", this.u);
        b.h("showFromMyLocation", this.q);
        b.h("show2wPromo", this.p);
        b.h("shouldRefresh", this.r);
        b.b("entityTypesThatHaveTriggeredAliasSettingFlow", this.s);
        b.h("showResumeNavigationNotification", this.t);
        b.b("searchState", this.y);
        b.f("searchTargetWaypointIndex", this.A);
        b.f("lastUserUpdatedWaypointIndex", this.B);
        b.b("isShowingShortcutPromo", this.D);
        b.b("tabs", this.l);
        b.b("earlyNavExitParams", this.G);
        b.b("relevantOptions", this.j);
        return b.toString();
    }

    @dzsi
    public final synchronized dowa u() {
        return this.c;
    }

    @dzsi
    @Deprecated
    public final synchronized String v() {
        return this.d;
    }

    @dzsi
    public final synchronized dspd w() {
        return this.e;
    }

    @dzsi
    public final synchronized String x() {
        return this.f;
    }

    public final synchronized boolean y() {
        boolean z;
        dccx F = dcdc.F();
        F.g(this.a.get(1));
        F.g(this.a.get(0));
        int size = this.a.size();
        for (int i = 2; i < size; i++) {
            F.g(this.a.get(i));
        }
        this.a = F.f();
        this.D = vni.NONE;
        z = !this.v;
        this.v = z;
        return !z;
    }

    public final synchronized void z(int i, int i2) {
        ArrayList arrayList = new ArrayList(this.a);
        arrayList.add(i2, (vpa) arrayList.remove(i));
        this.a = dcdc.r(arrayList);
    }
}

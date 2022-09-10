package defpackage;

import android.content.Context;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: amub  reason: default package */
/* loaded from: classes2.dex */
public class amub {
    public final double[] A;
    public final amsx B;
    public dcdc<dpej> C;
    public int D;
    public final int E;
    public final int F;
    @dzsi
    public final String G;
    public final int H;
    public final dowa I;
    public final dwao J;
    public final amtz K;
    public final boolean L;
    public final boolean M;
    public final int P;
    @dzsi
    public dspd Q;
    @dzsi
    public final dspd R;
    public int S;
    public final List<String> T;
    @dzsi
    public final dspd U;
    private final String Z;
    private final amvf[] ab;
    @dzsi
    private volatile dvzr ac;
    private final double[] ad;
    private final int ae;
    private final int af;
    private final List<String> ag;
    public final dwbc b;
    public final int c;
    public final amve d;
    public dcdc<dovn> e;
    public long f;
    public final long g;
    public final dqvj h;
    public final dore i;
    public final boolean j;
    public final amuo[] k;
    public final akrk l;
    public final alxh m;
    public final int n;
    public final amvh[] o;
    public final String p;
    @dzsi
    public volatile amtm q;
    @dzsi
    public volatile amtm r;
    @dzsi
    public volatile dpeq s;
    public volatile dcdc<doxc> t;
    public volatile dcdc<doxc> u;
    @dzsi
    public String v;
    public int w;
    public boolean x;
    public int y;
    @dzsi
    public volatile dpfh z;
    public static final dcqe a = dcqe.c("amub");
    private static final String X = amub.class.getSimpleName();
    private static final dcep<dqvj> Y = dcep.E(dqvj.DRIVE, dqvj.TWO_WHEELER, dqvj.TAXI, dqvj.TAXICAB);
    public static final AtomicLong V = new AtomicLong(1);
    @dzsi
    private amvc aa = null;
    public final amty N = new amty();
    public dpej O = dpej.DELAY_NODATA;
    public final long W = V.incrementAndGet();

    public amub(amtx amtxVar) {
        amuo[] amuoVarArr;
        int i;
        int i2;
        amtr[] amtrVarArr;
        dpej dpejVar;
        amve amveVar = amtxVar.a;
        dbsk.s(amveVar);
        this.d = amveVar;
        this.e = amtxVar.b;
        this.t = amtxVar.c;
        this.u = amtxVar.d;
        this.h = amtxVar.e;
        this.f = amtxVar.M;
        this.g = amtxVar.N;
        this.i = amtxVar.f;
        amuo[] amuoVarArr2 = amtxVar.j;
        this.k = amuoVarArr2 == null ? new amuo[0] : amuoVarArr2;
        akrk akrkVar = amtxVar.k;
        if (akrkVar == null || akrkVar.l() == 0) {
            bvoo.h("Empty polyline in route.", new Object[0]);
            this.l = akrk.e(dcdc.f(new akra(0, 0)));
        } else {
            this.l = akrkVar;
        }
        this.n = amtxVar.l;
        this.p = amtxVar.m;
        this.D = amtxVar.n;
        this.B = amtxVar.o;
        this.ae = amtxVar.p;
        this.af = amtxVar.q;
        this.E = amtxVar.r;
        this.F = amtxVar.s;
        this.G = amtxVar.t;
        this.H = amtxVar.u;
        this.j = amtxVar.z;
        this.I = amtxVar.A;
        this.J = amtxVar.B;
        this.ag = amtxVar.D;
        this.P = amtxVar.E;
        List<String> list = amtxVar.H;
        dbsk.s(list);
        this.T = list;
        dwbc dwbcVar = amtxVar.I;
        amsy.H(dwbcVar);
        this.b = dwbcVar;
        this.Z = amtxVar.J;
        amtz amtzVar = amtxVar.C;
        if (amtzVar == null) {
            int a2 = dwbb.a(dwbcVar.d);
            amtzVar = (a2 != 0 && a2 == 3) ? amtz.OFFLINE : amtz.ONLINE;
        }
        this.K = amtzVar;
        this.c = amtxVar.K;
        this.U = amtxVar.P;
        this.z = amtxVar.x;
        this.ac = amtxVar.y;
        this.R = amtxVar.G;
        boolean z = amtxVar.O;
        this.M = false;
        dspd dspdVar = amtxVar.F;
        dpie dpieVar = amveVar.a;
        if ((dpieVar.a & ImageMetadata.SHADING_MODE) != 0) {
            this.Q = dpieVar.t;
        } else {
            this.Q = null;
        }
        amvh[] amvhVarArr = (amvh[]) dbsk.s(amtxVar.g);
        this.o = amvhVarArr;
        amvj.k(amvhVarArr.length);
        this.ab = (amvf[]) dbsk.s(amtxVar.h);
        dccx dccxVar = new dccx();
        int i3 = 1;
        if (amveVar.e() > 0) {
            dbsk.l(amveVar.e() == amvhVarArr.length + (-1));
            for (amtr amtrVar : amveVar.b) {
                if ((amtrVar.a().a & 256) == 0) {
                    dpejVar = dpej.DELAY_NODATA;
                } else {
                    doxd doxdVar = amtrVar.a().k;
                    dpejVar = dpej.b((doxdVar == null ? doxd.l : doxdVar).c);
                    if (dpejVar == null) {
                        dpejVar = dpej.DELAY_NODATA;
                    }
                }
                dccxVar.g(dpejVar);
            }
        } else {
            for (int i4 = 0; i4 < this.o.length - 1; i4++) {
                dccxVar.g(dpej.DELAY_NODATA);
            }
        }
        this.C = dccxVar.f();
        double[] dArr = new double[this.l.l()];
        this.ad = dArr;
        double[] dArr2 = new double[this.l.l()];
        this.A = dArr2;
        this.m = new alxh(this.l);
        akrk akrkVar2 = this.l;
        if (akrkVar2.l() != 0) {
            double d = dcyn.a;
            dArr[0] = 0.0d;
            dArr2[0] = 0.0d;
            double d2 = 0.0d;
            int i5 = 1;
            while (i5 < dArr.length) {
                int i6 = i5 - 1;
                double[] dArr3 = dArr;
                double s = akrkVar2.s(i6);
                Double.isNaN(s);
                d += s;
                int i7 = i6 + i6;
                int i8 = i7 + 2;
                int[] iArr = akrkVar2.b;
                int i9 = iArr[i7];
                int i10 = iArr[i8];
                double hypot = (float) (Math.hypot(i9 - i10, i - i2) / akra.q(akra.l((iArr[i7 + i3] + iArr[i8 + i3]) / 2)));
                Double.isNaN(hypot);
                d2 += hypot;
                dArr3[i5] = d;
                dArr2[i5] = d2;
                i5++;
                dArr = dArr3;
                akrkVar2 = akrkVar2;
                i3 = 1;
            }
        }
        amuo[] amuoVarArr3 = this.k;
        for (int i11 = 1; i11 < amuoVarArr3.length; i11++) {
            amuo amuoVar = amuoVarArr3[i11 - 1];
            amuo amuoVar2 = amuoVarArr3[i11];
            amuoVar.Q = amuoVar2;
            amuoVar2.R = amuoVar;
        }
        if (this.h == dqvj.TRANSIT) {
            if (this.D == 0) {
                this.D = (int) Math.round(K(this.l.l() - 1));
            }
            for (amuo amuoVar3 : this.k) {
                if (this.h == dqvj.TRANSIT && amuoVar3.k == 0) {
                    double K = K(amuoVar3.j);
                    amuo amuoVar4 = amuoVar3.R;
                    amuoVar3.k = (int) Math.round(amuoVar4 != null ? K - K(amuoVar4.j) : K);
                }
            }
        }
        this.L = amux.b(this.k) && !U();
        dpeq dpeqVar = Y.contains(this.h) ? amtxVar.w : null;
        int i12 = amtxVar.v;
        R(dpeqVar, 0);
        dwaa dwaaVar = this.b.b;
        S((dwaaVar == null ? dwaa.g : dwaaVar).d, amtxVar.K, b(this.b), amtxVar.L);
        if (this.k.length != 0 || this.h == dqvj.TAXI) {
            return;
        }
        bvoo.j(new bvon("%s routes must have >=1 steps (trip=%s)", this.h, this.d.a()));
    }

    public static doyq P(dozz dozzVar, int i) {
        dozl dozlVar;
        doyq ca = dozz.y.ca(dozzVar);
        if (dozzVar.b == 18) {
            doze dozeVar = (doze) dozzVar.c;
            dozd ca2 = doze.d.ca(dozeVar);
            int i2 = dozeVar.b + i;
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            doze dozeVar2 = (doze) ca2.b;
            dozeVar2.a |= 1;
            dozeVar2.b = i2;
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dozz dozzVar2 = (dozz) ca.b;
            doze bK = ca2.bK();
            bK.getClass();
            dozzVar2.c = bK;
            dozzVar2.b = 18;
        }
        if (dozzVar.b == 22) {
            dozs dozsVar = (dozs) dozzVar.c;
            dozj ca3 = dozs.q.ca(dozsVar);
            if ((dozsVar.a & 256) != 0) {
                dozl dozlVar2 = dozsVar.j;
                if (dozlVar2 == null) {
                    dozlVar2 = dozl.e;
                }
                dozl aG = aG(dozlVar2, i);
                if (ca3.c) {
                    ca3.bF();
                    ca3.c = false;
                }
                dozs dozsVar2 = (dozs) ca3.b;
                aG.getClass();
                dozsVar2.j = aG;
                dozsVar2.a |= 256;
            }
            dozr dozrVar = dozsVar.l;
            if (dozrVar == null) {
                dozrVar = dozr.e;
            }
            if (dozrVar.b == 4) {
                dozr dozrVar2 = dozsVar.l;
                if (dozrVar2 == null) {
                    dozrVar2 = dozr.e;
                }
                dsqp dsqpVar = (dsqp) dozrVar2.cu(5);
                dsqpVar.bC(dozrVar2);
                dozo dozoVar = (dozo) dsqpVar;
                dozr dozrVar3 = dozsVar.l;
                if (dozrVar3 == null) {
                    dozrVar3 = dozr.e;
                }
                if (dozrVar3.b == 4) {
                    dozlVar = (dozl) dozrVar3.c;
                } else {
                    dozlVar = dozl.e;
                }
                dozl aG2 = aG(dozlVar, i);
                if (dozoVar.c) {
                    dozoVar.bF();
                    dozoVar.c = false;
                }
                dozr dozrVar4 = (dozr) dozoVar.b;
                aG2.getClass();
                dozrVar4.c = aG2;
                dozrVar4.b = 4;
                if (ca3.c) {
                    ca3.bF();
                    ca3.c = false;
                }
                dozs dozsVar3 = (dozs) ca3.b;
                dozr bK2 = dozoVar.bK();
                bK2.getClass();
                dozsVar3.l = bK2;
                dozsVar3.a |= 512;
            }
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dozz dozzVar3 = (dozz) ca.b;
            dozs bK3 = ca3.bK();
            bK3.getClass();
            dozzVar3.c = bK3;
            dozzVar3.b = 22;
        }
        return ca;
    }

    public static dpfh Q(dpfh dpfhVar, int i) {
        dpfa dpfaVar = dpfhVar.i;
        if (dpfaVar == null) {
            dpfaVar = dpfa.e;
        }
        if ((dpfaVar.a & 1) != 0) {
            dpfa dpfaVar2 = dpfhVar.i;
            if (dpfaVar2 == null) {
                dpfaVar2 = dpfa.e;
            }
            dpfg dpfgVar = dpfaVar2.b;
            if (dpfgVar == null) {
                dpfgVar = dpfg.d;
            }
            dsqp dsqpVar = (dsqp) dpfhVar.cu(5);
            dsqpVar.bC(dpfhVar);
            dpey dpeyVar = (dpey) dsqpVar;
            dpfa dpfaVar3 = dpfhVar.i;
            if (dpfaVar3 == null) {
                dpfaVar3 = dpfa.e;
            }
            dsqp dsqpVar2 = (dsqp) dpfaVar3.cu(5);
            dsqpVar2.bC(dpfaVar3);
            dpez dpezVar = (dpez) dsqpVar2;
            dsqp dsqpVar3 = (dsqp) dpfgVar.cu(5);
            dsqpVar3.bC(dpfgVar);
            dpff dpffVar = (dpff) dsqpVar3;
            int i2 = dpfgVar.b + i;
            if (dpffVar.c) {
                dpffVar.bF();
                dpffVar.c = false;
            }
            dpfg dpfgVar2 = (dpfg) dpffVar.b;
            dpfgVar2.a |= 1;
            dpfgVar2.b = i2;
            if (dpezVar.c) {
                dpezVar.bF();
                dpezVar.c = false;
            }
            dpfa dpfaVar4 = (dpfa) dpezVar.b;
            dpfg bK = dpffVar.bK();
            bK.getClass();
            dpfaVar4.b = bK;
            dpfaVar4.a |= 1;
            if (dpeyVar.c) {
                dpeyVar.bF();
                dpeyVar.c = false;
            }
            dpfh dpfhVar2 = (dpfh) dpeyVar.b;
            dpfa bK2 = dpezVar.bK();
            bK2.getClass();
            dpfhVar2.i = bK2;
            dpfhVar2.a |= 64;
            return dpeyVar.bK();
        }
        return dpfhVar;
    }

    @dzsi
    public static amtx aD(@dzsi amsy amsyVar, long j, int i, Context context, @dzsi dore doreVar, amvh[] amvhVarArr, boolean z, dwao dwaoVar) {
        return c(amsyVar, j, 0L, i, context, doreVar, amvhVarArr, new amvf[0], z, dwaoVar);
    }

    private final boolean aE(amuo amuoVar) {
        boolean z = amuoVar.d == dgau.DESTINATION;
        return this.h == dqvj.TRANSIT ? z && amuoVar.i == h() + (-1) : z;
    }

    private final int aF(double d, double d2) {
        if (d2 <= d) {
            return 0;
        }
        return (int) Math.round(ab(d) - ab(d2));
    }

    private static dozl aG(dozl dozlVar, int i) {
        dozk ca = dozl.e.ca(dozlVar);
        int i2 = dozlVar.b + i;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dozl dozlVar2 = (dozl) ca.b;
        dozlVar2.a |= 1;
        dozlVar2.b = i2;
        return ca.bK();
    }

    private final void aH(@dzsi dpeq dpeqVar, int i) {
        double d;
        amtm amtmVar;
        if (this.q == null) {
            this.q = amtm.a(this.k);
        }
        if (dpeqVar == null || dpeqVar.b.size() < 2) {
            this.r = null;
        } else if (aj()) {
            amtm a2 = amtm.a(this.k);
            if (a2 == null) {
                amtmVar = amtm.c(dpeqVar, i);
            } else {
                amti[] b = amtm.b(dpeqVar, i);
                amti[] amtiVarArr = (amti[]) dcft.e(a2.f(), amti.class);
                int length = amtiVarArr.length - 1;
                amti amtiVar = amtiVarArr[length];
                ArrayList arrayList = new ArrayList();
                int i2 = b[b.length - 1].a;
                if (amtiVar.a > i2) {
                    while (length >= 0) {
                        amti amtiVar2 = amtiVarArr[length];
                        if (amtiVar2.a <= i2) {
                            break;
                        }
                        arrayList.add(amtiVar2);
                        length--;
                    }
                    d = a2.d(i2);
                } else {
                    d = dcyn.a;
                }
                int length2 = b.length;
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        break;
                    }
                    amti amtiVar3 = b[length2];
                    int i3 = amtiVar3.a;
                    double d2 = amtiVar3.b;
                    Double.isNaN(d2);
                    arrayList.add(new amti(i3, (int) Math.round(d2 + d), true));
                }
                amti amtiVar4 = (amti) dcft.s(arrayList);
                double d3 = amtiVar4.b;
                double d4 = a2.d(amtiVar4.a);
                int length3 = amtiVarArr.length;
                while (true) {
                    length3--;
                    if (length3 < 0) {
                        break;
                    }
                    amti amtiVar5 = amtiVarArr[length3];
                    int i4 = amtiVar5.a;
                    if (i4 < amtiVar4.a) {
                        double d5 = amtiVar5.b;
                        Double.isNaN(d5);
                        Double.isNaN(d3);
                        arrayList.add(new amti(i4, (int) Math.round((d5 - d4) + d3), false));
                    }
                }
                amtmVar = new amtm((amti[]) dchl.l(arrayList).toArray(new amti[0]));
            }
            this.r = amtmVar;
        } else {
            this.r = amtm.c(dpeqVar, i);
        }
    }

    public static dwbc aq(amuh amuhVar) {
        dbsk.a(amuhVar.j());
        amub k = amuhVar.k();
        dbsk.s(k);
        dwaa dwaaVar = k.b.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dvzo ca = dvzu.F.ca(dvzuVar);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dvzu) ca.b).e = dvzu.ck();
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dvzu) ca.b).p = dvzu.ck();
        HashSet c = dcnm.c();
        Iterator<amub> it = amuhVar.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            amub next = it.next();
            c.addAll(next.b.c);
            dwaa dwaaVar2 = next.b.b;
            if (dwaaVar2 == null) {
                dwaaVar2 = dwaa.g;
            }
            dvzu dvzuVar2 = dwaaVar2.b;
            if (dvzuVar2 == null) {
                dvzuVar2 = dvzu.F;
            }
            dpie dpieVar = dvzuVar2.e.get(next.c);
            dsqp dsqpVar = (dsqp) dpieVar.cu(5);
            dsqpVar.bC(dpieVar);
            dphr dphrVar = (dphr) dsqpVar;
            dpeq dpeqVar = next.s;
            if (dpeqVar != null && !dpeqVar.equals(dpeq.m)) {
                if (dphrVar.c) {
                    dphrVar.bF();
                    dphrVar.c = false;
                }
                dpie dpieVar2 = (dpie) dphrVar.b;
                dpie dpieVar3 = dpie.C;
                dpeqVar.getClass();
                dpieVar2.f = dpeqVar;
                dpieVar2.a |= 16;
            } else {
                if (dphrVar.c) {
                    dphrVar.bF();
                    dphrVar.c = false;
                }
                dpie dpieVar4 = (dpie) dphrVar.b;
                dpie dpieVar5 = dpie.C;
                dpieVar4.f = null;
                dpieVar4.a &= -17;
            }
            dpfh dpfhVar = next.z;
            if (dpfhVar != null) {
                if (dphrVar.c) {
                    dphrVar.bF();
                    dphrVar.c = false;
                }
                dpie dpieVar6 = (dpie) dphrVar.b;
                dpfhVar.getClass();
                dpieVar6.r = dpfhVar;
                dpieVar6.a |= 131072;
            } else {
                if (dphrVar.c) {
                    dphrVar.bF();
                    dphrVar.c = false;
                }
                dpie dpieVar7 = (dpie) dphrVar.b;
                dpieVar7.r = null;
                dpieVar7.a &= -131073;
            }
            if ((dpieVar.a & 128) != 0) {
                ca.c(dvzuVar2.p.get(next.c));
                if (dphrVar.c) {
                    dphrVar.bF();
                    dphrVar.c = false;
                }
                dpie dpieVar8 = (dpie) dphrVar.b;
                dpieVar8.a |= 128;
                dpieVar8.i = i;
                i++;
            }
            if (next == k) {
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dvzu dvzuVar3 = (dvzu) ca.b;
                dvzuVar3.a |= 2;
                dvzuVar3.g = i2;
            }
            i2++;
            ca.e((dpie) dphrVar.bK());
        }
        dvzz bZ = dwaa.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwaa dwaaVar3 = (dwaa) bZ.b;
        dvzu bK = ca.bK();
        bK.getClass();
        dwaaVar3.b = bK;
        dwaaVar3.a |= 1;
        dwaa dwaaVar4 = k.b.b;
        if (dwaaVar4 == null) {
            dwaaVar4 = dwaa.g;
        }
        dhjx dhjxVar = dwaaVar4.c;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwaa dwaaVar5 = (dwaa) bZ.b;
        dhjxVar.getClass();
        dwaaVar5.c = dhjxVar;
        dwaaVar5.a |= 4;
        dwaa dwaaVar6 = k.b.b;
        if (dwaaVar6 == null) {
            dwaaVar6 = dwaa.g;
        }
        String str = dwaaVar6.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwaa dwaaVar7 = (dwaa) bZ.b;
        str.getClass();
        dwaaVar7.a |= 16;
        dwaaVar7.d = str;
        dwaa bK2 = bZ.bK();
        dwaz dwazVar = (dwaz) dwbc.g.bZ();
        if (dwazVar.c) {
            dwazVar.bF();
            dwazVar.c = false;
        }
        dwbc dwbcVar = (dwbc) dwazVar.b;
        bK2.getClass();
        dwbcVar.b = bK2;
        dwbcVar.a |= 1;
        dwbc dwbcVar2 = (dwbc) dwazVar.b;
        dsrj<dvxl> dsrjVar = dwbcVar2.c;
        if (!dsrjVar.a()) {
            dwbcVar2.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(c, dwbcVar2.c);
        return (dwbc) dwazVar.bK();
    }

    @dzsi
    public static amub ay(@dzsi amsy amsyVar, long j, int i, Context context, @dzsi dore doreVar, amvh[] amvhVarArr, amvf[] amvfVarArr, boolean z, dwao dwaoVar) {
        amtx c = c(amsyVar, j, 0L, i, context, doreVar, amvhVarArr, amvfVarArr, z, dwaoVar);
        if (c == null) {
            return null;
        }
        return c.a();
    }

    public static int b(dwbc dwbcVar) {
        dwas dwasVar = dwbcVar.e;
        if (dwasVar == null) {
            dwasVar = dwas.d;
        }
        if ((dwasVar.a & 1) != 0) {
            dwas dwasVar2 = dwbcVar.e;
            if (dwasVar2 == null) {
                dwasVar2 = dwas.d;
            }
            return dwasVar2.b;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x048c  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.amtx c(@defpackage.dzsi defpackage.amsy r22, long r23, long r25, int r27, android.content.Context r28, @defpackage.dzsi defpackage.dore r29, defpackage.amvh[] r30, defpackage.amvf[] r31, boolean r32, defpackage.dwao r33) {
        /*
            Method dump skipped, instructions count: 1957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amub.c(amsy, long, long, int, android.content.Context, dore, amvh[], amvf[], boolean, dwao):amtx");
    }

    public final long A() {
        double d = this.f;
        Double.isNaN(d);
        return Math.round(d / 1000.0d) + z();
    }

    public final int B(double d) {
        return aF(d, G());
    }

    public final int[] C(double d) {
        amuo[] t = t();
        int[] iArr = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            iArr[i] = aF(d, K(t[i].j));
        }
        return iArr;
    }

    public final int D() {
        dgas dgasVar = this.d.w().b;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        return dgasVar.d;
    }

    public final int E() {
        return this.h != dqvj.TRANSIT ? this.ae : D();
    }

    public final amsx F() {
        amsw a2 = amsx.a(this.ae - this.af);
        if (Z()) {
            a2.b(this.ae);
        }
        return a2.a();
    }

    public final int G() {
        int u = u();
        if (u == 0) {
            return 0;
        }
        return (int) Math.round(K(this.k[u - 1].j));
    }

    public final double H(int i) {
        return this.ad[i];
    }

    public final double I(akrn akrnVar) {
        double[] dArr = this.ad;
        int i = akrnVar.d;
        double d = dArr[i];
        double y = this.l.m(i).y(akrnVar.a);
        Double.isNaN(y);
        return d + y;
    }

    public final double J(double d) {
        if (d >= dcyn.a) {
            double[] dArr = this.A;
            if (d <= dArr[dArr.length - 1]) {
                int aa = aa(d);
                double[] dArr2 = this.A;
                double d2 = dArr2[aa];
                if (d == d2) {
                    return this.ad[aa];
                }
                if (d > d2) {
                    int i = aa + 1;
                    double d3 = dArr2[i];
                    if (d < d3) {
                        double[] dArr3 = this.ad;
                        double d4 = dArr3[i];
                        double d5 = dArr3[aa];
                        return d5 + (((d - d2) / (d3 - d2)) * (d4 - d5));
                    }
                }
            }
        }
        return -1.0d;
    }

    public final double K(int i) {
        return this.A[i];
    }

    public final double L(int i, int i2) {
        int i3;
        if (i < 0 || (i3 = i + 1) >= this.A.length) {
            return Double.NaN;
        }
        double q = akra.q(akra.l((this.l.o(i) + this.l.o(i3)) / 2));
        double d = this.A[i];
        double d2 = i2;
        Double.isNaN(d2);
        return d + (d2 / q);
    }

    public final double M(akrn akrnVar) {
        double[] dArr = this.A;
        int i = akrnVar.d;
        double d = dArr[i];
        double z = akrnVar.a.z(this.l.m(i));
        Double.isNaN(z);
        return d + z;
    }

    public final dpej N() {
        return this.C.get(0);
    }

    public final dpej O(int i) {
        dbsk.z(i, this.C.size());
        return this.C.get(i);
    }

    public final void R(@dzsi dpeq dpeqVar, int i) {
        aH(dpeqVar, i);
        if (dpeqVar == null || dpeqVar.b.size() < 2) {
            this.O = dpej.DELAY_NODATA;
        } else {
            dpej b = dpej.b(dpeqVar.l);
            if (b == null) {
                b = dpej.DELAY_NODATA;
            }
            this.O = b;
        }
        synchronized (this.N) {
            amty amtyVar = this.N;
            amtyVar.c = null;
            amtyVar.d = null;
            this.s = dpeqVar;
        }
    }

    public final void S(@dzsi String str, int i, int i2, boolean z) {
        this.w = i;
        this.v = str;
        this.y = i2;
        this.x = z;
    }

    public final void T(boolean z) {
        if (!z) {
            aH(null, 0);
        }
        dccx dccxVar = new dccx();
        for (int i = 0; i < this.C.size(); i++) {
            dccxVar.g(dpej.DELAY_NODATA);
        }
        this.C = dccxVar.f();
        this.O = dpej.DELAY_NODATA;
        synchronized (this.N) {
            amty amtyVar = this.N;
            amtyVar.c = null;
            amtyVar.d = null;
            this.s = null;
            this.v = null;
            this.w = -1;
            this.x = false;
            this.y = -1;
        }
    }

    public final boolean U() {
        return this.g > 0;
    }

    @dzsi
    public final akrn V(akra akraVar, double d) {
        return this.m.b(akraVar, d);
    }

    @dzsi
    public final akrn W(akra akraVar, double d) {
        return this.m.c(akraVar, d, w().l() - 1);
    }

    @dzsi
    public final akra X(double d) {
        if (d < dcyn.a || d > this.D) {
            return null;
        }
        List<akra> y = y();
        int aa = aa(d);
        if (aa == y.size() - 1) {
            return y.get(aa);
        }
        double K = K(aa);
        int i = aa + 1;
        double K2 = K(i);
        akra akraVar = new akra();
        akra.H(y.get(aa), y.get(i), (float) ((d - K) / (K2 - K)), akraVar);
        return akraVar;
    }

    @dzsi
    public final akrn Y(double d) {
        double d2 = dcyn.a;
        if (d < dcyn.a || d > this.D) {
            return null;
        }
        List<akra> y = y();
        int aa = aa(d);
        if (aa == y.size() - 1) {
            akra akraVar = y.get(aa);
            if (aa > 1) {
                d2 = akra.G(y.get(aa - 1), akraVar);
            }
            return new akrn(akraVar, d2, dcyn.a, aa);
        }
        double K = K(aa);
        int i = aa + 1;
        double K2 = K(i);
        akra akraVar2 = y.get(aa);
        akra akraVar3 = y.get(i);
        akra akraVar4 = new akra();
        akra.H(akraVar2, akraVar3, (float) ((d - K) / (K2 - K)), akraVar4);
        return new akrn(akraVar4, akra.G(akraVar2, akraVar3), dcyn.a, aa);
    }

    public final boolean Z() {
        dpeq dpeqVar = this.s;
        if (dpeqVar != null && dpeqVar.b.size() >= 2) {
            for (dpco dpcoVar : dpeqVar.b) {
                int a2 = dpcn.a(dpcoVar.d);
                if (a2 != 0 && a2 != 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String a() {
        int min = Math.min(this.k.length, 2);
        String[] strArr = new String[min];
        amuo[] amuoVarArr = this.k;
        if (amuoVarArr.length > 0) {
            strArr[0] = amuoVarArr[0].g();
            int length = this.k.length;
            if (length > 1) {
                StringBuilder sb = new StringBuilder(16);
                sb.append(length - 1);
                sb.append(" more");
                strArr[1] = sb.toString();
            }
        }
        dbsb b = dbsc.b(this);
        b.c();
        b.b("trip", this.d.a());
        b.f("#calloutIconUrls", this.e.size());
        b.f("#labelsForDirections", this.t.size());
        b.f("#labelsForNavigation", this.u.size());
        b.b("travelMode", this.h);
        b.b("updateType", this.i);
        b.b("waypoints", this.o);
        b.b("viapoints", this.ab);
        Object obj = null;
        if (min == 0) {
            strArr = null;
        }
        b.b("steps", strArr);
        akrk akrkVar = this.l;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Polyline{");
        if (akrkVar.b.length > 0) {
            akrkVar.v(sb2, 0);
        }
        if (akrkVar.b.length > 4) {
            sb2.append(", ...");
        }
        if (akrkVar.b.length > 2) {
            sb2.append(", ");
            akrkVar.v(sb2, akrkVar.b.length - 2);
        }
        sb2.append('}');
        b.b("polyline", sb2.toString());
        b.f("simplificationWorldUnits", this.n);
        int i = this.D;
        StringBuilder sb3 = new StringBuilder(12);
        sb3.append(i);
        sb3.append("m");
        b.b("distance", sb3.toString());
        String valueOf = String.valueOf(this.B);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb4.append(valueOf);
        sb4.append("s");
        b.b("durationToLastDestination", sb4.toString());
        int i2 = this.ae;
        StringBuilder sb5 = new StringBuilder(12);
        sb5.append(i2);
        sb5.append("s");
        b.b("durationToNextDestinationWithTraffic", sb5.toString());
        int i3 = this.af;
        StringBuilder sb6 = new StringBuilder(12);
        sb6.append(i3);
        sb6.append("s");
        b.b("trafficDelayToNextDestination", sb6.toString());
        int i4 = this.E;
        StringBuilder sb7 = new StringBuilder(12);
        sb7.append(i4);
        sb7.append("s");
        b.b("optimisticDurationToNextDestination", sb7.toString());
        int i5 = this.F;
        StringBuilder sb8 = new StringBuilder(12);
        sb8.append(i5);
        sb8.append("s");
        b.b("pessimisticDurationToNextDestination", sb8.toString());
        b.b("durationRangeToNextDestinationFormatted", this.G);
        int i6 = this.H;
        StringBuilder sb9 = new StringBuilder(12);
        sb9.append(i6);
        sb9.append("s");
        b.b("historicalDurationToNextDestination", sb9.toString());
        b.b("trafficData", this.s != null ? "set" : null);
        b.b("lastTrafficUpdateEi", this.v);
        b.f("lastTrafficUpdateTripIndex", this.w);
        b.h("wasActiveInLastResponse", this.x);
        b.f("lastTrafficUpdateSequenceNumber", this.y);
        b.b("trafficReportPrompt", this.z != null ? "set" : null);
        b.h("hasUncertainFromPoint", this.j);
        b.b("recommendedDistanceUnits", this.I);
        b.b("source", this.K);
        b.b("ttsLanguages", this.ag);
        int i7 = this.P;
        b.b("trafficRoutingExperimentBackendClass", i7 != 0 ? Integer.valueOf(i7) : null);
        b.b("tripUpdateToken", this.Q != null ? "set" : null);
        b.b("searchAlongRouteToken", this.R != null ? "set" : null);
        b.b("countries", this.T);
        b.f("tripIndex", this.c);
        b.g("directionsRequestCreationTimeMillis", this.f);
        long j = this.g;
        b.b("savedAtTimeMillis", j != 0 ? Long.valueOf(j) : null);
        if (this.ac != null) {
            obj = "set";
        }
        b.b("passengerSafetyDetails", obj);
        return b.toString();
    }

    public final int[] aA() {
        int a2;
        amuo[] t = t();
        int[] iArr = new int[t.length];
        int i = 0;
        for (int i2 = 0; i2 < t.length; i2++) {
            double K = K(t[i2].j);
            iArr[i2] = aF(dcyn.a, K) + i;
            doub doubVar = this.d.d(i2).c;
            if (K > dcyn.a && doubVar != null && (a2 = doua.a(doubVar.d)) != 0 && a2 == 2) {
                i += doubVar.a;
            }
        }
        return iArr;
    }

    public final List<akrn> aB(akra akraVar, double d) {
        return this.m.k(akraVar, d, 0, Integer.MAX_VALUE, false);
    }

    public final List<akrn> aC(akra akraVar, double d, int i, int i2, boolean z) {
        return this.m.l(akraVar, d, i, i2, z);
    }

    public final int aa(double d) {
        int binarySearch = Arrays.binarySearch(this.A, d);
        return binarySearch < 0 ? Math.max(0, -(binarySearch + 2)) : binarySearch;
    }

    public final double ab(double d) {
        if (this.r != null) {
            return this.r.d(d);
        }
        return this.q != null ? this.q.d(d) : dcyn.a;
    }

    public final amsx ac(double d) {
        amtm amtmVar = this.q;
        amtm amtmVar2 = this.r;
        amsw amswVar = new amsw(amtmVar != null ? amtmVar.d(d) : dcyn.a);
        if (amtmVar2 != null) {
            amswVar.b(amtmVar2.d(d));
        }
        return amswVar.a();
    }

    public final amsx ad(double d) {
        amtm amtmVar = this.q;
        amtm amtmVar2 = this.r;
        amsw amswVar = new amsw(amtmVar != null ? amtmVar.d(d) - amtmVar.d(G()) : dcyn.a);
        if (amtmVar2 != null) {
            amswVar.b(amtmVar2.d(d) - amtmVar2.d(G()));
        }
        return amswVar.a();
    }

    public final dcdc<amvf> ae() {
        return dcdc.t(this.ab);
    }

    public final amvh[] af() {
        amvh[] amvhVarArr = this.o;
        return (amvh[]) Arrays.copyOfRange(amvhVarArr, 1, amvhVarArr.length);
    }

    public final dcdc<akqq> ag() {
        dccx F = dcdc.F();
        int i = 1;
        while (true) {
            amvh[] amvhVarArr = this.o;
            if (i < amvhVarArr.length) {
                akqq akqqVar = amvhVarArr[i].e;
                if (akqqVar != null) {
                    F.g(akqqVar);
                } else {
                    bvoo.h("Resolved destination with null lat/lng", new Object[0]);
                }
                i++;
            } else {
                return F.f();
            }
        }
    }

    public final amvh ah(int i) {
        return this.o[i];
    }

    public final int ai() {
        return this.o.length;
    }

    public final boolean aj() {
        amvh[] amvhVarArr = this.o;
        int length = amvhVarArr.length;
        return length > 2 && amvhVarArr[length + (-2)].y;
    }

    public final boolean ak(amuo amuoVar) {
        int i = amuoVar.i;
        amuo[] amuoVarArr = this.k;
        return i < amuoVarArr.length && amuoVarArr[i] == amuoVar;
    }

    public final boolean al() {
        return amux.a(this.k);
    }

    public final boolean am() {
        return this.h == dqvj.TRANSIT;
    }

    public final boolean an() {
        return Y.contains(this.h);
    }

    public final boolean ao() {
        if (this.h == dqvj.DRIVE || this.h == dqvj.TWO_WHEELER) {
            dwao dwaoVar = this.J;
            if ((dwaoVar.a & 1073741824) == 0) {
                return false;
            }
            dosz doszVar = dwaoVar.B;
            if (doszVar == null) {
                doszVar = dosz.e;
            }
            return (doszVar.a & 4) != 0;
        }
        return false;
    }

    public final boolean ap() {
        return this.d.a.q;
    }

    public final akrk ar(double d, double d2) {
        float J = (float) J(d);
        float J2 = ((float) J(d + d2)) - J;
        float r = this.l.r();
        if (J > r) {
            J = r;
        }
        if (J + J2 > r) {
            J2 = r - J;
        }
        return akrk.k(this.l, J, J2);
    }

    public final synchronized amvc as() {
        amvc amvcVar;
        if (this.aa == null) {
            this.aa = new amvc(this);
        }
        amvcVar = this.aa;
        dbsk.s(amvcVar);
        return amvcVar;
    }

    @dzsi
    public final dcdc<amvb> at(@dzsi amuq amuqVar) {
        amvc as = as();
        if (amuqVar == null) {
            return null;
        }
        return as.a(amuqVar.b);
    }

    @dzsi
    public final amtm au() {
        return this.r != null ? this.r : this.q;
    }

    public final dbsg<dqum> av() {
        dwaa dwaaVar = this.b.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dpit dpitVar = dvzuVar.u;
        if (dpitVar == null) {
            dpitVar = dpit.e;
        }
        if ((dpitVar.a & 2) != 0) {
            dpio dpioVar = dpitVar.c;
            if (dpioVar == null) {
                dpioVar = dpio.g;
            }
            dqum b = dqum.b(dpioVar.b);
            if (b == null) {
                b = dqum.REROUTE_TYPE_BETTER_ETA;
            }
            return dbsg.i(b);
        }
        return dbpy.a;
    }

    public final boolean aw() {
        amve amveVar = this.d;
        if (amveVar.e() != 0) {
            for (int i = 0; i < amveVar.e(); i++) {
                if (amveVar.d(i).c == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int ax() {
        int a2;
        if (aw()) {
            int i = 0;
            for (int i2 = 0; i2 < this.d.e(); i2++) {
                doub doubVar = this.d.d(i2).c;
                if (doubVar != null && (a2 = doua.a(doubVar.d)) != 0 && a2 == 2) {
                    i += doubVar.a;
                }
            }
            return z() + i;
        }
        return z();
    }

    public final String az() {
        if (this.d.a.e.size() <= 0) {
            return "";
        }
        doup doupVar = this.d.a.e.get(0).d;
        if (doupVar == null) {
            doupVar = doup.e;
        }
        String str = doupVar.c;
        return dbsj.d(str) ? "" : str;
    }

    public final amte d() {
        amsy amsyVar = new amsy(this.b, this.Z);
        amtd amtdVar = new amtd();
        amtdVar.a = amsyVar;
        amtdVar.b = this.h;
        amtdVar.e(amuc.a(this.o));
        amtdVar.d(this.J);
        amtdVar.g = this.f;
        return amtdVar.a();
    }

    public final int e() {
        return this.d.a.s;
    }

    public final String f() {
        return this.d.k();
    }

    public final String g() {
        return this.d.m();
    }

    public final int h() {
        return this.k.length;
    }

    public final dbsg<doxk> i() {
        for (doxk doxkVar : this.d.u().a) {
            int a2 = doxj.a(doxkVar.b);
            if (a2 != 0 && a2 == 2 && doxkVar.a.size() > 0) {
                return dbsg.i(doxkVar);
            }
        }
        return dbpy.a;
    }

    public final amvh j() {
        return this.o[0];
    }

    public final amvh k() {
        amvh[] amvhVarArr = this.o;
        return amvhVarArr[amvhVarArr.length - 1];
    }

    public final amvh l() {
        return this.o[1];
    }

    public final TimeZone m() {
        if (this.d.a.e.size() <= 0) {
            return TimeZone.getDefault();
        }
        doup doupVar = this.d.a.e.get(0).d;
        if (doupVar == null) {
            doupVar = doup.e;
        }
        String str = doupVar.b;
        if (dbsj.d(str)) {
            return TimeZone.getDefault();
        }
        return TimeZone.getTimeZone(str);
    }

    public final dcep<amuq> n() {
        dcen N = dcep.N();
        for (amuo amuoVar : this.k) {
            amuq amuqVar = amuoVar.b;
            if (amuqVar != null) {
                N.b(amuqVar);
            }
        }
        return N.f();
    }

    public final amuo o(int i) {
        return this.k[i];
    }

    public final amuo[] p() {
        return (amuo[]) Arrays.copyOf(this.k, u());
    }

    public final amuo[] q(int i) {
        amuo[] amuoVarArr;
        ArrayList arrayList = new ArrayList();
        for (amuo amuoVar : this.k) {
            amuq amuqVar = amuoVar.b;
            if (amuqVar != null && amuqVar.b == i) {
                arrayList.add(amuoVar);
            }
        }
        return (amuo[]) arrayList.toArray(new amuo[0]);
    }

    @dzsi
    public final amuo r() {
        amuo[] amuoVarArr;
        for (amuo amuoVar : this.k) {
            if (aE(amuoVar)) {
                return amuoVar;
            }
        }
        return null;
    }

    public final boolean s(int i) {
        return i >= 0 && i < t().length;
    }

    public final amuo[] t() {
        amuo[] amuoVarArr;
        ArrayList arrayList = new ArrayList();
        for (amuo amuoVar : this.k) {
            if (aE(amuoVar)) {
                arrayList.add(amuoVar);
            }
        }
        return (amuo[]) arrayList.toArray(new amuo[0]);
    }

    public final String toString() {
        return String.valueOf(this.W);
    }

    public final int u() {
        return v(0);
    }

    public final int v(int i) {
        int i2 = -1;
        int i3 = 0;
        for (amuo amuoVar : this.k) {
            i3++;
            if (aE(amuoVar)) {
                i2++;
            }
            if (i2 == i) {
                return i3;
            }
        }
        return 0;
    }

    public final akrk w() {
        amuo[] p = p();
        int length = p.length;
        if (length == 0) {
            return this.l;
        }
        return new akru(this.l, 0, p[length - 1].j + 1).d();
    }

    public final List<akru> x() {
        amuo[] t = t();
        ArrayList arrayList = new ArrayList(t.length);
        int i = 0;
        while (i < t.length) {
            arrayList.add(new akru(this.l, i == 0 ? 0 : t[i - 1].j, t[i].j + 1));
            i++;
        }
        return arrayList;
    }

    public final List<akra> y() {
        return this.l.q();
    }

    public final int z() {
        if (this.h != dqvj.TRANSIT) {
            return (int) this.B.d();
        }
        return D();
    }
}

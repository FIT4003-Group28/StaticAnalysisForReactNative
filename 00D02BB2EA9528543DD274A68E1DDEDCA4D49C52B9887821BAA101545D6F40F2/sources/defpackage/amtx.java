package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: amtx  reason: default package */
/* loaded from: classes2.dex */
public final class amtx {
    @dzsi
    public dowa A;
    @dzsi
    public dwao B;
    @dzsi
    public amtz C;
    @dzsi
    public List<String> D;
    public int E;
    @dzsi
    public dspd F;
    @dzsi
    public dspd G;
    @dzsi
    public List<String> H;
    @dzsi
    public dwbc I;
    @dzsi
    public String J;
    public int K;
    public boolean L;
    public long M;
    public long N;
    public boolean O;
    @dzsi
    public dspd P;
    public amve a;
    @dzsi
    public dqvj e;
    @dzsi
    public dore f;
    public amvh[] g;
    public amvf[] h;
    public amuo[] j;
    @dzsi
    public akrk k;
    @dzsi
    public String m;
    public int n;
    @dzsi
    public amsx o;
    public int p;
    public int q;
    public int r;
    public int s;
    @dzsi
    public String t;
    public int u;
    public int v;
    @dzsi
    public dpeq w;
    @dzsi
    public dpfh x;
    @dzsi
    public dvzr y;
    public boolean z;
    public dcdc<dovn> b = dcdc.e();
    public dcdc<doxc> c = dcdc.e();
    public dcdc<doxc> d = dcdc.e();
    public dcdc<dpjp> i = dcdc.e();
    public int l = 128;

    public amtx(amve amveVar) {
        this.a = amveVar;
    }

    public final amub a() {
        amuo[] b;
        amvh[] amvhVarArr = this.g;
        amve amveVar = this.a;
        akrk akrkVar = this.k;
        amuo[] amuoVarArr = this.j;
        if (this.e == dqvj.DRIVE && !this.i.isEmpty() && amveVar != null && amvhVarArr != null && akrkVar != null && amuoVarArr != null) {
            int size = this.i.size();
            int length = amvhVarArr.length;
            dbsk.l(size == length);
            int i = length - 1;
            if ((this.i.get(i).a & 1) != 0) {
                dpal dpalVar = this.i.get(i).b;
                if (dpalVar == null) {
                    dpalVar = dpal.e;
                }
                if ((dpalVar.a & 4) != 0) {
                    dpjp dpjpVar = this.i.get(i);
                    dpal dpalVar2 = dpjpVar.b;
                    if (dpalVar2 == null) {
                        dpalVar2 = dpal.e;
                    }
                    doud doudVar = dpalVar2.d;
                    if (doudVar == null) {
                        doudVar = doud.c;
                    }
                    int[][] iArr = {akrkVar.b, akqf.a(doudVar)};
                    int i2 = 0;
                    for (int i3 = 0; i3 < 2; i3++) {
                        i2 += iArr[i3].length;
                    }
                    int[] iArr2 = new int[i2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < 2; i5++) {
                        int[] iArr3 = iArr[i5];
                        int length2 = iArr3.length;
                        System.arraycopy(iArr3, 0, iArr2, i4, length2);
                        i4 += length2;
                    }
                    this.k = new akrk(iArr2, akrkVar.c);
                    dcdc<dpjp> dcdcVar = this.i;
                    int length3 = amvhVarArr.length - 1;
                    amvh amvhVar = amvhVarArr[length3];
                    int length4 = amuoVarArr.length;
                    int i6 = amuoVarArr[length4 - 1].j;
                    dpal dpalVar3 = dcdcVar.get(length3).b;
                    if (dpalVar3 == null) {
                        dpalVar3 = dpal.e;
                    }
                    dpie dpieVar = dpalVar3.c;
                    if (dpieVar == null) {
                        dpieVar = dpie.C;
                    }
                    amve amveVar2 = new amve(dpieVar);
                    if (amveVar2.b.length == 0) {
                        b = new amuo[0];
                    } else {
                        amvh[] amvhVarArr2 = new amvh[2];
                        dpjn dpjnVar = dpalVar3.b;
                        if (dpjnVar == null) {
                            dpjnVar = dpjn.m;
                        }
                        dpjx dpjxVar = dpjnVar.b;
                        if (dpjxVar == null) {
                            dpjxVar = dpjx.n;
                        }
                        amvhVarArr2[0] = amvh.N(dpjxVar);
                        amvhVarArr2[1] = amvhVar;
                        amtr[] amtrVarArr = amveVar2.b;
                        doud doudVar2 = dpalVar3.d;
                        if (doudVar2 == null) {
                            doudVar2 = doud.c;
                        }
                        b = amtt.b(amtrVarArr, akrk.g(doudVar2), amvhVarArr2, length4, i6 + 1);
                    }
                    this.j = (amuo[]) dclq.b(amuoVarArr, b, amuo.class);
                    this.g = amuc.b(amvhVarArr, dpjpVar);
                    dpie dpieVar2 = amveVar.a;
                    dpal dpalVar4 = dpjpVar.b;
                    if (dpalVar4 == null) {
                        dpalVar4 = dpal.e;
                    }
                    dpie dpieVar3 = dpalVar4.c;
                    if (dpieVar3 == null) {
                        dpieVar3 = dpie.C;
                    }
                    dsqp dsqpVar = (dsqp) dpieVar2.cu(5);
                    dsqpVar.bC(dpieVar2);
                    dphr dphrVar = (dphr) dsqpVar;
                    for (dpbp dpbpVar : dpieVar3.e) {
                        dsqp dsqpVar2 = (dsqp) dpbpVar.cu(5);
                        dsqpVar2.bC(dpbpVar);
                        dpbm dpbmVar = (dpbm) dsqpVar2;
                        dpec dpecVar = dpbpVar.b;
                        if (dpecVar == null) {
                            dpecVar = dpec.o;
                        }
                        dsqp dsqpVar3 = (dsqp) dpecVar.cu(5);
                        dsqpVar3.bC(dpecVar);
                        dpeb dpebVar = (dpeb) dsqpVar3;
                        dqvj dqvjVar = dqvj.WALK;
                        if (dpebVar.c) {
                            dpebVar.bF();
                            dpebVar.c = false;
                        }
                        dpec dpecVar2 = (dpec) dpebVar.b;
                        dpecVar2.b = dqvjVar.k;
                        dpecVar2.a |= 1;
                        if (dpbmVar.c) {
                            dpbmVar.bF();
                            dpbmVar.c = false;
                        }
                        dpbp dpbpVar2 = (dpbp) dpbmVar.b;
                        dpec bK = dpebVar.bK();
                        bK.getClass();
                        dpbpVar2.b = bK;
                        dpbpVar2.a |= 1;
                        dpbp bK2 = dpbmVar.bK();
                        if (dphrVar.c) {
                            dphrVar.bF();
                            dphrVar.c = false;
                        }
                        dpie dpieVar4 = (dpie) dphrVar.b;
                        bK2.getClass();
                        dpieVar4.b();
                        dpieVar4.e.add(bK2);
                    }
                    dpec dpecVar3 = dpieVar2.d;
                    if (dpecVar3 == null) {
                        dpecVar3 = dpec.o;
                    }
                    dpec dpecVar4 = dpieVar3.d;
                    if (dpecVar4 == null) {
                        dpecVar4 = dpec.o;
                    }
                    dsqp dsqpVar4 = (dsqp) dpecVar3.cu(5);
                    dsqpVar4.bC(dpecVar3);
                    dpeb dpebVar2 = (dpeb) dsqpVar4;
                    dovy bZ = dowb.d.bZ();
                    dowb dowbVar = dpecVar3.d;
                    if (dowbVar == null) {
                        dowbVar = dowb.d;
                    }
                    int i7 = dowbVar.b;
                    dowb dowbVar2 = dpecVar4.d;
                    if (dowbVar2 == null) {
                        dowbVar2 = dowb.d;
                    }
                    int i8 = i7 + dowbVar2.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dowb dowbVar3 = (dowb) bZ.b;
                    dowbVar3.a |= 1;
                    dowbVar3.b = i8;
                    if (dpebVar2.c) {
                        dpebVar2.bF();
                        dpebVar2.c = false;
                    }
                    dpec dpecVar5 = (dpec) dpebVar2.b;
                    dowb bK3 = bZ.bK();
                    bK3.getClass();
                    dpecVar5.d = bK3;
                    dpecVar5.a |= 4;
                    dgar bZ2 = dgas.e.bZ();
                    dgas dgasVar = dpecVar3.e;
                    if (dgasVar == null) {
                        dgasVar = dgas.e;
                    }
                    int i9 = dgasVar.b;
                    dgas dgasVar2 = dpecVar4.e;
                    if (dgasVar2 == null) {
                        dgasVar2 = dgas.e;
                    }
                    int i10 = i9 + dgasVar2.b;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dgas dgasVar3 = (dgas) bZ2.b;
                    dgasVar3.a |= 1;
                    dgasVar3.b = i10;
                    if (dpebVar2.c) {
                        dpebVar2.bF();
                        dpebVar2.c = false;
                    }
                    dpec dpecVar6 = (dpec) dpebVar2.b;
                    dgas bK4 = bZ2.bK();
                    bK4.getClass();
                    dpecVar6.e = bK4;
                    dpecVar6.a |= 8;
                    doxd doxdVar = ((dpec) dpebVar2.b).k;
                    if (doxdVar == null) {
                        doxdVar = doxd.l;
                    }
                    dsqp dsqpVar5 = (dsqp) doxdVar.cu(5);
                    dsqpVar5.bC(doxdVar);
                    dows dowsVar = (dows) dsqpVar5;
                    if ((((doxd) dowsVar.b).a & 1) != 0) {
                        dgar bZ3 = dgas.e.bZ();
                        dgas dgasVar4 = ((doxd) dowsVar.b).b;
                        if (dgasVar4 == null) {
                            dgasVar4 = dgas.e;
                        }
                        int i11 = dgasVar4.b;
                        dgas dgasVar5 = dpecVar4.e;
                        if (dgasVar5 == null) {
                            dgasVar5 = dgas.e;
                        }
                        int i12 = i11 + dgasVar5.b;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dgas dgasVar6 = (dgas) bZ3.b;
                        dgasVar6.a |= 1;
                        dgasVar6.b = i12;
                        if (dowsVar.c) {
                            dowsVar.bF();
                            dowsVar.c = false;
                        }
                        doxd doxdVar2 = (doxd) dowsVar.b;
                        dgas bK5 = bZ3.bK();
                        bK5.getClass();
                        doxdVar2.b = bK5;
                        doxdVar2.a |= 1;
                        if (dpebVar2.c) {
                            dpebVar2.bF();
                            dpebVar2.c = false;
                        }
                        dpec dpecVar7 = (dpec) dpebVar2.b;
                        doxd bK6 = dowsVar.bK();
                        bK6.getClass();
                        dpecVar7.k = bK6;
                        dpecVar7.a |= 256;
                    }
                    if (dphrVar.c) {
                        dphrVar.bF();
                        dphrVar.c = false;
                    }
                    dpie dpieVar5 = (dpie) dphrVar.b;
                    dpec bK7 = dpebVar2.bK();
                    bK7.getClass();
                    dpieVar5.d = bK7;
                    dpieVar5.a |= 8;
                    this.a = new amve((dpie) dphrVar.bK());
                }
            }
        }
        return new amub(this);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bqgw  reason: default package */
/* loaded from: classes4.dex */
public class bqgw {
    public final ArrayList<bqhj> a;
    public final bokk b;
    public final bqhr c;
    @dzsi
    public bqhp d;
    public String e;
    public int f;
    private final bvrt<dnqe> g;

    public bqgw(bqhr bqhrVar, dnqe dnqeVar) {
        this.a = new ArrayList<>();
        this.f = 1;
        this.e = "";
        this.g = bvrt.b(dnqeVar);
        this.b = new bokk(true, "", true, bvom.a(Locale.getDefault()));
        this.c = bqhrVar;
    }

    public static bqgw a(bqhv bqhvVar) {
        return new bqgw(bqhvVar);
    }

    public static bqhv b(bqgw bqgwVar) {
        return bqgwVar.c().bK();
    }

    public final bqhm c() {
        bqhm bZ = bqhv.i.bZ();
        dnqe d = d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqhv bqhvVar = (bqhv) bZ.b;
        d.getClass();
        bqhvVar.b = d;
        bqhvVar.a |= 1;
        bokm bK = this.b.b().bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqhv bqhvVar2 = (bqhv) bZ.b;
        bK.getClass();
        bqhvVar2.c = bK;
        int i = bqhvVar2.a | 2;
        bqhvVar2.a = i;
        int i2 = this.f;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bqhvVar2.d = i3;
            int i4 = i | 4;
            bqhvVar2.a = i4;
            bqhr bqhrVar = this.c;
            bqhrVar.getClass();
            bqhvVar2.f = bqhrVar;
            bqhvVar2.a = i4 | 16;
            ArrayList<bqhj> arrayList = this.a;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                bqhu NV = bqhj.a.NV(arrayList.get(i5));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bqhv bqhvVar3 = (bqhv) bZ.b;
                NV.getClass();
                dsrj<bqhu> dsrjVar = bqhvVar3.g;
                if (!dsrjVar.a()) {
                    bqhvVar3.g = dsqw.cl(dsrjVar);
                }
                bqhvVar3.g.add(NV);
            }
            if (!this.e.isEmpty()) {
                String str = this.e;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bqhv bqhvVar4 = (bqhv) bZ.b;
                str.getClass();
                bqhvVar4.a |= 8;
                bqhvVar4.e = str;
            }
            bqhp bqhpVar = this.d;
            if (bqhpVar != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bqhv bqhvVar5 = (bqhv) bZ.b;
                bqhpVar.getClass();
                bqhvVar5.h = bqhpVar;
                bqhvVar5.a |= 32;
            }
            return bZ;
        }
        throw null;
    }

    public final dnqe d() {
        dnqe dnqeVar = (dnqe) bvrt.f(this.g, (dssr) dnqe.i.cu(7), dnqe.i);
        dbsk.s(dnqeVar);
        return dnqeVar;
    }

    public final List<bqhj> e() {
        return dcdc.r(this.a);
    }

    public final List<akqq> f() {
        return dcdc.r(dchl.k(this.a, bqgv.a));
    }

    public final void g(bqhj bqhjVar) {
        this.a.add(bqhjVar);
    }

    public final void h(int i) {
        this.a.remove(i);
    }

    public final void i() {
        Collections.reverse(this.a);
    }

    public bqgw(bqhr bqhrVar, dnqe dnqeVar, akqq akqqVar) {
        this(bqhrVar, dnqeVar);
        this.a.add(bqhj.e(akqqVar));
    }

    private bqgw(bqhv bqhvVar) {
        this.a = new ArrayList<>();
        int i = 1;
        this.f = 1;
        this.e = "";
        dnqe dnqeVar = bqhvVar.b;
        this.g = bvrt.b(dnqeVar == null ? dnqe.i : dnqeVar);
        for (bqhu bqhuVar : bqhvVar.g) {
            this.a.add(bqhj.a.k().NV(bqhuVar));
        }
        bokm bokmVar = bqhvVar.c;
        this.b = bokk.a(bokmVar == null ? bokm.n : bokmVar);
        if ((bqhvVar.a & 4) != 0) {
            int b = dnfa.b(bqhvVar.d);
            this.f = b != 0 ? b : i;
        }
        int i2 = bqhvVar.a;
        if ((i2 & 8) != 0) {
            this.e = bqhvVar.e;
        }
        if ((i2 & 32) != 0) {
            bqhp bqhpVar = bqhvVar.h;
            this.d = bqhpVar == null ? bqhp.e : bqhpVar;
        }
        bqhr bqhrVar = bqhvVar.f;
        this.c = bqhrVar == null ? bqhr.c : bqhrVar;
    }
}

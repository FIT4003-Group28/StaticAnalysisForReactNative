package defpackage;

import java.util.AbstractCollection;
import java.util.List;
/* compiled from: PG */
/* renamed from: amvg  reason: default package */
/* loaded from: classes2.dex */
public final class amvg {
    @dzsi
    public akqq A;
    @dzsi
    public Boolean B;
    @dzsi
    public dnjf C;
    @dzsi
    public dnwx D;
    @dzsi
    public dpju E;
    public dpjs a;
    @dzsi
    public String b;
    @dzsi
    public akqi c;
    @dzsi
    public akqq d;
    @dzsi
    public String e;
    public boolean f;
    public boolean g;
    public int h;
    @dzsi
    public altv i;
    @dzsi
    public String j;
    public boolean k;
    public dntm l;
    @dzsi
    public dpbl m;
    @dzsi
    public dpbj n;
    public dcdc<bvrt<dpce>> o;
    public dspd p;
    public dspd q;
    @dzsi
    public String r;
    @dzsi
    public dpjl s;
    @dzsi
    public dosw t;
    public boolean u;
    @dzsi
    public String v;
    @dzsi
    public String w;
    @dzsi
    public dpke x;
    public boolean y;
    public boolean z;

    public amvg() {
        this.a = dpjs.ENTITY_TYPE_DEFAULT;
        this.f = true;
        this.h = -1;
        this.k = true;
        this.l = dntm.UNKNOWN_PARKING_DIFFICULTY;
        this.o = dcdc.e();
        this.p = dspd.b;
        this.q = dspd.b;
        this.y = false;
        this.z = false;
    }

    public final amvh a() {
        return new amvh(this);
    }

    public final void b(@dzsi List<dpce> list) {
        AbstractCollection c;
        if (list == null) {
            c = dcdc.e();
        } else {
            c = bvrt.c(dcdc.r(list), new dccx());
        }
        this.o = (dcdc) c;
    }

    public final void c(dspd dspdVar) {
        dbsk.s(dspdVar);
        this.p = dspdVar;
    }

    public final void d(akra akraVar) {
        this.d = akraVar.S();
    }

    public amvg(amvh amvhVar) {
        this.a = dpjs.ENTITY_TYPE_DEFAULT;
        this.f = true;
        this.h = -1;
        this.k = true;
        this.l = dntm.UNKNOWN_PARKING_DIFFICULTY;
        this.o = dcdc.e();
        this.p = dspd.b;
        this.q = dspd.b;
        this.y = false;
        this.z = false;
        amvh amvhVar2 = amvh.a;
        this.a = amvhVar.b;
        this.b = amvhVar.c;
        this.c = amvhVar.d;
        this.d = amvhVar.e;
        String str = amvhVar.f;
        this.e = null;
        this.f = amvhVar.g;
        boolean z = amvhVar.h;
        this.g = false;
        this.h = amvhVar.i;
        this.i = amvhVar.j;
        this.j = amvhVar.k;
        this.k = amvhVar.l;
        this.l = amvhVar.m;
        this.m = (dpbl) bvrt.f(amvhVar.n, (dssr) dpbl.d.cu(7), dpbl.d);
        this.n = (dpbj) bvrt.f(amvhVar.o, (dssr) dpbj.c.cu(7), dpbj.c);
        this.o = amvhVar.q;
        this.p = amvhVar.B();
        this.q = amvhVar.B();
        this.r = amvhVar.r;
        this.s = (dpjl) bvrt.f(amvhVar.s, (dssr) dpjl.i.cu(7), dpjl.i);
        this.t = (dosw) bvrt.f(amvhVar.t, (dssr) dosw.f.cu(7), dosw.f);
        this.u = amvhVar.u;
        this.v = amvhVar.v;
        this.w = amvhVar.w;
        this.x = (dpke) bvrt.f(amvhVar.x, (dssr) dpke.f.cu(7), dpke.f);
        this.y = amvhVar.y;
        this.z = amvhVar.z;
        this.A = amvhVar.B;
        this.B = amvhVar.A;
        this.C = (dnjf) bvrt.f(amvhVar.C, (dssr) dnjf.d.cu(7), dnjf.d);
        this.D = (dnwx) bvrt.f(amvhVar.D, (dssr) dnwx.f.cu(7), dnwx.f);
        this.E = (dpju) bvrt.f(amvhVar.p, (dssr) dpju.a.cu(7), dpju.a);
    }
}

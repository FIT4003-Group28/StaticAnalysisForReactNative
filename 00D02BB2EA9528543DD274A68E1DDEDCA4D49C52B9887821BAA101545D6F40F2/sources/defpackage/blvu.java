package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: blvu  reason: default package */
/* loaded from: classes3.dex */
public class blvu implements Serializable {
    public final dspd a;
    public final String b;
    public final dspd c;
    public final String d;
    public final dgjw e;
    public final bvrt<dgju> f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final dgka l;
    public final String m;
    public final blvt n;
    public final boolean o;
    public final String p;
    public final int q;
    private final String r;
    private final dcdc<bvrt<dgkm>> s;
    private final dbsg<bvrt<dgci>> t;

    public blvu(blvs blvsVar) {
        this.a = blvsVar.a;
        this.r = blvsVar.b;
        this.b = blvsVar.c;
        this.c = blvsVar.d;
        this.d = blvsVar.e;
        this.n = blvsVar.o;
        this.e = blvsVar.f;
        dgju dgjuVar = blvsVar.g;
        this.f = bvrt.b(dgjuVar == null ? dgju.c : dgjuVar);
        this.g = blvsVar.h;
        this.h = blvsVar.i;
        this.i = blvsVar.j;
        this.q = blvsVar.s;
        this.j = blvsVar.k;
        this.k = blvsVar.l;
        this.l = blvsVar.m;
        this.m = blvsVar.n;
        this.p = blvsVar.q;
        this.t = blvsVar.r.h(blvq.a);
        this.s = (dcdc) bvrt.c(blvsVar.p, new dccx());
        this.o = false;
    }

    public static blvs d() {
        return new blvs();
    }

    public final dbsg<String> a() {
        return dbtw.a(this.r) ? dbpy.a : dbsg.i(this.r);
    }

    public final dcdc<dgkm> b() {
        return (dcdc) bvrt.d(this.s, new dccx(), (dssr) dgkm.h.cu(7), dgkm.h);
    }

    public final dbsg<dgci> c() {
        return this.t.h(blvr.a);
    }

    public final String toString() {
        return this.m;
    }
}

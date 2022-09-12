package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: egf  reason: default package */
/* loaded from: classes.dex */
public final class egf {
    private static final dcep<Integer> I = dcep.C(2, 3);
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public dpwz E;
    public final Set<Integer> F;
    public long G;
    public boolean H;
    public boolean a;
    public final int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ardz h;
    public final arbs i;
    public final boolean j;
    public boolean k;
    public afwn[] l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ddho v = dtyi.O;
    public final boolean w;
    public boolean x;
    public boolean y;
    @dzsi
    public final egc z;

    public egf(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, ardz ardzVar, arbs arbsVar, boolean z6, boolean z7, afwn[] afwnVarArr, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, @dzsi egc egcVar, boolean z18, boolean z19, dpwz dpwzVar) {
        HashSet c = dcnm.c();
        this.F = c;
        this.a = z;
        this.b = i;
        this.c = false;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = ardzVar;
        this.i = arbsVar;
        this.j = z6;
        this.k = z7;
        this.l = afwnVarArr;
        this.m = z8;
        this.n = z9;
        this.o = true;
        this.p = false;
        this.q = z10;
        this.r = z11;
        this.s = false;
        this.u = z12;
        this.t = z13;
        this.H = z14;
        this.w = z15;
        this.x = z16;
        this.G = 0L;
        this.y = z17;
        this.z = egcVar;
        this.A = z18;
        this.B = false;
        this.C = z19;
        this.D = false;
        this.E = dpwzVar;
        c.addAll(I);
    }

    public static egf a() {
        return new egf(false, Integer.MIN_VALUE, true, true, true, true, ardz.MAP, arbs.MOVE_JUMP_TELEPORT, false, true, new afwn[0], true, true, false, false, true, false, true, false, true, false, null, true, false, dpwz.UNKNOWN_MAP_CONTENT_TYPE);
    }

    public static egf b() {
        return new egf(false, Integer.MIN_VALUE, false, false, true, false, ardz.MAP, arbs.MOVE_JUMP_TELEPORT, false, true, new afwn[0], false, false, false, false, false, false, true, false, false, true, null, false, true, dpwz.MAP_CONTENT_DIRECTIONS_OVERVIEW);
    }

    public static egf c() {
        return new egf(false, Integer.MIN_VALUE, true, true, true, false, ardz.MAP, arbs.MOVE_JUMP_TELEPORT, false, true, new afwn[0], false, false, false, false, false, false, true, false, false, true, null, false, true, dpwz.MAP_CONTENT_DIRECTIONS_OVERVIEW);
    }

    public static egf d(dqvj dqvjVar) {
        boolean z = true;
        boolean z2 = dqvjVar == dqvj.WALK;
        if (dqvjVar == dqvj.WALK) {
            z = false;
        }
        return f(dqvjVar, false, null, z2, z);
    }

    public static egf e(dqvj dqvjVar, boolean z, @dzsi egc egcVar) {
        egf f = f(dqvjVar, z, egcVar, dqvjVar == dqvj.WALK, true);
        f.G = TimeUnit.SECONDS.toMillis(10L);
        f.l = new afwn[]{afwn.d(afwm.TRAFFIC, bvjk.bb, true), afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false)};
        return f;
    }

    public static egf f(dqvj dqvjVar, boolean z, @dzsi egc egcVar, boolean z2, boolean z3) {
        boolean z4;
        dbsk.t(dqvjVar, "travelMode");
        ArrayList arrayList = new ArrayList();
        ardz ardzVar = ardz.NAVIGATION;
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal = dqvjVar.ordinal();
        if (ordinal == 1) {
            arrayList.add(afwn.e(afwm.BICYCLING, true));
            arrayList.add(afwn.e(afwm.TRANSIT, false));
            arrayList.add(afwn.e(afwm.TRAFFIC, false));
        } else if (ordinal == 2) {
            arrayList.add(afwn.e(afwm.BICYCLING, false));
            arrayList.add(afwn.e(afwm.TRANSIT, false));
            arrayList.add(afwn.e(afwm.TRAFFIC, false));
        } else if (ordinal == 3) {
            arrayList.add(afwn.e(afwm.BICYCLING, false));
            arrayList.add(afwn.e(afwm.TRANSIT, true));
            arrayList.add(afwn.e(afwm.TRAFFIC, false));
        } else {
            arrayList.add(afwn.e(afwm.BICYCLING, false));
            arrayList.add(afwn.e(afwm.TRANSIT, false));
            z4 = true;
            arrayList.add(afwn.e(afwm.TERRAIN, false));
            arrayList.add(afwn.e(afwm.STREETVIEW, false));
            return new egf(true, 3, false, false, false, z2, ardzVar, arbs.a(dqvjVar), z3, false, (afwn[]) arrayList.toArray(new afwn[0]), false, false, true, true, false, true, false, z4, z, true, egcVar, false, false, dpwz.UNKNOWN_MAP_CONTENT_TYPE);
        }
        z4 = false;
        arrayList.add(afwn.e(afwm.TERRAIN, false));
        arrayList.add(afwn.e(afwm.STREETVIEW, false));
        return new egf(true, 3, false, false, false, z2, ardzVar, arbs.a(dqvjVar), z3, false, (afwn[]) arrayList.toArray(new afwn[0]), false, false, true, true, false, true, false, z4, z, true, egcVar, false, false, dpwz.UNKNOWN_MAP_CONTENT_TYPE);
    }

    public static egf g() {
        egf a = a();
        a.i();
        a.p();
        a.o();
        a.d = false;
        a.e = false;
        a.r();
        return a;
    }

    public static egf h() {
        egf a = a();
        a.l = new afwn[]{afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false)};
        a.d = false;
        a.e = false;
        a.h = ardz.NONE;
        a.n();
        a.p();
        a.o();
        return a;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        egf egfVar = (egf) obj;
        return this.a == egfVar.a && this.b == egfVar.b && this.c == egfVar.c && this.d == egfVar.d && this.e == egfVar.e && this.f == egfVar.f && this.g == egfVar.g && dbsd.a(this.h, egfVar.h) && dbsd.a(this.i, egfVar.i) && dbsd.a(Boolean.valueOf(this.j), Boolean.valueOf(egfVar.j)) && dbsd.a(Boolean.valueOf(this.k), Boolean.valueOf(egfVar.k)) && Arrays.equals(this.l, egfVar.l) && this.m == egfVar.m && this.n == egfVar.n && this.o == egfVar.o && this.p == egfVar.p && this.q == egfVar.q && this.r == egfVar.r && this.t == egfVar.t && this.u == egfVar.u && this.H == egfVar.H && dbsd.a(this.v, egfVar.v) && this.w == egfVar.w && this.x == egfVar.x && this.G == egfVar.G && this.s == egfVar.s && this.y == egfVar.y && dbsd.a(this.z, egfVar.z) && this.A == egfVar.A && this.E == egfVar.E;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), Integer.valueOf(Arrays.hashCode(this.l)), Boolean.valueOf(this.m), Boolean.valueOf(this.n), Boolean.valueOf(this.o), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.H), this.v, Boolean.valueOf(this.w), Boolean.valueOf(this.x), Long.valueOf(this.G), Boolean.valueOf(this.s), Boolean.valueOf(this.y), this.z, Boolean.valueOf(this.A), this.E});
    }

    public final void i() {
        afwm[] values = afwm.values();
        afwn[] afwnVarArr = new afwn[values.length];
        for (int i = 0; i < values.length; i++) {
            afwnVarArr[i] = afwn.e(values[i], false);
        }
        this.l = afwnVarArr;
    }

    public final void j() {
        this.u = false;
    }

    public final void k() {
        this.k = false;
    }

    public final void l(boolean z) {
        this.d = z;
        this.e = z;
    }

    public final void m() {
        this.A = true;
    }

    public final void n() {
        this.o = false;
    }

    public final void o() {
        this.r = true;
    }

    public final void p() {
        this.q = true;
    }

    public final void q() {
        this.y = true;
    }

    public final void r() {
        this.f = false;
    }

    public final void s(int i) {
        this.F.remove(Integer.valueOf(i - 1));
    }
}

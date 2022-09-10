package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aryr  reason: default package */
/* loaded from: classes2.dex */
public class aryr implements aryn {
    public final String a;
    @dzsi
    public final String b;
    public final akra c;
    public final dbsg<Integer> d;
    public final akqi e;
    public final boolean f;
    public final boolean g;
    @dzsi
    public final byed h;
    @dzsi
    public final cjtd i;
    public final boolean j;
    @dzsi
    public final String k;
    @dzsi
    public final String l;
    @dzsi
    public final Float m;
    public final Set<String> n;
    public final aryq o;
    @dzsi
    private final String p;
    @dzsi
    private final bvrt<dvxz> q;
    private final aryp r;
    private final bvrt<dpxf> s;
    private final aluu t;

    public aryr(aryo aryoVar) {
        String str = aryoVar.a;
        dbsk.s(str);
        this.a = str;
        this.p = aryoVar.b;
        this.b = aryoVar.c;
        this.q = bvrt.a(aryoVar.d);
        akra akraVar = aryoVar.e;
        dbsk.s(akraVar);
        this.c = akraVar;
        this.d = aryoVar.f;
        akqi akqiVar = aryoVar.g;
        dbsk.s(akqiVar);
        this.e = akqiVar;
        this.f = aryoVar.i;
        this.g = aryoVar.j;
        this.h = aryoVar.k;
        this.k = aryoVar.l;
        this.l = aryoVar.m;
        this.m = aryoVar.n;
        Set<String> set = aryoVar.o;
        dbsk.s(set);
        this.n = set;
        this.i = aryoVar.p;
        aryp arypVar = aryoVar.h;
        dbsk.s(arypVar);
        this.r = arypVar;
        this.j = aryoVar.q;
        dpxf dpxfVar = aryoVar.r;
        dbsk.s(dpxfVar);
        this.s = bvrt.b(dpxfVar);
        aluu aluuVar = aryoVar.s;
        dbsk.s(aluuVar);
        this.t = aluuVar;
        aryq aryqVar = aryoVar.t;
        dbsk.s(aryqVar);
        this.o = aryqVar;
    }

    public static aryo k() {
        return new aryo();
    }

    private final dpxf l() {
        return this.s.e((dssr) dpxf.f.cu(7), dpxf.f);
    }

    @Override // defpackage.aryn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aryn
    public final String b() {
        if (this.r == aryp.SMALL) {
            return "https://mts0.google.com/vt/icon/name=icons/spotlight/measle_8px.png&scale=4";
        }
        aluu aluuVar = this.t;
        dpxe dpxeVar = l().e;
        if (dpxeVar == null) {
            dpxeVar = dpxe.g;
        }
        return aluuVar.d(dpxeVar);
    }

    @Override // defpackage.aryn
    public final dmqc c() {
        aluu aluuVar = this.t;
        dpxe dpxeVar = l().e;
        if (dpxeVar == null) {
            dpxeVar = dpxe.g;
        }
        return aluuVar.a(dpxeVar, false);
    }

    @Override // defpackage.aryn
    public final String d() {
        String str = this.p;
        return str == null ? this.a : str;
    }

    @Override // defpackage.aryn
    public final String e() {
        if (this.r == aryp.SMALL) {
            return "https://mts0.google.com/vt/icon/name=icons/spotlight/measle_night_8px.png&scale=4";
        }
        aluu aluuVar = this.t;
        dpxe dpxeVar = l().e;
        if (dpxeVar == null) {
            dpxeVar = dpxe.g;
        }
        for (String str : aluu.b(dpxeVar, false)) {
            String concat = String.valueOf(str).concat(".Night");
            if (aluuVar.a.containsKey(concat)) {
                String valueOf = String.valueOf(aluuVar.b);
                String valueOf2 = String.valueOf(aluuVar.a.get(concat).a);
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
        }
        String valueOf3 = String.valueOf(aluuVar.b);
        String valueOf4 = String.valueOf(aluu.c("generic"));
        return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof aryr) {
            aryr aryrVar = (aryr) obj;
            if (dbsd.a(this.a, aryrVar.a) && dbsd.a(this.p, aryrVar.p) && dbsd.a(this.b, aryrVar.b) && dbsd.a(this.q, aryrVar.q) && dbsd.a(this.c, aryrVar.c) && dbsd.a(this.d, aryrVar.d) && dbsd.a(this.e, aryrVar.e) && dbsd.a(Boolean.valueOf(this.f), Boolean.valueOf(aryrVar.f)) && dbsd.a(Boolean.valueOf(this.g), Boolean.valueOf(aryrVar.g)) && dbsd.a(this.h, aryrVar.h) && dbsd.a(this.i, aryrVar.i) && dbsd.a(this.r, aryrVar.r) && dbsd.a(this.k, aryrVar.k) && dbsd.a(this.l, aryrVar.l) && dbsd.a(this.m, aryrVar.m) && dbsd.a(this.n, aryrVar.n) && dbsd.a(this.o, aryrVar.o)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aryn
    public final akra f() {
        return this.c;
    }

    @Override // defpackage.aryn
    public final akqi g() {
        return this.e;
    }

    @Override // defpackage.aryn
    @dzsi
    public final cjtd h() {
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.p, this.b, this.q, this.c, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, this.r, this.k, this.l, this.m, this.n, this.o});
    }

    @Override // defpackage.aryn
    public final boolean i() {
        return this.r == aryp.SMALL;
    }

    @dzsi
    public final dvxz j() {
        return (dvxz) bvrt.f(this.q, (dssr) dvxz.h.cu(7), dvxz.h);
    }
}

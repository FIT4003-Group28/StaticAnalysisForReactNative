package defpackage;

import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: amsy  reason: default package */
/* loaded from: classes2.dex */
public class amsy {
    public final dwbc a;
    public final dvzu b;
    public final String c;
    public final amve[] d;
    private final akrk[] e;

    public amsy(dwbc dwbcVar) {
        this(dwbcVar, UUID.randomUUID().toString());
    }

    public static void H(@dzsi dwbc dwbcVar) {
        dbsk.s(dwbcVar);
        boolean z = true;
        dbsk.l(1 == (dwbcVar.a & 1));
        dwaa dwaaVar = dwbcVar.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        if (1 != (dwaaVar.a & 1)) {
            z = false;
        }
        dbsk.l(z);
    }

    private static boolean I(dwbc dwbcVar) {
        int a = dwbb.a(dwbcVar.d);
        return a != 0 && a == 3;
    }

    public final int A() {
        return this.b.w.size();
    }

    @dzsi
    public final dovh B() {
        int i;
        dvzu dvzuVar = this.b;
        if ((dvzuVar.a & 16384) == 0 || (i = dvzuVar.x) < 0 || i >= dvzuVar.w.size()) {
            return null;
        }
        return this.b.w.get(i);
    }

    public final int C() {
        return this.b.x;
    }

    public final boolean D() {
        return (this.b.a & 262144) != 0;
    }

    public final dpfh E() {
        dpfh dpfhVar = this.b.A;
        return dpfhVar == null ? dpfh.l : dpfhVar;
    }

    public final boolean F() {
        return this.b.D;
    }

    public final amtr G(int i) {
        dwaa dwaaVar = this.a.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        return new amtr(dvzuVar.e.get(i).e.get(0));
    }

    public final dwaa a() {
        dwaa dwaaVar = this.a.b;
        return dwaaVar == null ? dwaa.g : dwaaVar;
    }

    public final boolean b() {
        dwaa dwaaVar = this.a.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        return (dwaaVar.a & 16) != 0;
    }

    public final String c() {
        dwaa dwaaVar = this.a.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        return dwaaVar.d;
    }

    public final boolean d() {
        return I(this.a);
    }

    public final dwak e() {
        dwak dwakVar = this.b.z;
        return dwakVar == null ? dwak.b : dwakVar;
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof amsy) && this.a == ((amsy) obj).a;
    }

    @dzsi
    public final akrk f(amve amveVar) {
        if (amveVar.i()) {
            int h = amveVar.h();
            akrk[] akrkVarArr = this.e;
            if (h >= akrkVarArr.length) {
                return null;
            }
            if (akrkVarArr[h] == null) {
                akrkVarArr[h] = akrk.h(this.b.p.get(h));
            }
            return this.e[h];
        }
        return null;
    }

    public final douz g() {
        douz douzVar = this.b.B;
        return douzVar == null ? douz.g : douzVar;
    }

    public final dpkf h(int i) {
        return this.b.b.get(i);
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final int i() {
        return this.b.b.size();
    }

    public final dpjp j(int i) {
        return this.b.c.get(i);
    }

    public final List<dpjp> k() {
        return this.b.c;
    }

    public final int l() {
        return this.b.c.size();
    }

    public final amve m(int i) {
        if (i >= 0) {
            amve[] amveVarArr = this.d;
            if (amveVarArr.length > i) {
                return amveVarArr[i];
            }
            return null;
        }
        return null;
    }

    public final int n() {
        return this.b.e.size();
    }

    public final int o() {
        return this.b.g;
    }

    public final boolean p() {
        return (this.b.a & 2) != 0;
    }

    public final byte[] q() {
        return this.b.y.G();
    }

    public final boolean r() {
        return (this.b.a & 32768) != 0;
    }

    public final dovb s() {
        dovb b = dovb.b(this.b.j);
        return b == null ? dovb.SUCCESS : b;
    }

    public final boolean t() {
        dovb b = dovb.b(this.b.j);
        if (b == null) {
            b = dovb.SUCCESS;
        }
        return b == dovb.SUCCESS;
    }

    public final List<dozz> u() {
        return this.b.m;
    }

    public final boolean v() {
        return this.b.k;
    }

    public final boolean w() {
        return this.b.l;
    }

    public final dovp x(int i) {
        return this.b.v.get(i);
    }

    public final int y() {
        return this.b.v.size();
    }

    public final dovh z(int i) {
        return this.b.w.get(i);
    }

    public amsy(dwbc dwbcVar, @dzsi String str) {
        H(dwbcVar);
        this.a = dwbcVar;
        dwaa dwaaVar = dwbcVar.b;
        dvzu dvzuVar = (dwaaVar == null ? dwaa.g : dwaaVar).b;
        dvzuVar = dvzuVar == null ? dvzu.F : dvzuVar;
        this.b = dvzuVar;
        this.e = new akrk[dvzuVar.p.size()];
        int size = dvzuVar.e.size();
        amve[] amveVarArr = new amve[size];
        for (int i = 0; i < size; i++) {
            amveVarArr[i] = new amve(dvzuVar.e.get(i), I(dwbcVar));
        }
        this.d = amveVarArr;
        this.c = str == null ? UUID.randomUUID().toString() : str;
    }
}

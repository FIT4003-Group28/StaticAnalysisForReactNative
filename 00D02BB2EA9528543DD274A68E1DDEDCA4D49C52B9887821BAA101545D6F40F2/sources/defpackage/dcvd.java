package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcvd  reason: default package */
/* loaded from: classes5.dex */
public final class dcvd implements Serializable, dcxa {
    public final dcwa a;
    public final dcuz b;

    public dcvd(dcwa dcwaVar, dcuz dcuzVar) {
        this.a = dcwaVar;
        this.b = dcuzVar;
    }

    public static dcvd a(dcwa dcwaVar, dcuz dcuzVar) {
        return new dcvd(dcwaVar, dcuzVar);
    }

    public static dcvd b(dcwa dcwaVar, dcuy dcuyVar) {
        return a(dcwaVar, dcuz.a(dcuy.d(Math.min(dcuyVar.b, 3.141592653589793d))));
    }

    public final double c() {
        return this.b.e * 0.5d;
    }

    public final dcuy d() {
        return this.b.f();
    }

    public final boolean e() {
        return this.b.c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcvd) {
            dcvd dcvdVar = (dcvd) obj;
            return (this.a.p(dcvdVar.a) && this.b.equals(dcvdVar.b)) || (e() && dcvdVar.e()) || (f() && dcvdVar.f());
        }
        return false;
    }

    public final boolean f() {
        return dcuz.b.equals(this.b);
    }

    public final dcvu g() {
        boolean z;
        if (e()) {
            return dcvu.c();
        }
        if (f()) {
            return dcvu.d();
        }
        dcvs dcvsVar = new dcvs(this.a);
        double d = d().b;
        double[] dArr = new double[2];
        double[] dArr2 = {-3.141592653589793d, 3.141592653589793d};
        double d2 = dcvsVar.f().b - d;
        dArr[0] = d2;
        if (d2 <= -1.5707963267948966d) {
            dArr[0] = -1.5707963267948966d;
            z = true;
        } else {
            z = false;
        }
        double d3 = dcvsVar.f().b + d;
        dArr[1] = d3;
        if (d3 >= 1.5707963267948966d) {
            dArr[1] = 1.5707963267948966d;
        } else if (!z) {
            double g = dcuz.g(this.b);
            double cos = Math.cos(dcvsVar.f().b);
            if (g <= cos) {
                double asin = Math.asin(g / cos);
                dArr2[0] = dcus.b(dcvsVar.h().b - asin);
                dArr2[1] = dcus.b(dcvsVar.h().b + asin);
            }
        }
        return new dcvu(new dcuu(dArr[0], dArr[1]), new dcva(dArr2[0], dArr2[1]));
    }

    @Override // defpackage.dcxa
    public final boolean h(dcwa dcwaVar) {
        return new dcuz(this.a, dcwaVar).compareTo(this.b) <= 0;
    }

    public final int hashCode() {
        if (f()) {
            return 17;
        }
        if (!e()) {
            return ((this.a.hashCode() + 629) * 37) + this.b.hashCode();
        }
        return 37;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
        sb.append("[Point = ");
        sb.append(valueOf);
        sb.append(" Radius = ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}

package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcvv  reason: default package */
/* loaded from: classes.dex */
public abstract class dcvv implements Serializable, dcxa {
    public final dcuu a;
    public final dcva b;

    public dcvv() {
        this.a = dcuu.a();
        this.b = dcva.d();
    }

    public dcvv(dcuu dcuuVar, dcva dcvaVar) {
        this.a = dcuuVar;
        this.b = dcvaVar;
    }

    public abstract dcuu a();

    public abstract dcva b();

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            dcvv dcvvVar = (dcvv) obj;
            if (a().equals(dcvvVar.a()) && b().equals(dcvvVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcxa
    public final boolean h(dcwa dcwaVar) {
        dcvs dcvsVar = new dcvs(dcwaVar);
        if (this.a.e(dcvsVar.b)) {
            dcva dcvaVar = this.b;
            double d = dcvsVar.c;
            if (d == -3.141592653589793d) {
                d = 3.141592653589793d;
            }
            return dcvaVar.l(d);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 629) * 37) + this.b.hashCode();
    }

    public final dcuy k() {
        return dcuy.d(this.a.a);
    }

    public final dcuy l() {
        return dcuy.d(this.a.b);
    }

    public final dcuy m() {
        return dcuy.d(this.b.a);
    }

    public final dcuy n() {
        return dcuy.d(this.b.b);
    }

    public final dcvs o() {
        return new dcvs(k(), m());
    }

    public final dcvs p() {
        return new dcvs(l(), n());
    }

    public final boolean q() {
        return this.a.d();
    }

    public final dcvs r(int i) {
        double d;
        double d2;
        if (i != 0) {
            if (i == 1) {
                d = this.a.a;
            } else if (i == 2) {
                d = this.a.b;
            } else if (i == 3) {
                d = this.a.b;
            } else {
                throw new IllegalArgumentException("Invalid vertex index.");
            }
            d2 = this.b.b;
            return dcvs.a(d, d2);
        }
        d = this.a.a;
        d2 = this.b.a;
        return dcvs.a(d, d2);
    }

    public final boolean s(dcvv dcvvVar) {
        dcuu dcuuVar = this.a;
        dcuu dcuuVar2 = dcvvVar.a;
        double d = dcuuVar.a;
        double d2 = dcuuVar2.a;
        if (d <= d2) {
            if (d2 > dcuuVar.b || d2 > dcuuVar2.b) {
                return false;
            }
        } else if (d > dcuuVar2.b || d > dcuuVar.b) {
            return false;
        }
        dcva dcvaVar = this.b;
        dcva dcvaVar2 = dcvvVar.b;
        if (dcvaVar.i() || dcvaVar2.i()) {
            return false;
        }
        return dcvaVar.j() ? dcvaVar2.j() || dcvaVar2.a <= dcvaVar.b || dcvaVar2.b >= dcvaVar.a : dcvaVar2.j() ? dcvaVar2.a <= dcvaVar.b || dcvaVar2.b >= dcvaVar.a : dcvaVar2.a <= dcvaVar.b && dcvaVar2.b >= dcvaVar.a;
    }

    public final double t() {
        return q() ? dcyn.a : b().k() * Math.abs(Math.sin(l().b) - Math.sin(k().b));
    }

    public final String toString() {
        String valueOf = String.valueOf(o());
        String valueOf2 = String.valueOf(p());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10 + String.valueOf(valueOf2).length());
        sb.append("[Lo=");
        sb.append(valueOf);
        sb.append(", Hi=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    public dcvv(dcvs dcvsVar, dcvs dcvsVar2) {
        this.a = new dcuu(dcvsVar.f().b, dcvsVar2.f().b);
        this.b = new dcva(dcvsVar.h().b, dcvsVar2.h().b);
    }
}

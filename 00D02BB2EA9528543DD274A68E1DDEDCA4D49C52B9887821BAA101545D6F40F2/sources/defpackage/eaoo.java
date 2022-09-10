package defpackage;
/* compiled from: PG */
/* renamed from: eaoo  reason: default package */
/* loaded from: classes.dex */
public final class eaoo extends eaop {
    private static final long serialVersionUID = -9937958251642L;
    private final byte A;
    public final transient eaoz a;
    public final transient eaoz b;

    public eaoo(String str, byte b, eaoz eaozVar, eaoz eaozVar2) {
        super(str);
        this.A = b;
        this.a = eaozVar;
        this.b = eaozVar2;
    }

    private Object readResolve() {
        switch (this.A) {
            case 1:
                return eaop.c;
            case 2:
                return eaop.d;
            case 3:
                return eaop.e;
            case 4:
                return eaop.f;
            case 5:
                return eaop.g;
            case 6:
                return eaop.h;
            case 7:
                return eaop.i;
            case 8:
                return eaop.j;
            case 9:
                return eaop.k;
            case 10:
                return eaop.l;
            case 11:
                return eaop.m;
            case 12:
                return eaop.n;
            case 13:
                return eaop.o;
            case 14:
                return eaop.p;
            case 15:
                return eaop.q;
            case 16:
                return eaop.r;
            case 17:
                return eaop.s;
            case 18:
                return eaop.t;
            case 19:
                return eaop.u;
            case 20:
                return eaop.v;
            case 21:
                return eaop.w;
            case 22:
                return eaop.x;
            default:
                return eaop.y;
        }
    }

    @Override // defpackage.eaop
    public final eaoz a() {
        return this.a;
    }

    @Override // defpackage.eaop
    public final eaoz b() {
        return this.b;
    }

    @Override // defpackage.eaop
    public final eaon c(eaok eaokVar) {
        eaok d = eaor.d(eaokVar);
        switch (this.A) {
            case 1:
                return d.T();
            case 2:
                return d.O();
            case 3:
                return d.R();
            case 4:
                return d.P();
            case 5:
                return d.N();
            case 6:
                return d.E();
            case 7:
                return d.L();
            case 8:
                return d.D();
            case 9:
                return d.J();
            case 10:
                return d.I();
            case 11:
                return d.G();
            case 12:
                return d.C();
            case 13:
                return d.A();
            case 14:
                return d.y();
            case 15:
                return d.z();
            case 16:
                return d.w();
            case 17:
                return d.v();
            case 18:
                return d.t();
            case 19:
                return d.s();
            case 20:
                return d.q();
            case 21:
                return d.p();
            case 22:
                return d.n();
            default:
                return d.m();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eaoo) && this.A == ((eaoo) obj).A;
    }

    public final int hashCode() {
        return 1 << this.A;
    }
}

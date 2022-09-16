package defpackage;
/* compiled from: PG */
/* renamed from: baho  reason: default package */
/* loaded from: classes2.dex */
public final class baho extends bahp {
    private static final long serialVersionUID = -9937958251642L;
    private final byte A;
    public final transient bahx a;
    public final transient bahx b;

    public baho(String str, byte b, bahx bahxVar, bahx bahxVar2) {
        super(str);
        this.A = b;
        this.a = bahxVar;
        this.b = bahxVar2;
    }

    private Object readResolve() {
        switch (this.A) {
            case 1:
                return bahp.c;
            case 2:
                return bahp.d;
            case 3:
                return bahp.e;
            case 4:
                return bahp.f;
            case 5:
                return bahp.g;
            case 6:
                return bahp.h;
            case 7:
                return bahp.i;
            case 8:
                return bahp.j;
            case 9:
                return bahp.k;
            case 10:
                return bahp.l;
            case 11:
                return bahp.m;
            case 12:
                return bahp.n;
            case 13:
                return bahp.o;
            case 14:
                return bahp.p;
            case 15:
                return bahp.q;
            case 16:
                return bahp.r;
            case 17:
                return bahp.s;
            case 18:
                return bahp.t;
            case 19:
                return bahp.u;
            case 20:
                return bahp.v;
            case 21:
                return bahp.w;
            case 22:
                return bahp.x;
            default:
                return bahp.y;
        }
    }

    @Override // defpackage.bahp
    public final bahn a(bahl bahlVar) {
        bahl d = bahq.d(bahlVar);
        switch (this.A) {
            case 1:
                return d.i();
            case 2:
                return d.y();
            case 3:
                return d.c();
            case 4:
                return d.x();
            case 5:
                return d.w();
            case 6:
                return d.h();
            case 7:
                return d.q();
            case 8:
                return d.f();
            case 9:
                return d.v();
            case 10:
                return d.u();
            case 11:
                return d.t();
            case 12:
                return d.g();
            case 13:
                return d.j();
            case 14:
                return d.l();
            case 15:
                return d.e();
            case 16:
                return d.d();
            case 17:
                return d.k();
            case 18:
                return d.o();
            case 19:
                return d.p();
            case 20:
                return d.r();
            case 21:
                return d.s();
            case 22:
                return d.m();
            default:
                return d.n();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof baho) && this.A == ((baho) obj).A;
    }

    public final int hashCode() {
        return 1 << this.A;
    }
}

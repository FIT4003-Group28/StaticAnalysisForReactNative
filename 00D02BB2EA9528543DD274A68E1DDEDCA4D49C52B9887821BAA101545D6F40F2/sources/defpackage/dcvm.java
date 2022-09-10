package defpackage;
/* compiled from: PG */
/* renamed from: dcvm  reason: default package */
/* loaded from: classes5.dex */
public final class dcvm {
    int a;
    private dcwa b;
    private dcwa c;
    private dcwa d;
    private dcwa e;
    private int f;
    private boolean g;
    private dcwa h;
    private dcwa i;

    public dcvm() {
    }

    static int b(dcwa dcwaVar, dcwa dcwaVar2) {
        double d = dcvc.c * 1.8274d;
        double d2 = dcwaVar.d(dcwaVar2);
        if (d2 >= d) {
            return 1;
        }
        return d2 <= (-d) ? -1 : 0;
    }

    private static int d(dcwa dcwaVar, dcwa dcwaVar2, dcwa dcwaVar3, dcwa dcwaVar4) {
        int b = b(dcwaVar4, dcwaVar3);
        return b == 0 ? dcwj.a(dcwaVar, dcwaVar2, dcwaVar3) : b;
    }

    public final void a(dcwa dcwaVar) {
        this.e = dcwaVar;
        this.f = -b(this.d, dcwaVar);
    }

    public final boolean c(dcwa dcwaVar) {
        dcwa dcwaVar2 = this.e;
        int b = b(this.d, dcwaVar);
        int i = -b;
        char c = 65535;
        if (this.f != i || b == 0) {
            this.a = b;
            if (!this.g) {
                dcwa f = dcwa.f(dcvc.d(this.b, this.c));
                this.h = dcwa.e(this.b, f);
                this.i = dcwa.e(f, this.c);
                this.g = true;
            }
            double sqrt = ((1.0d / Math.sqrt(3.0d)) + 1.5d) * dcvc.c;
            if ((this.e.d(this.h) <= sqrt || dcwaVar.d(this.h) <= sqrt) && (this.e.d(this.i) <= sqrt || dcwaVar.d(this.i) <= sqrt)) {
                if (this.b.p(this.e) || this.b.p(dcwaVar) || this.c.p(this.e) || this.c.p(dcwaVar) || this.b.p(this.c) || this.e.p(dcwaVar)) {
                    c = 0;
                } else {
                    if (this.f == 0) {
                        this.f = -dcwj.a(this.b, this.c, this.e);
                    }
                    int i2 = this.a;
                    if (i2 == 0) {
                        i2 = dcwj.a(this.b, this.c, dcwaVar);
                        this.a = i2;
                    }
                    if (i2 == this.f) {
                        dcwa e = dcwa.e(this.e, dcwaVar);
                        if ((-d(this.e, dcwaVar, this.c, e)) == this.f && d(this.e, dcwaVar, this.b, e) == this.f) {
                            c = 1;
                        }
                    }
                }
            }
            this.e = dcwaVar;
            this.f = -this.a;
        } else {
            this.e = dcwaVar;
            this.f = i;
        }
        if (c < 0) {
            return false;
        }
        if (c <= 0) {
            return dcvo.d(this.b, this.c, dcwaVar2, dcwaVar);
        }
        return true;
    }

    public dcvm(dcwa dcwaVar, dcwa dcwaVar2) {
        this.b = dcwaVar;
        this.c = dcwaVar2;
        this.e = null;
        this.d = dcwa.e(dcwaVar, dcwaVar2);
        this.g = false;
    }

    public dcvm(dcwa dcwaVar, dcwa dcwaVar2, dcwa dcwaVar3) {
        this(dcwaVar, dcwaVar2);
        a(dcwaVar3);
    }
}

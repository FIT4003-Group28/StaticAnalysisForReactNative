package defpackage;
/* compiled from: PG */
/* renamed from: bbm  reason: default package */
/* loaded from: classes2.dex */
final class bbm {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final pwu f;
    private final pwu g;
    private int h;
    private int i;

    public bbm(pwu pwuVar, pwu pwuVar2, boolean z) {
        this.g = pwuVar;
        this.f = pwuVar2;
        this.e = z;
        pwuVar2.G(12);
        this.a = pwuVar2.l();
        pwuVar.G(12);
        this.i = pwuVar.l();
        asg.c(pwuVar.d() != 1 ? false : true, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        long p;
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        if (this.e) {
            p = this.f.q();
        } else {
            p = this.f.p();
        }
        this.d = p;
        if (this.b == this.h) {
            this.c = this.g.l();
            this.g.H(4);
            int i2 = -1;
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i2 = (-1) + this.g.l();
            }
            this.h = i2;
        }
        return true;
    }
}

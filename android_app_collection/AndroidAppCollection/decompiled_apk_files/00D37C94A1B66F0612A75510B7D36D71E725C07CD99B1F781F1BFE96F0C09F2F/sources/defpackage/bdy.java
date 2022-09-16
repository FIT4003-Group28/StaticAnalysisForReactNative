package defpackage;
/* compiled from: PG */
/* renamed from: bdy  reason: default package */
/* loaded from: classes2.dex */
public final class bdy implements beg {
    private final bdx a;
    private final pwu b = new pwu(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public bdy(bdx bdxVar) {
        this.a = bdxVar;
    }

    @Override // defpackage.beg
    public final void a(pwu pwuVar, int i) {
        int i2 = i & 1;
        int i3 = i2 != 0 ? pwuVar.b + pwuVar.i() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            pwuVar.G(i3);
            this.d = 0;
        }
        while (pwuVar.a() > 0) {
            int i4 = this.d;
            if (i4 < 3) {
                if (i4 == 0) {
                    int i5 = pwuVar.i();
                    pwuVar.G(pwuVar.b - 1);
                    if (i5 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(pwuVar.a(), 3 - this.d);
                pwuVar.B(this.b.a, this.d, min);
                int i6 = this.d + min;
                this.d = i6;
                if (i6 == 3) {
                    this.b.G(0);
                    this.b.F(3);
                    this.b.H(1);
                    int i7 = this.b.i();
                    int i8 = this.b.i();
                    this.e = (i7 & 128) != 0;
                    this.c = (((i7 & 15) << 8) | i8) + 3;
                    int b = this.b.b();
                    int i9 = this.c;
                    if (b < i9) {
                        int b2 = this.b.b();
                        this.b.z(Math.min(4098, Math.max(i9, b2 + b2)));
                    }
                }
            } else {
                int min2 = Math.min(pwuVar.a(), this.c - this.d);
                pwuVar.B(this.b.a, this.d, min2);
                int i10 = this.d + min2;
                this.d = i10;
                int i11 = this.c;
                if (i10 != i11) {
                    continue;
                } else {
                    if (this.e) {
                        if (pxi.ai(this.b.a, i11) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.F(this.c - 4);
                    } else {
                        this.b.F(i11);
                    }
                    this.b.G(0);
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.beg
    public final void b(pxg pxgVar, azh azhVar, bef befVar) {
        this.a.b(pxgVar, azhVar, befVar);
        this.f = true;
    }

    @Override // defpackage.beg
    public final void c() {
        this.f = true;
    }
}

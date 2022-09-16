package defpackage;
/* compiled from: PG */
/* renamed from: bdp  reason: default package */
/* loaded from: classes2.dex */
public final class bdp implements bdd {
    private final pwu a;
    private final azt b;
    private final String c;
    private bab d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public bdp() {
        this(null);
    }

    @Override // defpackage.bdd
    public final void a(pwu pwuVar) {
        azt aztVar;
        ptx.b(this.d);
        while (pwuVar.a() > 0) {
            int i = this.f;
            if (i == 0) {
                byte[] bArr = pwuVar.a;
                int i2 = pwuVar.b;
                int i3 = pwuVar.c;
                while (true) {
                    if (i2 < i3) {
                        byte b = bArr[i2];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.i && (b & 224) == 224;
                        this.i = z;
                        if (z2) {
                            pwuVar.G(i2 + 1);
                            this.i = false;
                            this.a.a[1] = bArr[i2];
                            this.g = 2;
                            this.f = 1;
                            break;
                        }
                        i2++;
                    } else {
                        pwuVar.G(i3);
                        break;
                    }
                }
            } else if (i == 1) {
                int min = Math.min(pwuVar.a(), 4 - this.g);
                pwuVar.B(this.a.a, this.g, min);
                int i4 = this.g + min;
                this.g = i4;
                if (i4 >= 4) {
                    this.a.G(0);
                    if (!this.b.a(this.a.d())) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        this.k = this.b.c;
                        if (!this.h) {
                            this.j = (aztVar.g * 1000000) / aztVar.d;
                            pis pisVar = new pis();
                            pisVar.a = this.e;
                            azt aztVar2 = this.b;
                            pisVar.k = aztVar2.b;
                            pisVar.l = 4096;
                            pisVar.x = aztVar2.e;
                            pisVar.y = aztVar2.d;
                            pisVar.c = this.c;
                            this.d.rx(pisVar.a());
                            this.h = true;
                        }
                        this.a.G(0);
                        this.d.c(this.a, 4);
                        this.f = 2;
                    }
                }
            } else {
                int min2 = Math.min(pwuVar.a(), this.k - this.g);
                this.d.c(pwuVar, min2);
                int i5 = this.g + min2;
                this.g = i5;
                int i6 = this.k;
                if (i5 >= i6) {
                    this.d.e(this.l, 1, i6, 0, null);
                    this.l += this.j;
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        befVar.c();
        this.e = befVar.b();
        this.d = azhVar.pT(befVar.a(), 1);
    }

    @Override // defpackage.bdd
    public final void c() {
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.bdd
    public final void e() {
        this.f = 0;
        this.g = 0;
        this.i = false;
    }

    public bdp(String str) {
        this.f = 0;
        pwu pwuVar = new pwu(4);
        this.a = pwuVar;
        pwuVar.a[0] = -1;
        this.b = new azt();
        this.c = str;
    }
}

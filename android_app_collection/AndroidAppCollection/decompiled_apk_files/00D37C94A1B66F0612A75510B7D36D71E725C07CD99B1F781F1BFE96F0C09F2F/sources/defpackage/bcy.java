package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: bcy  reason: default package */
/* loaded from: classes2.dex */
public final class bcy implements bdd {
    public long a;
    private final pwt b;
    private final pwu c;
    private final String d;
    private String e;
    private bab f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private Format k;
    private int l;

    public bcy() {
        this(null);
    }

    @Override // defpackage.bdd
    public final void a(pwu pwuVar) {
        ptx.b(this.f);
        while (pwuVar.a() > 0) {
            int i = this.g;
            if (i == 0) {
                while (pwuVar.a() > 0) {
                    if (!this.i) {
                        this.i = pwuVar.i() == 172;
                    } else {
                        int i2 = pwuVar.i();
                        this.i = i2 == 172;
                        byte b = 64;
                        if (i2 != 64) {
                            if (i2 == 65) {
                                i2 = 65;
                            }
                        }
                        this.g = 1;
                        byte[] bArr = this.c.a;
                        bArr[0] = -84;
                        if (i2 == 65) {
                            b = 65;
                        }
                        bArr[1] = b;
                        this.h = 2;
                    }
                }
            } else if (i == 1) {
                byte[] bArr2 = this.c.a;
                int min = Math.min(pwuVar.a(), 16 - this.h);
                pwuVar.B(bArr2, this.h, min);
                int i3 = this.h + min;
                this.h = i3;
                if (i3 == 16) {
                    this.b.j(0);
                    ayo a = ayp.a(this.b);
                    Format format = this.k;
                    if (format == null || format.y != 2 || a.a != format.z || !"audio/ac4".equals(format.l)) {
                        pis pisVar = new pis();
                        pisVar.a = this.e;
                        pisVar.k = "audio/ac4";
                        pisVar.x = 2;
                        pisVar.y = a.a;
                        pisVar.c = this.d;
                        Format a2 = pisVar.a();
                        this.k = a2;
                        this.f.rx(a2);
                    }
                    this.l = a.b;
                    this.j = (a.c * 1000000) / this.k.z;
                    this.c.G(0);
                    this.f.c(this.c, 16);
                    this.g = 2;
                }
            } else {
                int min2 = Math.min(pwuVar.a(), this.l - this.h);
                this.f.c(pwuVar, min2);
                int i4 = this.h + min2;
                this.h = i4;
                int i5 = this.l;
                if (i4 == i5) {
                    this.f.e(this.a, 1, i5, 0, null);
                    this.a += this.j;
                    this.g = 0;
                }
            }
        }
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        befVar.c();
        this.e = befVar.b();
        this.f = azhVar.pT(befVar.a(), 1);
    }

    @Override // defpackage.bdd
    public final void c() {
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        this.a = j;
    }

    @Override // defpackage.bdd
    public final void e() {
        this.g = 0;
        this.h = 0;
        this.i = false;
    }

    public bcy(String str) {
        pwt pwtVar = new pwt(new byte[16]);
        this.b = pwtVar;
        this.c = new pwu(pwtVar.a);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.d = str;
    }
}

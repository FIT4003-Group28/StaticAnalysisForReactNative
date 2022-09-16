package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: clys  reason: default package */
/* loaded from: classes5.dex */
public final class clys implements clyz {
    public long a;
    private final cmnj b;
    private final cmnk c;
    private final String d;
    private String e;
    private clvk f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private long k;
    private Format l;
    private int m;

    public clys() {
        this(null);
    }

    @Override // defpackage.clyz
    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        this.e = cmajVar.c();
        this.f = clupVar.RT(cmajVar.b());
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        this.a = j;
    }

    @Override // defpackage.clyz
    public final void d(cmnk cmnkVar) {
        cmmn.e(this.f);
        while (cmnkVar.d() > 0) {
            int i = this.g;
            if (i == 0) {
                while (cmnkVar.d() > 0) {
                    if (!this.i) {
                        this.i = cmnkVar.l() == 172;
                    } else {
                        int l = cmnkVar.l();
                        this.i = l == 172;
                        byte b = 64;
                        if (l != 64) {
                            if (l == 65) {
                                l = 65;
                            }
                        }
                        this.j = l == 65;
                        this.g = 1;
                        byte[] bArr = this.c.a;
                        bArr[0] = -84;
                        if (l == 65) {
                            b = 65;
                        }
                        bArr[1] = b;
                        this.h = 2;
                    }
                }
            } else if (i == 1) {
                byte[] bArr2 = this.c.a;
                int min = Math.min(cmnkVar.d(), 16 - this.h);
                cmnkVar.j(bArr2, this.h, min);
                int i2 = this.h + min;
                this.h = i2;
                if (i2 == 16) {
                    this.b.f(0);
                    clra a = clrb.a(this.b);
                    Format format = this.l;
                    if (format == null || format.y != 2 || a.a != format.z || !"audio/ac4".equals(format.l)) {
                        clnf clnfVar = new clnf();
                        clnfVar.a = this.e;
                        clnfVar.k = "audio/ac4";
                        clnfVar.x = 2;
                        clnfVar.y = a.a;
                        clnfVar.c = this.d;
                        Format a2 = clnfVar.a();
                        this.l = a2;
                        this.f.a(a2);
                    }
                    this.m = a.b;
                    this.k = (a.c * 1000000) / this.l.z;
                    this.c.f(0);
                    this.f.d(this.c, 16);
                    this.g = 2;
                }
            } else {
                int min2 = Math.min(cmnkVar.d(), this.m - this.h);
                this.f.d(cmnkVar, min2);
                int i3 = this.h + min2;
                this.h = i3;
                int i4 = this.m;
                if (i3 == i4) {
                    this.f.b(this.a, 1, i4, 0, null);
                    this.a += this.k;
                    this.g = 0;
                }
            }
        }
    }

    @Override // defpackage.clyz
    public final void e() {
    }

    public clys(String str) {
        cmnj cmnjVar = new cmnj(new byte[16]);
        this.b = cmnjVar;
        this.c = new cmnk(cmnjVar.a);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.d = str;
    }
}

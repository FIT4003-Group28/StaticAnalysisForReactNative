package defpackage;
/* compiled from: PG */
/* renamed from: clzm  reason: default package */
/* loaded from: classes5.dex */
public final class clzm implements clyz {
    private final cmnk a;
    private final clss b;
    private final String c;
    private clvk d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public clzm() {
        this(null);
    }

    @Override // defpackage.clyz
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        this.e = cmajVar.c();
        this.d = clupVar.RT(cmajVar.b());
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.clyz
    public final void d(cmnk cmnkVar) {
        clss clssVar;
        cmmn.e(this.d);
        while (cmnkVar.d() > 0) {
            int i = this.f;
            if (i == 0) {
                byte[] bArr = cmnkVar.a;
                int i2 = cmnkVar.b;
                int i3 = cmnkVar.c;
                while (true) {
                    if (i2 < i3) {
                        byte b = bArr[i2];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.i && (b & 224) == 224;
                        this.i = z;
                        if (z2) {
                            cmnkVar.f(i2 + 1);
                            this.i = false;
                            this.a.a[1] = bArr[i2];
                            this.g = 2;
                            this.f = 1;
                            break;
                        }
                        i2++;
                    } else {
                        cmnkVar.f(i3);
                        break;
                    }
                }
            } else if (i == 1) {
                int min = Math.min(cmnkVar.d(), 4 - this.g);
                cmnkVar.j(this.a.a, this.g, min);
                int i4 = this.g + min;
                this.g = i4;
                if (i4 >= 4) {
                    this.a.f(0);
                    if (!this.b.a(this.a.r())) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        this.k = this.b.c;
                        if (!this.h) {
                            this.j = (clssVar.g * 1000000) / clssVar.d;
                            clnf clnfVar = new clnf();
                            clnfVar.a = this.e;
                            clss clssVar2 = this.b;
                            clnfVar.k = clssVar2.b;
                            clnfVar.l = 4096;
                            clnfVar.x = clssVar2.e;
                            clnfVar.y = clssVar2.d;
                            clnfVar.c = this.c;
                            this.d.a(clnfVar.a());
                            this.h = true;
                        }
                        this.a.f(0);
                        this.d.d(this.a, 4);
                        this.f = 2;
                    }
                }
            } else {
                int min2 = Math.min(cmnkVar.d(), this.k - this.g);
                this.d.d(cmnkVar, min2);
                int i5 = this.g + min2;
                this.g = i5;
                int i6 = this.k;
                if (i5 >= i6) {
                    this.d.b(this.l, 1, i6, 0, null);
                    this.l += this.j;
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // defpackage.clyz
    public final void e() {
    }

    public clzm(String str) {
        this.f = 0;
        cmnk cmnkVar = new cmnk(4);
        this.a = cmnkVar;
        cmnkVar.a[0] = -1;
        this.b = new clss();
        this.c = str;
    }
}

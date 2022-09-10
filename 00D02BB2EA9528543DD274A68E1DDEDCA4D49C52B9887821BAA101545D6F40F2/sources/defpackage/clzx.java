package defpackage;
/* compiled from: PG */
/* renamed from: clzx  reason: default package */
/* loaded from: classes5.dex */
public final class clzx implements cmak {
    private final clzw a;
    private final cmnk b = new cmnk(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public clzx(clzw clzwVar) {
        this.a = clzwVar;
    }

    @Override // defpackage.cmak
    public final void a(cmnv cmnvVar, clup clupVar, cmaj cmajVar) {
        this.a.a(cmnvVar, clupVar, cmajVar);
        this.f = true;
    }

    @Override // defpackage.cmak
    public final void b() {
        this.f = true;
    }

    @Override // defpackage.cmak
    public final void c(cmnk cmnkVar, int i) {
        int i2 = i & 1;
        int l = i2 != 0 ? cmnkVar.b + cmnkVar.l() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            cmnkVar.f(l);
            this.d = 0;
        }
        while (cmnkVar.d() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int l2 = cmnkVar.l();
                    cmnkVar.f(cmnkVar.b - 1);
                    if (l2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(cmnkVar.d(), 3 - this.d);
                cmnkVar.j(this.b.a, this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    this.b.a(3);
                    this.b.h(1);
                    int l3 = this.b.l();
                    int l4 = this.b.l();
                    this.e = (l3 & 128) != 0;
                    this.c = (((l3 & 15) << 8) | l4) + 3;
                    int g = this.b.g();
                    int i5 = this.c;
                    if (g < i5) {
                        cmnk cmnkVar2 = this.b;
                        byte[] bArr = cmnkVar2.a;
                        int length = bArr.length;
                        cmnkVar2.a(Math.min(4098, Math.max(i5, length + length)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(cmnkVar.d(), this.c - this.d);
                cmnkVar.j(this.b.a, this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        if (cmny.ag(this.b.a, i7) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.a(this.c - 4);
                    } else {
                        this.b.a(i7);
                    }
                    this.a.b(this.b);
                    this.d = 0;
                }
            }
        }
    }
}

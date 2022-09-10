package defpackage;
/* compiled from: PG */
/* renamed from: clzp  reason: default package */
/* loaded from: classes5.dex */
public final class clzp implements cmak {
    private final clyz a;
    private final cmnj b = new cmnj(new byte[10]);
    private int c = 0;
    private int d;
    private cmnv e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public clzp(clyz clyzVar) {
        this.a = clyzVar;
    }

    private final void d(int i) {
        this.c = i;
        this.d = 0;
    }

    private final boolean e(cmnk cmnkVar, byte[] bArr, int i) {
        int min = Math.min(cmnkVar.d(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            cmnkVar.h(min);
        } else {
            cmnkVar.j(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.cmak
    public final void a(cmnv cmnvVar, clup clupVar, cmaj cmajVar) {
        this.e = cmnvVar;
        this.a.b(clupVar, cmajVar);
    }

    @Override // defpackage.cmak
    public final void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // defpackage.cmak
    public final void c(cmnk cmnkVar, int i) {
        int i2;
        long j;
        cmmn.e(this.e);
        int i3 = -1;
        int i4 = 2;
        if ((i & 1) != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1 && i5 != 2) {
                int i6 = this.j;
                if (i6 != -1) {
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("Unexpected start indicator: expected ");
                    sb.append(i6);
                    sb.append(" more bytes");
                    sb.toString();
                }
                this.a.e();
            }
            d(1);
        }
        int i7 = i;
        while (cmnkVar.d() > 0) {
            int i8 = this.c;
            if (i8 != 0) {
                int i9 = 0;
                if (i8 != 1) {
                    if (i8 != i4) {
                        int d = cmnkVar.d();
                        int i10 = this.j;
                        if (i10 != i3) {
                            i9 = d - i10;
                        }
                        if (i9 > 0) {
                            d -= i9;
                            cmnkVar.e(cmnkVar.b + d);
                        }
                        this.a.d(cmnkVar);
                        int i11 = this.j;
                        if (i11 != i3) {
                            int i12 = i11 - d;
                            this.j = i12;
                            if (i12 == 0) {
                                this.a.e();
                                d(1);
                            }
                        }
                    } else {
                        if (e(cmnkVar, this.b.a, Math.min(10, this.i)) && e(cmnkVar, null, this.i)) {
                            this.b.f(0);
                            if (this.f) {
                                this.b.h(4);
                                int j2 = this.b.j(3);
                                this.b.h(1);
                                int j3 = this.b.j(15);
                                this.b.h(1);
                                long j4 = (j2 << 30) | (j3 << 15) | this.b.j(15);
                                this.b.h(1);
                                if (!this.h && this.g) {
                                    this.b.h(4);
                                    int j5 = this.b.j(3);
                                    this.b.h(1);
                                    int j6 = this.b.j(15);
                                    this.b.h(1);
                                    int j7 = this.b.j(15);
                                    this.b.h(1);
                                    this.e.d((j5 << 30) | (j6 << 15) | j7);
                                    this.h = true;
                                }
                                j = this.e.d(j4);
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (true == this.k) {
                                i9 = 4;
                            }
                            i7 |= i9;
                            this.a.c(j, i7);
                            d(3);
                            i3 = -1;
                        }
                    }
                } else if (e(cmnkVar, this.b.a, 9)) {
                    this.b.f(0);
                    int j8 = this.b.j(24);
                    if (j8 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(j8);
                        sb2.toString();
                        i3 = -1;
                        this.j = -1;
                        i2 = 0;
                    } else {
                        this.b.h(8);
                        int j9 = this.b.j(16);
                        this.b.h(5);
                        this.k = this.b.i();
                        this.b.h(2);
                        this.f = this.b.i();
                        this.g = this.b.i();
                        this.b.h(6);
                        int j10 = this.b.j(8);
                        this.i = j10;
                        if (j9 == 0) {
                            this.j = -1;
                        } else {
                            int i13 = (j9 - 3) - j10;
                            this.j = i13;
                            if (i13 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i13);
                                sb3.toString();
                                i3 = -1;
                                this.j = -1;
                                i2 = 2;
                            }
                        }
                        i3 = -1;
                        i2 = 2;
                    }
                    d(i2);
                } else {
                    i3 = -1;
                }
            } else {
                cmnkVar.h(cmnkVar.d());
            }
            i4 = 2;
        }
    }
}

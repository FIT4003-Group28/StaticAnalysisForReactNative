package defpackage;

import java.util.Arrays;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: clze  reason: default package */
/* loaded from: classes5.dex */
public final class clze implements clyz {
    private static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final cmam b;
    private final cmnk c;
    private final boolean[] d;
    private final clzc e;
    private final clzn f;
    private clzd g;
    private long h;
    private String i;
    private clvk j;
    private boolean k;
    private long l;

    public clze() {
        this(null);
    }

    @Override // defpackage.clyz
    public final void a() {
        cmni.d(this.d);
        this.e.a();
        clzd clzdVar = this.g;
        if (clzdVar != null) {
            clzdVar.b = false;
            clzdVar.c = false;
            clzdVar.d = false;
            clzdVar.e = -1;
        }
        this.f.a();
        this.h = 0L;
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        this.i = cmajVar.c();
        this.j = clupVar.RT(cmajVar.b());
        this.g = new clzd(this.j);
        this.b.a(clupVar, cmajVar);
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.clyz
    public final void d(cmnk cmnkVar) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        boolean z;
        float f;
        float f2;
        cmmn.e(this.g);
        cmmn.e(this.j);
        int i4 = cmnkVar.b;
        int i5 = cmnkVar.c;
        byte[] bArr2 = cmnkVar.a;
        this.h += cmnkVar.d();
        this.j.d(cmnkVar, cmnkVar.d());
        while (true) {
            int c = cmni.c(bArr2, i4, i5, this.d);
            if (c == i5) {
                break;
            }
            int i6 = c + 3;
            int i7 = cmnkVar.a[i6] & 255;
            int i8 = c - i4;
            if (!this.k) {
                if (i8 > 0) {
                    this.e.b(bArr2, i4, c);
                }
                int i9 = i8 < 0 ? -i8 : 0;
                clzc clzcVar = this.e;
                int i10 = clzcVar.c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i7 != 179) {
                                    if (i7 == 181) {
                                        i7 = 181;
                                    }
                                }
                                clzcVar.d -= i9;
                                clzcVar.b = false;
                                clvk clvkVar = this.j;
                                int i11 = clzcVar.e;
                                String str = this.i;
                                cmmn.f(str);
                                byte[] copyOf = Arrays.copyOf(clzcVar.f, clzcVar.d);
                                cmnj cmnjVar = new cmnj(copyOf);
                                cmnjVar.l(i11);
                                cmnjVar.l(4);
                                cmnjVar.g();
                                cmnjVar.h(8);
                                if (cmnjVar.i()) {
                                    cmnjVar.h(4);
                                    cmnjVar.h(3);
                                }
                                int j = cmnjVar.j(4);
                                if (j == 15) {
                                    int j2 = cmnjVar.j(8);
                                    int j3 = cmnjVar.j(8);
                                    if (j3 != 0) {
                                        f = j2 / j3;
                                        f2 = f;
                                    }
                                    f2 = 1.0f;
                                } else {
                                    if (j < 7) {
                                        f = a[j];
                                        f2 = f;
                                    }
                                    f2 = 1.0f;
                                }
                                if (cmnjVar.i()) {
                                    cmnjVar.h(2);
                                    cmnjVar.h(1);
                                    if (cmnjVar.i()) {
                                        cmnjVar.h(15);
                                        cmnjVar.g();
                                        cmnjVar.h(15);
                                        cmnjVar.g();
                                        cmnjVar.h(15);
                                        cmnjVar.g();
                                        cmnjVar.h(3);
                                        cmnjVar.h(11);
                                        cmnjVar.g();
                                        cmnjVar.h(15);
                                        cmnjVar.g();
                                    }
                                }
                                cmnjVar.j(2);
                                cmnjVar.g();
                                int j4 = cmnjVar.j(16);
                                cmnjVar.g();
                                if (cmnjVar.i() && j4 != 0) {
                                    int i12 = 0;
                                    for (int i13 = j4 - 1; i13 > 0; i13 >>= 1) {
                                        i12++;
                                    }
                                    cmnjVar.h(i12);
                                }
                                cmnjVar.g();
                                int j5 = cmnjVar.j(13);
                                cmnjVar.g();
                                int j6 = cmnjVar.j(13);
                                cmnjVar.g();
                                cmnjVar.g();
                                clnf clnfVar = new clnf();
                                clnfVar.a = str;
                                clnfVar.k = "video/mp4v-es";
                                clnfVar.p = j5;
                                clnfVar.q = j6;
                                clnfVar.t = f2;
                                clnfVar.m = Collections.singletonList(copyOf);
                                clvkVar.a(clnfVar.a());
                                this.k = true;
                            } else if ((i7 & 240) != 32) {
                                clzcVar.a();
                            } else {
                                clzcVar.e = clzcVar.d;
                                clzcVar.c = 4;
                            }
                        } else if (i7 > 31) {
                            clzcVar.a();
                        } else {
                            clzcVar.c = 3;
                        }
                    } else if (i7 != 181) {
                        clzcVar.a();
                    } else {
                        clzcVar.c = 2;
                    }
                } else if (i7 == 176) {
                    clzcVar.c = 1;
                    clzcVar.b = true;
                    i7 = 176;
                }
                clzcVar.b(clzc.a, 0, 3);
            }
            this.g.a(bArr2, i4, c);
            clzn clznVar = this.f;
            if (i8 > 0) {
                clznVar.c(bArr2, i4, c);
                i = 0;
            } else {
                i = -i8;
            }
            if (this.f.d(i)) {
                clzn clznVar2 = this.f;
                int a2 = cmni.a(clznVar2.b, clznVar2.c);
                cmnk cmnkVar2 = this.c;
                int i14 = cmny.a;
                cmnkVar2.c(this.f.b, a2);
                this.b.b(this.l, this.c);
            }
            if (i7 == 178) {
                if (cmnkVar.a[c + 2] == 1) {
                    this.f.b(178);
                }
                i7 = 178;
            }
            int i15 = i5 - c;
            long j7 = this.h - i15;
            clzd clzdVar = this.g;
            boolean z2 = this.k;
            if (clzdVar.e != 182 || !z2 || !clzdVar.b) {
                i2 = i5;
                bArr = bArr2;
            } else {
                i2 = i5;
                bArr = bArr2;
                clzdVar.a.b(clzdVar.h, clzdVar.d ? 1 : 0, (int) (j7 - clzdVar.g), i15, null);
            }
            if (clzdVar.e != 179) {
                clzdVar.g = j7;
            }
            clzd clzdVar2 = this.g;
            long j8 = this.l;
            clzdVar2.e = i7;
            clzdVar2.d = false;
            if (i7 == 182) {
                i3 = i7;
                z = true;
            } else if (i7 == 179) {
                z = true;
                i3 = 179;
            } else {
                i3 = i7;
                z = false;
            }
            clzdVar2.b = z;
            clzdVar2.c = i3 == 182;
            clzdVar2.f = 0;
            clzdVar2.h = j8;
            i4 = i6;
            i5 = i2;
            bArr2 = bArr;
        }
        if (!this.k) {
            this.e.b(bArr2, i4, i5);
        }
        this.g.a(bArr2, i4, i5);
        this.f.c(bArr2, i4, i5);
    }

    @Override // defpackage.clyz
    public final void e() {
    }

    public clze(cmam cmamVar) {
        this.b = cmamVar;
        this.d = new boolean[4];
        this.e = new clzc();
        this.f = new clzn(178);
        this.c = new cmnk();
    }
}

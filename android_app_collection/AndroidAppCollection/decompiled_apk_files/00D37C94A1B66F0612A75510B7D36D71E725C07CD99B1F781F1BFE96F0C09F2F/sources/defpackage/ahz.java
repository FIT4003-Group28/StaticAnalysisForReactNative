package defpackage;
/* compiled from: PG */
/* renamed from: ahz  reason: default package */
/* loaded from: classes.dex */
public final class ahz extends aid {
    private static final int[] a = new int[2];

    public ahz(ahh ahhVar) {
        super(ahhVar);
        this.i.l = 4;
        this.j.l = 5;
        this.g = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.aid
    public final void b() {
        ahh ahhVar;
        ahh ahhVar2;
        ahh ahhVar3;
        ahh ahhVar4 = this.d;
        if (ahhVar4.e) {
            this.f.c(ahhVar4.j());
        }
        if (!this.f.i) {
            int N = this.d.N();
            this.k = N;
            if (N != 3) {
                if (this.k != 4 || (ahhVar3 = this.d.T) == null || (ahhVar3.N() != 1 && ahhVar3.N() != 4)) {
                    if (this.k == 1) {
                        this.f.c(this.d.j());
                    }
                } else {
                    int j = ahhVar3.j();
                    int b = this.d.f46J.b();
                    int b2 = this.d.L.b();
                    j(this.i, ahhVar3.h.i, this.d.f46J.b());
                    j(this.j, ahhVar3.h.j, -this.d.L.b());
                    this.f.c((j - b) - b2);
                    return;
                }
            }
        } else if (this.k == 4 && (ahhVar = this.d.T) != null && (ahhVar.N() == 1 || ahhVar.N() == 4)) {
            j(this.i, ahhVar.h.i, this.d.f46J.b());
            j(this.j, ahhVar.h.j, -this.d.L.b());
            return;
        }
        ahv ahvVar = this.f;
        if (ahvVar.i) {
            ahh ahhVar5 = this.d;
            if (ahhVar5.e) {
                ahg[] ahgVarArr = ahhVar5.R;
                ahg ahgVar = ahgVarArr[0];
                ahg ahgVar2 = ahgVar.e;
                if (ahgVar2 != null && ahgVarArr[1].e != null) {
                    if (ahhVar5.I()) {
                        this.i.e = this.d.R[0].b();
                        this.j.e = -this.d.R[1].b();
                        return;
                    }
                    ahu k = k(this.d.R[0]);
                    if (k != null) {
                        j(this.i, k, this.d.R[0].b());
                    }
                    ahu k2 = k(this.d.R[1]);
                    if (k2 != null) {
                        j(this.j, k2, -this.d.R[1].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                    return;
                } else if (ahgVar2 != null) {
                    ahu k3 = k(ahgVar);
                    if (k3 == null) {
                        return;
                    }
                    j(this.i, k3, this.d.R[0].b());
                    j(this.j, this.i, this.f.f);
                    return;
                } else {
                    ahg ahgVar3 = ahgVarArr[1];
                    if (ahgVar3.e != null) {
                        ahu k4 = k(ahgVar3);
                        if (k4 == null) {
                            return;
                        }
                        j(this.j, k4, -this.d.R[1].b());
                        j(this.i, this.j, -this.f.f);
                        return;
                    } else if ((ahhVar5 instanceof ahl) || ahhVar5.T == null || ahhVar5.L(7).e != null) {
                        return;
                    } else {
                        ahh ahhVar6 = this.d;
                        j(this.i, ahhVar6.T.h.i, ahhVar6.k());
                        j(this.j, this.i, this.f.f);
                        return;
                    }
                }
            }
        }
        if (this.k == 3) {
            ahh ahhVar7 = this.d;
            int i = ahhVar7.s;
            if (i == 2) {
                ahh ahhVar8 = ahhVar7.T;
                if (ahhVar8 != null) {
                    ahv ahvVar2 = ahhVar8.i.f;
                    ahvVar.k.add(ahvVar2);
                    ahvVar2.j.add(this.f);
                    ahv ahvVar3 = this.f;
                    ahvVar3.b = true;
                    ahvVar3.j.add(this.i);
                    this.f.j.add(this.j);
                }
            } else if (i == 3) {
                if (ahhVar7.t == 3) {
                    this.i.a = this;
                    this.j.a = this;
                    aib aibVar = ahhVar7.i;
                    aibVar.i.a = this;
                    aibVar.j.a = this;
                    ahvVar.a = this;
                    if (ahhVar7.J()) {
                        this.f.k.add(this.d.i.f);
                        this.d.i.f.j.add(this.f);
                        aib aibVar2 = this.d.i;
                        aibVar2.f.a = this;
                        this.f.k.add(aibVar2.i);
                        this.f.k.add(this.d.i.j);
                        this.d.i.i.j.add(this.f);
                        this.d.i.j.j.add(this.f);
                    } else if (this.d.I()) {
                        this.d.i.f.k.add(this.f);
                        this.f.j.add(this.d.i.f);
                    } else {
                        this.d.i.f.k.add(this.f);
                    }
                } else {
                    ahv ahvVar4 = ahhVar7.i.f;
                    ahvVar.k.add(ahvVar4);
                    ahvVar4.j.add(this.f);
                    this.d.i.i.j.add(this.f);
                    this.d.i.j.j.add(this.f);
                    ahv ahvVar5 = this.f;
                    ahvVar5.b = true;
                    ahvVar5.j.add(this.i);
                    this.f.j.add(this.j);
                    this.i.k.add(this.f);
                    this.j.k.add(this.f);
                }
            }
        }
        ahh ahhVar9 = this.d;
        ahg[] ahgVarArr2 = ahhVar9.R;
        ahg ahgVar4 = ahgVarArr2[0];
        ahg ahgVar5 = ahgVar4.e;
        if (ahgVar5 != null && ahgVarArr2[1].e != null) {
            if (ahhVar9.I()) {
                this.i.e = this.d.R[0].b();
                this.j.e = -this.d.R[1].b();
                return;
            }
            ahu k5 = k(this.d.R[0]);
            ahu k6 = k(this.d.R[1]);
            if (k5 != null) {
                k5.a(this);
            }
            if (k6 != null) {
                k6.a(this);
            }
            this.l = 4;
        } else if (ahgVar5 != null) {
            ahu k7 = k(ahgVar4);
            if (k7 == null) {
                return;
            }
            j(this.i, k7, this.d.R[0].b());
            i(this.j, this.i, 1, this.f);
        } else {
            ahg ahgVar6 = ahgVarArr2[1];
            if (ahgVar6.e != null) {
                ahu k8 = k(ahgVar6);
                if (k8 == null) {
                    return;
                }
                j(this.j, k8, -this.d.R[1].b());
                i(this.i, this.j, -1, this.f);
            } else if ((ahhVar9 instanceof ahl) || (ahhVar2 = ahhVar9.T) == null) {
            } else {
                j(this.i, ahhVar2.h.i, ahhVar9.k());
                i(this.j, this.i, 1, this.f);
            }
        }
    }

    @Override // defpackage.aid
    public final void c() {
        ahu ahuVar = this.i;
        if (ahuVar.i) {
            this.d.Y = ahuVar.f;
        }
    }

    @Override // defpackage.aid
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.aid
    public final boolean e() {
        return this.k != 3 || this.d.s == 0;
    }

    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.f.i = false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d.ah);
        return valueOf.length() != 0 ? "HorizontalRun ".concat(valueOf) : new String("HorizontalRun ");
    }

    @Override // defpackage.aid, defpackage.ahs
    public final void f() {
        ahv ahvVar;
        float f;
        float f2;
        float f3;
        int i = this.l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 3) {
                ahh ahhVar = this.d;
                m(ahhVar.f46J, ahhVar.L, 0);
                return;
            }
            ahv ahvVar2 = this.f;
            if (!ahvVar2.i && this.k == 3) {
                ahh ahhVar2 = this.d;
                int i3 = ahhVar2.s;
                if (i3 == 2) {
                    ahh ahhVar3 = ahhVar2.T;
                    if (ahhVar3 != null) {
                        if (ahhVar3.h.f.i) {
                            ahvVar2.c((int) ((ahvVar.f * ahhVar2.x) + 0.5f));
                        }
                    }
                } else if (i3 == 3) {
                    int i4 = ahhVar2.t;
                    if (i4 == 0 || i4 == 3) {
                        aib aibVar = ahhVar2.i;
                        ahu ahuVar = aibVar.i;
                        ahu ahuVar2 = aibVar.j;
                        ahg ahgVar = ahhVar2.f46J.e;
                        ahg ahgVar2 = ahhVar2.K.e;
                        ahg ahgVar3 = ahhVar2.L.e;
                        ahg ahgVar4 = ahhVar2.M.e;
                        int i5 = ahhVar2.X;
                        if (ahgVar != null && ahgVar2 != null && ahgVar3 != null && ahgVar4 != null) {
                            float f4 = ahhVar2.W;
                            if (!ahuVar.i || !ahuVar2.i) {
                                ahu ahuVar3 = this.i;
                                if (ahuVar3.i) {
                                    ahu ahuVar4 = this.j;
                                    if (ahuVar4.i) {
                                        if (!ahuVar.c || !ahuVar2.c) {
                                            return;
                                        }
                                        int i6 = ahuVar3.f;
                                        int i7 = ahuVar3.e;
                                        int i8 = ahuVar4.f;
                                        int i9 = ahuVar4.e;
                                        int i10 = ((ahu) ahuVar.k.get(0)).f;
                                        int i11 = ahuVar.e;
                                        int i12 = ((ahu) ahuVar2.k.get(0)).f;
                                        int i13 = ahuVar2.e;
                                        int[] iArr = a;
                                        n(iArr, i7 + i6, i8 - i9, i10 + i11, i12 - i13, f4, i5);
                                        this.f.c(iArr[0]);
                                        this.d.i.f.c(iArr[1]);
                                    }
                                }
                                ahu ahuVar5 = this.i;
                                if (!ahuVar5.c || !this.j.c || !ahuVar.c || !ahuVar2.c) {
                                    return;
                                }
                                int i14 = ((ahu) ahuVar5.k.get(0)).f;
                                int i15 = this.i.e;
                                int i16 = ((ahu) this.j.k.get(0)).f;
                                int i17 = this.j.e;
                                int i18 = ((ahu) ahuVar.k.get(0)).f;
                                int i19 = ahuVar.e;
                                int i20 = ((ahu) ahuVar2.k.get(0)).f;
                                int i21 = ahuVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i14 + i15, i16 - i17, i18 + i19, i20 - i21, f4, i5);
                                this.f.c(iArr2[0]);
                                this.d.i.f.c(iArr2[1]);
                            } else {
                                ahu ahuVar6 = this.i;
                                if (!ahuVar6.c || !this.j.c) {
                                    return;
                                }
                                int i22 = ((ahu) ahuVar6.k.get(0)).f;
                                int i23 = this.i.e;
                                int i24 = ((ahu) this.j.k.get(0)).f;
                                int i25 = this.j.e;
                                int i26 = ahuVar.f;
                                int i27 = ahuVar.e;
                                int i28 = ahuVar2.f;
                                int i29 = ahuVar2.e;
                                int[] iArr3 = a;
                                n(iArr3, i22 + i23, i24 - i25, i26 + i27, i28 - i29, f4, i5);
                                this.f.c(iArr3[0]);
                                this.d.i.f.c(iArr3[1]);
                                return;
                            }
                        } else if (ahgVar != null && ahgVar3 != null) {
                            ahu ahuVar7 = this.i;
                            if (!ahuVar7.c || !this.j.c) {
                                return;
                            }
                            float f5 = ahhVar2.W;
                            int i30 = ((ahu) ahuVar7.k.get(0)).f + this.i.e;
                            int i31 = ((ahu) this.j.k.get(0)).f - this.j.e;
                            if (i5 != -1 && i5 != 0) {
                                int h = h(i31 - i30, 0);
                                int i32 = (int) ((h / f5) + 0.5f);
                                int h2 = h(i32, 1);
                                if (i32 != h2) {
                                    h = (int) ((h2 * f5) + 0.5f);
                                }
                                this.f.c(h);
                                this.d.i.f.c(h2);
                            } else {
                                int h3 = h(i31 - i30, 0);
                                int i33 = (int) ((h3 * f5) + 0.5f);
                                int h4 = h(i33, 1);
                                if (i33 != h4) {
                                    h3 = (int) ((h4 / f5) + 0.5f);
                                }
                                this.f.c(h3);
                                this.d.i.f.c(h4);
                            }
                        } else if (ahgVar2 != null && ahgVar4 != null) {
                            if (!ahuVar.c || !ahuVar2.c) {
                                return;
                            }
                            float f6 = ahhVar2.W;
                            int i34 = ((ahu) ahuVar.k.get(0)).f + ahuVar.e;
                            int i35 = ((ahu) ahuVar2.k.get(0)).f - ahuVar2.e;
                            if (i5 == 0) {
                                int h5 = h(i35 - i34, 1);
                                int i36 = (int) ((h5 * f6) + 0.5f);
                                int h6 = h(i36, 0);
                                if (i36 != h6) {
                                    h5 = (int) ((h6 / f6) + 0.5f);
                                }
                                this.f.c(h6);
                                this.d.i.f.c(h5);
                            } else {
                                int h7 = h(i35 - i34, 1);
                                int i37 = (int) ((h7 / f6) + 0.5f);
                                int h8 = h(i37, 0);
                                if (i37 != h8) {
                                    h7 = (int) ((h8 * f6) + 0.5f);
                                }
                                this.f.c(h8);
                                this.d.i.f.c(h7);
                            }
                        }
                    } else {
                        int i38 = ahhVar2.X;
                        if (i38 == -1) {
                            f = ahhVar2.i.f.f;
                            f2 = ahhVar2.W;
                        } else if (i38 != 0) {
                            f = ahhVar2.i.f.f;
                            f2 = ahhVar2.W;
                        } else {
                            f3 = ahhVar2.i.f.f / ahhVar2.W;
                            ahvVar2.c((int) (f3 + 0.5f));
                        }
                        f3 = f * f2;
                        ahvVar2.c((int) (f3 + 0.5f));
                    }
                }
            }
            ahu ahuVar8 = this.i;
            if (!ahuVar8.c) {
                return;
            }
            ahu ahuVar9 = this.j;
            if (!ahuVar9.c) {
                return;
            }
            if (ahuVar8.i && ahuVar9.i && this.f.i) {
                return;
            }
            if (!this.f.i && this.k == 3) {
                ahh ahhVar4 = this.d;
                if (ahhVar4.s == 0 && !ahhVar4.I()) {
                    int i39 = ((ahu) this.i.k.get(0)).f;
                    ahu ahuVar10 = this.i;
                    int i40 = i39 + ahuVar10.e;
                    int i41 = ((ahu) this.j.k.get(0)).f + this.j.e;
                    ahuVar10.c(i40);
                    this.j.c(i41);
                    this.f.c(i41 - i40);
                    return;
                }
            }
            if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                int min = Math.min((((ahu) this.j.k.get(0)).f + this.j.e) - (((ahu) this.i.k.get(0)).f + this.i.e), this.f.m);
                ahh ahhVar5 = this.d;
                int i42 = ahhVar5.w;
                int max = Math.max(ahhVar5.v, min);
                if (i42 > 0) {
                    max = Math.min(i42, max);
                }
                this.f.c(max);
            }
            if (!this.f.i) {
                return;
            }
            ahu ahuVar11 = (ahu) this.i.k.get(0);
            ahu ahuVar12 = (ahu) this.j.k.get(0);
            int i43 = ahuVar11.f;
            ahu ahuVar13 = this.i;
            int i44 = ahuVar13.e + i43;
            int i45 = ahuVar12.f;
            int i46 = this.j.e + i45;
            float f7 = this.d.ad;
            if (ahuVar11 == ahuVar12) {
                f7 = 0.5f;
            }
            if (ahuVar11 != ahuVar12) {
                i45 = i46;
            }
            if (ahuVar11 != ahuVar12) {
                i43 = i44;
            }
            ahuVar13.c((int) (i43 + 0.5f + (((i45 - i43) - this.f.f) * f7)));
            this.j.c(this.i.f + this.f.f);
            return;
        }
        throw null;
    }
}

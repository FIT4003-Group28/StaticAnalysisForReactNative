package defpackage;
/* compiled from: PG */
/* renamed from: aib  reason: default package */
/* loaded from: classes.dex */
public final class aib extends aid {
    public final ahu a;
    ahv b;

    public aib(ahh ahhVar) {
        super(ahhVar);
        ahu ahuVar = new ahu(this);
        this.a = ahuVar;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        ahuVar.l = 8;
        this.g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aib.b():void");
    }

    @Override // defpackage.aid
    public final void c() {
        ahu ahuVar = this.i;
        if (ahuVar.i) {
            this.d.Z = ahuVar.f;
        }
    }

    @Override // defpackage.aid
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.aid
    public final boolean e() {
        return this.k != 3 || this.d.t == 0;
    }

    public final void g() {
        this.h = false;
        this.i.b();
        this.i.i = false;
        this.j.b();
        this.j.i = false;
        this.a.b();
        this.a.i = false;
        this.f.i = false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d.ah);
        return valueOf.length() != 0 ? "VerticalRun ".concat(valueOf) : new String("VerticalRun ");
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
                m(ahhVar.K, ahhVar.M, 1);
                return;
            }
            ahv ahvVar2 = this.f;
            if (ahvVar2.c && !ahvVar2.i && this.k == 3) {
                ahh ahhVar2 = this.d;
                int i3 = ahhVar2.t;
                if (i3 == 2) {
                    ahh ahhVar3 = ahhVar2.T;
                    if (ahhVar3 != null) {
                        if (ahhVar3.i.f.i) {
                            ahvVar2.c((int) ((ahvVar.f * ahhVar2.A) + 0.5f));
                        }
                    }
                } else if (i3 == 3) {
                    ahv ahvVar3 = ahhVar2.h.f;
                    if (ahvVar3.i) {
                        int i4 = ahhVar2.X;
                        if (i4 == -1) {
                            f = ahvVar3.f;
                            f2 = ahhVar2.W;
                        } else if (i4 != 0) {
                            f = ahvVar3.f;
                            f2 = ahhVar2.W;
                        } else {
                            f3 = ahvVar3.f * ahhVar2.W;
                            ahvVar2.c((int) (f3 + 0.5f));
                        }
                        f3 = f / f2;
                        ahvVar2.c((int) (f3 + 0.5f));
                    }
                }
            }
            ahu ahuVar = this.i;
            if (!ahuVar.c) {
                return;
            }
            ahu ahuVar2 = this.j;
            if (!ahuVar2.c) {
                return;
            }
            if (ahuVar.i && ahuVar2.i && this.f.i) {
                return;
            }
            if (!this.f.i && this.k == 3) {
                ahh ahhVar4 = this.d;
                if (ahhVar4.s == 0 && !ahhVar4.J()) {
                    int i5 = ((ahu) this.i.k.get(0)).f;
                    ahu ahuVar3 = this.i;
                    int i6 = i5 + ahuVar3.e;
                    int i7 = ((ahu) this.j.k.get(0)).f + this.j.e;
                    ahuVar3.c(i6);
                    this.j.c(i7);
                    this.f.c(i7 - i6);
                    return;
                }
            }
            if (!this.f.i && this.k == 3 && this.c == 1 && this.i.k.size() > 0 && this.j.k.size() > 0) {
                int i8 = (((ahu) this.j.k.get(0)).f + this.j.e) - (((ahu) this.i.k.get(0)).f + this.i.e);
                ahv ahvVar4 = this.f;
                int i9 = ahvVar4.m;
                if (i8 < i9) {
                    ahvVar4.c(i8);
                } else {
                    ahvVar4.c(i9);
                }
            }
            if (!this.f.i || this.i.k.size() <= 0 || this.j.k.size() <= 0) {
                return;
            }
            ahu ahuVar4 = (ahu) this.i.k.get(0);
            ahu ahuVar5 = (ahu) this.j.k.get(0);
            int i10 = ahuVar4.f;
            ahu ahuVar6 = this.i;
            int i11 = ahuVar6.e + i10;
            int i12 = ahuVar5.f;
            int i13 = this.j.e + i12;
            float f4 = this.d.ae;
            if (ahuVar4 == ahuVar5) {
                f4 = 0.5f;
            }
            if (ahuVar4 != ahuVar5) {
                i12 = i13;
            }
            if (ahuVar4 != ahuVar5) {
                i10 = i11;
            }
            ahuVar6.c((int) (i10 + 0.5f + (((i12 - i10) - this.f.f) * f4)));
            this.j.c(this.i.f + this.f.f);
            return;
        }
        throw null;
    }
}

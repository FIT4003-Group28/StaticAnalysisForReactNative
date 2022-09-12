package defpackage;

import android.os.Bundle;
import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: acgm  reason: default package */
/* loaded from: classes2.dex */
class acgm implements acip, arae {
    private static final dcqe d = dcqe.c("acgm");
    public final ges a;
    public final acik b;
    public final ache c;
    private final arag e;
    private final araj f;
    private final Runnable g;
    private boolean i = false;
    private final jas h = new acgl(this);

    public acgm(acgh acghVar, acik acikVar, Runnable runnable, ache acheVar, arag aragVar, araj arajVar) {
        this.a = acghVar;
        this.b = acikVar;
        this.g = runnable;
        this.c = acheVar;
        this.e = aragVar;
        this.f = arajVar;
    }

    private static boolean q(acij acijVar) {
        acij acijVar2 = acij.LESS_500;
        int ordinal = acijVar.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 4 || ordinal == 6 || ordinal == 7;
    }

    private static boolean r(acij acijVar) {
        acij acijVar2 = acij.LESS_500;
        return acijVar.ordinal() == 3;
    }

    private final void s(boolean z) {
        ges gesVar = this.a;
        if (!gesVar.aD) {
            return;
        }
        if (z) {
            gga ggaVar = gesVar.aE;
            if (ggaVar == null || !dbsd.a(gesVar, ggaVar.K())) {
                return;
            }
            gn gnVar = this.a.A;
            dbsk.s(gnVar);
            gnVar.f();
            return;
        }
        b();
    }

    @Override // defpackage.arae
    public void a(araf arafVar) {
        s(arafVar == araf.OPTIMIZED);
    }

    public final void b() {
        this.g.run();
    }

    public Boolean c() {
        return Boolean.valueOf(this.e.e());
    }

    public cqkl d() {
        if (!this.a.aD) {
            return cqkl.a;
        }
        this.e.f(true, this);
        return cqkl.a;
    }

    @Override // defpackage.acip
    public Boolean e() {
        acij acijVar = this.b.c;
        if (acijVar == null) {
            return false;
        }
        int ordinal = acijVar.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            switch (ordinal) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // defpackage.acip
    @dzsi
    public cjtd f(acij acijVar) {
        ddho ddhoVar;
        acij acijVar2 = acij.LESS_500;
        int ordinal = acijVar.ordinal();
        if (ordinal == 0) {
            ddhoVar = dtxk.t;
        } else if (ordinal == 1) {
            ddhoVar = dtxk.u;
        } else if (ordinal == 2) {
            ddhoVar = dtxk.y;
        } else if (ordinal == 3) {
            ddhoVar = dtxk.x;
        } else if (ordinal == 4) {
            ddhoVar = dtxk.r;
        } else if (ordinal == 6) {
            ddhoVar = dtxk.s;
        } else if (ordinal != 7) {
            ddhoVar = ordinal != 9 ? null : dtxk.v;
        } else {
            ddhoVar = dtxk.w;
        }
        if (ddhoVar == null) {
            return null;
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.acip
    @dzsi
    public cjtd g(acij acijVar) {
        ddho ddhoVar;
        acij acijVar2 = acij.LESS_500;
        int ordinal = acijVar.ordinal();
        if (ordinal == 0) {
            ddhoVar = dtxk.n;
        } else if (ordinal == 1) {
            ddhoVar = dtxk.o;
        } else if (ordinal == 3) {
            ddhoVar = dtxk.q;
        } else if (ordinal == 4) {
            ddhoVar = dtxk.l;
        } else if (ordinal != 6) {
            ddhoVar = ordinal != 7 ? null : dtxk.p;
        } else {
            ddhoVar = dtxk.m;
        }
        if (ddhoVar == null) {
            return null;
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.acip
    public cqkl h() {
        if (!this.a.aD) {
            return cqkl.a;
        }
        Bundle bundle = new Bundle();
        acgd acgdVar = new acgd();
        acgdVar.B(bundle);
        this.a.aZ(acgdVar);
        b();
        return cqkl.a;
    }

    @Override // defpackage.acip
    @dzsi
    public akqq i() {
        akqq akqqVar = this.b.d;
        if (akqqVar != null) {
            return akqqVar;
        }
        return null;
    }

    @Override // defpackage.acip
    public Boolean j() {
        return Boolean.valueOf(this.b.d == null);
    }

    @Override // defpackage.acip
    public CompoundButton.OnCheckedChangeListener k(final acij acijVar) {
        return new CompoundButton.OnCheckedChangeListener(this, acijVar) { // from class: acgk
            private final acgm a;
            private final acij b;

            {
                this.a = this;
                this.b = acijVar;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                acgm acgmVar = this.a;
                acij acijVar2 = this.b;
                if (acgmVar.a.aD && z) {
                    acik acikVar = acgmVar.b;
                    if (acijVar2 == acikVar.c) {
                        return;
                    }
                    acikVar.c = acijVar2;
                    acgmVar.b();
                }
            }
        };
    }

    @Override // defpackage.acip
    public Boolean l(acij acijVar) {
        boolean z = false;
        if (!this.a.aD) {
            return false;
        }
        if (q(acijVar)) {
            return c();
        }
        if (!r(acijVar)) {
            return false;
        }
        int k = this.f.k();
        if (k < 3 && k != -1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.acip
    public cqkl m(acij acijVar) {
        if (!this.a.aD) {
            return cqkl.a;
        }
        this.i = true;
        if (q(acijVar)) {
            d();
        } else if (r(acijVar)) {
            this.f.q();
        } else {
            bvoo.h("An information card for unsupported type is shown: %s", acijVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.acip
    public Boolean n(acij acijVar) {
        return Boolean.valueOf(dbsd.a(this.b.c, acijVar));
    }

    @Override // defpackage.acip
    public jas o() {
        return this.h;
    }

    public void p(int i) {
        acij acijVar = this.b.c;
        boolean z = false;
        if (acijVar != null && r(acijVar) && this.i && i >= 3) {
            z = true;
        }
        s(z);
    }
}

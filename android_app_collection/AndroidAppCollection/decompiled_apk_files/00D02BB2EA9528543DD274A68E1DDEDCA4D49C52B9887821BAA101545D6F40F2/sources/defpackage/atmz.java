package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atmz  reason: default package */
/* loaded from: classes2.dex */
public class atmz implements atnj, jkh {
    private static final dcqe b = dcqe.c("atmz");
    @dzsi
    public final jkf a;
    private final gga c;
    private final asmn d;
    private final cjmt e;
    @dzsi
    private Runnable f;
    private float g;
    private float h;
    private final atlt i;

    public atmz(asmn asmnVar, gga ggaVar, @dzsi jkf jkfVar, cjmt cjmtVar, atlt atltVar) {
        this.c = ggaVar;
        dbsk.t(asmnVar, "host");
        this.d = asmnVar;
        this.a = jkfVar;
        this.e = cjmtVar;
        this.g = 1.0f;
        this.i = atltVar;
        this.h = 1.0f;
    }

    private static float j(int i, int i2, int i3) {
        if (i2 == i) {
            return 0.0f;
        }
        return akn.a((i3 - i) / (i2 - i), 0.0f, 1.0f);
    }

    @Override // defpackage.jkh
    public void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (jjnVar2 != jjn.COLLAPSED || jkjVar.j() == null) {
            return;
        }
        jmw.f(jkjVar.j().findViewById(R.id.nav_sheet_content));
    }

    @Override // defpackage.jkh
    public void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void O() {
    }

    @Override // defpackage.jkh
    public void P(jkj jkjVar, jjn jjnVar, float f) {
        float f2;
        jjn jjnVar2 = jjn.HIDDEN;
        int ordinal = jjnVar.ordinal();
        float f3 = 1.0f;
        if (ordinal == 0) {
            f2 = 1.0f;
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            int C = jkjVar.C(jjn.COLLAPSED);
            int C2 = jkjVar.C(jjn.EXPANDED);
            int C3 = jkjVar.C(jjn.FULLY_EXPANDED);
            int U = jkjVar.U();
            f2 = 1.0f - j(C, C2, U);
            if (C2 >= C3) {
                f3 = f2;
            } else {
                f3 = f2;
                f2 = 1.0f - j(C2, C3, U);
            }
        } else {
            String valueOf = String.valueOf(jjnVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unexpected ExpandingState: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        if (f3 == this.g && f2 == this.h) {
            return;
        }
        this.g = f3;
        this.h = f2;
        Runnable runnable = this.f;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public void a(Runnable runnable) {
        this.f = runnable;
    }

    public void b(boolean z) {
        jkf jkfVar = this.a;
        if (jkfVar == null) {
            return;
        }
        if (z == (jkfVar.l().L() != jjn.HIDDEN)) {
            return;
        }
        this.a.B(z ? jjn.COLLAPSED : jjn.HIDDEN);
    }

    public void c() {
        jkf jkfVar = this.a;
        if (jkfVar == null || jkfVar.l().L() == jjn.COLLAPSED) {
            return;
        }
        this.a.B(jjn.COLLAPSED);
    }

    @Override // defpackage.atnj
    public Boolean d() {
        return Boolean.valueOf(this.g == 0.0f);
    }

    @Override // defpackage.atnj
    public Float e() {
        return Float.valueOf(this.g);
    }

    @Override // defpackage.atnj
    public Integer f() {
        return Integer.valueOf((this.a == null || !this.d.bb()) ? 0 : (int) (-(this.e.g() * this.h)));
    }

    @Override // defpackage.atnj
    public cqkl g() {
        if (this.c.K() instanceof atct) {
            if (this.a == null || !this.d.bb()) {
                return cqkl.a;
            }
            ((atct) this.c.K()).v(new Runnable(this) { // from class: atmy
                private final atmz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.v();
                }
            });
            return cqkl.a;
        }
        bvoo.h("onSliderHeaderClick when top fragment is not NavigationUiFragment", new Object[0]);
        return cqkl.a;
    }

    @Override // defpackage.atnj
    public Integer h() {
        return Integer.valueOf(this.i.b());
    }

    @Override // defpackage.atnj
    public Float i() {
        return Float.valueOf(this.i.a());
    }
}

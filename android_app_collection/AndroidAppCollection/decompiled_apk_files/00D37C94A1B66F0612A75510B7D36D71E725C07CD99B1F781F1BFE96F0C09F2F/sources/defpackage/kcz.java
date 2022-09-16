package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kcz  reason: default package */
/* loaded from: classes3.dex */
public final class kcz implements kbk, aiza, aigm {
    public final aypf a;
    public final Rect b;
    public boolean c;
    public boolean d;
    public final kct e;
    public final boolean f;
    public kcy g;
    public yye h;
    private boolean i;
    private final aizb j;
    private final aigl k;
    private final khf l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public kcz(aigl aiglVar, aizb aizbVar, axxu axxuVar, kct kctVar, khf khfVar) {
        this.k = aiglVar;
        this.j = aizbVar;
        this.e = kctVar;
        this.l = khfVar;
        this.f = axxuVar.a().booleanValue();
        aiglVar.c.a(this);
        aizbVar.a(this);
        khfVar.a(new khe() { // from class: kcv
            @Override // defpackage.khe
            public final void a(View view) {
                final kcz kczVar = kcz.this;
                if (kczVar.h != null) {
                    return;
                }
                final ImageView imageView = (ImageView) view.findViewById(R.id.fullscreen_button);
                kczVar.h = new yye(imageView, imageView.getResources().getInteger(R.integer.fade_duration_fast), 8);
                kczVar.h.h(new zas() { // from class: kcw
                    @Override // defpackage.zas
                    public final void nH(int i, yye yyeVar) {
                        kcz kczVar2 = kcz.this;
                        kcy kcyVar = kczVar2.g;
                        if (kcyVar == null || kczVar2.d) {
                            return;
                        }
                        if (i == 0) {
                            kcyVar.c(false);
                        } else if (i != 2 && i != 1) {
                        } else {
                            kcyVar.c(true);
                        }
                    }
                });
                final kct kctVar2 = kczVar.e;
                kctVar2.e = imageView;
                lj.M(imageView, new kcs());
                imageView.setOnClickListener(new View.OnClickListener() { // from class: kcp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        kct kctVar3 = kct.this;
                        ImageView imageView2 = imageView;
                        if (!kctVar3.a.aM() || !((Boolean) kctVar3.a.aJ()).booleanValue()) {
                            kctVar3.c.H(3, new acte(actj.FULLSCREEN_OPEN_WITH_BUTTON), null);
                        }
                        ((nix) kctVar3.d.get()).p(!imageView2.isSelected());
                    }
                });
                kctVar2.a.B().as(new ayqb() { // from class: kcr
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        kct kctVar3 = kct.this;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i = booleanValue ? R.string.accessibility_exit_fullscreen : R.string.accessibility_enter_fullscreen;
                        ImageView imageView2 = kctVar3.e;
                        imageView2.setContentDescription(imageView2.getContext().getString(i));
                        kctVar3.e.setSelected(booleanValue);
                        kctVar3.e.sendAccessibilityEvent(16384);
                    }
                });
                ayoi B = ayoi.m(kctVar2.a, kctVar2.b, eho.q).B();
                imageView.getClass();
                B.as(new ayqb() { // from class: kcq
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        imageView.setImageResource(((Integer) obj).intValue());
                    }
                });
                if (!kczVar.f) {
                    return;
                }
                kczVar.a();
            }
        });
        this.a = new aypf();
        this.b = new Rect();
    }

    private final void t(boolean z) {
        v(c(), z);
    }

    private final void u(boolean z) {
        v(s(), z);
    }

    private final void v(boolean z, boolean z2) {
        if (z) {
            this.l.b();
        }
        yye yyeVar = this.h;
        if (yyeVar == null) {
            return;
        }
        yyeVar.a(z, z2);
        this.h.b.setEnabled(!this.n);
    }

    private final boolean w() {
        return !this.d || !this.f;
    }

    public final void a() {
        if (this.m) {
            u(false);
        } else {
            t(false);
        }
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        this.m = false;
        t(z);
    }

    public final boolean c() {
        if (this.n) {
            return true;
        }
        return !this.o && !this.p && this.j.d() && !this.c && w();
    }

    @Override // defpackage.aiza
    public final void d(int i, int i2) {
        a();
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        a();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final void l(ezx ezxVar) {
        this.o = ezxVar.b();
        a();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
        if (i != i2) {
            a();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        this.m = true;
        u(z);
    }

    @Override // defpackage.kbk
    public final void nx(boolean z) {
        if (this.p != z) {
            this.p = z;
            a();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final void oe(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        a();
    }

    @Override // defpackage.kbk
    public final void og(boolean z) {
        if (z == this.i) {
            return;
        }
        this.i = z;
        a();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final void q(boolean z) {
        if (z != this.d) {
            this.d = z;
            if (!z) {
                this.c = false;
            }
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s() {
        if (this.k.c.d() || this.c) {
            return false;
        }
        return (!this.i || this.d) && w();
    }
}

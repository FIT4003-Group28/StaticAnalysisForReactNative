package defpackage;

import android.widget.ImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kfw  reason: default package */
/* loaded from: classes3.dex */
public final class kfw extends kbg implements kbk {
    public final axnm b;
    public final axnm c;
    public final axnm d;
    public final String e;
    public final String f;
    public ahyo g;
    public boolean i;
    public boolean j;
    public aypg k;
    public final yye l;
    private final boolean m;
    private final ahzi n;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    public ControlsState h = ControlsState.b();
    private ControlsOverlayStyle o = ControlsOverlayStyle.a;

    public kfw(ImageView imageView, aacz aaczVar, axnm axnmVar, axnm axnmVar2, axnm axnmVar3, axnm axnmVar4) {
        this.l = new yye(imageView, imageView.getResources().getInteger(R.integer.fade_duration_fast), 4);
        this.b = axnmVar2;
        this.c = axnmVar4;
        this.d = axnmVar3;
        this.e = imageView.getResources().getString(R.string.single_loop_edu_snackbar_text);
        this.f = imageView.getResources().getString(R.string.single_loop_edu_snackbar_button_text).toUpperCase(imageView.getResources().getConfiguration().locale);
        asxj asxjVar = aaczVar.b().e;
        this.m = (asxjVar == null ? asxj.a : asxjVar).bC;
        imageView.setOnClickListener(new kfu(this));
        this.n = new ahzi(imageView, imageView.getContext(), true);
        asxj asxjVar2 = aaczVar.b().e;
        if ((asxjVar2 == null ? asxj.a : asxjVar2).bc) {
            this.k = ((axxu) axnmVar.get()).a.a.V(axxk.s).B().as(new ayqb() { // from class: kfv
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    kfw.this.j = ((Boolean) obj).booleanValue();
                }
            });
        }
    }

    @Override // defpackage.kbg
    protected final void a(boolean z) {
        this.l.b(z);
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        c(z);
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        this.o = controlsOverlayStyle;
        u();
    }

    @Override // defpackage.kbk
    public final void j(boolean z) {
        this.s = z;
        v(false);
    }

    @Override // defpackage.kbk
    public final void k(boolean z) {
        this.p = z;
        u();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final void m(boolean z) {
        this.q = z;
        u();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        s(z);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final void od(ControlsState controlsState) {
        this.h = controlsState;
        this.n.a(controlsState);
        u();
    }

    @Override // defpackage.kbk
    public final void oe(boolean z) {
        if (!this.m || this.t == z) {
            return;
        }
        this.t = z;
        v(true);
    }

    @Override // defpackage.kbk
    public final void og(boolean z) {
        this.u = z;
        v(false);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final void q(boolean z) {
        this.r = z;
        v(false);
    }

    @Override // defpackage.kbg
    protected final void t(boolean z) {
        this.l.c(z);
    }

    @Override // defpackage.kbg
    protected final boolean w(boolean z) {
        if (this.r || this.s || this.t || this.u) {
            return false;
        }
        if (!z) {
            if (!this.i || !this.h.b) {
                return false;
            }
            return !this.p || this.q;
        } else if ((!this.h.k() && (!this.i || !this.h.b)) || !this.o.t) {
            return false;
        } else {
            return !this.p || this.q;
        }
    }
}

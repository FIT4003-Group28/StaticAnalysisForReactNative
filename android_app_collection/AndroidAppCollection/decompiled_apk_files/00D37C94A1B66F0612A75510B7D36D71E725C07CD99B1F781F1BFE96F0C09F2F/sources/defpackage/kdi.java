package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: kdi  reason: default package */
/* loaded from: classes3.dex */
public final class kdi extends ahyf implements fgd, nqw, noq, kok, nqy, zas, nor, kbk {
    public final axnm a;
    public final azpa b;
    public final Rect c;
    public boolean d;
    public boolean e;
    public nta f;
    private final boolean g;
    private final ezh h;
    private final aypf i;
    private final azpa j;
    private final azpa k;
    private final aynx l;
    private final aynx m;
    private boolean n;
    private WeakReference o;
    private CoordinatorLayout p;
    private yye q;

    static {
        new npf(2);
    }

    public kdi(Context context, ezh ezhVar, axnm axnmVar, airw airwVar, kbl kblVar, aacz aaczVar, fgc fgcVar) {
        super(context);
        this.a = axnmVar;
        this.g = eog.aE(aaczVar);
        this.h = ezhVar;
        this.b = azpa.ar();
        azpa ar = azpa.ar();
        this.j = ar;
        azpa ar2 = azpa.ar();
        this.k = ar2;
        this.i = new aypf();
        this.c = new Rect();
        kblVar.a(this);
        this.e = false;
        aynx h = aynx.B(false).j(airwVar.G().b.C(jnx.s)).C(jnx.t).n().h(nps.b);
        aynx h2 = aynx.g(ezhVar.h().i(aynq.LATEST), h, ar, ar2, new ayqd() { // from class: kdh
            @Override // defpackage.ayqd
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                Boolean bool3 = (Boolean) obj4;
                boolean z = false;
                if (kdi.this.mY((ezx) obj) && bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).n().q(new kdg(this)).h(nps.b);
        this.l = h2;
        final axnm axnmVar2 = new axnm() { // from class: kde
            @Override // defpackage.axnm
            public final Object get() {
                final kdi kdiVar = kdi.this;
                return aynx.e(((nml) kdiVar.a.get()).h().m, kdiVar.b, new aypx() { // from class: kdf
                    @Override // defpackage.aypx
                    public final Object a(Object obj, Object obj2) {
                        int i;
                        kdi kdiVar2 = kdi.this;
                        Rect rect = (Rect) obj2;
                        float height = (rect.height() - ((Integer) obj).intValue()) / rect.height();
                        float width = rect.width() * height;
                        if (kdiVar2.y()) {
                            i = kdiVar2.c.right;
                        } else {
                            i = kdiVar2.c.left;
                        }
                        return new Rect((int) (i * height), 0, (int) zgd.N(width, 0.0f, rect.width()), 0);
                    }
                });
            }
        };
        this.m = h2.O(new ayqe() { // from class: kdd
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                axnm axnmVar3 = axnm.this;
                if (((Boolean) obj).booleanValue()) {
                    return axnmVar3.get();
                }
                return aynx.B(new Rect());
            }
        }).h(nps.b);
        h.aa(new kdg(this, 2), jww.i);
        fgcVar.a.n().Z(new kdg(this, 1));
    }

    private final void A(boolean z) {
        this.n = z;
        Y(4);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.fullscreen_engagement_panel_overlay, (ViewGroup) null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.fullscreen_engagement_panel_holder);
        this.p = coordinatorLayout;
        coordinatorLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: kdc
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                kdi kdiVar = kdi.this;
                nta ntaVar = kdiVar.f;
                if (ntaVar != null) {
                    ntaVar.a.c(new Rect(i, i2, i3, i4));
                }
                if (kdiVar.y()) {
                    i -= ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
                } else {
                    i3 += ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
                }
                kdiVar.b.c(new Rect(i, i2, i3, i4));
            }
        });
        yye D = ((nml) this.a.get()).D();
        this.q = D;
        D.h(this);
        this.k.c(Boolean.valueOf(this.q.f()));
        return frameLayout;
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        A(false);
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new aizh(-1, -1, false);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        WeakReference weakReference;
        RelativeLayout relativeLayout;
        FrameLayout frameLayout = (FrameLayout) view;
        int i = 8;
        float f = 1.0f;
        int i2 = 1;
        if (aa(8) && (weakReference = this.o) != null && (relativeLayout = (RelativeLayout) weakReference.get()) != null) {
            relativeLayout.setAlpha(1.0f);
            this.p.addView(relativeLayout);
            this.j.c(true);
            this.i.d(((nml) this.a.get()).h().m.Z(new nkr(relativeLayout, 1)));
        }
        if (aa(1)) {
            CoordinatorLayout coordinatorLayout = this.p;
            if (true == this.d) {
                i = 0;
            }
            coordinatorLayout.setVisibility(i);
        }
        if (aa(2)) {
            zgd.t(this.p, zgd.i(this.c.left), ViewGroup.MarginLayoutParams.class);
            zgd.t(this.p, zgd.o(this.c.right), ViewGroup.MarginLayoutParams.class);
        }
        if (aa(4)) {
            CoordinatorLayout coordinatorLayout2 = this.p;
            if (true == this.n) {
                f = 0.3f;
            }
            coordinatorLayout2.setAlpha(f);
            CoordinatorLayout coordinatorLayout3 = this.p;
            if (true == this.n) {
                i2 = 4;
            }
            coordinatorLayout3.setImportantForAccessibility(i2);
        }
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        if (mY(ezxVar)) {
            Z();
        } else {
            W();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.e = false;
        kS.b();
        return kS;
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return this.g && ezxVar == ezx.WATCH_WHILE_FULLSCREEN;
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return mY(this.h.g());
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.zas
    public final void nH(int i, yye yyeVar) {
        if (this.q.e()) {
            this.k.c(true);
        } else if (i != 0) {
        } else {
            this.k.c(false);
        }
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        A(true);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.nor
    public final aynx s() {
        return this.l;
    }

    @Override // defpackage.kok
    public final aynx t() {
        return this.m;
    }

    @Override // defpackage.nqw
    public final void u(RelativeLayout relativeLayout) {
        this.o = new WeakReference(relativeLayout);
        Y(8);
    }

    @Override // defpackage.nqw
    public final void v(RelativeLayout relativeLayout) {
        this.i.c();
        this.o = null;
        this.j.c(false);
        if (nI()) {
            this.p.removeView(relativeLayout);
        }
    }

    @Override // defpackage.nqy
    public final void w(boolean z, zar zarVar) {
        yye yyeVar = this.q;
        if (yyeVar == null) {
            return;
        }
        yyeVar.l(zarVar);
        this.q.a(z, true);
    }

    @Override // defpackage.nor
    public final boolean x() {
        return this.e;
    }

    public final boolean y() {
        return kZ() != null && lj.e(kZ()) == 1;
    }

    @Override // defpackage.noq
    public final void z(nta ntaVar) {
        this.f = ntaVar;
    }
}

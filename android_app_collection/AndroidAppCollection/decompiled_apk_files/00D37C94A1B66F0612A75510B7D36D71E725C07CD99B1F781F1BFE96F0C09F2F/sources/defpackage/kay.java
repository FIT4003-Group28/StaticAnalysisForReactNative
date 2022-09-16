package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: kay  reason: default package */
/* loaded from: classes3.dex */
public final class kay implements kcy, aigm, kbk {
    public View a;
    public View b;
    public final Context c;
    public final khf d;
    public final SuggestedActionsMainController e;
    public final azpm f = azpm.e();
    public final azpm g = azpm.e();
    public final azpm h = azpm.e();
    public final Set i = new HashSet();
    public int j;
    public final aacz k;
    public yye l;
    public yye m;
    private final kcz n;
    private final aigl o;
    private final boolean p;
    private final boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;

    public kay(Context context, khf khfVar, kcz kczVar, SuggestedActionsMainController suggestedActionsMainController, aigl aiglVar, aacz aaczVar, axxu axxuVar) {
        Boolean bool;
        this.c = context;
        this.n = kczVar;
        this.e = suggestedActionsMainController;
        this.o = aiglVar;
        this.d = khfVar;
        this.k = aaczVar;
        aqxe aqxeVar = axxuVar.b.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        boolean z = false;
        if (aqxeVar.a(45352333L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352333L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352333L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : z);
        } else {
            bool = false;
        }
        this.q = !bool.booleanValue();
        this.j = context.getResources().getInteger(R.integer.fade_duration_fast);
        asxj asxjVar = aaczVar.b().e;
        this.p = (asxjVar == null ? asxj.a : asxjVar).bC;
        kczVar.g = this;
        aiglVar.c.a(this);
        khfVar.a(new khe() { // from class: kat
            @Override // defpackage.khe
            public final void a(View view) {
                kay kayVar = kay.this;
                if (kayVar.l == null || kayVar.a == null) {
                    kayVar.a = view.findViewById(R.id.youtube_controls_bottom_ui_container);
                    kayVar.l = new yye((ViewGroup) view.findViewById(R.id.bottom_end_container), kayVar.j, 8);
                    kayVar.m = new yye((ViewGroup) kayVar.a.findViewById(R.id.suggested_actions_container), kayVar.j, 8);
                    asxj asxjVar2 = kayVar.k.b().e;
                    if (asxjVar2 == null) {
                        asxjVar2 = asxj.a;
                    }
                    if (asxjVar2.aZ) {
                        zgd.t(kayVar.a, zgd.n(3), RelativeLayout.LayoutParams.class);
                        bt btVar = new bt();
                        btVar.d((ConstraintLayout) kayVar.a);
                        btVar.a.remove(Integer.valueOf((int) R.id.suggested_actions_container));
                        btVar.f(R.id.suggested_actions_container, 4, 0, 4, kayVar.c.getResources().getDimensionPixelSize(R.dimen.suggested_actions_container_bottom_margin));
                        btVar.e(R.id.suggested_actions_container, 6, 0, 6);
                        btVar.e(R.id.suggested_actions_container, 7, 0, 7);
                        btVar.a(R.id.suggested_actions_container).c = -2;
                        btVar.a(R.id.suggested_actions_container).b = 0;
                        btVar.b((ConstraintLayout) kayVar.a);
                    }
                    asxj asxjVar3 = kayVar.k.b().e;
                    if (asxjVar3 == null) {
                        asxjVar3 = asxj.a;
                    }
                    if (asxjVar3.bd) {
                        bt btVar2 = new bt();
                        btVar2.d((ConstraintLayout) kayVar.a);
                        int[] iArr = {R.id.timestamps_container, R.id.time_bar_chapter_title_container, R.id.bottom_end_container, R.id.fullscreen_button, R.id.chapter_title_anchor};
                        for (int i = 0; i < 5; i++) {
                            btVar2.e(iArr[i], 4, R.id.time_bar_reference_view, 4);
                        }
                        btVar2.f(R.id.suggested_actions_container, 4, 0, 4, 0);
                        btVar2.b((ConstraintLayout) kayVar.a);
                    }
                    kayVar.b = kayVar.a.findViewById(R.id.time_bar_reference_view);
                    kayVar.f.as(new kav(kayVar));
                    kayVar.g.as(new kav(kayVar, 2));
                    azpm azpmVar = kayVar.h;
                    View view2 = kayVar.a;
                    view2.getClass();
                    azpmVar.as(new lwf(view2, 1));
                    for (View view3 : kayVar.i) {
                        kayVar.a(view3);
                    }
                    kayVar.i.clear();
                }
            }
        });
        azqb azqbVar = new azqb() { // from class: kax
            @Override // defpackage.azqb
            public final Object get() {
                kay kayVar = kay.this;
                kayVar.d.b();
                return kayVar.m;
            }
        };
        int i = this.j;
        aynx k = aynx.k(new aynz() { // from class: kau
            @Override // defpackage.aynz
            public final void a(final ayny aynyVar) {
                aynyVar.d(kay.this.f.as(new ayqb() { // from class: kaw
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        ayny.this.a((Integer) obj);
                    }
                }));
            }
        }, aynq.BUFFER);
        suggestedActionsMainController.p = azqbVar;
        suggestedActionsMainController.r = k;
        suggestedActionsMainController.o = i;
        suggestedActionsMainController.s = null;
        suggestedActionsMainController.l = null;
        suggestedActionsMainController.i().as(new kav(this, 1));
    }

    private final void s() {
        int i;
        int i2 = 0;
        if (!this.s) {
            i = this.c.getResources().getDimensionPixelSize(R.dimen.timestamp_fullscreen_bottom_padding);
        } else {
            i = this.o.c.g() ? this.o.e : 0;
        }
        if (this.s || this.u) {
            i2 = this.t ? this.c.getResources().getDimensionPixelSize(R.dimen.grouped_timestamps_fullscreen_bottom_padding) + i : i;
        }
        this.f.c(Integer.valueOf(i2));
    }

    private final void t(boolean z) {
        boolean z2 = false;
        if (this.r && this.n.s() && !this.w && !this.x) {
            z2 = true;
        }
        if (z2) {
            this.d.b();
        }
        yye yyeVar = this.l;
        if (yyeVar == null) {
            return;
        }
        yyeVar.a(z2, z);
    }

    private final void u() {
        int i = 0;
        if (!this.n.s() && !this.x && (!this.q || !this.w)) {
            i = this.c.getResources().getDimensionPixelOffset(R.dimen.controls_overlay_bottom_ui_text_side_margin);
        }
        this.g.c(Integer.valueOf(i));
    }

    public final void a(View view) {
        yye yyeVar = this.l;
        if (yyeVar == null) {
            this.i.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) yyeVar.b;
        viewGroup.addView(view, Math.max(0, viewGroup.getChildCount() - 1));
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        if (this.r) {
            this.r = false;
            t(z);
        }
    }

    @Override // defpackage.kcy
    public final void c(boolean z) {
        if (this.v == z) {
            return;
        }
        this.v = z;
        u();
        t(false);
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
        this.h.c(Float.valueOf(1.0f - akf.d(f)));
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        SuggestedActionsMainController suggestedActionsMainController = this.e;
        boolean a = ControlsOverlayStyle.a(controlsOverlayStyle);
        suggestedActionsMainController.k = a;
        suggestedActionsMainController.o(!a, false);
        boolean z = this.t;
        boolean z2 = controlsOverlayStyle.s;
        if (z != z2) {
            this.t = z2;
            s();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final void l(ezx ezxVar) {
        if (this.s != ezxVar.b()) {
            this.s = ezxVar.b();
            s();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
        if (i != i2) {
            t(false);
            s();
        }
    }

    @Override // defpackage.kbk
    public final void nG(zbb zbbVar) {
        boolean z = this.u;
        boolean z2 = zbbVar instanceof zbe;
        this.u = z2;
        if (z == z2) {
            return;
        }
        s();
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        if (!this.r) {
            this.r = true;
            t(z);
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final void oe(boolean z) {
        View view;
        if (!this.p || this.y == z || (view = this.a) == null) {
            return;
        }
        this.y = z;
        view.setVisibility(true != z ? 0 : 8);
    }

    @Override // defpackage.kbk
    public final void og(boolean z) {
        if (this.x == z) {
            return;
        }
        this.x = z;
        u();
        t(true);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final void q(boolean z) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        t(true);
        if (!this.q) {
            return;
        }
        u();
    }
}

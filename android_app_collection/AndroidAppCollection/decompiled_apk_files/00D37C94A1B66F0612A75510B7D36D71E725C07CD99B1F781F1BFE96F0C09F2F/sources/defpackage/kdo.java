package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.player.features.markers.HeatMarkerView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.DesugarArrays;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: kdo  reason: default package */
/* loaded from: classes3.dex */
public final class kdo implements View.OnLayoutChangeListener, ahwy, aiby, kbk {
    public final ahwz a;
    public final ffo b;
    public final boolean d;
    public final airw e;
    public final kbl f;
    public long i;
    public yye j;
    private ezx k = ezx.NONE;
    public final List c = new ArrayList();
    public Optional h = Optional.empty();
    public khf g = null;

    public kdo(ahwz ahwzVar, ffo ffoVar, kbl kblVar, airw airwVar, aacz aaczVar) {
        this.a = ahwzVar;
        this.b = ffoVar;
        this.f = kblVar;
        this.e = airwVar;
        asxj asxjVar = aaczVar.b().e;
        this.d = (asxjVar == null ? asxj.a : asxjVar).cI;
    }

    private final void e() {
        khf khfVar = this.g;
        if (khfVar == null) {
            return;
        }
        khfVar.b();
    }

    private final void s() {
        if (this.c.isEmpty()) {
            return;
        }
        e();
        yye yyeVar = this.j;
        if (yyeVar == null) {
            return;
        }
        if (!this.k.b() || !this.h.isPresent()) {
            zgd.t(yyeVar.b, zgd.b(zgd.l(0), zgd.k(0)), ViewGroup.MarginLayoutParams.class);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.h.get()).getLayoutParams();
        zgd.t(yyeVar.b, zgd.b(zgd.l(marginLayoutParams.getMarginStart()), zgd.k(marginLayoutParams.getMarginEnd())), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.ahwy
    public final void c(aicb aicbVar, boolean z) {
        if (!aicb.HEATMAP_MARKER.equals(aicbVar)) {
            return;
        }
        this.c.clear();
        if (!z) {
            return;
        }
        d();
    }

    public final void d() {
        TimelineMarker[] m = this.a.m(aicb.HEATMAP_MARKER);
        if (m == null || m.length == 0 || this.i == 0) {
            return;
        }
        this.c.clear();
        DesugarArrays.stream(m).forEach(new kdm(this));
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

    @Override // defpackage.kbk
    public final void l(ezx ezxVar) {
        if (this.k == ezxVar) {
            return;
        }
        this.k = ezxVar;
        s();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.ahwy
    public final /* synthetic */ void nD(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, aicb aicbVar, int i) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nL(boolean z) {
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        if (this.c.isEmpty()) {
            return;
        }
        e();
        yye yyeVar = this.j;
        if (yyeVar == null) {
            return;
        }
        if (i == 1) {
            HeatMarkerView heatMarkerView = (HeatMarkerView) yyeVar.b;
            heatMarkerView.a.cancel();
            heatMarkerView.a.start();
            yyeVar.a(true, true);
        } else if (i == 2) {
            if (this.b.kJ() <= 0) {
                return;
            }
            long kJ = this.b.kJ();
            HeatMarkerView heatMarkerView2 = (HeatMarkerView) yyeVar.b;
            heatMarkerView2.c = ((float) j) / ((float) kJ);
            heatMarkerView2.invalidate();
        } else if (i != 3 && i != 4) {
        } else {
            HeatMarkerView heatMarkerView3 = (HeatMarkerView) yyeVar.b;
            heatMarkerView3.a.cancel();
            heatMarkerView3.a.reverse();
            yyeVar.a(false, true);
        }
    }

    @Override // defpackage.ahwy
    public final /* synthetic */ void nw(aicb aicbVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final void od(ControlsState controlsState) {
        if (controlsState.a == ahzb.NEW) {
            this.c.clear();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!this.h.isPresent() || view != this.h.get()) {
            view.removeOnLayoutChangeListener(this);
            return;
        }
        s();
        ((View) this.h.get()).requestLayout();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void q(boolean z) {
    }
}

package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: keu  reason: default package */
/* loaded from: classes3.dex */
public final class keu implements kbk {
    private final ProgressBar a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;

    public keu(View view, aacz aaczVar) {
        asxj asxjVar = aaczVar.b().e;
        this.b = (asxjVar == null ? asxj.a : asxjVar).bC;
        Resources resources = view.getResources();
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.player_loading_view_thin);
        this.a = progressBar;
        tpj tpjVar = new tpj(-1.0f, resources.getDimensionPixelSize(R.dimen.buffering_progress_max_thickness), resources.getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{resources.getColor(R.color.buffering_progress_color)});
        tpjVar.setAlpha(resources.getInteger(R.integer.buffering_progress_transparency));
        progressBar.setIndeterminateDrawable(tpjVar);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.buffering_progress_min_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.buffering_progress_max_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.buffering_progress_min_thickness);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.buffering_progress_max_thickness);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.buffering_progress_margin);
        progressBar.getClass();
        View view2 = (View) progressBar.getParent();
        view2.getClass();
        tpj tpjVar2 = (tpj) progressBar.getIndeterminateDrawable();
        tpjVar2.getClass();
        view2.addOnLayoutChangeListener(new fqk(progressBar, tpjVar2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5 + dimensionPixelSize5));
    }

    private final void a() {
        int i = 0;
        boolean z = this.c && (!this.d || this.e) && !this.f;
        ProgressBar progressBar = this.a;
        if (true != z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final void k(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        a();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final void m(boolean z) {
        this.e = z;
        a();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nL(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final void od(ControlsState controlsState) {
        boolean z = this.c;
        boolean z2 = true;
        if (!controlsState.b && controlsState.a != ahzb.NEW) {
            z2 = false;
        }
        this.c = z2;
        if (z != z2) {
            a();
        }
    }

    @Override // defpackage.kbk
    public final void oe(boolean z) {
        if (!this.b || this.f == z) {
            return;
        }
        this.f = z;
        a();
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
}

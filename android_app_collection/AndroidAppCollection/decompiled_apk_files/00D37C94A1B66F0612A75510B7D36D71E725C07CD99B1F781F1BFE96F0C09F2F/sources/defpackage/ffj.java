package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ffj  reason: default package */
/* loaded from: classes3.dex */
public class ffj extends fev {
    public final ffo e;
    public boolean f;
    public boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    public ffj(Context context, ffo ffoVar, ffu ffuVar) {
        super(ffoVar, ffuVar);
        this.e = ffoVar;
        Resources resources = context.getResources();
        this.b.h = resources.getColor(R.color.inline_time_bar_progress_color);
        this.b.f = resources.getColor(R.color.inline_time_bar_buffered_color);
        this.b.g = resources.getColor(R.color.inline_time_bar_buffered_highlighted_color);
        this.b.i = resources.getColor(R.color.inline_time_bar_played_not_highlighted_color);
        this.i = true;
    }

    private final void f(boolean z, boolean z2) {
        this.h = z;
        t(z2);
    }

    @Override // defpackage.fev
    public void i(ControlsOverlayStyle controlsOverlayStyle) {
        super.i(controlsOverlayStyle);
        this.j = ControlsOverlayStyle.a(controlsOverlayStyle);
        this.i = controlsOverlayStyle.p;
        s();
        t(false);
    }

    @Override // defpackage.fev
    public final void nT(boolean z) {
        super.nT(z);
        f(false, z);
    }

    public final void nU() {
        nY();
        nZ();
    }

    public final void nV() {
        this.e.p(!this.g);
    }

    public final void nW(float f) {
        this.e.setAlpha(f);
    }

    @Override // defpackage.fev
    public final void nX(boolean z) {
        super.nX(z);
        f(true, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fev
    public final void nY() {
        long j;
        if (this.e.kM()) {
            j = this.e.c();
        } else {
            j = this.b.c;
        }
        this.c.g(ahfa.c(j, this.b.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fev
    public final void nZ() {
        long kO;
        if (this.b.a > 0) {
            aihh aihhVar = this.d;
            if ((aihhVar == null || !aihhVar.g()) && this.e.kM()) {
                kO = this.e.kO();
            } else {
                kO = this.e.kH();
            }
            this.c.e(a(kO), a(this.b.a - kO), a(this.b.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(int i) {
        this.e.u(i);
    }

    public final void s() {
        ffo ffoVar = this.e;
        boolean z = true;
        if (!this.j && this.f) {
            z = false;
        }
        ffoVar.s(z);
    }

    public final void t(boolean z) {
        boolean z2 = true;
        boolean z3 = this.i && this.h;
        if (this.f && !z3) {
            z2 = false;
        }
        this.e.x(z2, z);
        if (z2) {
            nV();
        }
    }
}

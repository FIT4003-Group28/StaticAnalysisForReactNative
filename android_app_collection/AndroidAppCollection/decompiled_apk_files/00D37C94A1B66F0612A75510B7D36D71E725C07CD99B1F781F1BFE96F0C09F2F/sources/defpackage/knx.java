package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: knx  reason: default package */
/* loaded from: classes3.dex */
public final class knx implements kbk {
    public final boolean a;
    public final kbl b;
    ValueAnimator c;
    public int d;
    public View e;
    public int f;
    private final int g;
    private final int h;
    private boolean i;
    private boolean j;

    public knx(Context context, kbl kblVar, aacz aaczVar) {
        this.b = kblVar;
        this.g = context.getResources().getInteger(17694721);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.suggested_action_no_controls_bottom_margin);
        asxj asxjVar = aaczVar.b().e;
        this.a = (asxjVar == null ? asxj.a : asxjVar).bd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        View view;
        if (!this.a) {
            return;
        }
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        if (i == 0 || (view = this.e) == null) {
            return;
        }
        int[] iArr = new int[2];
        iArr[0] = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        iArr[1] = i == 2 ? this.h : this.f;
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
        this.c = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: knw
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                knx.this.c(((Integer) valueAnimator2.getAnimatedValue()).intValue());
            }
        });
        this.c.setDuration(i == 2 ? this.d : this.g);
        this.c.start();
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        this.j = false;
    }

    public final void c(int i) {
        View view = this.e;
        if (view == null) {
            return;
        }
        zgd.t(view, zgd.e(i), FrameLayout.LayoutParams.class);
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
        this.i = ezxVar.b();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        this.j = true;
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final void oe(boolean z) {
        if (!this.i || this.j) {
            return;
        }
        int i = 1;
        if (true != z) {
            i = 2;
        }
        a(i);
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

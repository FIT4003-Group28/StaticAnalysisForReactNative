package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kco  reason: default package */
/* loaded from: classes3.dex */
public final class kco implements kbk {
    public final TextView a;
    private boolean b;

    public kco(View view) {
        TextView textView = (TextView) view.findViewById(R.id.player_error_view);
        this.a = textView;
        textView.setTag(R.id.disallow_player_overlay_tap_listener, true);
        textView.setVisibility(8);
        lj.au(textView);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: kcn
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = (int) ((i3 - i) * 0.16666667f);
                kco.this.a.setPadding(i9, 10, i9, 10);
            }
        });
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
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
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
        if (this.b == controlsState.i()) {
            return;
        }
        boolean i = controlsState.i();
        this.b = i;
        zag.o(this.a, i);
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
}

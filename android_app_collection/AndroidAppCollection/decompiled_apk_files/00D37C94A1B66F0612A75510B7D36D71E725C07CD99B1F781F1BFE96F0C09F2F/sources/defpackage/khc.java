package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: khc  reason: default package */
/* loaded from: classes3.dex */
public final class khc implements View.OnLayoutChangeListener, abkg {
    public final khd a;
    public final fzr b;
    public final ayom c;
    public final kbc d;
    public final njb e;
    public final jwq f;
    public final AutonavToggleController g;
    public final SubtitleButtonController h;
    public final kgc i;
    public final TouchImageView j;
    public final azpm k = azpm.e();
    public final List l = new ArrayList();
    public khb m;
    public apos n;
    public kbb o;
    public int p;
    private boolean q;

    public khc(fzr fzrVar, khd khdVar, ayom ayomVar, kbc kbcVar, kgc kgcVar, njb njbVar, jwq jwqVar, AutonavToggleController autonavToggleController, SubtitleButtonController subtitleButtonController, TouchImageView touchImageView) {
        this.b = fzrVar;
        this.a = khdVar;
        this.c = ayomVar;
        this.d = kbcVar;
        this.i = kgcVar;
        this.e = njbVar;
        this.f = jwqVar;
        this.g = autonavToggleController;
        this.h = subtitleButtonController;
        this.j = touchImageView;
        khdVar.getClass();
        jwqVar.j(new kgz(khdVar, 1));
        khdVar.getClass();
        autonavToggleController.a = new kgz(khdVar);
    }

    @Override // defpackage.abkg
    public final int a() {
        return this.p;
    }

    public final void b(View view) {
        if (this.m == null) {
            this.l.add(view);
            return;
        }
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.controls_overlay_action_button_size);
        zgd.u(view, new mfm(dimensionPixelSize, 1), zgd.b(zgd.s(dimensionPixelSize, dimensionPixelSize), zgd.l(resources.getDimensionPixelSize(R.dimen.controls_overlay_action_button_margin_start))), ViewGroup.MarginLayoutParams.class);
        ((LinearLayout) this.m.a.b).addView(view);
    }

    @Override // defpackage.abkg
    public final void c(apos aposVar) {
        this.n = aposVar;
    }

    @Override // defpackage.abkg
    public final void d(int i) {
        this.p = i;
        boolean z = false;
        boolean z2 = i != 0;
        this.a.g = z2;
        if (z2) {
            azpm azpmVar = this.k;
            if (i == 1) {
                z = true;
            }
            azpmVar.c(Boolean.valueOf(z));
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        boolean z = i4 - i2 > i9;
        if (this.q != z) {
            this.q = z;
            if (this.m != null && this.f.a() != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f.a();
                ArrayDeque arrayDeque = new ArrayDeque();
                if (this.q) {
                    arrayDeque.add(zgd.d(3, ((TouchImageView) this.m.f.b).getId()));
                    arrayDeque.add(zgd.c(21));
                    arrayDeque.add(zgd.n(10));
                    arrayDeque.add(zgd.n(16));
                } else {
                    arrayDeque.add(zgd.d(16, R.id.autonav_toggle));
                    arrayDeque.add(zgd.c(10));
                    arrayDeque.add(zgd.n(21));
                    arrayDeque.add(zgd.n(3));
                }
                if (zgd.y(arrayDeque).a(layoutParams)) {
                    this.f.d(layoutParams);
                }
            }
            khd khdVar = this.a;
            boolean z2 = this.q;
            if (khdVar.d != z2) {
                khdVar.d = z2;
                khdVar.a();
            }
        }
        khd khdVar2 = this.a;
        if (khdVar2.i != i9) {
            khdVar2.i = i9;
            khdVar2.a();
        }
    }
}

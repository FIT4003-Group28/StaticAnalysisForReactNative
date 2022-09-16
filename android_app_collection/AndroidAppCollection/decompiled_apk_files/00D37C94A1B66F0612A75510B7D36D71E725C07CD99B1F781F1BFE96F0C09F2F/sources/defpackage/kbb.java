package defpackage;

import android.content.res.Resources;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kbb  reason: default package */
/* loaded from: classes3.dex */
public final class kbb implements ezg {
    public final ezh a;
    public final ayom b;
    public final acti c;
    public final ImageView d;

    public kbb(ezh ezhVar, ayom ayomVar, acti actiVar, ImageView imageView) {
        this.a = ezhVar;
        this.b = ayomVar;
        this.c = actiVar;
        this.d = imageView;
    }

    public final void a(boolean z) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources = this.d.getResources();
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_horiz_padding);
        if (z) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_top_padding_fullscreen);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_top_padding);
        }
        if (z) {
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_bottom_padding_fullscreen);
        } else {
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_bottom_padding);
        }
        this.d.setPaddingRelative(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        boolean b = ezxVar.b();
        boolean b2 = ezxVar2.b();
        if (b != b2) {
            a(b2);
        }
    }
}

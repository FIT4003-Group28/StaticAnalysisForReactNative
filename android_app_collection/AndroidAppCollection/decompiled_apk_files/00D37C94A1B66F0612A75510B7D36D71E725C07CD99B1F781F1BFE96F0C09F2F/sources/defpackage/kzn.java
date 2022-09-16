package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzn  reason: default package */
/* loaded from: classes3.dex */
final class kzn implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ kzo b;

    public kzn(kzo kzoVar, View view) {
        this.b = kzoVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        yce.f(this.b.d, 0, 0, (int) this.b.a.getDimension(R.dimen.dropdown_switch_button_tap_area_margin_right), 0);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

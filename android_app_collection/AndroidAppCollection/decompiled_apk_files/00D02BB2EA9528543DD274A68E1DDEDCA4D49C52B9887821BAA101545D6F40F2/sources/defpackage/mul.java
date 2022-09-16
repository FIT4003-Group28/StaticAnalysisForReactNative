package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: mul  reason: default package */
/* loaded from: classes7.dex */
final class mul implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ View a;
    final /* synthetic */ mum b;

    public mul(mum mumVar, View view) {
        this.b = mumVar;
        this.a = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (btlu.n(this.b.k.j())) {
            return windowInsets.replaceSystemWindowInsets(0, 0, 0, 0);
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((view.getWindowSystemUiVisibility() & 4) != 0) {
            this.a.setVisibility(8);
            return windowInsets.replaceSystemWindowInsets(0, 0, 0, 0);
        }
        this.a.setVisibility(0);
        this.a.setLayoutParams(new FrameLayout.LayoutParams(-1, systemWindowInsetTop));
        return windowInsets.replaceSystemWindowInsets(0, Math.max(0, systemWindowInsetTop - nqo.P.NR(this.b.Ol())), 0, 0);
    }
}

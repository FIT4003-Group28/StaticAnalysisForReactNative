package com.google.android.libraries.messaging.lighter.ui.statusbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextStatusBarHolderView extends LinearLayout implements cuvv {
    cvfr a;

    public TextStatusBarHolderView(Context context) {
        this(context, null);
    }

    public final void a(cvfr cvfrVar) {
        cvfr cvfrVar2;
        if (cvfrVar == null || (cvfrVar2 = this.a) == null || !cvfrVar2.equals(cvfrVar)) {
            return;
        }
        b();
    }

    public final void b() {
        if (c()) {
            removeView((View) this.a);
            this.a = null;
        }
    }

    public final boolean c() {
        return this.a != null;
    }

    public final void d(cvfr cvfrVar) {
        if (c()) {
            return;
        }
        this.a = cvfrVar;
        View view = (View) cvfrVar;
        view.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        addView(view, layoutParams);
    }

    @Override // defpackage.cuvv
    public void setPresenter(cvfu cvfuVar) {
    }

    public TextStatusBarHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextStatusBarHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
